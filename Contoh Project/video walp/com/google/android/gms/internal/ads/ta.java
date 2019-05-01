package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.c.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class ta
  implements c.a, c.b
{
  private tb a;
  private final String b;
  private final String c;
  private final LinkedBlockingQueue<zo> d;
  private final HandlerThread e;
  
  public ta(Context paramContext, String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.e = new HandlerThread("GassClient");
    this.e.start();
    this.a = new tb(paramContext, this.e.getLooper(), this, this);
    this.d = new LinkedBlockingQueue();
    this.a.g();
  }
  
  private final te a()
  {
    try
    {
      te localte = this.a.x();
      return localte;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      return null;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      label11:
      break label11;
    }
  }
  
  private final void b()
  {
    if ((this.a != null) && ((this.a.h()) || (this.a.i()))) {
      this.a.j();
    }
  }
  
  private static zo c()
  {
    zo localzo = new zo();
    localzo.k = Long.valueOf(32768L);
    return localzo;
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.d.put(c());
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  /* Error */
  public final void a(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 106	com/google/android/gms/internal/ads/ta:a	()Lcom/google/android/gms/internal/ads/te;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +50 -> 56
    //   9: aload_2
    //   10: new 108	com/google/android/gms/internal/ads/zzatt
    //   13: dup
    //   14: aload_0
    //   15: getfield 25	com/google/android/gms/internal/ads/ta:b	Ljava/lang/String;
    //   18: aload_0
    //   19: getfield 27	com/google/android/gms/internal/ads/ta:c	Ljava/lang/String;
    //   22: invokespecial 111	com/google/android/gms/internal/ads/zzatt:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: invokeinterface 116 2 0
    //   30: invokevirtual 120	com/google/android/gms/internal/ads/zzatv:a	()Lcom/google/android/gms/internal/ads/zo;
    //   33: astore 8
    //   35: aload_0
    //   36: getfield 55	com/google/android/gms/internal/ads/ta:d	Ljava/util/concurrent/LinkedBlockingQueue;
    //   39: aload 8
    //   41: invokevirtual 101	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
    //   44: aload_0
    //   45: invokespecial 122	com/google/android/gms/internal/ads/ta:b	()V
    //   48: aload_0
    //   49: getfield 36	com/google/android/gms/internal/ads/ta:e	Landroid/os/HandlerThread;
    //   52: invokevirtual 125	android/os/HandlerThread:quit	()Z
    //   55: pop
    //   56: return
    //   57: astore 5
    //   59: aload_0
    //   60: getfield 55	com/google/android/gms/internal/ads/ta:d	Ljava/util/concurrent/LinkedBlockingQueue;
    //   63: invokestatic 97	com/google/android/gms/internal/ads/ta:c	()Lcom/google/android/gms/internal/ads/zo;
    //   66: invokevirtual 101	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
    //   69: aload_0
    //   70: invokespecial 122	com/google/android/gms/internal/ads/ta:b	()V
    //   73: aload_0
    //   74: getfield 36	com/google/android/gms/internal/ads/ta:e	Landroid/os/HandlerThread;
    //   77: invokevirtual 125	android/os/HandlerThread:quit	()Z
    //   80: pop
    //   81: return
    //   82: astore_3
    //   83: aload_0
    //   84: invokespecial 122	com/google/android/gms/internal/ads/ta:b	()V
    //   87: aload_0
    //   88: getfield 36	com/google/android/gms/internal/ads/ta:e	Landroid/os/HandlerThread;
    //   91: invokevirtual 125	android/os/HandlerThread:quit	()Z
    //   94: pop
    //   95: aload_3
    //   96: athrow
    //   97: astore 6
    //   99: goto -30 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	ta
    //   0	102	1	paramBundle	android.os.Bundle
    //   4	6	2	localte	te
    //   82	14	3	localObject	Object
    //   57	1	5	localThrowable	java.lang.Throwable
    //   97	1	6	localInterruptedException	InterruptedException
    //   33	7	8	localzo	zo
    // Exception table:
    //   from	to	target	type
    //   9	44	57	java/lang/Throwable
    //   9	44	82	finally
    //   59	69	82	finally
    //   59	69	97	java/lang/InterruptedException
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    try
    {
      this.d.put(c());
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  public final zo b(int paramInt)
  {
    try
    {
      localzo = (zo)this.d.poll(5000L, TimeUnit.MILLISECONDS);
      if (localzo == null) {
        localzo = c();
      }
      return localzo;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        zo localzo = null;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ta
 * JD-Core Version:    0.7.0.1
 */