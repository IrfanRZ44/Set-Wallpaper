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

public class NativeAdView
  extends FrameLayout
{
  private final FrameLayout a = a(paramContext);
  private final aus b = a();
  
  public NativeAdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  @TargetApi(21)
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
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
    n.a(this.a, "createDelegate must be called after mOverlayFrame has been created");
    if (isInEditMode()) {
      return null;
    }
    return aos.b().a(this.a.getContext(), this, this.a);
  }
  
  protected final View a(String paramString)
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
  
  protected final void a(String paramString, View paramView)
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
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(this.a);
  }
  
  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    if (this.a != paramView) {
      super.bringChildToFront(this.a);
    }
  }
  
  public void destroy()
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
  
  public AdChoicesView getAdChoicesView()
  {
    View localView = a("1098");
    if ((localView instanceof AdChoicesView)) {
      return (AdChoicesView)localView;
    }
    return null;
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
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
  
  public void removeAllViews()
  {
    super.removeAllViews();
    super.addView(this.a);
  }
  
  public void removeView(View paramView)
  {
    if (this.a == paramView) {
      return;
    }
    super.removeView(paramView);
  }
  
  public void setAdChoicesView(AdChoicesView paramAdChoicesView)
  {
    a("1098", paramAdChoicesView);
  }
  
  public void setNativeAd(NativeAd paramNativeAd)
  {
    try
    {
      this.b.a((a)paramNativeAd.a());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call setNativeAd on delegate", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdView
 * JD-Core Version:    0.7.0.1
 */