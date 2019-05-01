package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.f.m;
import android.util.DisplayMetrics;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aji;
import com.google.android.gms.internal.ads.alc;
import com.google.android.gms.internal.ads.amj;
import com.google.android.gms.internal.ads.aml.a.b;
import com.google.android.gms.internal.ads.amo;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.apy;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asn;
import com.google.android.gms.internal.ads.avk;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.ayu;
import com.google.android.gms.internal.ads.bbt;
import com.google.android.gms.internal.ads.bbu;
import com.google.android.gms.internal.ads.bbv;
import com.google.android.gms.internal.ads.bbx;
import com.google.android.gms.internal.ads.bcd;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.bcn;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.cp;
import com.google.android.gms.internal.ads.dl;
import com.google.android.gms.internal.ads.ec;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.il;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.iv;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.iz;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.ko;
import com.google.android.gms.internal.ads.mt;
import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzpl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public abstract class zzd
  extends zza
  implements zzn, zzbo, bbv
{
  protected final bck j;
  private transient boolean k;
  
  public zzd(Context paramContext, zzjn paramzzjn, String paramString, bck parambck, zzang paramzzang, zzw paramzzw)
  {
    this(new zzbw(paramContext, paramzzjn, paramString, paramzzang), parambck, null, paramzzw);
  }
  
  private zzd(zzbw paramzzbw, bck parambck, zzbl paramzzbl, zzw paramzzw)
  {
    super(paramzzbw, null, paramzzw);
    this.j = parambck;
    this.k = false;
  }
  
  private final dl a(zzjj paramzzjj, Bundle paramBundle, in paramin, int paramInt)
  {
    ApplicationInfo localApplicationInfo = this.e.zzrt.getApplicationInfo();
    PackageInfo localPackageInfo1;
    try
    {
      PackageInfo localPackageInfo2 = c.b(this.e.zzrt).b(localApplicationInfo.packageName, 0);
      localPackageInfo1 = localPackageInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        zzbx localzzbx;
        ViewParent localViewParent;
        int[] arrayOfInt;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean bool10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        localPackageInfo1 = null;
      }
    }
    DisplayMetrics localDisplayMetrics = this.e.zzrt.getResources().getDisplayMetrics();
    localzzbx = this.e.c;
    Bundle localBundle1 = null;
    if (localzzbx != null)
    {
      localViewParent = this.e.c.getParent();
      localBundle1 = null;
      if (localViewParent != null)
      {
        arrayOfInt = new int[2];
        this.e.c.getLocationOnScreen(arrayOfInt);
        i6 = arrayOfInt[0];
        i7 = arrayOfInt[1];
        i8 = this.e.c.getWidth();
        i9 = this.e.c.getHeight();
        bool10 = this.e.c.isShown();
        i10 = 0;
        if (bool10)
        {
          i11 = i6 + i8;
          i10 = 0;
          if (i11 > 0)
          {
            i12 = i7 + i9;
            i10 = 0;
            if (i12 > 0)
            {
              i13 = localDisplayMetrics.widthPixels;
              i10 = 0;
              if (i6 <= i13)
              {
                i14 = localDisplayMetrics.heightPixels;
                i10 = 0;
                if (i7 <= i14) {
                  i10 = 1;
                }
              }
            }
          }
        }
        localBundle1 = new Bundle(5);
        localBundle1.putInt("x", i6);
        localBundle1.putInt("y", i7);
        localBundle1.putInt("width", i8);
        localBundle1.putInt("height", i9);
        localBundle1.putInt("visible", i10);
      }
    }
    String str1 = zzbv.zzeo().a().a();
    this.e.zzacy = new il(str1, this.e.zzacp);
    this.e.zzacy.a(paramzzjj);
    zzbv.zzek();
    String str2 = jn.a(this.e.zzrt, this.e.c, this.e.zzacv);
    long l1 = 0L;
    if (this.e.h != null) {}
    try
    {
      long l2 = this.e.h.b();
      l1 = l2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        int i;
        je.e("Cannot get correlation id, default to 0.");
      }
      localne1 = jl.a(new ai(this));
      localne2 = jl.a(new aj(this));
      str4 = null;
      if (paramin == null) {
        break label582;
      }
      str4 = paramin.c();
      localList1 = this.e.v;
      str5 = null;
      if (localList1 == null) {
        break label670;
      }
      i4 = this.e.v.size();
      str5 = null;
      if (i4 <= 0) {
        break label670;
      }
      i5 = 0;
      if (localPackageInfo1 == null) {
        break label636;
      }
      i5 = localPackageInfo1.versionCode;
      if (i5 <= zzbv.zzeo().l().g()) {
        break label1080;
      }
      zzbv.zzeo().l().m();
      zzbv.zzeo().l().a(i5);
    }
    String str3 = UUID.randomUUID().toString();
    Bundle localBundle2 = zzbv.zzep().a(this.e.zzrt, this, str1);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (i = 0; i < this.e.m.size(); i++)
    {
      String str11 = (String)this.e.m.b(i);
      localArrayList1.add(str11);
      if ((this.e.l.containsKey(str11)) && (this.e.l.get(str11) != null)) {
        localArrayList2.add(str11);
      }
    }
    for (;;)
    {
      ne localne1;
      ne localne2;
      String str4;
      label582:
      List localList1;
      int i4;
      int i5;
      label636:
      zzjn localzzjn = this.e.zzacv;
      label670:
      String str6 = this.e.zzacp;
      String str7 = aos.c();
      zzang localzzang = this.e.zzacr;
      List localList2 = this.e.v;
      boolean bool1 = zzbv.zzeo().l().a();
      int m = localDisplayMetrics.widthPixels;
      int n = localDisplayMetrics.heightPixels;
      float f1 = localDisplayMetrics.density;
      List localList3 = asa.a();
      String str8 = this.e.a;
      zzpl localzzpl = this.e.n;
      String str9 = this.e.zzfq();
      float f2 = zzbv.zzfj().a();
      boolean bool2 = zzbv.zzfj().b();
      zzbv.zzek();
      int i1 = jn.i(this.e.zzrt);
      zzbv.zzek();
      int i2 = jn.d(this.e.c);
      boolean bool3 = this.e.zzrt instanceof Activity;
      boolean bool4 = zzbv.zzeo().l().f();
      boolean bool5 = zzbv.zzeo().d();
      int i3 = zzbv.zzff().a();
      zzbv.zzek();
      Bundle localBundle3 = jn.c();
      String str10 = zzbv.zzeu().a();
      zzlu localzzlu = this.e.p;
      boolean bool6 = zzbv.zzeu().b();
      Bundle localBundle4 = ayu.a().j();
      boolean bool7 = zzbv.zzeo().l().e(this.e.zzacp);
      List localList4 = this.e.r;
      boolean bool8 = c.b(this.e.zzrt).a();
      boolean bool9 = zzbv.zzeo().e();
      zzbv.zzem();
      return new dl(localBundle1, paramzzjj, localzzjn, str6, localApplicationInfo, localPackageInfo1, str1, str7, localzzang, localBundle2, localList2, localArrayList1, paramBundle, bool1, m, n, f1, str2, l1, str3, localList3, str8, localzzpl, str9, f2, bool2, i1, i2, bool3, bool4, localne1, str4, bool5, i3, localBundle3, str10, localzzlu, bool6, localBundle4, bool7, localne2, localList4, str5, localArrayList2, paramInt, bool8, bool9, jt.e(), (ArrayList)mt.a(zzbv.zzeo().n(), null, 1000L, TimeUnit.MILLISECONDS));
      label1080:
      JSONObject localJSONObject = zzbv.zzeo().l().l();
      String str5 = null;
      if (localJSONObject != null)
      {
        JSONArray localJSONArray = localJSONObject.optJSONArray(this.e.zzacp);
        str5 = null;
        if (localJSONArray != null) {
          str5 = localJSONArray.toString();
        }
      }
    }
  }
  
  static String b(ij paramij)
  {
    String str1;
    if (paramij == null) {
      str1 = null;
    }
    for (;;)
    {
      return str1;
      str1 = paramij.q;
      if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str1)) || ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str1))) {}
      for (int i = 1; (i != 0) && (paramij.o != null); i = 0)
      {
        String str2 = paramij.o.k;
        try
        {
          String str3 = new JSONObject(str2).getString("class_name");
          return str3;
        }
        catch (NullPointerException localNullPointerException)
        {
          return str1;
        }
        catch (JSONException localJSONException) {}
      }
    }
    return str1;
  }
  
  protected void a(ij paramij, boolean paramBoolean)
  {
    if (paramij == null) {
      je.e("Ad state was null when trying to ping impression URLs.");
    }
    for (;;)
    {
      return;
      if (paramij == null) {
        je.e("Ad state was null when trying to ping impression URLs.");
      }
      while ((!paramij.F) || (paramBoolean))
      {
        if ((paramij.r != null) && (paramij.r.d != null))
        {
          zzbv.zzfd();
          bcd.a(this.e.zzrt, this.e.zzacr.a, paramij, this.e.zzacp, paramBoolean, b(paramij.r.d));
        }
        if ((paramij.o != null) && (paramij.o.g != null))
        {
          zzbv.zzfd();
          bcd.a(this.e.zzrt, this.e.zzacr.a, paramij, this.e.zzacp, paramBoolean, paramij.o.g);
        }
        paramij.F = true;
        return;
        je.b("Pinging Impression URLs.");
        if (this.e.zzacy != null) {
          this.e.zzacy.a();
        }
        paramij.K.a(aml.a.b.e);
        if ((paramij.e != null) && (!paramij.D))
        {
          zzbv.zzek();
          jn.a(this.e.zzrt, this.e.zzacr.a, b(paramij.e));
          paramij.D = true;
        }
      }
    }
  }
  
  final boolean a(ij paramij)
  {
    boolean bool = false;
    zzjj localzzjj;
    if (this.f != null)
    {
      localzzjj = this.f;
      this.f = null;
    }
    for (;;)
    {
      return a(localzzjj, paramij, bool);
      localzzjj = paramij.a;
      Bundle localBundle = localzzjj.c;
      bool = false;
      if (localBundle != null) {
        bool = localzzjj.c.getBoolean("_noRefresh", false);
      }
    }
  }
  
  protected boolean a(zzjj paramzzjj, ij paramij, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.e.zzfo()))
    {
      if (paramij.i <= 0L) {
        break label43;
      }
      this.d.zza(paramzzjj, paramij.i);
    }
    for (;;)
    {
      return this.d.zzdz();
      label43:
      if ((paramij.r != null) && (paramij.r.j > 0L)) {
        this.d.zza(paramzzjj, paramij.r.j);
      } else if ((!paramij.n) && (paramij.d == 2)) {
        this.d.zzg(paramzzjj);
      }
    }
  }
  
  protected final void b(ij paramij, boolean paramBoolean)
  {
    if (paramij == null) {}
    do
    {
      return;
      if ((paramij != null) && (paramij.f != null) && (!paramij.E))
      {
        zzbv.zzek();
        jn.a(this.e.zzrt, this.e.zzacr.a, a(paramij.f));
        paramij.E = true;
      }
    } while ((paramij.G) && (!paramBoolean));
    if ((paramij.r != null) && (paramij.r.e != null))
    {
      zzbv.zzfd();
      bcd.a(this.e.zzrt, this.e.zzacr.a, paramij, this.e.zzacp, paramBoolean, a(paramij.r.e));
    }
    if ((paramij.o != null) && (paramij.o.h != null))
    {
      zzbv.zzfd();
      bcd.a(this.e.zzrt, this.e.zzacr.a, paramij, this.e.zzacp, paramBoolean, paramij.o.h);
    }
    paramij.G = true;
  }
  
  protected final boolean b(zzjj paramzzjj)
  {
    return (super.b(paramzzjj)) && (!this.k);
  }
  
  public final String getMediationAdapterClassName()
  {
    if (this.e.zzacw == null) {
      return null;
    }
    return this.e.zzacw.q;
  }
  
  protected boolean k()
  {
    boolean bool = true;
    zzbv.zzek();
    if (jn.a(this.e.zzrt, "android.permission.INTERNET"))
    {
      zzbv.zzek();
      if (jn.a(this.e.zzrt)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public void onAdClicked()
  {
    if (this.e.zzacw == null)
    {
      je.e("Ad state was null when trying to ping click URLs.");
      return;
    }
    if ((this.e.zzacw.r != null) && (this.e.zzacw.r.c != null))
    {
      zzbv.zzfd();
      bcd.a(this.e.zzrt, this.e.zzacr.a, this.e.zzacw, this.e.zzacp, false, b(this.e.zzacw.r.c));
    }
    if ((this.e.zzacw.o != null) && (this.e.zzacw.o.f != null))
    {
      zzbv.zzfd();
      bcd.a(this.e.zzrt, this.e.zzacr.a, this.e.zzacw, this.e.zzacp, false, this.e.zzacw.o.f);
    }
    super.onAdClicked();
  }
  
  public final void onPause()
  {
    this.g.c(this.e.zzacw);
  }
  
  public final void onResume()
  {
    this.g.d(this.e.zzacw);
  }
  
  public void pause()
  {
    n.b("pause must be called on the main UI thread.");
    if ((this.e.zzacw != null) && (this.e.zzacw.b != null) && (this.e.zzfo()))
    {
      zzbv.zzem();
      jt.a(this.e.zzacw.b);
    }
    if ((this.e.zzacw != null) && (this.e.zzacw.p != null)) {}
    try
    {
      this.e.zzacw.p.d();
      this.g.c(this.e.zzacw);
      this.d.pause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        je.e("Could not pause mediation adapter.");
      }
    }
  }
  
  public final void recordImpression()
  {
    a(this.e.zzacw, false);
  }
  
  public void resume()
  {
    n.b("resume must be called on the main UI thread.");
    ij localij = this.e.zzacw;
    qe localqe1 = null;
    if (localij != null)
    {
      qe localqe2 = this.e.zzacw.b;
      localqe1 = null;
      if (localqe2 != null) {
        localqe1 = this.e.zzacw.b;
      }
    }
    if ((localqe1 != null) && (this.e.zzfo()))
    {
      zzbv.zzem();
      jt.b(this.e.zzacw.b);
    }
    if ((this.e.zzacw != null) && (this.e.zzacw.p != null)) {}
    try
    {
      this.e.zzacw.p.e();
      if ((localqe1 == null) || (!localqe1.B())) {
        this.d.resume();
      }
      this.g.d(this.e.zzacw);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        je.e("Could not resume mediation adapter.");
      }
    }
  }
  
  public void showInterstitial()
  {
    je.e("showInterstitial is not supported for current ad type");
  }
  
  public final void zza(avk paramavk, String paramString)
  {
    if (paramavk != null) {}
    for (;;)
    {
      try
      {
        str = paramavk.l();
        m localm = this.e.l;
        avv localavv = null;
        if (localm != null)
        {
          localavv = null;
          if (str != null) {
            localavv = (avv)this.e.l.get(str);
          }
        }
        if (localavv == null)
        {
          je.e("Mediation adapter invoked onCustomClick but no listeners were set.");
          return;
        }
        localavv.a(paramavk, paramString);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        je.c("Unable to call onCustomClick.", localRemoteException);
        return;
      }
      String str = null;
    }
  }
  
  public final boolean zza(dl paramdl, asn paramasn)
  {
    this.a = paramasn;
    paramasn.a("seq_num", paramdl.g);
    paramasn.a("request_id", paramdl.v);
    paramasn.a("session_id", paramdl.h);
    if (paramdl.f != null) {
      paramasn.a("app_version", String.valueOf(paramdl.f.versionCode));
    }
    zzbw localzzbw = this.e;
    zzbv.zzeg();
    Context localContext = this.e.zzrt;
    amo localamo = this.i.zzxb;
    if (paramdl.b.c.getBundle("sdk_less_server_data") != null) {}
    for (Object localObject = new ec(localContext, paramdl, this, localamo);; localObject = new cp(localContext, paramdl, this, localamo))
    {
      ((iz)localObject).h();
      localzzbw.zzact = ((iz)localObject);
      return true;
    }
  }
  
  protected boolean zza(ij paramij1, ij paramij2)
  {
    if ((paramij1 != null) && (paramij1.s != null)) {
      paramij1.s.a(null);
    }
    if (paramij2.s != null) {
      paramij2.s.a(this);
    }
    int m;
    int i;
    if (paramij2.r != null)
    {
      m = paramij2.r.r;
      i = paramij2.r.s;
    }
    for (;;)
    {
      this.e.zzadt.a(m, i);
      return true;
      i = 0;
      m = 0;
    }
  }
  
  public boolean zza(zzjj paramzzjj, asn paramasn)
  {
    return zza(paramzzjj, paramasn, 1);
  }
  
  public final boolean zza(zzjj paramzzjj, asn paramasn, int paramInt)
  {
    if (!k()) {
      return false;
    }
    zzbv.zzek();
    Context localContext1 = this.e.zzrt;
    alc localalc = zzbv.zzeo().a(localContext1);
    Bundle localBundle;
    in localin;
    String str2;
    if (localalc == null)
    {
      localBundle = null;
      this.d.cancel();
      this.e.zzadv = 0;
      arq localarq = asa.cs;
      if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
        break label181;
      }
      localin = zzbv.zzeo().l().h();
      zzad localzzad = zzbv.zzes();
      Context localContext2 = this.e.zzrt;
      zzang localzzang = this.e.zzacr;
      String str1 = this.e.zzacp;
      if (localin == null) {
        break label175;
      }
      str2 = localin.d();
      label132:
      localzzad.a(localContext2, localzzang, false, localin, str2, str1, null);
    }
    for (;;)
    {
      return zza(a(paramzzjj, localBundle, localin, paramInt), paramasn);
      localBundle = jn.a(localalc);
      break;
      label175:
      str2 = null;
      break label132;
      label181:
      localin = null;
    }
  }
  
  public final void zzb(ij paramij)
  {
    super.zzb(paramij);
    if (paramij.o != null)
    {
      je.b("Disable the debug gesture detector on the mediation ad frame.");
      if (this.e.c != null) {
        this.e.c.zzfu();
      }
      je.b("Pinging network fill URLs.");
      zzbv.zzfd();
      bcd.a(this.e.zzrt, this.e.zzacr.a, paramij, this.e.zzacp, false, paramij.o.j);
      if ((paramij.r != null) && (paramij.r.g != null) && (paramij.r.g.size() > 0))
      {
        je.b("Pinging urls remotely");
        zzbv.zzek().a(this.e.zzrt, paramij.r.g);
      }
    }
    for (;;)
    {
      if ((paramij.d == 3) && (paramij.r != null) && (paramij.r.f != null))
      {
        je.b("Pinging no fill URLs.");
        zzbv.zzfd();
        bcd.a(this.e.zzrt, this.e.zzacr.a, paramij, this.e.zzacp, false, paramij.r.f);
      }
      return;
      je.b("Enable the debug gesture detector on the admob ad frame.");
      if (this.e.c != null) {
        this.e.c.zzft();
      }
    }
  }
  
  public final void zzb(String paramString1, String paramString2)
  {
    onAppEvent(paramString1, paramString2);
  }
  
  public void zzcb()
  {
    this.k = false;
    c_();
    this.e.zzacy.c();
  }
  
  public void zzcc()
  {
    this.k = true;
    f_();
  }
  
  public void zzcd()
  {
    je.e("Mediated ad does not support onVideoEnd callback");
  }
  
  public void zzce()
  {
    onAdClicked();
  }
  
  public final void zzcf()
  {
    zzcb();
  }
  
  public final void zzcg()
  {
    e_();
  }
  
  public final void zzch()
  {
    zzcc();
  }
  
  public final void zzci()
  {
    if (this.e.zzacw != null)
    {
      String str = this.e.zzacw.q;
      je.e(74 + String.valueOf(str).length() + "Mediation adapter " + str + " refreshed, but mediation adapters should never refresh.");
    }
    a(this.e.zzacw, true);
    b(this.e.zzacw, true);
    d();
  }
  
  public void zzcj()
  {
    recordImpression();
  }
  
  public final String zzck()
  {
    if (this.e.zzacw == null) {
      return null;
    }
    return b(this.e.zzacw);
  }
  
  public final void zzcl()
  {
    Executor localExecutor = nk.a;
    zzbl localzzbl = this.d;
    localzzbl.getClass();
    localExecutor.execute(ag.a(localzzbl));
  }
  
  public final void zzcm()
  {
    Executor localExecutor = nk.a;
    zzbl localzzbl = this.d;
    localzzbl.getClass();
    localExecutor.execute(ah.a(localzzbl));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzd
 * JD-Core Version:    0.7.0.1
 */