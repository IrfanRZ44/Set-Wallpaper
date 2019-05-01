package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeAppInstallAdMapper
  extends NativeAdMapper
{
  private String zzbhw;
  private List<NativeAd.Image> zzbhx;
  private String zzbhy;
  private String zzbia;
  private double zzbib;
  private String zzbic;
  private String zzbid;
  private NativeAd.Image zzdfo;
  
  public final String getBody()
  {
    return this.zzbhy;
  }
  
  public final String getCallToAction()
  {
    return this.zzbia;
  }
  
  public final String getHeadline()
  {
    return this.zzbhw;
  }
  
  public final NativeAd.Image getIcon()
  {
    return this.zzdfo;
  }
  
  public final List<NativeAd.Image> getImages()
  {
    return this.zzbhx;
  }
  
  public final String getPrice()
  {
    return this.zzbid;
  }
  
  public final double getStarRating()
  {
    return this.zzbib;
  }
  
  public final String getStore()
  {
    return this.zzbic;
  }
  
  public final void setBody(String paramString)
  {
    this.zzbhy = paramString;
  }
  
  public final void setCallToAction(String paramString)
  {
    this.zzbia = paramString;
  }
  
  public final void setHeadline(String paramString)
  {
    this.zzbhw = paramString;
  }
  
  public final void setIcon(NativeAd.Image paramImage)
  {
    this.zzdfo = paramImage;
  }
  
  public final void setImages(List<NativeAd.Image> paramList)
  {
    this.zzbhx = paramList;
  }
  
  public final void setPrice(String paramString)
  {
    this.zzbid = paramString;
  }
  
  public final void setStarRating(double paramDouble)
  {
    this.zzbib = paramDouble;
  }
  
  public final void setStore(String paramString)
  {
    this.zzbic = paramString;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeAppInstallAdMapper
 * JD-Core Version:    0.7.0.1
 */