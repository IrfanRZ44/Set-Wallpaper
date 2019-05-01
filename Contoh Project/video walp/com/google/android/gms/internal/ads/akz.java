package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
final class akz
  implements Application.ActivityLifecycleCallbacks
{
  private Activity a;
  private Context b;
  private final Object c = new Object();
  private boolean d = true;
  private boolean e = false;
  @GuardedBy("mLock")
  private final List<alb> f = new ArrayList();
  @GuardedBy("mLock")
  private final List<alo> g = new ArrayList();
  private Runnable h;
  private boolean i = false;
  private long j;
  
  private final void a(Activity paramActivity)
  {
    synchronized (this.c)
    {
      if (!paramActivity.getClass().getName().startsWith("com.google.android.gms.ads")) {
        this.a = paramActivity;
      }
      return;
    }
  }
  
  public final Activity a()
  {
    return this.a;
  }
  
  public final void a(Application paramApplication, Context paramContext)
  {
    if (!this.i)
    {
      paramApplication.registerActivityLifecycleCallbacks(this);
      if ((paramContext instanceof Activity)) {
        a((Activity)paramContext);
      }
      this.b = paramApplication;
      arq localarq = asa.aH;
      this.j = ((Long)aos.f().a(localarq)).longValue();
      this.i = true;
    }
  }
  
  public final void a(alb paramalb)
  {
    synchronized (this.c)
    {
      this.f.add(paramalb);
      return;
    }
  }
  
  public final Context b()
  {
    return this.b;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
      if (this.a.equals(paramActivity)) {
        this.a = null;
      }
      Iterator localIterator = this.g.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          alo localalo = (alo)localIterator.next();
          try
          {
            if (localalo.c(paramActivity)) {
              localIterator.remove();
            }
          }
          catch (Exception localException)
          {
            zzbv.zzeo().a(localException, "AppActivityTracker.ActivityListener.onActivityDestroyed");
            mk.b("", localException);
          }
        }
      }
    }
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity);
    synchronized (this.c)
    {
      Iterator localIterator = this.g.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          alo localalo = (alo)localIterator.next();
          try
          {
            localalo.b(paramActivity);
          }
          catch (Exception localException)
          {
            zzbv.zzeo().a(localException, "AppActivityTracker.ActivityListener.onActivityPaused");
            mk.b("", localException);
          }
        }
      }
    }
    this.e = true;
    if (this.h != null) {
      jn.a.removeCallbacks(this.h);
    }
    Handler localHandler = jn.a;
    ala localala = new ala(this);
    this.h = localala;
    localHandler.postDelayed(localala, this.j);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity);
    this.e = false;
    boolean bool = this.d;
    int k = 0;
    if (!bool) {
      k = 1;
    }
    this.d = true;
    if (this.h != null) {
      jn.a.removeCallbacks(this.h);
    }
    synchronized (this.c)
    {
      Iterator localIterator1 = this.g.iterator();
      for (;;)
      {
        if (localIterator1.hasNext())
        {
          alo localalo = (alo)localIterator1.next();
          try
          {
            localalo.a(paramActivity);
          }
          catch (Exception localException2)
          {
            zzbv.zzeo().a(localException2, "AppActivityTracker.ActivityListener.onActivityResumed");
            mk.b("", localException2);
          }
        }
      }
    }
    if (k != 0)
    {
      Iterator localIterator2 = this.f.iterator();
      while (localIterator2.hasNext())
      {
        alb localalb = (alb)localIterator2.next();
        try
        {
          localalb.a(true);
        }
        catch (Exception localException1)
        {
          mk.b("", localException1);
        }
      }
    }
    je.b("App is still foreground.");
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.akz
 * JD-Core Version:    0.7.0.1
 */