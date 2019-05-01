package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Debug;
import com.google.android.gms.common.util.c;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.je;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class p
  extends TimerTask
{
  p(zza paramzza, CountDownLatch paramCountDownLatch, Timer paramTimer) {}
  
  public final void run()
  {
    arq localarq1 = asa.cp;
    if (((Integer)aos.f().a(localarq1)).intValue() != this.a.getCount())
    {
      je.b("Stopping method tracing");
      Debug.stopMethodTracing();
      if (this.a.getCount() == 0L)
      {
        this.b.cancel();
        return;
      }
    }
    String str1 = String.valueOf(this.c.e.zzrt.getPackageName()).concat("_adsTrace_");
    try
    {
      je.b("Starting method tracing");
      this.a.countDown();
      long l = zzbv.zzer().a();
      String str2 = 20 + String.valueOf(str1).length() + str1 + l;
      arq localarq2 = asa.cq;
      Debug.startMethodTracing(str2, ((Integer)aos.f().a(localarq2)).intValue());
      return;
    }
    catch (Exception localException)
    {
      je.d("#007 Could not call remote method.", localException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.p
 * JD-Core Version:    0.7.0.1
 */