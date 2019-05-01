package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ap
  extends ao
{
  private static Method a;
  private static boolean b;
  
  private void a()
  {
    if (!b) {}
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      a = ViewGroup.class.getDeclaredMethod("suppressLayout", arrayOfClass);
      a.setAccessible(true);
      b = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", localNoSuchMethodException);
      }
    }
  }
  
  public am a(ViewGroup paramViewGroup)
  {
    return new al(paramViewGroup);
  }
  
  public void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a();
    if (a != null) {}
    try
    {
      Method localMethod = a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      localMethod.invoke(paramViewGroup, arrayOfObject);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", localIllegalAccessException);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", localInvocationTargetException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ap
 * JD-Core Version:    0.7.0.1
 */