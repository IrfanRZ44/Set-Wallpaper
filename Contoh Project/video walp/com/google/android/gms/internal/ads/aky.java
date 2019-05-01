package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.k;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public final class aky
{
  private final Object a = new Object();
  @GuardedBy("mActivityTrackerLock")
  private akz b = null;
  @GuardedBy("mActivityTrackerLock")
  private boolean c = false;
  
  public final Activity a()
  {
    synchronized (this.a)
    {
      if (!k.b()) {
        return null;
      }
      if (this.b != null)
      {
        Activity localActivity = this.b.a();
        return localActivity;
      }
    }
    return null;
  }
  
  public final void a(Context paramContext)
  {
    synchronized (this.a)
    {
      if (this.c) {
        break label128;
      }
      if (!k.b()) {
        return;
      }
      arq localarq = asa.aG;
      if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
        return;
      }
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext == null) {
      localContext = paramContext;
    }
    if ((localContext instanceof Application)) {}
    for (Application localApplication = (Application)localContext;; localApplication = null)
    {
      if (localApplication == null)
      {
        je.e("Can not cast Context to Application");
        return;
      }
      if (this.b == null) {
        this.b = new akz();
      }
      this.b.a(localApplication, paramContext);
      this.c = true;
      label128:
      return;
    }
  }
  
  public final void a(alb paramalb)
  {
    synchronized (this.a)
    {
      if (!k.b()) {
        return;
      }
      arq localarq = asa.aG;
      if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
        return;
      }
    }
    if (this.b == null) {
      this.b = new akz();
    }
    this.b.a(paramalb);
  }
  
  public final Context b()
  {
    synchronized (this.a)
    {
      if (!k.b()) {
        return null;
      }
      if (this.b != null)
      {
        Context localContext = this.b.b();
        return localContext;
      }
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aky
 * JD-Core Version:    0.7.0.1
 */