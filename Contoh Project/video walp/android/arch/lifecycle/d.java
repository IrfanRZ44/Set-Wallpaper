package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public class d
  extends Fragment
  implements w
{
  private static final a a = new a();
  private v b = new v();
  
  public d()
  {
    setRetainInstance(true);
  }
  
  public static d a(Fragment paramFragment)
  {
    return a.b(paramFragment);
  }
  
  public v getViewModelStore()
  {
    return this.b;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a.a(this);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.b.a();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  static class a
  {
    private Map<Activity, d> a = new HashMap();
    private Map<Fragment, d> b = new HashMap();
    private Application.ActivityLifecycleCallbacks c = new b()
    {
      public void onActivityDestroyed(Activity paramAnonymousActivity)
      {
        if ((d)d.a.a(d.a.this).remove(paramAnonymousActivity) != null) {
          Log.e("ViewModelStores", "Failed to save a ViewModel for " + paramAnonymousActivity);
        }
      }
    };
    private boolean d = false;
    private FragmentManager.FragmentLifecycleCallbacks e = new FragmentManager.FragmentLifecycleCallbacks()
    {
      public void onFragmentDestroyed(FragmentManager paramAnonymousFragmentManager, Fragment paramAnonymousFragment)
      {
        super.onFragmentDestroyed(paramAnonymousFragmentManager, paramAnonymousFragment);
        if ((d)d.a.b(d.a.this).remove(paramAnonymousFragment) != null) {
          Log.e("ViewModelStores", "Failed to save a ViewModel for " + paramAnonymousFragment);
        }
      }
    };
    
    private static d a(FragmentManager paramFragmentManager)
    {
      if (paramFragmentManager.isDestroyed()) {
        throw new IllegalStateException("Can't access ViewModels from onDestroy");
      }
      Fragment localFragment = paramFragmentManager.findFragmentByTag("android.arch.lifecycle.state.StateProviderHolderFragment");
      if ((localFragment != null) && (!(localFragment instanceof d))) {
        throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
      }
      return (d)localFragment;
    }
    
    private static d b(FragmentManager paramFragmentManager)
    {
      d locald = new d();
      paramFragmentManager.beginTransaction().add(locald, "android.arch.lifecycle.state.StateProviderHolderFragment").commitAllowingStateLoss();
      return locald;
    }
    
    void a(Fragment paramFragment)
    {
      Fragment localFragment = paramFragment.getParentFragment();
      if (localFragment != null)
      {
        this.b.remove(localFragment);
        localFragment.getFragmentManager().unregisterFragmentLifecycleCallbacks(this.e);
        return;
      }
      this.a.remove(paramFragment.getActivity());
    }
    
    d b(Fragment paramFragment)
    {
      FragmentManager localFragmentManager = paramFragment.getChildFragmentManager();
      d locald1 = a(localFragmentManager);
      if (locald1 != null) {}
      do
      {
        return locald1;
        locald1 = (d)this.b.get(paramFragment);
      } while (locald1 != null);
      paramFragment.getFragmentManager().registerFragmentLifecycleCallbacks(this.e, false);
      d locald2 = b(localFragmentManager);
      this.b.put(paramFragment, locald2);
      return locald2;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.d
 * JD-Core Version:    0.7.0.1
 */