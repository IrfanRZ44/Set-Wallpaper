package com.google.ads.mediation;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

final class a
  implements RewardedVideoAdListener
{
  a(AbstractAdViewAdapter paramAbstractAdViewAdapter) {}
  
  public final void onRewarded(RewardItem paramRewardItem)
  {
    AbstractAdViewAdapter.zza(this.a).onRewarded(this.a, paramRewardItem);
  }
  
  public final void onRewardedVideoAdClosed()
  {
    AbstractAdViewAdapter.zza(this.a).onAdClosed(this.a);
    AbstractAdViewAdapter.zza(this.a, null);
  }
  
  public final void onRewardedVideoAdFailedToLoad(int paramInt)
  {
    AbstractAdViewAdapter.zza(this.a).onAdFailedToLoad(this.a, paramInt);
  }
  
  public final void onRewardedVideoAdLeftApplication()
  {
    AbstractAdViewAdapter.zza(this.a).onAdLeftApplication(this.a);
  }
  
  public final void onRewardedVideoAdLoaded()
  {
    AbstractAdViewAdapter.zza(this.a).onAdLoaded(this.a);
  }
  
  public final void onRewardedVideoAdOpened()
  {
    AbstractAdViewAdapter.zza(this.a).onAdOpened(this.a);
  }
  
  public final void onRewardedVideoCompleted()
  {
    AbstractAdViewAdapter.zza(this.a).onVideoCompleted(this.a);
  }
  
  public final void onRewardedVideoStarted()
  {
    AbstractAdViewAdapter.zza(this.a).onVideoStarted(this.a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.a
 * JD-Core Version:    0.7.0.1
 */