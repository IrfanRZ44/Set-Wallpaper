package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

public abstract interface CustomEventNativeListener
  extends CustomEventListener
{
  public abstract void onAdImpression();
  
  public abstract void onAdLoaded(NativeAdMapper paramNativeAdMapper);
  
  public abstract void onAdLoaded(UnifiedNativeAdMapper paramUnifiedNativeAdMapper);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
 * JD-Core Version:    0.7.0.1
 */