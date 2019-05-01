package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.apj;
import com.google.android.gms.internal.ads.aqp;
import com.google.android.gms.internal.ads.mk;

public final class PublisherAdView
  extends ViewGroup
{
  private final aqp a;
  
  public PublisherAdView(Context paramContext)
  {
    super(paramContext);
    this.a = new aqp(this);
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new aqp(this, paramAttributeSet, true);
    n.a(paramContext, "Context cannot be null");
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new aqp(this, paramAttributeSet, true);
  }
  
  public final void destroy()
  {
    this.a.a();
  }
  
  public final AdListener getAdListener()
  {
    return this.a.b();
  }
  
  public final AdSize getAdSize()
  {
    return this.a.c();
  }
  
  public final AdSize[] getAdSizes()
  {
    return this.a.d();
  }
  
  public final String getAdUnitId()
  {
    return this.a.e();
  }
  
  public final AppEventListener getAppEventListener()
  {
    return this.a.f();
  }
  
  public final String getMediationAdapterClassName()
  {
    return this.a.k();
  }
  
  public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return this.a.g();
  }
  
  public final VideoController getVideoController()
  {
    return this.a.m();
  }
  
  public final VideoOptions getVideoOptions()
  {
    return this.a.o();
  }
  
  public final boolean isLoading()
  {
    return this.a.l();
  }
  
  public final void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    this.a.a(paramPublisherAdRequest.zzay());
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      int k = (paramInt3 - paramInt1 - i) / 2;
      int m = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(k, m, i + k, j + m);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = getChildAt(0);
    int j;
    int i;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      measureChild(localView, paramInt1, paramInt2);
      j = localView.getMeasuredWidth();
      i = localView.getMeasuredHeight();
    }
    for (;;)
    {
      int k = Math.max(j, getSuggestedMinimumWidth());
      int m = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSize(k, paramInt1), View.resolveSize(m, paramInt2));
      return;
      try
      {
        AdSize localAdSize2 = getAdSize();
        localAdSize1 = localAdSize2;
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          Context localContext;
          mk.b("Unable to retrieve ad size.", localNullPointerException);
          AdSize localAdSize1 = null;
        }
        i = 0;
        j = 0;
      }
      if (localAdSize1 != null)
      {
        localContext = getContext();
        j = localAdSize1.getWidthInPixels(localContext);
        i = localAdSize1.getHeightInPixels(localContext);
      }
    }
  }
  
  public final void pause()
  {
    this.a.h();
  }
  
  public final void recordManualImpression()
  {
    this.a.i();
  }
  
  public final void resume()
  {
    this.a.j();
  }
  
  public final void setAdListener(AdListener paramAdListener)
  {
    this.a.a(paramAdListener);
  }
  
  public final void setAdSizes(AdSize... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }
    this.a.b(paramVarArgs);
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
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.a.a(paramOnCustomRenderedAdLoadedListener);
  }
  
  public final void setVideoOptions(VideoOptions paramVideoOptions)
  {
    this.a.a(paramVideoOptions);
  }
  
  public final boolean zza(apj paramapj)
  {
    return this.a.a(paramapj);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherAdView
 * JD-Core Version:    0.7.0.1
 */