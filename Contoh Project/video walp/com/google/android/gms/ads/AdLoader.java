package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.any;
import com.google.android.gms.internal.ads.aoe;
import com.google.android.gms.internal.ads.aoh;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.apb;
import com.google.android.gms.internal.ads.ape;
import com.google.android.gms.internal.ads.aqn;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.awq;
import com.google.android.gms.internal.ads.awr;
import com.google.android.gms.internal.ads.aws;
import com.google.android.gms.internal.ads.awu;
import com.google.android.gms.internal.ads.awv;
import com.google.android.gms.internal.ads.awx;
import com.google.android.gms.internal.ads.bcj;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;

public class AdLoader
{
  private final aoe a;
  private final Context b;
  private final apb c;
  
  AdLoader(Context paramContext, apb paramapb)
  {
    this(paramContext, paramapb, aoe.a);
  }
  
  private AdLoader(Context paramContext, apb paramapb, aoe paramaoe)
  {
    this.b = paramContext;
    this.c = paramapb;
    this.a = paramaoe;
  }
  
  private final void a(aqn paramaqn)
  {
    try
    {
      this.c.zzd(aoe.a(this.b, paramaqn));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Failed to load ad.", localRemoteException);
    }
  }
  
  @Deprecated
  public String getMediationAdapterClassName()
  {
    try
    {
      String str = this.c.zzck();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }
  
  public boolean isLoading()
  {
    try
    {
      boolean bool = this.c.isLoading();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    a(paramAdRequest.zzay());
  }
  
  public void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    a(paramPublisherAdRequest.zzay());
  }
  
  public void loadAds(AdRequest paramAdRequest, int paramInt)
  {
    aqn localaqn = paramAdRequest.zzay();
    try
    {
      this.c.zza(aoe.a(this.b, localaqn), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Failed to load ads.", localRemoteException);
    }
  }
  
  public static class Builder
  {
    private final Context a;
    private final ape b;
    
    private Builder(Context paramContext, ape paramape)
    {
      this.a = paramContext;
      this.b = paramape;
    }
    
    public Builder(Context paramContext, String paramString)
    {
      this((Context)n.a(paramContext, "context cannot be null"), aos.b().a(paramContext, paramString, new bcj()));
    }
    
    public AdLoader build()
    {
      try
      {
        AdLoader localAdLoader = new AdLoader(this.a, this.b.zzdh());
        return localAdLoader;
      }
      catch (RemoteException localRemoteException)
      {
        mk.b("Failed to build AdLoader.", localRemoteException);
      }
      return null;
    }
    
    public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener paramOnAppInstallAdLoadedListener)
    {
      try
      {
        this.b.zza(new awq(paramOnAppInstallAdLoadedListener));
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to add app install ad listener", localRemoteException);
      }
      return this;
    }
    
    public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener paramOnContentAdLoadedListener)
    {
      try
      {
        this.b.zza(new awr(paramOnContentAdLoadedListener));
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to add content ad listener", localRemoteException);
      }
      return this;
    }
    
    public Builder forCustomTemplateAd(String paramString, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
    {
      try
      {
        ape localape = this.b;
        awu localawu = new awu(paramOnCustomTemplateAdLoadedListener);
        if (paramOnCustomClickListener == null) {}
        for (Object localObject = null;; localObject = new aws(paramOnCustomClickListener))
        {
          localape.zza(paramString, localawu, (avv)localObject);
          return this;
        }
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to add custom template ad listener", localRemoteException);
      }
    }
    
    public Builder forPublisherAdView(OnPublisherAdViewLoadedListener paramOnPublisherAdViewLoadedListener, AdSize... paramVarArgs)
    {
      if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
      }
      try
      {
        zzjn localzzjn = new zzjn(this.a, paramVarArgs);
        this.b.zza(new awv(paramOnPublisherAdViewLoadedListener), localzzjn);
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to add publisher banner ad listener", localRemoteException);
      }
      return this;
    }
    
    public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener paramOnUnifiedNativeAdLoadedListener)
    {
      try
      {
        this.b.zza(new awx(paramOnUnifiedNativeAdLoadedListener));
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to add google native ad listener", localRemoteException);
      }
      return this;
    }
    
    public Builder withAdListener(AdListener paramAdListener)
    {
      try
      {
        this.b.zzb(new any(paramAdListener));
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to set AdListener.", localRemoteException);
      }
      return this;
    }
    
    public Builder withCorrelator(Correlator paramCorrelator)
    {
      n.a(paramCorrelator);
      try
      {
        this.b.zzb(paramCorrelator.a);
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to set correlator.", localRemoteException);
      }
      return this;
    }
    
    public Builder withNativeAdOptions(NativeAdOptions paramNativeAdOptions)
    {
      try
      {
        this.b.zza(new zzpl(paramNativeAdOptions));
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to specify native ad options", localRemoteException);
      }
      return this;
    }
    
    public Builder withPublisherAdViewOptions(PublisherAdViewOptions paramPublisherAdViewOptions)
    {
      try
      {
        this.b.zza(paramPublisherAdViewOptions);
        return this;
      }
      catch (RemoteException localRemoteException)
      {
        mk.c("Failed to specify DFP banner ad options", localRemoteException);
      }
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdLoader
 * JD-Core Version:    0.7.0.1
 */