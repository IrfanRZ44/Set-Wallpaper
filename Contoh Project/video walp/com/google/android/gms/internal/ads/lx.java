package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@cm
public final class lx
{
  private static Map<String, List<Map<String, Object>>> a = new HashMap();
  private static List<MediaCodecInfo> b;
  private static final Object c = new Object();
  
  /* Error */
  @TargetApi(16)
  public static List<Map<String, Object>> a(String paramString)
  {
    // Byte code:
    //   0: getstatic 25	com/google/android/gms/internal/ads/lx:c	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: getstatic 22	com/google/android/gms/internal/ads/lx:a	Ljava/util/Map;
    //   9: aload_0
    //   10: invokeinterface 39 2 0
    //   15: ifeq +22 -> 37
    //   18: getstatic 22	com/google/android/gms/internal/ads/lx:a	Ljava/util/Map;
    //   21: aload_0
    //   22: invokeinterface 43 2 0
    //   27: checkcast 45	java/util/List
    //   30: astore 39
    //   32: aload_1
    //   33: monitorexit
    //   34: aload 39
    //   36: areturn
    //   37: getstatic 25	com/google/android/gms/internal/ads/lx:c	Ljava/lang/Object;
    //   40: astore 9
    //   42: aload 9
    //   44: monitorenter
    //   45: getstatic 47	com/google/android/gms/internal/ads/lx:b	Ljava/util/List;
    //   48: ifnull +186 -> 234
    //   51: aload 9
    //   53: monitorexit
    //   54: new 49	java/util/ArrayList
    //   57: dup
    //   58: invokespecial 50	java/util/ArrayList:<init>	()V
    //   61: astore 11
    //   63: getstatic 47	com/google/android/gms/internal/ads/lx:b	Ljava/util/List;
    //   66: invokeinterface 54 1 0
    //   71: astore 12
    //   73: aload 12
    //   75: invokeinterface 60 1 0
    //   80: ifeq +499 -> 579
    //   83: aload 12
    //   85: invokeinterface 64 1 0
    //   90: checkcast 66	android/media/MediaCodecInfo
    //   93: astore 14
    //   95: aload 14
    //   97: invokevirtual 69	android/media/MediaCodecInfo:isEncoder	()Z
    //   100: ifne -27 -> 73
    //   103: aload 14
    //   105: invokevirtual 73	android/media/MediaCodecInfo:getSupportedTypes	()[Ljava/lang/String;
    //   108: invokestatic 79	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   111: aload_0
    //   112: invokeinterface 82 2 0
    //   117: ifeq -44 -> 73
    //   120: new 17	java/util/HashMap
    //   123: dup
    //   124: invokespecial 20	java/util/HashMap:<init>	()V
    //   127: astore 15
    //   129: aload 15
    //   131: ldc 84
    //   133: aload 14
    //   135: invokevirtual 88	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   138: invokeinterface 92 3 0
    //   143: pop
    //   144: aload 14
    //   146: aload_0
    //   147: invokevirtual 96	android/media/MediaCodecInfo:getCapabilitiesForType	(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   150: astore 17
    //   152: new 49	java/util/ArrayList
    //   155: dup
    //   156: invokespecial 50	java/util/ArrayList:<init>	()V
    //   159: astore 18
    //   161: aload 17
    //   163: getfield 102	android/media/MediaCodecInfo$CodecCapabilities:profileLevels	[Landroid/media/MediaCodecInfo$CodecProfileLevel;
    //   166: astore 19
    //   168: aload 19
    //   170: arraylength
    //   171: istore 20
    //   173: iconst_0
    //   174: istore 21
    //   176: iload 21
    //   178: iload 20
    //   180: if_icmpge +227 -> 407
    //   183: aload 19
    //   185: iload 21
    //   187: aaload
    //   188: astore 22
    //   190: iconst_2
    //   191: anewarray 104	java/lang/Integer
    //   194: astore 23
    //   196: aload 23
    //   198: iconst_0
    //   199: aload 22
    //   201: getfield 110	android/media/MediaCodecInfo$CodecProfileLevel:profile	I
    //   204: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   207: aastore
    //   208: aload 23
    //   210: iconst_1
    //   211: aload 22
    //   213: getfield 117	android/media/MediaCodecInfo$CodecProfileLevel:level	I
    //   216: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   219: aastore
    //   220: aload 18
    //   222: aload 23
    //   224: invokevirtual 120	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   227: pop
    //   228: iinc 21 1
    //   231: goto -55 -> 176
    //   234: getstatic 125	android/os/Build$VERSION:SDK_INT	I
    //   237: bipush 21
    //   239: if_icmplt +100 -> 339
    //   242: new 127	android/media/MediaCodecList
    //   245: dup
    //   246: iconst_0
    //   247: invokespecial 130	android/media/MediaCodecList:<init>	(I)V
    //   250: invokevirtual 134	android/media/MediaCodecList:getCodecInfos	()[Landroid/media/MediaCodecInfo;
    //   253: invokestatic 79	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   256: putstatic 47	com/google/android/gms/internal/ads/lx:b	Ljava/util/List;
    //   259: aload 9
    //   261: monitorexit
    //   262: goto -208 -> 54
    //   265: astore 10
    //   267: aload 9
    //   269: monitorexit
    //   270: aload 10
    //   272: athrow
    //   273: astore_3
    //   274: new 17	java/util/HashMap
    //   277: dup
    //   278: invokespecial 20	java/util/HashMap:<init>	()V
    //   281: astore 4
    //   283: aload 4
    //   285: ldc 136
    //   287: aload_3
    //   288: invokevirtual 140	java/lang/Object:getClass	()Ljava/lang/Class;
    //   291: invokevirtual 145	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   294: invokeinterface 92 3 0
    //   299: pop
    //   300: new 49	java/util/ArrayList
    //   303: dup
    //   304: invokespecial 50	java/util/ArrayList:<init>	()V
    //   307: astore 6
    //   309: aload 6
    //   311: aload 4
    //   313: invokevirtual 120	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   316: pop
    //   317: getstatic 22	com/google/android/gms/internal/ads/lx:a	Ljava/util/Map;
    //   320: aload_0
    //   321: aload 6
    //   323: invokeinterface 92 3 0
    //   328: pop
    //   329: aload_1
    //   330: monitorexit
    //   331: aload 6
    //   333: areturn
    //   334: astore_2
    //   335: aload_1
    //   336: monitorexit
    //   337: aload_2
    //   338: athrow
    //   339: getstatic 125	android/os/Build$VERSION:SDK_INT	I
    //   342: bipush 16
    //   344: if_icmplt +54 -> 398
    //   347: invokestatic 149	android/media/MediaCodecList:getCodecCount	()I
    //   350: istore 35
    //   352: new 49	java/util/ArrayList
    //   355: dup
    //   356: iload 35
    //   358: invokespecial 150	java/util/ArrayList:<init>	(I)V
    //   361: putstatic 47	com/google/android/gms/internal/ads/lx:b	Ljava/util/List;
    //   364: iconst_0
    //   365: istore 36
    //   367: iload 36
    //   369: iload 35
    //   371: if_icmpge -112 -> 259
    //   374: iload 36
    //   376: invokestatic 154	android/media/MediaCodecList:getCodecInfoAt	(I)Landroid/media/MediaCodecInfo;
    //   379: astore 37
    //   381: getstatic 47	com/google/android/gms/internal/ads/lx:b	Ljava/util/List;
    //   384: aload 37
    //   386: invokeinterface 155 2 0
    //   391: pop
    //   392: iinc 36 1
    //   395: goto -28 -> 367
    //   398: invokestatic 161	java/util/Collections:emptyList	()Ljava/util/List;
    //   401: putstatic 47	com/google/android/gms/internal/ads/lx:b	Ljava/util/List;
    //   404: goto -145 -> 259
    //   407: aload 15
    //   409: ldc 162
    //   411: aload 18
    //   413: invokeinterface 92 3 0
    //   418: pop
    //   419: getstatic 125	android/os/Build$VERSION:SDK_INT	I
    //   422: bipush 21
    //   424: if_icmplt +118 -> 542
    //   427: aload 17
    //   429: invokevirtual 166	android/media/MediaCodecInfo$CodecCapabilities:getVideoCapabilities	()Landroid/media/MediaCodecInfo$VideoCapabilities;
    //   432: astore 28
    //   434: aload 15
    //   436: ldc 168
    //   438: aload 28
    //   440: invokevirtual 174	android/media/MediaCodecInfo$VideoCapabilities:getBitrateRange	()Landroid/util/Range;
    //   443: invokestatic 177	com/google/android/gms/internal/ads/lx:a	(Landroid/util/Range;)[Ljava/lang/Integer;
    //   446: invokeinterface 92 3 0
    //   451: pop
    //   452: aload 15
    //   454: ldc 179
    //   456: aload 28
    //   458: invokevirtual 182	android/media/MediaCodecInfo$VideoCapabilities:getWidthAlignment	()I
    //   461: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   464: invokeinterface 92 3 0
    //   469: pop
    //   470: aload 15
    //   472: ldc 184
    //   474: aload 28
    //   476: invokevirtual 187	android/media/MediaCodecInfo$VideoCapabilities:getHeightAlignment	()I
    //   479: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   482: invokeinterface 92 3 0
    //   487: pop
    //   488: aload 15
    //   490: ldc 189
    //   492: aload 28
    //   494: invokevirtual 192	android/media/MediaCodecInfo$VideoCapabilities:getSupportedFrameRates	()Landroid/util/Range;
    //   497: invokestatic 177	com/google/android/gms/internal/ads/lx:a	(Landroid/util/Range;)[Ljava/lang/Integer;
    //   500: invokeinterface 92 3 0
    //   505: pop
    //   506: aload 15
    //   508: ldc 194
    //   510: aload 28
    //   512: invokevirtual 197	android/media/MediaCodecInfo$VideoCapabilities:getSupportedWidths	()Landroid/util/Range;
    //   515: invokestatic 177	com/google/android/gms/internal/ads/lx:a	(Landroid/util/Range;)[Ljava/lang/Integer;
    //   518: invokeinterface 92 3 0
    //   523: pop
    //   524: aload 15
    //   526: ldc 199
    //   528: aload 28
    //   530: invokevirtual 202	android/media/MediaCodecInfo$VideoCapabilities:getSupportedHeights	()Landroid/util/Range;
    //   533: invokestatic 177	com/google/android/gms/internal/ads/lx:a	(Landroid/util/Range;)[Ljava/lang/Integer;
    //   536: invokeinterface 92 3 0
    //   541: pop
    //   542: getstatic 125	android/os/Build$VERSION:SDK_INT	I
    //   545: bipush 23
    //   547: if_icmplt +21 -> 568
    //   550: aload 15
    //   552: ldc 204
    //   554: aload 17
    //   556: invokevirtual 207	android/media/MediaCodecInfo$CodecCapabilities:getMaxSupportedInstances	()I
    //   559: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   562: invokeinterface 92 3 0
    //   567: pop
    //   568: aload 11
    //   570: aload 15
    //   572: invokevirtual 120	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   575: pop
    //   576: goto -503 -> 73
    //   579: getstatic 22	com/google/android/gms/internal/ads/lx:a	Ljava/util/Map;
    //   582: aload_0
    //   583: aload 11
    //   585: invokeinterface 92 3 0
    //   590: pop
    //   591: aload_1
    //   592: monitorexit
    //   593: aload 11
    //   595: areturn
    //   596: astore_3
    //   597: goto -323 -> 274
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	600	0	paramString	String
    //   3	589	1	localObject1	Object
    //   334	4	2	localObject2	Object
    //   273	15	3	localRuntimeException	java.lang.RuntimeException
    //   596	1	3	localLinkageError	java.lang.LinkageError
    //   281	31	4	localHashMap1	HashMap
    //   307	25	6	localArrayList1	java.util.ArrayList
    //   265	6	10	localObject4	Object
    //   61	533	11	localArrayList2	java.util.ArrayList
    //   71	13	12	localIterator	java.util.Iterator
    //   93	52	14	localMediaCodecInfo1	MediaCodecInfo
    //   127	444	15	localHashMap2	HashMap
    //   150	405	17	localCodecCapabilities	android.media.MediaCodecInfo.CodecCapabilities
    //   159	253	18	localArrayList3	java.util.ArrayList
    //   166	18	19	arrayOfCodecProfileLevel	android.media.MediaCodecInfo.CodecProfileLevel[]
    //   171	10	20	i	int
    //   174	55	21	j	int
    //   188	24	22	localCodecProfileLevel	android.media.MediaCodecInfo.CodecProfileLevel
    //   194	29	23	arrayOfInteger	Integer[]
    //   432	97	28	localVideoCapabilities	android.media.MediaCodecInfo.VideoCapabilities
    //   350	22	35	k	int
    //   365	28	36	m	int
    //   379	6	37	localMediaCodecInfo2	MediaCodecInfo
    //   30	5	39	localList	List
    // Exception table:
    //   from	to	target	type
    //   45	54	265	finally
    //   234	259	265	finally
    //   259	262	265	finally
    //   267	270	265	finally
    //   339	364	265	finally
    //   374	392	265	finally
    //   398	404	265	finally
    //   37	45	273	java/lang/RuntimeException
    //   54	73	273	java/lang/RuntimeException
    //   73	173	273	java/lang/RuntimeException
    //   183	228	273	java/lang/RuntimeException
    //   270	273	273	java/lang/RuntimeException
    //   407	542	273	java/lang/RuntimeException
    //   542	568	273	java/lang/RuntimeException
    //   568	576	273	java/lang/RuntimeException
    //   579	591	273	java/lang/RuntimeException
    //   6	34	334	finally
    //   37	45	334	finally
    //   54	73	334	finally
    //   73	173	334	finally
    //   183	228	334	finally
    //   270	273	334	finally
    //   274	331	334	finally
    //   335	337	334	finally
    //   407	542	334	finally
    //   542	568	334	finally
    //   568	576	334	finally
    //   579	591	334	finally
    //   591	593	334	finally
    //   37	45	596	java/lang/LinkageError
    //   54	73	596	java/lang/LinkageError
    //   73	173	596	java/lang/LinkageError
    //   183	228	596	java/lang/LinkageError
    //   270	273	596	java/lang/LinkageError
    //   407	542	596	java/lang/LinkageError
    //   542	568	596	java/lang/LinkageError
    //   568	576	596	java/lang/LinkageError
    //   579	591	596	java/lang/LinkageError
  }
  
  @TargetApi(21)
  private static Integer[] a(Range<Integer> paramRange)
  {
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = ((Integer)paramRange.getLower());
    arrayOfInteger[1] = ((Integer)paramRange.getUpper());
    return arrayOfInteger;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.lx
 * JD-Core Version:    0.7.0.1
 */