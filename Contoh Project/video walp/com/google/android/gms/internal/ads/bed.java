package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@cm
public final class bed
  extends bde
{
  private final UnifiedNativeAdMapper a;
  
  public bed(UnifiedNativeAdMapper paramUnifiedNativeAdMapper)
  {
    this.a = paramUnifiedNativeAdMapper;
  }
  
  public final String a()
  {
    return this.a.getHeadline();
  }
  
  public final void a(a parama)
  {
    this.a.handleClick((View)b.a(parama));
  }
  
  public final void a(a parama1, a parama2, a parama3)
  {
    HashMap localHashMap1 = (HashMap)b.a(parama2);
    HashMap localHashMap2 = (HashMap)b.a(parama3);
    this.a.trackViews((View)b.a(parama1), localHashMap1, localHashMap2);
  }
  
  public final List b()
  {
    List localList = this.a.getImages();
    ArrayList localArrayList = new ArrayList();
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        NativeAd.Image localImage = (NativeAd.Image)localIterator.next();
        localArrayList.add(new ate(localImage.getDrawable(), localImage.getUri(), localImage.getScale()));
      }
    }
    return localArrayList;
  }
  
  public final void b(a parama)
  {
    this.a.untrackView((View)b.a(parama));
  }
  
  public final String c()
  {
    return this.a.getBody();
  }
  
  public final aun d()
  {
    NativeAd.Image localImage = this.a.getIcon();
    if (localImage != null) {
      return new ate(localImage.getDrawable(), localImage.getUri(), localImage.getScale());
    }
    return null;
  }
  
  public final String e()
  {
    return this.a.getCallToAction();
  }
  
  public final String f()
  {
    return this.a.getAdvertiser();
  }
  
  public final double g()
  {
    if (this.a.getStarRating() != null) {
      return this.a.getStarRating().doubleValue();
    }
    return -1.0D;
  }
  
  public final String h()
  {
    return this.a.getStore();
  }
  
  public final String i()
  {
    return this.a.getPrice();
  }
  
  public final aqg j()
  {
    if (this.a.getVideoController() != null) {
      return this.a.getVideoController().zzbc();
    }
    return null;
  }
  
  public final auj k()
  {
    return null;
  }
  
  public final a l()
  {
    View localView = this.a.getAdChoicesContent();
    if (localView == null) {
      return null;
    }
    return b.a(localView);
  }
  
  public final a m()
  {
    View localView = this.a.zzvy();
    if (localView == null) {
      return null;
    }
    return b.a(localView);
  }
  
  public final a n()
  {
    Object localObject = this.a.zzbh();
    if (localObject == null) {
      return null;
    }
    return b.a(localObject);
  }
  
  public final Bundle o()
  {
    return this.a.getExtras();
  }
  
  public final boolean p()
  {
    return this.a.getOverrideImpressionRecording();
  }
  
  public final boolean q()
  {
    return this.a.getOverrideClickHandling();
  }
  
  public final void r()
  {
    this.a.recordImpression();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bed
 * JD-Core Version:    0.7.0.1
 */