package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.os.a;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

public final class o
{
  static final g a = new g();
  
  static
  {
    if (a.a())
    {
      a = new f();
      return;
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      a = new e();
      return;
    }
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new a();
      return;
    }
  }
  
  public static int a(TextView paramTextView)
  {
    return a.a(paramTextView);
  }
  
  public static void a(TextView paramTextView, int paramInt)
  {
    a.a(paramTextView, paramInt);
  }
  
  public static void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    a.a(paramTextView, paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static Drawable[] b(TextView paramTextView)
  {
    return a.b(paramTextView);
  }
  
  static class a
    extends o.g
  {
    public int a(TextView paramTextView)
    {
      return paramTextView.getMaxLines();
    }
  }
  
  static class b
    extends o.a
  {
    public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      int i;
      Drawable localDrawable;
      if (paramTextView.getLayoutDirection() == 1)
      {
        i = 1;
        if (i == 0) {
          break label42;
        }
        localDrawable = paramDrawable3;
        label20:
        if (i == 0) {
          break label48;
        }
      }
      for (;;)
      {
        paramTextView.setCompoundDrawables(localDrawable, paramDrawable2, paramDrawable1, paramDrawable4);
        return;
        i = 0;
        break;
        label42:
        localDrawable = paramDrawable1;
        break label20;
        label48:
        paramDrawable1 = paramDrawable3;
      }
    }
    
    public Drawable[] b(TextView paramTextView)
    {
      int i = 1;
      if (paramTextView.getLayoutDirection() == i) {}
      for (;;)
      {
        Drawable[] arrayOfDrawable = paramTextView.getCompoundDrawables();
        if (i != 0)
        {
          Drawable localDrawable1 = arrayOfDrawable[2];
          Drawable localDrawable2 = arrayOfDrawable[0];
          arrayOfDrawable[0] = localDrawable1;
          arrayOfDrawable[2] = localDrawable2;
        }
        return arrayOfDrawable;
        i = 0;
      }
    }
  }
  
  static class c
    extends o.b
  {
    public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    public Drawable[] b(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawablesRelative();
    }
  }
  
  static class d
    extends o.c
  {
    public void a(TextView paramTextView, int paramInt)
    {
      paramTextView.setTextAppearance(paramInt);
    }
  }
  
  static class e
    extends o.d
  {}
  
  static class f
    extends o.e
  {}
  
  static class g
  {
    private static Field a;
    private static boolean b;
    private static Field c;
    private static boolean d;
    
    private static int a(Field paramField, TextView paramTextView)
    {
      try
      {
        int i = paramField.getInt(paramTextView);
        return i;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.d("TextViewCompatBase", "Could not retrieve value of " + paramField.getName() + " field.");
      }
      return -1;
    }
    
    private static Field a(String paramString)
    {
      Field localField = null;
      try
      {
        localField = TextView.class.getDeclaredField(paramString);
        localField.setAccessible(true);
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.e("TextViewCompatBase", "Could not retrieve " + paramString + " field.");
      }
      return localField;
    }
    
    public int a(TextView paramTextView)
    {
      if (!d)
      {
        c = a("mMaxMode");
        d = true;
      }
      if ((c != null) && (a(c, paramTextView) == 1))
      {
        if (!b)
        {
          a = a("mMaximum");
          b = true;
        }
        if (a != null) {
          return a(a, paramTextView);
        }
      }
      return -1;
    }
    
    public void a(TextView paramTextView, int paramInt)
    {
      paramTextView.setTextAppearance(paramTextView.getContext(), paramInt);
    }
    
    public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    public Drawable[] b(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawables();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.o
 * JD-Core Version:    0.7.0.1
 */