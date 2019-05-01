package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.k;
import com.google.android.gms.common.util.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
final class qr
  extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, qe
{
  @GuardedBy("this")
  private int A;
  @GuardedBy("this")
  private int B;
  private asl C;
  private asl D;
  private asl E;
  private asm F;
  private WeakReference<View.OnClickListener> G;
  @GuardedBy("this")
  private zzd H;
  @GuardedBy("this")
  private boolean I;
  private ly J;
  private int K = -1;
  private int L = -1;
  private int M = -1;
  private int N = -1;
  private Map<String, pp> O;
  private final WindowManager P;
  private final amj Q;
  private final rr a;
  private final agw b;
  private final zzang c;
  private final zzbo d;
  private final zzw e;
  private final DisplayMetrics f;
  private final float g;
  private boolean h = false;
  private boolean i = false;
  private qf j;
  @GuardedBy("this")
  private zzd k;
  @GuardedBy("this")
  private rs l;
  @GuardedBy("this")
  private String m;
  @GuardedBy("this")
  private boolean n;
  @GuardedBy("this")
  private boolean o;
  @GuardedBy("this")
  private boolean p;
  @GuardedBy("this")
  private boolean q;
  @GuardedBy("this")
  private Boolean r;
  @GuardedBy("this")
  private int s;
  @GuardedBy("this")
  private boolean t = true;
  @GuardedBy("this")
  private boolean u = false;
  @GuardedBy("this")
  private String v = "";
  @GuardedBy("this")
  private qu w;
  @GuardedBy("this")
  private boolean x;
  @GuardedBy("this")
  private boolean y;
  @GuardedBy("this")
  private ato z;
  
  private qr(rr paramrr, rs paramrs, String paramString, boolean paramBoolean1, boolean paramBoolean2, agw paramagw, zzang paramzzang, asn paramasn, zzbo paramzzbo, zzw paramzzw, amj paramamj)
  {
    super(paramrr);
    this.a = paramrr;
    this.l = paramrs;
    this.m = paramString;
    this.p = paramBoolean1;
    this.s = -1;
    this.b = paramagw;
    this.c = paramzzang;
    this.d = paramzzbo;
    this.e = paramzzw;
    this.P = ((WindowManager)getContext().getSystemService("window"));
    zzbv.zzek();
    this.f = jn.a(this.P);
    this.g = this.f.density;
    this.Q = paramamj;
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setAllowFileAccess(false);
    try
    {
      localWebSettings.setJavaScriptEnabled(true);
      localWebSettings.setSavePassword(false);
      localWebSettings.setSupportMultipleWindows(true);
      localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
      if (Build.VERSION.SDK_INT >= 21) {
        localWebSettings.setMixedContentMode(2);
      }
      zzbv.zzek().a(paramrr, paramzzang.a, localWebSettings);
      zzbv.zzem().a(getContext(), localWebSettings);
      setDownloadListener(this);
      M();
      if (k.e()) {
        addJavascriptInterface(qx.a(this), "googleAdsJsInterface");
      }
      if (k.a())
      {
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
      }
      this.J = new ly(this.a.a(), this, this, null);
      R();
      this.F = new asm(new asn(true, "make_wv", this.m));
      this.F.a().a(paramasn);
      this.D = asg.a(this.F.a());
      this.F.a("native:view_create", this.D);
      this.E = null;
      this.C = null;
      zzbv.zzem().b(paramrr);
      zzbv.zzeo().i();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        je.b("Unable to enable Javascript.", localNullPointerException);
      }
    }
  }
  
  private final boolean I()
  {
    if ((!((qf)this.j).b()) && (!((qf)this.j).c())) {
      return false;
    }
    aos.a();
    int i1 = lz.b(this.f, this.f.widthPixels);
    aos.a();
    int i2 = lz.b(this.f, this.f.heightPixels);
    Activity localActivity = this.a.a();
    int i3;
    int i4;
    if ((localActivity == null) || (localActivity.getWindow() == null))
    {
      i3 = i2;
      i4 = i1;
      label96:
      if ((this.L == i1) && (this.K == i2) && (this.M == i4) && (this.N == i3)) {
        break label260;
      }
      if ((this.L == i1) && (this.K == i2)) {
        break label262;
      }
    }
    label260:
    label262:
    for (boolean bool = true;; bool = false)
    {
      this.L = i1;
      this.K = i2;
      this.M = i4;
      this.N = i3;
      new n(this).a(i1, i2, i4, i3, this.f.density, this.P.getDefaultDisplay().getRotation());
      return bool;
      zzbv.zzek();
      int[] arrayOfInt = jn.a(localActivity);
      aos.a();
      i4 = lz.b(this.f, arrayOfInt[0]);
      aos.a();
      i3 = lz.b(this.f, arrayOfInt[1]);
      break label96;
      break;
    }
  }
  
  /* Error */
  private final void J()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 303	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   6: invokevirtual 370	com/google/android/gms/internal/ads/io:c	()Ljava/lang/Boolean;
    //   9: putfield 372	com/google/android/gms/internal/ads/qr:r	Ljava/lang/Boolean;
    //   12: aload_0
    //   13: getfield 372	com/google/android/gms/internal/ads/qr:r	Ljava/lang/Boolean;
    //   16: astore_2
    //   17: aload_2
    //   18: ifnonnull +19 -> 37
    //   21: aload_0
    //   22: ldc_w 374
    //   25: aconst_null
    //   26: invokevirtual 378	com/google/android/gms/internal/ads/qr:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   29: aload_0
    //   30: iconst_1
    //   31: invokestatic 384	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   34: invokespecial 387	com/google/android/gms/internal/ads/qr:a	(Ljava/lang/Boolean;)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: astore_3
    //   41: aload_0
    //   42: iconst_0
    //   43: invokestatic 384	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   46: invokespecial 387	com/google/android/gms/internal/ads/qr:a	(Ljava/lang/Boolean;)V
    //   49: goto -12 -> 37
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	qr
    //   52	4	1	localObject	Object
    //   16	2	2	localBoolean	Boolean
    //   40	1	3	localIllegalStateException	java.lang.IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   21	37	40	java/lang/IllegalStateException
    //   2	17	52	finally
    //   21	37	52	finally
    //   41	49	52	finally
  }
  
  private final Boolean K()
  {
    try
    {
      Boolean localBoolean = this.r;
      return localBoolean;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private final void L()
  {
    asg.a(this.F.a(), this.D, new String[] { "aeh2" });
  }
  
  private final void M()
  {
    for (;;)
    {
      try
      {
        if ((this.p) || (this.l.d()))
        {
          je.b("Enabling hardware acceleration on an overlay.");
          O();
          return;
        }
        if (Build.VERSION.SDK_INT < 18)
        {
          je.b("Disabling hardware acceleration on an AdView.");
          N();
          continue;
        }
        je.b("Enabling hardware acceleration on an AdView.");
      }
      finally {}
      O();
    }
  }
  
  private final void N()
  {
    try
    {
      if (!this.q) {
        zzbv.zzem().c(this);
      }
      this.q = true;
      return;
    }
    finally {}
  }
  
  private final void O()
  {
    try
    {
      if (this.q) {
        zzbv.zzem().b(this);
      }
      this.q = false;
      return;
    }
    finally {}
  }
  
  private final void P()
  {
    try
    {
      if (!this.I)
      {
        this.I = true;
        zzbv.zzeo().j();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private final void Q()
  {
    try
    {
      this.O = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private final void R()
  {
    if (this.F == null) {}
    asn localasn;
    do
    {
      return;
      localasn = this.F.a();
    } while ((localasn == null) || (zzbv.zzeo().b() == null));
    zzbv.zzeo().b().a(localasn);
  }
  
  static qr a(Context paramContext, rs paramrs, String paramString, boolean paramBoolean1, boolean paramBoolean2, agw paramagw, zzang paramzzang, asn paramasn, zzbo paramzzbo, zzw paramzzw, amj paramamj)
  {
    return new qr(new rr(paramContext), paramrs, paramString, paramBoolean1, paramBoolean2, paramagw, paramzzang, paramasn, paramzzbo, paramzzw, paramamj);
  }
  
  private final void a(Boolean paramBoolean)
  {
    try
    {
      this.r = paramBoolean;
      zzbv.zzeo().a(paramBoolean);
      return;
    }
    finally {}
  }
  
  /* Error */
  @TargetApi(19)
  private final void a(String paramString, android.webkit.ValueCallback<String> paramValueCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 444	com/google/android/gms/internal/ads/qr:y	()Z
    //   6: ifne +12 -> 18
    //   9: aload_0
    //   10: aload_1
    //   11: aconst_null
    //   12: invokevirtual 378	com/google/android/gms/internal/ads/qr:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: ldc_w 446
    //   21: invokestatic 448	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   24: goto -9 -> 15
    //   27: astore_3
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_3
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	qr
    //   0	32	1	paramString	String
    //   0	32	2	paramValueCallback	android.webkit.ValueCallback<String>
    //   27	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	15	27	finally
    //   18	24	27	finally
  }
  
  /* Error */
  private final void c(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 444	com/google/android/gms/internal/ads/qr:y	()Z
    //   6: ifne +11 -> 17
    //   9: aload_0
    //   10: aload_1
    //   11: invokevirtual 455	com/google/android/gms/internal/ads/qr:loadUrl	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: ldc_w 446
    //   20: invokestatic 448	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   23: goto -9 -> 14
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	qr
    //   0	31	1	paramString	String
    //   26	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	26	finally
    //   17	23	26	finally
  }
  
  /* Error */
  private final void d(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 464	android/webkit/WebView:loadUrl	(Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: invokestatic 303	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   14: aload_2
    //   15: ldc_w 466
    //   18: invokevirtual 469	com/google/android/gms/internal/ads/io:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   21: ldc_w 471
    //   24: aload_2
    //   25: invokestatic 473	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   28: goto -21 -> 7
    //   31: astore_3
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_3
    //   35: athrow
    //   36: astore_2
    //   37: goto -26 -> 11
    //   40: astore_2
    //   41: goto -30 -> 11
    //   44: astore_2
    //   45: goto -34 -> 11
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	qr
    //   0	48	1	paramString	String
    //   10	15	2	localException	Exception
    //   36	1	2	localNoClassDefFoundError	java.lang.NoClassDefFoundError
    //   40	1	2	localIncompatibleClassChangeError	java.lang.IncompatibleClassChangeError
    //   44	1	2	localUnsatisfiedLinkError	java.lang.UnsatisfiedLinkError
    //   31	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	10	java/lang/Exception
    //   2	7	31	finally
    //   11	28	31	finally
    //   2	7	36	java/lang/NoClassDefFoundError
    //   2	7	40	java/lang/IncompatibleClassChangeError
    //   2	7	44	java/lang/UnsatisfiedLinkError
  }
  
  private final void e(String paramString)
  {
    if (k.g())
    {
      if (K() == null) {
        J();
      }
      if (K().booleanValue())
      {
        a(paramString, null);
        return;
      }
      String str3 = String.valueOf(paramString);
      if (str3.length() != 0) {}
      for (String str4 = "javascript:".concat(str3);; str4 = new String("javascript:"))
      {
        c(str4);
        return;
      }
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "javascript:".concat(str1);; str2 = new String("javascript:"))
    {
      c(str2);
      return;
    }
  }
  
  private final void f(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("isVisible", str);
      a("onAdVisibilityChanged", localHashMap);
      return;
    }
  }
  
  public final boolean A()
  {
    try
    {
      boolean bool = this.t;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final boolean B()
  {
    try
    {
      boolean bool = this.u;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final boolean C()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 523	com/google/android/gms/internal/ads/qr:A	I
    //   6: istore_2
    //   7: iload_2
    //   8: ifle +9 -> 17
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_3
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_3
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	qr
    //   22	4	1	localObject	Object
    //   6	2	2	i1	int
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final void D()
  {
    this.J.a();
  }
  
  public final void E()
  {
    if (this.E == null)
    {
      this.E = asg.a(this.F.a());
      this.F.a("native:view_load", this.E);
    }
  }
  
  public final ato F()
  {
    try
    {
      ato localato = this.z;
      return localato;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void G()
  {
    setBackgroundColor(0);
  }
  
  public final void H()
  {
    je.a("Cannot add text view to inner AdWebView");
  }
  
  public final ou a()
  {
    return null;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 0) {
      asg.a(this.F.a(), this.D, new String[] { "aebb2" });
    }
    L();
    if (this.F.a() != null) {
      this.F.a().a("close_type", String.valueOf(paramInt));
    }
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", this.c.a);
    a("onhide", localHashMap);
  }
  
  public final void a(Context paramContext)
  {
    this.a.setBaseContext(paramContext);
    this.J.a(this.a.a());
  }
  
  public final void a(zzc paramzzc)
  {
    this.j.a(paramzzc);
  }
  
  public final void a(zzd paramzzd)
  {
    try
    {
      this.k = paramzzd;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(akj paramakj)
  {
    try
    {
      this.x = paramakj.a;
      f(paramakj.a);
      return;
    }
    finally {}
  }
  
  public final void a(ato paramato)
  {
    try
    {
      this.z = paramato;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void a(qu paramqu)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 581	com/google/android/gms/internal/ads/qr:w	Lcom/google/android/gms/internal/ads/qu;
    //   6: ifnull +12 -> 18
    //   9: ldc_w 583
    //   12: invokestatic 584	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: aload_1
    //   20: putfield 581	com/google/android/gms/internal/ads/qr:w	Lcom/google/android/gms/internal/ads/qu;
    //   23: goto -8 -> 15
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	qr
    //   0	31	1	paramqu	qu
    //   26	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	15	26	finally
    //   18	23	26	finally
  }
  
  public final void a(rs paramrs)
  {
    try
    {
      this.l = paramrs;
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    try
    {
      this.v = paramString;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(String paramString, zzv<? super qe> paramzzv)
  {
    if (this.j != null) {
      this.j.a(paramString, paramzzv);
    }
  }
  
  public final void a(String paramString, l<zzv<? super qe>> paraml)
  {
    if (this.j != null) {
      this.j.a(paramString, paraml);
    }
  }
  
  /* Error */
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 444	com/google/android/gms/internal/ads/qr:y	()Z
    //   6: ifne +69 -> 75
    //   9: getstatic 601	com/google/android/gms/internal/ads/asa:aB	Lcom/google/android/gms/internal/ads/arq;
    //   12: astore 5
    //   14: invokestatic 604	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   17: aload 5
    //   19: invokevirtual 609	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   22: checkcast 380	java/lang/Boolean
    //   25: invokevirtual 482	java/lang/Boolean:booleanValue	()Z
    //   28: ifeq +41 -> 69
    //   31: iconst_1
    //   32: anewarray 389	java/lang/String
    //   35: astore 7
    //   37: aload 7
    //   39: iconst_0
    //   40: invokestatic 614	com/google/android/gms/internal/ads/rg:a	()Ljava/lang/String;
    //   43: aastore
    //   44: aload_2
    //   45: aload 7
    //   47: invokestatic 617	com/google/android/gms/internal/ads/rg:a	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   50: astore 6
    //   52: aload_0
    //   53: aload_1
    //   54: aload 6
    //   56: ldc_w 619
    //   59: ldc_w 621
    //   62: aload_3
    //   63: invokespecial 625	android/webkit/WebView:loadDataWithBaseURL	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload_0
    //   67: monitorexit
    //   68: return
    //   69: aload_2
    //   70: astore 6
    //   72: goto -20 -> 52
    //   75: ldc_w 446
    //   78: invokestatic 448	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   81: goto -15 -> 66
    //   84: astore 4
    //   86: aload_0
    //   87: monitorexit
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	qr
    //   0	91	1	paramString1	String
    //   0	91	2	paramString2	String
    //   0	91	3	paramString3	String
    //   84	5	4	localObject	Object
    //   12	6	5	localarq	arq
    //   50	21	6	str	String
    //   35	11	7	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   2	52	84	finally
    //   52	66	84	finally
    //   75	81	84	finally
  }
  
  public final void a(String paramString, Map<String, ?> paramMap)
  {
    try
    {
      JSONObject localJSONObject = zzbv.zzek().a(paramMap);
      a(paramString, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      je.e("Could not convert parameters to JSON.");
    }
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      paramJSONObject = new JSONObject();
    }
    String str1 = paramJSONObject.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    localStringBuilder.append(",");
    localStringBuilder.append(str1);
    localStringBuilder.append(");");
    String str2 = String.valueOf(localStringBuilder.toString());
    if (str2.length() != 0) {}
    for (String str3 = "Dispatching AFMA event: ".concat(str2);; str3 = new String("Dispatching AFMA event: "))
    {
      je.b(str3);
      e(localStringBuilder.toString());
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    ((qf)this.j).a(paramBoolean);
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    this.j.a(paramBoolean, paramInt);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    this.j.a(paramBoolean, paramInt, paramString);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this.j.a(paramBoolean, paramInt, paramString1, paramString2);
  }
  
  public final qu b()
  {
    try
    {
      qu localqu = this.w;
      return localqu;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void b(zzd paramzzd)
  {
    try
    {
      this.H = paramzzd;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void b(String paramString)
  {
    e(paramString);
  }
  
  public final void b(String paramString, zzv<? super qe> paramzzv)
  {
    if (this.j != null) {
      this.j.b(paramString, paramzzv);
    }
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      paramJSONObject = new JSONObject();
    }
    String str = paramJSONObject.toString();
    e(3 + String.valueOf(paramString).length() + String.valueOf(str).length() + paramString + "(" + str + ");");
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield 116	com/google/android/gms/internal/ads/qr:p	Z
    //   7: if_icmpeq +47 -> 54
    //   10: iconst_1
    //   11: istore_3
    //   12: aload_0
    //   13: iload_1
    //   14: putfield 116	com/google/android/gms/internal/ads/qr:p	Z
    //   17: aload_0
    //   18: invokespecial 221	com/google/android/gms/internal/ads/qr:M	()V
    //   21: iload_3
    //   22: ifeq +29 -> 51
    //   25: new 346	com/google/android/gms/internal/ads/n
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 349	com/google/android/gms/internal/ads/n:<init>	(Lcom/google/android/gms/internal/ads/qe;)V
    //   33: astore 4
    //   35: iload_1
    //   36: ifeq +23 -> 59
    //   39: ldc_w 681
    //   42: astore 5
    //   44: aload 4
    //   46: aload 5
    //   48: invokevirtual 682	com/google/android/gms/internal/ads/n:c	(Ljava/lang/String;)V
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: iconst_0
    //   55: istore_3
    //   56: goto -44 -> 12
    //   59: ldc_w 684
    //   62: astore 5
    //   64: goto -20 -> 44
    //   67: astore_2
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_2
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	qr
    //   0	72	1	paramBoolean	boolean
    //   67	4	2	localObject	Object
    //   11	45	3	i1	int
    //   33	12	4	localn	n
    //   42	21	5	str	String
    // Exception table:
    //   from	to	target	type
    //   2	10	67	finally
    //   12	21	67	finally
    //   25	35	67	finally
    //   44	51	67	finally
  }
  
  public final asl c()
  {
    return this.D;
  }
  
  /* Error */
  public final void c(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   6: ifnull +21 -> 27
    //   9: aload_0
    //   10: getfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   13: aload_0
    //   14: getfield 316	com/google/android/gms/internal/ads/qr:j	Lcom/google/android/gms/internal/ads/qf;
    //   17: invokevirtual 320	com/google/android/gms/internal/ads/qf:b	()Z
    //   20: iload_1
    //   21: invokevirtual 691	com/google/android/gms/ads/internal/overlay/zzd:zza	(ZZ)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: iload_1
    //   29: putfield 693	com/google/android/gms/internal/ads/qr:n	Z
    //   32: goto -8 -> 24
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	qr
    //   0	40	1	paramBoolean	boolean
    //   35	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	24	35	finally
    //   27	32	35	finally
  }
  
  public final Activity d()
  {
    return this.a.a();
  }
  
  public final void d(boolean paramBoolean)
  {
    try
    {
      this.t = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void destroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 262	com/google/android/gms/internal/ads/qr:R	()V
    //   6: aload_0
    //   7: getfield 259	com/google/android/gms/internal/ads/qr:J	Lcom/google/android/gms/internal/ads/ly;
    //   10: invokevirtual 695	com/google/android/gms/internal/ads/ly:b	()V
    //   13: aload_0
    //   14: getfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   17: ifnull +22 -> 39
    //   20: aload_0
    //   21: getfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   24: invokevirtual 698	com/google/android/gms/ads/internal/overlay/zzd:close	()V
    //   27: aload_0
    //   28: getfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   31: invokevirtual 701	com/google/android/gms/ads/internal/overlay/zzd:onDestroy	()V
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   39: aload_0
    //   40: getfield 316	com/google/android/gms/internal/ads/qr:j	Lcom/google/android/gms/internal/ads/qf;
    //   43: invokevirtual 703	com/google/android/gms/internal/ads/qf:k	()V
    //   46: aload_0
    //   47: getfield 705	com/google/android/gms/internal/ads/qr:o	Z
    //   50: istore_2
    //   51: iload_2
    //   52: ifeq +6 -> 58
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: invokestatic 709	com/google/android/gms/ads/internal/zzbv:zzff	()Lcom/google/android/gms/internal/ads/po;
    //   61: pop
    //   62: aload_0
    //   63: invokestatic 714	com/google/android/gms/internal/ads/po:a	(Lcom/google/android/gms/internal/ads/pd;)Z
    //   66: pop
    //   67: aload_0
    //   68: invokespecial 716	com/google/android/gms/internal/ads/qr:Q	()V
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield 705	com/google/android/gms/internal/ads/qr:o	Z
    //   76: ldc_w 718
    //   79: invokestatic 534	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   82: ldc_w 720
    //   85: invokestatic 534	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   88: aload_0
    //   89: ldc_w 722
    //   92: invokespecial 724	com/google/android/gms/internal/ads/qr:d	(Ljava/lang/String;)V
    //   95: goto -40 -> 55
    //   98: astore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_1
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	qr
    //   98	4	1	localObject	Object
    //   50	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	39	98	finally
    //   39	51	98	finally
    //   58	95	98	finally
  }
  
  public final zzw e()
  {
    return this.e;
  }
  
  /* Error */
  public final void e(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 523	com/google/android/gms/internal/ads/qr:A	I
    //   6: istore_3
    //   7: iload_1
    //   8: ifeq +38 -> 46
    //   11: iconst_1
    //   12: istore 4
    //   14: aload_0
    //   15: iload 4
    //   17: iload_3
    //   18: iadd
    //   19: putfield 523	com/google/android/gms/internal/ads/qr:A	I
    //   22: aload_0
    //   23: getfield 523	com/google/android/gms/internal/ads/qr:A	I
    //   26: ifgt +17 -> 43
    //   29: aload_0
    //   30: getfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   33: ifnull +10 -> 43
    //   36: aload_0
    //   37: getfield 568	com/google/android/gms/internal/ads/qr:k	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   40: invokevirtual 728	com/google/android/gms/ads/internal/overlay/zzd:zznq	()V
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: iconst_m1
    //   47: istore 4
    //   49: goto -35 -> 14
    //   52: astore_2
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	qr
    //   0	57	1	paramBoolean	boolean
    //   52	4	2	localObject	Object
    //   6	13	3	i1	int
    //   12	36	4	i2	int
    // Exception table:
    //   from	to	target	type
    //   2	7	52	finally
    //   14	43	52	finally
  }
  
  /* Error */
  @TargetApi(19)
  public final void evaluateJavascript(String paramString, android.webkit.ValueCallback<String> paramValueCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 444	com/google/android/gms/internal/ads/qr:y	()Z
    //   6: ifeq +23 -> 29
    //   9: ldc_w 446
    //   12: invokestatic 730	com/google/android/gms/internal/ads/je:f	(Ljava/lang/String;)V
    //   15: aload_2
    //   16: ifnull +10 -> 26
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface 736 2 0
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: aload_1
    //   31: aload_2
    //   32: invokespecial 737	android/webkit/WebView:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   35: goto -9 -> 26
    //   38: astore_3
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_3
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	qr
    //   0	43	1	paramString	String
    //   0	43	2	paramValueCallback	android.webkit.ValueCallback<String>
    //   38	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	15	38	finally
    //   19	26	38	finally
    //   29	35	38	finally
  }
  
  public final void f()
  {
    zzd localzzd = p();
    if (localzzd != null) {
      localzzd.zznp();
    }
  }
  
  /* Error */
  protected final void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 705	com/google/android/gms/internal/ads/qr:o	Z
    //   6: ifne +27 -> 33
    //   9: aload_0
    //   10: getfield 316	com/google/android/gms/internal/ads/qr:j	Lcom/google/android/gms/internal/ads/qf;
    //   13: invokevirtual 703	com/google/android/gms/internal/ads/qf:k	()V
    //   16: invokestatic 709	com/google/android/gms/ads/internal/zzbv:zzff	()Lcom/google/android/gms/internal/ads/po;
    //   19: pop
    //   20: aload_0
    //   21: invokestatic 714	com/google/android/gms/internal/ads/po:a	(Lcom/google/android/gms/internal/ads/pd;)Z
    //   24: pop
    //   25: aload_0
    //   26: invokespecial 716	com/google/android/gms/internal/ads/qr:Q	()V
    //   29: aload_0
    //   30: invokespecial 746	com/google/android/gms/internal/ads/qr:P	()V
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_0
    //   36: invokespecial 750	java/lang/Object:finalize	()V
    //   39: return
    //   40: astore_2
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_2
    //   44: athrow
    //   45: astore_1
    //   46: aload_0
    //   47: invokespecial 750	java/lang/Object:finalize	()V
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	qr
    //   45	6	1	localObject1	Object
    //   40	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	33	40	finally
    //   33	35	40	finally
    //   41	43	40	finally
    //   0	2	45	finally
    //   43	45	45	finally
  }
  
  public final String g()
  {
    try
    {
      String str = this.v;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final View.OnClickListener getOnClickListener()
  {
    return (View.OnClickListener)this.G.get();
  }
  
  public final int getRequestedOrientation()
  {
    try
    {
      int i1 = this.s;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final View getView()
  {
    return this;
  }
  
  public final WebView getWebView()
  {
    return this;
  }
  
  public final asm h()
  {
    return this.F;
  }
  
  public final zzang i()
  {
    return this.c;
  }
  
  public final int j()
  {
    return getMeasuredHeight();
  }
  
  public final int k()
  {
    return getMeasuredWidth();
  }
  
  public final void l()
  {
    L();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.c.a);
    a("onhide", localHashMap);
  }
  
  /* Error */
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 444	com/google/android/gms/internal/ads/qr:y	()Z
    //   6: ifne +13 -> 19
    //   9: aload_0
    //   10: aload_1
    //   11: aload_2
    //   12: aload_3
    //   13: invokespecial 778	android/webkit/WebView:loadData	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: ldc_w 446
    //   22: invokestatic 448	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   25: goto -9 -> 16
    //   28: astore 4
    //   30: aload_0
    //   31: monitorexit
    //   32: aload 4
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	qr
    //   0	35	1	paramString1	String
    //   0	35	2	paramString2	String
    //   0	35	3	paramString3	String
    //   28	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	28	finally
    //   19	25	28	finally
  }
  
  /* Error */
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 444	com/google/android/gms/internal/ads/qr:y	()Z
    //   6: ifne +17 -> 23
    //   9: aload_0
    //   10: aload_1
    //   11: aload_2
    //   12: aload_3
    //   13: aload 4
    //   15: aload 5
    //   17: invokespecial 625	android/webkit/WebView:loadDataWithBaseURL	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: ldc_w 446
    //   26: invokestatic 448	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   29: goto -9 -> 20
    //   32: astore 6
    //   34: aload_0
    //   35: monitorexit
    //   36: aload 6
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	qr
    //   0	39	1	paramString1	String
    //   0	39	2	paramString2	String
    //   0	39	3	paramString3	String
    //   0	39	4	paramString4	String
    //   0	39	5	paramString5	String
    //   32	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	32	finally
    //   23	29	32	finally
  }
  
  /* Error */
  public final void loadUrl(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 444	com/google/android/gms/internal/ads/qr:y	()Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifne +40 -> 48
    //   11: aload_0
    //   12: aload_1
    //   13: invokespecial 464	android/webkit/WebView:loadUrl	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore 4
    //   21: invokestatic 303	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   24: aload 4
    //   26: ldc_w 780
    //   29: invokevirtual 469	com/google/android/gms/internal/ads/io:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   32: ldc_w 471
    //   35: aload 4
    //   37: invokestatic 473	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   40: goto -24 -> 16
    //   43: astore_2
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_2
    //   47: athrow
    //   48: ldc_w 446
    //   51: invokestatic 448	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   54: goto -38 -> 16
    //   57: astore 4
    //   59: goto -38 -> 21
    //   62: astore 4
    //   64: goto -43 -> 21
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	qr
    //   0	67	1	paramString	String
    //   43	4	2	localObject	Object
    //   6	2	3	bool	boolean
    //   19	17	4	localException	Exception
    //   57	1	4	localNoClassDefFoundError	java.lang.NoClassDefFoundError
    //   62	1	4	localIncompatibleClassChangeError	java.lang.IncompatibleClassChangeError
    // Exception table:
    //   from	to	target	type
    //   11	16	19	java/lang/Exception
    //   2	7	43	finally
    //   11	16	43	finally
    //   21	40	43	finally
    //   48	54	43	finally
    //   11	16	57	java/lang/NoClassDefFoundError
    //   11	16	62	java/lang/IncompatibleClassChangeError
  }
  
  public final void m()
  {
    if (this.C == null)
    {
      asg.a(this.F.a(), this.D, new String[] { "aes2" });
      this.C = asg.a(this.F.a());
      this.F.a("native:view_show", this.C);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.c.a);
    a("onshow", localHashMap);
  }
  
  public final void n()
  {
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("app_muted", String.valueOf(zzbv.zzfj().b()));
    localHashMap.put("app_volume", String.valueOf(zzbv.zzfj().a()));
    localHashMap.put("device_volume", String.valueOf(kf.a(getContext())));
    a("volume", localHashMap);
  }
  
  public final Context o()
  {
    return this.a.b();
  }
  
  protected final void onAttachedToWindow()
  {
    boolean bool1;
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener;
    try
    {
      super.onAttachedToWindow();
      if (!y()) {
        this.J.c();
      }
      bool1 = this.x;
      if (((qf)this.j == null) || (!((qf)this.j).c())) {
        break label146;
      }
      if (this.y) {
        break label131;
      }
      localOnGlobalLayoutListener = ((qf)this.j).d();
      if (localOnGlobalLayoutListener == null) {
        break label93;
      }
      zzbv.zzfg();
      if (this == null) {
        throw null;
      }
    }
    finally {}
    nx.a(this, localOnGlobalLayoutListener);
    label93:
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = ((qf)this.j).e();
    if (localOnScrollChangedListener != null)
    {
      zzbv.zzfg();
      if (this == null) {
        throw null;
      }
      nx.a(this, localOnScrollChangedListener);
    }
    this.y = true;
    label131:
    I();
    label146:
    for (boolean bool2 = true;; bool2 = bool1)
    {
      f(bool2);
      return;
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    try
    {
      if (!y()) {
        this.J.d();
      }
      super.onDetachedFromWindow();
      if ((this.y) && ((qf)this.j != null) && (((qf)this.j).c()) && (getViewTreeObserver() != null) && (getViewTreeObserver().isAlive()))
      {
        ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = ((qf)this.j).d();
        if (localOnGlobalLayoutListener != null) {
          zzbv.zzem().a(getViewTreeObserver(), localOnGlobalLayoutListener);
        }
        ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = ((qf)this.j).e();
        if (localOnScrollChangedListener != null) {
          getViewTreeObserver().removeOnScrollChangedListener(localOnScrollChangedListener);
        }
        this.y = false;
      }
      f(false);
      return;
    }
    finally {}
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      zzbv.zzek();
      jn.a(getContext(), localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      je.b(51 + String.valueOf(paramString1).length() + String.valueOf(paramString4).length() + "Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }
  
  @TargetApi(21)
  protected final void onDraw(Canvas paramCanvas)
  {
    if (y()) {}
    do
    {
      do
      {
        return;
      } while ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow()));
      super.onDraw(paramCanvas);
    } while (((qf)this.j == null) || (((qf)this.j).l() == null));
    ((qf)this.j).l().a();
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    arq localarq = asa.ay;
    if (((Boolean)aos.f().a(localarq)).booleanValue())
    {
      float f1 = paramMotionEvent.getAxisValue(9);
      float f2 = paramMotionEvent.getAxisValue(10);
      if ((paramMotionEvent.getActionMasked() == 8) && (((f1 > 0.0F) && (!canScrollVertically(-1))) || ((f1 < 0.0F) && (!canScrollVertically(1))) || ((f2 > 0.0F) && (!canScrollHorizontally(-1))) || ((f2 < 0.0F) && (!canScrollHorizontally(1))))) {
        return false;
      }
    }
    return super.onGenericMotionEvent(paramMotionEvent);
  }
  
  public final void onGlobalLayout()
  {
    boolean bool = I();
    zzd localzzd = p();
    if ((localzzd != null) && (bool)) {
      localzzd.zznn();
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    float f2;
    for (;;)
    {
      try
      {
        if (y())
        {
          setMeasuredDimension(0, 0);
          return;
        }
        if ((isInEditMode()) || (this.p) || (this.l.e()))
        {
          super.onMeasure(paramInt1, paramInt2);
          continue;
        }
        if (!this.l.f()) {
          break label200;
        }
      }
      finally {}
      qu localqu = b();
      if (localqu == null) {
        break label760;
      }
      f2 = localqu.e();
      if (f2 == 0.0F)
      {
        super.onMeasure(paramInt1, paramInt2);
      }
      else
      {
        int i15 = View.MeasureSpec.getSize(paramInt1);
        int i16 = View.MeasureSpec.getSize(paramInt2);
        int i17 = (int)(f2 * i16);
        int i18 = (int)(i15 / f2);
        if ((i16 == 0) && (i18 != 0))
        {
          i17 = (int)(f2 * i18);
          i16 = i18;
        }
        for (;;)
        {
          setMeasuredDimension(Math.min(i17, i15), Math.min(i18, i16));
          break;
          if ((i15 == 0) && (i17 != 0))
          {
            i18 = (int)(i17 / f2);
            i15 = i17;
          }
        }
        label200:
        if (this.l.c())
        {
          arq localarq2 = asa.cm;
          if ((((Boolean)aos.f().a(localarq2)).booleanValue()) || (!k.e()))
          {
            super.onMeasure(paramInt1, paramInt2);
          }
          else
          {
            a("/contentHeight", new qs(this));
            e("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
            float f1 = this.f.density;
            int i13 = View.MeasureSpec.getSize(paramInt1);
            switch (this.B)
            {
            }
            for (int i14 = (int)(f1 * this.B);; i14 = View.MeasureSpec.getSize(paramInt2))
            {
              setMeasuredDimension(i13, i14);
              break;
            }
          }
        }
        else
        {
          if (!this.l.d()) {
            break;
          }
          setMeasuredDimension(this.f.widthPixels, this.f.heightPixels);
        }
      }
    }
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    label413:
    int i5;
    int i6;
    label440:
    int i8;
    if (i1 != -2147483648) {
      if (i1 == 1073741824)
      {
        break label766;
        if (this.l.b > i5) {
          break label793;
        }
        if (this.l.a <= i6) {
          break label807;
        }
        break label793;
        arq localarq1 = asa.dh;
        if (!((Boolean)aos.f().a(localarq1)).booleanValue()) {
          break label826;
        }
        if ((this.l.b / this.g > i5 / this.g) || (this.l.a / this.g > i6 / this.g)) {
          break label813;
        }
        i8 = 1;
        break label799;
      }
    }
    for (;;)
    {
      label518:
      if (i8 != 0)
      {
        int i9 = (int)(this.l.b / this.g);
        int i10 = (int)(this.l.a / this.g);
        int i11 = (int)(i2 / this.g);
        int i12 = (int)(i4 / this.g);
        je.e(103 + "Not enough space to show ad. Needs " + i9 + "x" + i10 + " dp, but only has " + i11 + "x" + i12 + " dp.");
        if (getVisibility() != 8) {
          setVisibility(4);
        }
        setMeasuredDimension(0, 0);
        if (this.h) {
          break;
        }
        this.Q.a(aml.a.b.f);
        this.h = true;
        break;
      }
      if (getVisibility() != 8) {
        setVisibility(0);
      }
      if (!this.i)
      {
        this.Q.a(aml.a.b.g);
        this.i = true;
      }
      setMeasuredDimension(this.l.b, this.l.a);
      break;
      label760:
      label766:
      do
      {
        i6 = 2147483647;
        break label413;
        i5 = 2147483647;
        continue;
        f2 = 0.0F;
        break;
        i5 = i2;
      } while ((i3 != -2147483648) && (i3 != 1073741824));
      i6 = i4;
      break label413;
      label793:
      int i7 = 1;
      break label440;
      for (;;)
      {
        label799:
        if (i7 == 0) {
          break label819;
        }
        break label518;
        label807:
        i7 = 0;
        break;
        label813:
        i8 = 0;
      }
      label819:
      i8 = i7;
      continue;
      label826:
      i8 = i7;
    }
  }
  
  public final void onPause()
  {
    if (y()) {}
    for (;;)
    {
      return;
      try
      {
        if (k.a())
        {
          super.onPause();
          return;
        }
      }
      catch (Exception localException)
      {
        je.b("Could not pause webview.", localException);
      }
    }
  }
  
  public final void onResume()
  {
    if (y()) {}
    for (;;)
    {
      return;
      try
      {
        if (k.a())
        {
          super.onResume();
          return;
        }
      }
      catch (Exception localException)
      {
        je.b("Could not resume webview.", localException);
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (((qf)this.j).c()) {}
    for (;;)
    {
      try
      {
        if (this.z != null) {
          this.z.a(paramMotionEvent);
        }
        if (!y()) {
          break;
        }
        return false;
      }
      finally {}
      if (this.b != null) {
        this.b.a(paramMotionEvent);
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final zzd p()
  {
    try
    {
      zzd localzzd = this.k;
      return localzzd;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final zzd q()
  {
    try
    {
      zzd localzzd = this.H;
      return localzzd;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final rs r()
  {
    try
    {
      rs localrs = this.l;
      return localrs;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final String s()
  {
    try
    {
      String str = this.m;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.G = new WeakReference(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public final void setRequestedOrientation(int paramInt)
  {
    try
    {
      this.s = paramInt;
      if (this.k != null) {
        this.k.setRequestedOrientation(this.s);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    if ((paramWebViewClient instanceof qf)) {
      this.j = ((qf)paramWebViewClient);
    }
  }
  
  public final void stopLoading()
  {
    if (y()) {
      return;
    }
    try
    {
      super.stopLoading();
      return;
    }
    catch (Exception localException)
    {
      je.b("Could not stop loading webview.", localException);
    }
  }
  
  public final WebViewClient u()
  {
    return this.j;
  }
  
  public final boolean v()
  {
    try
    {
      boolean bool = this.n;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final agw w()
  {
    return this.b;
  }
  
  public final boolean x()
  {
    try
    {
      boolean bool = this.p;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final boolean y()
  {
    try
    {
      boolean bool = this.o;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void z()
  {
    try
    {
      je.a("Destroying WebView!");
      P();
      jn.a.post(new qt(this));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void zzcl()
  {
    try
    {
      this.u = true;
      if (this.d != null) {
        this.d.zzcl();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void zzcm()
  {
    try
    {
      this.u = false;
      if (this.d != null) {
        this.d.zzcm();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.qr
 * JD-Core Version:    0.7.0.1
 */