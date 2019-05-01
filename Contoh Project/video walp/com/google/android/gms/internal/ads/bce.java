package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@cm
public final class bce
  implements bbs
{
  private final zzaef a;
  private final bck b;
  private final Context c;
  private final bbu d;
  private final boolean e;
  private final long f;
  private final long g;
  private final int h;
  private final Object i = new Object();
  private boolean j = false;
  private final Map<ne<bcb>, bby> k = new HashMap();
  private final boolean l;
  private final String m;
  private List<bcb> n = new ArrayList();
  private final boolean o;
  
  public bce(Context paramContext, zzaef paramzzaef, bck parambck, bbu parambbu, boolean paramBoolean1, boolean paramBoolean2, String paramString, long paramLong1, long paramLong2, int paramInt, boolean paramBoolean3)
  {
    this.c = paramContext;
    this.a = paramzzaef;
    this.b = parambck;
    this.d = parambbu;
    this.e = paramBoolean1;
    this.l = paramBoolean2;
    this.m = paramString;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = 2;
    this.o = paramBoolean3;
  }
  
  private final void a(ne<bcb> paramne)
  {
    jn.a.post(new bcg(this, paramne));
  }
  
  private final bcb b(List<ne<bcb>> paramList)
  {
    for (;;)
    {
      ne localne;
      synchronized (this.i)
      {
        if (this.j)
        {
          bcb localbcb1 = new bcb(-1);
          return localbcb1;
        }
        Iterator localIterator = paramList.iterator();
        if (localIterator.hasNext()) {
          localne = (ne)localIterator.next();
        }
      }
      try
      {
        bcb localbcb2 = (bcb)localne.get();
        this.n.add(localbcb2);
        if ((localbcb2 == null) || (localbcb2.a != 0)) {
          continue;
        }
        a(localne);
        return localbcb2;
      }
      catch (InterruptedException localInterruptedException)
      {
        je.c("Exception while processing an adapter; continuing with other adapters", localInterruptedException);
        continue;
        localObject2 = finally;
        throw localObject2;
        a(null);
        return new bcb(1);
      }
      catch (ExecutionException localExecutionException)
      {
        label109:
        break label109;
      }
    }
  }
  
  /* Error */
  private final bcb c(List<ne<bcb>> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	com/google/android/gms/internal/ads/bce:i	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 44	com/google/android/gms/internal/ads/bce:j	Z
    //   11: ifeq +18 -> 29
    //   14: new 101	com/google/android/gms/internal/ads/bcb
    //   17: dup
    //   18: iconst_m1
    //   19: invokespecial 104	com/google/android/gms/internal/ads/bcb:<init>	(I)V
    //   22: astore 4
    //   24: aload_2
    //   25: monitorexit
    //   26: aload 4
    //   28: areturn
    //   29: aload_2
    //   30: monitorexit
    //   31: iconst_m1
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 6
    //   37: aconst_null
    //   38: astore 7
    //   40: aload_0
    //   41: getfield 62	com/google/android/gms/internal/ads/bce:d	Lcom/google/android/gms/internal/ads/bbu;
    //   44: getfield 150	com/google/android/gms/internal/ads/bbu:n	J
    //   47: ldc2_w 151
    //   50: lcmp
    //   51: ifeq +199 -> 250
    //   54: aload_0
    //   55: getfield 62	com/google/android/gms/internal/ads/bce:d	Lcom/google/android/gms/internal/ads/bbu;
    //   58: getfield 150	com/google/android/gms/internal/ads/bbu:n	J
    //   61: lstore 8
    //   63: aload_1
    //   64: invokeinterface 110 1 0
    //   69: astore 10
    //   71: lload 8
    //   73: lstore 11
    //   75: aload 10
    //   77: invokeinterface 116 1 0
    //   82: ifeq +252 -> 334
    //   85: aload 10
    //   87: invokeinterface 120 1 0
    //   92: checkcast 122	com/google/android/gms/internal/ads/ne
    //   95: astore 13
    //   97: invokestatic 158	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   100: invokeinterface 163 1 0
    //   105: lstore 14
    //   107: lload 11
    //   109: lconst_0
    //   110: lcmp
    //   111: ifne +147 -> 258
    //   114: aload 13
    //   116: invokeinterface 166 1 0
    //   121: ifeq +137 -> 258
    //   124: aload 13
    //   126: invokeinterface 125 1 0
    //   131: checkcast 101	com/google/android/gms/internal/ads/bcb
    //   134: astore 20
    //   136: aload_0
    //   137: getfield 54	com/google/android/gms/internal/ads/bce:n	Ljava/util/List;
    //   140: aload 20
    //   142: invokeinterface 129 2 0
    //   147: pop
    //   148: aload 20
    //   150: ifnull +219 -> 369
    //   153: aload 20
    //   155: getfield 131	com/google/android/gms/internal/ads/bcb:a	I
    //   158: ifne +211 -> 369
    //   161: aload 20
    //   163: getfield 169	com/google/android/gms/internal/ads/bcb:f	Lcom/google/android/gms/internal/ads/bct;
    //   166: astore 25
    //   168: aload 25
    //   170: ifnull +199 -> 369
    //   173: aload 25
    //   175: invokeinterface 174 1 0
    //   180: iload 5
    //   182: if_icmple +187 -> 369
    //   185: aload 25
    //   187: invokeinterface 174 1 0
    //   192: istore 26
    //   194: iload 26
    //   196: istore 24
    //   198: aload 20
    //   200: astore 27
    //   202: aload 13
    //   204: astore 23
    //   206: aload 27
    //   208: astore 22
    //   210: lload 11
    //   212: invokestatic 158	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   215: invokeinterface 163 1 0
    //   220: lload 14
    //   222: lsub
    //   223: lsub
    //   224: lconst_0
    //   225: invokestatic 180	java/lang/Math:max	(JJ)J
    //   228: lstore 11
    //   230: aload 23
    //   232: astore 6
    //   234: iload 24
    //   236: istore 5
    //   238: aload 22
    //   240: astore 7
    //   242: goto -167 -> 75
    //   245: astore_3
    //   246: aload_2
    //   247: monitorexit
    //   248: aload_3
    //   249: athrow
    //   250: ldc2_w 181
    //   253: lstore 8
    //   255: goto -192 -> 63
    //   258: aload 13
    //   260: lload 11
    //   262: getstatic 188	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   265: invokeinterface 191 4 0
    //   270: checkcast 101	com/google/android/gms/internal/ads/bcb
    //   273: astore 20
    //   275: goto -139 -> 136
    //   278: astore 16
    //   280: ldc 135
    //   282: aload 16
    //   284: invokestatic 140	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   287: lload 11
    //   289: invokestatic 158	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   292: invokeinterface 163 1 0
    //   297: lload 14
    //   299: lsub
    //   300: lsub
    //   301: lconst_0
    //   302: invokestatic 180	java/lang/Math:max	(JJ)J
    //   305: lstore 11
    //   307: goto -232 -> 75
    //   310: astore 17
    //   312: lload 11
    //   314: invokestatic 158	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   317: invokeinterface 163 1 0
    //   322: lload 14
    //   324: lsub
    //   325: lsub
    //   326: lconst_0
    //   327: invokestatic 180	java/lang/Math:max	(JJ)J
    //   330: pop2
    //   331: aload 17
    //   333: athrow
    //   334: aload_0
    //   335: aload 6
    //   337: invokespecial 133	com/google/android/gms/internal/ads/bce:a	(Lcom/google/android/gms/internal/ads/ne;)V
    //   340: aload 7
    //   342: ifnonnull +42 -> 384
    //   345: new 101	com/google/android/gms/internal/ads/bcb
    //   348: dup
    //   349: iconst_1
    //   350: invokespecial 104	com/google/android/gms/internal/ads/bcb:<init>	(I)V
    //   353: areturn
    //   354: astore 16
    //   356: goto -76 -> 280
    //   359: astore 16
    //   361: goto -81 -> 280
    //   364: astore 16
    //   366: goto -86 -> 280
    //   369: aload 7
    //   371: astore 22
    //   373: aload 6
    //   375: astore 23
    //   377: iload 5
    //   379: istore 24
    //   381: goto -171 -> 210
    //   384: aload 7
    //   386: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	this	bce
    //   0	387	1	paramList	List<ne<bcb>>
    //   4	243	2	localObject1	Object
    //   245	4	3	localObject2	Object
    //   22	5	4	localbcb1	bcb
    //   32	346	5	i1	int
    //   35	339	6	localObject3	Object
    //   38	347	7	localObject4	Object
    //   61	193	8	l1	long
    //   69	17	10	localIterator	Iterator
    //   73	240	11	l2	long
    //   95	164	13	localne	ne
    //   105	218	14	l3	long
    //   278	5	16	localRemoteException	android.os.RemoteException
    //   354	1	16	localInterruptedException	InterruptedException
    //   359	1	16	localExecutionException	ExecutionException
    //   364	1	16	localTimeoutException	java.util.concurrent.TimeoutException
    //   310	22	17	localObject5	Object
    //   134	140	20	localbcb2	bcb
    //   208	164	22	localObject6	Object
    //   204	172	23	localObject7	Object
    //   196	184	24	i2	int
    //   166	20	25	localbct	bct
    //   192	3	26	i3	int
    //   200	7	27	localbcb3	bcb
    // Exception table:
    //   from	to	target	type
    //   7	26	245	finally
    //   29	31	245	finally
    //   246	248	245	finally
    //   114	136	278	android/os/RemoteException
    //   136	148	278	android/os/RemoteException
    //   153	168	278	android/os/RemoteException
    //   173	194	278	android/os/RemoteException
    //   258	275	278	android/os/RemoteException
    //   114	136	310	finally
    //   136	148	310	finally
    //   153	168	310	finally
    //   173	194	310	finally
    //   258	275	310	finally
    //   280	287	310	finally
    //   114	136	354	java/lang/InterruptedException
    //   136	148	354	java/lang/InterruptedException
    //   153	168	354	java/lang/InterruptedException
    //   173	194	354	java/lang/InterruptedException
    //   258	275	354	java/lang/InterruptedException
    //   114	136	359	java/util/concurrent/ExecutionException
    //   136	148	359	java/util/concurrent/ExecutionException
    //   153	168	359	java/util/concurrent/ExecutionException
    //   173	194	359	java/util/concurrent/ExecutionException
    //   258	275	359	java/util/concurrent/ExecutionException
    //   114	136	364	java/util/concurrent/TimeoutException
    //   136	148	364	java/util/concurrent/TimeoutException
    //   153	168	364	java/util/concurrent/TimeoutException
    //   173	194	364	java/util/concurrent/TimeoutException
    //   258	275	364	java/util/concurrent/TimeoutException
  }
  
  public final bcb a(List<bbt> paramList)
  {
    je.b("Starting mediation.");
    ArrayList localArrayList = new ArrayList();
    zzjn localzzjn1 = this.a.d;
    int[] arrayOfInt = new int[2];
    int i4;
    zzjn localzzjn2;
    if (localzzjn1.g != null)
    {
      zzbv.zzfd();
      if (bcd.a(this.m, arrayOfInt))
      {
        int i1 = arrayOfInt[0];
        int i2 = arrayOfInt[1];
        zzjn[] arrayOfzzjn = localzzjn1.g;
        int i3 = arrayOfzzjn.length;
        i4 = 0;
        if (i4 < i3)
        {
          localzzjn2 = arrayOfzzjn[i4];
          if ((i1 != localzzjn2.e) || (i2 != localzzjn2.b)) {}
        }
      }
    }
    for (;;)
    {
      Iterator localIterator1 = paramList.iterator();
      label117:
      if (localIterator1.hasNext())
      {
        bbt localbbt = (bbt)localIterator1.next();
        String str1 = String.valueOf(localbbt.b);
        if (str1.length() != 0) {}
        for (String str2 = "Trying mediation network: ".concat(str1);; str2 = new String("Trying mediation network: "))
        {
          je.d(str2);
          Iterator localIterator2 = localbbt.c.iterator();
          while (localIterator2.hasNext())
          {
            String str3 = (String)localIterator2.next();
            bby localbby = new bby(this.c, str3, this.b, this.d, localbbt, this.a.c, localzzjn2, this.a.k, this.e, this.l, this.a.y, this.a.n, this.a.z, this.a.X, this.o);
            ne localne = jl.a(new bcf(this, localbby));
            this.k.put(localne, localbby);
            localArrayList.add(localne);
          }
          break label117;
          i4++;
          break;
        }
      }
      switch (this.h)
      {
      default: 
        return b(localArrayList);
      }
      return c(localArrayList);
      localzzjn2 = localzzjn1;
    }
  }
  
  public final void a()
  {
    synchronized (this.i)
    {
      this.j = true;
      Iterator localIterator = this.k.values().iterator();
      if (localIterator.hasNext()) {
        ((bby)localIterator.next()).a();
      }
    }
  }
  
  public final List<bcb> b()
  {
    return this.n;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bce
 * JD-Core Version:    0.7.0.1
 */