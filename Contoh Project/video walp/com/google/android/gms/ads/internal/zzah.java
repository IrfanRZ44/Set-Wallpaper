package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.f.m;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aoy;
import com.google.android.gms.internal.ads.apc;
import com.google.android.gms.internal.ads.apy;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.avo;
import com.google.android.gms.internal.ads.avr;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.awb;
import com.google.android.gms.internal.ads.awe;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzah
  extends apc
{
  private final Context a;
  private final aoy b;
  private final bck c;
  private final avo d;
  private final awe e;
  private final avr f;
  private final awb g;
  private final zzjn h;
  private final PublisherAdViewOptions i;
  private final m<String, avy> j;
  private final m<String, avv> k;
  private final zzpl l;
  private final List<String> m;
  private final apy n;
  private final String o;
  private final zzang p;
  private WeakReference<zzd> q;
  private final zzw r;
  private final Object s = new Object();
  
  zzah(Context paramContext, String paramString, bck parambck, zzang paramzzang, aoy paramaoy, avo paramavo, awe paramawe, avr paramavr, m<String, avy> paramm, m<String, avv> paramm1, zzpl paramzzpl, apy paramapy, zzw paramzzw, awb paramawb, zzjn paramzzjn, PublisherAdViewOptions paramPublisherAdViewOptions)
  {
    this.a = paramContext;
    this.o = paramString;
    this.c = parambck;
    this.p = paramzzang;
    this.b = paramaoy;
    this.f = paramavr;
    this.d = paramavo;
    this.e = paramawe;
    this.j = paramm;
    this.k = paramm1;
    this.l = paramzzpl;
    this.m = c();
    this.n = paramapy;
    this.r = paramzzw;
    this.g = paramawb;
    this.h = paramzzjn;
    this.i = paramPublisherAdViewOptions;
    asa.a(this.a);
  }
  
  private final void a(int paramInt)
  {
    if (this.b != null) {}
    try
    {
      this.b.a(0);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.c("Failed calling onAdFailedToLoad.", localRemoteException);
    }
  }
  
  private final void a(zzjj paramzzjj)
  {
    arq localarq = asa.cl;
    if ((!((Boolean)aos.f().a(localarq)).booleanValue()) && (this.e != null))
    {
      a(0);
      return;
    }
    zzq localzzq = new zzq(this.a, this.r, this.h, this.o, this.c, this.p);
    this.q = new WeakReference(localzzq);
    awb localawb = this.g;
    n.b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
    localzzq.e.q = localawb;
    if (this.i != null)
    {
      if (this.i.zzbg() != null) {
        localzzq.zza(this.i.zzbg());
      }
      localzzq.setManualImpressionsEnabled(this.i.getManualImpressionsEnabled());
    }
    avo localavo = this.d;
    n.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
    localzzq.e.i = localavo;
    awe localawe = this.e;
    n.b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
    localzzq.e.k = localawe;
    avr localavr = this.f;
    n.b("setOnContentAdLoadedListener must be called on the main UI thread.");
    localzzq.e.j = localavr;
    m localm1 = this.j;
    n.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    localzzq.e.m = localm1;
    m localm2 = this.k;
    n.b("setOnCustomClickListener must be called on the main UI thread.");
    localzzq.e.l = localm2;
    zzpl localzzpl = this.l;
    n.b("setNativeAdOptions must be called on the main UI thread.");
    localzzq.e.n = localzzpl;
    localzzq.zzd(c());
    localzzq.zza(this.b);
    localzzq.zza(this.n);
    ArrayList localArrayList = new ArrayList();
    if (b()) {
      localArrayList.add(Integer.valueOf(1));
    }
    if (this.g != null) {
      localArrayList.add(Integer.valueOf(2));
    }
    localzzq.zze(localArrayList);
    if (b()) {
      paramzzjj.c.putBoolean("ina", true);
    }
    if (this.g != null) {
      paramzzjj.c.putBoolean("iba", true);
    }
    localzzq.zzb(paramzzjj);
  }
  
  private final void a(zzjj paramzzjj, int paramInt)
  {
    arq localarq = asa.cl;
    if ((!((Boolean)aos.f().a(localarq)).booleanValue()) && (this.e != null))
    {
      a(0);
      return;
    }
    zzbc localzzbc = new zzbc(this.a, this.r, zzjn.a(this.a), this.o, this.c, this.p);
    this.q = new WeakReference(localzzbc);
    avo localavo = this.d;
    n.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
    localzzbc.e.i = localavo;
    awe localawe = this.e;
    n.b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
    localzzbc.e.k = localawe;
    avr localavr = this.f;
    n.b("setOnContentAdLoadedListener must be called on the main UI thread.");
    localzzbc.e.j = localavr;
    m localm1 = this.j;
    n.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    localzzbc.e.m = localm1;
    localzzbc.zza(this.b);
    m localm2 = this.k;
    n.b("setOnCustomClickListener must be called on the main UI thread.");
    localzzbc.e.l = localm2;
    localzzbc.zzd(c());
    zzpl localzzpl = this.l;
    n.b("setNativeAdOptions must be called on the main UI thread.");
    localzzbc.e.n = localzzpl;
    localzzbc.zza(this.n);
    localzzbc.zzj(paramInt);
    localzzbc.zzb(paramzzjj);
  }
  
  private static void a(Runnable paramRunnable)
  {
    jn.a.post(paramRunnable);
  }
  
  private final boolean a()
  {
    arq localarq = asa.aM;
    return (((Boolean)aos.f().a(localarq)).booleanValue()) && (this.g != null);
  }
  
  private final boolean b()
  {
    return (this.d != null) || (this.f != null) || (this.e != null) || ((this.j != null) && (this.j.size() > 0));
  }
  
  private final List<String> c()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.f != null) {
      localArrayList.add("1");
    }
    if (this.d != null) {
      localArrayList.add("2");
    }
    if (this.e != null) {
      localArrayList.add("6");
    }
    if (this.j.size() > 0) {
      localArrayList.add("3");
    }
    return localArrayList;
  }
  
  public final String getMediationAdapterClassName()
  {
    for (;;)
    {
      synchronized (this.s)
      {
        if (this.q != null)
        {
          zzd localzzd = (zzd)this.q.get();
          if (localzzd != null)
          {
            str = localzzd.getMediationAdapterClassName();
            return str;
          }
        }
        else
        {
          return null;
        }
      }
      String str = null;
    }
  }
  
  public final boolean isLoading()
  {
    for (;;)
    {
      synchronized (this.s)
      {
        if (this.q != null)
        {
          zzd localzzd = (zzd)this.q.get();
          if (localzzd != null)
          {
            bool = localzzd.isLoading();
            return bool;
          }
        }
        else
        {
          return false;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void zza(zzjj paramzzjj, int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("Number of ads has to be more than 0");
    }
    a(new e(this, paramzzjj, paramInt));
  }
  
  public final String zzck()
  {
    for (;;)
    {
      synchronized (this.s)
      {
        if (this.q != null)
        {
          zzd localzzd = (zzd)this.q.get();
          if (localzzd != null)
          {
            str = localzzd.zzck();
            return str;
          }
        }
        else
        {
          return null;
        }
      }
      String str = null;
    }
  }
  
  public final void zzd(zzjj paramzzjj)
  {
    a(new d(this, paramzzjj));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzah
 * JD-Core Version:    0.7.0.1
 */