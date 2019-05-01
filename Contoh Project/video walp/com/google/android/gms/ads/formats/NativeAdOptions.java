package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.ads.cm;
import java.lang.annotation.Annotation;

@cm
public final class NativeAdOptions
{
  public static final int ADCHOICES_BOTTOM_LEFT = 3;
  public static final int ADCHOICES_BOTTOM_RIGHT = 2;
  public static final int ADCHOICES_TOP_LEFT = 0;
  public static final int ADCHOICES_TOP_RIGHT = 1;
  public static final int ORIENTATION_ANY = 0;
  public static final int ORIENTATION_LANDSCAPE = 2;
  public static final int ORIENTATION_PORTRAIT = 1;
  private final boolean a;
  private final int b;
  private final boolean c;
  private final int d;
  private final VideoOptions e;
  
  private NativeAdOptions(Builder paramBuilder)
  {
    this.a = Builder.a(paramBuilder);
    this.b = Builder.b(paramBuilder);
    this.c = Builder.c(paramBuilder);
    this.d = Builder.d(paramBuilder);
    this.e = Builder.e(paramBuilder);
  }
  
  public final int getAdChoicesPlacement()
  {
    return this.d;
  }
  
  public final int getImageOrientation()
  {
    return this.b;
  }
  
  public final VideoOptions getVideoOptions()
  {
    return this.e;
  }
  
  public final boolean shouldRequestMultipleImages()
  {
    return this.c;
  }
  
  public final boolean shouldReturnUrlsForImageAssets()
  {
    return this.a;
  }
  
  public static @interface AdChoicesPlacement {}
  
  public static final class Builder
  {
    private boolean a = false;
    private int b = -1;
    private boolean c = false;
    private VideoOptions d;
    private int e = 1;
    
    public final NativeAdOptions build()
    {
      return new NativeAdOptions(this, null);
    }
    
    public final Builder setAdChoicesPlacement(@NativeAdOptions.AdChoicesPlacement int paramInt)
    {
      this.e = paramInt;
      return this;
    }
    
    public final Builder setImageOrientation(int paramInt)
    {
      this.b = paramInt;
      return this;
    }
    
    public final Builder setRequestMultipleImages(boolean paramBoolean)
    {
      this.c = paramBoolean;
      return this;
    }
    
    public final Builder setReturnUrlsForImageAssets(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
    
    public final Builder setVideoOptions(VideoOptions paramVideoOptions)
    {
      this.d = paramVideoOptions;
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdOptions
 * JD-Core Version:    0.7.0.1
 */