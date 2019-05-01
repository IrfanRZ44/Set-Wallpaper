package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.mk;

@KeepName
public final class CustomEventAdapter
  implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters>
{
  private View a;
  private CustomEventBanner b;
  private CustomEventInterstitial c;
  
  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = localThrowable.getMessage();
      mk.e(46 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Could not instantiate custom event adapter: " + paramString + ". " + str);
    }
    return null;
  }
  
  private final void a(View paramView)
  {
    this.a = paramView;
  }
  
  public final void destroy()
  {
    if (this.b != null) {
      this.b.destroy();
    }
    if (this.c != null) {
      this.c.destroy();
    }
  }
  
  public final Class<CustomEventExtras> getAdditionalParametersType()
  {
    return CustomEventExtras.class;
  }
  
  public final View getBannerView()
  {
    return this.a;
  }
  
  public final Class<CustomEventServerParameters> getServerParametersType()
  {
    return CustomEventServerParameters.class;
  }
  
  public final void requestBannerAd(MediationBannerListener paramMediationBannerListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    this.b = ((CustomEventBanner)a(paramCustomEventServerParameters.className));
    if (this.b == null)
    {
      paramMediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    if (paramCustomEventExtras == null) {}
    for (Object localObject = null;; localObject = paramCustomEventExtras.getExtra(paramCustomEventServerParameters.label))
    {
      this.b.requestBannerAd(new a(this, paramMediationBannerListener), paramActivity, paramCustomEventServerParameters.label, paramCustomEventServerParameters.parameter, paramAdSize, paramMediationAdRequest, localObject);
      return;
    }
  }
  
  public final void requestInterstitialAd(MediationInterstitialListener paramMediationInterstitialListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    this.c = ((CustomEventInterstitial)a(paramCustomEventServerParameters.className));
    if (this.c == null)
    {
      paramMediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    if (paramCustomEventExtras == null) {}
    for (Object localObject = null;; localObject = paramCustomEventExtras.getExtra(paramCustomEventServerParameters.label))
    {
      this.c.requestInterstitialAd(new b(this, paramMediationInterstitialListener), paramActivity, paramCustomEventServerParameters.label, paramCustomEventServerParameters.parameter, paramMediationAdRequest, localObject);
      return;
    }
  }
  
  public final void showInterstitial()
  {
    this.c.showInterstitial();
  }
  
  static final class a
    implements CustomEventBannerListener
  {
    private final CustomEventAdapter a;
    private final MediationBannerListener b;
    
    public a(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramMediationBannerListener;
    }
    
    public final void onClick()
    {
      mk.b("Custom event adapter called onFailedToReceiveAd.");
      this.b.onClick(this.a);
    }
    
    public final void onDismissScreen()
    {
      mk.b("Custom event adapter called onFailedToReceiveAd.");
      this.b.onDismissScreen(this.a);
    }
    
    public final void onFailedToReceiveAd()
    {
      mk.b("Custom event adapter called onFailedToReceiveAd.");
      this.b.onFailedToReceiveAd(this.a, AdRequest.ErrorCode.NO_FILL);
    }
    
    public final void onLeaveApplication()
    {
      mk.b("Custom event adapter called onFailedToReceiveAd.");
      this.b.onLeaveApplication(this.a);
    }
    
    public final void onPresentScreen()
    {
      mk.b("Custom event adapter called onFailedToReceiveAd.");
      this.b.onPresentScreen(this.a);
    }
    
    public final void onReceivedAd(View paramView)
    {
      mk.b("Custom event adapter called onReceivedAd.");
      CustomEventAdapter.a(this.a, paramView);
      this.b.onReceivedAd(this.a);
    }
  }
  
  final class b
    implements CustomEventInterstitialListener
  {
    private final CustomEventAdapter a;
    private final MediationInterstitialListener b;
    
    public b(CustomEventAdapter paramCustomEventAdapter, MediationInterstitialListener paramMediationInterstitialListener)
    {
      this.a = paramCustomEventAdapter;
      this.b = paramMediationInterstitialListener;
    }
    
    public final void onDismissScreen()
    {
      mk.b("Custom event adapter called onDismissScreen.");
      this.b.onDismissScreen(this.a);
    }
    
    public final void onFailedToReceiveAd()
    {
      mk.b("Custom event adapter called onFailedToReceiveAd.");
      this.b.onFailedToReceiveAd(this.a, AdRequest.ErrorCode.NO_FILL);
    }
    
    public final void onLeaveApplication()
    {
      mk.b("Custom event adapter called onLeaveApplication.");
      this.b.onLeaveApplication(this.a);
    }
    
    public final void onPresentScreen()
    {
      mk.b("Custom event adapter called onPresentScreen.");
      this.b.onPresentScreen(this.a);
    }
    
    public final void onReceivedAd()
    {
      mk.b("Custom event adapter called onReceivedAd.");
      this.b.onReceivedAd(CustomEventAdapter.this);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.7.0.1
 */