package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
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
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
final class sa
  extends sf
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, azi, qe
{
  private WeakReference<View.OnClickListener> A;
  @GuardedBy("this")
  private zzd B;
  private ly C;
  private int D = -1;
  private int E = -1;
  private int F = -1;
  private int G = -1;
  private float H;
  private Map<String, pp> I;
  private final WindowManager J;
  private final agw b;
  private final zzang c;
  private final zzbo d;
  private final zzw e;
  private rt f;
  @GuardedBy("this")
  private zzd g;
  @GuardedBy("this")
  private rs h;
  @GuardedBy("this")
  private String i;
  @GuardedBy("this")
  private boolean j;
  @GuardedBy("this")
  private boolean k;
  @GuardedBy("this")
  private boolean l;
  @GuardedBy("this")
  private int m;
  @GuardedBy("this")
  private boolean n = true;
  @GuardedBy("this")
  private boolean o = false;
  @GuardedBy("this")
  private String p = "";
  @GuardedBy("this")
  private qu q;
  @GuardedBy("this")
  private boolean r;
  @GuardedBy("this")
  private boolean s;
  @GuardedBy("this")
  private ato t;
  @GuardedBy("this")
  private int u;
  @GuardedBy("this")
  private int v;
  private asl w;
  private asl x;
  private asl y;
  private asm z;
  
  private sa(rr paramrr, rs paramrs, String paramString, boolean paramBoolean1, boolean paramBoolean2, agw paramagw, zzang paramzzang, asn paramasn, zzbo paramzzbo, zzw paramzzw, amj paramamj)
  {
    super(paramrr);
    this.h = paramrs;
    this.i = paramString;
    this.k = paramBoolean1;
    this.m = -1;
    this.b = paramagw;
    this.c = paramzzang;
    this.d = paramzzbo;
    this.e = paramzzw;
    this.J = ((WindowManager)getContext().getSystemService("window"));
    this.C = new ly(I().a(), this, this, null);
    zzbv.zzek().a(paramrr, paramzzang.a, getSettings());
    setDownloadListener(this);
    this.H = I().getResources().getDisplayMetrics().density;
    M();
    if (k.e()) {
      addJavascriptInterface(qx.a(this), "googleAdsJsInterface");
    }
    Q();
    this.z = new asm(new asn(true, "make_wv", this.i));
    this.z.a().a(paramasn);
    this.x = asg.a(this.z.a());
    this.z.a("native:view_create", this.x);
    this.y = null;
    this.w = null;
    zzbv.zzem().b(paramrr);
  }
  
  private final boolean K()
  {
    if ((!((rt)this.f).b()) && (!((rt)this.f).c())) {
      return false;
    }
    zzbv.zzek();
    DisplayMetrics localDisplayMetrics = jn.a(this.J);
    aos.a();
    int i1 = lz.b(localDisplayMetrics, localDisplayMetrics.widthPixels);
    aos.a();
    int i2 = lz.b(localDisplayMetrics, localDisplayMetrics.heightPixels);
    Activity localActivity = I().a();
    int i3;
    int i4;
    if ((localActivity == null) || (localActivity.getWindow() == null))
    {
      i3 = i2;
      i4 = i1;
      label98:
      if ((this.E == i1) && (this.D == i2) && (this.F == i4) && (this.G == i3)) {
        break label257;
      }
      if ((this.E == i1) && (this.D == i2)) {
        break label259;
      }
    }
    label257:
    label259:
    for (boolean bool = true;; bool = false)
    {
      this.E = i1;
      this.D = i2;
      this.F = i4;
      this.G = i3;
      new n(this).a(i1, i2, i4, i3, localDisplayMetrics.density, this.J.getDefaultDisplay().getRotation());
      return bool;
      zzbv.zzek();
      int[] arrayOfInt = jn.a(localActivity);
      aos.a();
      i4 = lz.b(localDisplayMetrics, arrayOfInt[0]);
      aos.a();
      i3 = lz.b(localDisplayMetrics, arrayOfInt[1]);
      break label98;
      break;
    }
  }
  
  private final void L()
  {
    asg.a(this.z.a(), this.x, new String[] { "aeh2" });
  }
  
  private final void M()
  {
    for (;;)
    {
      try
      {
        if ((this.k) || (this.h.d()))
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
      if (!this.l) {
        zzbv.zzem().c(this);
      }
      this.l = true;
      return;
    }
    finally {}
  }
  
  private final void O()
  {
    try
    {
      if (this.l) {
        zzbv.zzem().b(this);
      }
      this.l = false;
      return;
    }
    finally {}
  }
  
  private final void P()
  {
    try
    {
      this.I = null;
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
    if (this.z == null) {}
    asn localasn;
    do
    {
      return;
      localasn = this.z.a();
    } while ((localasn == null) || (zzbv.zzeo().b() == null));
    zzbv.zzeo().b().a(localasn);
  }
  
  static sa a(Context paramContext, rs paramrs, String paramString, boolean paramBoolean1, boolean paramBoolean2, agw paramagw, zzang paramzzang, asn paramasn, zzbo paramzzbo, zzw paramzzw, amj paramamj)
  {
    return new sa(new rr(paramContext), paramrs, paramString, paramBoolean1, paramBoolean2, paramagw, paramzzang, paramasn, paramzzbo, paramzzw, paramamj);
  }
  
  private final void g(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("isVisible", str);
      azj.a(this, "onAdVisibilityChanged", localHashMap);
      return;
    }
  }
  
  public final boolean A()
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
  
  public final boolean B()
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
  
  /* Error */
  public final boolean C()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 397	com/google/android/gms/internal/ads/sa:u	I
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
    //   0	27	0	this	sa
    //   22	4	1	localObject	Object
    //   6	2	2	i1	int
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final void D()
  {
    this.C.a();
  }
  
  public final void E()
  {
    if (this.y == null)
    {
      this.y = asg.a(this.z.a());
      this.z.a("native:view_load", this.y);
    }
  }
  
  public final ato F()
  {
    try
    {
      ato localato = this.t;
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
      asg.a(this.z.a(), this.x, new String[] { "aebb2" });
    }
    L();
    if (this.z.a() != null) {
      this.z.a().a("close_type", String.valueOf(paramInt));
    }
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", this.c.a);
    azj.a(this, "onhide", localHashMap);
  }
  
  public final void a(Context paramContext)
  {
    I().setBaseContext(paramContext);
    this.C.a(I().a());
  }
  
  public final void a(zzc paramzzc)
  {
    this.f.a(paramzzc);
  }
  
  public final void a(zzd paramzzd)
  {
    try
    {
      this.g = paramzzd;
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
      this.r = paramakj.a;
      g(paramakj.a);
      return;
    }
    finally {}
  }
  
  public final void a(ato paramato)
  {
    try
    {
      this.t = paramato;
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
    //   3: getfield 460	com/google/android/gms/internal/ads/sa:q	Lcom/google/android/gms/internal/ads/qu;
    //   6: ifnull +12 -> 18
    //   9: ldc_w 462
    //   12: invokestatic 464	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: aload_1
    //   20: putfield 460	com/google/android/gms/internal/ads/sa:q	Lcom/google/android/gms/internal/ads/qu;
    //   23: goto -8 -> 15
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	sa
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
      this.h = paramrs;
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(rt paramrt)
  {
    this.f = paramrt;
  }
  
  public final void a(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    try
    {
      this.p = paramString;
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
    if (this.f != null) {
      this.f.a(paramString, paramzzv);
    }
  }
  
  public final void a(String paramString, l<zzv<? super qe>> paraml)
  {
    if (this.f != null) {
      this.f.a(paramString, paraml);
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    azj.a(this, paramString1, paramString2);
  }
  
  /* Error */
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 487	com/google/android/gms/internal/ads/asa:aB	Lcom/google/android/gms/internal/ads/arq;
    //   5: astore 5
    //   7: invokestatic 490	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   10: aload 5
    //   12: invokevirtual 495	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   15: checkcast 497	java/lang/Boolean
    //   18: invokevirtual 500	java/lang/Boolean:booleanValue	()Z
    //   21: ifeq +41 -> 62
    //   24: iconst_1
    //   25: anewarray 307	java/lang/String
    //   28: astore 7
    //   30: aload 7
    //   32: iconst_0
    //   33: invokestatic 505	com/google/android/gms/internal/ads/rg:a	()Ljava/lang/String;
    //   36: aastore
    //   37: aload_2
    //   38: aload 7
    //   40: invokestatic 508	com/google/android/gms/internal/ads/rg:a	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   43: astore 6
    //   45: aload_0
    //   46: aload_1
    //   47: aload 6
    //   49: ldc_w 510
    //   52: ldc_w 512
    //   55: aload_3
    //   56: invokespecial 516	com/google/android/gms/internal/ads/sf:loadDataWithBaseURL	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: aload_2
    //   63: astore 6
    //   65: goto -20 -> 45
    //   68: astore 4
    //   70: aload_0
    //   71: monitorexit
    //   72: aload 4
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	sa
    //   0	75	1	paramString1	String
    //   0	75	2	paramString2	String
    //   0	75	3	paramString3	String
    //   68	5	4	localObject	Object
    //   5	6	5	localarq	arq
    //   43	21	6	str	String
    //   28	11	7	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   2	45	68	finally
    //   45	59	68	finally
  }
  
  public final void a(String paramString, Map paramMap)
  {
    azj.a(this, paramString, paramMap);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    azj.b(this, paramString, paramJSONObject);
  }
  
  public final void a(boolean paramBoolean)
  {
    ((rt)this.f).a(paramBoolean);
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    this.f.a(paramBoolean, paramInt);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    this.f.a(paramBoolean, paramInt, paramString);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this.f.a(paramBoolean, paramInt, paramString1, paramString2);
  }
  
  public final qu b()
  {
    try
    {
      qu localqu = this.q;
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
      this.B = paramzzd;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 537	com/google/android/gms/internal/ads/sf:y	()Z
    //   6: ifne +11 -> 17
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 538	com/google/android/gms/internal/ads/sf:b	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: ldc_w 540
    //   20: invokestatic 542	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   23: goto -9 -> 14
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	sa
    //   0	31	1	paramString	String
    //   26	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	26	finally
    //   17	23	26	finally
  }
  
  public final void b(String paramString, zzv<? super qe> paramzzv)
  {
    if (this.f != null) {
      this.f.b(paramString, paramzzv);
    }
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    azj.a(this, paramString, paramJSONObject);
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield 98	com/google/android/gms/internal/ads/sa:k	Z
    //   7: if_icmpeq +47 -> 54
    //   10: iconst_1
    //   11: istore_3
    //   12: aload_0
    //   13: iload_1
    //   14: putfield 98	com/google/android/gms/internal/ads/sa:k	Z
    //   17: aload_0
    //   18: invokespecial 186	com/google/android/gms/internal/ads/sa:M	()V
    //   21: iload_3
    //   22: ifeq +29 -> 51
    //   25: new 285	com/google/android/gms/internal/ads/n
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 288	com/google/android/gms/internal/ads/n:<init>	(Lcom/google/android/gms/internal/ads/qe;)V
    //   33: astore 4
    //   35: iload_1
    //   36: ifeq +23 -> 59
    //   39: ldc_w 548
    //   42: astore 5
    //   44: aload 4
    //   46: aload 5
    //   48: invokevirtual 549	com/google/android/gms/internal/ads/n:c	(Ljava/lang/String;)V
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: iconst_0
    //   55: istore_3
    //   56: goto -44 -> 12
    //   59: ldc_w 551
    //   62: astore 5
    //   64: goto -20 -> 44
    //   67: astore_2
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_2
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	sa
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
    return this.x;
  }
  
  /* Error */
  public final void c(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 447	com/google/android/gms/internal/ads/sa:g	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   6: ifnull +21 -> 27
    //   9: aload_0
    //   10: getfield 447	com/google/android/gms/internal/ads/sa:g	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   13: aload_0
    //   14: getfield 252	com/google/android/gms/internal/ads/sa:f	Lcom/google/android/gms/internal/ads/rt;
    //   17: invokevirtual 256	com/google/android/gms/internal/ads/rt:b	()Z
    //   20: iload_1
    //   21: invokevirtual 558	com/google/android/gms/ads/internal/overlay/zzd:zza	(ZZ)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: iload_1
    //   29: putfield 560	com/google/android/gms/internal/ads/sa:j	Z
    //   32: goto -8 -> 24
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	sa
    //   0	40	1	paramBoolean	boolean
    //   35	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	24	35	finally
    //   27	32	35	finally
  }
  
  public final Activity d()
  {
    return I().a();
  }
  
  public final void d(boolean paramBoolean)
  {
    try
    {
      this.n = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
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
    //   3: getfield 397	com/google/android/gms/internal/ads/sa:u	I
    //   6: istore_3
    //   7: iload_1
    //   8: ifeq +38 -> 46
    //   11: iconst_1
    //   12: istore 4
    //   14: aload_0
    //   15: iload 4
    //   17: iload_3
    //   18: iadd
    //   19: putfield 397	com/google/android/gms/internal/ads/sa:u	I
    //   22: aload_0
    //   23: getfield 397	com/google/android/gms/internal/ads/sa:u	I
    //   26: ifgt +17 -> 43
    //   29: aload_0
    //   30: getfield 447	com/google/android/gms/internal/ads/sa:g	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   33: ifnull +10 -> 43
    //   36: aload_0
    //   37: getfield 447	com/google/android/gms/internal/ads/sa:g	Lcom/google/android/gms/ads/internal/overlay/zzd;
    //   40: invokevirtual 564	com/google/android/gms/ads/internal/overlay/zzd:zznq	()V
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
    //   0	57	0	this	sa
    //   0	57	1	paramBoolean	boolean
    //   52	4	2	localObject	Object
    //   6	13	3	i1	int
    //   12	36	4	i2	int
    // Exception table:
    //   from	to	target	type
    //   2	7	52	finally
    //   14	43	52	finally
  }
  
  public final void f()
  {
    zzd localzzd = p();
    if (localzzd != null) {
      localzzd.zznp();
    }
  }
  
  protected final void f(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      Q();
      this.C.b();
      if (this.g != null)
      {
        this.g.close();
        this.g.onDestroy();
        this.g = null;
      }
      this.f.k();
      zzbv.zzff();
      po.a(this);
      P();
      return;
    }
    finally {}
  }
  
  public final String g()
  {
    try
    {
      String str = this.p;
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
    return (View.OnClickListener)this.A.get();
  }
  
  public final int getRequestedOrientation()
  {
    try
    {
      int i1 = this.m;
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
    return this.z;
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
    azj.a(this, "onhide", localHashMap);
  }
  
  public final void m()
  {
    if (this.w == null)
    {
      asg.a(this.z.a(), this.x, new String[] { "aes2" });
      this.w = asg.a(this.z.a());
      this.z.a("native:view_show", this.w);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.c.a);
    azj.a(this, "onshow", localHashMap);
  }
  
  public final void n()
  {
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("app_muted", String.valueOf(zzbv.zzfj().b()));
    localHashMap.put("app_volume", String.valueOf(zzbv.zzfj().a()));
    localHashMap.put("device_volume", String.valueOf(kf.a(getContext())));
    azj.a(this, "volume", localHashMap);
  }
  
  public final Context o()
  {
    return I().b();
  }
  
  protected final void onAttachedToWindow()
  {
    boolean bool1;
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener;
    try
    {
      super.onAttachedToWindow();
      if (!y()) {
        this.C.c();
      }
      bool1 = this.r;
      if (((rt)this.f == null) || (!((rt)this.f).c())) {
        break label146;
      }
      if (this.s) {
        break label131;
      }
      localOnGlobalLayoutListener = ((rt)this.f).d();
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
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = ((rt)this.f).e();
    if (localOnScrollChangedListener != null)
    {
      zzbv.zzfg();
      if (this == null) {
        throw null;
      }
      nx.a(this, localOnScrollChangedListener);
    }
    this.s = true;
    label131:
    K();
    label146:
    for (boolean bool2 = true;; bool2 = bool1)
    {
      g(bool2);
      return;
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    try
    {
      if (!y()) {
        this.C.d();
      }
      super.onDetachedFromWindow();
      if ((this.s) && ((rt)this.f != null) && (((rt)this.f).c()) && (getViewTreeObserver() != null) && (getViewTreeObserver().isAlive()))
      {
        ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = ((rt)this.f).d();
        if (localOnGlobalLayoutListener != null) {
          zzbv.zzem().a(getViewTreeObserver(), localOnGlobalLayoutListener);
        }
        ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = ((rt)this.f).e();
        if (localOnScrollChangedListener != null) {
          getViewTreeObserver().removeOnScrollChangedListener(localOnScrollChangedListener);
        }
        this.s = false;
      }
      g(false);
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
    if ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow())) {}
    do
    {
      return;
      super.onDraw(paramCanvas);
    } while (((rt)this.f == null) || (((rt)this.f).l() == null));
    ((rt)this.f).l().a();
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
    boolean bool = K();
    zzd localzzd = p();
    if ((localzzd != null) && (bool)) {
      localzzd.zznn();
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    float f1;
    for (;;)
    {
      try
      {
        if (y())
        {
          setMeasuredDimension(0, 0);
          return;
        }
        if ((isInEditMode()) || (this.k) || (this.h.e()))
        {
          super.onMeasure(paramInt1, paramInt2);
          continue;
        }
        if (!this.h.f()) {
          break label200;
        }
      }
      finally {}
      qu localqu = b();
      if (localqu == null) {
        break label725;
      }
      f1 = localqu.e();
      if (f1 == 0.0F)
      {
        super.onMeasure(paramInt1, paramInt2);
      }
      else
      {
        int i15 = View.MeasureSpec.getSize(paramInt1);
        int i16 = View.MeasureSpec.getSize(paramInt2);
        int i17 = (int)(f1 * i16);
        int i18 = (int)(i15 / f1);
        if ((i16 == 0) && (i18 != 0))
        {
          i17 = (int)(f1 * i18);
          i16 = i18;
        }
        for (;;)
        {
          setMeasuredDimension(Math.min(i17, i15), Math.min(i18, i16));
          break;
          if ((i15 == 0) && (i17 != 0))
          {
            i18 = (int)(i17 / f1);
            i15 = i17;
          }
        }
        label200:
        if (this.h.c())
        {
          arq localarq2 = asa.cm;
          if ((((Boolean)aos.f().a(localarq2)).booleanValue()) || (!k.e()))
          {
            super.onMeasure(paramInt1, paramInt2);
          }
          else
          {
            a("/contentHeight", new sb(this));
            b("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
            int i13 = View.MeasureSpec.getSize(paramInt1);
            switch (this.v)
            {
            }
            for (int i14 = (int)(this.v * this.H);; i14 = View.MeasureSpec.getSize(paramInt2))
            {
              setMeasuredDimension(i13, i14);
              break;
            }
          }
        }
        else
        {
          if (!this.h.d()) {
            break;
          }
          DisplayMetrics localDisplayMetrics = new DisplayMetrics();
          this.J.getDefaultDisplay().getMetrics(localDisplayMetrics);
          setMeasuredDimension(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
        }
      }
    }
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    label422:
    int i5;
    int i6;
    label449:
    int i8;
    if (i1 != -2147483648) {
      if (i1 == 1073741824)
      {
        break label731;
        if (this.h.b > i5) {
          break label758;
        }
        if (this.h.a <= i6) {
          break label772;
        }
        break label758;
        arq localarq1 = asa.dh;
        if (!((Boolean)aos.f().a(localarq1)).booleanValue()) {
          break label791;
        }
        if ((this.h.b / this.H > i5 / this.H) || (this.h.a / this.H > i6 / this.H)) {
          break label778;
        }
        i8 = 1;
        break label764;
      }
    }
    for (;;)
    {
      label527:
      if (i8 != 0)
      {
        int i9 = (int)(this.h.b / this.H);
        int i10 = (int)(this.h.a / this.H);
        int i11 = (int)(i2 / this.H);
        int i12 = (int)(i4 / this.H);
        je.e(103 + "Not enough space to show ad. Needs " + i9 + "x" + i10 + " dp, but only has " + i11 + "x" + i12 + " dp.");
        if (getVisibility() != 8) {
          setVisibility(4);
        }
        setMeasuredDimension(0, 0);
        break;
      }
      if (getVisibility() != 8) {
        setVisibility(0);
      }
      setMeasuredDimension(this.h.b, this.h.a);
      break;
      label725:
      label731:
      do
      {
        i6 = 2147483647;
        break label422;
        i5 = 2147483647;
        continue;
        f1 = 0.0F;
        break;
        i5 = i2;
      } while ((i3 != -2147483648) && (i3 != 1073741824));
      i6 = i4;
      break label422;
      label758:
      int i7 = 1;
      break label449;
      for (;;)
      {
        label764:
        if (i7 == 0) {
          break label784;
        }
        break label527;
        label772:
        i7 = 0;
        break;
        label778:
        i8 = 0;
      }
      label784:
      i8 = i7;
      continue;
      label791:
      i8 = i7;
    }
  }
  
  public final void onPause()
  {
    try
    {
      if (k.a()) {
        super.onPause();
      }
      return;
    }
    catch (Exception localException)
    {
      je.b("Could not pause webview.", localException);
    }
  }
  
  public final void onResume()
  {
    try
    {
      if (k.a()) {
        super.onResume();
      }
      return;
    }
    catch (Exception localException)
    {
      je.b("Could not resume webview.", localException);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (((rt)this.f).c()) {}
    for (;;)
    {
      try
      {
        if (this.t != null) {
          this.t.a(paramMotionEvent);
        }
        return super.onTouchEvent(paramMotionEvent);
      }
      finally {}
      if (this.b != null) {
        this.b.a(paramMotionEvent);
      }
    }
  }
  
  public final zzd p()
  {
    try
    {
      zzd localzzd = this.g;
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
      zzd localzzd = this.B;
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
      rs localrs = this.h;
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
      String str = this.i;
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
    this.A = new WeakReference(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public final void setRequestedOrientation(int paramInt)
  {
    try
    {
      this.m = paramInt;
      if (this.g != null) {
        this.g.setRequestedOrientation(this.m);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void stopLoading()
  {
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
    return this.a;
  }
  
  public final boolean v()
  {
    try
    {
      boolean bool = this.j;
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
      boolean bool = this.k;
      return bool;
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
      this.o = true;
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
      this.o = false;
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
 * Qualified Name:     com.google.android.gms.internal.ads.sa
 * JD-Core Version:    0.7.0.1
 */