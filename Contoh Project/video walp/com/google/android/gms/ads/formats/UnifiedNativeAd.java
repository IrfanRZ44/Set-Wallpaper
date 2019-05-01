package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import java.util.List;

public abstract class UnifiedNativeAd
{
  protected abstract Object a();
  
  public abstract void cancelUnconfirmedClick();
  
  public abstract void destroy();
  
  public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();
  
  public abstract String getAdvertiser();
  
  public abstract String getBody();
  
  public abstract String getCallToAction();
  
  public abstract Bundle getExtras();
  
  public abstract String getHeadline();
  
  public abstract NativeAd.Image getIcon();
  
  public abstract List<NativeAd.Image> getImages();
  
  public abstract String getMediationAdapterClassName();
  
  public abstract String getPrice();
  
  public abstract Double getStarRating();
  
  public abstract String getStore();
  
  public abstract VideoController getVideoController();
  
  public abstract void performClick(Bundle paramBundle);
  
  public abstract boolean recordImpression(Bundle paramBundle);
  
  public abstract void reportTouchEvent(Bundle paramBundle);
  
  public abstract void setUnconfirmedClickListener(UnconfirmedClickListener paramUnconfirmedClickListener);
  
  public abstract Object zzbh();
  
  public static abstract interface OnUnifiedNativeAdLoadedListener
  {
    public abstract void onUnifiedNativeAdLoaded(UnifiedNativeAd paramUnifiedNativeAd);
  }
  
  public static abstract interface UnconfirmedClickListener
  {
    public abstract void onUnconfirmedClickCancelled();
    
    public abstract void onUnconfirmedClickReceived(String paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.UnifiedNativeAd
 * JD-Core Version:    0.7.0.1
 */