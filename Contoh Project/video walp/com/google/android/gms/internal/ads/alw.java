package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class alw
{
  private final Runnable a = new alx(this);
  private final Object b = new Object();
  @GuardedBy("mLock")
  private amc c;
  @GuardedBy("mLock")
  private Context d;
  @GuardedBy("mLock")
  private amf e;
  
  private final void b()
  {
    synchronized (this.b)
    {
      if ((this.d == null) || (this.c != null)) {
        return;
      }
      alz localalz = new alz(this);
      ama localama = new ama(this);
      this.c = new amc(this.d, zzbv.zzez().a(), localalz, localama);
      this.c.g();
      return;
    }
  }
  
  private final void c()
  {
    synchronized (this.b)
    {
      if (this.c == null) {
        return;
      }
      if ((this.c.h()) || (this.c.i())) {
        this.c.j();
      }
      this.c = null;
      this.e = null;
      Binder.flushPendingCommands();
      return;
    }
  }
  
  public final zzhi a(zzhl paramzzhl)
  {
    zzhi localzzhi3;
    synchronized (this.b)
    {
      if (this.e == null)
      {
        zzhi localzzhi1 = new zzhi();
        return localzzhi1;
      }
    }
  }
  
  public final void a()
  {
    arq localarq1 = asa.cF;
    if (((Boolean)aos.f().a(localarq1)).booleanValue()) {
      synchronized (this.b)
      {
        b();
        zzbv.zzek();
        jn.a.removeCallbacks(this.a);
        zzbv.zzek();
        Handler localHandler = jn.a;
        Runnable localRunnable = this.a;
        arq localarq2 = asa.cG;
        localHandler.postDelayed(localRunnable, ((Long)aos.f().a(localarq2)).longValue());
        return;
      }
    }
  }
  
  public final void a(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    synchronized (this.b)
    {
      if (this.d != null) {
        return;
      }
    }
    this.d = paramContext.getApplicationContext();
    arq localarq1 = asa.cE;
    if (((Boolean)aos.f().a(localarq1)).booleanValue()) {
      b();
    }
    for (;;)
    {
      return;
      arq localarq2 = asa.cD;
      if (((Boolean)aos.f().a(localarq2)).booleanValue())
      {
        aly localaly = new aly(this);
        zzbv.zzen().a(localaly);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.alw
 * JD-Core Version:    0.7.0.1
 */