package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.c;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DrawableUtils
{
  public static final Rect INSETS_NONE = new Rect();
  private static final String TAG = "DrawableUtils";
  private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
  private static Class<?> sInsetsClazz;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    try
    {
      sInsetsClazz = Class.forName("android.graphics.Insets");
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
  }
  
  public static boolean canSafelyMutateDrawable(Drawable paramDrawable)
  {
    if ((Build.VERSION.SDK_INT < 15) && ((paramDrawable instanceof InsetDrawable))) {
      return false;
    }
    if ((Build.VERSION.SDK_INT < 15) && ((paramDrawable instanceof GradientDrawable))) {
      return false;
    }
    if ((Build.VERSION.SDK_INT < 17) && ((paramDrawable instanceof LayerDrawable))) {
      return false;
    }
    if ((paramDrawable instanceof DrawableContainer))
    {
      Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
      if ((localConstantState instanceof DrawableContainer.DrawableContainerState))
      {
        Drawable[] arrayOfDrawable = ((DrawableContainer.DrawableContainerState)localConstantState).getChildren();
        int i = arrayOfDrawable.length;
        for (int j = 0; j < i; j++) {
          if (!canSafelyMutateDrawable(arrayOfDrawable[j])) {
            return false;
          }
        }
      }
    }
    else
    {
      if ((paramDrawable instanceof c)) {
        return canSafelyMutateDrawable(((c)paramDrawable).a());
      }
      if ((paramDrawable instanceof android.support.v7.d.a.a)) {
        return canSafelyMutateDrawable(((android.support.v7.d.a.a)paramDrawable).b());
      }
      if ((paramDrawable instanceof ScaleDrawable)) {
        return canSafelyMutateDrawable(((ScaleDrawable)paramDrawable).getDrawable());
      }
    }
    return true;
  }
  
  static void fixDrawable(Drawable paramDrawable)
  {
    if ((Build.VERSION.SDK_INT == 21) && ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))) {
      fixVectorDrawableTinting(paramDrawable);
    }
  }
  
  private static void fixVectorDrawableTinting(Drawable paramDrawable)
  {
    int[] arrayOfInt = paramDrawable.getState();
    if ((arrayOfInt == null) || (arrayOfInt.length == 0)) {
      paramDrawable.setState(ac.e);
    }
    for (;;)
    {
      paramDrawable.setState(arrayOfInt);
      return;
      paramDrawable.setState(ac.h);
    }
  }
  
  public static Rect getOpticalBounds(Drawable paramDrawable)
  {
    if (sInsetsClazz != null) {}
    for (;;)
    {
      Object localObject;
      Rect localRect;
      int j;
      Field localField;
      int k;
      try
      {
        Drawable localDrawable = android.support.v4.a.a.a.h(paramDrawable);
        localObject = localDrawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(localDrawable, new Object[0]);
        if (localObject == null) {
          break label223;
        }
        localRect = new Rect();
        Field[] arrayOfField = sInsetsClazz.getFields();
        int i = arrayOfField.length;
        j = 0;
        if (j >= i) {
          break label227;
        }
        localField = arrayOfField[j];
        str = localField.getName();
        k = -1;
        switch (str.hashCode())
        {
        case 3317767: 
          if (!str.equals("left")) {
            break label271;
          }
          k = 0;
        }
      }
      catch (Exception localException)
      {
        String str;
        Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
      }
      if (str.equals("top"))
      {
        k = 1;
        break label271;
        if (str.equals("right"))
        {
          k = 2;
          break label271;
          if (str.equals("bottom"))
          {
            k = 3;
            break label271;
            localRect.left = localField.getInt(localObject);
            break label304;
            label223:
            localRect = INSETS_NONE;
            label227:
            return localRect;
            localRect.top = localField.getInt(localObject);
            break label304;
            localRect.right = localField.getInt(localObject);
            break label304;
            localRect.bottom = localField.getInt(localObject);
            break label304;
          }
        }
      }
      label271:
      switch (k)
      {
      }
      label304:
      j++;
    }
  }
  
  public static PorterDuff.Mode parseTintMode(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return paramMode;
    case 3: 
      return PorterDuff.Mode.SRC_OVER;
    case 5: 
      return PorterDuff.Mode.SRC_IN;
    case 9: 
      return PorterDuff.Mode.SRC_ATOP;
    case 14: 
      return PorterDuff.Mode.MULTIPLY;
    case 15: 
      return PorterDuff.Mode.SCREEN;
    }
    return PorterDuff.Mode.ADD;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.DrawableUtils
 * JD-Core Version:    0.7.0.1
 */