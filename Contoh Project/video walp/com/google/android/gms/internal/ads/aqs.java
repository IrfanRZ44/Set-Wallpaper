package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.zza;

@cm
public final class aqs
{
  private final bcj a = new bcj();
  private final Context b;
  private final aoe c;
  private AdListener d;
  private anw e;
  private apj f;
  private String g;
  private zza h;
  private AppEventListener i;
  private OnCustomRenderedAdLoadedListener j;
  private Correlator k;
  private RewardedVideoAdListener l;
  private boolean m;
  private boolean n;
  
  public aqs(Context paramContext)
  {
    this(paramContext, aoe.a, null);
  }
  
  public aqs(Context paramContext, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this(paramContext, aoe.a, paramPublisherInterstitialAd);
  }
  
  private aqs(Context paramContext, aoe paramaoe, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this.b = paramContext;
    this.c = paramaoe;
  }
  
  private final void b(String paramString)
  {
    if (this.f == null) {
      throw new IllegalStateException(63 + String.valueOf(paramString).length() + "The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
    }
  }
  
  public final AdListener a()
  {
    return this.d;
  }
  
  public final void a(AdListener paramAdListener)
  {
    try
    {
      this.d = paramAdListener;
      apj localapj;
      if (this.f != null)
      {
        localapj = this.f;
        if (paramAdListener == null) {
          break label40;
        }
      }
      label40:
      for (any localany = new any(paramAdListener);; localany = null)
      {
        localapj.zza(localany);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(Correlator paramCorrelator)
  {
    this.k = paramCorrelator;
    try
    {
      if (this.f != null)
      {
        apj localapj = this.f;
        if (this.k == null) {}
        aot localaot;
        for (Object localObject = null;; localObject = localaot)
        {
          localapj.zza((apy)localObject);
          return;
          localaot = this.k.zzaz();
        }
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(AppEventListener paramAppEventListener)
  {
    try
    {
      this.i = paramAppEventListener;
      apj localapj;
      if (this.f != null)
      {
        localapj = this.f;
        if (paramAppEventListener == null) {
          break label40;
        }
      }
      label40:
      for (aog localaog = new aog(paramAppEventListener);; localaog = null)
      {
        localapj.zza(localaog);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    try
    {
      this.j = paramOnCustomRenderedAdLoadedListener;
      apj localapj;
      if (this.f != null)
      {
        localapj = this.f;
        if (paramOnCustomRenderedAdLoadedListener == null) {
          break label40;
        }
      }
      label40:
      for (asx localasx = new asx(paramOnCustomRenderedAdLoadedListener);; localasx = null)
      {
        localapj.zza(localasx);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    try
    {
      this.l = paramRewardedVideoAdListener;
      apj localapj;
      if (this.f != null)
      {
        localapj = this.f;
        if (paramRewardedVideoAdListener == null) {
          break label40;
        }
      }
      label40:
      for (gm localgm = new gm(paramRewardedVideoAdListener);; localgm = null)
      {
        localapj.zza(localgm);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(zza paramzza)
  {
    try
    {
      this.h = paramzza;
      apj localapj;
      if (this.f != null)
      {
        localapj = this.f;
        if (paramzza == null) {
          break label40;
        }
      }
      label40:
      for (aob localaob = new aob(paramzza);; localaob = null)
      {
        localapj.zza(localaob);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(anw paramanw)
  {
    try
    {
      this.e = paramanw;
      apj localapj;
      if (this.f != null)
      {
        localapj = this.f;
        if (paramanw == null) {
          break label40;
        }
      }
      label40:
      for (anx localanx = new anx(paramanw);; localanx = null)
      {
        localapj.zza(localanx);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(aqn paramaqn)
  {
    try
    {
      if (this.f == null)
      {
        if (this.g == null) {
          b("loadAd");
        }
        if (!this.m) {
          break label305;
        }
      }
      label305:
      for (zzjn localzzjn = zzjn.a();; localzzjn = new zzjn())
      {
        aoh localaoh = aos.b();
        Context localContext = this.b;
        this.f = ((apj)aoh.a(localContext, false, new aok(localaoh, localContext, localzzjn, this.g, this.a)));
        if (this.d != null) {
          this.f.zza(new any(this.d));
        }
        if (this.e != null) {
          this.f.zza(new anx(this.e));
        }
        if (this.h != null) {
          this.f.zza(new aob(this.h));
        }
        if (this.i != null) {
          this.f.zza(new aog(this.i));
        }
        if (this.j != null) {
          this.f.zza(new asx(this.j));
        }
        if (this.k != null) {
          this.f.zza(this.k.zzaz());
        }
        if (this.l != null) {
          this.f.zza(new gm(this.l));
        }
        this.f.setImmersiveMode(this.n);
        if (!this.f.zzb(aoe.a(this.b, paramaqn))) {
          break;
        }
        this.a.a(paramaqn.j());
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final void a(String paramString)
  {
    if (this.g != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }
    this.g = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.m = true;
  }
  
  public final String b()
  {
    return this.g;
  }
  
  public final void b(boolean paramBoolean)
  {
    try
    {
      this.n = paramBoolean;
      if (this.f != null) {
        this.f.setImmersiveMode(paramBoolean);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
  
  public final AppEventListener c()
  {
    return this.i;
  }
  
  public final OnCustomRenderedAdLoadedListener d()
  {
    return this.j;
  }
  
  public final boolean e()
  {
    try
    {
      if (this.f == null) {
        return false;
      }
      boolean bool = this.f.isReady();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
    return false;
  }
  
  public final boolean f()
  {
    try
    {
      if (this.f == null) {
        return false;
      }
      boolean bool = this.f.isLoading();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
    return false;
  }
  
  public final Bundle g()
  {
    try
    {
      if (this.f != null)
      {
        Bundle localBundle = this.f.zzba();
        return localBundle;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
    return new Bundle();
  }
  
  public final String h()
  {
    try
    {
      if (this.f != null)
      {
        String str = this.f.zzck();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
    return null;
  }
  
  public final void i()
  {
    try
    {
      b("show");
      this.f.showInterstitial();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#008 Must be called on the main UI thread.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqs
 * JD-Core Version:    0.7.0.1
 */