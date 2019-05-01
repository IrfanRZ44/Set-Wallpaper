package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.lz;
import com.google.android.gms.internal.ads.zzjn;

public final class AdSize
{
  public static final int AUTO_HEIGHT = -2;
  public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
  public static final AdSize FLUID;
  public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
  public static final int FULL_WIDTH = -1;
  public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
  public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
  public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
  public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
  public static final AdSize SMART_BANNER;
  public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
  public static final AdSize zzup;
  private final int a;
  private final int b;
  private final String c;
  
  static
  {
    SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    FLUID = new AdSize(-3, -4, "fluid");
    zzup = new AdSize(50, 50, "50x50_mb");
  }
  
  public AdSize(int paramInt1, int paramInt2) {}
  
  AdSize(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1) && (paramInt1 != -3)) {
      throw new IllegalArgumentException(37 + "Invalid width for AdSize: " + paramInt1);
    }
    if ((paramInt2 < 0) && (paramInt2 != -2) && (paramInt2 != -4)) {
      throw new IllegalArgumentException(38 + "Invalid height for AdSize: " + paramInt2);
    }
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    AdSize localAdSize;
    do
    {
      return true;
      if (!(paramObject instanceof AdSize)) {
        return false;
      }
      localAdSize = (AdSize)paramObject;
    } while ((this.a == localAdSize.a) && (this.b == localAdSize.b) && (this.c.equals(localAdSize.c)));
    return false;
  }
  
  public final int getHeight()
  {
    return this.b;
  }
  
  public final int getHeightInPixels(Context paramContext)
  {
    switch (this.b)
    {
    default: 
      aos.a();
      return lz.a(paramContext, this.b);
    case -2: 
      return zzjn.b(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public final int getWidth()
  {
    return this.a;
  }
  
  public final int getWidthInPixels(Context paramContext)
  {
    switch (this.a)
    {
    case -2: 
    default: 
      aos.a();
      return lz.a(paramContext, this.a);
    case -1: 
      return zzjn.a(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public final int hashCode()
  {
    return this.c.hashCode();
  }
  
  public final boolean isAutoHeight()
  {
    return this.b == -2;
  }
  
  public final boolean isFluid()
  {
    return (this.a == -3) && (this.b == -4);
  }
  
  public final boolean isFullWidth()
  {
    return this.a == -1;
  }
  
  public final String toString()
  {
    return this.c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdSize
 * JD-Core Version:    0.7.0.1
 */