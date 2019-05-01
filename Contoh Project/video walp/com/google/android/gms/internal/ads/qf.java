package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.s;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzad;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.common.util.l;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public class qf
  extends WebViewClient
  implements rm
{
  private static final String[] b = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] c = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  private boolean A;
  private boolean B;
  private int C;
  private View.OnAttachStateChangeListener D;
  protected hu a;
  private qe d;
  private final HashMap<String, List<zzv<? super qe>>> e = new HashMap();
  private final Object f = new Object();
  private anw g;
  private zzn h;
  private rn i;
  private ro j;
  private zzb k;
  private zzd l;
  private rp m;
  private boolean n = false;
  private zzz o;
  @GuardedBy("mLock")
  private boolean p;
  @GuardedBy("mLock")
  private boolean q;
  @GuardedBy("mLock")
  private ViewTreeObserver.OnGlobalLayoutListener r;
  @GuardedBy("mLock")
  private ViewTreeObserver.OnScrollChangedListener s;
  @GuardedBy("mLock")
  private boolean t;
  private zzt u;
  private final m v;
  private zzx w;
  private d x;
  private o y;
  private rq z;
  
  public qf(qe paramqe, boolean paramBoolean)
  {
    this(paramqe, paramBoolean, new m(paramqe, paramqe.o(), new arl(paramqe.getContext())), null);
  }
  
  private qf(qe paramqe, boolean paramBoolean, m paramm, d paramd)
  {
    this.d = paramqe;
    this.p = paramBoolean;
    this.v = paramm;
    this.x = null;
  }
  
  private final void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    arq localarq = asa.bs;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("err", paramString1);
    localBundle.putString("code", paramString2);
    Uri localUri;
    if (!TextUtils.isEmpty(paramString3))
    {
      localUri = Uri.parse(paramString3);
      if (localUri.getHost() == null) {}
    }
    for (String str = localUri.getHost();; str = "")
    {
      localBundle.putString("host", str);
      zzbv.zzek().a(paramContext, this.d.i().a, "gmob-apps", localBundle, true);
      return;
    }
  }
  
  private final void a(Uri paramUri)
  {
    String str1 = paramUri.getPath();
    List localList = (List)this.e.get(str1);
    if (localList != null)
    {
      zzbv.zzek();
      Map localMap = jn.a(paramUri);
      if (je.a(2))
      {
        String str3 = String.valueOf(str1);
        if (str3.length() != 0) {}
        for (String str4 = "Received GMSG: ".concat(str3);; str4 = new String("Received GMSG: "))
        {
          je.a(str4);
          Iterator localIterator2 = localMap.keySet().iterator();
          while (localIterator2.hasNext())
          {
            String str5 = (String)localIterator2.next();
            String str6 = (String)localMap.get(str5);
            je.a(4 + String.valueOf(str5).length() + String.valueOf(str6).length() + "  " + str5 + ": " + str6);
          }
        }
      }
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext()) {
        ((zzv)localIterator1.next()).zza(this.d, localMap);
      }
    }
    String str2 = String.valueOf(paramUri);
    je.a(32 + String.valueOf(str2).length() + "No GMSG handler found for GMSG: " + str2);
  }
  
  private final void a(View paramView, hu paramhu, int paramInt)
  {
    if ((paramhu.b()) && (paramInt > 0))
    {
      paramhu.a(paramView);
      if (paramhu.b()) {
        jn.a.postDelayed(new qh(this, paramView, paramhu, paramInt), 100L);
      }
    }
  }
  
  private final void a(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    if (this.x != null) {}
    for (boolean bool1 = this.x.a();; bool1 = false)
    {
      zzbv.zzei();
      Context localContext = this.d.getContext();
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      zzl.zza(localContext, paramAdOverlayInfoParcel, bool2);
      if (this.a != null)
      {
        String str = paramAdOverlayInfoParcel.url;
        if ((str == null) && (paramAdOverlayInfoParcel.zzbyl != null)) {
          str = paramAdOverlayInfoParcel.zzbyl.url;
        }
        this.a.a(str);
      }
      return;
    }
  }
  
  private final WebResourceResponse b(String paramString, Map<String, String> paramMap)
  {
    Object localObject = new URL(paramString);
    int i1 = 0;
    int i2 = i1 + 1;
    if (i2 <= 20)
    {
      URLConnection localURLConnection = ((URL)localObject).openConnection();
      localURLConnection.setConnectTimeout(10000);
      localURLConnection.setReadTimeout(10000);
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localURLConnection.addRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
      }
      if (!(localURLConnection instanceof HttpURLConnection)) {
        throw new IOException("Invalid protocol.");
      }
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURLConnection;
      zzbv.zzek().a(this.d.getContext(), this.d.i().a, false, localHttpURLConnection);
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
  
  private final void p()
  {
    if (this.D == null) {
      return;
    }
    this.d.getView().removeOnAttachStateChangeListener(this.D);
  }
  
  private final void q()
  {
    rn localrn;
    if ((this.i != null) && (((this.A) && (this.C <= 0)) || (this.B)))
    {
      localrn = this.i;
      if (this.B) {
        break label64;
      }
    }
    label64:
    for (boolean bool = true;; bool = false)
    {
      localrn.a(bool);
      this.i = null;
      this.d.E();
      return;
    }
  }
  
  protected final WebResourceResponse a(String paramString, Map<String, String> paramMap)
  {
    try
    {
      String str = id.a(paramString, this.d.getContext());
      if (!str.equals(paramString)) {
        return b(str, paramMap);
      }
      zzhl localzzhl = zzhl.a(paramString);
      if (localzzhl != null)
      {
        zzhi localzzhi = zzbv.zzeq().a(localzzhl);
        if ((localzzhi != null) && (localzzhi.a()))
        {
          WebResourceResponse localWebResourceResponse1 = new WebResourceResponse("", "", localzzhi.b());
          return localWebResourceResponse1;
        }
      }
    }
    catch (Exception localException)
    {
      zzbv.zzeo().a(localException, "AdWebViewClient.interceptRequest");
      return null;
      if (md.c())
      {
        arq localarq = asa.bi;
        if (((Boolean)aos.f().a(localarq)).booleanValue())
        {
          WebResourceResponse localWebResourceResponse2 = b(paramString, paramMap);
          return localWebResourceResponse2;
        }
      }
      return null;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      label88:
      break label88;
    }
  }
  
  public final zzx a()
  {
    return this.w;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (this.x != null) {
      this.x.a(paramInt1, paramInt2);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.v.a(paramInt1, paramInt2);
    if (this.x != null) {
      this.x.a(paramInt1, paramInt2, paramBoolean);
    }
  }
  
  public final void a(ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    synchronized (this.f)
    {
      this.q = true;
      this.d.D();
      this.r = paramOnGlobalLayoutListener;
      this.s = paramOnScrollChangedListener;
      return;
    }
  }
  
  public final void a(com.google.android.gms.ads.internal.overlay.zzc paramzzc)
  {
    boolean bool = this.d.x();
    anw localanw;
    zzn localzzn;
    if ((bool) && (!this.d.r().d()))
    {
      localanw = null;
      localzzn = null;
      if (!bool) {
        break label75;
      }
    }
    for (;;)
    {
      a(new AdOverlayInfoParcel(paramzzc, localanw, localzzn, this.u, this.d.i()));
      return;
      localanw = this.g;
      break;
      label75:
      localzzn = this.h;
    }
  }
  
  public final void a(anw paramanw, zzb paramzzb, zzn paramzzn, zzd paramzzd, zzt paramzzt, boolean paramBoolean, zzz paramzzz, zzx paramzzx, o paramo, hu paramhu)
  {
    if (paramzzx == null) {}
    for (zzx localzzx = new zzx(this.d.getContext(), paramhu, null);; localzzx = paramzzx)
    {
      this.x = new d(this.d, paramo);
      this.a = paramhu;
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
      a("/mraid", new zzac(localzzx, this.x, paramo));
      a("/mraidLoaded", this.v);
      a("/open", new zzad(this.d.getContext(), this.d.i(), this.d.w(), paramzzt, paramanw, paramzzb, paramzzd, paramzzn, localzzx, this.x));
      a("/precache", new pt());
      a("/touch", zzf.zzblw);
      a("/video", zzf.zzblz);
      a("/videoMeta", zzf.zzbma);
      if (zzbv.zzfh().a(this.d.getContext())) {
        a("/logScionEvent", new zzab(this.d.getContext()));
      }
      if (paramzzz != null) {
        a("/setInterstitialProperties", new zzy(paramzzz));
      }
      this.g = paramanw;
      this.h = paramzzn;
      this.k = paramzzb;
      this.l = paramzzd;
      this.u = paramzzt;
      this.w = localzzx;
      this.y = paramo;
      this.o = paramzzz;
      this.n = paramBoolean;
      return;
    }
  }
  
  public final void a(rn paramrn)
  {
    this.i = paramrn;
  }
  
  public final void a(ro paramro)
  {
    this.j = paramro;
  }
  
  public final void a(rp paramrp)
  {
    this.m = paramrp;
  }
  
  public final void a(rq paramrq)
  {
    this.z = paramrq;
  }
  
  public final void a(String paramString, zzv<? super qe> paramzzv)
  {
    synchronized (this.f)
    {
      Object localObject3 = (List)this.e.get(paramString);
      if (localObject3 == null)
      {
        localObject3 = new CopyOnWriteArrayList();
        this.e.put(paramString, localObject3);
      }
      ((List)localObject3).add(paramzzv);
      return;
    }
  }
  
  public final void a(String paramString, l<zzv<? super qe>> paraml)
  {
    List localList;
    ArrayList localArrayList;
    synchronized (this.f)
    {
      localList = (List)this.e.get(paramString);
      if (localList == null) {
        return;
      }
      localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        zzv localzzv = (zzv)localIterator.next();
        if (paraml.a(localzzv)) {
          localArrayList.add(localzzv);
        }
      }
    }
    localList.removeAll(localArrayList);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((this.d.x()) && (!this.d.r().d())) {}
    for (anw localanw = null;; localanw = this.g)
    {
      a(new AdOverlayInfoParcel(localanw, this.h, this.u, this.d, paramBoolean, paramInt, this.d.i()));
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.d.x();
    anw localanw;
    Object localObject;
    if ((bool) && (!this.d.r().d()))
    {
      localanw = null;
      localObject = null;
      if (!bool) {
        break label95;
      }
    }
    for (;;)
    {
      a(new AdOverlayInfoParcel(localanw, (zzn)localObject, this.k, this.l, this.u, this.d, paramBoolean, paramInt, paramString, this.d.i()));
      return;
      localanw = this.g;
      break;
      label95:
      localObject = new qk(this.d, this.h);
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.d.x();
    anw localanw;
    if ((bool) && (!this.d.r().d()))
    {
      localanw = null;
      if (!bool) {
        break label97;
      }
    }
    label97:
    for (Object localObject = null;; localObject = new qk(this.d, this.h))
    {
      a(new AdOverlayInfoParcel(localanw, (zzn)localObject, this.k, this.l, this.u, this.d, paramBoolean, paramInt, paramString1, paramString2, this.d.i()));
      return;
      localanw = this.g;
      break;
    }
  }
  
  public final void b(String paramString, zzv<? super qe> paramzzv)
  {
    synchronized (this.f)
    {
      List localList = (List)this.e.get(paramString);
      if (localList == null) {
        return;
      }
      localList.remove(paramzzv);
      return;
    }
  }
  
  public final boolean b()
  {
    synchronized (this.f)
    {
      boolean bool = this.p;
      return bool;
    }
  }
  
  public final boolean c()
  {
    synchronized (this.f)
    {
      boolean bool = this.q;
      return bool;
    }
  }
  
  public final ViewTreeObserver.OnGlobalLayoutListener d()
  {
    synchronized (this.f)
    {
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.r;
      return localOnGlobalLayoutListener;
    }
  }
  
  public final ViewTreeObserver.OnScrollChangedListener e()
  {
    synchronized (this.f)
    {
      ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = this.s;
      return localOnScrollChangedListener;
    }
  }
  
  public final boolean f()
  {
    synchronized (this.f)
    {
      boolean bool = this.t;
      return bool;
    }
  }
  
  public final void g()
  {
    hu localhu = this.a;
    if (localhu != null)
    {
      WebView localWebView = this.d.getWebView();
      if (s.A(localWebView)) {
        a(localWebView, localhu, 10);
      }
    }
    else
    {
      return;
    }
    p();
    this.D = new qj(this, localhu);
    this.d.getView().addOnAttachStateChangeListener(this.D);
  }
  
  public final void h()
  {
    synchronized (this.f)
    {
      this.t = true;
      this.C = (1 + this.C);
      q();
      return;
    }
  }
  
  public final void i()
  {
    this.C = (-1 + this.C);
    q();
  }
  
  public final void j()
  {
    this.B = true;
    q();
  }
  
  public final void k()
  {
    if (this.a != null)
    {
      this.a.d();
      this.a = null;
    }
    p();
    synchronized (this.f)
    {
      this.e.clear();
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = null;
      this.l = null;
      this.n = false;
      this.p = false;
      this.q = false;
      this.t = false;
      this.u = null;
      this.m = null;
      if (this.x != null)
      {
        this.x.a(true);
        this.x = null;
      }
      return;
    }
  }
  
  public final rq l()
  {
    return this.z;
  }
  
  public final hu m()
  {
    return this.a;
  }
  
  public final void n()
  {
    synchronized (this.f)
    {
      this.n = false;
      this.p = true;
      nk.a.execute(new qg(this));
      return;
    }
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "Loading resource: ".concat(str1);; str2 = new String("Loading resource: "))
    {
      je.a(str2);
      Uri localUri = Uri.parse(paramString);
      if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost()))) {
        a(localUri);
      }
      return;
    }
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    synchronized (this.f)
    {
      if (this.d.y())
      {
        je.a("Blank page loaded, 1...");
        this.d.z();
        return;
      }
      this.A = true;
      if (this.j != null)
      {
        this.j.a();
        this.j = null;
      }
      q();
      return;
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if ((paramInt < 0) && (-1 + -paramInt < b.length)) {}
    for (String str = b[(-1 + -paramInt)];; str = String.valueOf(paramInt))
    {
      a(this.d.getContext(), "http_err", str, paramString2);
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      return;
    }
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    int i1;
    if (paramSslError != null)
    {
      i1 = paramSslError.getPrimaryError();
      if ((i1 < 0) || (i1 >= c.length)) {
        break label65;
      }
    }
    label65:
    for (String str = c[i1];; str = String.valueOf(i1))
    {
      a(this.d.getContext(), "ssl_err", str, zzbv.zzem().a(paramSslError));
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      return;
    }
  }
  
  @TargetApi(11)
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    return a(paramString, Collections.emptyMap());
  }
  
  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    String str1 = String.valueOf(paramString);
    String str2;
    Object localObject1;
    if (str1.length() != 0)
    {
      str2 = "AdWebView shouldOverrideUrlLoading: ".concat(str1);
      je.a(str2);
      localObject1 = Uri.parse(paramString);
      if ((!"gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) || (!"mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost()))) {
        break label83;
      }
      a((Uri)localObject1);
    }
    label83:
    label380:
    for (;;)
    {
      return true;
      str2 = new String("AdWebView shouldOverrideUrlLoading: ");
      break;
      if ((this.n) && (paramWebView == this.d.getWebView()))
      {
        String str7 = ((Uri)localObject1).getScheme();
        if (("http".equalsIgnoreCase(str7)) || ("https".equalsIgnoreCase(str7))) {}
        for (int i1 = 1; i1 != 0; i1 = 0)
        {
          if (this.g != null)
          {
            arq localarq = asa.aj;
            if (((Boolean)aos.f().a(localarq)).booleanValue())
            {
              this.g.onAdClicked();
              if (this.a != null) {
                this.a.a(paramString);
              }
              this.g = null;
            }
          }
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
      }
      if (this.d.getWebView().willNotDraw()) {
        break label406;
      }
      try
      {
        agw localagw = this.d.w();
        if ((localagw != null) && (localagw.a((Uri)localObject1)))
        {
          Uri localUri = localagw.a((Uri)localObject1, this.d.getContext(), this.d.getView(), this.d.d());
          localObject1 = localUri;
        }
        localObject2 = localObject1;
      }
      catch (agx localagx)
      {
        Object localObject2;
        String str5 = String.valueOf(paramString);
        if (str5.length() == 0) {
          break label380;
        }
        for (String str6 = "Unable to append parameter to URL: ".concat(str5);; str6 = new String("Unable to append parameter to URL: "))
        {
          je.e(str6);
          localObject2 = localObject1;
          break;
        }
        this.w.zzs(paramString);
      }
      if ((this.w == null) || (this.w.zzcy())) {
        a(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", localObject2.toString(), null, null, null, null, null));
      }
    }
    label406:
    String str3 = String.valueOf(paramString);
    if (str3.length() != 0) {}
    for (String str4 = "AdWebView unable to handle URL: ".concat(str3);; str4 = new String("AdWebView unable to handle URL: "))
    {
      je.e(str4);
      break;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.qf
 * JD-Core Version:    0.7.0.1
 */