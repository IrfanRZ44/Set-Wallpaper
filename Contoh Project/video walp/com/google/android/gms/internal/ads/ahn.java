package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ahn
{
  private static final String b = ahn.class.getSimpleName();
  protected Context a;
  private ExecutorService c;
  private DexClassLoader d;
  private agy e;
  private byte[] f;
  private volatile AdvertisingIdClient g = null;
  private volatile boolean h = false;
  private Future i = null;
  private boolean j;
  private volatile zo k = null;
  private Future l = null;
  private agq m;
  private boolean n = false;
  private boolean o = false;
  private Map<Pair<String, String>, aiw> p;
  private boolean q = false;
  private boolean r;
  private boolean s;
  
  private ahn(Context paramContext)
  {
    this.r = bool;
    this.s = false;
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {}
    for (;;)
    {
      this.j = bool;
      if (this.j) {
        paramContext = localContext;
      }
      this.a = paramContext;
      this.p = new HashMap();
      return;
      bool = false;
    }
  }
  
  /* Error */
  public static ahn a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: new 2	com/google/android/gms/internal/ads/ahn
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 100	com/google/android/gms/internal/ads/ahn:<init>	(Landroid/content/Context;)V
    //   11: astore 5
    //   13: aload 5
    //   15: new 102	com/google/android/gms/internal/ads/ahp
    //   18: dup
    //   19: invokespecial 103	com/google/android/gms/internal/ads/ahp:<init>	()V
    //   22: invokestatic 109	java/util/concurrent/Executors:newCachedThreadPool	(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
    //   25: putfield 111	com/google/android/gms/internal/ads/ahn:c	Ljava/util/concurrent/ExecutorService;
    //   28: aload 5
    //   30: iload_3
    //   31: putfield 54	com/google/android/gms/internal/ads/ahn:h	Z
    //   34: iload_3
    //   35: ifeq +27 -> 62
    //   38: aload 5
    //   40: aload 5
    //   42: getfield 111	com/google/android/gms/internal/ads/ahn:c	Ljava/util/concurrent/ExecutorService;
    //   45: new 113	com/google/android/gms/internal/ads/ahq
    //   48: dup
    //   49: aload 5
    //   51: invokespecial 116	com/google/android/gms/internal/ads/ahq:<init>	(Lcom/google/android/gms/internal/ads/ahn;)V
    //   54: invokeinterface 122 2 0
    //   59: putfield 56	com/google/android/gms/internal/ads/ahn:i	Ljava/util/concurrent/Future;
    //   62: aload 5
    //   64: getfield 111	com/google/android/gms/internal/ads/ahn:c	Ljava/util/concurrent/ExecutorService;
    //   67: new 124	com/google/android/gms/internal/ads/ahs
    //   70: dup
    //   71: aload 5
    //   73: invokespecial 125	com/google/android/gms/internal/ads/ahs:<init>	(Lcom/google/android/gms/internal/ads/ahn;)V
    //   76: invokeinterface 129 2 0
    //   81: invokestatic 134	com/google/android/gms/common/d:a	()Lcom/google/android/gms/common/d;
    //   84: astore 24
    //   86: aload 24
    //   88: aload 5
    //   90: getfield 80	com/google/android/gms/internal/ads/ahn:a	Landroid/content/Context;
    //   93: invokevirtual 137	com/google/android/gms/common/d:b	(Landroid/content/Context;)I
    //   96: ifle +509 -> 605
    //   99: iload 4
    //   101: istore 25
    //   103: aload 5
    //   105: iload 25
    //   107: putfield 62	com/google/android/gms/internal/ads/ahn:n	Z
    //   110: aload 24
    //   112: aload 5
    //   114: getfield 80	com/google/android/gms/internal/ads/ahn:a	Landroid/content/Context;
    //   117: invokevirtual 139	com/google/android/gms/common/d:a	(Landroid/content/Context;)I
    //   120: ifne +491 -> 611
    //   123: aload 5
    //   125: iload 4
    //   127: putfield 64	com/google/android/gms/internal/ads/ahn:o	Z
    //   130: aload 5
    //   132: iconst_0
    //   133: iconst_1
    //   134: invokevirtual 142	com/google/android/gms/internal/ads/ahn:a	(IZ)V
    //   137: invokestatic 147	com/google/android/gms/internal/ads/ahv:a	()Z
    //   140: ifeq +35 -> 175
    //   143: getstatic 153	com/google/android/gms/internal/ads/asa:bM	Lcom/google/android/gms/internal/ads/arq;
    //   146: astore 23
    //   148: invokestatic 158	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   151: aload 23
    //   153: invokevirtual 163	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   156: checkcast 165	java/lang/Boolean
    //   159: invokevirtual 168	java/lang/Boolean:booleanValue	()Z
    //   162: ifeq +13 -> 175
    //   165: new 170	java/lang/IllegalStateException
    //   168: dup
    //   169: ldc 172
    //   171: invokespecial 175	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   174: athrow
    //   175: aload 5
    //   177: new 177	com/google/android/gms/internal/ads/agy
    //   180: dup
    //   181: aconst_null
    //   182: invokespecial 180	com/google/android/gms/internal/ads/agy:<init>	(Ljava/security/SecureRandom;)V
    //   185: putfield 182	com/google/android/gms/internal/ads/ahn:e	Lcom/google/android/gms/internal/ads/agy;
    //   188: aload 5
    //   190: aload 5
    //   192: getfield 182	com/google/android/gms/internal/ads/ahn:e	Lcom/google/android/gms/internal/ads/agy;
    //   195: aload_1
    //   196: invokevirtual 185	com/google/android/gms/internal/ads/agy:a	(Ljava/lang/String;)[B
    //   199: putfield 187	com/google/android/gms/internal/ads/ahn:f	[B
    //   202: aload 5
    //   204: getfield 80	com/google/android/gms/internal/ads/ahn:a	Landroid/content/Context;
    //   207: invokevirtual 191	android/content/Context:getCacheDir	()Ljava/io/File;
    //   210: astore 13
    //   212: aload 13
    //   214: ifnonnull +53 -> 267
    //   217: aload 5
    //   219: getfield 80	com/google/android/gms/internal/ads/ahn:a	Landroid/content/Context;
    //   222: ldc 193
    //   224: iconst_0
    //   225: invokevirtual 197	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   228: astore 13
    //   230: aload 13
    //   232: ifnonnull +35 -> 267
    //   235: new 88	com/google/android/gms/internal/ads/ahk
    //   238: dup
    //   239: invokespecial 198	com/google/android/gms/internal/ads/ahk:<init>	()V
    //   242: athrow
    //   243: astore 12
    //   245: new 88	com/google/android/gms/internal/ads/ahk
    //   248: dup
    //   249: aload 12
    //   251: invokespecial 201	com/google/android/gms/internal/ads/ahk:<init>	(Ljava/lang/Throwable;)V
    //   254: athrow
    //   255: astore 8
    //   257: new 88	com/google/android/gms/internal/ads/ahk
    //   260: dup
    //   261: aload 8
    //   263: invokespecial 201	com/google/android/gms/internal/ads/ahk:<init>	(Ljava/lang/Throwable;)V
    //   266: athrow
    //   267: aload 13
    //   269: astore 14
    //   271: new 203	java/io/File
    //   274: dup
    //   275: ldc 205
    //   277: iconst_2
    //   278: anewarray 4	java/lang/Object
    //   281: dup
    //   282: iconst_0
    //   283: aload 14
    //   285: aastore
    //   286: dup
    //   287: iconst_1
    //   288: ldc 207
    //   290: aastore
    //   291: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   294: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   297: astore 15
    //   299: aload 15
    //   301: invokevirtual 217	java/io/File:exists	()Z
    //   304: ifne +52 -> 356
    //   307: aload 5
    //   309: getfield 182	com/google/android/gms/internal/ads/ahn:e	Lcom/google/android/gms/internal/ads/agy;
    //   312: aload 5
    //   314: getfield 187	com/google/android/gms/internal/ads/ahn:f	[B
    //   317: aload_2
    //   318: invokevirtual 220	com/google/android/gms/internal/ads/agy:a	([BLjava/lang/String;)[B
    //   321: astore 20
    //   323: aload 15
    //   325: invokevirtual 223	java/io/File:createNewFile	()Z
    //   328: pop
    //   329: new 225	java/io/FileOutputStream
    //   332: dup
    //   333: aload 15
    //   335: invokespecial 228	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   338: astore 22
    //   340: aload 22
    //   342: aload 20
    //   344: iconst_0
    //   345: aload 20
    //   347: arraylength
    //   348: invokevirtual 232	java/io/FileOutputStream:write	([BII)V
    //   351: aload 22
    //   353: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   356: aload 5
    //   358: aload 14
    //   360: ldc 207
    //   362: invokespecial 238	com/google/android/gms/internal/ads/ahn:b	(Ljava/io/File;Ljava/lang/String;)Z
    //   365: pop
    //   366: aload 5
    //   368: new 240	dalvik/system/DexClassLoader
    //   371: dup
    //   372: aload 15
    //   374: invokevirtual 243	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   377: aload 14
    //   379: invokevirtual 243	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   382: aconst_null
    //   383: aload 5
    //   385: getfield 80	com/google/android/gms/internal/ads/ahn:a	Landroid/content/Context;
    //   388: invokevirtual 247	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   391: invokespecial 250	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   394: putfield 252	com/google/android/gms/internal/ads/ahn:d	Ldalvik/system/DexClassLoader;
    //   397: aload 15
    //   399: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   402: aload 5
    //   404: aload 14
    //   406: ldc 207
    //   408: invokespecial 257	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;Ljava/lang/String;)V
    //   411: ldc_w 259
    //   414: iconst_2
    //   415: anewarray 4	java/lang/Object
    //   418: dup
    //   419: iconst_0
    //   420: aload 14
    //   422: aastore
    //   423: dup
    //   424: iconst_1
    //   425: ldc 207
    //   427: aastore
    //   428: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   431: invokestatic 261	com/google/android/gms/internal/ads/ahn:a	(Ljava/lang/String;)V
    //   434: aload 5
    //   436: getfield 70	com/google/android/gms/internal/ads/ahn:s	Z
    //   439: ifne +55 -> 494
    //   442: new 263	android/content/IntentFilter
    //   445: dup
    //   446: invokespecial 264	android/content/IntentFilter:<init>	()V
    //   449: astore 18
    //   451: aload 18
    //   453: ldc_w 266
    //   456: invokevirtual 269	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   459: aload 18
    //   461: ldc_w 271
    //   464: invokevirtual 269	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   467: aload 5
    //   469: getfield 80	com/google/android/gms/internal/ads/ahn:a	Landroid/content/Context;
    //   472: new 273	com/google/android/gms/internal/ads/ahn$a
    //   475: dup
    //   476: aload 5
    //   478: aconst_null
    //   479: invokespecial 276	com/google/android/gms/internal/ads/ahn$a:<init>	(Lcom/google/android/gms/internal/ads/ahn;Lcom/google/android/gms/internal/ads/ahp;)V
    //   482: aload 18
    //   484: invokevirtual 280	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   487: pop
    //   488: aload 5
    //   490: iconst_1
    //   491: putfield 70	com/google/android/gms/internal/ads/ahn:s	Z
    //   494: aload 5
    //   496: new 282	com/google/android/gms/internal/ads/agq
    //   499: dup
    //   500: aload 5
    //   502: invokespecial 283	com/google/android/gms/internal/ads/agq:<init>	(Lcom/google/android/gms/internal/ads/ahn;)V
    //   505: putfield 285	com/google/android/gms/internal/ads/ahn:m	Lcom/google/android/gms/internal/ads/agq;
    //   508: aload 5
    //   510: iconst_1
    //   511: putfield 66	com/google/android/gms/internal/ads/ahn:q	Z
    //   514: aload 5
    //   516: areturn
    //   517: astore 17
    //   519: aload 15
    //   521: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   524: aload 5
    //   526: aload 14
    //   528: ldc 207
    //   530: invokespecial 257	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;Ljava/lang/String;)V
    //   533: ldc_w 259
    //   536: iconst_2
    //   537: anewarray 4	java/lang/Object
    //   540: dup
    //   541: iconst_0
    //   542: aload 14
    //   544: aastore
    //   545: dup
    //   546: iconst_1
    //   547: ldc 207
    //   549: aastore
    //   550: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   553: invokestatic 261	com/google/android/gms/internal/ads/ahn:a	(Ljava/lang/String;)V
    //   556: aload 17
    //   558: athrow
    //   559: astore 11
    //   561: new 88	com/google/android/gms/internal/ads/ahk
    //   564: dup
    //   565: aload 11
    //   567: invokespecial 201	com/google/android/gms/internal/ads/ahk:<init>	(Ljava/lang/Throwable;)V
    //   570: athrow
    //   571: astore 10
    //   573: new 88	com/google/android/gms/internal/ads/ahk
    //   576: dup
    //   577: aload 10
    //   579: invokespecial 201	com/google/android/gms/internal/ads/ahk:<init>	(Ljava/lang/Throwable;)V
    //   582: athrow
    //   583: astore 9
    //   585: new 88	com/google/android/gms/internal/ads/ahk
    //   588: dup
    //   589: aload 9
    //   591: invokespecial 201	com/google/android/gms/internal/ads/ahk:<init>	(Ljava/lang/Throwable;)V
    //   594: athrow
    //   595: astore 7
    //   597: goto -467 -> 130
    //   600: astore 6
    //   602: aload 5
    //   604: areturn
    //   605: iconst_0
    //   606: istore 25
    //   608: goto -505 -> 103
    //   611: iconst_0
    //   612: istore 4
    //   614: goto -491 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	617	0	paramContext	Context
    //   0	617	1	paramString1	String
    //   0	617	2	paramString2	String
    //   0	617	3	paramBoolean	boolean
    //   1	612	4	bool1	boolean
    //   11	592	5	localahn	ahn
    //   600	1	6	localahk	ahk
    //   595	1	7	localThrowable	Throwable
    //   255	7	8	localagz1	agz
    //   583	7	9	localNullPointerException	java.lang.NullPointerException
    //   571	7	10	localagz2	agz
    //   559	7	11	localIOException	IOException
    //   243	7	12	localFileNotFoundException	java.io.FileNotFoundException
    //   210	58	13	localFile1	File
    //   269	274	14	localFile2	File
    //   297	223	15	localFile3	File
    //   517	40	17	localObject	Object
    //   449	34	18	localIntentFilter	android.content.IntentFilter
    //   321	25	20	arrayOfByte	byte[]
    //   338	14	22	localFileOutputStream	java.io.FileOutputStream
    //   146	6	23	localarq	arq
    //   84	27	24	locald	com.google.android.gms.common.d
    //   101	506	25	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   202	212	243	java/io/FileNotFoundException
    //   217	230	243	java/io/FileNotFoundException
    //   235	243	243	java/io/FileNotFoundException
    //   271	356	243	java/io/FileNotFoundException
    //   356	366	243	java/io/FileNotFoundException
    //   397	434	243	java/io/FileNotFoundException
    //   519	559	243	java/io/FileNotFoundException
    //   188	202	255	com/google/android/gms/internal/ads/agz
    //   366	397	517	finally
    //   202	212	559	java/io/IOException
    //   217	230	559	java/io/IOException
    //   235	243	559	java/io/IOException
    //   271	356	559	java/io/IOException
    //   356	366	559	java/io/IOException
    //   397	434	559	java/io/IOException
    //   519	559	559	java/io/IOException
    //   202	212	571	com/google/android/gms/internal/ads/agz
    //   217	230	571	com/google/android/gms/internal/ads/agz
    //   235	243	571	com/google/android/gms/internal/ads/agz
    //   271	356	571	com/google/android/gms/internal/ads/agz
    //   356	366	571	com/google/android/gms/internal/ads/agz
    //   397	434	571	com/google/android/gms/internal/ads/agz
    //   519	559	571	com/google/android/gms/internal/ads/agz
    //   202	212	583	java/lang/NullPointerException
    //   217	230	583	java/lang/NullPointerException
    //   235	243	583	java/lang/NullPointerException
    //   271	356	583	java/lang/NullPointerException
    //   356	366	583	java/lang/NullPointerException
    //   397	434	583	java/lang/NullPointerException
    //   519	559	583	java/lang/NullPointerException
    //   81	99	595	java/lang/Throwable
    //   103	123	595	java/lang/Throwable
    //   123	130	595	java/lang/Throwable
    //   13	34	600	com/google/android/gms/internal/ads/ahk
    //   38	62	600	com/google/android/gms/internal/ads/ahk
    //   62	81	600	com/google/android/gms/internal/ads/ahk
    //   81	99	600	com/google/android/gms/internal/ads/ahk
    //   103	123	600	com/google/android/gms/internal/ads/ahk
    //   123	130	600	com/google/android/gms/internal/ads/ahk
    //   130	175	600	com/google/android/gms/internal/ads/ahk
    //   175	188	600	com/google/android/gms/internal/ads/ahk
    //   188	202	600	com/google/android/gms/internal/ads/ahk
    //   202	212	600	com/google/android/gms/internal/ads/ahk
    //   217	230	600	com/google/android/gms/internal/ads/ahk
    //   235	243	600	com/google/android/gms/internal/ads/ahk
    //   245	255	600	com/google/android/gms/internal/ads/ahk
    //   257	267	600	com/google/android/gms/internal/ads/ahk
    //   271	356	600	com/google/android/gms/internal/ads/ahk
    //   356	366	600	com/google/android/gms/internal/ads/ahk
    //   397	434	600	com/google/android/gms/internal/ads/ahk
    //   434	494	600	com/google/android/gms/internal/ads/ahk
    //   494	514	600	com/google/android/gms/internal/ads/ahk
    //   519	559	600	com/google/android/gms/internal/ads/ahk
    //   561	571	600	com/google/android/gms/internal/ads/ahk
    //   573	583	600	com/google/android/gms/internal/ads/ahk
    //   585	595	600	com/google/android/gms/internal/ads/ahk
  }
  
  private static void a(File paramFile)
  {
    if (!paramFile.exists())
    {
      String str = b;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramFile.getAbsolutePath();
      Log.d(str, String.format("File %s not found. No need for deletion", arrayOfObject));
      return;
    }
    paramFile.delete();
  }
  
  /* Error */
  private final void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 203	java/io/File
    //   5: dup
    //   6: ldc_w 302
    //   9: iconst_2
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_1
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: aload_2
    //   20: aastore
    //   21: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   24: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   27: astore 4
    //   29: aload 4
    //   31: invokevirtual 217	java/io/File:exists	()Z
    //   34: ifeq +4 -> 38
    //   37: return
    //   38: new 203	java/io/File
    //   41: dup
    //   42: ldc_w 259
    //   45: iconst_2
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_1
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: aload_2
    //   56: aastore
    //   57: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   60: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   63: astore 5
    //   65: aload 5
    //   67: invokevirtual 217	java/io/File:exists	()Z
    //   70: ifeq -33 -> 37
    //   73: aload 5
    //   75: invokevirtual 306	java/io/File:length	()J
    //   78: lstore 6
    //   80: lload 6
    //   82: lconst_0
    //   83: lcmp
    //   84: ifle -47 -> 37
    //   87: lload 6
    //   89: l2i
    //   90: newarray byte
    //   92: astore 8
    //   94: new 308	java/io/FileInputStream
    //   97: dup
    //   98: aload 5
    //   100: invokespecial 309	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   103: astore 9
    //   105: aload 9
    //   107: aload 8
    //   109: invokevirtual 313	java/io/FileInputStream:read	([B)I
    //   112: istore 19
    //   114: iload 19
    //   116: ifgt +14 -> 130
    //   119: aload 9
    //   121: invokevirtual 314	java/io/FileInputStream:close	()V
    //   124: aload 5
    //   126: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   129: return
    //   130: new 316	com/google/android/gms/internal/ads/ads
    //   133: dup
    //   134: invokespecial 317	com/google/android/gms/internal/ads/ads:<init>	()V
    //   137: astore 20
    //   139: aload 20
    //   141: getstatic 322	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   144: invokevirtual 326	java/lang/String:getBytes	()[B
    //   147: putfield 328	com/google/android/gms/internal/ads/ads:d	[B
    //   150: aload 20
    //   152: aload_2
    //   153: invokevirtual 326	java/lang/String:getBytes	()[B
    //   156: putfield 330	com/google/android/gms/internal/ads/ads:c	[B
    //   159: aload_0
    //   160: getfield 182	com/google/android/gms/internal/ads/ahn:e	Lcom/google/android/gms/internal/ads/agy;
    //   163: aload_0
    //   164: getfield 187	com/google/android/gms/internal/ads/ahn:f	[B
    //   167: aload 8
    //   169: invokevirtual 333	com/google/android/gms/internal/ads/agy:a	([B[B)Ljava/lang/String;
    //   172: invokevirtual 326	java/lang/String:getBytes	()[B
    //   175: astore 21
    //   177: aload 20
    //   179: aload 21
    //   181: putfield 335	com/google/android/gms/internal/ads/ads:a	[B
    //   184: aload 20
    //   186: aload 21
    //   188: invokestatic 340	com/google/android/gms/internal/ads/afx:a	([B)[B
    //   191: putfield 342	com/google/android/gms/internal/ads/ads:b	[B
    //   194: aload 4
    //   196: invokevirtual 223	java/io/File:createNewFile	()Z
    //   199: pop
    //   200: new 225	java/io/FileOutputStream
    //   203: dup
    //   204: aload 4
    //   206: invokespecial 228	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   209: astore 11
    //   211: aload 20
    //   213: invokestatic 347	com/google/android/gms/internal/ads/afc:a	(Lcom/google/android/gms/internal/ads/afc;)[B
    //   216: astore 27
    //   218: aload 11
    //   220: aload 27
    //   222: iconst_0
    //   223: aload 27
    //   225: arraylength
    //   226: invokevirtual 232	java/io/FileOutputStream:write	([BII)V
    //   229: aload 11
    //   231: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   234: aload 9
    //   236: invokevirtual 314	java/io/FileInputStream:close	()V
    //   239: aload 11
    //   241: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   244: aload 5
    //   246: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   249: return
    //   250: astore 33
    //   252: aconst_null
    //   253: astore 11
    //   255: aload_3
    //   256: ifnull +7 -> 263
    //   259: aload_3
    //   260: invokevirtual 314	java/io/FileInputStream:close	()V
    //   263: aload 11
    //   265: ifnull +8 -> 273
    //   268: aload 11
    //   270: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   273: aload 5
    //   275: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   278: return
    //   279: astore 16
    //   281: aconst_null
    //   282: astore 9
    //   284: aload 9
    //   286: ifnull +8 -> 294
    //   289: aload 9
    //   291: invokevirtual 314	java/io/FileInputStream:close	()V
    //   294: aload_3
    //   295: ifnull +7 -> 302
    //   298: aload_3
    //   299: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   302: aload 5
    //   304: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   307: aload 16
    //   309: athrow
    //   310: astore 30
    //   312: goto -188 -> 124
    //   315: astore 28
    //   317: goto -78 -> 239
    //   320: astore 29
    //   322: goto -78 -> 244
    //   325: astore 13
    //   327: goto -64 -> 263
    //   330: astore 12
    //   332: goto -59 -> 273
    //   335: astore 18
    //   337: goto -43 -> 294
    //   340: astore 17
    //   342: goto -40 -> 302
    //   345: astore 16
    //   347: aconst_null
    //   348: astore_3
    //   349: goto -65 -> 284
    //   352: astore 26
    //   354: aload 11
    //   356: astore_3
    //   357: aload 26
    //   359: astore 16
    //   361: goto -77 -> 284
    //   364: astore 15
    //   366: aload 9
    //   368: astore_3
    //   369: aconst_null
    //   370: astore 11
    //   372: goto -117 -> 255
    //   375: astore 25
    //   377: aload 9
    //   379: astore_3
    //   380: goto -125 -> 255
    //   383: astore 32
    //   385: aconst_null
    //   386: astore 11
    //   388: aconst_null
    //   389: astore_3
    //   390: goto -135 -> 255
    //   393: astore 14
    //   395: aload 9
    //   397: astore_3
    //   398: aconst_null
    //   399: astore 11
    //   401: goto -146 -> 255
    //   404: astore 24
    //   406: aload 9
    //   408: astore_3
    //   409: goto -154 -> 255
    //   412: astore 31
    //   414: aconst_null
    //   415: astore 11
    //   417: aconst_null
    //   418: astore_3
    //   419: goto -164 -> 255
    //   422: astore 10
    //   424: aload 9
    //   426: astore_3
    //   427: aconst_null
    //   428: astore 11
    //   430: goto -175 -> 255
    //   433: astore 23
    //   435: aload 9
    //   437: astore_3
    //   438: goto -183 -> 255
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	441	0	this	ahn
    //   0	441	1	paramFile	File
    //   0	441	2	paramString	String
    //   1	437	3	localObject1	Object
    //   27	178	4	localFile1	File
    //   63	240	5	localFile2	File
    //   78	10	6	l1	long
    //   92	76	8	arrayOfByte1	byte[]
    //   103	333	9	localFileInputStream	java.io.FileInputStream
    //   422	1	10	localIOException1	IOException
    //   209	220	11	localFileOutputStream	java.io.FileOutputStream
    //   330	1	12	localIOException2	IOException
    //   325	1	13	localIOException3	IOException
    //   393	1	14	localNoSuchAlgorithmException1	java.security.NoSuchAlgorithmException
    //   364	1	15	localagz1	agz
    //   279	29	16	localObject2	Object
    //   345	1	16	localObject3	Object
    //   359	1	16	localObject4	Object
    //   340	1	17	localIOException4	IOException
    //   335	1	18	localIOException5	IOException
    //   112	3	19	i1	int
    //   137	75	20	localads	ads
    //   175	12	21	arrayOfByte2	byte[]
    //   433	1	23	localIOException6	IOException
    //   404	1	24	localNoSuchAlgorithmException2	java.security.NoSuchAlgorithmException
    //   375	1	25	localagz2	agz
    //   352	6	26	localObject5	Object
    //   216	8	27	arrayOfByte3	byte[]
    //   315	1	28	localIOException7	IOException
    //   320	1	29	localIOException8	IOException
    //   310	1	30	localIOException9	IOException
    //   412	1	31	localIOException10	IOException
    //   383	1	32	localNoSuchAlgorithmException3	java.security.NoSuchAlgorithmException
    //   250	1	33	localagz3	agz
    // Exception table:
    //   from	to	target	type
    //   94	105	250	com/google/android/gms/internal/ads/agz
    //   94	105	279	finally
    //   119	124	310	java/io/IOException
    //   234	239	315	java/io/IOException
    //   239	244	320	java/io/IOException
    //   259	263	325	java/io/IOException
    //   268	273	330	java/io/IOException
    //   289	294	335	java/io/IOException
    //   298	302	340	java/io/IOException
    //   105	114	345	finally
    //   130	211	345	finally
    //   211	234	352	finally
    //   105	114	364	com/google/android/gms/internal/ads/agz
    //   130	211	364	com/google/android/gms/internal/ads/agz
    //   211	234	375	com/google/android/gms/internal/ads/agz
    //   94	105	383	java/security/NoSuchAlgorithmException
    //   105	114	393	java/security/NoSuchAlgorithmException
    //   130	211	393	java/security/NoSuchAlgorithmException
    //   211	234	404	java/security/NoSuchAlgorithmException
    //   94	105	412	java/io/IOException
    //   105	114	422	java/io/IOException
    //   130	211	422	java/io/IOException
    //   211	234	433	java/io/IOException
  }
  
  private static void a(String paramString)
  {
    a(new File(paramString));
  }
  
  private static boolean b(int paramInt, zo paramzo)
  {
    if (paramInt < 4)
    {
      if (paramzo == null) {
        return true;
      }
      arq localarq1 = asa.bP;
      if ((((Boolean)aos.f().a(localarq1)).booleanValue()) && ((paramzo.n == null) || (paramzo.n.equals("0000000000000000000000000000000000000000000000000000000000000000")))) {
        return true;
      }
      arq localarq2 = asa.bQ;
      if ((((Boolean)aos.f().a(localarq2)).booleanValue()) && ((paramzo.X == null) || (paramzo.X.a == null) || (paramzo.X.a.longValue() == -2L))) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  private final boolean b(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 203	java/io/File
    //   5: dup
    //   6: ldc_w 302
    //   9: iconst_2
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_1
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: aload_2
    //   20: aastore
    //   21: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   24: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   27: astore 4
    //   29: aload 4
    //   31: invokevirtual 217	java/io/File:exists	()Z
    //   34: ifne +5 -> 39
    //   37: iconst_0
    //   38: ireturn
    //   39: new 203	java/io/File
    //   42: dup
    //   43: ldc_w 259
    //   46: iconst_2
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload_1
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload_2
    //   57: aastore
    //   58: invokestatic 213	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   61: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   64: astore 5
    //   66: aload 5
    //   68: invokevirtual 217	java/io/File:exists	()Z
    //   71: ifeq +5 -> 76
    //   74: iconst_0
    //   75: ireturn
    //   76: aload 4
    //   78: invokevirtual 306	java/io/File:length	()J
    //   81: lstore 17
    //   83: lload 17
    //   85: lconst_0
    //   86: lcmp
    //   87: ifgt +10 -> 97
    //   90: aload 4
    //   92: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   95: iconst_0
    //   96: ireturn
    //   97: lload 17
    //   99: l2i
    //   100: newarray byte
    //   102: astore 19
    //   104: new 308	java/io/FileInputStream
    //   107: dup
    //   108: aload 4
    //   110: invokespecial 309	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   113: astore 13
    //   115: aload 13
    //   117: aload 19
    //   119: invokevirtual 313	java/io/FileInputStream:read	([B)I
    //   122: ifgt +25 -> 147
    //   125: getstatic 46	com/google/android/gms/internal/ads/ahn:b	Ljava/lang/String;
    //   128: ldc_w 385
    //   131: invokestatic 295	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   134: pop
    //   135: aload 4
    //   137: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   140: aload 13
    //   142: invokevirtual 314	java/io/FileInputStream:close	()V
    //   145: iconst_0
    //   146: ireturn
    //   147: new 316	com/google/android/gms/internal/ads/ads
    //   150: dup
    //   151: invokespecial 317	com/google/android/gms/internal/ads/ads:<init>	()V
    //   154: aload 19
    //   156: invokestatic 388	com/google/android/gms/internal/ads/afc:a	(Lcom/google/android/gms/internal/ads/afc;[B)Lcom/google/android/gms/internal/ads/afc;
    //   159: checkcast 316	com/google/android/gms/internal/ads/ads
    //   162: astore 23
    //   164: aload_2
    //   165: new 209	java/lang/String
    //   168: dup
    //   169: aload 23
    //   171: getfield 330	com/google/android/gms/internal/ads/ads:c	[B
    //   174: invokespecial 391	java/lang/String:<init>	([B)V
    //   177: invokevirtual 364	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   180: ifeq +39 -> 219
    //   183: aload 23
    //   185: getfield 342	com/google/android/gms/internal/ads/ads:b	[B
    //   188: aload 23
    //   190: getfield 335	com/google/android/gms/internal/ads/ads:a	[B
    //   193: invokestatic 340	com/google/android/gms/internal/ads/afx:a	([B)[B
    //   196: invokestatic 396	java/util/Arrays:equals	([B[B)Z
    //   199: ifeq +20 -> 219
    //   202: aload 23
    //   204: getfield 328	com/google/android/gms/internal/ads/ads:d	[B
    //   207: getstatic 322	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   210: invokevirtual 326	java/lang/String:getBytes	()[B
    //   213: invokestatic 396	java/util/Arrays:equals	([B[B)Z
    //   216: ifne +15 -> 231
    //   219: aload 4
    //   221: invokestatic 254	com/google/android/gms/internal/ads/ahn:a	(Ljava/io/File;)V
    //   224: aload 13
    //   226: invokevirtual 314	java/io/FileInputStream:close	()V
    //   229: iconst_0
    //   230: ireturn
    //   231: aload_0
    //   232: getfield 182	com/google/android/gms/internal/ads/ahn:e	Lcom/google/android/gms/internal/ads/agy;
    //   235: aload_0
    //   236: getfield 187	com/google/android/gms/internal/ads/ahn:f	[B
    //   239: new 209	java/lang/String
    //   242: dup
    //   243: aload 23
    //   245: getfield 335	com/google/android/gms/internal/ads/ads:a	[B
    //   248: invokespecial 391	java/lang/String:<init>	([B)V
    //   251: invokevirtual 220	com/google/android/gms/internal/ads/agy:a	([BLjava/lang/String;)[B
    //   254: astore 25
    //   256: aload 5
    //   258: invokevirtual 223	java/io/File:createNewFile	()Z
    //   261: pop
    //   262: new 225	java/io/FileOutputStream
    //   265: dup
    //   266: aload 5
    //   268: invokespecial 228	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   271: astore 7
    //   273: aload 7
    //   275: aload 25
    //   277: iconst_0
    //   278: aload 25
    //   280: arraylength
    //   281: invokevirtual 232	java/io/FileOutputStream:write	([BII)V
    //   284: aload 13
    //   286: invokevirtual 314	java/io/FileInputStream:close	()V
    //   289: aload 7
    //   291: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   294: iconst_1
    //   295: ireturn
    //   296: astore 16
    //   298: aconst_null
    //   299: astore 7
    //   301: aconst_null
    //   302: astore 8
    //   304: aload 8
    //   306: ifnull +8 -> 314
    //   309: aload 8
    //   311: invokevirtual 314	java/io/FileInputStream:close	()V
    //   314: aload 7
    //   316: ifnull +8 -> 324
    //   319: aload 7
    //   321: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   324: iconst_0
    //   325: ireturn
    //   326: astore 12
    //   328: aconst_null
    //   329: astore 13
    //   331: aload 13
    //   333: ifnull +8 -> 341
    //   336: aload 13
    //   338: invokevirtual 314	java/io/FileInputStream:close	()V
    //   341: aload_3
    //   342: ifnull +7 -> 349
    //   345: aload_3
    //   346: invokevirtual 235	java/io/FileOutputStream:close	()V
    //   349: aload 12
    //   351: athrow
    //   352: astore 34
    //   354: goto -209 -> 145
    //   357: astore 24
    //   359: goto -130 -> 229
    //   362: astore 31
    //   364: goto -75 -> 289
    //   367: astore 32
    //   369: goto -75 -> 294
    //   372: astore 10
    //   374: goto -60 -> 314
    //   377: astore 9
    //   379: goto -55 -> 324
    //   382: astore 15
    //   384: goto -43 -> 341
    //   387: astore 14
    //   389: goto -40 -> 349
    //   392: astore 12
    //   394: aconst_null
    //   395: astore_3
    //   396: goto -65 -> 331
    //   399: astore 30
    //   401: aload 7
    //   403: astore_3
    //   404: aload 30
    //   406: astore 12
    //   408: goto -77 -> 331
    //   411: astore 22
    //   413: aload 13
    //   415: astore 8
    //   417: aconst_null
    //   418: astore 7
    //   420: goto -116 -> 304
    //   423: astore 29
    //   425: aload 13
    //   427: astore 8
    //   429: goto -125 -> 304
    //   432: astore 11
    //   434: aconst_null
    //   435: astore 7
    //   437: aconst_null
    //   438: astore 8
    //   440: goto -136 -> 304
    //   443: astore 21
    //   445: aload 13
    //   447: astore 8
    //   449: aconst_null
    //   450: astore 7
    //   452: goto -148 -> 304
    //   455: astore 28
    //   457: aload 13
    //   459: astore 8
    //   461: goto -157 -> 304
    //   464: astore 6
    //   466: aconst_null
    //   467: astore 7
    //   469: aconst_null
    //   470: astore 8
    //   472: goto -168 -> 304
    //   475: astore 20
    //   477: aload 13
    //   479: astore 8
    //   481: aconst_null
    //   482: astore 7
    //   484: goto -180 -> 304
    //   487: astore 27
    //   489: aload 13
    //   491: astore 8
    //   493: goto -189 -> 304
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	496	0	this	ahn
    //   0	496	1	paramFile	File
    //   0	496	2	paramString	String
    //   1	403	3	localObject1	Object
    //   27	193	4	localFile1	File
    //   64	203	5	localFile2	File
    //   464	1	6	localIOException1	IOException
    //   271	212	7	localFileOutputStream	java.io.FileOutputStream
    //   302	190	8	localFileInputStream1	java.io.FileInputStream
    //   377	1	9	localIOException2	IOException
    //   372	1	10	localIOException3	IOException
    //   432	1	11	localNoSuchAlgorithmException1	java.security.NoSuchAlgorithmException
    //   326	24	12	localObject2	Object
    //   392	1	12	localObject3	Object
    //   406	1	12	localObject4	Object
    //   113	377	13	localFileInputStream2	java.io.FileInputStream
    //   387	1	14	localIOException4	IOException
    //   382	1	15	localIOException5	IOException
    //   296	1	16	localagz1	agz
    //   81	17	17	l1	long
    //   102	53	19	arrayOfByte1	byte[]
    //   475	1	20	localIOException6	IOException
    //   443	1	21	localNoSuchAlgorithmException2	java.security.NoSuchAlgorithmException
    //   411	1	22	localagz2	agz
    //   162	82	23	localads	ads
    //   357	1	24	localIOException7	IOException
    //   254	25	25	arrayOfByte2	byte[]
    //   487	1	27	localIOException8	IOException
    //   455	1	28	localNoSuchAlgorithmException3	java.security.NoSuchAlgorithmException
    //   423	1	29	localagz3	agz
    //   399	6	30	localObject5	Object
    //   362	1	31	localIOException9	IOException
    //   367	1	32	localIOException10	IOException
    //   352	1	34	localIOException11	IOException
    // Exception table:
    //   from	to	target	type
    //   76	83	296	com/google/android/gms/internal/ads/agz
    //   90	95	296	com/google/android/gms/internal/ads/agz
    //   97	115	296	com/google/android/gms/internal/ads/agz
    //   76	83	326	finally
    //   90	95	326	finally
    //   97	115	326	finally
    //   140	145	352	java/io/IOException
    //   224	229	357	java/io/IOException
    //   284	289	362	java/io/IOException
    //   289	294	367	java/io/IOException
    //   309	314	372	java/io/IOException
    //   319	324	377	java/io/IOException
    //   336	341	382	java/io/IOException
    //   345	349	387	java/io/IOException
    //   115	140	392	finally
    //   147	219	392	finally
    //   219	224	392	finally
    //   231	273	392	finally
    //   273	284	399	finally
    //   115	140	411	com/google/android/gms/internal/ads/agz
    //   147	219	411	com/google/android/gms/internal/ads/agz
    //   219	224	411	com/google/android/gms/internal/ads/agz
    //   231	273	411	com/google/android/gms/internal/ads/agz
    //   273	284	423	com/google/android/gms/internal/ads/agz
    //   76	83	432	java/security/NoSuchAlgorithmException
    //   90	95	432	java/security/NoSuchAlgorithmException
    //   97	115	432	java/security/NoSuchAlgorithmException
    //   115	140	443	java/security/NoSuchAlgorithmException
    //   147	219	443	java/security/NoSuchAlgorithmException
    //   219	224	443	java/security/NoSuchAlgorithmException
    //   231	273	443	java/security/NoSuchAlgorithmException
    //   273	284	455	java/security/NoSuchAlgorithmException
    //   76	83	464	java/io/IOException
    //   90	95	464	java/io/IOException
    //   97	115	464	java/io/IOException
    //   115	140	475	java/io/IOException
    //   147	219	475	java/io/IOException
    //   219	224	475	java/io/IOException
    //   231	273	475	java/io/IOException
    //   273	284	487	java/io/IOException
  }
  
  private final void o()
  {
    try
    {
      if ((this.g == null) && (this.j))
      {
        AdvertisingIdClient localAdvertisingIdClient = new AdvertisingIdClient(this.a);
        localAdvertisingIdClient.start();
        this.g = localAdvertisingIdClient;
      }
      return;
    }
    catch (g localg)
    {
      this.g = null;
      return;
    }
    catch (h localh)
    {
      break label40;
    }
    catch (IOException localIOException)
    {
      label40:
      break label40;
    }
  }
  
  private final zo p()
  {
    try
    {
      PackageInfo localPackageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
      zo localzo = sz.a(this.a, this.a.getPackageName(), Integer.toString(localPackageInfo.versionCode));
      return localzo;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public final Context a()
  {
    return this.a;
  }
  
  public final Method a(String paramString1, String paramString2)
  {
    aiw localaiw = (aiw)this.p.get(new Pair(paramString1, paramString2));
    if (localaiw == null) {
      return null;
    }
    return localaiw.a();
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    if (!this.o) {}
    Future localFuture;
    do
    {
      return;
      localFuture = this.c.submit(new ahr(this, paramInt, paramBoolean));
    } while (paramInt != 0);
    this.l = localFuture;
  }
  
  public final boolean a(String paramString1, String paramString2, Class<?>... paramVarArgs)
  {
    if (!this.p.containsKey(new Pair(paramString1, paramString2)))
    {
      this.p.put(new Pair(paramString1, paramString2), new aiw(this, paramString1, paramString2, paramVarArgs));
      return true;
    }
    return false;
  }
  
  final zo b(int paramInt, boolean paramBoolean)
  {
    long l1;
    if ((paramInt > 0) && (paramBoolean)) {
      l1 = paramInt * 1000;
    }
    try
    {
      Thread.sleep(l1);
      label19:
      return p();
    }
    catch (InterruptedException localInterruptedException)
    {
      break label19;
    }
  }
  
  public final boolean b()
  {
    return this.q;
  }
  
  public final ExecutorService c()
  {
    return this.c;
  }
  
  public final DexClassLoader d()
  {
    return this.d;
  }
  
  public final agy e()
  {
    return this.e;
  }
  
  public final byte[] f()
  {
    return this.f;
  }
  
  public final boolean g()
  {
    return this.n;
  }
  
  public final agq h()
  {
    return this.m;
  }
  
  public final boolean i()
  {
    return this.o;
  }
  
  public final boolean j()
  {
    return this.r;
  }
  
  public final zo k()
  {
    return this.k;
  }
  
  public final Future l()
  {
    return this.l;
  }
  
  public final AdvertisingIdClient m()
  {
    if (!this.h) {
      return null;
    }
    if (this.g != null) {
      return this.g;
    }
    if (this.i != null) {}
    try
    {
      this.i.get(2000L, TimeUnit.MILLISECONDS);
      this.i = null;
      label49:
      return this.g;
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        this.i.cancel(true);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      break label49;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label49;
    }
  }
  
  public final int n()
  {
    int i1 = -2147483648;
    if (this.m != null) {
      i1 = agq.a();
    }
    return i1;
  }
  
  final class a
    extends BroadcastReceiver
  {
    private a() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction())) {
        ahn.a(ahn.this, true);
      }
      while (!"android.intent.action.SCREEN_OFF".equals(paramIntent.getAction())) {
        return;
      }
      ahn.a(ahn.this, false);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ahn
 * JD-Core Version:    0.7.0.1
 */