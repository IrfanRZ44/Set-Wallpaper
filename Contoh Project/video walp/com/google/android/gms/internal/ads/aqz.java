package com.google.android.gms.internal.ads;

import android.os.Handler;

final class aqz
  extends apc
{
  private aqz(aqx paramaqx) {}
  
  public final String getMediationAdapterClassName()
  {
    return null;
  }
  
  public final boolean isLoading()
  {
    return false;
  }
  
  public final void zza(zzjj paramzzjj, int paramInt)
  {
    mk.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    lz.a.post(new ara(this));
  }
  
  public final String zzck()
  {
    return null;
  }
  
  public final void zzd(zzjj paramzzjj)
  {
    zza(paramzzjj, 1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqz
 * JD-Core Version:    0.7.0.1
 */