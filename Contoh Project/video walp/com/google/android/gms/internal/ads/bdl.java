package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@cm
public final class bdl
  extends bdb
{
  private final NativeContentAdMapper a;
  
  public bdl(NativeContentAdMapper paramNativeContentAdMapper)
  {
    this.a = paramNativeContentAdMapper;
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
    if (localList != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        NativeAd.Image localImage = (NativeAd.Image)localIterator.next();
        localArrayList.add(new ate(localImage.getDrawable(), localImage.getUri(), localImage.getScale()));
      }
      return localArrayList;
    }
    return null;
  }
  
  public final void b(a parama)
  {
    this.a.trackView((View)b.a(parama));
  }
  
  public final String c()
  {
    return this.a.getBody();
  }
  
  public final void c(a parama)
  {
    this.a.untrackView((View)b.a(parama));
  }
  
  public final aun d()
  {
    NativeAd.Image localImage = this.a.getLogo();
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
  
  public final void g()
  {
    this.a.recordImpression();
  }
  
  public final boolean h()
  {
    return this.a.getOverrideImpressionRecording();
  }
  
  public final boolean i()
  {
    return this.a.getOverrideClickHandling();
  }
  
  public final Bundle j()
  {
    return this.a.getExtras();
  }
  
  public final a k()
  {
    View localView = this.a.getAdChoicesContent();
    if (localView == null) {
      return null;
    }
    return b.a(localView);
  }
  
  public final aqg l()
  {
    if (this.a.getVideoController() != null) {
      return this.a.getVideoController().zzbc();
    }
    return null;
  }
  
  public final auj m()
  {
    return null;
  }
  
  public final a n()
  {
    View localView = this.a.zzvy();
    if (localView == null) {
      return null;
    }
    return b.a(localView);
  }
  
  public final a o()
  {
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdl
 * JD-Core Version:    0.7.0.1
 */