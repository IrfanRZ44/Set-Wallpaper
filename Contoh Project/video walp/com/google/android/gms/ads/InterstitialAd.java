package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.zza;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aqs;

public final class InterstitialAd
{
  private final aqs a;
  
  public InterstitialAd(Context paramContext)
  {
    this.a = new aqs(paramContext);
    n.a(paramContext, "Context cannot be null");
  }
  
  public final AdListener getAdListener()
  {
    return this.a.a();
  }
  
  public final String getAdUnitId()
  {
    return this.a.b();
  }
  
  public final String getMediationAdapterClassName()
  {
    return this.a.h();
  }
  
  public final boolean isLoaded()
  {
    return this.a.e();
  }
  
  public final boolean isLoading()
  {
    return this.a.f();
  }
  
  public final void loadAd(AdRequest paramAdRequest)
  {
    this.a.a(paramAdRequest.zzay());
  }
  
  public final void setAdListener(AdListener paramAdListener)
  {
    this.a.a(paramAdListener);
    if ((paramAdListener != null) && ((paramAdListener instanceof anw))) {
      this.a.a((anw)paramAdListener);
    }
    while (paramAdListener != null) {
      return;
    }
    this.a.a(null);
  }
  
  public final void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public final void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    this.a.a(paramRewardedVideoAdListener);
  }
  
  public final void show()
  {
    this.a.i();
  }
  
  public final void zza(zza paramzza)
  {
    this.a.a(paramzza);
  }
  
  public final void zza(boolean paramBoolean)
  {
    this.a.a(true);
  }
  
  public final Bundle zzba()
  {
    return this.a.g();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.InterstitialAd
 * JD-Core Version:    0.7.0.1
 */