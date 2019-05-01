package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.zzmu;

@cm
public final class VideoOptions
{
  private final boolean a;
  private final boolean b;
  private final boolean c;
  
  private VideoOptions(Builder paramBuilder)
  {
    this.a = Builder.a(paramBuilder);
    this.b = Builder.b(paramBuilder);
    this.c = Builder.c(paramBuilder);
  }
  
  public VideoOptions(zzmu paramzzmu)
  {
    this.a = paramzzmu.a;
    this.b = paramzzmu.b;
    this.c = paramzzmu.c;
  }
  
  public final boolean getClickToExpandRequested()
  {
    return this.c;
  }
  
  public final boolean getCustomControlsRequested()
  {
    return this.b;
  }
  
  public final boolean getStartMuted()
  {
    return this.a;
  }
  
  public static final class Builder
  {
    private boolean a = true;
    private boolean b = false;
    private boolean c = false;
    
    public final VideoOptions build()
    {
      return new VideoOptions(this, null);
    }
    
    public final Builder setClickToExpandRequested(boolean paramBoolean)
    {
      this.c = paramBoolean;
      return this;
    }
    
    public final Builder setCustomControlsRequested(boolean paramBoolean)
    {
      this.b = paramBoolean;
      return this;
    }
    
    public final Builder setStartMuted(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.VideoOptions
 * JD-Core Version:    0.7.0.1
 */