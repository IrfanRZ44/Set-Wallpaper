package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

public abstract interface InitializableMediationRewardedVideoAdAdapter
  extends MediationRewardedVideoAdAdapter
{
  public abstract void initialize(Context paramContext, MediationRewardedVideoAdListener paramMediationRewardedVideoAdListener, List<Bundle> paramList);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter
 * JD-Core Version:    0.7.0.1
 */