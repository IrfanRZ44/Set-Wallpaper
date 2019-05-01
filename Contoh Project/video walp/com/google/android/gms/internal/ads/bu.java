package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@cm
public final class bu
  implements bq<qe>
{
  private ne<qe> a;
  private final zzab b;
  private final atw c;
  private final Context d;
  private final zzang e;
  private final zzbc f;
  private final agw g;
  private String h;
  
  public bu(Context paramContext, zzbc paramzzbc, String paramString, agw paramagw, zzang paramzzang)
  {
    je.d("Webview loading for native ads.");
    this.d = paramContext;
    this.f = paramzzbc;
    this.g = paramagw;
    this.e = paramzzang;
    this.h = paramString;
    zzbv.zzel();
    Context localContext = this.d;
    zzang localzzang = this.e;
    arq localarq = asa.bX;
    ne localne = ql.a(localContext, localzzang, (String)aos.f().a(localarq), this.g, this.f.zzbi());
    this.b = new zzab(this.d);
    this.c = new atw(paramzzbc, paramString);
    this.a = mt.a(localne, new bv(this), nk.b);
    mr.a(this.a, "WebViewNativeAdsUtil.constructor");
  }
  
  public final ne<JSONObject> a(JSONObject paramJSONObject)
  {
    return mt.a(this.a, new bw(this, paramJSONObject), nk.a);
  }
  
  public final void a()
  {
    mt.a(this.a, new cf(this), nk.a);
  }
  
  public final void a(String paramString, zzv<? super qe> paramzzv)
  {
    mt.a(this.a, new cb(this, paramString, paramzzv), nk.a);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    mt.a(this.a, new cd(this, paramString, paramJSONObject), nk.a);
  }
  
  public final ne<JSONObject> b(JSONObject paramJSONObject)
  {
    return mt.a(this.a, new bx(this, paramJSONObject), nk.a);
  }
  
  public final void b(String paramString, zzv<? super qe> paramzzv)
  {
    mt.a(this.a, new cc(this, paramString, paramzzv), nk.a);
  }
  
  public final ne<JSONObject> c(JSONObject paramJSONObject)
  {
    return mt.a(this.a, new by(this, paramJSONObject), nk.a);
  }
  
  public final ne<JSONObject> d(JSONObject paramJSONObject)
  {
    return mt.a(this.a, new bz(this, paramJSONObject), nk.a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bu
 * JD-Core Version:    0.7.0.1
 */