package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ax
  extends aw
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  private void a()
  {
    if (!b) {}
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Float.TYPE;
      a = View.class.getDeclaredMethod("setTransitionAlpha", arrayOfClass);
      a.setAccessible(true);
      b = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", localNoSuchMethodException);
      }
    }
  }
  
  private void b()
  {
    if (!d) {}
    try
    {
      c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
      c.setAccessible(true);
      d = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", localNoSuchMethodException);
      }
    }
  }
  
  public void a(View paramView, float paramFloat)
  {
    a();
    if (a != null) {}
    try
    {
      Method localMethod = a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Float.valueOf(paramFloat);
      localMethod.invoke(paramView, arrayOfObject);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException.getCause());
      paramView.setAlpha(paramFloat);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException) {}
  }
  
  public float c(View paramView)
  {
    b();
    if (c != null) {
      try
      {
        float f = ((Float)c.invoke(paramView, new Object[0])).floatValue();
        return f;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        throw new RuntimeException(localInvocationTargetException.getCause());
      }
      catch (IllegalAccessException localIllegalAccessException) {}
    }
    return super.c(paramView);
  }
  
  public void d(View paramView) {}
  
  public void e(View paramView) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ax
 * JD-Core Version:    0.7.0.1
 */