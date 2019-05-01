package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzbw;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class ft
  extends zzd
  implements gw
{
  private static ft k;
  private boolean l;
  private boolean m;
  private final hy n;
  private final fq o;
  
  public ft(Context paramContext, zzw paramzzw, zzjn paramzzjn, bck parambck, zzang paramzzang)
  {
    super(paramContext, paramzzjn, null, parambck, paramzzang, paramzzw);
    k = this;
    this.n = new hy(paramContext, null);
    this.o = new fq(this.e, this.j, this, this, this);
  }
  
  private static ik a(ik paramik)
  {
    je.a("Creating mediation ad response for non-mediated rewarded ad.");
    try
    {
      JSONObject localJSONObject1 = et.a(paramik.b);
      localJSONObject1.remove("impression_urls");
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("pubid", paramik.a.e);
      String str = localJSONObject2.toString();
      bbt localbbt = new bbt(localJSONObject1.toString(), null, Arrays.asList(new String[] { "com.google.ads.mediation.admob.AdMobAdapter" }), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), str, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L);
      List localList = Arrays.asList(new bbt[] { localbbt });
      arq localarq = asa.bB;
      bbu localbbu = new bbu(localList, ((Long)aos.f().a(localarq)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false);
      return new ik(paramik.a, paramik.b, localbbu, paramik.d, paramik.e, paramik.f, paramik.g, paramik.h, paramik.i, null);
    }
    catch (JSONException localJSONException)
    {
      je.b("Unable to generate ad state for non-mediated rewarded video.", localJSONException);
    }
    return new ik(paramik.a, paramik.b, null, paramik.d, 0, paramik.f, paramik.g, paramik.h, paramik.i, null);
  }
  
  public static ft i()
  {
    return k;
  }
  
  public final he a(String paramString)
  {
    return this.o.a(paramString);
  }
  
  public final void a()
  {
    if (zzbv.zzfh().e(this.e.zzrt)) {
      this.n.a(true);
    }
    a(this.e.zzacw, false);
    f_();
  }
  
  public final void a(Context paramContext)
  {
    this.o.a(paramContext);
  }
  
  public final void a(zzahk paramzzahk)
  {
    n.b("loadAd must be called on the main UI thread.");
    if (TextUtils.isEmpty(paramzzahk.b))
    {
      je.e("Invalid ad unit id. Aborting.");
      jn.a.post(new fu(this));
      return;
    }
    this.l = false;
    this.e.zzacp = paramzzahk.b;
    this.n.a(paramzzahk.b);
    super.zzb(paramzzahk.a);
  }
  
  protected final boolean a(zzjj paramzzjj, ij paramij, boolean paramBoolean)
  {
    return false;
  }
  
  public final void a_(zzaig paramzzaig)
  {
    zzaig localzzaig = this.o.a(paramzzaig);
    if ((zzbv.zzfh().e(this.e.zzrt)) && (localzzaig != null)) {
      zzbv.zzfh().a(this.e.zzrt, zzbv.zzfh().j(this.e.zzrt), this.e.zzacp, localzzaig.a, localzzaig.b);
    }
    a(localzzaig);
  }
  
  public final void b()
  {
    this.o.g();
    g_();
  }
  
  public final void c()
  {
    if (zzbv.zzfh().e(this.e.zzrt)) {
      this.n.a(false);
    }
    c_();
  }
  
  protected final void c_()
  {
    this.e.zzacw = null;
    super.c_();
  }
  
  public final void d_()
  {
    onAdClicked();
  }
  
  public final void destroy()
  {
    this.o.f();
    super.destroy();
  }
  
  public final void e()
  {
    e_();
  }
  
  public final void f()
  {
    this.o.h();
    h_();
  }
  
  public final void j()
  {
    n.b("showAd must be called on the main UI thread.");
    if (!l())
    {
      je.e("The reward video has not loaded.");
      return;
    }
    this.o.a(this.m);
  }
  
  public final boolean l()
  {
    n.b("isLoaded must be called on the main UI thread.");
    return (this.e.zzact == null) && (this.e.zzacu == null) && (this.e.zzacw != null);
  }
  
  public final void pause()
  {
    this.o.d();
  }
  
  public final void resume()
  {
    this.o.e();
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    n.b("setImmersiveMode must be called on the main UI thread.");
    this.m = paramBoolean;
  }
  
  public final void zza(ik paramik, asn paramasn)
  {
    if (paramik.e != -2)
    {
      jn.a.post(new fv(this, paramik));
      return;
    }
    this.e.zzacx = paramik;
    if (paramik.c == null) {
      this.e.zzacx = a(paramik);
    }
    this.o.c();
  }
  
  public final boolean zza(ij paramij1, ij paramij2)
  {
    b(paramij2, false);
    return fq.a(paramij1, paramij2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ft
 * JD-Core Version:    0.7.0.1
 */