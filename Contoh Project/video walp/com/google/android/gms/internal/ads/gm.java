package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@cm
public final class gm
  extends gi
{
  private RewardedVideoAdListener a;
  
  public gm(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    this.a = paramRewardedVideoAdListener;
  }
  
  public final void a()
  {
    if (this.a != null) {
      this.a.onRewardedVideoAdLoaded();
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.a != null) {
      this.a.onRewardedVideoAdFailedToLoad(paramInt);
    }
  }
  
  public final void a(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    this.a = paramRewardedVideoAdListener;
  }
  
  public final void a(fw paramfw)
  {
    if (this.a != null) {
      this.a.onRewarded(new gk(paramfw));
    }
  }
  
  public final void b()
  {
    if (this.a != null) {
      this.a.onRewardedVideoAdOpened();
    }
  }
  
  public final void c()
  {
    if (this.a != null) {
      this.a.onRewardedVideoStarted();
    }
  }
  
  public final void d()
  {
    if (this.a != null) {
      this.a.onRewardedVideoAdClosed();
    }
  }
  
  public final void e()
  {
    if (this.a != null) {
      this.a.onRewardedVideoAdLeftApplication();
    }
  }
  
  public final void f()
  {
    if (this.a != null) {
      this.a.onRewardedVideoCompleted();
    }
  }
  
  public final RewardedVideoAdListener g()
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gm
 * JD-Core Version:    0.7.0.1
 */