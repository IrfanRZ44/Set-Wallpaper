package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.agx;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aov;
import com.google.android.gms.internal.ads.aoy;
import com.google.android.gms.internal.ads.apk;
import com.google.android.gms.internal.ads.apo;
import com.google.android.gms.internal.ads.aps;
import com.google.android.gms.internal.ads.apy;
import com.google.android.gms.internal.ads.aqg;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asu;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.lz;
import com.google.android.gms.internal.ads.y;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzbp
  extends apk
{
  private final zzang a;
  private final zzjn b;
  private final Future<agw> c;
  private final Context d;
  private final ae e;
  private WebView f;
  private aoy g;
  private agw h;
  private AsyncTask<Void, Void, String> i;
  
  public zzbp(Context paramContext, zzjn paramzzjn, String paramString, zzang paramzzang)
  {
    this.d = paramContext;
    this.a = paramzzang;
    this.b = paramzzjn;
    this.f = new WebView(this.d);
    this.c = jl.a(new ac(this));
    this.e = new ae(paramString);
    a(0);
    this.f.setVerticalScrollBarEnabled(false);
    this.f.getSettings().setJavaScriptEnabled(true);
    this.f.setWebViewClient(new aa(this));
    this.f.setOnTouchListener(new ab(this));
  }
  
  private final String b(String paramString)
  {
    if (this.h == null) {
      return paramString;
    }
    Object localObject = Uri.parse(paramString);
    try
    {
      Uri localUri = this.h.a((Uri)localObject, this.d, null, null);
      localObject = localUri;
    }
    catch (agx localagx)
    {
      for (;;)
      {
        je.c("Unable to process ad data", localagx);
      }
    }
    return ((Uri)localObject).toString();
  }
  
  private final void c(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    this.d.startActivity(localIntent);
  }
  
  final int a(String paramString)
  {
    String str = Uri.parse(paramString).getQueryParameter("height");
    if (TextUtils.isEmpty(str)) {
      return 0;
    }
    try
    {
      aos.a();
      int j = lz.a(this.d, Integer.parseInt(str));
      return j;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return 0;
  }
  
  final String a()
  {
    Uri.Builder localBuilder1 = new Uri.Builder();
    Uri.Builder localBuilder2 = localBuilder1.scheme("https://");
    arq localarq = asa.cx;
    localBuilder2.appendEncodedPath((String)aos.f().a(localarq));
    localBuilder1.appendQueryParameter("query", this.e.b());
    localBuilder1.appendQueryParameter("pubId", this.e.c());
    Map localMap = this.e.d();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      localBuilder1.appendQueryParameter(str3, (String)localMap.get(str3));
    }
    Object localObject = localBuilder1.build();
    if (this.h != null) {}
    try
    {
      Uri localUri = this.h.a((Uri)localObject, this.d);
      localObject = localUri;
    }
    catch (agx localagx)
    {
      for (;;)
      {
        String str1;
        String str2;
        je.c("Unable to process ad data", localagx);
      }
    }
    str1 = b();
    str2 = ((Uri)localObject).getEncodedQuery();
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "#" + str2;
  }
  
  final void a(int paramInt)
  {
    if (this.f == null) {
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, paramInt);
    this.f.setLayoutParams(localLayoutParams);
  }
  
  final String b()
  {
    String str1 = this.e.a();
    if (TextUtils.isEmpty(str1)) {}
    for (String str2 = "www.google.com";; str2 = str1)
    {
      arq localarq = asa.cx;
      String str3 = (String)aos.f().a(localarq);
      return 8 + String.valueOf(str2).length() + String.valueOf(str3).length() + "https://" + str2 + str3;
    }
  }
  
  public final void destroy()
  {
    n.b("destroy must be called on the main UI thread.");
    this.i.cancel(true);
    this.c.cancel(true);
    this.f.destroy();
    this.f = null;
  }
  
  public final String getAdUnitId()
  {
    throw new IllegalStateException("getAdUnitId not implemented");
  }
  
  public final String getMediationAdapterClassName()
  {
    return null;
  }
  
  public final aqg getVideoController()
  {
    return null;
  }
  
  public final boolean isLoading()
  {
    return false;
  }
  
  public final boolean isReady()
  {
    return false;
  }
  
  public final void pause()
  {
    n.b("pause must be called on the main UI thread.");
  }
  
  public final void resume()
  {
    n.b("resume must be called on the main UI thread.");
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean) {}
  
  public final void setUserId(String paramString)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void showInterstitial()
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void stopLoading() {}
  
  public final void zza(af paramaf, String paramString)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(aov paramaov)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(aoy paramaoy)
  {
    this.g = paramaoy;
  }
  
  public final void zza(apo paramapo)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(aps paramaps)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(apy paramapy)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(asu paramasu)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(gh paramgh)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(y paramy)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(zzjn paramzzjn)
  {
    throw new IllegalStateException("AdSize must be set before initialization");
  }
  
  public final void zza(zzlu paramzzlu)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zza(zzmu paramzzmu)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final boolean zzb(zzjj paramzzjj)
  {
    n.a(this.f, "This Search Ad has already been torn down");
    this.e.a(paramzzjj, this.a);
    this.i = new ad(this, null).execute(new Void[0]);
    return true;
  }
  
  public final Bundle zzba()
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final a zzbj()
  {
    n.b("getAdFrame must be called on the main UI thread.");
    return b.a(this.f);
  }
  
  public final zzjn zzbk()
  {
    return this.b;
  }
  
  public final void zzbm()
  {
    throw new IllegalStateException("Unused method");
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
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzbp
 * JD-Core Version:    0.7.0.1
 */