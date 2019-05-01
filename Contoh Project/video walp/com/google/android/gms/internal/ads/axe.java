package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class axe
  implements aqr
{
  @GuardedBy("mLock")
  private awz a;
  @GuardedBy("mLock")
  private boolean b;
  private final Context c;
  private final Object d = new Object();
  
  public axe(Context paramContext)
  {
    this.c = paramContext;
  }
  
  private final Future<ParcelFileDescriptor> a(zzsg paramzzsg)
  {
    axf localaxf = new axf(this);
    axg localaxg = new axg(this, localaxf, paramzzsg);
    axj localaxj = new axj(this, localaxf);
    synchronized (this.d)
    {
      this.a = new awz(this.c, zzbv.zzez().a(), localaxg, localaxj);
      this.a.g();
      return localaxf;
    }
  }
  
  private final void a()
  {
    synchronized (this.d)
    {
      if (this.a == null) {
        return;
      }
      this.a.j();
      this.a = null;
      Binder.flushPendingCommands();
      return;
    }
  }
  
  /* Error */
  public final atr a(avs<?> paramavs)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 92	com/google/android/gms/internal/ads/zzsg:a	(Lcom/google/android/gms/internal/ads/avs;)Lcom/google/android/gms/internal/ads/zzsg;
    //   4: astore_2
    //   5: getstatic 98	com/google/android/gms/internal/ads/asa:cK	Lcom/google/android/gms/internal/ads/arq;
    //   8: astore_3
    //   9: invokestatic 104	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   12: aload_3
    //   13: invokevirtual 109	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   16: checkcast 111	java/lang/Integer
    //   19: invokevirtual 115	java/lang/Integer:intValue	()I
    //   22: i2l
    //   23: lstore 4
    //   25: invokestatic 119	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   28: invokeinterface 124 1 0
    //   33: lstore 6
    //   35: new 126	com/google/android/gms/internal/ads/zzaev
    //   38: dup
    //   39: aload_0
    //   40: aload_2
    //   41: invokespecial 128	com/google/android/gms/internal/ads/axe:a	(Lcom/google/android/gms/internal/ads/zzsg;)Ljava/util/concurrent/Future;
    //   44: lload 4
    //   46: getstatic 134	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   49: invokeinterface 140 4 0
    //   54: checkcast 142	android/os/ParcelFileDescriptor
    //   57: invokespecial 145	com/google/android/gms/internal/ads/zzaev:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   60: getstatic 151	com/google/android/gms/internal/ads/zzsi:CREATOR	Landroid/os/Parcelable$Creator;
    //   63: invokevirtual 154	com/google/android/gms/internal/ads/zzaev:a	(Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //   66: checkcast 147	com/google/android/gms/internal/ads/zzsi
    //   69: astore 16
    //   71: aload 16
    //   73: getfield 156	com/google/android/gms/internal/ads/zzsi:a	Z
    //   76: ifeq +63 -> 139
    //   79: new 158	com/google/android/gms/internal/ads/df
    //   82: dup
    //   83: aload 16
    //   85: getfield 161	com/google/android/gms/internal/ads/zzsi:b	Ljava/lang/String;
    //   88: invokespecial 164	com/google/android/gms/internal/ads/df:<init>	(Ljava/lang/String;)V
    //   91: athrow
    //   92: astore 15
    //   94: invokestatic 119	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   97: invokeinterface 124 1 0
    //   102: lload 6
    //   104: lsub
    //   105: lstore 9
    //   107: new 166	java/lang/StringBuilder
    //   110: dup
    //   111: bipush 52
    //   113: invokespecial 169	java/lang/StringBuilder:<init>	(I)V
    //   116: ldc 171
    //   118: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: lload 9
    //   123: invokevirtual 178	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   126: ldc 180
    //   128: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 188	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   137: aconst_null
    //   138: areturn
    //   139: aload 16
    //   141: getfield 192	com/google/android/gms/internal/ads/zzsi:e	[Ljava/lang/String;
    //   144: arraylength
    //   145: istore 17
    //   147: aload 16
    //   149: getfield 194	com/google/android/gms/internal/ads/zzsi:f	[Ljava/lang/String;
    //   152: arraylength
    //   153: istore 18
    //   155: iload 17
    //   157: iload 18
    //   159: if_icmpeq +52 -> 211
    //   162: aconst_null
    //   163: astore 21
    //   165: invokestatic 119	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   168: invokeinterface 124 1 0
    //   173: lload 6
    //   175: lsub
    //   176: lstore 22
    //   178: new 166	java/lang/StringBuilder
    //   181: dup
    //   182: bipush 52
    //   184: invokespecial 169	java/lang/StringBuilder:<init>	(I)V
    //   187: ldc 171
    //   189: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: lload 22
    //   194: invokevirtual 178	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   197: ldc 180
    //   199: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: invokestatic 188	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   208: aload 21
    //   210: areturn
    //   211: new 196	java/util/HashMap
    //   214: dup
    //   215: invokespecial 197	java/util/HashMap:<init>	()V
    //   218: astore 19
    //   220: iconst_0
    //   221: istore 20
    //   223: iload 20
    //   225: aload 16
    //   227: getfield 192	com/google/android/gms/internal/ads/zzsi:e	[Ljava/lang/String;
    //   230: arraylength
    //   231: if_icmpge +31 -> 262
    //   234: aload 19
    //   236: aload 16
    //   238: getfield 192	com/google/android/gms/internal/ads/zzsi:e	[Ljava/lang/String;
    //   241: iload 20
    //   243: aaload
    //   244: aload 16
    //   246: getfield 194	com/google/android/gms/internal/ads/zzsi:f	[Ljava/lang/String;
    //   249: iload 20
    //   251: aaload
    //   252: invokevirtual 201	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   255: pop
    //   256: iinc 20 1
    //   259: goto -36 -> 223
    //   262: new 203	com/google/android/gms/internal/ads/atr
    //   265: dup
    //   266: aload 16
    //   268: getfield 206	com/google/android/gms/internal/ads/zzsi:c	I
    //   271: aload 16
    //   273: getfield 209	com/google/android/gms/internal/ads/zzsi:d	[B
    //   276: aload 19
    //   278: aload 16
    //   280: getfield 211	com/google/android/gms/internal/ads/zzsi:g	Z
    //   283: aload 16
    //   285: getfield 215	com/google/android/gms/internal/ads/zzsi:h	J
    //   288: invokespecial 218	com/google/android/gms/internal/ads/atr:<init>	(I[BLjava/util/Map;ZJ)V
    //   291: astore 21
    //   293: goto -128 -> 165
    //   296: astore 14
    //   298: goto -204 -> 94
    //   301: astore 11
    //   303: invokestatic 119	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   306: invokeinterface 124 1 0
    //   311: lload 6
    //   313: lsub
    //   314: lstore 12
    //   316: new 166	java/lang/StringBuilder
    //   319: dup
    //   320: bipush 52
    //   322: invokespecial 169	java/lang/StringBuilder:<init>	(I)V
    //   325: ldc 171
    //   327: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: lload 12
    //   332: invokevirtual 178	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   335: ldc 180
    //   337: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   343: invokestatic 188	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   346: aload 11
    //   348: athrow
    //   349: astore 8
    //   351: goto -257 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	354	0	this	axe
    //   0	354	1	paramavs	avs<?>
    //   4	37	2	localzzsg	zzsg
    //   8	5	3	localarq	arq
    //   23	22	4	l1	long
    //   33	279	6	l2	long
    //   349	1	8	localTimeoutException	java.util.concurrent.TimeoutException
    //   105	17	9	l3	long
    //   301	46	11	localObject	Object
    //   314	17	12	l4	long
    //   296	1	14	localExecutionException	java.util.concurrent.ExecutionException
    //   92	1	15	localInterruptedException	java.lang.InterruptedException
    //   69	215	16	localzzsi	zzsi
    //   145	15	17	i	int
    //   153	7	18	j	int
    //   218	59	19	localHashMap	java.util.HashMap
    //   221	36	20	k	int
    //   163	129	21	localatr	atr
    //   176	17	22	l5	long
    // Exception table:
    //   from	to	target	type
    //   35	92	92	java/lang/InterruptedException
    //   139	155	92	java/lang/InterruptedException
    //   211	220	92	java/lang/InterruptedException
    //   223	256	92	java/lang/InterruptedException
    //   262	293	92	java/lang/InterruptedException
    //   35	92	296	java/util/concurrent/ExecutionException
    //   139	155	296	java/util/concurrent/ExecutionException
    //   211	220	296	java/util/concurrent/ExecutionException
    //   223	256	296	java/util/concurrent/ExecutionException
    //   262	293	296	java/util/concurrent/ExecutionException
    //   35	92	301	finally
    //   139	155	301	finally
    //   211	220	301	finally
    //   223	256	301	finally
    //   262	293	301	finally
    //   35	92	349	java/util/concurrent/TimeoutException
    //   139	155	349	java/util/concurrent/TimeoutException
    //   211	220	349	java/util/concurrent/TimeoutException
    //   223	256	349	java/util/concurrent/TimeoutException
    //   262	293	349	java/util/concurrent/TimeoutException
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.axe
 * JD-Core Version:    0.7.0.1
 */