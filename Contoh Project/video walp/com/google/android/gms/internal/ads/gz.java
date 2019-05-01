package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cm
public final class gz
  extends iz
  implements gy
{
  private final ik a;
  private final Context b;
  private final ArrayList<gp> c = new ArrayList();
  private final List<gs> d = new ArrayList();
  private final HashSet<String> e = new HashSet();
  private final Object f = new Object();
  private final fq g;
  private final long h;
  
  public gz(Context paramContext, ik paramik, fq paramfq)
  {
    this(paramContext, paramik, paramfq, ((Long)aos.f().a(localarq)).longValue());
  }
  
  private gz(Context paramContext, ik paramik, fq paramfq, long paramLong)
  {
    this.b = paramContext;
    this.a = paramik;
    this.g = paramfq;
    this.h = paramLong;
  }
  
  private final ij a(int paramInt, String paramString, bbt parambbt)
  {
    zzjj localzzjj = this.a.a.c;
    List localList1 = this.a.b.c;
    List localList2 = this.a.b.e;
    List localList3 = this.a.b.i;
    int i = this.a.b.k;
    long l1 = this.a.b.j;
    String str1 = this.a.a.i;
    boolean bool1 = this.a.b.g;
    bbu localbbu = this.a.c;
    long l2 = this.a.b.h;
    zzjn localzzjn = this.a.d;
    long l3 = this.a.b.f;
    long l4 = this.a.f;
    long l5 = this.a.b.m;
    String str2 = this.a.b.n;
    JSONObject localJSONObject = this.a.h;
    zzaig localzzaig = this.a.b.A;
    List localList4 = this.a.b.B;
    List localList5 = this.a.b.C;
    boolean bool2 = this.a.b.D;
    zzael localzzael = this.a.b.E;
    StringBuilder localStringBuilder1 = new StringBuilder("");
    if (this.d == null) {}
    for (String str3 = localStringBuilder1.toString();; str3 = localStringBuilder1.substring(0, Math.max(0, -1 + localStringBuilder1.length())))
    {
      return new ij(localzzjj, null, localList1, paramInt, localList2, localList3, i, l1, str1, bool1, parambbt, null, paramString, localbbu, null, l2, localzzjn, l3, l4, l5, str2, localJSONObject, null, localzzaig, localList4, localList5, bool2, localzzael, str3, this.a.b.H, this.a.b.L, this.a.i, this.a.b.O, this.a.j, this.a.b.Q, this.a.b.R, this.a.b.S, this.a.b.T);
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        gs localgs = (gs)localIterator.next();
        if ((localgs != null) && (!TextUtils.isEmpty(localgs.a)))
        {
          String str4 = localgs.a;
          int j;
          switch (localgs.b)
          {
          default: 
            j = 6;
          }
          for (;;)
          {
            long l6 = localgs.c;
            int k = 33 + String.valueOf(str4).length();
            StringBuilder localStringBuilder2 = new StringBuilder(k);
            localStringBuilder1.append(String.valueOf(str4 + "." + j + "." + l6).concat("_"));
            break;
            j = 0;
            continue;
            j = 1;
            continue;
            j = 2;
            continue;
            j = 3;
            continue;
            j = 4;
          }
        }
      }
    }
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 77	com/google/android/gms/internal/ads/gz:a	Lcom/google/android/gms/internal/ads/ik;
    //   4: getfield 120	com/google/android/gms/internal/ads/ik:c	Lcom/google/android/gms/internal/ads/bbu;
    //   7: getfield 277	com/google/android/gms/internal/ads/bbu:a	Ljava/util/List;
    //   10: invokeinterface 201 1 0
    //   15: astore_1
    //   16: aload_1
    //   17: invokeinterface 207 1 0
    //   22: ifeq +266 -> 288
    //   25: aload_1
    //   26: invokeinterface 211 1 0
    //   31: checkcast 279	com/google/android/gms/internal/ads/bbt
    //   34: astore 37
    //   36: aload 37
    //   38: getfield 281	com/google/android/gms/internal/ads/bbt:k	Ljava/lang/String;
    //   41: astore 38
    //   43: aload 37
    //   45: getfield 282	com/google/android/gms/internal/ads/bbt:c	Ljava/util/List;
    //   48: invokeinterface 201 1 0
    //   53: astore 39
    //   55: aload 39
    //   57: invokeinterface 207 1 0
    //   62: ifeq -46 -> 16
    //   65: aload 39
    //   67: invokeinterface 211 1 0
    //   72: checkcast 227	java/lang/String
    //   75: astore 40
    //   77: ldc_w 284
    //   80: aload 40
    //   82: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   85: ifne +14 -> 99
    //   88: ldc_w 290
    //   91: aload 40
    //   93: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   96: ifeq +646 -> 742
    //   99: new 292	org/json/JSONObject
    //   102: dup
    //   103: aload 38
    //   105: invokespecial 293	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   108: ldc_w 295
    //   111: invokevirtual 298	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   114: astore 42
    //   116: aload 42
    //   118: astore 43
    //   120: aload_0
    //   121: getfield 73	com/google/android/gms/internal/ads/gz:f	Ljava/lang/Object;
    //   124: astore 44
    //   126: aload 44
    //   128: monitorenter
    //   129: aload_0
    //   130: getfield 79	com/google/android/gms/internal/ads/gz:g	Lcom/google/android/gms/internal/ads/fq;
    //   133: aload 43
    //   135: invokevirtual 303	com/google/android/gms/internal/ads/fq:a	(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/he;
    //   138: astore 46
    //   140: aload 46
    //   142: ifnull +19 -> 161
    //   145: aload 46
    //   147: invokevirtual 308	com/google/android/gms/internal/ads/he:b	()Lcom/google/android/gms/internal/ads/gx;
    //   150: ifnull +11 -> 161
    //   153: aload 46
    //   155: invokevirtual 311	com/google/android/gms/internal/ads/he:a	()Lcom/google/android/gms/internal/ads/bcn;
    //   158: ifnonnull +72 -> 230
    //   161: aload_0
    //   162: getfield 63	com/google/android/gms/internal/ads/gz:d	Ljava/util/List;
    //   165: new 313	com/google/android/gms/internal/ads/gu
    //   168: dup
    //   169: invokespecial 314	com/google/android/gms/internal/ads/gu:<init>	()V
    //   172: aload 37
    //   174: getfield 316	com/google/android/gms/internal/ads/bbt:d	Ljava/lang/String;
    //   177: invokevirtual 319	com/google/android/gms/internal/ads/gu:b	(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/gu;
    //   180: aload 43
    //   182: invokevirtual 321	com/google/android/gms/internal/ads/gu:a	(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/gu;
    //   185: lconst_0
    //   186: invokevirtual 324	com/google/android/gms/internal/ads/gu:a	(J)Lcom/google/android/gms/internal/ads/gu;
    //   189: bipush 7
    //   191: invokevirtual 327	com/google/android/gms/internal/ads/gu:a	(I)Lcom/google/android/gms/internal/ads/gu;
    //   194: invokevirtual 330	com/google/android/gms/internal/ads/gu:a	()Lcom/google/android/gms/internal/ads/gs;
    //   197: invokeinterface 333 2 0
    //   202: pop
    //   203: aload 44
    //   205: monitorexit
    //   206: goto -151 -> 55
    //   209: astore 45
    //   211: aload 44
    //   213: monitorexit
    //   214: aload 45
    //   216: athrow
    //   217: astore 41
    //   219: ldc_w 335
    //   222: aload 41
    //   224: invokestatic 340	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   227: goto -172 -> 55
    //   230: new 342	com/google/android/gms/internal/ads/gp
    //   233: dup
    //   234: aload_0
    //   235: getfield 75	com/google/android/gms/internal/ads/gz:b	Landroid/content/Context;
    //   238: aload 43
    //   240: aload 38
    //   242: aload 37
    //   244: aload_0
    //   245: getfield 77	com/google/android/gms/internal/ads/gz:a	Lcom/google/android/gms/internal/ads/ik;
    //   248: aload 46
    //   250: aload_0
    //   251: aload_0
    //   252: getfield 81	com/google/android/gms/internal/ads/gz:h	J
    //   255: invokespecial 345	com/google/android/gms/internal/ads/gp:<init>	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbt;Lcom/google/android/gms/internal/ads/ik;Lcom/google/android/gms/internal/ads/he;Lcom/google/android/gms/internal/ads/gy;J)V
    //   258: astore 48
    //   260: aload 48
    //   262: aload_0
    //   263: getfield 79	com/google/android/gms/internal/ads/gz:g	Lcom/google/android/gms/internal/ads/fq;
    //   266: invokevirtual 348	com/google/android/gms/internal/ads/fq:a	()Lcom/google/android/gms/ads/internal/gmsg/zzb;
    //   269: invokevirtual 351	com/google/android/gms/internal/ads/gp:a	(Lcom/google/android/gms/ads/internal/gmsg/zzb;)V
    //   272: aload_0
    //   273: getfield 61	com/google/android/gms/internal/ads/gz:c	Ljava/util/ArrayList;
    //   276: aload 48
    //   278: invokevirtual 352	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   281: pop
    //   282: aload 44
    //   284: monitorexit
    //   285: goto -230 -> 55
    //   288: new 65	java/util/HashSet
    //   291: dup
    //   292: invokespecial 66	java/util/HashSet:<init>	()V
    //   295: astore_2
    //   296: aload_0
    //   297: getfield 61	com/google/android/gms/internal/ads/gz:c	Ljava/util/ArrayList;
    //   300: checkcast 58	java/util/ArrayList
    //   303: astore_3
    //   304: aload_3
    //   305: invokevirtual 355	java/util/ArrayList:size	()I
    //   308: istore 4
    //   310: iconst_0
    //   311: istore 5
    //   313: iload 5
    //   315: iload 4
    //   317: if_icmpge +44 -> 361
    //   320: aload_3
    //   321: iload 5
    //   323: invokevirtual 359	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   326: astore 34
    //   328: iinc 5 1
    //   331: aload 34
    //   333: checkcast 342	com/google/android/gms/internal/ads/gp
    //   336: astore 35
    //   338: aload_2
    //   339: aload 35
    //   341: getfield 360	com/google/android/gms/internal/ads/gp:a	Ljava/lang/String;
    //   344: invokeinterface 363 2 0
    //   349: ifeq -36 -> 313
    //   352: aload 35
    //   354: invokevirtual 366	com/google/android/gms/internal/ads/gp:d	()Ljava/util/concurrent/Future;
    //   357: pop
    //   358: goto -45 -> 313
    //   361: aload_0
    //   362: getfield 61	com/google/android/gms/internal/ads/gz:c	Ljava/util/ArrayList;
    //   365: checkcast 58	java/util/ArrayList
    //   368: astore 6
    //   370: aload 6
    //   372: invokevirtual 355	java/util/ArrayList:size	()I
    //   375: istore 7
    //   377: iconst_0
    //   378: istore 8
    //   380: iload 8
    //   382: iload 7
    //   384: if_icmpge +191 -> 575
    //   387: aload 6
    //   389: iload 8
    //   391: invokevirtual 359	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   394: astore 11
    //   396: iload 8
    //   398: iconst_1
    //   399: iadd
    //   400: istore 12
    //   402: aload 11
    //   404: checkcast 342	com/google/android/gms/internal/ads/gp
    //   407: astore 13
    //   409: aload 13
    //   411: invokevirtual 366	com/google/android/gms/internal/ads/gp:d	()Ljava/util/concurrent/Future;
    //   414: invokeinterface 370 1 0
    //   419: pop
    //   420: aload_0
    //   421: getfield 73	com/google/android/gms/internal/ads/gz:f	Ljava/lang/Object;
    //   424: astore 27
    //   426: aload 27
    //   428: monitorenter
    //   429: aload 13
    //   431: getfield 360	com/google/android/gms/internal/ads/gp:a	Ljava/lang/String;
    //   434: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   437: ifne +18 -> 455
    //   440: aload_0
    //   441: getfield 63	com/google/android/gms/internal/ads/gz:d	Ljava/util/List;
    //   444: aload 13
    //   446: invokevirtual 372	com/google/android/gms/internal/ads/gp:e	()Lcom/google/android/gms/internal/ads/gs;
    //   449: invokeinterface 333 2 0
    //   454: pop
    //   455: aload 27
    //   457: monitorexit
    //   458: aload_0
    //   459: getfield 73	com/google/android/gms/internal/ads/gz:f	Ljava/lang/Object;
    //   462: astore 29
    //   464: aload 29
    //   466: monitorenter
    //   467: aload_0
    //   468: getfield 68	com/google/android/gms/internal/ads/gz:e	Ljava/util/HashSet;
    //   471: aload 13
    //   473: getfield 360	com/google/android/gms/internal/ads/gp:a	Ljava/lang/String;
    //   476: invokevirtual 375	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   479: ifeq +245 -> 724
    //   482: aload_0
    //   483: bipush 254
    //   485: aload 13
    //   487: getfield 360	com/google/android/gms/internal/ads/gp:a	Ljava/lang/String;
    //   490: aload 13
    //   492: invokevirtual 378	com/google/android/gms/internal/ads/gp:f	()Lcom/google/android/gms/internal/ads/bbt;
    //   495: invokespecial 380	com/google/android/gms/internal/ads/gz:a	(ILjava/lang/String;Lcom/google/android/gms/internal/ads/bbt;)Lcom/google/android/gms/internal/ads/ij;
    //   498: astore 31
    //   500: getstatic 385	com/google/android/gms/internal/ads/lz:a	Landroid/os/Handler;
    //   503: new 387	com/google/android/gms/internal/ads/ha
    //   506: dup
    //   507: aload_0
    //   508: aload 31
    //   510: invokespecial 390	com/google/android/gms/internal/ads/ha:<init>	(Lcom/google/android/gms/internal/ads/gz;Lcom/google/android/gms/internal/ads/ij;)V
    //   513: invokevirtual 396	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   516: pop
    //   517: aload 29
    //   519: monitorexit
    //   520: return
    //   521: astore 28
    //   523: aload 27
    //   525: monitorexit
    //   526: aload 28
    //   528: athrow
    //   529: astore 22
    //   531: invokestatic 402	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   534: invokevirtual 405	java/lang/Thread:interrupt	()V
    //   537: aload_0
    //   538: getfield 73	com/google/android/gms/internal/ads/gz:f	Ljava/lang/Object;
    //   541: astore 23
    //   543: aload 23
    //   545: monitorenter
    //   546: aload 13
    //   548: getfield 360	com/google/android/gms/internal/ads/gp:a	Ljava/lang/String;
    //   551: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   554: ifne +18 -> 572
    //   557: aload_0
    //   558: getfield 63	com/google/android/gms/internal/ads/gz:d	Ljava/util/List;
    //   561: aload 13
    //   563: invokevirtual 372	com/google/android/gms/internal/ads/gp:e	()Lcom/google/android/gms/internal/ads/gs;
    //   566: invokeinterface 333 2 0
    //   571: pop
    //   572: aload 23
    //   574: monitorexit
    //   575: aload_0
    //   576: iconst_3
    //   577: aconst_null
    //   578: aconst_null
    //   579: invokespecial 380	com/google/android/gms/internal/ads/gz:a	(ILjava/lang/String;Lcom/google/android/gms/internal/ads/bbt;)Lcom/google/android/gms/internal/ads/ij;
    //   582: astore 9
    //   584: getstatic 385	com/google/android/gms/internal/ads/lz:a	Landroid/os/Handler;
    //   587: new 407	com/google/android/gms/internal/ads/hb
    //   590: dup
    //   591: aload_0
    //   592: aload 9
    //   594: invokespecial 408	com/google/android/gms/internal/ads/hb:<init>	(Lcom/google/android/gms/internal/ads/gz;Lcom/google/android/gms/internal/ads/ij;)V
    //   597: invokevirtual 396	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   600: pop
    //   601: return
    //   602: astore 24
    //   604: aload 23
    //   606: monitorexit
    //   607: aload 24
    //   609: athrow
    //   610: astore 18
    //   612: ldc_w 410
    //   615: aload 18
    //   617: invokestatic 412	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   620: aload_0
    //   621: getfield 73	com/google/android/gms/internal/ads/gz:f	Ljava/lang/Object;
    //   624: astore 19
    //   626: aload 19
    //   628: monitorenter
    //   629: aload 13
    //   631: getfield 360	com/google/android/gms/internal/ads/gp:a	Ljava/lang/String;
    //   634: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   637: ifne +18 -> 655
    //   640: aload_0
    //   641: getfield 63	com/google/android/gms/internal/ads/gz:d	Ljava/util/List;
    //   644: aload 13
    //   646: invokevirtual 372	com/google/android/gms/internal/ads/gp:e	()Lcom/google/android/gms/internal/ads/gs;
    //   649: invokeinterface 333 2 0
    //   654: pop
    //   655: aload 19
    //   657: monitorexit
    //   658: iload 12
    //   660: istore 8
    //   662: goto -282 -> 380
    //   665: astore 20
    //   667: aload 19
    //   669: monitorexit
    //   670: aload 20
    //   672: athrow
    //   673: astore 14
    //   675: aload_0
    //   676: getfield 73	com/google/android/gms/internal/ads/gz:f	Ljava/lang/Object;
    //   679: astore 15
    //   681: aload 15
    //   683: monitorenter
    //   684: aload 13
    //   686: getfield 360	com/google/android/gms/internal/ads/gp:a	Ljava/lang/String;
    //   689: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   692: ifne +18 -> 710
    //   695: aload_0
    //   696: getfield 63	com/google/android/gms/internal/ads/gz:d	Ljava/util/List;
    //   699: aload 13
    //   701: invokevirtual 372	com/google/android/gms/internal/ads/gp:e	()Lcom/google/android/gms/internal/ads/gs;
    //   704: invokeinterface 333 2 0
    //   709: pop
    //   710: aload 15
    //   712: monitorexit
    //   713: aload 14
    //   715: athrow
    //   716: astore 16
    //   718: aload 15
    //   720: monitorexit
    //   721: aload 16
    //   723: athrow
    //   724: aload 29
    //   726: monitorexit
    //   727: iload 12
    //   729: istore 8
    //   731: goto -351 -> 380
    //   734: astore 30
    //   736: aload 29
    //   738: monitorexit
    //   739: aload 30
    //   741: athrow
    //   742: aload 40
    //   744: astore 43
    //   746: goto -626 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	749	0	this	gz
    //   15	11	1	localIterator1	Iterator
    //   295	44	2	localHashSet	HashSet
    //   303	18	3	localArrayList1	ArrayList
    //   308	10	4	i	int
    //   311	18	5	j	int
    //   368	20	6	localArrayList2	ArrayList
    //   375	10	7	k	int
    //   378	352	8	m	int
    //   582	11	9	localij1	ij
    //   394	9	11	localObject1	Object
    //   400	328	12	n	int
    //   407	293	13	localgp1	gp
    //   673	41	14	localObject2	Object
    //   716	6	16	localObject4	Object
    //   610	6	18	localException	java.lang.Exception
    //   665	6	20	localObject6	Object
    //   529	1	22	localInterruptedException	java.lang.InterruptedException
    //   602	6	24	localObject8	Object
    //   521	6	28	localObject10	Object
    //   734	6	30	localObject12	Object
    //   498	11	31	localij2	ij
    //   326	6	34	localObject13	Object
    //   336	17	35	localgp2	gp
    //   34	209	37	localbbt	bbt
    //   41	200	38	str1	String
    //   53	13	39	localIterator2	Iterator
    //   75	668	40	str2	String
    //   217	6	41	localJSONException	org.json.JSONException
    //   114	3	42	str3	String
    //   118	627	43	str4	String
    //   124	159	44	localObject14	Object
    //   209	6	45	localObject15	Object
    //   138	111	46	localhe	he
    //   258	19	48	localgp3	gp
    // Exception table:
    //   from	to	target	type
    //   129	140	209	finally
    //   145	161	209	finally
    //   161	206	209	finally
    //   211	214	209	finally
    //   230	285	209	finally
    //   99	116	217	org/json/JSONException
    //   429	455	521	finally
    //   455	458	521	finally
    //   523	526	521	finally
    //   409	420	529	java/lang/InterruptedException
    //   546	572	602	finally
    //   572	575	602	finally
    //   604	607	602	finally
    //   409	420	610	java/lang/Exception
    //   629	655	665	finally
    //   655	658	665	finally
    //   667	670	665	finally
    //   409	420	673	finally
    //   531	537	673	finally
    //   612	620	673	finally
    //   684	710	716	finally
    //   710	713	716	finally
    //   718	721	716	finally
    //   467	520	734	finally
    //   724	727	734	finally
    //   736	739	734	finally
  }
  
  public final void a(String paramString)
  {
    synchronized (this.f)
    {
      this.e.add(paramString);
      return;
    }
  }
  
  public final void a(String paramString, int paramInt) {}
  
  public final void b_() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gz
 * JD-Core Version:    0.7.0.1
 */