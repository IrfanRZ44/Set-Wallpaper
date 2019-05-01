package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.f.m;
import android.util.Log;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aji;
import com.google.android.gms.internal.ads.ajl;
import com.google.android.gms.internal.ads.ao;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aqg;
import com.google.android.gms.internal.ads.aqj;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asn;
import com.google.android.gms.internal.ads.asu;
import com.google.android.gms.internal.ads.atf;
import com.google.android.gms.internal.ads.ath;
import com.google.android.gms.internal.ads.atj;
import com.google.android.gms.internal.ads.atm;
import com.google.android.gms.internal.ads.ato;
import com.google.android.gms.internal.ads.atp;
import com.google.android.gms.internal.ads.atq;
import com.google.android.gms.internal.ads.ats;
import com.google.android.gms.internal.ads.att;
import com.google.android.gms.internal.ads.atv;
import com.google.android.gms.internal.ads.aun;
import com.google.android.gms.internal.ads.avk;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.bbu;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.bcn;
import com.google.android.gms.internal.ads.bcw;
import com.google.android.gms.internal.ads.bda;
import com.google.android.gms.internal.ads.bdd;
import com.google.android.gms.internal.ads.bq;
import com.google.android.gms.internal.ads.bu;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.np;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class zzbc
  extends zzd
  implements ats
{
  private final Object k = new Object();
  private boolean l;
  private np<att> m = new np();
  private qe n;
  private qe o;
  private boolean p;
  private int q = 1;
  @GuardedBy("mLock")
  private bq r;
  private final String s = UUID.randomUUID().toString();
  
  public zzbc(Context paramContext, zzw paramzzw, zzjn paramzzjn, String paramString, bck parambck, zzang paramzzang)
  {
    this(paramContext, paramzzw, paramzzjn, paramString, parambck, paramzzang, false);
  }
  
  public zzbc(Context paramContext, zzw paramzzw, zzjn paramzzjn, String paramString, bck parambck, zzang paramzzang, boolean paramBoolean)
  {
    super(paramContext, paramzzjn, paramString, parambck, paramzzang, paramzzw);
    this.l = paramBoolean;
  }
  
  private static void a(zzbw paramzzbw1, zzbw paramzzbw2)
  {
    if (paramzzbw2.i == null) {
      paramzzbw2.i = paramzzbw1.i;
    }
    if (paramzzbw2.j == null) {
      paramzzbw2.j = paramzzbw1.j;
    }
    if (paramzzbw2.l == null) {
      paramzzbw2.l = paramzzbw1.l;
    }
    if (paramzzbw2.m == null) {
      paramzzbw2.m = paramzzbw1.m;
    }
    if (paramzzbw2.o == null) {
      paramzzbw2.o = paramzzbw1.o;
    }
    if (paramzzbw2.n == null) {
      paramzzbw2.n = paramzzbw1.n;
    }
    if (paramzzbw2.v == null) {
      paramzzbw2.v = paramzzbw1.v;
    }
    if (paramzzbw2.zzacy == null) {
      paramzzbw2.zzacy = paramzzbw1.zzacy;
    }
    if (paramzzbw2.zzadt == null) {
      paramzzbw2.zzadt = paramzzbw1.zzadt;
    }
    if (paramzzbw2.d == null) {
      paramzzbw2.d = paramzzbw1.d;
    }
    if (paramzzbw2.e == null) {
      paramzzbw2.e = paramzzbw1.e;
    }
    if (paramzzbw2.zzacv == null) {
      paramzzbw2.zzacv = paramzzbw1.zzacv;
    }
    if (paramzzbw2.zzacw == null) {
      paramzzbw2.zzacw = paramzzbw1.zzacw;
    }
    if (paramzzbw2.zzacx == null) {
      paramzzbw2.zzacx = paramzzbw1.zzacx;
    }
  }
  
  private final void a(atf paramatf)
  {
    jn.a.post(new u(this, paramatf));
  }
  
  private final void a(ath paramath)
  {
    jn.a.post(new w(this, paramath));
  }
  
  private final void a(atm paramatm)
  {
    jn.a.post(new v(this, paramatm));
  }
  
  private static atm b(att paramatt)
  {
    atm localatm;
    Object localObject;
    if ((paramatt instanceof ath))
    {
      ath localath = (ath)paramatt;
      localatm = new atm(localath.a(), localath.b(), localath.e(), localath.f(), localath.g(), localath.h(), -1.0D, null, null, localath.m(), localath.i(), localath.o(), localath.c(), localath.d(), localath.n());
      if (localath.j() != null) {
        localObject = b.a(localath.j());
      }
    }
    for (;;)
    {
      if ((localObject instanceof atv)) {
        localatm.a((atv)localObject);
      }
      return localatm;
      localObject = null;
      continue;
      boolean bool = paramatt instanceof atf;
      localObject = null;
      localatm = null;
      if (bool)
      {
        atf localatf = (atf)paramatt;
        localatm = new atm(localatf.a(), localatf.b(), localatf.c(), localatf.d(), localatf.e(), null, localatf.f(), localatf.g(), localatf.h(), localatf.m(), localatf.i(), localatf.o(), localatf.p(), localatf.q(), localatf.n());
        if (localatf.j() != null) {
          localObject = b.a(localatf.j());
        } else {
          localObject = null;
        }
      }
    }
  }
  
  private final boolean l()
  {
    return (this.e.zzacw != null) && (this.e.zzacw.N);
  }
  
  private final bbu m()
  {
    if ((this.e.zzacw != null) && (this.e.zzacw.n)) {
      return this.e.zzacw.r;
    }
    return null;
  }
  
  private final void n()
  {
    bq localbq = zzdr();
    if (localbq != null) {
      localbq.a();
    }
  }
  
  protected final void a(int paramInt)
  {
    a(paramInt, false);
  }
  
  protected final void a(int paramInt, boolean paramBoolean)
  {
    n();
    super.a(paramInt, paramBoolean);
  }
  
  protected final void a(a parama)
  {
    if (parama != null) {}
    for (Object localObject = b.a(parama);; localObject = null)
    {
      if ((localObject instanceof atq)) {
        ((atq)localObject).d();
      }
      super.b(this.e.zzacw, false);
      return;
    }
  }
  
  protected final void a(boolean paramBoolean)
  {
    String str1 = null;
    super.a(paramBoolean);
    if (this.p)
    {
      arq localarq = asa.cg;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        zzdt();
      }
    }
    Object localObject;
    if ((l()) && ((this.o != null) || (this.n != null)))
    {
      if (this.o == null) {
        break label195;
      }
      localObject = this.o;
    }
    for (;;)
    {
      if ((((qe)localObject).getWebView() != null) && (zzbv.zzfa().a(this.e.zzrt)))
      {
        int i = this.e.zzacr.b;
        int j = this.e.zzacr.c;
        String str2 = 23 + i + "." + j;
        this.h = zzbv.zzfa().a(str2, ((qe)localObject).getWebView(), "", "javascript", str1);
        if (this.h != null) {
          zzbv.zzfa().a(this.h);
        }
      }
      return;
      label195:
      if (this.n != null)
      {
        qe localqe = this.n;
        str1 = "javascript";
        localObject = localqe;
      }
      else
      {
        localObject = null;
        str1 = null;
      }
    }
  }
  
  protected final boolean a(zzjj paramzzjj, ij paramij, boolean paramBoolean)
  {
    return this.d.zzdz();
  }
  
  protected final void d()
  {
    a(false);
  }
  
  public final String getAdUnitId()
  {
    return this.e.zzacp;
  }
  
  public final String getUuid()
  {
    return this.s;
  }
  
  final void i()
  {
    synchronized (this.k)
    {
      je.a("Initializing webview native ads utills");
      this.r = new bu(this.e.zzrt, this, this.s, this.e.b, this.e.zzacr);
      return;
    }
  }
  
  protected final Future<att> j()
  {
    return this.m;
  }
  
  public final void pause()
  {
    throw new IllegalStateException("Native Ad DOES NOT support pause().");
  }
  
  public final void resume()
  {
    throw new IllegalStateException("Native Ad DOES NOT support resume().");
  }
  
  public final void showInterstitial()
  {
    throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
  }
  
  public final void zza(asu paramasu)
  {
    throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
  }
  
  public final void zza(ato paramato)
  {
    if (this.n != null) {
      this.n.a(paramato);
    }
  }
  
  public final void zza(atq paramatq)
  {
    if (this.e.zzacw.k != null) {
      zzbv.zzeo().g().a(this.e.zzacv, this.e.zzacw, new ajl(paramatq), null);
    }
  }
  
  public final void zza(ik paramik, asn paramasn)
  {
    if (paramik.d != null) {
      this.e.zzacv = paramik.d;
    }
    if (paramik.e != -2)
    {
      jn.a.post(new r(this, paramik));
      return;
    }
    int i = paramik.a.Y;
    if (i == 1)
    {
      this.e.zzadv = 0;
      zzbw localzzbw = this.e;
      zzbv.zzej();
      localzzbw.zzacu = ao.a(this.e.zzrt, this, paramik, this.e.b, null, this.j, this, paramasn);
      String str1 = String.valueOf(this.e.zzacu.getClass().getName());
      if (str1.length() != 0) {}
      for (String str2 = "AdRenderer: ".concat(str1);; str2 = new String("AdRenderer: "))
      {
        je.b(str2);
        return;
      }
    }
    JSONArray localJSONArray1 = new JSONArray();
    try
    {
      JSONArray localJSONArray2 = new JSONObject(paramik.b.b).getJSONArray("slots");
      for (int j = 0; j < localJSONArray2.length(); j++)
      {
        JSONArray localJSONArray3 = localJSONArray2.getJSONObject(j).getJSONArray("ads");
        for (int i3 = 0; i3 < localJSONArray3.length(); i3++) {
          localJSONArray1.put(localJSONArray3.get(i3));
        }
      }
      n();
    }
    catch (JSONException localJSONException)
    {
      je.c("Malformed native ad response", localJSONException);
      a(0);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < i; i1++) {
      localArrayList.add(jl.a(new s(this, i1, localJSONArray1, i, paramik)));
    }
    int i2 = 0;
    while (i2 < localArrayList.size()) {
      try
      {
        ne localne = (ne)localArrayList.get(i2);
        arq localarq = asa.bB;
        att localatt = (att)localne.get(((Long)aos.f().a(localarq)).longValue(), TimeUnit.MILLISECONDS);
        jn.a.post(new t(this, localatt, i2, localArrayList));
        i2++;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          mk.c("", localInterruptedException);
          Thread.currentThread().interrupt();
        }
      }
      catch (ExecutionException localExecutionException)
      {
        for (;;)
        {
          mk.c("", localExecutionException);
        }
      }
      catch (CancellationException localCancellationException)
      {
        break label440;
      }
      catch (TimeoutException localTimeoutException)
      {
        label440:
        break label440;
      }
    }
  }
  
  public final void zza(com.google.android.gms.internal.ads.y paramy)
  {
    throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
  }
  
  protected final boolean zza(ij paramij1, ij paramij2)
  {
    zzd(null);
    if (!this.e.zzfo()) {
      throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }
    bda localbda;
    avk localavk;
    String str2;
    aun localaun3;
    label687:
    View localView3;
    label766:
    aun localaun2;
    label847:
    View localView2;
    label908:
    label960:
    String str3;
    List localList1;
    String str4;
    aun localaun1;
    label1108:
    String str5;
    String str6;
    Bundle localBundle1;
    aqg localaqg1;
    if (paramij2.n)
    {
      n();
      for (;;)
      {
        try
        {
          if (paramij2.p == null) {
            continue;
          }
          localbdd = paramij2.p.p();
          if (paramij2.p == null) {
            continue;
          }
          localbcw = paramij2.p.h();
          if (paramij2.p == null) {
            continue;
          }
          localbda = paramij2.p.i();
          if (paramij2.p == null) {
            continue;
          }
          localavk = paramij2.p.n();
          str2 = b(paramij2);
          if ((localbdd == null) || (this.e.k == null)) {
            continue;
          }
          String str21 = localbdd.a();
          List localList5 = localbdd.b();
          String str22 = localbdd.c();
          if (localbdd.d() == null) {
            continue;
          }
          localaun5 = localbdd.d();
          String str23 = localbdd.e();
          String str24 = localbdd.f();
          double d3 = localbdd.g();
          String str25 = localbdd.h();
          String str26 = localbdd.i();
          aqg localaqg5 = localbdd.j();
          if (localbdd.m() == null) {
            continue;
          }
          localView5 = (View)b.a(localbdd.m());
          atm localatm3 = new atm(str21, localList5, str22, localaun5, str23, str24, d3, str25, str26, null, localaqg5, localView5, localbdd.n(), str2, localbdd.o());
          localatm3.a(new atp(this.e.zzrt, this, this.e.b, localbdd, localatm3));
          a(localatm3);
        }
        catch (RemoteException localRemoteException)
        {
          bdd localbdd;
          aun localaun5;
          View localView5;
          String str16;
          List localList4;
          String str17;
          String str18;
          double d2;
          String str19;
          String str20;
          aqg localaqg4;
          atm localatm2;
          je.d("#007 Could not call remote method.", localRemoteException);
          continue;
          aun localaun4 = null;
          continue;
          View localView4 = null;
          continue;
          if (localbcw == null) {
            break label847;
          }
        }
        return super.zza(paramij1, paramij2);
        localbdd = null;
        continue;
        bcw localbcw = null;
        continue;
        localbda = null;
        continue;
        localavk = null;
        continue;
        localaun5 = null;
        continue;
        localView5 = null;
        continue;
        if ((localbcw != null) && (this.e.k != null))
        {
          str16 = localbcw.a();
          localList4 = localbcw.b();
          str17 = localbcw.c();
          if (localbcw.d() != null)
          {
            localaun4 = localbcw.d();
            str18 = localbcw.e();
            d2 = localbcw.f();
            str19 = localbcw.g();
            str20 = localbcw.h();
            localaqg4 = localbcw.m();
            if (localbcw.p() == null) {
              continue;
            }
            localView4 = (View)b.a(localbcw.p());
            localatm2 = new atm(str16, localList4, str17, localaun4, str18, null, d2, str19, str20, null, localaqg4, localView4, localbcw.q(), str2, localbcw.l());
            localatm2.a(new atp(this.e.zzrt, this, this.e.b, localbcw, localatm2));
            a(localatm2);
          }
        }
        if (this.e.i != null)
        {
          String str11 = localbcw.a();
          List localList3 = localbcw.b();
          String str12 = localbcw.c();
          if (localbcw.d() == null) {
            break label1541;
          }
          localaun3 = localbcw.d();
          String str13 = localbcw.e();
          double d1 = localbcw.f();
          String str14 = localbcw.g();
          String str15 = localbcw.h();
          Bundle localBundle2 = localbcw.l();
          aqg localaqg3 = localbcw.m();
          if (localbcw.p() == null) {
            break label1547;
          }
          localView3 = (View)b.a(localbcw.p());
          atf localatf = new atf(str11, localList3, str12, localaun3, str13, d1, str14, str15, null, localBundle2, localaqg3, localView3, localbcw.q(), str2);
          localatf.a(new atp(this.e.zzrt, this, this.e.b, localbcw, localatf));
          a(localatf);
        }
        else
        {
          if ((localbda == null) || (this.e.k == null)) {
            break;
          }
          String str7 = localbda.a();
          List localList2 = localbda.b();
          String str8 = localbda.c();
          if (localbda.d() == null) {
            break label1553;
          }
          localaun2 = localbda.d();
          String str9 = localbda.e();
          String str10 = localbda.f();
          aqg localaqg2 = localbda.l();
          if (localbda.n() == null) {
            break label1559;
          }
          localView2 = (View)b.a(localbda.n());
          atm localatm1 = new atm(str7, localList2, str8, localaun2, str9, str10, -1.0D, null, null, null, localaqg2, localView2, localbda.o(), str2, localbda.j());
          localatm1.a(new atp(this.e.zzrt, this, this.e.b, localbda, localatm1));
          a(localatm1);
        }
      }
      if ((localbda != null) && (this.e.j != null))
      {
        str3 = localbda.a();
        localList1 = localbda.b();
        str4 = localbda.c();
        if (localbda.d() == null) {
          break label1565;
        }
        localaun1 = localbda.d();
        str5 = localbda.e();
        str6 = localbda.f();
        localBundle1 = localbda.j();
        localaqg1 = localbda.l();
        if (localbda.n() == null) {
          break label1571;
        }
      }
    }
    label1541:
    label1547:
    label1553:
    label1559:
    label1565:
    label1571:
    for (View localView1 = (View)b.a(localbda.n());; localView1 = null)
    {
      ath localath = new ath(str3, localList1, str4, localaun1, str5, str6, null, localBundle1, localaqg1, localView1, localbda.o(), str2);
      localath.a(new atp(this.e.zzrt, this, this.e.b, localbda, localath));
      a(localath);
      break;
      if ((localavk != null) && (this.e.m != null) && (this.e.m.get(localavk.l()) != null))
      {
        jn.a.post(new y(this, localavk));
        break;
      }
      je.e("No matching mapper/listener for retrieved native ad template.");
      a(0);
      return false;
      att localatt = paramij2.C;
      if (this.l)
      {
        this.m.b(localatt);
        break;
      }
      if (((localatt instanceof ath)) && (this.e.k != null))
      {
        a(b(paramij2.C));
        break;
      }
      if (((localatt instanceof ath)) && (this.e.j != null))
      {
        a((ath)paramij2.C);
        break;
      }
      if (((localatt instanceof atf)) && (this.e.k != null))
      {
        a(b(paramij2.C));
        break;
      }
      if (((localatt instanceof atf)) && (this.e.i != null))
      {
        a((atf)paramij2.C);
        break;
      }
      if (((localatt instanceof atj)) && (this.e.m != null) && (this.e.m.get(((atj)localatt).l()) != null))
      {
        String str1 = ((atj)localatt).l();
        jn.a.post(new x(this, str1, paramij2));
        break;
      }
      je.e("No matching listener for retrieved native ad template.");
      a(0);
      return false;
      localaun3 = null;
      break label687;
      localView3 = null;
      break label766;
      localaun2 = null;
      break label908;
      localView2 = null;
      break label960;
      localaun1 = null;
      break label1108;
    }
  }
  
  public final boolean zza(zzjj paramzzjj, asn paramasn)
  {
    try
    {
      i();
      return super.zza(paramzzjj, paramasn, this.q);
    }
    catch (Exception localException)
    {
      if (mk.a(4)) {
        Log.i("Ads", "Error initializing webview.", localException);
      }
    }
    return false;
  }
  
  public final void zzcd()
  {
    ij localij = this.e.zzacw;
    if (localij.p == null)
    {
      super.zzcd();
      return;
    }
    for (;;)
    {
      bcn localbcn;
      Object localObject;
      try
      {
        localbcn = localij.p;
        bcw localbcw = localbcn.h();
        if (localbcw != null)
        {
          localObject = localbcw.m();
          if (localObject == null) {
            break;
          }
          aqj localaqj = ((aqg)localObject).h();
          if (localaqj == null) {
            break;
          }
          localaqj.d();
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        je.d("#007 Could not call remote method.", localRemoteException);
        return;
      }
      bda localbda = localbcn.i();
      if (localbda != null)
      {
        localObject = localbda.l();
      }
      else
      {
        avk localavk = localbcn.n();
        localObject = null;
        if (localavk != null)
        {
          aqg localaqg = localavk.c();
          localObject = localaqg;
        }
      }
    }
  }
  
  public final void zzce()
  {
    if ((this.e.zzacw != null) && ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzacw.q)))
    {
      zzbs();
      return;
    }
    super.zzce();
  }
  
  public final void zzcj()
  {
    if ((this.e.zzacw != null) && ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzacw.q)))
    {
      zzbr();
      return;
    }
    super.zzcj();
  }
  
  public final void zzcr()
  {
    if (!l()) {}
    for (;;)
    {
      return;
      if (this.h != null)
      {
        qe localqe2;
        if (this.o != null) {
          localqe2 = this.o;
        }
        while (localqe2 != null)
        {
          localqe2.a("onSdkImpression", new HashMap());
          return;
          qe localqe1 = this.n;
          localqe2 = null;
          if (localqe1 != null) {
            localqe2 = this.n;
          }
        }
      }
    }
  }
  
  public final void zzcs()
  {
    super.g();
    if (this.o != null)
    {
      this.o.destroy();
      this.o = null;
    }
  }
  
  public final void zzct()
  {
    if (this.n != null)
    {
      this.n.destroy();
      this.n = null;
    }
  }
  
  public final boolean zzcu()
  {
    if (m() != null) {
      return m().p;
    }
    return false;
  }
  
  public final boolean zzcv()
  {
    if (m() != null) {
      return m().q;
    }
    return false;
  }
  
  public final void zzd(List<String> paramList)
  {
    n.b("setNativeTemplates must be called on the main UI thread.");
    this.e.v = paramList;
  }
  
  public final bq zzdr()
  {
    synchronized (this.k)
    {
      bq localbq = this.r;
      return localbq;
    }
  }
  
  public final void zzdt()
  {
    if ((this.e.zzacw != null) && (this.n != null))
    {
      zzbv.zzeo().g().a(this.e.zzacv, this.e.zzacw, this.n.getView(), this.n);
      this.p = false;
      return;
    }
    this.p = true;
    je.e("Request to enable ActiveView before adState is available.");
  }
  
  public final void zzdu()
  {
    this.p = false;
    if ((this.e.zzacw != null) && (this.n != null))
    {
      zzbv.zzeo().g().a(this.e.zzacw);
      return;
    }
    je.e("Request to enable ActiveView before adState is available.");
  }
  
  public final m<String, avy> zzdv()
  {
    n.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    return this.e.m;
  }
  
  public final void zzdw()
  {
    if ((this.n != null) && (this.n.b() != null) && (this.e.n != null) && (this.e.n.f != null)) {
      this.n.b().a(this.e.n.f);
    }
  }
  
  public final void zzf(qe paramqe)
  {
    this.n = paramqe;
  }
  
  public final void zzg(qe paramqe)
  {
    this.o = paramqe;
  }
  
  public final void zzi(View paramView)
  {
    if (this.h != null) {
      zzbv.zzfa().a(this.h, paramView);
    }
  }
  
  public final void zzj(int paramInt)
  {
    n.b("setMaxNumberOfAds must be called on the main UI thread.");
    this.q = paramInt;
  }
  
  public final avv zzr(String paramString)
  {
    n.b("getOnCustomClickListener must be called on the main UI thread.");
    if (this.e.l == null) {
      return null;
    }
    return (avv)this.e.l.get(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzbc
 * JD-Core Version:    0.7.0.1
 */