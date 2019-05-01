package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.mk;

@KeepName
public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
  private CustomEventBanner zzdge;
  private CustomEventInterstitial zzdgf;
  private CustomEventNative zzdgg;
  private View zzhq;
  
  private final void zza(View paramView)
  {
    this.zzhq = paramView;
  }
  
  private static <T> T zzi(String paramString)
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
  
  public final View getBannerView()
  {
    return this.zzhq;
  }
  
  public final void onDestroy()
  {
    if (this.zzdge != null) {
      this.zzdge.onDestroy();
    }
    if (this.zzdgf != null) {
      this.zzdgf.onDestroy();
    }
    if (this.zzdgg != null) {
      this.zzdgg.onDestroy();
    }
  }
  
  public final void onPause()
  {
    if (this.zzdge != null) {
      this.zzdge.onPause();
    }
    if (this.zzdgf != null) {
      this.zzdgf.onPause();
    }
    if (this.zzdgg != null) {
      this.zzdgg.onPause();
    }
  }
  
  public final void onResume()
  {
    if (this.zzdge != null) {
      this.zzdge.onResume();
    }
    if (this.zzdgf != null) {
      this.zzdgf.onResume();
    }
    if (this.zzdgg != null) {
      this.zzdgg.onResume();
    }
  }
  
  public final void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.zzdge = ((CustomEventBanner)zzi(paramBundle1.getString("class_name")));
    if (this.zzdge == null)
    {
      paramMediationBannerListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (Bundle localBundle = null;; localBundle = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.zzdge.requestBannerAd(paramContext, new zza(this, paramMediationBannerListener), paramBundle1.getString("parameter"), paramAdSize, paramMediationAdRequest, localBundle);
      return;
    }
  }
  
  public final void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.zzdgf = ((CustomEventInterstitial)zzi(paramBundle1.getString("class_name")));
    if (this.zzdgf == null)
    {
      paramMediationInterstitialListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (Bundle localBundle = null;; localBundle = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.zzdgf.requestInterstitialAd(paramContext, new zzb(this, paramMediationInterstitialListener), paramBundle1.getString("parameter"), paramMediationAdRequest, localBundle);
      return;
    }
  }
  
  public final void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    this.zzdgg = ((CustomEventNative)zzi(paramBundle1.getString("class_name")));
    if (this.zzdgg == null)
    {
      paramMediationNativeListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (Bundle localBundle = null;; localBundle = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.zzdgg.requestNativeAd(paramContext, new zzc(this, paramMediationNativeListener), paramBundle1.getString("parameter"), paramNativeMediationAdRequest, localBundle);
      return;
    }
  }
  
  public final void showInterstitial()
  {
    this.zzdgf.showInterstitial();
  }
  
  static final class zza
    implements CustomEventBannerListener
  {
    private final CustomEventAdapter zzdgh;
    private final MediationBannerListener zzhi;
    
    public zza(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
    {
      this.zzdgh = paramCustomEventAdapter;
      this.zzhi = paramMediationBannerListener;
    }
    
    public final void onAdClicked()
    {
      mk.b("Custom event adapter called onAdClicked.");
      this.zzhi.onAdClicked(this.zzdgh);
    }
    
    public final void onAdClosed()
    {
      mk.b("Custom event adapter called onAdClosed.");
      this.zzhi.onAdClosed(this.zzdgh);
    }
    
    public final void onAdFailedToLoad(int paramInt)
    {
      mk.b("Custom event adapter called onAdFailedToLoad.");
      this.zzhi.onAdFailedToLoad(this.zzdgh, paramInt);
    }
    
    public final void onAdLeftApplication()
    {
      mk.b("Custom event adapter called onAdLeftApplication.");
      this.zzhi.onAdLeftApplication(this.zzdgh);
    }
    
    public final void onAdLoaded(View paramView)
    {
      mk.b("Custom event adapter called onAdLoaded.");
      CustomEventAdapter.zza(this.zzdgh, paramView);
      this.zzhi.onAdLoaded(this.zzdgh);
    }
    
    public final void onAdOpened()
    {
      mk.b("Custom event adapter called onAdOpened.");
      this.zzhi.onAdOpened(this.zzdgh);
    }
  }
  
  final class zzb
    implements CustomEventInterstitialListener
  {
    private final CustomEventAdapter zzdgh;
    private final MediationInterstitialListener zzhj;
    
    public zzb(CustomEventAdapter paramCustomEventAdapter, MediationInterstitialListener paramMediationInterstitialListener)
    {
      this.zzdgh = paramCustomEventAdapter;
      this.zzhj = paramMediationInterstitialListener;
    }
    
    public final void onAdClicked()
    {
      mk.b("Custom event adapter called onAdClicked.");
      this.zzhj.onAdClicked(this.zzdgh);
    }
    
    public final void onAdClosed()
    {
      mk.b("Custom event adapter called onAdClosed.");
      this.zzhj.onAdClosed(this.zzdgh);
    }
    
    public final void onAdFailedToLoad(int paramInt)
    {
      mk.b("Custom event adapter called onFailedToReceiveAd.");
      this.zzhj.onAdFailedToLoad(this.zzdgh, paramInt);
    }
    
    public final void onAdLeftApplication()
    {
      mk.b("Custom event adapter called onAdLeftApplication.");
      this.zzhj.onAdLeftApplication(this.zzdgh);
    }
    
    public final void onAdLoaded()
    {
      mk.b("Custom event adapter called onReceivedAd.");
      this.zzhj.onAdLoaded(CustomEventAdapter.this);
    }
    
    public final void onAdOpened()
    {
      mk.b("Custom event adapter called onAdOpened.");
      this.zzhj.onAdOpened(this.zzdgh);
    }
  }
  
  static final class zzc
    implements CustomEventNativeListener
  {
    private final CustomEventAdapter zzdgh;
    private final MediationNativeListener zzhk;
    
    public zzc(CustomEventAdapter paramCustomEventAdapter, MediationNativeListener paramMediationNativeListener)
    {
      this.zzdgh = paramCustomEventAdapter;
      this.zzhk = paramMediationNativeListener;
    }
    
    public final void onAdClicked()
    {
      mk.b("Custom event adapter called onAdClicked.");
      this.zzhk.onAdClicked(this.zzdgh);
    }
    
    public final void onAdClosed()
    {
      mk.b("Custom event adapter called onAdClosed.");
      this.zzhk.onAdClosed(this.zzdgh);
    }
    
    public final void onAdFailedToLoad(int paramInt)
    {
      mk.b("Custom event adapter called onAdFailedToLoad.");
      this.zzhk.onAdFailedToLoad(this.zzdgh, paramInt);
    }
    
    public final void onAdImpression()
    {
      mk.b("Custom event adapter called onAdImpression.");
      this.zzhk.onAdImpression(this.zzdgh);
    }
    
    public final void onAdLeftApplication()
    {
      mk.b("Custom event adapter called onAdLeftApplication.");
      this.zzhk.onAdLeftApplication(this.zzdgh);
    }
    
    public final void onAdLoaded(NativeAdMapper paramNativeAdMapper)
    {
      mk.b("Custom event adapter called onAdLoaded.");
      this.zzhk.onAdLoaded(this.zzdgh, paramNativeAdMapper);
    }
    
    public final void onAdLoaded(UnifiedNativeAdMapper paramUnifiedNativeAdMapper)
    {
      mk.b("Custom event adapter called onAdLoaded.");
      this.zzhk.onAdLoaded(this.zzdgh, paramUnifiedNativeAdMapper);
    }
    
    public final void onAdOpened()
    {
      mk.b("Custom event adapter called onAdOpened.");
      this.zzhk.onAdOpened(this.zzdgh);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.7.0.1
 */