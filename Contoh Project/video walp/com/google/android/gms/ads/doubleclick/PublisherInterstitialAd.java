package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aqs;

public final class PublisherInterstitialAd
{
  private final aqs a = new aqs(paramContext, this);
  
  public PublisherInterstitialAd(Context paramContext)
  {
    n.a(paramContext, "Context cannot be null");
  }
  
  public final AdListener getAdListener()
  {
    return this.a.a();
  }
  
  public final String getAdUnitId()
  {
    return this.a.b();
  }
  
  public final AppEventListener getAppEventListener()
  {
    return this.a.c();
  }
  
  public final String getMediationAdapterClassName()
  {
    return this.a.h();
  }
  
  public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return this.a.d();
  }
  
  public final boolean isLoaded()
  {
    return this.a.e();
  }
  
  public final boolean isLoading()
  {
    return this.a.f();
  }
  
  public final void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    this.a.a(paramPublisherAdRequest.zzay());
  }
  
  public final void setAdListener(AdListener paramAdListener)
  {
    this.a.a(paramAdListener);
  }
  
  public final void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
  
  public final void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.a.a(paramAppEventListener);
  }
  
  public final void setCorrelator(Correlator paramCorrelator)
  {
    this.a.a(paramCorrelator);
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.a.a(paramOnCustomRenderedAdLoadedListener);
  }
  
  public final void show()
  {
    this.a.i();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherInterstitialAd
 * JD-Core Version:    0.7.0.1
 */