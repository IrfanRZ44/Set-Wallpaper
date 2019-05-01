package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.zzb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@cm
public final class bdn<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  extends bco
{
  private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
  private final NETWORK_EXTRAS b;
  
  public bdn(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> paramMediationAdapter, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    this.a = paramMediationAdapter;
    this.b = paramNETWORK_EXTRAS;
  }
  
  private final SERVER_PARAMETERS a(String paramString1, int paramInt, String paramString2)
  {
    HashMap localHashMap;
    if (paramString1 != null) {
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString1);
        localHashMap = new HashMap(localJSONObject.length());
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localHashMap.put(str, localJSONObject.getString(str));
          continue;
          localHashMap = new HashMap(0);
        }
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
    }
    Class localClass = this.a.getServerParametersType();
    MediationServerParameters localMediationServerParameters = null;
    if (localClass != null)
    {
      localMediationServerParameters = (MediationServerParameters)localClass.newInstance();
      localMediationServerParameters.load(localHashMap);
    }
    return localMediationServerParameters;
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
  
  public final void a(a parama) {}
  
  public final void a(a parama, hf paramhf, List<String> paramList) {}
  
  public final void a(a parama, zzjj paramzzjj, String paramString, bcq parambcq)
  {
    a(parama, paramzzjj, paramString, null, parambcq);
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, hf paramhf, String paramString2) {}
  
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
    try
    {
      ((MediationInterstitialAdapter)this.a).requestInterstitialAd(new bdo(parambcq), (Activity)b.a(parama), a(paramString1, paramzzjj.g, paramString2), beb.a(paramzzjj, a(paramzzjj)), this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.b("", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq, zzpl paramzzpl, List<String> paramList) {}
  
  public final void a(a parama, zzjn paramzzjn, zzjj paramzzjj, String paramString, bcq parambcq)
  {
    a(parama, paramzzjn, paramzzjj, paramString, null, parambcq);
  }
  
  public final void a(a parama, zzjn paramzzjn, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq)
  {
    int i = 0;
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
        bdo localbdo = new bdo(parambcq);
        Activity localActivity = (Activity)b.a(parama);
        MediationServerParameters localMediationServerParameters = a(paramString1, paramzzjj.g, paramString2);
        AdSize[] arrayOfAdSize = new AdSize[6];
        arrayOfAdSize[0] = AdSize.SMART_BANNER;
        arrayOfAdSize[1] = AdSize.BANNER;
        arrayOfAdSize[2] = AdSize.IAB_MRECT;
        arrayOfAdSize[3] = AdSize.IAB_BANNER;
        arrayOfAdSize[4] = AdSize.IAB_LEADERBOARD;
        arrayOfAdSize[5] = AdSize.IAB_WIDE_SKYSCRAPER;
        AdSize localAdSize;
        if (i < 6)
        {
          if ((arrayOfAdSize[i].getWidth() == paramzzjn.e) && (arrayOfAdSize[i].getHeight() == paramzzjn.b))
          {
            localAdSize = arrayOfAdSize[i];
            localMediationBannerAdapter.requestBannerAd(localbdo, localActivity, localMediationServerParameters, localAdSize, beb.a(paramzzjj, a(paramzzjj)), this.b);
          }
        }
        else
        {
          localAdSize = new AdSize(zzb.zza(paramzzjn.e, paramzzjn.b, paramzzjn.a));
          continue;
        }
        i++;
      }
      catch (Throwable localThrowable)
      {
        mk.b("", localThrowable);
        throw new RemoteException();
      }
    }
  }
  
  public final void a(zzjj paramzzjj, String paramString) {}
  
  public final void a(zzjj paramzzjj, String paramString1, String paramString2) {}
  
  public final void a(boolean paramBoolean) {}
  
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
      this.a.destroy();
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
    throw new RemoteException();
  }
  
  public final void e()
  {
    throw new RemoteException();
  }
  
  public final void f() {}
  
  public final boolean g()
  {
    return true;
  }
  
  public final bcw h()
  {
    return null;
  }
  
  public final bda i()
  {
    return null;
  }
  
  public final Bundle j()
  {
    return new Bundle();
  }
  
  public final Bundle k()
  {
    return new Bundle();
  }
  
  public final Bundle l()
  {
    return new Bundle();
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final avk n()
  {
    return null;
  }
  
  public final aqg o()
  {
    return null;
  }
  
  public final bdd p()
  {
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdn
 * JD-Core Version:    0.7.0.1
 */