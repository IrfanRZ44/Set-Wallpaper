package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.aqp;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.mk;

@cm
public final class SearchAdView
  extends ViewGroup
{
  private final aqp a;
  
  public SearchAdView(Context paramContext)
  {
    super(paramContext);
    this.a = new aqp(this);
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new aqp(this, paramAttributeSet, false);
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new aqp(this, paramAttributeSet, false);
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
  
  public final String getAdUnitId()
  {
    return this.a.e();
  }
  
  public final void loadAd(DynamicHeightSearchAdRequest paramDynamicHeightSearchAdRequest)
  {
    if (!AdSize.SEARCH.equals(getAdSize())) {
      throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }
    this.a.a(paramDynamicHeightSearchAdRequest.a());
  }
  
  public final void loadAd(SearchAdRequest paramSearchAdRequest)
  {
    this.a.a(paramSearchAdRequest.a());
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
  
  public final void resume()
  {
    this.a.j();
  }
  
  public final void setAdListener(AdListener paramAdListener)
  {
    this.a.a(paramAdListener);
  }
  
  public final void setAdSize(AdSize paramAdSize)
  {
    this.a.a(new AdSize[] { paramAdSize });
  }
  
  public final void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdView
 * JD-Core Version:    0.7.0.1
 */