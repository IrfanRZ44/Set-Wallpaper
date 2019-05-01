package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.view.s;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzad;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class rt
  extends azm<qe>
  implements rm, sh, sj, sl, sm
{
  private View.OnAttachStateChangeListener A;
  private qe a;
  private final Object b = new Object();
  private anw c;
  private zzn d;
  private rn e;
  private ro f;
  private zzb g;
  private zzd h;
  private rp i;
  private boolean j = false;
  private zzz k;
  private boolean l;
  private boolean m;
  private ViewTreeObserver.OnGlobalLayoutListener n;
  private ViewTreeObserver.OnScrollChangedListener o;
  private boolean p;
  private zzt q;
  private final m r;
  private zzx s;
  private d t;
  private o u;
  private rq v;
  private hu w;
  private boolean x;
  private boolean y;
  private int z;
  
  public rt(qe paramqe, boolean paramBoolean)
  {
    this(paramqe, paramBoolean, new m(paramqe, paramqe.o(), new arl(paramqe.getContext())), null);
  }
  
  private rt(qe paramqe, boolean paramBoolean, m paramm, d paramd)
  {
    this.a = paramqe;
    this.l = paramBoolean;
    this.r = paramm;
    this.t = null;
  }
  
  private final void a(View paramView, hu paramhu, int paramInt)
  {
    if ((paramhu.b()) && (paramInt > 0))
    {
      paramhu.a(paramView);
      if (paramhu.b()) {
        jn.a.postDelayed(new rv(this, paramView, paramhu, paramInt), 100L);
      }
    }
  }
  
  private final void a(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    if (this.t != null) {}
    for (boolean bool1 = this.t.a();; bool1 = false)
    {
      zzbv.zzei();
      Context localContext = this.a.getContext();
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      zzl.zza(localContext, paramAdOverlayInfoParcel, bool2);
      if (this.w != null)
      {
        String str = paramAdOverlayInfoParcel.url;
        if ((str == null) && (paramAdOverlayInfoParcel.zzbyl != null)) {
          str = paramAdOverlayInfoParcel.zzbyl.url;
        }
        this.w.a(str);
      }
      return;
    }
  }
  
  private final WebResourceResponse e(se paramse)
  {
    Object localObject = new URL(paramse.a);
    int i1 = 0;
    int i2 = i1 + 1;
    if (i2 <= 20)
    {
      URLConnection localURLConnection = ((URL)localObject).openConnection();
      localURLConnection.setConnectTimeout(10000);
      localURLConnection.setReadTimeout(10000);
      Iterator localIterator = paramse.c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localURLConnection.addRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
      }
      if (!(localURLConnection instanceof HttpURLConnection)) {
        throw new IOException("Invalid protocol.");
      }
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURLConnection;
      zzbv.zzek().a(this.a.getContext(), this.a.i().a, false, localHttpURLConnection);
      md localmd = new md();
      localmd.a(localHttpURLConnection, null);
      int i3 = localHttpURLConnection.getResponseCode();
      localmd.a(localHttpURLConnection, i3);
      if ((i3 >= 300) && (i3 < 400))
      {
        String str1 = localHttpURLConnection.getHeaderField("Location");
        if (str1 == null) {
          throw new IOException("Missing Location header in redirect");
        }
        URL localURL = new URL((URL)localObject, str1);
        String str2 = localURL.getProtocol();
        if (str2 == null)
        {
          je.e("Protocol is null");
          return null;
        }
        if ((!str2.equals("http")) && (!str2.equals("https")))
        {
          String str5 = String.valueOf(str2);
          if (str5.length() != 0) {}
          for (String str6 = "Unsupported scheme: ".concat(str5);; str6 = new String("Unsupported scheme: "))
          {
            je.e(str6);
            return null;
          }
        }
        String str3 = String.valueOf(str1);
        if (str3.length() != 0) {}
        for (String str4 = "Redirecting to ".concat(str3);; str4 = new String("Redirecting to "))
        {
          je.b(str4);
          localHttpURLConnection.disconnect();
          i1 = i2;
          localObject = localURL;
          break;
        }
      }
      zzbv.zzek();
      return jn.a(localHttpURLConnection);
    }
    throw new IOException(32 + "Too many redirects (20)");
  }
  
  private final void q()
  {
    if (this.A == null) {
      return;
    }
    this.a.getView().removeOnAttachStateChangeListener(this.A);
  }
  
  private final void r()
  {
    rn localrn;
    if ((this.e != null) && (((this.x) && (this.z <= 0)) || (this.y)))
    {
      localrn = this.e;
      if (this.y) {
        break label64;
      }
    }
    label64:
    for (boolean bool = true;; bool = false)
    {
      localrn.a(bool);
      this.e = null;
      this.a.E();
      return;
    }
  }
  
  public final zzx a()
  {
    return this.s;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (this.t != null) {
      this.t.a(paramInt1, paramInt2);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.r.a(paramInt1, paramInt2);
    if (this.t != null) {
      this.t.a(paramInt1, paramInt2, paramBoolean);
    }
  }
  
  public final void a(ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    synchronized (this.b)
    {
      this.m = true;
      this.a.D();
      this.n = paramOnGlobalLayoutListener;
      this.o = paramOnScrollChangedListener;
      return;
    }
  }
  
  public final void a(com.google.android.gms.ads.internal.overlay.zzc paramzzc)
  {
    boolean bool = this.a.x();
    anw localanw;
    zzn localzzn;
    if ((bool) && (!this.a.r().d()))
    {
      localanw = null;
      localzzn = null;
      if (!bool) {
        break label75;
      }
    }
    for (;;)
    {
      a(new AdOverlayInfoParcel(paramzzc, localanw, localzzn, this.q, this.a.i()));
      return;
      localanw = this.c;
      break;
      label75:
      localzzn = this.d;
    }
  }
  
  public final void a(anw paramanw, zzb paramzzb, zzn paramzzn, zzd paramzzd, zzt paramzzt, boolean paramBoolean, zzz paramzzz, zzx paramzzx, o paramo, hu paramhu)
  {
    if (paramzzx == null) {}
    for (zzx localzzx = new zzx(this.a.getContext(), paramhu, null);; localzzx = paramzzx)
    {
      this.t = new d(this.a, paramo);
      this.w = paramhu;
      arq localarq = asa.aF;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        a("/adMetadata", new zza(paramzzb));
      }
      a("/appEvent", new com.google.android.gms.ads.internal.gmsg.zzc(paramzzd));
      a("/backButton", zzf.zzblx);
      a("/refresh", zzf.zzbly);
      a("/canOpenURLs", zzf.zzblo);
      a("/canOpenIntents", zzf.zzblp);
      a("/click", zzf.zzblq);
      a("/close", zzf.zzblr);
      a("/customClose", zzf.zzbls);
      a("/instrument", zzf.zzbmb);
      a("/delayPageLoaded", zzf.zzbmd);
      a("/delayPageClosed", zzf.zzbme);
      a("/getLocationInfo", zzf.zzbmf);
      a("/httpTrack", zzf.zzblt);
      a("/log", zzf.zzblu);
      a("/mraid", new zzac(localzzx, this.t, paramo));
      a("/mraidLoaded", this.r);
      a("/open", new zzad(this.a.getContext(), this.a.i(), this.a.w(), paramzzt, paramanw, paramzzb, paramzzd, paramzzn, localzzx, this.t));
      a("/precache", new pt());
      a("/touch", zzf.zzblw);
      a("/video", zzf.zzblz);
      a("/videoMeta", zzf.zzbma);
      if (zzbv.zzfh().a(this.a.getContext())) {
        a("/logScionEvent", new zzab(this.a.getContext()));
      }
      if (paramzzz != null) {
        a("/setInterstitialProperties", new zzy(paramzzz));
      }
      this.c = paramanw;
      this.d = paramzzn;
      this.g = paramzzb;
      this.h = paramzzd;
      this.q = paramzzt;
      this.s = localzzx;
      this.u = paramo;
      this.k = paramzzz;
      this.j = paramBoolean;
      return;
    }
  }
  
  public final void a(rn paramrn)
  {
    this.e = paramrn;
  }
  
  public final void a(ro paramro)
  {
    this.f = paramro;
  }
  
  public final void a(rp paramrp)
  {
    this.i = paramrp;
  }
  
  public final void a(rq paramrq)
  {
    this.v = paramrq;
  }
  
  public final void a(se paramse)
  {
    this.x = true;
    if (this.f != null)
    {
      this.f.a();
      this.f = null;
    }
    r();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((this.a.x()) && (!this.a.r().d())) {}
    for (anw localanw = null;; localanw = this.c)
    {
      a(new AdOverlayInfoParcel(localanw, this.d, this.q, this.a, paramBoolean, paramInt, this.a.i()));
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.a.x();
    anw localanw;
    Object localObject;
    if ((bool) && (!this.a.r().d()))
    {
      localanw = null;
      localObject = null;
      if (!bool) {
        break label95;
      }
    }
    for (;;)
    {
      a(new AdOverlayInfoParcel(localanw, (zzn)localObject, this.g, this.h, this.q, this.a, paramBoolean, paramInt, paramString, this.a.i()));
      return;
      localanw = this.c;
      break;
      label95:
      localObject = new rx(this.a, this.d);
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.a.x();
    anw localanw;
    if ((bool) && (!this.a.r().d()))
    {
      localanw = null;
      if (!bool) {
        break label97;
      }
    }
    label97:
    for (Object localObject = null;; localObject = new rx(this.a, this.d))
    {
      a(new AdOverlayInfoParcel(localanw, (zzn)localObject, this.g, this.h, this.q, this.a, paramBoolean, paramInt, paramString1, paramString2, this.a.i()));
      return;
      localanw = this.c;
      break;
    }
  }
  
  public final void b(se paramse)
  {
    a(paramse.b);
  }
  
  public final boolean b()
  {
    synchronized (this.b)
    {
      boolean bool = this.l;
      return bool;
    }
  }
  
  public final boolean c()
  {
    synchronized (this.b)
    {
      boolean bool = this.m;
      return bool;
    }
  }
  
  public final boolean c(se paramse)
  {
    String str1 = String.valueOf(paramse.a);
    if (str1.length() != 0) {}
    Object localObject1;
    for (String str2 = "AdWebView shouldOverrideUrlLoading: ".concat(str1);; str2 = new String("AdWebView shouldOverrideUrlLoading: "))
    {
      je.a(str2);
      localObject1 = paramse.b;
      if (!a((Uri)localObject1)) {
        break;
      }
      return true;
    }
    if (this.j)
    {
      String str7 = ((Uri)localObject1).getScheme();
      if (("http".equalsIgnoreCase(str7)) || ("https".equalsIgnoreCase(str7))) {}
      for (int i1 = 1; i1 != 0; i1 = 0)
      {
        if (this.c != null)
        {
          arq localarq = asa.aj;
          if (((Boolean)aos.f().a(localarq)).booleanValue())
          {
            this.c.onAdClicked();
            if (this.w != null) {
              this.w.a(paramse.a);
            }
            this.c = null;
          }
        }
        return false;
      }
    }
    if (!this.a.getWebView().willNotDraw())
    {
      try
      {
        agw localagw = this.a.w();
        if ((localagw != null) && (localagw.a((Uri)localObject1)))
        {
          Uri localUri = localagw.a((Uri)localObject1, this.a.getContext(), this.a.getView(), this.a.d());
          localObject1 = localUri;
        }
        localObject2 = localObject1;
      }
      catch (agx localagx)
      {
        for (;;)
        {
          Object localObject2;
          String str5 = String.valueOf(paramse.a);
          if (str5.length() != 0) {}
          for (String str6 = "Unable to append parameter to URL: ".concat(str5);; str6 = new String("Unable to append parameter to URL: "))
          {
            je.e(str6);
            localObject2 = localObject1;
            break;
          }
          this.s.zzs(paramse.a);
        }
      }
      if ((this.s == null) || (this.s.zzcy()))
      {
        a(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", localObject2.toString(), null, null, null, null, null));
        return true;
      }
    }
    String str3 = String.valueOf(paramse.a);
    if (str3.length() != 0) {}
    for (String str4 = "AdWebView unable to handle URL: ".concat(str3);; str4 = new String("AdWebView unable to handle URL: "))
    {
      je.e(str4);
      break;
    }
  }
  
  public final ViewTreeObserver.OnGlobalLayoutListener d()
  {
    synchronized (this.b)
    {
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.n;
      return localOnGlobalLayoutListener;
    }
  }
  
  public final WebResourceResponse d(se paramse)
  {
    if (this.w != null) {
      this.w.a(paramse.a, paramse.c, 1);
    }
    WebResourceResponse localWebResourceResponse1;
    if (!"mraid.js".equalsIgnoreCase(new File(paramse.a).getName()))
    {
      localWebResourceResponse1 = null;
      if (localWebResourceResponse1 != null) {
        return localWebResourceResponse1;
      }
    }
    else
    {
      n();
      String str;
      if (this.a.r().d())
      {
        arq localarq4 = asa.K;
        str = (String)aos.f().a(localarq4);
      }
      for (;;)
      {
        zzbv.zzek();
        localWebResourceResponse1 = jn.c(this.a.getContext(), this.a.i().a, str);
        break;
        if (this.a.x())
        {
          arq localarq3 = asa.J;
          str = (String)aos.f().a(localarq3);
        }
        else
        {
          arq localarq1 = asa.I;
          str = (String)aos.f().a(localarq1);
        }
      }
    }
    try
    {
      if (!id.a(paramse.a, this.a.getContext()).equals(paramse.a)) {
        return e(paramse);
      }
      zzhl localzzhl = zzhl.a(paramse.a);
      if (localzzhl != null)
      {
        zzhi localzzhi = zzbv.zzeq().a(localzzhl);
        if ((localzzhi != null) && (localzzhi.a()))
        {
          WebResourceResponse localWebResourceResponse2 = new WebResourceResponse("", "", localzzhi.b());
          return localWebResourceResponse2;
        }
      }
    }
    catch (Exception localException)
    {
      zzbv.zzeo().a(localException, "AdWebViewClient.interceptRequest");
      return null;
      if (md.c())
      {
        arq localarq2 = asa.bi;
        if (((Boolean)aos.f().a(localarq2)).booleanValue())
        {
          WebResourceResponse localWebResourceResponse3 = e(paramse);
          return localWebResourceResponse3;
        }
      }
      return null;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      label273:
      break label273;
    }
  }
  
  public final ViewTreeObserver.OnScrollChangedListener e()
  {
    synchronized (this.b)
    {
      ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = this.o;
      return localOnScrollChangedListener;
    }
  }
  
  public final boolean f()
  {
    synchronized (this.b)
    {
      boolean bool = this.p;
      return bool;
    }
  }
  
  public final void g()
  {
    hu localhu = this.w;
    if (localhu != null)
    {
      WebView localWebView = this.a.getWebView();
      if (s.A(localWebView)) {
        a(localWebView, localhu, 10);
      }
    }
    else
    {
      return;
    }
    q();
    this.A = new rw(this, localhu);
    this.a.getView().addOnAttachStateChangeListener(this.A);
  }
  
  public final void h()
  {
    synchronized (this.b)
    {
      this.p = true;
      this.z = (1 + this.z);
      r();
      return;
    }
  }
  
  public final void i()
  {
    this.z = (-1 + this.z);
    r();
  }
  
  public final void j()
  {
    this.y = true;
    r();
  }
  
  public final void k()
  {
    if (this.w != null)
    {
      this.w.d();
      this.w = null;
    }
    q();
    super.k();
    synchronized (this.b)
    {
      this.c = null;
      this.d = null;
      this.e = null;
      this.f = null;
      this.g = null;
      this.h = null;
      this.j = false;
      this.l = false;
      this.m = false;
      this.p = false;
      this.q = null;
      this.i = null;
      if (this.t != null)
      {
        this.t.a(true);
        this.t = null;
      }
      return;
    }
  }
  
  public final rq l()
  {
    return this.v;
  }
  
  public final hu m()
  {
    return this.w;
  }
  
  public final void n()
  {
    synchronized (this.b)
    {
      this.j = false;
      this.l = true;
      nk.a.execute(new ru(this));
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.rt
 * JD-Core Version:    0.7.0.1
 */