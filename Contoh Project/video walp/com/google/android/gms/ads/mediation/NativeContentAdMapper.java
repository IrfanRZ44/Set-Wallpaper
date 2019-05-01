package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeContentAdMapper
  extends NativeAdMapper
{
  private String zzbhw;
  private List<NativeAd.Image> zzbhx;
  private String zzbhy;
  private String zzbia;
  private String zzbim;
  private NativeAd.Image zzdfp;
  
  public final String getAdvertiser()
  {
    return this.zzbim;
  }
  
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
  
  public final List<NativeAd.Image> getImages()
  {
    return this.zzbhx;
  }
  
  public final NativeAd.Image getLogo()
  {
    return this.zzdfp;
  }
  
  public final void setAdvertiser(String paramString)
  {
    this.zzbim = paramString;
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
  
  public final void setImages(List<NativeAd.Image> paramList)
  {
    this.zzbhx = paramList;
  }
  
  public final void setLogo(NativeAd.Image paramImage)
  {
    this.zzdfp = paramImage;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeContentAdMapper
 * JD-Core Version:    0.7.0.1
 */