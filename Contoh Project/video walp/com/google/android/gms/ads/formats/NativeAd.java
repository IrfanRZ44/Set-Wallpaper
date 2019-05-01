package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public abstract class NativeAd
{
  public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";
  
  protected abstract Object a();
  
  public abstract void performClick(Bundle paramBundle);
  
  public abstract boolean recordImpression(Bundle paramBundle);
  
  public abstract void reportTouchEvent(Bundle paramBundle);
  
  public static abstract class AdChoicesInfo
  {
    public abstract List<NativeAd.Image> getImages();
    
    public abstract CharSequence getText();
  }
  
  public static abstract class Image
  {
    public abstract Drawable getDrawable();
    
    public abstract double getScale();
    
    public abstract Uri getUri();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAd
 * JD-Core Version:    0.7.0.1
 */