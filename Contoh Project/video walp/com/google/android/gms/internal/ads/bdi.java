package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cm
public final class bdi
  extends bco
{
  private final MediationAdapter a;
  private bdj b;
  
  public bdi(MediationAdapter paramMediationAdapter)
  {
    this.a = paramMediationAdapter;
  }
  
  private final Bundle a(String paramString1, zzjj paramzzjj, String paramString2)
  {
    String str1 = String.valueOf(paramString1);
    String str2;
    if (str1.length() != 0) {
      str2 = "Server parameters: ".concat(str1);
    }
    Bundle localBundle;
    for (;;)
    {
      mk.e(str2);
      try
      {
        localObject = new Bundle();
        if (paramString1 == null) {
          break label141;
        }
        JSONObject localJSONObject = new JSONObject(paramString1);
        localBundle = new Bundle();
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str3 = (String)localIterator.next();
          localBundle.putString(str3, localJSONObject.getString(str3));
        }
        str2 = new String("Server parameters: ");
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
    }
    Object localObject = localBundle;
    label141:
    if ((this.a instanceof AdMobAdapter))
    {
      ((Bundle)localObject).putString("adJson", paramString2);
      if (paramzzjj != null) {
        ((Bundle)localObject).putInt("tagForChildDirectedTreatment", paramzzjj.g);
      }
    }
    return localObject;
  }
  
  private static boolean a(zzjj paramzzjj)
  {
    if (!paramzzjj.f) {
      aos.a();
    }
    return lz.a();
  }
  
  public final a a()
  {
    if (!(this.a instanceof MediationBannerAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationBannerAdapter: ".concat(str1);; str2 = new String("Not a MediationBannerAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    try
    {
      a locala = b.a(((MediationBannerAdapter)this.a).getBannerView());
      return locala;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void a(a parama)
  {
    try
    {
      Context localContext = (Context)b.a(parama);
      ((OnContextChangedListener)this.a).onContextChanged(localContext);
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.c("Failed", localThrowable);
    }
  }
  
  public final void a(a parama, hf paramhf, List<String> paramList)
  {
    if (!(this.a instanceof InitializableMediationRewardedVideoAdAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not an InitializableMediationRewardedVideoAdAdapter: ".concat(str1);; str2 = new String("Not an InitializableMediationRewardedVideoAdAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Initialize rewarded video adapter.");
    try
    {
      InitializableMediationRewardedVideoAdAdapter localInitializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter)this.a;
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(a((String)localIterator.next(), null, null));
      }
      localInitializableMediationRewardedVideoAdAdapter.initialize((Context)b.a(parama), new hi(paramhf), localArrayList);
    }
    catch (Throwable localThrowable)
    {
      mk.c("Could not initialize rewarded video adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString, bcq parambcq)
  {
    a(parama, paramzzjj, paramString, null, parambcq);
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, hf paramhf, String paramString2)
  {
    if (!(this.a instanceof MediationRewardedVideoAdAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationRewardedVideoAdAdapter: ".concat(str1);; str2 = new String("Not a MediationRewardedVideoAdAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Initialize rewarded video adapter.");
    for (;;)
    {
      try
      {
        MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.a;
        Bundle localBundle1 = a(paramString2, paramzzjj, null);
        if (paramzzjj == null) {
          break label266;
        }
        if (paramzzjj.e == null) {
          break label275;
        }
        localHashSet = new HashSet(paramzzjj.e);
        Date localDate;
        bdh localbdh1;
        if (paramzzjj.b == -1L)
        {
          localDate = null;
          localbdh1 = new bdh(localDate, paramzzjj.d, localHashSet, paramzzjj.k, a(paramzzjj), paramzzjj.g, paramzzjj.r);
          if (paramzzjj.m != null)
          {
            localBundle2 = paramzzjj.m.getBundle(localMediationRewardedVideoAdAdapter.getClass().getName());
            localbdh2 = localbdh1;
            localMediationRewardedVideoAdAdapter.initialize((Context)b.a(parama), localbdh2, paramString1, new hi(paramhf), localBundle1, localBundle2);
          }
        }
        else
        {
          localDate = new Date(paramzzjj.b);
          continue;
        }
        localbdh2 = localbdh1;
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
      Bundle localBundle2 = null;
      continue;
      label266:
      bdh localbdh2 = null;
      localBundle2 = null;
      continue;
      label275:
      HashSet localHashSet = null;
    }
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq)
  {
    if (!(this.a instanceof MediationInterstitialAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationInterstitialAdapter: ".concat(str1);; str2 = new String("Not a MediationInterstitialAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Requesting interstitial ad from adapter.");
    for (;;)
    {
      try
      {
        MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)this.a;
        if (paramzzjj.e == null) {
          break label249;
        }
        localHashSet = new HashSet(paramzzjj.e);
        Date localDate;
        if (paramzzjj.b == -1L)
        {
          localDate = null;
          bdh localbdh = new bdh(localDate, paramzzjj.d, localHashSet, paramzzjj.k, a(paramzzjj), paramzzjj.g, paramzzjj.r);
          if (paramzzjj.m != null)
          {
            localBundle = paramzzjj.m.getBundle(localMediationInterstitialAdapter.getClass().getName());
            localMediationInterstitialAdapter.requestInterstitialAd((Context)b.a(parama), new bdj(parambcq), a(paramString1, paramzzjj, paramString2), localbdh, localBundle);
          }
        }
        else
        {
          localDate = new Date(paramzzjj.b);
          continue;
        }
        Bundle localBundle = null;
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
      continue;
      label249:
      HashSet localHashSet = null;
    }
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq, zzpl paramzzpl, List<String> paramList)
  {
    if (!(this.a instanceof MediationNativeAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationNativeAdapter: ".concat(str1);; str2 = new String("Not a MediationNativeAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    for (;;)
    {
      try
      {
        MediationNativeAdapter localMediationNativeAdapter = (MediationNativeAdapter)this.a;
        if (paramzzjj.e == null) {
          break label258;
        }
        localHashSet = new HashSet(paramzzjj.e);
        Date localDate;
        if (paramzzjj.b == -1L)
        {
          localDate = null;
          bdm localbdm = new bdm(localDate, paramzzjj.d, localHashSet, paramzzjj.k, a(paramzzjj), paramzzjj.g, paramzzpl, paramList, paramzzjj.r);
          if (paramzzjj.m != null)
          {
            localBundle = paramzzjj.m.getBundle(localMediationNativeAdapter.getClass().getName());
            this.b = new bdj(parambcq);
            localMediationNativeAdapter.requestNativeAd((Context)b.a(parama), this.b, a(paramString1, paramzzjj, paramString2), localbdm, localBundle);
          }
        }
        else
        {
          localDate = new Date(paramzzjj.b);
          continue;
        }
        Bundle localBundle = null;
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
      continue;
      label258:
      HashSet localHashSet = null;
    }
  }
  
  public final void a(a parama, zzjn paramzzjn, zzjj paramzzjj, String paramString, bcq parambcq)
  {
    a(parama, paramzzjn, paramzzjj, paramString, null, parambcq);
  }
  
  public final void a(a parama, zzjn paramzzjn, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq)
  {
    if (!(this.a instanceof MediationBannerAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationBannerAdapter: ".concat(str1);; str2 = new String("Not a MediationBannerAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Requesting banner ad from adapter.");
    for (;;)
    {
      try
      {
        MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)this.a;
        if (paramzzjj.e == null) {
          break label266;
        }
        localHashSet = new HashSet(paramzzjj.e);
        Date localDate;
        if (paramzzjj.b == -1L)
        {
          localDate = null;
          bdh localbdh = new bdh(localDate, paramzzjj.d, localHashSet, paramzzjj.k, a(paramzzjj), paramzzjj.g, paramzzjj.r);
          if (paramzzjj.m != null)
          {
            localBundle = paramzzjj.m.getBundle(localMediationBannerAdapter.getClass().getName());
            localMediationBannerAdapter.requestBannerAd((Context)b.a(parama), new bdj(parambcq), a(paramString1, paramzzjj, paramString2), zzb.zza(paramzzjn.e, paramzzjn.b, paramzzjn.a), localbdh, localBundle);
          }
        }
        else
        {
          localDate = new Date(paramzzjj.b);
          continue;
        }
        Bundle localBundle = null;
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
      continue;
      label266:
      HashSet localHashSet = null;
    }
  }
  
  public final void a(zzjj paramzzjj, String paramString)
  {
    a(paramzzjj, paramString, null);
  }
  
  public final void a(zzjj paramzzjj, String paramString1, String paramString2)
  {
    if (!(this.a instanceof MediationRewardedVideoAdAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationRewardedVideoAdAdapter: ".concat(str1);; str2 = new String("Not a MediationRewardedVideoAdAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Requesting rewarded video ad from adapter.");
    for (;;)
    {
      try
      {
        MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.a;
        if (paramzzjj.e == null) {
          break label233;
        }
        localHashSet = new HashSet(paramzzjj.e);
        Date localDate;
        if (paramzzjj.b == -1L)
        {
          localDate = null;
          bdh localbdh = new bdh(localDate, paramzzjj.d, localHashSet, paramzzjj.k, a(paramzzjj), paramzzjj.g, paramzzjj.r);
          if (paramzzjj.m != null)
          {
            localBundle = paramzzjj.m.getBundle(localMediationRewardedVideoAdAdapter.getClass().getName());
            localMediationRewardedVideoAdAdapter.loadAd(localbdh, a(paramString1, paramzzjj, paramString2), localBundle);
          }
        }
        else
        {
          localDate = new Date(paramzzjj.b);
          continue;
        }
        Bundle localBundle = null;
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
      continue;
      label233:
      HashSet localHashSet = null;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!(this.a instanceof OnImmersiveModeUpdatedListener))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not an OnImmersiveModeUpdatedListener: ".concat(str1);; str2 = new String("Not an OnImmersiveModeUpdatedListener: "))
      {
        mk.d(str2);
        return;
      }
    }
    try
    {
      ((OnImmersiveModeUpdatedListener)this.a).onImmersiveModeUpdated(paramBoolean);
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
    }
  }
  
  public final void b()
  {
    if (!(this.a instanceof MediationInterstitialAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationInterstitialAdapter: ".concat(str1);; str2 = new String("Not a MediationInterstitialAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.a).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void c()
  {
    try
    {
      this.a.onDestroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void d()
  {
    try
    {
      this.a.onPause();
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void e()
  {
    try
    {
      this.a.onResume();
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void f()
  {
    if (!(this.a instanceof MediationRewardedVideoAdAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationRewardedVideoAdAdapter: ".concat(str1);; str2 = new String("Not a MediationRewardedVideoAdAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Show rewarded video ad from adapter.");
    try
    {
      ((MediationRewardedVideoAdAdapter)this.a).showVideo();
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final boolean g()
  {
    if (!(this.a instanceof MediationRewardedVideoAdAdapter))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a MediationRewardedVideoAdAdapter: ".concat(str1);; str2 = new String("Not a MediationRewardedVideoAdAdapter: "))
      {
        mk.e(str2);
        throw new RemoteException();
      }
    }
    mk.b("Check if adapter is initialized.");
    try
    {
      boolean bool = ((MediationRewardedVideoAdAdapter)this.a).isInitialized();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final bcw h()
  {
    NativeAdMapper localNativeAdMapper = this.b.a();
    if ((localNativeAdMapper instanceof NativeAppInstallAdMapper)) {
      return new bdk((NativeAppInstallAdMapper)localNativeAdMapper);
    }
    return null;
  }
  
  public final bda i()
  {
    NativeAdMapper localNativeAdMapper = this.b.a();
    if ((localNativeAdMapper instanceof NativeContentAdMapper)) {
      return new bdl((NativeContentAdMapper)localNativeAdMapper);
    }
    return null;
  }
  
  public final Bundle j()
  {
    if (!(this.a instanceof zzatl))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a v2 MediationBannerAdapter: ".concat(str1);; str2 = new String("Not a v2 MediationBannerAdapter: "))
      {
        mk.e(str2);
        return new Bundle();
      }
    }
    return ((zzatl)this.a).zzmq();
  }
  
  public final Bundle k()
  {
    if (!(this.a instanceof zzatm))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0) {}
      for (String str2 = "Not a v2 MediationInterstitialAdapter: ".concat(str1);; str2 = new String("Not a v2 MediationInterstitialAdapter: "))
      {
        mk.e(str2);
        return new Bundle();
      }
    }
    return ((zzatm)this.a).getInterstitialAdapterInfo();
  }
  
  public final Bundle l()
  {
    return new Bundle();
  }
  
  public final boolean m()
  {
    return this.a instanceof InitializableMediationRewardedVideoAdAdapter;
  }
  
  public final avk n()
  {
    NativeCustomTemplateAd localNativeCustomTemplateAd = this.b.c();
    if ((localNativeCustomTemplateAd instanceof avn)) {
      return ((avn)localNativeCustomTemplateAd).a();
    }
    return null;
  }
  
  public final aqg o()
  {
    if (!(this.a instanceof zza)) {
      return null;
    }
    try
    {
      aqg localaqg = ((zza)this.a).getVideoController();
      return localaqg;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
    }
    return null;
  }
  
  public final bdd p()
  {
    UnifiedNativeAdMapper localUnifiedNativeAdMapper = this.b.b();
    if (localUnifiedNativeAdMapper != null) {
      return new bed(localUnifiedNativeAdMapper);
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdi
 * JD-Core Version:    0.7.0.1
 */