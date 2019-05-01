package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aqg;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.lz;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.zzatm;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

@cm
public abstract class AbstractAdViewAdapter
  implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza, MediationRewardedVideoAdAdapter, zzatm
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  private AdView zzgw;
  private InterstitialAd zzgx;
  private AdLoader zzgy;
  private Context zzgz;
  private InterstitialAd zzha;
  private MediationRewardedVideoAdListener zzhb;
  private final RewardedVideoAdListener zzhc = new a(this);
  
  private final AdRequest zza(Context paramContext, MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    Date localDate = paramMediationAdRequest.getBirthday();
    if (localDate != null) {
      localBuilder.setBirthday(localDate);
    }
    int i = paramMediationAdRequest.getGender();
    if (i != 0) {
      localBuilder.setGender(i);
    }
    Set localSet = paramMediationAdRequest.getKeywords();
    if (localSet != null)
    {
      Iterator localIterator = localSet.iterator();
      while (localIterator.hasNext()) {
        localBuilder.addKeyword((String)localIterator.next());
      }
    }
    Location localLocation = paramMediationAdRequest.getLocation();
    if (localLocation != null) {
      localBuilder.setLocation(localLocation);
    }
    if (paramMediationAdRequest.isTesting())
    {
      aos.a();
      localBuilder.addTestDevice(lz.a(paramContext));
    }
    if (paramMediationAdRequest.taggedForChildDirectedTreatment() != -1) {
      if (paramMediationAdRequest.taggedForChildDirectedTreatment() != 1) {
        break label210;
      }
    }
    label210:
    for (boolean bool = true;; bool = false)
    {
      localBuilder.tagForChildDirectedTreatment(bool);
      localBuilder.setIsDesignedForFamilies(paramMediationAdRequest.isDesignedForFamilies());
      localBuilder.addNetworkExtrasBundle(AdMobAdapter.class, zza(paramBundle1, paramBundle2));
      return localBuilder.build();
    }
  }
  
  public String getAdUnitId(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView()
  {
    return this.zzgw;
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    return new MediationAdapter.zza().zzaj(1).zzvx();
  }
  
  public aqg getVideoController()
  {
    if (this.zzgw != null)
    {
      VideoController localVideoController = this.zzgw.getVideoController();
      if (localVideoController != null) {
        return localVideoController.zzbc();
      }
    }
    return null;
  }
  
  public void initialize(Context paramContext, MediationAdRequest paramMediationAdRequest, String paramString, MediationRewardedVideoAdListener paramMediationRewardedVideoAdListener, Bundle paramBundle1, Bundle paramBundle2)
  {
    this.zzgz = paramContext.getApplicationContext();
    this.zzhb = paramMediationRewardedVideoAdListener;
    this.zzhb.onInitializationSucceeded(this);
  }
  
  public boolean isInitialized()
  {
    return this.zzhb != null;
  }
  
  public void loadAd(MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((this.zzgz == null) || (this.zzhb == null))
    {
      mk.c("AdMobAdapter.loadAd called before initialize.");
      return;
    }
    this.zzha = new InterstitialAd(this.zzgz);
    this.zzha.zza(true);
    this.zzha.setAdUnitId(getAdUnitId(paramBundle1));
    this.zzha.setRewardedVideoAdListener(this.zzhc);
    this.zzha.zza(new b(this));
    this.zzha.loadAd(zza(this.zzgz, paramMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void onDestroy()
  {
    if (this.zzgw != null)
    {
      this.zzgw.destroy();
      this.zzgw = null;
    }
    if (this.zzgx != null) {
      this.zzgx = null;
    }
    if (this.zzgy != null) {
      this.zzgy = null;
    }
    if (this.zzha != null) {
      this.zzha = null;
    }
  }
  
  public void onImmersiveModeUpdated(boolean paramBoolean)
  {
    if (this.zzgx != null) {
      this.zzgx.setImmersiveMode(paramBoolean);
    }
    if (this.zzha != null) {
      this.zzha.setImmersiveMode(paramBoolean);
    }
  }
  
  public void onPause()
  {
    if (this.zzgw != null) {
      this.zzgw.pause();
    }
  }
  
  public void onResume()
  {
    if (this.zzgw != null) {
      this.zzgw.resume();
    }
  }
  
  public void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.zzgw = new AdView(paramContext);
    this.zzgw.setAdSize(new AdSize(paramAdSize.getWidth(), paramAdSize.getHeight()));
    this.zzgw.setAdUnitId(getAdUnitId(paramBundle1));
    this.zzgw.setAdListener(new d(this, paramMediationBannerListener));
    this.zzgw.loadAd(zza(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.zzgx = new InterstitialAd(paramContext);
    this.zzgx.setAdUnitId(getAdUnitId(paramBundle1));
    this.zzgx.setAdListener(new e(this, paramMediationInterstitialListener));
    this.zzgx.loadAd(zza(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    f localf1 = new f(this, paramMediationNativeListener);
    AdLoader.Builder localBuilder = new AdLoader.Builder(paramContext, paramBundle1.getString("pubid")).withAdListener(localf1);
    NativeAdOptions localNativeAdOptions = paramNativeMediationAdRequest.getNativeAdOptions();
    if (localNativeAdOptions != null) {
      localBuilder.withNativeAdOptions(localNativeAdOptions);
    }
    if (paramNativeMediationAdRequest.isUnifiedNativeAdRequested()) {
      localBuilder.forUnifiedNativeAd(localf1);
    }
    if (paramNativeMediationAdRequest.isAppInstallAdRequested()) {
      localBuilder.forAppInstallAd(localf1);
    }
    if (paramNativeMediationAdRequest.isContentAdRequested()) {
      localBuilder.forContentAd(localf1);
    }
    if (paramNativeMediationAdRequest.zzna())
    {
      Iterator localIterator = paramNativeMediationAdRequest.zznb().keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (((Boolean)paramNativeMediationAdRequest.zznb().get(str)).booleanValue()) {}
        for (f localf2 = localf1;; localf2 = null)
        {
          localBuilder.forCustomTemplateAd(str, localf1, localf2);
          break;
        }
      }
    }
    this.zzgy = localBuilder.build();
    this.zzgy.loadAd(zza(paramContext, paramNativeMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void showInterstitial()
  {
    this.zzgx.show();
  }
  
  public void showVideo()
  {
    this.zzha.show();
  }
  
  protected abstract Bundle zza(Bundle paramBundle1, Bundle paramBundle2);
  
  static final class a
    extends NativeAppInstallAdMapper
  {
    private final NativeAppInstallAd a;
    
    public a(NativeAppInstallAd paramNativeAppInstallAd)
    {
      this.a = paramNativeAppInstallAd;
      setHeadline(paramNativeAppInstallAd.getHeadline().toString());
      setImages(paramNativeAppInstallAd.getImages());
      setBody(paramNativeAppInstallAd.getBody().toString());
      setIcon(paramNativeAppInstallAd.getIcon());
      setCallToAction(paramNativeAppInstallAd.getCallToAction().toString());
      if (paramNativeAppInstallAd.getStarRating() != null) {
        setStarRating(paramNativeAppInstallAd.getStarRating().doubleValue());
      }
      if (paramNativeAppInstallAd.getStore() != null) {
        setStore(paramNativeAppInstallAd.getStore().toString());
      }
      if (paramNativeAppInstallAd.getPrice() != null) {
        setPrice(paramNativeAppInstallAd.getPrice().toString());
      }
      setOverrideImpressionRecording(true);
      setOverrideClickHandling(true);
      zza(paramNativeAppInstallAd.getVideoController());
    }
    
    public final void trackView(View paramView)
    {
      if ((paramView instanceof NativeAdView)) {
        ((NativeAdView)paramView).setNativeAd(this.a);
      }
      NativeAdViewHolder localNativeAdViewHolder = (NativeAdViewHolder)NativeAdViewHolder.zzvk.get(paramView);
      if (localNativeAdViewHolder != null) {
        localNativeAdViewHolder.setNativeAd(this.a);
      }
    }
  }
  
  static final class b
    extends NativeContentAdMapper
  {
    private final NativeContentAd a;
    
    public b(NativeContentAd paramNativeContentAd)
    {
      this.a = paramNativeContentAd;
      setHeadline(paramNativeContentAd.getHeadline().toString());
      setImages(paramNativeContentAd.getImages());
      setBody(paramNativeContentAd.getBody().toString());
      if (paramNativeContentAd.getLogo() != null) {
        setLogo(paramNativeContentAd.getLogo());
      }
      setCallToAction(paramNativeContentAd.getCallToAction().toString());
      setAdvertiser(paramNativeContentAd.getAdvertiser().toString());
      setOverrideImpressionRecording(true);
      setOverrideClickHandling(true);
      zza(paramNativeContentAd.getVideoController());
    }
    
    public final void trackView(View paramView)
    {
      if ((paramView instanceof NativeAdView)) {
        ((NativeAdView)paramView).setNativeAd(this.a);
      }
      NativeAdViewHolder localNativeAdViewHolder = (NativeAdViewHolder)NativeAdViewHolder.zzvk.get(paramView);
      if (localNativeAdViewHolder != null) {
        localNativeAdViewHolder.setNativeAd(this.a);
      }
    }
  }
  
  static final class c
    extends UnifiedNativeAdMapper
  {
    private final UnifiedNativeAd a;
    
    public c(UnifiedNativeAd paramUnifiedNativeAd)
    {
      this.a = paramUnifiedNativeAd;
      setHeadline(paramUnifiedNativeAd.getHeadline());
      setImages(paramUnifiedNativeAd.getImages());
      setBody(paramUnifiedNativeAd.getBody());
      setIcon(paramUnifiedNativeAd.getIcon());
      setCallToAction(paramUnifiedNativeAd.getCallToAction());
      setAdvertiser(paramUnifiedNativeAd.getAdvertiser());
      setStarRating(paramUnifiedNativeAd.getStarRating());
      setStore(paramUnifiedNativeAd.getStore());
      setPrice(paramUnifiedNativeAd.getPrice());
      zzl(paramUnifiedNativeAd.zzbh());
      setOverrideImpressionRecording(true);
      setOverrideClickHandling(true);
      zza(paramUnifiedNativeAd.getVideoController());
    }
    
    public final void trackViews(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2)
    {
      if ((paramView instanceof UnifiedNativeAdView)) {
        ((UnifiedNativeAdView)paramView).setNativeAd(this.a);
      }
      NativeAdViewHolder localNativeAdViewHolder;
      do
      {
        return;
        localNativeAdViewHolder = (NativeAdViewHolder)NativeAdViewHolder.zzvk.get(paramView);
      } while (localNativeAdViewHolder == null);
      localNativeAdViewHolder.setNativeAd(this.a);
    }
  }
  
  static final class d
    extends AdListener
    implements AppEventListener, anw
  {
    private final AbstractAdViewAdapter a;
    private final MediationBannerListener b;
    
    public d(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationBannerListener paramMediationBannerListener)
    {
      this.a = paramAbstractAdViewAdapter;
      this.b = paramMediationBannerListener;
    }
    
    public final void onAdClicked()
    {
      this.b.onAdClicked(this.a);
    }
    
    public final void onAdClosed()
    {
      this.b.onAdClosed(this.a);
    }
    
    public final void onAdFailedToLoad(int paramInt)
    {
      this.b.onAdFailedToLoad(this.a, paramInt);
    }
    
    public final void onAdLeftApplication()
    {
      this.b.onAdLeftApplication(this.a);
    }
    
    public final void onAdLoaded()
    {
      this.b.onAdLoaded(this.a);
    }
    
    public final void onAdOpened()
    {
      this.b.onAdOpened(this.a);
    }
    
    public final void onAppEvent(String paramString1, String paramString2)
    {
      this.b.zza(this.a, paramString1, paramString2);
    }
  }
  
  static final class e
    extends AdListener
    implements anw
  {
    private final AbstractAdViewAdapter a;
    private final MediationInterstitialListener b;
    
    public e(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationInterstitialListener paramMediationInterstitialListener)
    {
      this.a = paramAbstractAdViewAdapter;
      this.b = paramMediationInterstitialListener;
    }
    
    public final void onAdClicked()
    {
      this.b.onAdClicked(this.a);
    }
    
    public final void onAdClosed()
    {
      this.b.onAdClosed(this.a);
    }
    
    public final void onAdFailedToLoad(int paramInt)
    {
      this.b.onAdFailedToLoad(this.a, paramInt);
    }
    
    public final void onAdLeftApplication()
    {
      this.b.onAdLeftApplication(this.a);
    }
    
    public final void onAdLoaded()
    {
      this.b.onAdLoaded(this.a);
    }
    
    public final void onAdOpened()
    {
      this.b.onAdOpened(this.a);
    }
  }
  
  static final class f
    extends AdListener
    implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
  {
    private final AbstractAdViewAdapter a;
    private final MediationNativeListener b;
    
    public f(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationNativeListener paramMediationNativeListener)
    {
      this.a = paramAbstractAdViewAdapter;
      this.b = paramMediationNativeListener;
    }
    
    public final void onAdClicked()
    {
      this.b.onAdClicked(this.a);
    }
    
    public final void onAdClosed()
    {
      this.b.onAdClosed(this.a);
    }
    
    public final void onAdFailedToLoad(int paramInt)
    {
      this.b.onAdFailedToLoad(this.a, paramInt);
    }
    
    public final void onAdImpression()
    {
      this.b.onAdImpression(this.a);
    }
    
    public final void onAdLeftApplication()
    {
      this.b.onAdLeftApplication(this.a);
    }
    
    public final void onAdLoaded() {}
    
    public final void onAdOpened()
    {
      this.b.onAdOpened(this.a);
    }
    
    public final void onAppInstallAdLoaded(NativeAppInstallAd paramNativeAppInstallAd)
    {
      this.b.onAdLoaded(this.a, new AbstractAdViewAdapter.a(paramNativeAppInstallAd));
    }
    
    public final void onContentAdLoaded(NativeContentAd paramNativeContentAd)
    {
      this.b.onAdLoaded(this.a, new AbstractAdViewAdapter.b(paramNativeContentAd));
    }
    
    public final void onCustomClick(NativeCustomTemplateAd paramNativeCustomTemplateAd, String paramString)
    {
      this.b.zza(this.a, paramNativeCustomTemplateAd, paramString);
    }
    
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd paramNativeCustomTemplateAd)
    {
      this.b.zza(this.a, paramNativeCustomTemplateAd);
    }
    
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd paramUnifiedNativeAd)
    {
      this.b.onAdLoaded(this.a, new AbstractAdViewAdapter.c(paramUnifiedNativeAd));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.AbstractAdViewAdapter
 * JD-Core Version:    0.7.0.1
 */