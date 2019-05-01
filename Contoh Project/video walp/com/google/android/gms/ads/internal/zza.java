package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.g;
import com.google.android.gms.internal.ads.aji;
import com.google.android.gms.internal.ads.aky;
import com.google.android.gms.internal.ads.alw;
import com.google.android.gms.internal.ads.amj;
import com.google.android.gms.internal.ads.aml.a.b;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aoc;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aov;
import com.google.android.gms.internal.ads.aoy;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.apk;
import com.google.android.gms.internal.ads.apo;
import com.google.android.gms.internal.ads.aps;
import com.google.android.gms.internal.ads.apy;
import com.google.android.gms.internal.ads.aqg;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asd;
import com.google.android.gms.internal.ads.asl;
import com.google.android.gms.internal.ads.asn;
import com.google.android.gms.internal.ads.asu;
import com.google.android.gms.internal.ads.azk;
import com.google.android.gms.internal.ads.bbt;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.fz;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.id;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.il;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.kh;
import com.google.android.gms.internal.ads.ko;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.lz;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.rs;
import com.google.android.gms.internal.ads.y;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzms;
import com.google.android.gms.internal.ads.zzmu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public abstract class zza
  extends apk
  implements zzb, zzd, zzt, anw, ap, co, iu
{
  protected asn a;
  protected asl b;
  protected boolean c = false;
  protected final zzbl d;
  protected final zzbw e;
  protected transient zzjj f;
  protected final aji g;
  protected a h;
  protected final zzw i;
  private asl j;
  private final Bundle k = new Bundle();
  private boolean l = false;
  
  zza(zzbw paramzzbw, zzbl paramzzbl, zzw paramzzw)
  {
    this.e = paramzzbw;
    this.d = new zzbl(this);
    this.i = paramzzw;
    zzbv.zzek().b(this.e.zzrt);
    zzbv.zzek().c(this.e.zzrt);
    jb.a(this.e.zzrt);
    zzbv.zzfi().a(this.e.zzrt);
    zzbv.zzeo().a(this.e.zzrt, this.e.zzacr);
    zzbv.zzeq().a(this.e.zzrt);
    this.g = zzbv.zzeo().g();
    zzbv.zzen().a(this.e.zzrt);
    zzbv.zzfk().a(this.e.zzrt);
    arq localarq1 = asa.cn;
    if (((Boolean)aos.f().a(localarq1)).booleanValue())
    {
      Timer localTimer = new Timer();
      arq localarq2 = asa.cp;
      p localp = new p(this, new CountDownLatch(((Integer)aos.f().a(localarq2)).intValue()), localTimer);
      arq localarq3 = asa.co;
      localTimer.schedule(localp, 0L, ((Long)aos.f().a(localarq3)).longValue());
    }
  }
  
  private static long a(String paramString)
  {
    int m = paramString.indexOf("ufe");
    int n = paramString.indexOf(',', m);
    if (n == -1) {
      n = paramString.length();
    }
    int i1 = m + 4;
    try
    {
      long l1 = Long.parseLong(paramString.substring(i1, n));
      return l1;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      mk.b("", localIndexOutOfBoundsException);
      return -1L;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      label45:
      break label45;
    }
  }
  
  protected static boolean a(zzjj paramzzjj)
  {
    Bundle localBundle = paramzzjj.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    return (localBundle == null) || (!localBundle.containsKey("gw"));
  }
  
  protected final List<String> a(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(id.b((String)localIterator.next(), this.e.zzrt));
    }
    return localArrayList;
  }
  
  protected void a(int paramInt)
  {
    a(paramInt, false);
  }
  
  protected void a(int paramInt, boolean paramBoolean)
  {
    je.e(30 + "Failed to load ad: " + paramInt);
    this.c = paramBoolean;
    if (this.e.e != null) {}
    try
    {
      this.e.e.a(paramInt);
      if (this.e.t == null) {}
    }
    catch (RemoteException localRemoteException2)
    {
      for (;;)
      {
        try
        {
          this.e.t.a(paramInt);
          return;
        }
        catch (RemoteException localRemoteException1)
        {
          je.d("#007 Could not call remote method.", localRemoteException1);
        }
        localRemoteException2 = localRemoteException2;
        je.d("#007 Could not call remote method.", localRemoteException2);
      }
    }
  }
  
  protected final void a(View paramView)
  {
    zzbx localzzbx = this.e.c;
    if (localzzbx != null) {
      localzzbx.addView(paramView, zzbv.zzem().d());
    }
  }
  
  protected final void a(zzaig paramzzaig)
  {
    if (this.e.t == null) {}
    for (;;)
    {
      return;
      String str = "";
      int m = 1;
      if (paramzzaig != null) {}
      try
      {
        str = paramzzaig.a;
        m = paramzzaig.b;
        fr localfr = new fr(str, m);
        this.e.t.a(localfr);
        if (this.e.u != null)
        {
          this.e.u.a(localfr, this.e.zzacx.a.v);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        je.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    je.a("Ad finished loading.");
    this.c = paramBoolean;
    this.l = true;
    if (this.e.e != null) {}
    try
    {
      this.e.e.c();
      if (this.e.t == null) {}
    }
    catch (RemoteException localRemoteException3)
    {
      try
      {
        this.e.t.a();
        if (this.e.g != null) {}
        try
        {
          this.e.g.a();
          return;
        }
        catch (RemoteException localRemoteException1)
        {
          je.d("#007 Could not call remote method.", localRemoteException1);
        }
        localRemoteException3 = localRemoteException3;
        je.d("#007 Could not call remote method.", localRemoteException3);
      }
      catch (RemoteException localRemoteException2)
      {
        for (;;)
        {
          je.d("#007 Could not call remote method.", localRemoteException2);
        }
      }
    }
  }
  
  boolean a(ij paramij)
  {
    return false;
  }
  
  protected final List<String> b(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(id.a((String)localIterator.next(), this.e.zzrt));
    }
    return localArrayList;
  }
  
  protected boolean b(zzjj paramzzjj)
  {
    if (this.e.c == null) {
      return false;
    }
    ViewParent localViewParent = this.e.c.getParent();
    if (!(localViewParent instanceof View)) {
      return false;
    }
    View localView = (View)localViewParent;
    return zzbv.zzek().a(localView, localView.getContext());
  }
  
  protected void c_()
  {
    je.a("Ad closing.");
    if (this.e.e != null) {}
    try
    {
      this.e.e.a();
      if (this.e.t == null) {}
    }
    catch (RemoteException localRemoteException2)
    {
      for (;;)
      {
        try
        {
          this.e.t.d();
          return;
        }
        catch (RemoteException localRemoteException1)
        {
          je.d("#007 Could not call remote method.", localRemoteException1);
        }
        localRemoteException2 = localRemoteException2;
        je.d("#007 Could not call remote method.", localRemoteException2);
      }
    }
  }
  
  protected void d()
  {
    a(false);
  }
  
  public void destroy()
  {
    n.b("#008 Must be called on the main UI thread.: destroy");
    this.d.cancel();
    this.g.b(this.e.zzacw);
    zzbw localzzbw = this.e;
    if (localzzbw.c != null) {
      localzzbw.c.zzfs();
    }
    localzzbw.e = null;
    localzzbw.g = null;
    localzzbw.f = null;
    localzzbw.s = null;
    localzzbw.h = null;
    localzzbw.zzg(false);
    if (localzzbw.c != null) {
      localzzbw.c.removeAllViews();
    }
    localzzbw.zzfm();
    localzzbw.zzfn();
    localzzbw.zzacw = null;
  }
  
  protected final void e_()
  {
    je.a("Ad leaving application.");
    if (this.e.e != null) {}
    try
    {
      this.e.e.b();
      if (this.e.t == null) {}
    }
    catch (RemoteException localRemoteException2)
    {
      for (;;)
      {
        try
        {
          this.e.t.e();
          return;
        }
        catch (RemoteException localRemoteException1)
        {
          je.d("#007 Could not call remote method.", localRemoteException1);
        }
        localRemoteException2 = localRemoteException2;
        je.d("#007 Could not call remote method.", localRemoteException2);
      }
    }
  }
  
  protected final void f_()
  {
    je.a("Ad opening.");
    if (this.e.e != null) {}
    try
    {
      this.e.e.d();
      if (this.e.t == null) {}
    }
    catch (RemoteException localRemoteException2)
    {
      for (;;)
      {
        try
        {
          this.e.t.b();
          return;
        }
        catch (RemoteException localRemoteException1)
        {
          je.d("#007 Could not call remote method.", localRemoteException1);
        }
        localRemoteException2 = localRemoteException2;
        je.d("#007 Could not call remote method.", localRemoteException2);
      }
    }
  }
  
  protected final void g()
  {
    if (this.h != null)
    {
      zzbv.zzfa().b(this.h);
      this.h = null;
    }
  }
  
  protected final void g_()
  {
    if (this.e.t == null) {
      return;
    }
    try
    {
      this.e.t.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public String getAdUnitId()
  {
    return this.e.zzacp;
  }
  
  public aqg getVideoController()
  {
    return null;
  }
  
  protected final String h()
  {
    ik localik = this.e.zzacx;
    if (localik == null) {
      return "javascript";
    }
    if (localik.b == null) {
      return "javascript";
    }
    String str = localik.b.T;
    if (TextUtils.isEmpty(str)) {
      return "javascript";
    }
    try
    {
      if (new JSONObject(str).optInt("media_type", -1) == 0) {
        return null;
      }
      return "javascript";
    }
    catch (JSONException localJSONException)
    {
      mk.c("", localJSONException);
    }
    return "javascript";
  }
  
  protected final void h_()
  {
    if (this.e.t == null) {
      return;
    }
    try
    {
      this.e.t.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final boolean isLoading()
  {
    return this.c;
  }
  
  public final boolean isReady()
  {
    n.b("#008 Must be called on the main UI thread.: isLoaded");
    return (this.e.zzact == null) && (this.e.zzacu == null) && (this.e.zzacw != null);
  }
  
  public void onAdClicked()
  {
    if (this.e.zzacw == null) {
      je.e("Ad state was null when trying to ping click URLs.");
    }
    do
    {
      return;
      je.b("Pinging click URLs.");
      if (this.e.zzacy != null) {
        this.e.zzacy.b();
      }
      if (this.e.zzacw.c != null)
      {
        zzbv.zzek();
        jn.a(this.e.zzrt, this.e.zzacr.a, b(this.e.zzacw.c));
      }
    } while (this.e.d == null);
    try
    {
      this.e.d.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void onAppEvent(String paramString1, String paramString2)
  {
    if (this.e.f != null) {}
    try
    {
      this.e.f.a(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public void pause()
  {
    n.b("#008 Must be called on the main UI thread.: pause");
  }
  
  public void resume()
  {
    n.b("#008 Must be called on the main UI thread.: resume");
  }
  
  public void setImmersiveMode(boolean paramBoolean)
  {
    throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    je.e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
  }
  
  public final void setUserId(String paramString)
  {
    n.b("#008 Must be called on the main UI thread.: setUserId");
    this.e.zzadr = paramString;
  }
  
  public final void stopLoading()
  {
    n.b("#008 Must be called on the main UI thread.: stopLoading");
    this.c = false;
    this.e.zzg(true);
  }
  
  public final void zza(com.google.android.gms.internal.ads.af paramaf, String paramString)
  {
    je.e("#006 Unexpected call to a deprecated method.");
  }
  
  public final void zza(aov paramaov)
  {
    n.b("#008 Must be called on the main UI thread.: setAdClickListener");
    this.e.d = paramaov;
  }
  
  public final void zza(aoy paramaoy)
  {
    n.b("#008 Must be called on the main UI thread.: setAdListener");
    this.e.e = paramaoy;
  }
  
  public final void zza(apo paramapo)
  {
    this.e.g = paramapo;
  }
  
  public final void zza(aps paramaps)
  {
    n.b("#008 Must be called on the main UI thread.: setAppEventListener");
    this.e.f = paramaps;
  }
  
  public final void zza(apy paramapy)
  {
    n.b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
    this.e.h = paramapy;
  }
  
  public final void zza(asl paramasl)
  {
    arq localarq = asa.N;
    this.a = new asn(((Boolean)aos.f().a(localarq)).booleanValue(), "load_ad", this.e.zzacv.a);
    this.j = new asl(-1L, null, null);
    if (paramasl == null)
    {
      this.b = new asl(-1L, null, null);
      return;
    }
    this.b = new asl(paramasl.a(), paramasl.b(), paramasl.c());
  }
  
  public void zza(asu paramasu)
  {
    throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
  }
  
  public final void zza(fz paramfz)
  {
    n.b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
    this.e.u = paramfz;
  }
  
  public final void zza(gh paramgh)
  {
    n.b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
    this.e.t = paramgh;
  }
  
  public final void zza(ik paramik)
  {
    if ((paramik.b.m != -1L) && (!TextUtils.isEmpty(paramik.b.w)))
    {
      long l1 = a(paramik.b.w);
      if (l1 != -1L)
      {
        asl localasl = this.a.a(l1 + paramik.b.m);
        this.a.a(localasl, new String[] { "stc" });
      }
    }
    this.a.a(paramik.b.w);
    this.a.a(this.b, new String[] { "arf" });
    this.j = this.a.a();
    this.a.a("gqi", paramik.b.x);
    this.e.zzact = null;
    this.e.zzacx = paramik;
    paramik.i.a(new af(this, paramik));
    paramik.i.a(aml.a.b.b);
    zza(paramik, this.a);
  }
  
  protected abstract void zza(ik paramik, asn paramasn);
  
  public void zza(y paramy)
  {
    je.e("#006 Unexpected call to a deprecated method.");
  }
  
  public final void zza(zzjn paramzzjn)
  {
    n.b("#008 Must be called on the main UI thread.: setAdSize");
    this.e.zzacv = paramzzjn;
    if ((this.e.zzacw != null) && (this.e.zzacw.b != null) && (this.e.zzadv == 0)) {
      this.e.zzacw.b.a(rs.a(paramzzjn));
    }
    if (this.e.c == null) {
      return;
    }
    if (this.e.c.getChildCount() > 1) {
      this.e.c.removeView(this.e.c.getNextView());
    }
    this.e.c.setMinimumWidth(paramzzjn.f);
    this.e.c.setMinimumHeight(paramzzjn.c);
    this.e.c.requestLayout();
  }
  
  public final void zza(zzlu paramzzlu)
  {
    n.b("#008 Must be called on the main UI thread.: setIconAdOptions");
    this.e.p = paramzzlu;
  }
  
  public final void zza(zzmu paramzzmu)
  {
    n.b("#008 Must be called on the main UI thread.: setVideoOptions");
    this.e.o = paramzzmu;
  }
  
  public final void zza(String paramString, Bundle paramBundle)
  {
    this.k.putAll(paramBundle);
    if ((this.l) && (this.e.g != null)) {}
    try
    {
      this.e.g.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zza(HashSet<il> paramHashSet)
  {
    this.e.zza(paramHashSet);
  }
  
  protected abstract boolean zza(ij paramij1, ij paramij2);
  
  protected abstract boolean zza(zzjj paramzzjj, asn paramasn);
  
  public void zzb(ij paramij)
  {
    this.a.a(this.j, new String[] { "awr" });
    this.e.zzacu = null;
    if ((paramij.d != -2) && (paramij.d != 3) && (this.e.zzfl() != null)) {
      zzbv.zzep().a(this.e.zzfl());
    }
    if (paramij.d == -1)
    {
      this.c = false;
      return;
    }
    if (a(paramij)) {
      je.b("Ad refresh scheduled.");
    }
    if (paramij.d != -2)
    {
      if (paramij.d == 3) {
        paramij.K.a(aml.a.b.d);
      }
      for (;;)
      {
        a(paramij.d);
        return;
        paramij.K.a(aml.a.b.c);
      }
    }
    if (this.e.zzadt == null) {
      this.e.zzadt = new iw(this.e.zzacp);
    }
    if (this.e.c != null) {
      this.e.c.zzfr().d(paramij.B);
    }
    this.g.a(this.e.zzacw);
    String str1;
    label341:
    String str2;
    label375:
    asn localasn3;
    if (zza(this.e.zzacw, paramij))
    {
      this.e.zzacw = paramij;
      zzbw localzzbw = this.e;
      if (localzzbw.zzacy != null)
      {
        if (localzzbw.zzacw != null)
        {
          localzzbw.zzacy.a(localzzbw.zzacw.y);
          localzzbw.zzacy.b(localzzbw.zzacw.z);
          localzzbw.zzacy.b(localzzbw.zzacw.n);
        }
        localzzbw.zzacy.a(localzzbw.zzacv.d);
      }
      asn localasn1 = this.a;
      if (!this.e.zzacw.a()) {
        break label548;
      }
      str1 = "1";
      localasn1.a("is_mraid", str1);
      asn localasn2 = this.a;
      if (!this.e.zzacw.n) {
        break label556;
      }
      str2 = "1";
      localasn2.a("is_mediation", str2);
      if ((this.e.zzacw.b != null) && (this.e.zzacw.b.t() != null))
      {
        localasn3 = this.a;
        if (!this.e.zzacw.b.t().f()) {
          break label564;
        }
      }
    }
    label548:
    label556:
    label564:
    for (String str3 = "1";; str3 = "0")
    {
      localasn3.a("is_delay_pl", str3);
      this.a.a(this.b, new String[] { "ttc" });
      if (zzbv.zzeo().b() != null) {
        zzbv.zzeo().b().a(this.a);
      }
      zzbv();
      if (this.e.zzfo()) {
        d();
      }
      if (paramij.J == null) {
        break;
      }
      zzbv.zzek().a(this.e.zzrt, paramij.J);
      return;
      str1 = "0";
      break label341;
      str2 = "0";
      break label375;
    }
  }
  
  public boolean zzb(zzjj paramzzjj)
  {
    n.b("#008 Must be called on the main UI thread.: loadAd");
    zzbv.zzeq().a();
    this.k.clear();
    this.l = false;
    arq localarq1 = asa.aN;
    if (((Boolean)aos.f().a(localarq1)).booleanValue())
    {
      paramzzjj = paramzzjj.a();
      arq localarq2 = asa.aO;
      if (((Boolean)aos.f().a(localarq2)).booleanValue()) {
        paramzzjj.c.putBoolean("_newBundle", true);
      }
    }
    if ((g.c(this.e.zzrt)) && (paramzzjj.k != null)) {
      paramzzjj = new aoc(paramzzjj).a(null).a();
    }
    if ((this.e.zzact != null) || (this.e.zzacu != null))
    {
      if (this.f != null) {
        je.e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
      }
      for (;;)
      {
        this.f = paramzzjj;
        return false;
        je.e("Loading already in progress, saving this object for future refreshes.");
      }
    }
    je.d("Starting ad request.");
    zza(null);
    this.b = this.a.a();
    if (paramzzjj.f) {
      je.d("This request is sent from a test device.");
    }
    for (;;)
    {
      this.d.zzf(paramzzjj);
      this.c = zza(paramzzjj, this.a);
      return this.c;
      aos.a();
      String str = lz.a(this.e.zzrt);
      je.d(71 + String.valueOf(str).length() + "Use AdRequest.Builder.addTestDevice(\"" + str + "\") to get test ads on this device.");
    }
  }
  
  public final Bundle zzba()
  {
    if (this.l) {
      return this.k;
    }
    return new Bundle();
  }
  
  public final zzw zzbi()
  {
    return this.i;
  }
  
  public final a zzbj()
  {
    n.b("#008 Must be called on the main UI thread.: getAdFrame");
    return b.a(this.e.c);
  }
  
  public final zzjn zzbk()
  {
    n.b("#008 Must be called on the main UI thread.: getAdSize");
    if (this.e.zzacv == null) {
      return null;
    }
    return new zzms(this.e.zzacv);
  }
  
  public final void zzbl()
  {
    e_();
  }
  
  public final void zzbm()
  {
    n.b("#008 Must be called on the main UI thread.: recordManualImpression");
    if (this.e.zzacw == null) {
      je.e("Ad state was null when trying to ping manual tracking URLs.");
    }
    ArrayList localArrayList;
    do
    {
      do
      {
        return;
        je.b("Pinging manual tracking URLs.");
      } while (this.e.zzacw.H);
      localArrayList = new ArrayList();
      if (this.e.zzacw.g != null) {
        localArrayList.addAll(this.e.zzacw.g);
      }
      if ((this.e.zzacw.o != null) && (this.e.zzacw.o.i != null)) {
        localArrayList.addAll(this.e.zzacw.o.i);
      }
    } while (localArrayList.isEmpty());
    zzbv.zzek();
    jn.a(this.e.zzrt, this.e.zzacr.a, localArrayList);
    this.e.zzacw.H = true;
  }
  
  public final void zzbr()
  {
    je.d("Ad impression.");
    if (this.e.e != null) {}
    try
    {
      this.e.e.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzbs()
  {
    je.d("Ad clicked.");
    if (this.e.e != null) {}
    try
    {
      this.e.e.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzbv()
  {
    ij localij = this.e.zzacw;
    if ((localij == null) || (TextUtils.isEmpty(localij.B)) || (localij.I) || (!zzbv.zzeu().b())) {
      return;
    }
    je.b("Sending troubleshooting signals to the server.");
    zzbv.zzeu().b(this.e.zzrt, this.e.zzacr.a, localij.B, this.e.zzacp);
    localij.I = true;
  }
  
  public final aps zzbw()
  {
    return this.e.f;
  }
  
  public final aoy zzbx()
  {
    return this.e.e;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zza
 * JD-Core Version:    0.7.0.1
 */