package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.internal.ads.cm;
import java.util.List;
import java.util.Map;

@cm
public class UnifiedNativeAdMapper
{
  private Bundle extras = new Bundle();
  private VideoController zzbkz;
  private String zzceo;
  private String zzdfq;
  private List<NativeAd.Image> zzdfr;
  private NativeAd.Image zzdfs;
  private String zzdft;
  private String zzdfu;
  private Double zzdfv;
  private String zzdfw;
  private String zzdfx;
  private boolean zzdfy;
  private View zzdfz;
  private View zzdga;
  private Object zzdgb;
  private boolean zzdgc;
  private boolean zzdgd;
  
  public View getAdChoicesContent()
  {
    return this.zzdfz;
  }
  
  public final String getAdvertiser()
  {
    return this.zzdfu;
  }
  
  public final String getBody()
  {
    return this.zzceo;
  }
  
  public final String getCallToAction()
  {
    return this.zzdft;
  }
  
  public final Bundle getExtras()
  {
    return this.extras;
  }
  
  public final String getHeadline()
  {
    return this.zzdfq;
  }
  
  public final NativeAd.Image getIcon()
  {
    return this.zzdfs;
  }
  
  public final List<NativeAd.Image> getImages()
  {
    return this.zzdfr;
  }
  
  public final boolean getOverrideClickHandling()
  {
    return this.zzdgd;
  }
  
  public final boolean getOverrideImpressionRecording()
  {
    return this.zzdgc;
  }
  
  public final String getPrice()
  {
    return this.zzdfx;
  }
  
  public final Double getStarRating()
  {
    return this.zzdfv;
  }
  
  public final String getStore()
  {
    return this.zzdfw;
  }
  
  public final VideoController getVideoController()
  {
    return this.zzbkz;
  }
  
  public void handleClick(View paramView) {}
  
  public boolean hasVideoContent()
  {
    return this.zzdfy;
  }
  
  public void recordImpression() {}
  
  public void setAdChoicesContent(View paramView)
  {
    this.zzdfz = paramView;
  }
  
  public final void setAdvertiser(String paramString)
  {
    this.zzdfu = paramString;
  }
  
  public final void setBody(String paramString)
  {
    this.zzceo = paramString;
  }
  
  public final void setCallToAction(String paramString)
  {
    this.zzdft = paramString;
  }
  
  public final void setExtras(Bundle paramBundle)
  {
    this.extras = paramBundle;
  }
  
  public void setHasVideoContent(boolean paramBoolean)
  {
    this.zzdfy = paramBoolean;
  }
  
  public final void setHeadline(String paramString)
  {
    this.zzdfq = paramString;
  }
  
  public final void setIcon(NativeAd.Image paramImage)
  {
    this.zzdfs = paramImage;
  }
  
  public final void setImages(List<NativeAd.Image> paramList)
  {
    this.zzdfr = paramList;
  }
  
  public void setMediaView(View paramView)
  {
    this.zzdga = paramView;
  }
  
  public final void setOverrideClickHandling(boolean paramBoolean)
  {
    this.zzdgd = paramBoolean;
  }
  
  public final void setOverrideImpressionRecording(boolean paramBoolean)
  {
    this.zzdgc = paramBoolean;
  }
  
  public final void setPrice(String paramString)
  {
    this.zzdfx = paramString;
  }
  
  public final void setStarRating(Double paramDouble)
  {
    this.zzdfv = paramDouble;
  }
  
  public final void setStore(String paramString)
  {
    this.zzdfw = paramString;
  }
  
  public void trackViews(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2) {}
  
  public void untrackView(View paramView) {}
  
  public final void zza(VideoController paramVideoController)
  {
    this.zzbkz = paramVideoController;
  }
  
  public final Object zzbh()
  {
    return this.zzdgb;
  }
  
  public final void zzl(Object paramObject)
  {
    this.zzdgb = paramObject;
  }
  
  public final View zzvy()
  {
    return this.zzdga;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
 * JD-Core Version:    0.7.0.1
 */