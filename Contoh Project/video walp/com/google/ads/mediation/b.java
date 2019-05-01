package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.ads.reward.zza;

final class b
  extends zza
{
  b(AbstractAdViewAdapter paramAbstractAdViewAdapter) {}
  
  public final void zzt()
  {
    if ((AbstractAdViewAdapter.zzb(this.a) != null) && (AbstractAdViewAdapter.zza(this.a) != null))
    {
      Bundle localBundle = AbstractAdViewAdapter.zzb(this.a).zzba();
      AbstractAdViewAdapter.zza(this.a).zzc(localBundle);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.b
 * JD-Core Version:    0.7.0.1
 */