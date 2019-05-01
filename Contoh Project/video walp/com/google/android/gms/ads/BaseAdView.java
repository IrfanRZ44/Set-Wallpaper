package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aqp;
import com.google.android.gms.internal.ads.mk;

class BaseAdView
  extends ViewGroup
{
  protected final aqp a;
  
  public BaseAdView(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = new aqp(this, paramInt);
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.a = new aqp(this, paramAttributeSet, false, paramInt);
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    this.a = new aqp(this, paramAttributeSet, false, paramInt2);
  }
  
  public void destroy()
  {
    this.a.a();
  }
  
  public AdListener getAdListener()
  {
    return this.a.b();
  }
  
  public AdSize getAdSize()
  {
    return this.a.c();
  }
  
  public String getAdUnitId()
  {
    return this.a.e();
  }
  
  public String getMediationAdapterClassName()
  {
    return this.a.k();
  }
  
  public boolean isLoading()
  {
    return this.a.l();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    this.a.a(paramAdRequest.zzay());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
  
  protected void onMeasure(int paramInt1, int paramInt2)
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
  
  public void pause()
  {
    this.a.h();
  }
  
  public void resume()
  {
    this.a.j();
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.a.a(paramAdListener);
    if (paramAdListener == null)
    {
      this.a.a(null);
      this.a.a(null);
    }
    do
    {
      return;
      if ((paramAdListener instanceof anw)) {
        this.a.a((anw)paramAdListener);
      }
    } while (!(paramAdListener instanceof AppEventListener));
    this.a.a((AppEventListener)paramAdListener);
  }
  
  public void setAdSize(AdSize paramAdSize)
  {
    this.a.a(new AdSize[] { paramAdSize });
  }
  
  public void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.BaseAdView
 * JD-Core Version:    0.7.0.1
 */