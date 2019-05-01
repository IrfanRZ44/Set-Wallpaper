package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.gmsg.zzah;
import com.google.android.gms.ads.internal.gmsg.zzai;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.ads.aji;
import com.google.android.gms.internal.ads.akg;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asn;
import com.google.android.gms.internal.ads.bbt;
import com.google.android.gms.internal.ads.bbu;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.bcn;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.fq;
import com.google.android.gms.internal.ads.hu;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.iz;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.lm;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.rs;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class zzal
  extends zzi
  implements zzai, zzz
{
  private transient boolean k = false;
  private int l = -1;
  private boolean m;
  private float n;
  private boolean o;
  private hy p;
  private String q;
  private final String r;
  private final fq s;
  
  public zzal(Context paramContext, zzjn paramzzjn, String paramString, bck parambck, zzang paramzzang, zzw paramzzw)
  {
    super(paramContext, paramzzjn, paramString, parambck, paramzzang, paramzzw);
    int i;
    String str;
    label51:
    g localg;
    if ((paramzzjn != null) && ("reward_mb".equals(paramzzjn.a)))
    {
      i = 1;
      if (i == 0) {
        break label106;
      }
      str = "/Rewarded";
      this.r = str;
      if (i == 0) {
        break label113;
      }
      localg = new g(this);
    }
    label106:
    label113:
    for (fq localfq = new fq(this.e, this.j, localg, this, this);; localfq = null)
    {
      this.s = localfq;
      return;
      i = 0;
      break;
      str = "/Interstitial";
      break label51;
    }
  }
  
  private static ik a(ik paramik)
  {
    try
    {
      String str1 = et.a(paramik.b).toString();
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("pubid", paramik.a.e);
      String str2 = localJSONObject.toString();
      bbt localbbt = new bbt(str1, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), str2, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L);
      zzaej localzzaej1 = paramik.b;
      List localList = Collections.singletonList(localbbt);
      arq localarq = asa.bB;
      bbu localbbu = new bbu(localList, ((Long)aos.f().a(localarq)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), localzzaej1.H, localzzaej1.I, "", -1L, 0, 1, null, 0, -1, -1L, false);
      zzaej localzzaej2 = new zzaej(paramik.a, localzzaej1.a, localzzaej1.b, Collections.emptyList(), Collections.emptyList(), localzzaej1.f, true, localzzaej1.h, Collections.emptyList(), localzzaej1.j, localzzaej1.k, localzzaej1.l, localzzaej1.m, localzzaej1.n, localzzaej1.o, localzzaej1.p, null, localzzaej1.r, localzzaej1.s, localzzaej1.t, localzzaej1.u, localzzaej1.v, localzzaej1.x, localzzaej1.y, localzzaej1.z, null, Collections.emptyList(), Collections.emptyList(), localzzaej1.D, localzzaej1.E, localzzaej1.F, localzzaej1.G, localzzaej1.H, localzzaej1.I, localzzaej1.J, null, localzzaej1.L, localzzaej1.M, localzzaej1.N, localzzaej1.O, 0, localzzaej1.Q, Collections.emptyList(), localzzaej1.S, localzzaej1.T);
      return new ik(paramik.a, localzzaej2, localbbu, paramik.d, paramik.e, paramik.f, paramik.g, null, paramik.i, null);
    }
    catch (JSONException localJSONException)
    {
      je.b("Unable to generate ad state for an interstitial ad with pooling.", localJSONException);
    }
    return paramik;
  }
  
  private final void a(Bundle paramBundle)
  {
    zzbv.zzek().b(this.e.zzrt, this.e.zzacr.a, "gmob-apps", paramBundle, false);
  }
  
  private final boolean b(boolean paramBoolean)
  {
    return (this.s != null) && (paramBoolean);
  }
  
  protected final qe a(ik paramik, zzx paramzzx, hu paramhu)
  {
    zzbv.zzel();
    qe localqe = ql.a(this.e.zzrt, rs.a(this.e.zzacv), this.e.zzacv.a, false, false, this.e.b, this.e.zzacr, this.a, this, this.i, paramik.i);
    rm localrm = localqe.t();
    arq localarq = asa.ai;
    localrm.a(this, this, null, this, this, ((Boolean)aos.f().a(localarq)).booleanValue(), this, paramzzx, this, paramhu);
    a(localqe);
    localqe.a(paramik.a.v);
    localqe.a("/reward", new zzah(this));
    return localqe;
  }
  
  protected final boolean a(zzjj paramzzjj, ij paramij, boolean paramBoolean)
  {
    if ((this.e.zzfo()) && (paramij.b != null))
    {
      zzbv.zzem();
      jt.a(paramij.b);
    }
    return this.d.zzdz();
  }
  
  protected final void c_()
  {
    zzdj();
    super.c_();
  }
  
  protected final void d()
  {
    if (this.e.zzacw != null) {}
    for (qe localqe = this.e.zzacw.b;; localqe = null)
    {
      ik localik = this.e.zzacx;
      if ((localik != null) && (localik.b != null) && (localik.b.Q) && (localqe != null) && (zzbv.zzfa().a(this.e.zzrt)))
      {
        int i = this.e.zzacr.b;
        int j = this.e.zzacr.c;
        String str = 23 + i + "." + j;
        this.h = zzbv.zzfa().a(str, localqe.getWebView(), "", "javascript", h());
        if ((this.h != null) && (localqe.getView() != null))
        {
          zzbv.zzfa().a(this.h, localqe.getView());
          zzbv.zzfa().a(this.h);
        }
      }
      super.d();
      this.k = true;
      return;
    }
  }
  
  protected final boolean i()
  {
    if (!(this.e.zzrt instanceof Activity)) {
      return false;
    }
    Window localWindow = ((Activity)this.e.zzrt).getWindow();
    if ((localWindow == null) || (localWindow.getDecorView() == null)) {
      return false;
    }
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    localWindow.getDecorView().getGlobalVisibleRect(localRect1, null);
    localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect2);
    return (localRect1.bottom != 0) && (localRect2.bottom != 0) && (localRect1.top == localRect2.top);
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    n.b("setImmersiveMode must be called on the main UI thread.");
    this.o = paramBoolean;
  }
  
  public final void showInterstitial()
  {
    n.b("showInterstitial must be called on the main UI thread.");
    if ((this.e.zzacw != null) && (this.e.zzacw.n)) {}
    for (boolean bool = true; b(bool); bool = false)
    {
      this.s.a(this.o);
      return;
    }
    String str2;
    String str3;
    if (zzbv.zzfh().d(this.e.zzrt))
    {
      this.q = zzbv.zzfh().g(this.e.zzrt);
      str2 = String.valueOf(this.q);
      str3 = String.valueOf(this.r);
      if (str3.length() == 0) {
        break label147;
      }
    }
    label147:
    for (String str4 = str2.concat(str3);; str4 = new String(str2))
    {
      this.q = str4;
      if (this.e.zzacw != null) {
        break;
      }
      je.e("The interstitial has not loaded.");
      return;
    }
    arq localarq1 = asa.br;
    if (((Boolean)aos.f().a(localarq1)).booleanValue()) {
      if (this.e.zzrt.getApplicationContext() == null) {
        break label425;
      }
    }
    label425:
    for (String str1 = this.e.zzrt.getApplicationContext().getPackageName();; str1 = this.e.zzrt.getPackageName())
    {
      if (!this.k)
      {
        je.e("It is not recommended to show an interstitial before onAdLoaded completes.");
        Bundle localBundle2 = new Bundle();
        localBundle2.putString("appid", str1);
        localBundle2.putString("action", "show_interstitial_before_load_finish");
        a(localBundle2);
      }
      zzbv.zzek();
      if (!jn.g(this.e.zzrt))
      {
        je.e("It is not recommended to show an interstitial when app is not in foreground.");
        Bundle localBundle1 = new Bundle();
        localBundle1.putString("appid", str1);
        localBundle1.putString("action", "show_interstitial_app_not_in_foreground");
        a(localBundle1);
      }
      if (this.e.zzfp()) {
        break;
      }
      if ((!this.e.zzacw.n) || (this.e.zzacw.p == null)) {
        break label440;
      }
      try
      {
        arq localarq3 = asa.aQ;
        if (((Boolean)aos.f().a(localarq3)).booleanValue()) {
          this.e.zzacw.p.a(this.o);
        }
        this.e.zzacw.p.b();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        je.c("Could not show interstitial.", localRemoteException);
        zzdj();
        return;
      }
    }
    label440:
    if (this.e.zzacw.b == null)
    {
      je.e("The interstitial failed to load.");
      return;
    }
    if (this.e.zzacw.b.x())
    {
      je.e("The interstitial is already showing.");
      return;
    }
    this.e.zzacw.b.b(true);
    this.e.a(this.e.zzacw.b.getView());
    if (this.e.zzacw.k != null) {
      this.g.a(this.e.zzacv, this.e.zzacw);
    }
    ij localij;
    if (k.b())
    {
      localij = this.e.zzacw;
      if (localij.a()) {
        new akg(this.e.zzrt, localij.b.getView()).a(localij.b);
      }
    }
    else
    {
      if (!this.e.x) {
        break label719;
      }
      zzbv.zzek();
    }
    label719:
    for (Bitmap localBitmap = jn.h(this.e.zzrt);; localBitmap = null)
    {
      this.l = zzbv.zzfe().a(localBitmap);
      arq localarq2 = asa.bR;
      if ((!((Boolean)aos.f().a(localarq2)).booleanValue()) || (localBitmap == null)) {
        break label724;
      }
      new h(this, this.l).h();
      return;
      localij.b.t().a(new f(this, localij));
      break;
    }
    label724:
    zzaq localzzaq = new zzaq(this.e.x, i(), false, 0.0F, -1, this.o, this.e.zzacw.L, this.e.zzacw.O);
    int i = this.e.zzacw.b.getRequestedOrientation();
    if (i == -1) {
      i = this.e.zzacw.h;
    }
    AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.e.zzacw.b, i, this.e.zzacr, this.e.zzacw.A, localzzaq);
    zzbv.zzei();
    zzl.zza(this.e.zzrt, localAdOverlayInfoParcel, true);
  }
  
  public final void zza(ik paramik, asn paramasn)
  {
    boolean bool1 = true;
    if (paramik.e != -2)
    {
      super.zza(paramik, paramasn);
      return;
    }
    if (paramik.c != null) {}
    for (boolean bool2 = bool1; b(bool2); bool2 = false)
    {
      this.s.c();
      return;
    }
    arq localarq = asa.aT;
    if (!((Boolean)aos.f().a(localarq)).booleanValue())
    {
      super.zza(paramik, paramasn);
      return;
    }
    if (!paramik.b.g) {}
    for (;;)
    {
      if ((a(paramik.a.c)) && (bool1)) {
        this.e.zzacx = a(paramik);
      }
      super.zza(this.e.zzacx, paramasn);
      return;
      bool1 = false;
    }
  }
  
  public final void zza(boolean paramBoolean, float paramFloat)
  {
    this.m = paramBoolean;
    this.n = paramFloat;
  }
  
  public final boolean zza(ij paramij1, ij paramij2)
  {
    boolean bool2;
    if (b(paramij2.n)) {
      bool2 = fq.a(paramij1, paramij2);
    }
    boolean bool1;
    do
    {
      return bool2;
      bool1 = super.zza(paramij1, paramij2);
      bool2 = false;
    } while (!bool1);
    if ((!this.e.zzfo()) && (this.e.w != null) && (paramij2.k != null)) {
      this.g.a(this.e.zzacv, paramij2, this.e.w);
    }
    b(paramij2, false);
    return true;
  }
  
  public final boolean zza(zzjj paramzzjj, asn paramasn)
  {
    if (this.e.zzacw != null)
    {
      je.e("An interstitial is already loading. Aborting.");
      return false;
    }
    if ((this.p == null) && (a(paramzzjj)) && (zzbv.zzfh().d(this.e.zzrt)) && (!TextUtils.isEmpty(this.e.zzacp))) {
      this.p = new hy(this.e.zzrt, this.e.zzacp);
    }
    return super.zza(paramzzjj, paramasn);
  }
  
  public final void zzb(zzaig paramzzaig)
  {
    if ((this.e.zzacw != null) && (this.e.zzacw.n)) {}
    for (boolean bool = true; b(bool); bool = false)
    {
      a(this.s.a(paramzzaig));
      return;
    }
    if (this.e.zzacw != null)
    {
      if (this.e.zzacw.x != null)
      {
        zzbv.zzek();
        jn.a(this.e.zzrt, this.e.zzacr.a, this.e.zzacw.x);
      }
      if (this.e.zzacw.v != null) {
        paramzzaig = this.e.zzacw.v;
      }
    }
    a(paramzzaig);
  }
  
  public final void zzcb()
  {
    super.zzcb();
    this.g.a(this.e.zzacw);
    if (this.p != null) {
      this.p.a(false);
    }
    g();
  }
  
  public final void zzcc()
  {
    recordImpression();
    super.zzcc();
    if ((this.e.zzacw != null) && (this.e.zzacw.b != null))
    {
      rm localrm = this.e.zzacw.b.t();
      if (localrm != null) {
        localrm.g();
      }
    }
    if ((zzbv.zzfh().d(this.e.zzrt)) && (this.e.zzacw != null) && (this.e.zzacw.b != null)) {
      zzbv.zzfh().c(this.e.zzacw.b.getContext(), this.q);
    }
    if (this.p != null) {
      this.p.a(true);
    }
    if ((this.h != null) && (this.e.zzacw != null) && (this.e.zzacw.b != null)) {
      this.e.zzacw.b.a("onSdkImpression", new HashMap());
    }
  }
  
  public final void zzcz()
  {
    com.google.android.gms.ads.internal.overlay.zzd localzzd = this.e.zzacw.b.p();
    if (localzzd != null) {
      localzzd.close();
    }
  }
  
  public final void zzd(boolean paramBoolean)
  {
    this.e.x = paramBoolean;
  }
  
  public final void zzdj()
  {
    zzbv.zzfe().b(Integer.valueOf(this.l));
    if (this.e.zzfo())
    {
      this.e.zzfm();
      this.e.zzacw = null;
      this.e.x = false;
      this.k = false;
    }
  }
  
  public final void zzdk()
  {
    if ((this.e.zzacw != null) && (this.e.zzacw.n)) {}
    for (boolean bool = true; b(bool); bool = false)
    {
      this.s.g();
      g_();
      return;
    }
    if ((this.e.zzacw != null) && (this.e.zzacw.w != null))
    {
      zzbv.zzek();
      jn.a(this.e.zzrt, this.e.zzacr.a, this.e.zzacw.w);
    }
    g_();
  }
  
  public final void zzdl()
  {
    if ((this.e.zzacw != null) && (this.e.zzacw.n)) {}
    for (boolean bool = true;; bool = false)
    {
      if (b(bool)) {
        this.s.h();
      }
      h_();
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzal
 * JD-Core Version:    0.7.0.1
 */