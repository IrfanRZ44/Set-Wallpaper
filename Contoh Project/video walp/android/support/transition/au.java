package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

class au
{
  static final Property<View, Float> a;
  static final Property<View, Rect> b;
  private static final ba c;
  private static Field d;
  private static boolean e;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 22) {
      c = new az();
    }
    for (;;)
    {
      a = new Property(Float.class, "translationAlpha")
      {
        public Float a(View paramAnonymousView)
        {
          return Float.valueOf(au.c(paramAnonymousView));
        }
        
        public void a(View paramAnonymousView, Float paramAnonymousFloat)
        {
          au.a(paramAnonymousView, paramAnonymousFloat.floatValue());
        }
      };
      b = new Property(Rect.class, "clipBounds")
      {
        public Rect a(View paramAnonymousView)
        {
          return s.z(paramAnonymousView);
        }
        
        public void a(View paramAnonymousView, Rect paramAnonymousRect)
        {
          s.a(paramAnonymousView, paramAnonymousRect);
        }
      };
      return;
      if (Build.VERSION.SDK_INT >= 21) {
        c = new ay();
      } else if (Build.VERSION.SDK_INT >= 19) {
        c = new ax();
      } else if (Build.VERSION.SDK_INT >= 18) {
        c = new aw();
      } else {
        c = new av();
      }
    }
  }
  
  static at a(View paramView)
  {
    return c.a(paramView);
  }
  
  private static void a()
  {
    if (!e) {}
    try
    {
      d = View.class.getDeclaredField("mViewFlags");
      d.setAccessible(true);
      e = true;
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Log.i("ViewUtils", "fetchViewFlagsField: ");
      }
    }
  }
  
  static void a(View paramView, float paramFloat)
  {
    c.a(paramView, paramFloat);
  }
  
  static void a(View paramView, int paramInt)
  {
    
    if (d != null) {}
    try
    {
      int i = d.getInt(paramView);
      d.setInt(paramView, paramInt | i & 0xFFFFFFF3);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException) {}
  }
  
  static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static void a(View paramView, Matrix paramMatrix)
  {
    c.a(paramView, paramMatrix);
  }
  
  static be b(View paramView)
  {
    return c.b(paramView);
  }
  
  static void b(View paramView, Matrix paramMatrix)
  {
    c.b(paramView, paramMatrix);
  }
  
  static float c(View paramView)
  {
    return c.c(paramView);
  }
  
  static void c(View paramView, Matrix paramMatrix)
  {
    c.c(paramView, paramMatrix);
  }
  
  static void d(View paramView)
  {
    c.d(paramView);
  }
  
  static void e(View paramView)
  {
    c.e(paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.au
 * JD-Core Version:    0.7.0.1
 */