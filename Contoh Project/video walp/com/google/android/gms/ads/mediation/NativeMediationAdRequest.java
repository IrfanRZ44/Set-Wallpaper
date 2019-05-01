package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;

public abstract interface NativeMediationAdRequest
  extends MediationAdRequest
{
  public abstract float getAdVolume();
  
  public abstract NativeAdOptions getNativeAdOptions();
  
  public abstract boolean isAdMuted();
  
  public abstract boolean isAppInstallAdRequested();
  
  public abstract boolean isContentAdRequested();
  
  public abstract boolean isUnifiedNativeAdRequested();
  
  public abstract boolean zzna();
  
  public abstract Map<String, Boolean> zznb();
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeMediationAdRequest
 * JD-Core Version:    0.7.0.1
 */