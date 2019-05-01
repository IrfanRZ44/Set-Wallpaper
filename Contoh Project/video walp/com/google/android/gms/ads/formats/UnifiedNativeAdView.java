package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aoh;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aus;
import com.google.android.gms.internal.ads.mk;

public final class UnifiedNativeAdView
  extends FrameLayout
{
  private final FrameLayout a = a(paramContext);
  private final aus b = a();
  
  public UnifiedNativeAdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public UnifiedNativeAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public UnifiedNativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  @TargetApi(21)
  public UnifiedNativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private final View a(String paramString)
  {
    try
    {
      a locala = this.b.a(paramString);
      if (locala != null)
      {
        View localView = (View)b.a(locala);
        return localView;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call getAssetView on delegate", localRemoteException);
    }
    return null;
  }
  
  private final FrameLayout a(Context paramContext)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(localFrameLayout);
    return localFrameLayout;
  }
  
  private final aus a()
  {
    n.a(this.a, "createDelegate must be called after overlayFrame has been created");
    if (isInEditMode()) {
      return null;
    }
    return aos.b().a(this.a.getContext(), this, this.a);
  }
  
  private final void a(String paramString, View paramView)
  {
    try
    {
      this.b.a(paramString, b.a(paramView));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call setAssetView on delegate", localRemoteException);
    }
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(this.a);
  }
  
  public final void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    if (this.a != paramView) {
      super.bringChildToFront(this.a);
    }
  }
  
  public final void destroy()
  {
    try
    {
      this.b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to destroy native ad view", localRemoteException);
    }
  }
  
  public final AdChoicesView getAdChoicesView()
  {
    View localView = a("3011");
    if ((localView instanceof AdChoicesView)) {
      return (AdChoicesView)localView;
    }
    return null;
  }
  
  public final View getAdvertiserView()
  {
    return a("3005");
  }
  
  public final View getBodyView()
  {
    return a("3004");
  }
  
  public final View getCallToActionView()
  {
    return a("3002");
  }
  
  public final View getHeadlineView()
  {
    return a("3001");
  }
  
  public final View getIconView()
  {
    return a("3003");
  }
  
  public final View getImageView()
  {
    return a("3008");
  }
  
  public final MediaView getMediaView()
  {
    View localView = a("3010");
    if ((localView instanceof MediaView)) {
      return (MediaView)localView;
    }
    if (localView != null) {
      mk.b("View is not an instance of MediaView");
    }
    return null;
  }
  
  public final View getPriceView()
  {
    return a("3007");
  }
  
  public final View getStarRatingView()
  {
    return a("3009");
  }
  
  public final View getStoreView()
  {
    return a("3006");
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.b != null) {}
    try
    {
      this.b.a(b.a(paramView), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call onVisibilityChanged on delegate", localRemoteException);
    }
  }
  
  public final void removeAllViews()
  {
    super.removeAllViews();
    super.addView(this.a);
  }
  
  public final void removeView(View paramView)
  {
    if (this.a == paramView) {
      return;
    }
    super.removeView(paramView);
  }
  
  public final void setAdChoicesView(AdChoicesView paramAdChoicesView)
  {
    a("3011", paramAdChoicesView);
  }
  
  public final void setAdvertiserView(View paramView)
  {
    a("3005", paramView);
  }
  
  public final void setBodyView(View paramView)
  {
    a("3004", paramView);
  }
  
  public final void setCallToActionView(View paramView)
  {
    a("3002", paramView);
  }
  
  public final void setClickConfirmingView(View paramView)
  {
    try
    {
      this.b.b(b.a(paramView));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call setClickConfirmingView on delegate", localRemoteException);
    }
  }
  
  public final void setHeadlineView(View paramView)
  {
    a("3001", paramView);
  }
  
  public final void setIconView(View paramView)
  {
    a("3003", paramView);
  }
  
  public final void setImageView(View paramView)
  {
    a("3008", paramView);
  }
  
  public final void setMediaView(MediaView paramMediaView)
  {
    a("3010", paramMediaView);
  }
  
  public final void setNativeAd(UnifiedNativeAd paramUnifiedNativeAd)
  {
    try
    {
      this.b.a((a)paramUnifiedNativeAd.a());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call setNativeAd on delegate", localRemoteException);
    }
  }
  
  public final void setPriceView(View paramView)
  {
    a("3007", paramView);
  }
  
  public final void setStarRatingView(View paramView)
  {
    a("3009", paramView);
  }
  
  public final void setStoreView(View paramView)
  {
    a("3006", paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.UnifiedNativeAdView
 * JD-Core Version:    0.7.0.1
 */