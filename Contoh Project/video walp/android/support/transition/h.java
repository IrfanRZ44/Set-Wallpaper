package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class h
  implements i
{
  private static Class<?> a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  private static Method e;
  private static boolean f;
  private final View g;
  
  private h(View paramView)
  {
    this.g = paramView;
  }
  
  private static void e()
  {
    if (!b) {}
    try
    {
      a = Class.forName("android.view.GhostView");
      b = true;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Log.i("GhostViewApi21", "Failed to retrieve GhostView class", localClassNotFoundException);
      }
    }
  }
  
  private static void f()
  {
    if (!d) {}
    try
    {
      e();
      c = a.getDeclaredMethod("addGhost", new Class[] { View.class, ViewGroup.class, Matrix.class });
      c.setAccessible(true);
      d = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", localNoSuchMethodException);
      }
    }
  }
  
  private static void g()
  {
    if (!f) {}
    try
    {
      e();
      e = a.getDeclaredMethod("removeGhost", new Class[] { View.class });
      e.setAccessible(true);
      f = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", localNoSuchMethodException);
      }
    }
  }
  
  public void a(ViewGroup paramViewGroup, View paramView) {}
  
  public void setVisibility(int paramInt)
  {
    this.g.setVisibility(paramInt);
  }
  
  static class a
    implements i.a
  {
    public i a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
    {
      
      if (h.b() != null) {
        try
        {
          h localh = new h((View)h.b().invoke(null, new Object[] { paramView, paramViewGroup, paramMatrix }), null);
          return localh;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          throw new RuntimeException(localInvocationTargetException.getCause());
        }
        catch (IllegalAccessException localIllegalAccessException) {}
      }
      return null;
    }
    
    public void a(View paramView)
    {
      
      if (h.d() != null) {}
      try
      {
        h.d().invoke(null, new Object[] { paramView });
        return;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        throw new RuntimeException(localInvocationTargetException.getCause());
      }
      catch (IllegalAccessException localIllegalAccessException) {}
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.h
 * JD-Core Version:    0.7.0.1
 */