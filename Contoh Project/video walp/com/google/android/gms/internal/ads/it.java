package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class it
{
  int a = -1;
  private long b = -1L;
  private long c = -1L;
  @GuardedBy("mLock")
  private int d = -1;
  private long e = 0L;
  private final Object f = new Object();
  private final String g;
  @GuardedBy("mLock")
  private int h = 0;
  @GuardedBy("mLock")
  private int i = 0;
  
  public it(String paramString)
  {
    this.g = paramString;
  }
  
  private static boolean a(Context paramContext)
  {
    int j = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (j == 0)
    {
      je.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try
    {
      if (j == paramContext.getPackageManager().getActivityInfo(localComponentName, 0).theme) {
        return true;
      }
      je.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      je.e("Fail to fetch AdActivity theme");
      je.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    }
    return false;
  }
  
  public final Bundle a(Context paramContext, String paramString)
  {
    synchronized (this.f)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", this.g);
      localBundle.putLong("basets", this.c);
      localBundle.putLong("currts", this.b);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", this.d);
      localBundle.putInt("preqs_in_session", this.a);
      localBundle.putLong("time_in_session", this.e);
      localBundle.putInt("pclick", this.h);
      localBundle.putInt("pimp", this.i);
      localBundle.putBoolean("support_transparent_background", a(paramContext));
      return localBundle;
    }
  }
  
  public final void a()
  {
    synchronized (this.f)
    {
      this.h = (1 + this.h);
      return;
    }
  }
  
  public final void a(zzjj paramzzjj, long paramLong)
  {
    long l2;
    for (;;)
    {
      synchronized (this.f)
      {
        long l1 = zzbv.zzeo().l().i();
        l2 = zzbv.zzer().a();
        if (this.c == -1L)
        {
          long l3 = l2 - l1;
          arq localarq = asa.aI;
          if (l3 > ((Long)aos.f().a(localarq)).longValue())
          {
            this.a = -1;
            this.c = paramLong;
            this.b = this.c;
            if ((paramzzjj == null) || (paramzzjj.c == null) || (paramzzjj.c.getInt("gw", 2) != 1)) {
              break;
            }
            return;
          }
          this.a = zzbv.zzeo().l().j();
        }
      }
      this.b = paramLong;
    }
    this.d = (1 + this.d);
    this.a = (1 + this.a);
    if (this.a == 0)
    {
      this.e = 0L;
      zzbv.zzeo().l().b(l2);
    }
    for (;;)
    {
      return;
      this.e = (l2 - zzbv.zzeo().l().k());
    }
  }
  
  public final void b()
  {
    synchronized (this.f)
    {
      this.i = (1 + this.i);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.it
 * JD-Core Version:    0.7.0.1
 */