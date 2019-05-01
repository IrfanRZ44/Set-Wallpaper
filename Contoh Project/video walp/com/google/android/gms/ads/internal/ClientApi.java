package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.ab;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.ape;
import com.google.android.gms.internal.ads.apj;
import com.google.android.gms.internal.ads.apw;
import com.google.android.gms.internal.ads.aqb;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.aue;
import com.google.android.gms.internal.ads.aug;
import com.google.android.gms.internal.ads.aus;
import com.google.android.gms.internal.ads.aux;
import com.google.android.gms.internal.ads.ayv;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.fs;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.r;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
@Keep
@DynamiteApi
public class ClientApi
  extends apw
{
  public ape createAdLoaderBuilder(a parama, String paramString, bck parambck, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    zzbv.zzek();
    return new zzak(localContext, paramString, parambck, new zzang(12451000, paramInt, true, jn.k(localContext)), zzw.zzc(localContext));
  }
  
  public r createAdOverlay(a parama)
  {
    Activity localActivity = (Activity)b.a(parama);
    AdOverlayInfoParcel localAdOverlayInfoParcel = AdOverlayInfoParcel.zzc(localActivity.getIntent());
    if (localAdOverlayInfoParcel == null) {
      return new zzr(localActivity);
    }
    switch (localAdOverlayInfoParcel.zzbyu)
    {
    default: 
      return new zzr(localActivity);
    case 1: 
      return new zzq(localActivity);
    case 4: 
      return new zzs(localActivity, localAdOverlayInfoParcel);
    case 2: 
      return new zzx(localActivity);
    }
    return new com.google.android.gms.ads.internal.overlay.zzy(localActivity);
  }
  
  public apj createBannerAdManager(a parama, zzjn paramzzjn, String paramString, bck parambck, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    zzbv.zzek();
    return new zzy(localContext, paramzzjn, paramString, parambck, new zzang(12451000, paramInt, true, jn.k(localContext)), zzw.zzc(localContext));
  }
  
  public ab createInAppPurchaseManager(a parama)
  {
    return null;
  }
  
  public apj createInterstitialAdManager(a parama, zzjn paramzzjn, String paramString, bck parambck, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    asa.a(localContext);
    zzbv.zzek();
    zzang localzzang = new zzang(12451000, paramInt, true, jn.k(localContext));
    boolean bool = "reward_mb".equals(paramzzjn.a);
    if (!bool)
    {
      arq localarq2 = asa.aT;
      if (((Boolean)aos.f().a(localarq2)).booleanValue()) {}
    }
    else
    {
      if (!bool) {
        break label130;
      }
      arq localarq1 = asa.aU;
      if (!((Boolean)aos.f().a(localarq1)).booleanValue()) {
        break label130;
      }
    }
    label130:
    for (int i = 1; i != 0; i = 0) {
      return new ayv(localContext, paramString, parambck, localzzang, zzw.zzc(localContext));
    }
    return new zzal(localContext, paramzzjn, paramString, parambck, localzzang, zzw.zzc(localContext));
  }
  
  public aus createNativeAdViewDelegate(a parama1, a parama2)
  {
    return new aue((FrameLayout)b.a(parama1), (FrameLayout)b.a(parama2));
  }
  
  public aux createNativeAdViewHolderDelegate(a parama1, a parama2, a parama3)
  {
    return new aug((View)b.a(parama1), (HashMap)b.a(parama2), (HashMap)b.a(parama3));
  }
  
  public gb createRewardedVideoAd(a parama, bck parambck, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    zzbv.zzek();
    zzang localzzang = new zzang(12451000, paramInt, true, jn.k(localContext));
    return new fs(localContext, zzw.zzc(localContext), parambck, localzzang);
  }
  
  public apj createSearchAdManager(a parama, zzjn paramzzjn, String paramString, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    zzbv.zzek();
    return new zzbp(localContext, paramzzjn, paramString, new zzang(12451000, paramInt, true, jn.k(localContext)));
  }
  
  public aqb getMobileAdsSettingsManager(a parama)
  {
    return null;
  }
  
  public aqb getMobileAdsSettingsManagerWithClientJarVersion(a parama, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    zzbv.zzek();
    return zzay.zza(localContext, new zzang(12451000, paramInt, true, jn.k(localContext)));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ClientApi
 * JD-Core Version:    0.7.0.1
 */