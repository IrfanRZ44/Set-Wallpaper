package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.n;

@cm
public final class bdj
  implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener
{
  private final bcq a;
  private NativeAdMapper b;
  private UnifiedNativeAdMapper c;
  private NativeCustomTemplateAd d;
  
  public bdj(bcq parambcq)
  {
    this.a = parambcq;
  }
  
  private static void a(MediationNativeAdapter paramMediationNativeAdapter, UnifiedNativeAdMapper paramUnifiedNativeAdMapper, NativeAdMapper paramNativeAdMapper)
  {
    if ((paramMediationNativeAdapter instanceof AdMobAdapter)) {}
    VideoController localVideoController;
    do
    {
      return;
      localVideoController = new VideoController();
      localVideoController.zza(new bdg());
      if ((paramUnifiedNativeAdMapper != null) && (paramUnifiedNativeAdMapper.hasVideoContent())) {
        paramUnifiedNativeAdMapper.zza(localVideoController);
      }
    } while ((paramNativeAdMapper == null) || (!paramNativeAdMapper.hasVideoContent()));
    paramNativeAdMapper.zza(localVideoController);
  }
  
  public final NativeAdMapper a()
  {
    return this.b;
  }
  
  public final UnifiedNativeAdMapper b()
  {
    return this.c;
  }
  
  public final NativeCustomTemplateAd c()
  {
    return this.d;
  }
  
  public final void onAdClicked(MediationBannerAdapter paramMediationBannerAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdClicked.");
    try
    {
      this.a.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdClicked(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdClicked.");
    try
    {
      this.a.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdClicked(MediationNativeAdapter paramMediationNativeAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    NativeAdMapper localNativeAdMapper = this.b;
    UnifiedNativeAdMapper localUnifiedNativeAdMapper = this.c;
    if (this.d == null)
    {
      if ((localNativeAdMapper == null) && (localUnifiedNativeAdMapper == null))
      {
        mk.d("#007 Could not call remote method.", null);
        return;
      }
      if ((localUnifiedNativeAdMapper != null) && (!localUnifiedNativeAdMapper.getOverrideClickHandling()))
      {
        mk.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        return;
      }
      if ((localNativeAdMapper != null) && (!localNativeAdMapper.getOverrideClickHandling()))
      {
        mk.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        return;
      }
    }
    mk.b("Adapter called onAdClicked.");
    try
    {
      this.a.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdClosed(MediationBannerAdapter paramMediationBannerAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdClosed.");
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdClosed(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdClosed.");
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdClosed(MediationNativeAdapter paramMediationNativeAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdClosed.");
    try
    {
      this.a.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, int paramInt)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b(55 + "Adapter called onAdFailedToLoad with error. " + paramInt);
    try
    {
      this.a.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      this.a.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, int paramInt)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      this.a.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdImpression(MediationNativeAdapter paramMediationNativeAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    NativeAdMapper localNativeAdMapper = this.b;
    UnifiedNativeAdMapper localUnifiedNativeAdMapper = this.c;
    if (this.d == null)
    {
      if ((localNativeAdMapper == null) && (localUnifiedNativeAdMapper == null))
      {
        mk.d("#007 Could not call remote method.", null);
        return;
      }
      if ((localUnifiedNativeAdMapper != null) && (!localUnifiedNativeAdMapper.getOverrideImpressionRecording()))
      {
        mk.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        return;
      }
      if ((localNativeAdMapper != null) && (!localNativeAdMapper.getOverrideImpressionRecording()))
      {
        mk.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        return;
      }
    }
    mk.b("Adapter called onAdImpression.");
    try
    {
      this.a.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLeftApplication(MediationBannerAdapter paramMediationBannerAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLeftApplication.");
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLeftApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLeftApplication.");
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLeftApplication(MediationNativeAdapter paramMediationNativeAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLeftApplication.");
    try
    {
      this.a.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLoaded(MediationBannerAdapter paramMediationBannerAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLoaded.");
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLoaded(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLoaded.");
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLoaded(MediationNativeAdapter paramMediationNativeAdapter, NativeAdMapper paramNativeAdMapper)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLoaded.");
    this.b = paramNativeAdMapper;
    this.c = null;
    a(paramMediationNativeAdapter, this.c, this.b);
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdLoaded(MediationNativeAdapter paramMediationNativeAdapter, UnifiedNativeAdMapper paramUnifiedNativeAdMapper)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdLoaded.");
    this.c = paramUnifiedNativeAdMapper;
    this.b = null;
    a(paramMediationNativeAdapter, this.c, this.b);
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdOpened(MediationBannerAdapter paramMediationBannerAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdOpened.");
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdOpened(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdOpened.");
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAdOpened(MediationNativeAdapter paramMediationNativeAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAdOpened.");
    try
    {
      this.a.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onVideoEnd(MediationNativeAdapter paramMediationNativeAdapter)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onVideoEnd.");
    try
    {
      this.a.g();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zza(MediationBannerAdapter paramMediationBannerAdapter, String paramString1, String paramString2)
  {
    n.b("#008 Must be called on the main UI thread.");
    mk.b("Adapter called onAppEvent.");
    try
    {
      this.a.a(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zza(MediationNativeAdapter paramMediationNativeAdapter, NativeCustomTemplateAd paramNativeCustomTemplateAd)
  {
    n.b("#008 Must be called on the main UI thread.");
    String str1 = String.valueOf(paramNativeCustomTemplateAd.getCustomTemplateId());
    if (str1.length() != 0) {}
    for (String str2 = "Adapter called onAdLoaded with template id ".concat(str1);; str2 = new String("Adapter called onAdLoaded with template id "))
    {
      mk.b(str2);
      this.d = paramNativeCustomTemplateAd;
      try
      {
        this.a.e();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void zza(MediationNativeAdapter paramMediationNativeAdapter, NativeCustomTemplateAd paramNativeCustomTemplateAd, String paramString)
  {
    if ((paramNativeCustomTemplateAd instanceof avn)) {
      try
      {
        this.a.a(((avn)paramNativeCustomTemplateAd).a(), paramString);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
        return;
      }
    }
    mk.e("Unexpected native custom template ad type.");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdj
 * JD-Core Version:    0.7.0.1
 */