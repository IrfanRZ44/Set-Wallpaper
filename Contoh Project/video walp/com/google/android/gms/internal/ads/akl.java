package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class akl
  implements Application.ActivityLifecycleCallbacks
{
  private final Application a;
  private final WeakReference<Application.ActivityLifecycleCallbacks> b;
  private boolean c = false;
  
  public akl(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    this.b = new WeakReference(paramActivityLifecycleCallbacks);
    this.a = paramApplication;
  }
  
  private final void a(aku paramaku)
  {
    try
    {
      Application.ActivityLifecycleCallbacks localActivityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)this.b.get();
      if (localActivityLifecycleCallbacks != null)
      {
        paramaku.a(localActivityLifecycleCallbacks);
        return;
      }
      if (!this.c)
      {
        this.a.unregisterActivityLifecycleCallbacks(this);
        this.c = true;
        return;
      }
    }
    catch (Exception localException)
    {
      je.b("Error while dispatching lifecycle callback.", localException);
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(new akm(this, paramActivity, paramBundle));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(new akt(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(new akp(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(new ako(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a(new aks(this, paramActivity, paramBundle));
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(new akn(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a(new akq(this, paramActivity));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.akl
 * JD-Core Version:    0.7.0.1
 */