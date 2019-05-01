package android.support.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ao
  implements aq
{
  private static LayoutTransition a;
  private static Field b;
  private static boolean c;
  private static Method d;
  private static boolean e;
  
  private static void a(LayoutTransition paramLayoutTransition)
  {
    if (!e) {}
    try
    {
      d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
      d.setAccessible(true);
      e = true;
      if (d == null) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          d.invoke(paramLayoutTransition, new Object[0]);
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
          return;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
        }
        localNoSuchMethodException = localNoSuchMethodException;
        Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
      }
    }
  }
  
  public am a(ViewGroup paramViewGroup)
  {
    return ak.a(paramViewGroup);
  }
  
  public void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (a == null)
    {
      a = new LayoutTransition()
      {
        public boolean isChangingLayout()
        {
          return true;
        }
      };
      a.setAnimator(2, null);
      a.setAnimator(0, null);
      a.setAnimator(1, null);
      a.setAnimator(3, null);
      a.setAnimator(4, null);
    }
    if (paramBoolean)
    {
      LayoutTransition localLayoutTransition2 = paramViewGroup.getLayoutTransition();
      if (localLayoutTransition2 != null)
      {
        if (localLayoutTransition2.isRunning()) {
          a(localLayoutTransition2);
        }
        if (localLayoutTransition2 != a) {
          paramViewGroup.setTag(y.a.transition_layout_save, localLayoutTransition2);
        }
      }
      paramViewGroup.setLayoutTransition(a);
    }
    for (;;)
    {
      return;
      paramViewGroup.setLayoutTransition(null);
      if (!c) {}
      try
      {
        b = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
        b.setAccessible(true);
        c = true;
        Field localField = b;
        boolean bool = false;
        if (localField != null) {}
        try
        {
          bool = b.getBoolean(paramViewGroup);
          if (bool) {
            b.setBoolean(paramViewGroup, false);
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;)
          {
            LayoutTransition localLayoutTransition1;
            Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
          }
        }
        if (bool) {
          paramViewGroup.requestLayout();
        }
        localLayoutTransition1 = (LayoutTransition)paramViewGroup.getTag(y.a.transition_layout_save);
        if (localLayoutTransition1 == null) {
          continue;
        }
        paramViewGroup.setTag(y.a.transition_layout_save, null);
        paramViewGroup.setLayoutTransition(localLayoutTransition1);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ao
 * JD-Core Version:    0.7.0.1
 */