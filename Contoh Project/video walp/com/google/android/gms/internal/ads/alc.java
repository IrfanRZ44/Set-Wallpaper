package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.k;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
@TargetApi(14)
public final class alc
  extends Thread
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = false;
  private final Object d;
  private final akx e;
  private final ck f;
  private final int g;
  private final int h;
  private final int i;
  private final int j;
  private final int k;
  private final int l;
  private final int m;
  private final int n;
  private final String o;
  private final boolean p;
  
  public alc(akx paramakx, ck paramck)
  {
    this.e = paramakx;
    this.f = paramck;
    this.d = new Object();
    arq localarq1 = asa.R;
    this.h = ((Integer)aos.f().a(localarq1)).intValue();
    arq localarq2 = asa.S;
    this.i = ((Integer)aos.f().a(localarq2)).intValue();
    arq localarq3 = asa.T;
    this.j = ((Integer)aos.f().a(localarq3)).intValue();
    arq localarq4 = asa.U;
    this.k = ((Integer)aos.f().a(localarq4)).intValue();
    arq localarq5 = asa.X;
    this.l = ((Integer)aos.f().a(localarq5)).intValue();
    arq localarq6 = asa.Z;
    this.m = ((Integer)aos.f().a(localarq6)).intValue();
    arq localarq7 = asa.aa;
    this.n = ((Integer)aos.f().a(localarq7)).intValue();
    arq localarq8 = asa.V;
    this.g = ((Integer)aos.f().a(localarq8)).intValue();
    arq localarq9 = asa.ac;
    this.o = ((String)aos.f().a(localarq9));
    arq localarq10 = asa.ae;
    this.p = ((Boolean)aos.f().a(localarq10)).booleanValue();
    setName("ContentFetchTask");
  }
  
  private final alg a(View paramView, akw paramakw)
  {
    int i1 = 0;
    if (paramView == null) {
      return new alg(this, 0, 0);
    }
    boolean bool = paramView.getGlobalVisibleRect(new Rect());
    if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
    {
      CharSequence localCharSequence = ((TextView)paramView).getText();
      if (!TextUtils.isEmpty(localCharSequence))
      {
        paramakw.b(localCharSequence.toString(), bool, paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
        return new alg(this, 1, 0);
      }
      return new alg(this, 0, 0);
    }
    if (((paramView instanceof WebView)) && (!(paramView instanceof qe)))
    {
      paramakw.g();
      WebView localWebView = (WebView)paramView;
      if (!k.g()) {}
      for (int i4 = 0; i4 != 0; i4 = 1)
      {
        return new alg(this, 0, 1);
        paramakw.g();
        localWebView.post(new ale(this, paramakw, localWebView, bool));
      }
      return new alg(this, 0, 0);
    }
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i2 = 0;
      int i3 = 0;
      while (i2 < localViewGroup.getChildCount())
      {
        alg localalg = a(localViewGroup.getChildAt(i2), paramakw);
        i3 += localalg.a;
        i1 += localalg.b;
        i2++;
      }
      return new alg(this, i3, i1);
    }
    return new alg(this, 0, 0);
  }
  
  private static boolean e()
  {
    int i1;
    label170:
    do
    {
      try
      {
        Context localContext = zzbv.zzen().b();
        if (localContext == null) {
          return false;
        }
        ActivityManager localActivityManager = (ActivityManager)localContext.getSystemService("activity");
        KeyguardManager localKeyguardManager = (KeyguardManager)localContext.getSystemService("keyguard");
        if ((localActivityManager != null) && (localKeyguardManager != null))
        {
          List localList = localActivityManager.getRunningAppProcesses();
          if (localList == null) {
            return false;
          }
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if (Process.myPid() == localRunningAppProcessInfo.pid) {
              if ((localRunningAppProcessInfo.importance == 100) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
              {
                PowerManager localPowerManager = (PowerManager)localContext.getSystemService("power");
                if (localPowerManager == null)
                {
                  i1 = 0;
                  break label170;
                }
                boolean bool = localPowerManager.isScreenOn();
                i1 = bool;
                break label170;
              }
            }
          }
          return false;
        }
      }
      catch (Throwable localThrowable)
      {
        zzbv.zzeo().a(localThrowable, "ContentFetchTask.isInForeground");
        return false;
      }
      return false;
    } while (i1 == 0);
    return true;
  }
  
  private final void f()
  {
    synchronized (this.d)
    {
      this.b = true;
      boolean bool = this.b;
      je.b(42 + "ContentFetchThread: paused, mPause = " + bool);
      return;
    }
  }
  
  public final void a()
  {
    synchronized (this.d)
    {
      if (this.a)
      {
        je.b("Content hash thread already started, quiting...");
        return;
      }
      this.a = true;
      start();
      return;
    }
  }
  
  final void a(View paramView)
  {
    try
    {
      akw localakw = new akw(this.h, this.i, this.j, this.k, this.l, this.m, this.n);
      Context localContext = zzbv.zzen().b();
      if ((localContext != null) && (!TextUtils.isEmpty(this.o)))
      {
        Resources localResources = localContext.getResources();
        arq localarq = asa.ab;
        String str = (String)paramView.getTag(localResources.getIdentifier((String)aos.f().a(localarq), "id", localContext.getPackageName()));
        if ((str != null) && (str.equals(this.o))) {
          return;
        }
      }
      alg localalg = a(paramView, localakw);
      localakw.h();
      if (((localalg.a != 0) || (localalg.b != 0)) && ((localalg.b != 0) || (localakw.j() != 0)) && ((localalg.b != 0) || (!this.e.a(localakw))))
      {
        this.e.c(localakw);
        return;
      }
    }
    catch (Exception localException)
    {
      je.b("Exception in fetchContentOnUIThread", localException);
      this.f.a(localException, "ContentFetchTask.fetchContent");
    }
  }
  
  final void a(akw paramakw, WebView paramWebView, String paramString, boolean paramBoolean)
  {
    paramakw.f();
    try
    {
      String str1;
      if (!TextUtils.isEmpty(paramString))
      {
        str1 = new JSONObject(paramString).optString("text");
        if ((this.p) || (TextUtils.isEmpty(paramWebView.getTitle()))) {
          break label136;
        }
        String str2 = paramWebView.getTitle();
        paramakw.a(1 + String.valueOf(str2).length() + String.valueOf(str1).length() + str2 + "\n" + str1, paramBoolean, paramWebView.getX(), paramWebView.getY(), paramWebView.getWidth(), paramWebView.getHeight());
      }
      while (paramakw.a())
      {
        this.e.b(paramakw);
        return;
        label136:
        paramakw.a(str1, paramBoolean, paramWebView.getX(), paramWebView.getY(), paramWebView.getWidth(), paramWebView.getHeight());
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Json string may be malformed.");
      return;
    }
    catch (Throwable localThrowable)
    {
      je.a("Failed to get webview content.", localThrowable);
      this.f.a(localThrowable, "ContentFetchTask.processWebViewContent");
    }
  }
  
  public final akw b()
  {
    return this.e.a();
  }
  
  public final void c()
  {
    synchronized (this.d)
    {
      this.b = false;
      this.d.notifyAll();
      je.b("ContentFetchThread: wakeup");
      return;
    }
  }
  
  public final boolean d()
  {
    return this.b;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 436	com/google/android/gms/internal/ads/alc:e	()Z
    //   3: ifeq +226 -> 229
    //   6: invokestatic 228	com/google/android/gms/ads/internal/zzbv:zzen	()Lcom/google/android/gms/internal/ads/aky;
    //   9: invokevirtual 439	com/google/android/gms/internal/ads/aky:a	()Landroid/app/Activity;
    //   12: astore 7
    //   14: aload 7
    //   16: ifnonnull +64 -> 80
    //   19: ldc_w 441
    //   22: invokestatic 319	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokespecial 442	com/google/android/gms/internal/ads/alc:f	()V
    //   29: sipush 1000
    //   32: aload_0
    //   33: getfield 109	com/google/android/gms/internal/ads/alc:g	I
    //   36: imul
    //   37: i2l
    //   38: invokestatic 446	java/lang/Thread:sleep	(J)V
    //   41: aload_0
    //   42: getfield 51	com/google/android/gms/internal/ads/alc:d	Ljava/lang/Object;
    //   45: astore_2
    //   46: aload_2
    //   47: monitorenter
    //   48: aload_0
    //   49: getfield 40	com/google/android/gms/internal/ads/alc:b	Z
    //   52: istore 4
    //   54: iload 4
    //   56: ifeq +186 -> 242
    //   59: ldc_w 448
    //   62: invokestatic 319	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;)V
    //   65: aload_0
    //   66: getfield 51	com/google/android/gms/internal/ads/alc:d	Ljava/lang/Object;
    //   69: invokevirtual 451	java/lang/Object:wait	()V
    //   72: goto -24 -> 48
    //   75: astore 5
    //   77: goto -29 -> 48
    //   80: aload 7
    //   82: ifnull -53 -> 29
    //   85: aload 7
    //   87: invokevirtual 457	android/app/Activity:getWindow	()Landroid/view/Window;
    //   90: astore 11
    //   92: aconst_null
    //   93: astore 9
    //   95: aload 11
    //   97: ifnull +41 -> 138
    //   100: aload 7
    //   102: invokevirtual 457	android/app/Activity:getWindow	()Landroid/view/Window;
    //   105: invokevirtual 463	android/view/Window:getDecorView	()Landroid/view/View;
    //   108: astore 12
    //   110: aconst_null
    //   111: astore 9
    //   113: aload 12
    //   115: ifnull +23 -> 138
    //   118: aload 7
    //   120: invokevirtual 457	android/app/Activity:getWindow	()Landroid/view/Window;
    //   123: invokevirtual 463	android/view/Window:getDecorView	()Landroid/view/View;
    //   126: ldc_w 464
    //   129: invokevirtual 467	android/view/View:findViewById	(I)Landroid/view/View;
    //   132: astore 13
    //   134: aload 13
    //   136: astore 9
    //   138: aload 9
    //   140: ifnull -111 -> 29
    //   143: aload 9
    //   145: ifnull -116 -> 29
    //   148: aload 9
    //   150: new 469	com/google/android/gms/internal/ads/ald
    //   153: dup
    //   154: aload_0
    //   155: aload 9
    //   157: invokespecial 472	com/google/android/gms/internal/ads/ald:<init>	(Lcom/google/android/gms/internal/ads/alc;Landroid/view/View;)V
    //   160: invokevirtual 473	android/view/View:post	(Ljava/lang/Runnable;)Z
    //   163: pop
    //   164: goto -135 -> 29
    //   167: astore 6
    //   169: ldc_w 475
    //   172: aload 6
    //   174: invokestatic 373	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   177: goto -136 -> 41
    //   180: astore 8
    //   182: invokestatic 293	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   185: aload 8
    //   187: ldc_w 477
    //   190: invokevirtual 300	com/google/android/gms/internal/ads/io:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   193: ldc_w 479
    //   196: invokestatic 319	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;)V
    //   199: aconst_null
    //   200: astore 9
    //   202: goto -64 -> 138
    //   205: astore_1
    //   206: ldc_w 475
    //   209: aload_1
    //   210: invokestatic 373	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   213: aload_0
    //   214: getfield 46	com/google/android/gms/internal/ads/alc:f	Lcom/google/android/gms/internal/ads/ck;
    //   217: aload_1
    //   218: ldc_w 481
    //   221: invokeinterface 378 3 0
    //   226: goto -185 -> 41
    //   229: ldc_w 483
    //   232: invokestatic 319	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;)V
    //   235: aload_0
    //   236: invokespecial 442	com/google/android/gms/internal/ads/alc:f	()V
    //   239: goto -210 -> 29
    //   242: aload_2
    //   243: monitorexit
    //   244: goto -244 -> 0
    //   247: astore_3
    //   248: aload_2
    //   249: monitorexit
    //   250: aload_3
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	alc
    //   205	13	1	localException1	Exception
    //   247	4	3	localObject2	Object
    //   52	3	4	bool	boolean
    //   75	1	5	localInterruptedException1	java.lang.InterruptedException
    //   167	6	6	localInterruptedException2	java.lang.InterruptedException
    //   12	107	7	localActivity	android.app.Activity
    //   180	6	8	localException2	Exception
    //   93	108	9	localObject3	Object
    //   90	6	11	localWindow	android.view.Window
    //   108	6	12	localView1	View
    //   132	3	13	localView2	View
    // Exception table:
    //   from	to	target	type
    //   59	72	75	java/lang/InterruptedException
    //   0	14	167	java/lang/InterruptedException
    //   19	29	167	java/lang/InterruptedException
    //   29	41	167	java/lang/InterruptedException
    //   85	92	167	java/lang/InterruptedException
    //   100	110	167	java/lang/InterruptedException
    //   118	134	167	java/lang/InterruptedException
    //   148	164	167	java/lang/InterruptedException
    //   182	199	167	java/lang/InterruptedException
    //   229	239	167	java/lang/InterruptedException
    //   85	92	180	java/lang/Exception
    //   100	110	180	java/lang/Exception
    //   118	134	180	java/lang/Exception
    //   0	14	205	java/lang/Exception
    //   19	29	205	java/lang/Exception
    //   29	41	205	java/lang/Exception
    //   148	164	205	java/lang/Exception
    //   182	199	205	java/lang/Exception
    //   229	239	205	java/lang/Exception
    //   48	54	247	finally
    //   59	72	247	finally
    //   242	244	247	finally
    //   248	250	247	finally
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.alc
 * JD-Core Version:    0.7.0.1
 */