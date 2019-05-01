package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.k;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class aue
  extends aut
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final String[] a = { "2011", "1009", "3010" };
  private final Object b = new Object();
  private final FrameLayout c;
  private FrameLayout d;
  private View e;
  private final boolean f;
  private Map<String, WeakReference<View>> g = Collections.synchronizedMap(new HashMap());
  private View h;
  private atq i;
  private boolean j = false;
  private Point k = new Point();
  private Point l = new Point();
  private WeakReference<akg> m = new WeakReference(null);
  
  @TargetApi(21)
  public aue(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    this.c = paramFrameLayout1;
    this.d = paramFrameLayout2;
    zzbv.zzfg();
    nx.a(this.c, this);
    zzbv.zzfg();
    nx.a(this.c, this);
    this.c.setOnTouchListener(this);
    this.c.setOnClickListener(this);
    if ((paramFrameLayout2 != null) && (k.i())) {
      paramFrameLayout2.setElevation(3.4028235E+38F);
    }
    asa.a(this.c.getContext());
    arq localarq = asa.ci;
    this.f = ((Boolean)aos.f().a(localarq)).booleanValue();
  }
  
  private final int a(int paramInt)
  {
    aos.a();
    return lz.b(this.i.m(), paramInt);
  }
  
  private final void a(View paramView)
  {
    if (this.i != null) {
      if (!(this.i instanceof atp)) {
        break label40;
      }
    }
    label40:
    for (atq localatq = ((atp)this.i).f();; localatq = this.i)
    {
      if (localatq != null) {
        localatq.c(paramView);
      }
      return;
    }
  }
  
  private final void b()
  {
    synchronized (this.b)
    {
      if ((!this.f) && (this.j))
      {
        int n = this.c.getMeasuredWidth();
        int i1 = this.c.getMeasuredHeight();
        if ((n != 0) && (i1 != 0) && (this.d != null))
        {
          this.d.setLayoutParams(new FrameLayout.LayoutParams(n, i1));
          this.j = false;
        }
      }
      return;
    }
  }
  
  public final a a(String paramString)
  {
    for (;;)
    {
      WeakReference localWeakReference;
      synchronized (this.b)
      {
        if (this.g == null) {
          return null;
        }
        localWeakReference = (WeakReference)this.g.get(paramString);
        localObject3 = null;
        if (localWeakReference == null)
        {
          a locala = b.a(localObject3);
          return locala;
        }
      }
      View localView = (View)localWeakReference.get();
      Object localObject3 = localView;
    }
  }
  
  public final void a()
  {
    synchronized (this.b)
    {
      if (this.d != null) {
        this.d.removeAllViews();
      }
      this.d = null;
      this.g = null;
      this.h = null;
      this.i = null;
      this.k = null;
      this.l = null;
      this.m = null;
      this.e = null;
      return;
    }
  }
  
  /* Error */
  public final void a(a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 62	com/google/android/gms/internal/ads/aue:b	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aconst_null
    //   9: invokespecial 225	com/google/android/gms/internal/ads/aue:a	(Landroid/view/View;)V
    //   12: aload_1
    //   13: invokestatic 228	com/google/android/gms/a/b:a	(Lcom/google/android/gms/a/a;)Ljava/lang/Object;
    //   16: astore 4
    //   18: aload 4
    //   20: instanceof 230
    //   23: ifne +11 -> 34
    //   26: ldc 232
    //   28: invokestatic 237	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   31: aload_2
    //   32: monitorexit
    //   33: return
    //   34: aload_0
    //   35: getfield 157	com/google/android/gms/internal/ads/aue:f	Z
    //   38: ifne +33 -> 71
    //   41: aload_0
    //   42: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   45: ifnull +26 -> 71
    //   48: aload_0
    //   49: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   52: new 189	android/widget/FrameLayout$LayoutParams
    //   55: dup
    //   56: iconst_0
    //   57: iconst_0
    //   58: invokespecial 192	android/widget/FrameLayout$LayoutParams:<init>	(II)V
    //   61: invokevirtual 196	android/widget/FrameLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   64: aload_0
    //   65: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   68: invokevirtual 240	android/widget/FrameLayout:requestLayout	()V
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield 75	com/google/android/gms/internal/ads/aue:j	Z
    //   76: aload 4
    //   78: checkcast 230	com/google/android/gms/internal/ads/atv
    //   81: astore 5
    //   83: aload_0
    //   84: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   87: ifnull +42 -> 129
    //   90: getstatic 243	com/google/android/gms/internal/ads/asa:bZ	Lcom/google/android/gms/internal/ads/arq;
    //   93: astore 36
    //   95: invokestatic 145	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   98: aload 36
    //   100: invokevirtual 150	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   103: checkcast 152	java/lang/Boolean
    //   106: invokevirtual 155	java/lang/Boolean:booleanValue	()Z
    //   109: ifeq +20 -> 129
    //   112: aload_0
    //   113: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   116: aload_0
    //   117: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   120: aload_0
    //   121: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   124: invokeinterface 246 3 0
    //   129: aload_0
    //   130: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   133: instanceof 230
    //   136: ifeq +88 -> 224
    //   139: aload_0
    //   140: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   143: checkcast 230	com/google/android/gms/internal/ads/atv
    //   146: astore 33
    //   148: aload 33
    //   150: ifnull +74 -> 224
    //   153: aload 33
    //   155: invokevirtual 247	com/google/android/gms/internal/ads/atv:m	()Landroid/content/Context;
    //   158: ifnull +66 -> 224
    //   161: invokestatic 251	com/google/android/gms/ads/internal/zzbv:zzfh	()Lcom/google/android/gms/internal/ads/hz;
    //   164: aload_0
    //   165: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   168: invokevirtual 131	android/widget/FrameLayout:getContext	()Landroid/content/Context;
    //   171: invokevirtual 256	com/google/android/gms/internal/ads/hz:c	(Landroid/content/Context;)Z
    //   174: ifeq +50 -> 224
    //   177: aload 33
    //   179: invokevirtual 260	com/google/android/gms/internal/ads/atv:n	()Lcom/google/android/gms/internal/ads/hy;
    //   182: astore 34
    //   184: aload 34
    //   186: ifnull +9 -> 195
    //   189: aload 34
    //   191: iconst_0
    //   192: invokevirtual 265	com/google/android/gms/internal/ads/hy:a	(Z)V
    //   195: aload_0
    //   196: getfield 89	com/google/android/gms/internal/ads/aue:m	Ljava/lang/ref/WeakReference;
    //   199: invokevirtual 211	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   202: checkcast 267	com/google/android/gms/internal/ads/akg
    //   205: astore 35
    //   207: aload 35
    //   209: ifnull +15 -> 224
    //   212: aload 34
    //   214: ifnull +10 -> 224
    //   217: aload 35
    //   219: aload 34
    //   221: invokevirtual 270	com/google/android/gms/internal/ads/akg:b	(Lcom/google/android/gms/internal/ads/akk;)V
    //   224: aload_0
    //   225: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   228: instanceof 175
    //   231: ifeq +43 -> 274
    //   234: aload_0
    //   235: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   238: checkcast 175	com/google/android/gms/internal/ads/atp
    //   241: invokevirtual 272	com/google/android/gms/internal/ads/atp:e	()Z
    //   244: ifeq +30 -> 274
    //   247: aload_0
    //   248: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   251: checkcast 175	com/google/android/gms/internal/ads/atp
    //   254: aload 5
    //   256: invokevirtual 275	com/google/android/gms/internal/ads/atp:a	(Lcom/google/android/gms/internal/ads/atq;)V
    //   259: aload_0
    //   260: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   263: ifnonnull +37 -> 300
    //   266: aload_2
    //   267: monitorexit
    //   268: return
    //   269: astore_3
    //   270: aload_2
    //   271: monitorexit
    //   272: aload_3
    //   273: athrow
    //   274: aload_0
    //   275: aload 5
    //   277: putfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   280: aload 5
    //   282: instanceof 175
    //   285: ifeq -26 -> 259
    //   288: aload 5
    //   290: checkcast 175	com/google/android/gms/internal/ads/atp
    //   293: aconst_null
    //   294: invokevirtual 275	com/google/android/gms/internal/ads/atp:a	(Lcom/google/android/gms/internal/ads/atq;)V
    //   297: goto -38 -> 259
    //   300: getstatic 243	com/google/android/gms/internal/ads/asa:bZ	Lcom/google/android/gms/internal/ads/arq;
    //   303: astore 6
    //   305: invokestatic 145	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   308: aload 6
    //   310: invokevirtual 150	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   313: checkcast 152	java/lang/Boolean
    //   316: invokevirtual 155	java/lang/Boolean:booleanValue	()Z
    //   319: ifeq +11 -> 330
    //   322: aload_0
    //   323: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   326: iconst_0
    //   327: invokevirtual 278	android/widget/FrameLayout:setClickable	(Z)V
    //   330: aload_0
    //   331: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   334: invokevirtual 216	android/widget/FrameLayout:removeAllViews	()V
    //   337: aload 5
    //   339: invokevirtual 280	com/google/android/gms/internal/ads/atv:a	()Z
    //   342: istore 7
    //   344: iload 7
    //   346: ifeq +690 -> 1036
    //   349: aload_0
    //   350: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   353: ifnull +711 -> 1064
    //   356: iconst_2
    //   357: anewarray 42	java/lang/String
    //   360: dup
    //   361: iconst_0
    //   362: ldc_w 282
    //   365: aastore
    //   366: dup
    //   367: iconst_1
    //   368: ldc_w 284
    //   371: aastore
    //   372: astore 8
    //   374: iconst_0
    //   375: istore 9
    //   377: iload 9
    //   379: iconst_2
    //   380: if_icmpge +684 -> 1064
    //   383: aload 8
    //   385: iload 9
    //   387: aaload
    //   388: astore 10
    //   390: aload_0
    //   391: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   394: aload 10
    //   396: invokeinterface 203 2 0
    //   401: checkcast 84	java/lang/ref/WeakReference
    //   404: astore 11
    //   406: aload 11
    //   408: ifnull +650 -> 1058
    //   411: aload 11
    //   413: invokevirtual 211	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   416: checkcast 213	android/view/View
    //   419: astore 12
    //   421: aload 12
    //   423: instanceof 286
    //   426: ifeq +610 -> 1036
    //   429: aload 12
    //   431: checkcast 286	android/view/ViewGroup
    //   434: astore 13
    //   436: goto +606 -> 1042
    //   439: aload_0
    //   440: aload 5
    //   442: aload_0
    //   443: iload 14
    //   445: invokevirtual 289	com/google/android/gms/internal/ads/atv:a	(Landroid/view/View$OnClickListener;Z)Landroid/view/View;
    //   448: putfield 218	com/google/android/gms/internal/ads/aue:h	Landroid/view/View;
    //   451: aload_0
    //   452: getfield 218	com/google/android/gms/internal/ads/aue:h	Landroid/view/View;
    //   455: ifnull +53 -> 508
    //   458: aload_0
    //   459: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   462: ifnull +27 -> 489
    //   465: aload_0
    //   466: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   469: ldc_w 291
    //   472: new 84	java/lang/ref/WeakReference
    //   475: dup
    //   476: aload_0
    //   477: getfield 218	com/google/android/gms/internal/ads/aue:h	Landroid/view/View;
    //   480: invokespecial 87	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   483: invokeinterface 295 3 0
    //   488: pop
    //   489: iload 14
    //   491: ifeq +383 -> 874
    //   494: aload 13
    //   496: invokevirtual 296	android/view/ViewGroup:removeAllViews	()V
    //   499: aload 13
    //   501: aload_0
    //   502: getfield 218	com/google/android/gms/internal/ads/aue:h	Landroid/view/View;
    //   505: invokevirtual 299	android/view/ViewGroup:addView	(Landroid/view/View;)V
    //   508: aload 5
    //   510: aload_0
    //   511: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   514: aload_0
    //   515: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   518: aconst_null
    //   519: aload_0
    //   520: aload_0
    //   521: invokevirtual 302	com/google/android/gms/internal/ads/atv:a	(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/view/View$OnTouchListener;Landroid/view/View$OnClickListener;)V
    //   524: aload_0
    //   525: getfield 157	com/google/android/gms/internal/ads/aue:f	Z
    //   528: ifeq +69 -> 597
    //   531: aload_0
    //   532: getfield 220	com/google/android/gms/internal/ads/aue:e	Landroid/view/View;
    //   535: ifnonnull +37 -> 572
    //   538: aload_0
    //   539: new 213	android/view/View
    //   542: dup
    //   543: aload_0
    //   544: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   547: invokevirtual 131	android/widget/FrameLayout:getContext	()Landroid/content/Context;
    //   550: invokespecial 304	android/view/View:<init>	(Landroid/content/Context;)V
    //   553: putfield 220	com/google/android/gms/internal/ads/aue:e	Landroid/view/View;
    //   556: aload_0
    //   557: getfield 220	com/google/android/gms/internal/ads/aue:e	Landroid/view/View;
    //   560: new 189	android/widget/FrameLayout$LayoutParams
    //   563: dup
    //   564: iconst_m1
    //   565: iconst_0
    //   566: invokespecial 192	android/widget/FrameLayout$LayoutParams:<init>	(II)V
    //   569: invokevirtual 305	android/view/View:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   572: aload_0
    //   573: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   576: aload_0
    //   577: getfield 220	com/google/android/gms/internal/ads/aue:e	Landroid/view/View;
    //   580: invokevirtual 309	android/view/View:getParent	()Landroid/view/ViewParent;
    //   583: if_acmpeq +14 -> 597
    //   586: aload_0
    //   587: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   590: aload_0
    //   591: getfield 220	com/google/android/gms/internal/ads/aue:e	Landroid/view/View;
    //   594: invokevirtual 310	android/widget/FrameLayout:addView	(Landroid/view/View;)V
    //   597: aload 5
    //   599: invokevirtual 313	com/google/android/gms/internal/ads/atv:g	()Lcom/google/android/gms/internal/ads/qe;
    //   602: astore 30
    //   604: aload 30
    //   606: astore 17
    //   608: aload 17
    //   610: ifnull +24 -> 634
    //   613: aload_0
    //   614: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   617: ifnull +17 -> 634
    //   620: aload_0
    //   621: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   624: aload 17
    //   626: invokeinterface 319 1 0
    //   631: invokevirtual 310	android/widget/FrameLayout:addView	(Landroid/view/View;)V
    //   634: aload_0
    //   635: getfield 62	com/google/android/gms/internal/ads/aue:b	Ljava/lang/Object;
    //   638: astore 18
    //   640: aload 18
    //   642: monitorenter
    //   643: aload 5
    //   645: aload_0
    //   646: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   649: invokevirtual 322	com/google/android/gms/internal/ads/atv:a	(Ljava/util/Map;)V
    //   652: aload_0
    //   653: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   656: ifnull +318 -> 974
    //   659: getstatic 50	com/google/android/gms/internal/ads/aue:a	[Ljava/lang/String;
    //   662: astore 25
    //   664: aload 25
    //   666: arraylength
    //   667: istore 26
    //   669: iconst_0
    //   670: istore 27
    //   672: iload 27
    //   674: iload 26
    //   676: if_icmpge +298 -> 974
    //   679: aload 25
    //   681: iload 27
    //   683: aaload
    //   684: astore 28
    //   686: aload_0
    //   687: getfield 73	com/google/android/gms/internal/ads/aue:g	Ljava/util/Map;
    //   690: aload 28
    //   692: invokeinterface 203 2 0
    //   697: checkcast 84	java/lang/ref/WeakReference
    //   700: astore 29
    //   702: aload 29
    //   704: ifnull +264 -> 968
    //   707: aload 29
    //   709: invokevirtual 211	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   712: checkcast 213	android/view/View
    //   715: astore 20
    //   717: aload 20
    //   719: instanceof 109
    //   722: ifne +258 -> 980
    //   725: aload 5
    //   727: invokevirtual 324	com/google/android/gms/internal/ads/atv:i	()V
    //   730: aload 18
    //   732: monitorexit
    //   733: aload 5
    //   735: aload_0
    //   736: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   739: invokevirtual 326	com/google/android/gms/internal/ads/atv:d	(Landroid/view/View;)V
    //   742: aload_0
    //   743: aload_0
    //   744: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   747: invokespecial 225	com/google/android/gms/internal/ads/aue:a	(Landroid/view/View;)V
    //   750: aload_0
    //   751: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   754: aload_0
    //   755: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   758: invokeinterface 328 2 0
    //   763: aload_0
    //   764: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   767: instanceof 230
    //   770: ifeq +101 -> 871
    //   773: aload_0
    //   774: getfield 163	com/google/android/gms/internal/ads/aue:i	Lcom/google/android/gms/internal/ads/atq;
    //   777: checkcast 230	com/google/android/gms/internal/ads/atv
    //   780: astore 22
    //   782: aload 22
    //   784: ifnull +87 -> 871
    //   787: aload 22
    //   789: invokevirtual 247	com/google/android/gms/internal/ads/atv:m	()Landroid/content/Context;
    //   792: ifnull +79 -> 871
    //   795: invokestatic 251	com/google/android/gms/ads/internal/zzbv:zzfh	()Lcom/google/android/gms/internal/ads/hz;
    //   798: aload_0
    //   799: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   802: invokevirtual 131	android/widget/FrameLayout:getContext	()Landroid/content/Context;
    //   805: invokevirtual 256	com/google/android/gms/internal/ads/hz:c	(Landroid/content/Context;)Z
    //   808: ifeq +63 -> 871
    //   811: aload_0
    //   812: getfield 89	com/google/android/gms/internal/ads/aue:m	Ljava/lang/ref/WeakReference;
    //   815: invokevirtual 211	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   818: checkcast 267	com/google/android/gms/internal/ads/akg
    //   821: astore 23
    //   823: aload 23
    //   825: ifnonnull +36 -> 861
    //   828: new 267	com/google/android/gms/internal/ads/akg
    //   831: dup
    //   832: aload_0
    //   833: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   836: invokevirtual 131	android/widget/FrameLayout:getContext	()Landroid/content/Context;
    //   839: aload_0
    //   840: getfield 91	com/google/android/gms/internal/ads/aue:c	Landroid/widget/FrameLayout;
    //   843: invokespecial 331	com/google/android/gms/internal/ads/akg:<init>	(Landroid/content/Context;Landroid/view/View;)V
    //   846: astore 23
    //   848: aload_0
    //   849: new 84	java/lang/ref/WeakReference
    //   852: dup
    //   853: aload 23
    //   855: invokespecial 87	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   858: putfield 89	com/google/android/gms/internal/ads/aue:m	Ljava/lang/ref/WeakReference;
    //   861: aload 23
    //   863: aload 22
    //   865: invokevirtual 260	com/google/android/gms/internal/ads/atv:n	()Lcom/google/android/gms/internal/ads/hy;
    //   868: invokevirtual 333	com/google/android/gms/internal/ads/akg:a	(Lcom/google/android/gms/internal/ads/akk;)V
    //   871: aload_2
    //   872: monitorexit
    //   873: return
    //   874: new 335	com/google/android/gms/ads/formats/AdChoicesView
    //   877: dup
    //   878: aload 5
    //   880: invokevirtual 247	com/google/android/gms/internal/ads/atv:m	()Landroid/content/Context;
    //   883: invokespecial 336	com/google/android/gms/ads/formats/AdChoicesView:<init>	(Landroid/content/Context;)V
    //   886: astore 31
    //   888: aload 31
    //   890: new 189	android/widget/FrameLayout$LayoutParams
    //   893: dup
    //   894: iconst_m1
    //   895: iconst_m1
    //   896: invokespecial 192	android/widget/FrameLayout$LayoutParams:<init>	(II)V
    //   899: invokevirtual 337	android/view/ViewGroup:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   902: aload 31
    //   904: aload_0
    //   905: getfield 218	com/google/android/gms/internal/ads/aue:h	Landroid/view/View;
    //   908: invokevirtual 299	android/view/ViewGroup:addView	(Landroid/view/View;)V
    //   911: aload_0
    //   912: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   915: ifnull -407 -> 508
    //   918: aload_0
    //   919: getfield 93	com/google/android/gms/internal/ads/aue:d	Landroid/widget/FrameLayout;
    //   922: aload 31
    //   924: invokevirtual 310	android/widget/FrameLayout:addView	(Landroid/view/View;)V
    //   927: goto -419 -> 508
    //   930: astore 15
    //   932: invokestatic 341	com/google/android/gms/ads/internal/zzbv:zzem	()Lcom/google/android/gms/internal/ads/jt;
    //   935: pop
    //   936: invokestatic 344	com/google/android/gms/internal/ads/jt:e	()Z
    //   939: ifeq +15 -> 954
    //   942: ldc_w 346
    //   945: invokestatic 237	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   948: aconst_null
    //   949: astore 17
    //   951: goto -343 -> 608
    //   954: ldc_w 348
    //   957: aload 15
    //   959: invokestatic 351	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   962: aconst_null
    //   963: astore 17
    //   965: goto -357 -> 608
    //   968: iinc 27 1
    //   971: goto -299 -> 672
    //   974: aconst_null
    //   975: astore 20
    //   977: goto -260 -> 717
    //   980: new 353	com/google/android/gms/internal/ads/auf
    //   983: dup
    //   984: aload_0
    //   985: aload 20
    //   987: invokespecial 356	com/google/android/gms/internal/ads/auf:<init>	(Lcom/google/android/gms/internal/ads/aue;Landroid/view/View;)V
    //   990: astore 21
    //   992: aload 5
    //   994: instanceof 175
    //   997: ifeq +27 -> 1024
    //   1000: aload 5
    //   1002: aload 20
    //   1004: aload 21
    //   1006: invokevirtual 359	com/google/android/gms/internal/ads/atv:b	(Landroid/view/View;Lcom/google/android/gms/internal/ads/ato;)Z
    //   1009: pop
    //   1010: aload 18
    //   1012: monitorexit
    //   1013: goto -280 -> 733
    //   1016: astore 19
    //   1018: aload 18
    //   1020: monitorexit
    //   1021: aload 19
    //   1023: athrow
    //   1024: aload 5
    //   1026: aload 20
    //   1028: aload 21
    //   1030: invokevirtual 362	com/google/android/gms/internal/ads/atv:a	(Landroid/view/View;Lcom/google/android/gms/internal/ads/ato;)V
    //   1033: goto -23 -> 1010
    //   1036: aconst_null
    //   1037: astore 13
    //   1039: goto +3 -> 1042
    //   1042: iload 7
    //   1044: ifeq +26 -> 1070
    //   1047: aload 13
    //   1049: ifnull +21 -> 1070
    //   1052: iconst_1
    //   1053: istore 14
    //   1055: goto -616 -> 439
    //   1058: iinc 9 1
    //   1061: goto -684 -> 377
    //   1064: aconst_null
    //   1065: astore 12
    //   1067: goto -646 -> 421
    //   1070: iconst_0
    //   1071: istore 14
    //   1073: goto -634 -> 439
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1076	0	this	aue
    //   0	1076	1	parama	a
    //   4	868	2	localObject1	Object
    //   269	4	3	localObject2	Object
    //   16	61	4	localObject3	Object
    //   81	944	5	localatv1	atv
    //   303	6	6	localarq1	arq
    //   342	701	7	bool1	boolean
    //   372	12	8	arrayOfString1	String[]
    //   375	684	9	n	int
    //   388	7	10	str1	String
    //   404	8	11	localWeakReference1	WeakReference
    //   419	647	12	localView1	View
    //   434	614	13	localViewGroup	android.view.ViewGroup
    //   443	629	14	bool2	boolean
    //   930	28	15	localException	java.lang.Exception
    //   606	358	17	localqe1	qe
    //   1016	6	19	localObject5	Object
    //   715	312	20	localView2	View
    //   990	39	21	localauf	auf
    //   780	84	22	localatv2	atv
    //   821	41	23	localakg1	akg
    //   662	18	25	arrayOfString2	String[]
    //   667	10	26	i1	int
    //   670	299	27	i2	int
    //   684	7	28	str2	String
    //   700	8	29	localWeakReference2	WeakReference
    //   602	3	30	localqe2	qe
    //   886	37	31	localAdChoicesView	com.google.android.gms.ads.formats.AdChoicesView
    //   146	32	33	localatv3	atv
    //   182	38	34	localhy	hy
    //   205	13	35	localakg2	akg
    //   93	6	36	localarq2	arq
    // Exception table:
    //   from	to	target	type
    //   7	33	269	finally
    //   34	71	269	finally
    //   71	129	269	finally
    //   129	148	269	finally
    //   153	184	269	finally
    //   189	195	269	finally
    //   195	207	269	finally
    //   217	224	269	finally
    //   224	259	269	finally
    //   259	268	269	finally
    //   270	272	269	finally
    //   274	297	269	finally
    //   300	330	269	finally
    //   330	344	269	finally
    //   349	374	269	finally
    //   383	406	269	finally
    //   411	421	269	finally
    //   421	436	269	finally
    //   439	489	269	finally
    //   494	508	269	finally
    //   508	572	269	finally
    //   572	597	269	finally
    //   597	604	269	finally
    //   613	634	269	finally
    //   634	643	269	finally
    //   733	782	269	finally
    //   787	823	269	finally
    //   828	861	269	finally
    //   861	871	269	finally
    //   871	873	269	finally
    //   874	927	269	finally
    //   932	948	269	finally
    //   954	962	269	finally
    //   1021	1024	269	finally
    //   597	604	930	java/lang/Exception
    //   643	669	1016	finally
    //   679	702	1016	finally
    //   707	717	1016	finally
    //   717	733	1016	finally
    //   980	1010	1016	finally
    //   1010	1013	1016	finally
    //   1018	1021	1016	finally
    //   1024	1033	1016	finally
  }
  
  public final void a(a parama, int paramInt)
  {
    if ((zzbv.zzfh().c(this.c.getContext())) && (this.m != null))
    {
      akg localakg = (akg)this.m.get();
      if (localakg != null) {
        localakg.a();
      }
    }
    b();
  }
  
  public final void a(String paramString, a parama)
  {
    View localView = (View)b.a(parama);
    for (;;)
    {
      synchronized (this.b)
      {
        if (this.g == null) {
          return;
        }
        if (localView == null)
        {
          this.g.remove(paramString);
          return;
        }
      }
      this.g.put(paramString, new WeakReference(localView));
      if (("1098".equals(paramString)) || ("3011".equals(paramString))) {
        return;
      }
      localView.setOnTouchListener(this);
      localView.setClickable(true);
      localView.setOnClickListener(this);
    }
  }
  
  public final void b(a parama)
  {
    this.i.a((View)b.a(parama));
  }
  
  public final void onClick(View paramView)
  {
    for (;;)
    {
      Bundle localBundle;
      synchronized (this.b)
      {
        if (this.i == null) {
          return;
        }
        this.i.c();
        localBundle = new Bundle();
        localBundle.putFloat("x", a(this.k.x));
        localBundle.putFloat("y", a(this.k.y));
        localBundle.putFloat("start_x", a(this.l.x));
        localBundle.putFloat("start_y", a(this.l.y));
        if ((this.h == null) || (!this.h.equals(paramView))) {
          break label219;
        }
        if ((this.i instanceof atp))
        {
          if (((atp)this.i).f() != null) {
            ((atp)this.i).f().a(paramView, "1007", localBundle, this.g, this.c);
          }
          return;
        }
      }
      this.i.a(paramView, "1007", localBundle, this.g, this.c);
      continue;
      label219:
      this.i.a(paramView, this.g, localBundle, this.c);
    }
  }
  
  public final void onGlobalLayout()
  {
    synchronized (this.b)
    {
      b();
      if (this.i != null) {
        this.i.c(this.c, this.g);
      }
      return;
    }
  }
  
  public final void onScrollChanged()
  {
    synchronized (this.b)
    {
      if (this.i != null) {
        this.i.c(this.c, this.g);
      }
      b();
      return;
    }
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    synchronized (this.b)
    {
      if (this.i == null) {
        return false;
      }
      int[] arrayOfInt = new int[2];
      this.c.getLocationOnScreen(arrayOfInt);
      float f1 = paramMotionEvent.getRawX() - arrayOfInt[0];
      float f2 = paramMotionEvent.getRawY() - arrayOfInt[1];
      Point localPoint = new Point((int)f1, (int)f2);
      this.k = localPoint;
      if (paramMotionEvent.getAction() == 0) {
        this.l = localPoint;
      }
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent.setLocation(localPoint.x, localPoint.y);
      this.i.a(localMotionEvent);
      localMotionEvent.recycle();
      return false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aue
 * JD-Core Version:    0.7.0.1
 */