package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public class sf
  extends sc
{
  @GuardedBy("this")
  private boolean b;
  @GuardedBy("this")
  private boolean c;
  
  public sf(rr paramrr)
  {
    super(paramrr);
    zzbv.zzeo().i();
  }
  
  private final void a()
  {
    try
    {
      if (!this.c)
      {
        this.c = true;
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
  
  /* Error */
  public final void a(se paramse)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 43	com/google/android/gms/internal/ads/sf:y	()Z
    //   6: ifeq +15 -> 21
    //   9: ldc 45
    //   11: invokestatic 50	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokevirtual 53	com/google/android/gms/internal/ads/sf:z	()V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: aload_1
    //   23: invokespecial 55	com/google/android/gms/internal/ads/sc:a	(Lcom/google/android/gms/internal/ads/se;)V
    //   26: goto -8 -> 18
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	sf
    //   0	34	1	paramse	se
    //   29	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	18	29	finally
    //   21	26	29	finally
  }
  
  /* Error */
  public void destroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 59	com/google/android/gms/internal/ads/sf:b	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 59	com/google/android/gms/internal/ads/sf:b	Z
    //   19: aload_0
    //   20: iconst_0
    //   21: invokevirtual 63	com/google/android/gms/internal/ads/sf:f	(Z)V
    //   24: ldc 65
    //   26: invokestatic 50	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   29: ldc 67
    //   31: invokestatic 50	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   34: aload_0
    //   35: ldc 69
    //   37: invokespecial 72	com/google/android/gms/internal/ads/sc:loadUrl	(Ljava/lang/String;)V
    //   40: goto -29 -> 11
    //   43: astore_3
    //   44: invokestatic 22	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   47: aload_3
    //   48: ldc 74
    //   50: invokevirtual 77	com/google/android/gms/internal/ads/io:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   53: ldc 79
    //   55: aload_3
    //   56: invokestatic 83	com/google/android/gms/internal/ads/je:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   59: goto -48 -> 11
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	sf
    //   62	4	1	localObject	Object
    //   6	2	2	bool	boolean
    //   43	13	3	localUnsatisfiedLinkError	java.lang.UnsatisfiedLinkError
    // Exception table:
    //   from	to	target	type
    //   34	40	43	java/lang/UnsatisfiedLinkError
    //   2	7	62	finally
    //   14	34	62	finally
    //   34	40	62	finally
    //   44	59	62	finally
  }
  
  /* Error */
  @TargetApi(19)
  public void evaluateJavascript(java.lang.String paramString, android.webkit.ValueCallback<java.lang.String> paramValueCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 43	com/google/android/gms/internal/ads/sf:y	()Z
    //   6: ifeq +22 -> 28
    //   9: ldc 89
    //   11: invokestatic 92	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: ifnull +10 -> 25
    //   18: aload_2
    //   19: aconst_null
    //   20: invokeinterface 98 2 0
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload_0
    //   29: aload_1
    //   30: aload_2
    //   31: invokespecial 100	com/google/android/gms/internal/ads/sc:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   34: goto -9 -> 25
    //   37: astore_3
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_3
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	sf
    //   0	42	1	paramString	java.lang.String
    //   0	42	2	paramValueCallback	android.webkit.ValueCallback<java.lang.String>
    //   37	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	37	finally
    //   18	25	37	finally
    //   28	34	37	finally
  }
  
  @GuardedBy("this")
  protected void f(boolean paramBoolean) {}
  
  /* Error */
  protected void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 43	com/google/android/gms/internal/ads/sf:y	()Z
    //   6: ifne +8 -> 14
    //   9: aload_0
    //   10: iconst_1
    //   11: invokevirtual 63	com/google/android/gms/internal/ads/sf:f	(Z)V
    //   14: aload_0
    //   15: invokespecial 103	com/google/android/gms/internal/ads/sf:a	()V
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_0
    //   21: invokespecial 107	java/lang/Object:finalize	()V
    //   24: return
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: athrow
    //   30: astore_1
    //   31: aload_0
    //   32: invokespecial 107	java/lang/Object:finalize	()V
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	sf
    //   30	6	1	localObject1	Object
    //   25	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	25	finally
    //   14	20	25	finally
    //   26	28	25	finally
    //   0	2	30	finally
    //   28	30	30	finally
  }
  
  /* Error */
  public void loadData(java.lang.String paramString1, java.lang.String paramString2, java.lang.String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 43	com/google/android/gms/internal/ads/sf:y	()Z
    //   6: ifne +13 -> 19
    //   9: aload_0
    //   10: aload_1
    //   11: aload_2
    //   12: aload_3
    //   13: invokespecial 111	com/google/android/gms/internal/ads/sc:loadData	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: ldc 89
    //   21: invokestatic 92	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   24: goto -8 -> 16
    //   27: astore 4
    //   29: aload_0
    //   30: monitorexit
    //   31: aload 4
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	sf
    //   0	34	1	paramString1	java.lang.String
    //   0	34	2	paramString2	java.lang.String
    //   0	34	3	paramString3	java.lang.String
    //   27	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	27	finally
    //   19	24	27	finally
  }
  
  /* Error */
  public void loadDataWithBaseURL(java.lang.String paramString1, java.lang.String paramString2, java.lang.String paramString3, java.lang.String paramString4, java.lang.String paramString5)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 43	com/google/android/gms/internal/ads/sf:y	()Z
    //   6: ifne +17 -> 23
    //   9: aload_0
    //   10: aload_1
    //   11: aload_2
    //   12: aload_3
    //   13: aload 4
    //   15: aload 5
    //   17: invokespecial 115	com/google/android/gms/internal/ads/sc:loadDataWithBaseURL	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: ldc 89
    //   25: invokestatic 92	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   28: goto -8 -> 20
    //   31: astore 6
    //   33: aload_0
    //   34: monitorexit
    //   35: aload 6
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	sf
    //   0	38	1	paramString1	java.lang.String
    //   0	38	2	paramString2	java.lang.String
    //   0	38	3	paramString3	java.lang.String
    //   0	38	4	paramString4	java.lang.String
    //   0	38	5	paramString5	java.lang.String
    //   31	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	31	finally
    //   23	28	31	finally
  }
  
  /* Error */
  public void loadUrl(java.lang.String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 43	com/google/android/gms/internal/ads/sf:y	()Z
    //   6: ifne +11 -> 17
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 72	com/google/android/gms/internal/ads/sc:loadUrl	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: ldc 89
    //   19: invokestatic 92	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   22: goto -8 -> 14
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	sf
    //   0	30	1	paramString	java.lang.String
    //   25	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	25	finally
    //   17	22	25	finally
  }
  
  @TargetApi(21)
  protected void onDraw(Canvas paramCanvas)
  {
    if (y()) {
      return;
    }
    super.onDraw(paramCanvas);
  }
  
  public void onPause()
  {
    if (y()) {
      return;
    }
    super.onPause();
  }
  
  public void onResume()
  {
    if (y()) {
      return;
    }
    super.onResume();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return (!y()) && (super.onTouchEvent(paramMotionEvent));
  }
  
  public void stopLoading()
  {
    if (y()) {
      return;
    }
    super.stopLoading();
  }
  
  public final boolean y()
  {
    try
    {
      boolean bool = this.b;
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
      a();
      nk.a.execute(new sg(this));
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
 * Qualified Name:     com.google.android.gms.internal.ads.sf
 * JD-Core Version:    0.7.0.1
 */