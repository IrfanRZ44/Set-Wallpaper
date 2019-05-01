package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  @Deprecated
  public static void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setTint(paramInt);
    }
    while (!(paramDrawable instanceof b)) {
      return;
    }
    ((b)paramDrawable).setTint(paramInt);
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setTintList(paramColorStateList);
    }
    while (!(paramDrawable instanceof b)) {
      return;
    }
    ((b)paramDrawable).setTintList(paramColorStateList);
  }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.applyTheme(paramTheme);
    }
  }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setTintMode(paramMode);
    }
    while (!(paramDrawable instanceof b)) {
      return;
    }
    ((b)paramDrawable).setTintMode(paramMode);
  }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
  }
  
  public static boolean b(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramDrawable.isAutoMirrored();
    }
    return false;
  }
  
  public static boolean b(Drawable paramDrawable, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramDrawable.setLayoutDirection(paramInt);
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      if (!b) {}
      try
      {
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Integer.TYPE;
        a = Drawable.class.getDeclaredMethod("setLayoutDirection", arrayOfClass);
        a.setAccessible(true);
        b = true;
        if (a != null) {
          try
          {
            Method localMethod = a;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(paramInt);
            localMethod.invoke(paramDrawable, arrayOfObject);
            return true;
          }
          catch (Exception localException)
          {
            Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", localException);
            a = null;
          }
        }
        return false;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;)
        {
          Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", localNoSuchMethodException);
        }
      }
    }
    return false;
  }
  
  public static int c(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramDrawable.getAlpha();
    }
    return 0;
  }
  
  public static boolean d(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramDrawable.canApplyTheme();
    }
    return false;
  }
  
  public static ColorFilter e(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramDrawable.getColorFilter();
    }
    return null;
  }
  
  public static void f(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      paramDrawable.clearColorFilter();
    }
    for (;;)
    {
      return;
      if (Build.VERSION.SDK_INT < 21) {
        break;
      }
      paramDrawable.clearColorFilter();
      if ((paramDrawable instanceof InsetDrawable))
      {
        f(((InsetDrawable)paramDrawable).getDrawable());
        return;
      }
      if ((paramDrawable instanceof c))
      {
        f(((c)paramDrawable).a());
        return;
      }
      if ((paramDrawable instanceof DrawableContainer))
      {
        DrawableContainer.DrawableContainerState localDrawableContainerState = (DrawableContainer.DrawableContainerState)((DrawableContainer)paramDrawable).getConstantState();
        if (localDrawableContainerState != null)
        {
          int i = 0;
          int j = localDrawableContainerState.getChildCount();
          while (i < j)
          {
            Drawable localDrawable = localDrawableContainerState.getChild(i);
            if (localDrawable != null) {
              f(localDrawable);
            }
            i++;
          }
        }
      }
    }
    paramDrawable.clearColorFilter();
  }
  
  public static Drawable g(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 23) {}
    do
    {
      do
      {
        do
        {
          return paramDrawable;
          if (Build.VERSION.SDK_INT < 21) {
            break;
          }
        } while ((paramDrawable instanceof b));
        return new f(paramDrawable);
        if (Build.VERSION.SDK_INT < 19) {
          break;
        }
      } while ((paramDrawable instanceof b));
      return new e(paramDrawable);
    } while ((paramDrawable instanceof b));
    return new d(paramDrawable);
  }
  
  public static <T extends Drawable> T h(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof c)) {
      paramDrawable = ((c)paramDrawable).a();
    }
    return paramDrawable;
  }
  
  public static int i(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramDrawable.getLayoutDirection();
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      if (!d) {}
      try
      {
        c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
        c.setAccessible(true);
        d = true;
        if (c == null) {}
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;)
        {
          try
          {
            int i = ((Integer)c.invoke(paramDrawable, new Object[0])).intValue();
            return i;
          }
          catch (Exception localException)
          {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", localException);
            c = null;
          }
          localNoSuchMethodException = localNoSuchMethodException;
          Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", localNoSuchMethodException);
        }
      }
      return 0;
    }
    return 0;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.a
 * JD-Core Version:    0.7.0.1
 */