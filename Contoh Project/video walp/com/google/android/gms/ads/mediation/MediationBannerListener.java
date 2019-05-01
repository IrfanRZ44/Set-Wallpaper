package com.google.android.gms.ads.mediation;

public abstract interface MediationBannerListener
{
  public abstract void onAdClicked(MediationBannerAdapter paramMediationBannerAdapter);
  
  public abstract void onAdClosed(MediationBannerAdapter paramMediationBannerAdapter);
  
  public abstract void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, int paramInt);
  
  public abstract void onAdLeftApplication(MediationBannerAdapter paramMediationBannerAdapter);
  
  public abstract void onAdLoaded(MediationBannerAdapter paramMediationBannerAdapter);
  
  public abstract void onAdOpened(MediationBannerAdapter paramMediationBannerAdapter);
  
  public abstract void zza(MediationBannerAdapter paramMediationBannerAdapter, String paramString1, String paramString2);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationBannerListener
 * JD-Core Version:    0.7.0.1
 */