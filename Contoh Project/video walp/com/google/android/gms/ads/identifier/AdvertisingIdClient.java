package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.a.e;
import com.google.android.gms.internal.a.f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public class AdvertisingIdClient
{
  @GuardedBy("this")
  private com.google.android.gms.common.a a;
  @GuardedBy("this")
  private e b;
  @GuardedBy("this")
  private boolean c;
  private final Object d = new Object();
  @GuardedBy("mAutoDisconnectTaskLock")
  private a e;
  @GuardedBy("this")
  private final Context f;
  private final boolean g;
  private final long h;
  
  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L, false, false);
  }
  
  private AdvertisingIdClient(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    n.a(paramContext);
    Context localContext;
    if (paramBoolean1)
    {
      localContext = paramContext.getApplicationContext();
      if (localContext != null) {}
    }
    for (this.f = paramContext;; this.f = paramContext)
    {
      this.c = false;
      this.h = paramLong;
      this.g = paramBoolean2;
      return;
      paramContext = localContext;
      break;
    }
  }
  
  private static com.google.android.gms.common.a a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      switch (d.a().a(paramContext, 12451000))
      {
      case 1: 
      default: 
        throw new IOException("Google Play services not available");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new g(9);
    }
    if (paramBoolean) {}
    for (String str = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";; str = "com.google.android.gms.ads.identifier.service.START")
    {
      com.google.android.gms.common.a locala = new com.google.android.gms.common.a();
      Intent localIntent = new Intent(str);
      localIntent.setPackage("com.google.android.gms");
      try
      {
        boolean bool = b.a().a(paramContext, localIntent, locala, 1);
        if (!bool) {
          break;
        }
        return locala;
      }
      catch (Throwable localThrowable)
      {
        throw new IOException(localThrowable);
      }
    }
    throw new IOException("Connection failure");
  }
  
  private static e a(Context paramContext, com.google.android.gms.common.a parama)
  {
    try
    {
      e locale = f.a(parama.a(10000L, TimeUnit.MILLISECONDS));
      return locale;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException("Interrupted exception");
    }
    catch (Throwable localThrowable)
    {
      throw new IOException(localThrowable);
    }
  }
  
  private final void a()
  {
    synchronized (this.d)
    {
      if (this.e != null) {
        this.e.a.countDown();
      }
    }
    try
    {
      this.e.join();
      label31:
      if (this.h > 0L) {
        this.e = new a(this, this.h);
      }
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label31;
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    n.c("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.c) {
        finish();
      }
      this.a = a(this.f, this.g);
      this.b = a(this.f, this.a);
      this.c = true;
      if (paramBoolean) {
        a();
      }
      return;
    }
    finally {}
  }
  
  private final boolean a(Info paramInfo, boolean paramBoolean, float paramFloat, long paramLong, String paramString, Throwable paramThrowable)
  {
    if (Math.random() > paramFloat) {
      return false;
    }
    HashMap localHashMap = new HashMap();
    String str1;
    if (paramBoolean)
    {
      str1 = "1";
      localHashMap.put("app_context", str1);
      if (paramInfo != null) {
        if (!paramInfo.isLimitAdTrackingEnabled()) {
          break label196;
        }
      }
    }
    label196:
    for (String str2 = "1";; str2 = "0")
    {
      localHashMap.put("limit_ad_tracking", str2);
      if ((paramInfo != null) && (paramInfo.getId() != null)) {
        localHashMap.put("ad_id_size", Integer.toString(paramInfo.getId().length()));
      }
      if (paramThrowable != null) {
        localHashMap.put("error", paramThrowable.getClass().getName());
      }
      if ((paramString != null) && (!paramString.isEmpty())) {
        localHashMap.put("experiment_id", paramString);
      }
      localHashMap.put("tag", "AdvertisingIdClient");
      localHashMap.put("time_spent", Long.toString(paramLong));
      new a(this, localHashMap).start();
      return true;
      str1 = "0";
      break;
    }
  }
  
  /* Error */
  private final boolean b()
  {
    // Byte code:
    //   0: ldc 164
    //   2: invokestatic 166	com/google/android/gms/common/internal/n:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:c	Z
    //   11: ifne +94 -> 105
    //   14: aload_0
    //   15: getfield 36	com/google/android/gms/ads/identifier/AdvertisingIdClient:d	Ljava/lang/Object;
    //   18: astore 7
    //   20: aload 7
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 145	com/google/android/gms/ads/identifier/AdvertisingIdClient:e	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   27: ifnull +13 -> 40
    //   30: aload_0
    //   31: getfield 145	com/google/android/gms/ads/identifier/AdvertisingIdClient:e	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   34: getfield 268	com/google/android/gms/ads/identifier/AdvertisingIdClient$a:b	Z
    //   37: ifne +27 -> 64
    //   40: new 83	java/io/IOException
    //   43: dup
    //   44: ldc_w 270
    //   47: invokespecial 88	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   50: athrow
    //   51: astore 8
    //   53: aload 7
    //   55: monitorexit
    //   56: aload 8
    //   58: athrow
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    //   64: aload 7
    //   66: monitorexit
    //   67: aload_0
    //   68: iconst_0
    //   69: invokespecial 272	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	(Z)V
    //   72: aload_0
    //   73: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:c	Z
    //   76: ifne +29 -> 105
    //   79: new 83	java/io/IOException
    //   82: dup
    //   83: ldc_w 274
    //   86: invokespecial 88	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   89: athrow
    //   90: astore 9
    //   92: new 83	java/io/IOException
    //   95: dup
    //   96: ldc_w 274
    //   99: aload 9
    //   101: invokespecial 277	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   104: athrow
    //   105: aload_0
    //   106: getfield 173	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	Lcom/google/android/gms/common/a;
    //   109: invokestatic 41	com/google/android/gms/common/internal/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   112: pop
    //   113: aload_0
    //   114: getfield 177	com/google/android/gms/ads/identifier/AdvertisingIdClient:b	Lcom/google/android/gms/internal/a/e;
    //   117: invokestatic 41	com/google/android/gms/common/internal/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: aload_0
    //   122: getfield 177	com/google/android/gms/ads/identifier/AdvertisingIdClient:b	Lcom/google/android/gms/internal/a/e;
    //   125: invokeinterface 281 1 0
    //   130: istore 6
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_0
    //   135: invokespecial 179	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	()V
    //   138: iload 6
    //   140: ireturn
    //   141: astore 4
    //   143: ldc 245
    //   145: ldc_w 283
    //   148: aload 4
    //   150: invokestatic 289	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   153: pop
    //   154: new 83	java/io/IOException
    //   157: dup
    //   158: ldc_w 291
    //   161: invokespecial 88	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	AdvertisingIdClient
    //   59	4	1	localObject1	Object
    //   141	8	4	localRemoteException	android.os.RemoteException
    //   130	9	6	bool	boolean
    //   18	47	7	localObject2	Object
    //   51	6	8	localObject3	Object
    //   90	10	9	localException	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   23	40	51	finally
    //   40	51	51	finally
    //   53	56	51	finally
    //   64	67	51	finally
    //   7	23	59	finally
    //   56	59	59	finally
    //   60	62	59	finally
    //   67	72	59	finally
    //   72	90	59	finally
    //   92	105	59	finally
    //   105	121	59	finally
    //   121	132	59	finally
    //   132	134	59	finally
    //   143	165	59	finally
    //   67	72	90	java/lang/Exception
    //   121	132	141	android/os/RemoteException
  }
  
  public static Info getAdvertisingIdInfo(Context paramContext)
  {
    zzb localzzb = new zzb(paramContext);
    boolean bool = localzzb.getBoolean("gads:ad_id_app_context:enabled", false);
    float f1 = localzzb.a("gads:ad_id_app_context:ping_ratio", 0.0F);
    String str = localzzb.a("gads:ad_id_use_shared_preference:experiment_id", "");
    AdvertisingIdClient localAdvertisingIdClient = new AdvertisingIdClient(paramContext, -1L, bool, localzzb.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
    try
    {
      long l = SystemClock.elapsedRealtime();
      localAdvertisingIdClient.a(false);
      Info localInfo = localAdvertisingIdClient.getInfo();
      localAdvertisingIdClient.a(localInfo, bool, f1, SystemClock.elapsedRealtime() - l, str, null);
      return localInfo;
    }
    catch (Throwable localThrowable)
    {
      localAdvertisingIdClient.a(null, bool, f1, -1L, str, localThrowable);
      throw localThrowable;
    }
    finally
    {
      localAdvertisingIdClient.finish();
    }
  }
  
  public static boolean getIsAdIdFakeForDebugLogging(Context paramContext)
  {
    zzb localzzb = new zzb(paramContext);
    AdvertisingIdClient localAdvertisingIdClient = new AdvertisingIdClient(paramContext, -1L, localzzb.getBoolean("gads:ad_id_app_context:enabled", false), localzzb.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
    try
    {
      localAdvertisingIdClient.a(false);
      boolean bool = localAdvertisingIdClient.b();
      return bool;
    }
    finally
    {
      localAdvertisingIdClient.finish();
    }
  }
  
  public static void setShouldSkipGmsCoreVersionCheck(boolean paramBoolean) {}
  
  protected void finalize()
  {
    finish();
    super.finalize();
  }
  
  /* Error */
  public final void finish()
  {
    // Byte code:
    //   0: ldc 164
    //   2: invokestatic 166	com/google/android/gms/common/internal/n:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 49	com/google/android/gms/ads/identifier/AdvertisingIdClient:f	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 173	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	Lcom/google/android/gms/common/a;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:c	Z
    //   28: ifeq +17 -> 45
    //   31: invokestatic 112	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   34: aload_0
    //   35: getfield 49	com/google/android/gms/ads/identifier/AdvertisingIdClient:f	Landroid/content/Context;
    //   38: aload_0
    //   39: getfield 173	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	Lcom/google/android/gms/common/a;
    //   42: invokevirtual 341	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:c	Z
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 177	com/google/android/gms/ads/identifier/AdvertisingIdClient:b	Lcom/google/android/gms/internal/a/e;
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 173	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	Lcom/google/android/gms/common/a;
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_2
    //   69: ldc 245
    //   71: ldc_w 343
    //   74: aload_2
    //   75: invokestatic 289	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   78: pop
    //   79: goto -34 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	AdvertisingIdClient
    //   63	4	1	localObject	Object
    //   68	7	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   7	21	63	finally
    //   21	23	63	finally
    //   24	45	63	finally
    //   45	62	63	finally
    //   64	66	63	finally
    //   69	79	63	finally
    //   24	45	68	java/lang/Throwable
  }
  
  /* Error */
  public Info getInfo()
  {
    // Byte code:
    //   0: ldc 164
    //   2: invokestatic 166	com/google/android/gms/common/internal/n:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:c	Z
    //   11: ifne +94 -> 105
    //   14: aload_0
    //   15: getfield 36	com/google/android/gms/ads/identifier/AdvertisingIdClient:d	Ljava/lang/Object;
    //   18: astore 7
    //   20: aload 7
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 145	com/google/android/gms/ads/identifier/AdvertisingIdClient:e	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   27: ifnull +13 -> 40
    //   30: aload_0
    //   31: getfield 145	com/google/android/gms/ads/identifier/AdvertisingIdClient:e	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   34: getfield 268	com/google/android/gms/ads/identifier/AdvertisingIdClient$a:b	Z
    //   37: ifne +27 -> 64
    //   40: new 83	java/io/IOException
    //   43: dup
    //   44: ldc_w 270
    //   47: invokespecial 88	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   50: athrow
    //   51: astore 8
    //   53: aload 7
    //   55: monitorexit
    //   56: aload 8
    //   58: athrow
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    //   64: aload 7
    //   66: monitorexit
    //   67: aload_0
    //   68: iconst_0
    //   69: invokespecial 272	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	(Z)V
    //   72: aload_0
    //   73: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:c	Z
    //   76: ifne +29 -> 105
    //   79: new 83	java/io/IOException
    //   82: dup
    //   83: ldc_w 274
    //   86: invokespecial 88	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   89: athrow
    //   90: astore 9
    //   92: new 83	java/io/IOException
    //   95: dup
    //   96: ldc_w 274
    //   99: aload 9
    //   101: invokespecial 277	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   104: athrow
    //   105: aload_0
    //   106: getfield 173	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	Lcom/google/android/gms/common/a;
    //   109: invokestatic 41	com/google/android/gms/common/internal/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   112: pop
    //   113: aload_0
    //   114: getfield 177	com/google/android/gms/ads/identifier/AdvertisingIdClient:b	Lcom/google/android/gms/internal/a/e;
    //   117: invokestatic 41	com/google/android/gms/common/internal/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: new 201	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   124: dup
    //   125: aload_0
    //   126: getfield 177	com/google/android/gms/ads/identifier/AdvertisingIdClient:b	Lcom/google/android/gms/internal/a/e;
    //   129: invokeinterface 345 1 0
    //   134: aload_0
    //   135: getfield 177	com/google/android/gms/ads/identifier/AdvertisingIdClient:b	Lcom/google/android/gms/internal/a/e;
    //   138: iconst_1
    //   139: invokeinterface 348 2 0
    //   144: invokespecial 351	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   147: astore 4
    //   149: aload_0
    //   150: monitorexit
    //   151: aload_0
    //   152: invokespecial 179	com/google/android/gms/ads/identifier/AdvertisingIdClient:a	()V
    //   155: aload 4
    //   157: areturn
    //   158: astore 5
    //   160: ldc 245
    //   162: ldc_w 283
    //   165: aload 5
    //   167: invokestatic 289	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: new 83	java/io/IOException
    //   174: dup
    //   175: ldc_w 291
    //   178: invokespecial 88	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	AdvertisingIdClient
    //   59	4	1	localObject1	Object
    //   147	9	4	localInfo	Info
    //   158	8	5	localRemoteException	android.os.RemoteException
    //   18	47	7	localObject2	Object
    //   51	6	8	localObject3	Object
    //   90	10	9	localException	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   23	40	51	finally
    //   40	51	51	finally
    //   53	56	51	finally
    //   64	67	51	finally
    //   7	23	59	finally
    //   56	59	59	finally
    //   60	62	59	finally
    //   67	72	59	finally
    //   72	90	59	finally
    //   92	105	59	finally
    //   105	121	59	finally
    //   121	149	59	finally
    //   149	151	59	finally
    //   160	182	59	finally
    //   67	72	90	java/lang/Exception
    //   121	149	158	android/os/RemoteException
  }
  
  public void start()
  {
    a(true);
  }
  
  public static final class Info
  {
    private final String a;
    private final boolean b;
    
    public Info(String paramString, boolean paramBoolean)
    {
      this.a = paramString;
      this.b = paramBoolean;
    }
    
    public final String getId()
    {
      return this.a;
    }
    
    public final boolean isLimitAdTrackingEnabled()
    {
      return this.b;
    }
    
    public final String toString()
    {
      String str = this.a;
      boolean bool = this.b;
      return 7 + String.valueOf(str).length() + "{" + str + "}" + bool;
    }
  }
  
  static final class a
    extends Thread
  {
    CountDownLatch a;
    boolean b;
    private WeakReference<AdvertisingIdClient> c;
    private long d;
    
    public a(AdvertisingIdClient paramAdvertisingIdClient, long paramLong)
    {
      this.c = new WeakReference(paramAdvertisingIdClient);
      this.d = paramLong;
      this.a = new CountDownLatch(1);
      this.b = false;
      start();
    }
    
    private final void a()
    {
      AdvertisingIdClient localAdvertisingIdClient = (AdvertisingIdClient)this.c.get();
      if (localAdvertisingIdClient != null)
      {
        localAdvertisingIdClient.finish();
        this.b = true;
      }
    }
    
    public final void run()
    {
      try
      {
        if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
          a();
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        a();
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient
 * JD-Core Version:    0.7.0.1
 */