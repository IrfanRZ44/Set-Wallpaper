package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class lv
{
  @GuardedBy("this")
  private final BroadcastReceiver a = new lw(this);
  @GuardedBy("this")
  private final Map<BroadcastReceiver, IntentFilter> b = new WeakHashMap();
  private boolean c = false;
  private boolean d;
  private Context e;
  
  private final void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      Iterator localIterator = this.b.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (((IntentFilter)localEntry.getValue()).hasAction(paramIntent.getAction())) {
          ((BroadcastReceiver)localEntry.getKey()).onReceive(paramContext, paramIntent);
        }
      }
    }
    finally {}
  }
  
  /* Error */
  public final void a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 24	com/google/android/gms/internal/ads/lv:c	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 94	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   19: putfield 96	com/google/android/gms/internal/ads/lv:e	Landroid/content/Context;
    //   22: aload_0
    //   23: getfield 96	com/google/android/gms/internal/ads/lv:e	Landroid/content/Context;
    //   26: ifnonnull +8 -> 34
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 96	com/google/android/gms/internal/ads/lv:e	Landroid/content/Context;
    //   34: aload_0
    //   35: getfield 96	com/google/android/gms/internal/ads/lv:e	Landroid/content/Context;
    //   38: invokestatic 100	com/google/android/gms/internal/ads/asa:a	(Landroid/content/Context;)V
    //   41: getstatic 104	com/google/android/gms/internal/ads/asa:ch	Lcom/google/android/gms/internal/ads/arq;
    //   44: astore 4
    //   46: aload_0
    //   47: invokestatic 110	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   50: aload 4
    //   52: invokevirtual 115	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   55: checkcast 117	java/lang/Boolean
    //   58: invokevirtual 120	java/lang/Boolean:booleanValue	()Z
    //   61: putfield 122	com/google/android/gms/internal/ads/lv:d	Z
    //   64: new 66	android/content/IntentFilter
    //   67: dup
    //   68: invokespecial 123	android/content/IntentFilter:<init>	()V
    //   71: astore 5
    //   73: aload 5
    //   75: ldc 125
    //   77: invokevirtual 129	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   80: aload 5
    //   82: ldc 131
    //   84: invokevirtual 129	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   87: aload 5
    //   89: ldc 133
    //   91: invokevirtual 129	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield 96	com/google/android/gms/internal/ads/lv:e	Landroid/content/Context;
    //   98: aload_0
    //   99: getfield 36	com/google/android/gms/internal/ads/lv:a	Landroid/content/BroadcastReceiver;
    //   102: aload 5
    //   104: invokevirtual 137	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   107: pop
    //   108: aload_0
    //   109: iconst_1
    //   110: putfield 24	com/google/android/gms/internal/ads/lv:c	Z
    //   113: goto -102 -> 11
    //   116: astore_2
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_2
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	lv
    //   0	121	1	paramContext	Context
    //   116	4	2	localObject	Object
    //   6	2	3	bool	boolean
    //   44	7	4	localarq	arq
    //   71	32	5	localIntentFilter	IntentFilter
    // Exception table:
    //   from	to	target	type
    //   2	7	116	finally
    //   14	34	116	finally
    //   34	113	116	finally
  }
  
  /* Error */
  public final void a(Context paramContext, BroadcastReceiver paramBroadcastReceiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 122	com/google/android/gms/internal/ads/lv:d	Z
    //   6: ifeq +17 -> 23
    //   9: aload_0
    //   10: getfield 29	com/google/android/gms/internal/ads/lv:b	Ljava/util/Map;
    //   13: aload_2
    //   14: invokeinterface 142 2 0
    //   19: pop
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_1
    //   24: aload_2
    //   25: invokevirtual 146	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   28: goto -8 -> 20
    //   31: astore_3
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_3
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	lv
    //   0	36	1	paramContext	Context
    //   0	36	2	paramBroadcastReceiver	BroadcastReceiver
    //   31	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	31	finally
    //   23	28	31	finally
  }
  
  /* Error */
  public final void a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 122	com/google/android/gms/internal/ads/lv:d	Z
    //   6: ifeq +18 -> 24
    //   9: aload_0
    //   10: getfield 29	com/google/android/gms/internal/ads/lv:b	Ljava/util/Map;
    //   13: aload_2
    //   14: aload_3
    //   15: invokeinterface 151 3 0
    //   20: pop
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_1
    //   25: aload_2
    //   26: aload_3
    //   27: invokevirtual 137	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   30: pop
    //   31: goto -10 -> 21
    //   34: astore 4
    //   36: aload_0
    //   37: monitorexit
    //   38: aload 4
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	lv
    //   0	41	1	paramContext	Context
    //   0	41	2	paramBroadcastReceiver	BroadcastReceiver
    //   0	41	3	paramIntentFilter	IntentFilter
    //   34	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	34	finally
    //   24	31	34	finally
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.lv
 * JD-Core Version:    0.7.0.1
 */