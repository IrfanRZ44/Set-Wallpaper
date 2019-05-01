package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class ahb
  implements Application.ActivityLifecycleCallbacks
{
  private final Application a;
  private final WeakReference<Application.ActivityLifecycleCallbacks> b;
  private boolean c = false;
  
  public ahb(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    this.b = new WeakReference(paramActivityLifecycleCallbacks);
    this.a = paramApplication;
  }
  
  private final void a(ahj paramahj)
  {
    try
    {
      Application.ActivityLifecycleCallbacks localActivityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)this.b.get();
      if (localActivityLifecycleCallbacks != null)
      {
        paramahj.a(localActivityLifecycleCallbacks);
        return;
      }
      if (!this.c)
      {
        this.a.unregisterActivityLifecycleCallbacks(this);
        this.c = true;
        return;
      }
    }
    catch (Exception localException) {}
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(new ahc(this, paramActivity, paramBundle));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(new ahi(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(new ahf(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(new ahe(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a(new ahh(this, paramActivity, paramBundle));
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(new ahd(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a(new ahg(this, paramActivity));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ahb
 * JD-Core Version:    0.7.0.1
 */