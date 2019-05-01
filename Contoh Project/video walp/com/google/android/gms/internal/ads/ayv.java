package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzw;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class ayv
  extends apk
{
  private final String a;
  private boolean b;
  private final axk c;
  private zzal d;
  private final aym e;
  
  public ayv(Context paramContext, String paramString, bck parambck, zzang paramzzang, zzw paramzzw)
  {
    this(paramString, new axk(paramContext, parambck, paramzzang, paramzzw));
  }
  
  private ayv(String paramString, axk paramaxk)
  {
    this.a = paramString;
    this.c = paramaxk;
    this.e = new aym();
    zzbv.zzex().a(paramaxk);
  }
  
  private final void a()
  {
    if (this.d != null) {
      return;
    }
    this.d = this.c.a(this.a);
    this.e.a(this.d);
  }
  
  public final void destroy()
  {
    if (this.d != null) {
      this.d.destroy();
    }
  }
  
  public final String getAdUnitId()
  {
    throw new IllegalStateException("getAdUnitId not implemented");
  }
  
  public final String getMediationAdapterClassName()
  {
    if (this.d != null) {
      return this.d.getMediationAdapterClassName();
    }
    return null;
  }
  
  public final aqg getVideoController()
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }
  
  public final boolean isLoading()
  {
    return (this.d != null) && (this.d.isLoading());
  }
  
  public final boolean isReady()
  {
    return (this.d != null) && (this.d.isReady());
  }
  
  public final void pause()
  {
    if (this.d != null) {
      this.d.pause();
    }
  }
  
  public final void resume()
  {
    if (this.d != null) {
      this.d.resume();
    }
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    a();
    if (this.d != null) {
      this.d.setManualImpressionsEnabled(paramBoolean);
    }
  }
  
  public final void setUserId(String paramString) {}
  
  public final void showInterstitial()
  {
    if (this.d != null)
    {
      this.d.setImmersiveMode(this.b);
      this.d.showInterstitial();
      return;
    }
    je.e("Interstitial ad must be loaded before showInterstitial().");
  }
  
  public final void stopLoading()
  {
    if (this.d != null) {
      this.d.stopLoading();
    }
  }
  
  public final void zza(af paramaf, String paramString)
  {
    je.e("setPlayStorePurchaseParams is deprecated and should not be called.");
  }
  
  public final void zza(aov paramaov)
  {
    this.e.e = paramaov;
    if (this.d != null) {
      this.e.a(this.d);
    }
  }
  
  public final void zza(aoy paramaoy)
  {
    this.e.a = paramaoy;
    if (this.d != null) {
      this.e.a(this.d);
    }
  }
  
  public final void zza(apo paramapo)
  {
    this.e.b = paramapo;
    if (this.d != null) {
      this.e.a(this.d);
    }
  }
  
  public final void zza(aps paramaps)
  {
    this.e.c = paramaps;
    if (this.d != null) {
      this.e.a(this.d);
    }
  }
  
  public final void zza(apy paramapy)
  {
    a();
    if (this.d != null) {
      this.d.zza(paramapy);
    }
  }
  
  public final void zza(asu paramasu)
  {
    this.e.d = paramasu;
    if (this.d != null) {
      this.e.a(this.d);
    }
  }
  
  public final void zza(gh paramgh)
  {
    this.e.f = paramgh;
    if (this.d != null) {
      this.e.a(this.d);
    }
  }
  
  public final void zza(y paramy)
  {
    je.e("setInAppPurchaseListener is deprecated and should not be called.");
  }
  
  public final void zza(zzjn paramzzjn)
  {
    if (this.d != null) {
      this.d.zza(paramzzjn);
    }
  }
  
  public final void zza(zzlu paramzzlu)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(zzmu paramzzmu)
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }
  
  public final boolean zzb(zzjj paramzzjj)
  {
    if (!ayp.a(paramzzjj).contains("gw")) {
      a();
    }
    if (ayp.a(paramzzjj).contains("_skipMediation")) {
      a();
    }
    if (paramzzjj.j != null) {
      a();
    }
    if (this.d != null) {
      return this.d.zzb(paramzzjj);
    }
    ayp localayp = zzbv.zzex();
    if (ayp.a(paramzzjj).contains("_ad")) {
      localayp.b(paramzzjj, this.a);
    }
    ays localays = localayp.a(paramzzjj, this.a);
    if (localays != null)
    {
      if (!localays.e)
      {
        localays.a();
        ayu.a().e();
      }
      for (;;)
      {
        this.d = localays.a;
        localays.c.a(this.e);
        this.e.a(this.d);
        return localays.f;
        ayu.a().d();
      }
    }
    a();
    ayu.a().e();
    return this.d.zzb(paramzzjj);
  }
  
  public final Bundle zzba()
  {
    if (this.d != null) {
      return this.d.zzba();
    }
    return new Bundle();
  }
  
  public final a zzbj()
  {
    if (this.d != null) {
      return this.d.zzbj();
    }
    return null;
  }
  
  public final zzjn zzbk()
  {
    if (this.d != null) {
      return this.d.zzbk();
    }
    return null;
  }
  
  public final void zzbm()
  {
    if (this.d != null)
    {
      this.d.zzbm();
      return;
    }
    je.e("Interstitial ad must be loaded before pingManualTrackingUrl().");
  }
  
  public final aps zzbw()
  {
    throw new IllegalStateException("getIAppEventListener not implemented");
  }
  
  public final aoy zzbx()
  {
    throw new IllegalStateException("getIAdListener not implemented");
  }
  
  public final String zzck()
  {
    if (this.d != null) {
      return this.d.zzck();
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayv
 * JD-Core Version:    0.7.0.1
 */