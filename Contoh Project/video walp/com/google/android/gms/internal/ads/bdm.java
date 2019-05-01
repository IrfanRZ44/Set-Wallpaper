package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cm
public final class bdm
  implements NativeMediationAdRequest
{
  private final Date a;
  private final int b;
  private final Set<String> c;
  private final boolean d;
  private final Location e;
  private final int f;
  private final zzpl g;
  private final List<String> h;
  private final boolean i;
  private final Map<String, Boolean> j;
  
  public bdm(Date paramDate, int paramInt1, Set<String> paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, zzpl paramzzpl, List<String> paramList, boolean paramBoolean2)
  {
    this.a = paramDate;
    this.b = paramInt1;
    this.c = paramSet;
    this.e = paramLocation;
    this.d = paramBoolean1;
    this.f = paramInt2;
    this.g = paramzzpl;
    this.i = paramBoolean2;
    this.h = new ArrayList();
    this.j = new HashMap();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith("custom:"))
        {
          String[] arrayOfString = str.split(":", 3);
          if (arrayOfString.length == 3) {
            if ("true".equals(arrayOfString[2])) {
              this.j.put(arrayOfString[1], Boolean.valueOf(true));
            } else if ("false".equals(arrayOfString[2])) {
              this.j.put(arrayOfString[1], Boolean.valueOf(false));
            }
          }
        }
        else
        {
          this.h.add(str);
        }
      }
    }
  }
  
  public final float getAdVolume()
  {
    return aqt.a().b();
  }
  
  public final Date getBirthday()
  {
    return this.a;
  }
  
  public final int getGender()
  {
    return this.b;
  }
  
  public final Set<String> getKeywords()
  {
    return this.c;
  }
  
  public final Location getLocation()
  {
    return this.e;
  }
  
  public final NativeAdOptions getNativeAdOptions()
  {
    if (this.g == null) {
      return null;
    }
    NativeAdOptions.Builder localBuilder = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.g.b).setImageOrientation(this.g.c).setRequestMultipleImages(this.g.d);
    if (this.g.a >= 2) {
      localBuilder.setAdChoicesPlacement(this.g.e);
    }
    if ((this.g.a >= 3) && (this.g.f != null)) {
      localBuilder.setVideoOptions(new VideoOptions(this.g.f));
    }
    return localBuilder.build();
  }
  
  public final boolean isAdMuted()
  {
    return aqt.a().c();
  }
  
  public final boolean isAppInstallAdRequested()
  {
    return (this.h != null) && ((this.h.contains("2")) || (this.h.contains("6")));
  }
  
  public final boolean isContentAdRequested()
  {
    return (this.h != null) && ((this.h.contains("1")) || (this.h.contains("6")));
  }
  
  public final boolean isDesignedForFamilies()
  {
    return this.i;
  }
  
  public final boolean isTesting()
  {
    return this.d;
  }
  
  public final boolean isUnifiedNativeAdRequested()
  {
    return (this.h != null) && (this.h.contains("6"));
  }
  
  public final int taggedForChildDirectedTreatment()
  {
    return this.f;
  }
  
  public final boolean zzna()
  {
    return (this.h != null) && (this.h.contains("3"));
  }
  
  public final Map<String, Boolean> zznb()
  {
    return this.j;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdm
 * JD-Core Version:    0.7.0.1
 */