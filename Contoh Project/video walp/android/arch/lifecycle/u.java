package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class u
{
  private static Application a(Activity paramActivity)
  {
    Application localApplication = paramActivity.getApplication();
    if (localApplication == null) {
      throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
    return localApplication;
  }
  
  public static t a(Fragment paramFragment)
  {
    return a(paramFragment, null);
  }
  
  public static t a(Fragment paramFragment, t.b paramb)
  {
    Application localApplication = a(b(paramFragment));
    if (paramb == null) {
      paramb = t.a.a(localApplication);
    }
    return new t(x.a(paramFragment), paramb);
  }
  
  private static Activity b(Fragment paramFragment)
  {
    FragmentActivity localFragmentActivity = paramFragment.getActivity();
    if (localFragmentActivity == null) {
      throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }
    return localFragmentActivity;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.u
 * JD-Core Version:    0.7.0.1
 */