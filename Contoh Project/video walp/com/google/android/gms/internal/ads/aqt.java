package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.n;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class aqt
{
  @GuardedBy("sLock")
  private static aqt a;
  private static final Object b = new Object();
  private aqb c;
  private RewardedVideoAd d;
  
  public static aqt a()
  {
    synchronized (b)
    {
      if (a == null) {
        a = new aqt();
      }
      aqt localaqt = a;
      return localaqt;
    }
  }
  
  public final RewardedVideoAd a(Context paramContext)
  {
    synchronized (b)
    {
      if (this.d != null)
      {
        RewardedVideoAd localRewardedVideoAd2 = this.d;
        return localRewardedVideoAd2;
      }
      bcj localbcj = new bcj();
      this.d = new go(paramContext, (gb)aoh.a(paramContext, false, new aop(aos.b(), paramContext, localbcj)));
      RewardedVideoAd localRewardedVideoAd1 = this.d;
      return localRewardedVideoAd1;
    }
  }
  
  public final void a(float paramFloat)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((0.0F <= paramFloat) && (paramFloat <= 1.0F))
    {
      bool2 = bool1;
      n.b(bool2, "The app volume must be a value between 0 and 1 inclusive.");
      if (this.c == null) {
        break label51;
      }
    }
    for (;;)
    {
      n.a(bool1, "MobileAds.initialize() must be called prior to setting the app volume.");
      try
      {
        this.c.setAppVolume(paramFloat);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        mk.b("Unable to set app volume.", localRemoteException);
      }
      bool2 = false;
      break;
      label51:
      bool1 = false;
    }
  }
  
  public final void a(Context paramContext, String paramString)
  {
    if (this.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      n.a(bool, "MobileAds.initialize() must be called prior to opening debug menu.");
      try
      {
        this.c.zzb(b.a(paramContext), paramString);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        mk.b("Unable to open debug menu.", localRemoteException);
      }
    }
  }
  
  public final void a(Context paramContext, String paramString, aqv paramaqv)
  {
    synchronized (b)
    {
      if (this.c != null) {
        return;
      }
      if (paramContext == null) {
        throw new IllegalArgumentException("Context cannot be null.");
      }
    }
    try
    {
      this.c = ((aqb)aoh.a(paramContext, false, new aom(aos.b(), paramContext)));
      this.c.zza();
      if (paramString != null) {
        this.c.zza(paramString, b.a(new aqu(this, paramContext)));
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.c("MobileAdsSettingManager initialization failed", localRemoteException);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      n.a(bool, "MobileAds.initialize() must be called prior to setting app muted state.");
      try
      {
        this.c.setAppMuted(paramBoolean);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        mk.b("Unable to set app mute state.", localRemoteException);
      }
    }
  }
  
  public final float b()
  {
    if (this.c == null) {
      return 1.0F;
    }
    try
    {
      float f = this.c.zzdo();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to get app volume.", localRemoteException);
    }
    return 1.0F;
  }
  
  public final boolean c()
  {
    if (this.c == null) {
      return false;
    }
    try
    {
      boolean bool = this.c.zzdp();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to get app mute state.", localRemoteException);
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqt
 * JD-Core Version:    0.7.0.1
 */