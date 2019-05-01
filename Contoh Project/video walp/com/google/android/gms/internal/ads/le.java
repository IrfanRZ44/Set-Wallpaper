package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class le
  implements zn
{
  private final Map<String, mf> a = new LinkedHashMap(16, 0.75F, true);
  private long b = 0L;
  private final File c;
  private final int d;
  
  public le(File paramFile)
  {
    this(paramFile, 5242880);
  }
  
  private le(File paramFile, int paramInt)
  {
    this.c = paramFile;
    this.d = 5242880;
  }
  
  static int a(InputStream paramInputStream)
  {
    return 0x0 | c(paramInputStream) | c(paramInputStream) << 8 | c(paramInputStream) << 16 | c(paramInputStream) << 24;
  }
  
  private static InputStream a(File paramFile)
  {
    return new FileInputStream(paramFile);
  }
  
  static String a(nf paramnf)
  {
    return new String(a(paramnf, b(paramnf)), "UTF-8");
  }
  
  static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(0xFF & paramInt >> 8);
    paramOutputStream.write(0xFF & paramInt >> 16);
    paramOutputStream.write(paramInt >>> 24);
  }
  
  static void a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)paramLong);
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void a(OutputStream paramOutputStream, String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    a(paramOutputStream, arrayOfByte.length);
    paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private final void a(String paramString, mf parammf)
  {
    if (!this.a.containsKey(paramString)) {}
    mf localmf;
    for (this.b += parammf.a;; this.b += parammf.a - localmf.a)
    {
      this.a.put(paramString, parammf);
      return;
      localmf = (mf)this.a.get(paramString);
    }
  }
  
  private static byte[] a(nf paramnf, long paramLong)
  {
    long l = paramnf.a();
    if ((paramLong < 0L) || (paramLong > l) || ((int)paramLong != paramLong)) {
      throw new IOException(73 + "streamToBytes length=" + paramLong + ", maxLength=" + l);
    }
    byte[] arrayOfByte = new byte[(int)paramLong];
    new DataInputStream(paramnf).readFully(arrayOfByte);
    return arrayOfByte;
  }
  
  static long b(InputStream paramInputStream)
  {
    return 0L | 0xFF & c(paramInputStream) | (0xFF & c(paramInputStream)) << 8 | (0xFF & c(paramInputStream)) << 16 | (0xFF & c(paramInputStream)) << 24 | (0xFF & c(paramInputStream)) << 32 | (0xFF & c(paramInputStream)) << 40 | (0xFF & c(paramInputStream)) << 48 | (0xFF & c(paramInputStream)) << 56;
  }
  
  static List<apr> b(nf paramnf)
  {
    int i = a(paramnf);
    if (i == 0) {}
    for (Object localObject = Collections.emptyList();; localObject = new ArrayList(i)) {
      for (int j = 0; j < i; j++) {
        ((List)localObject).add(new apr(a(paramnf).intern(), a(paramnf).intern()));
      }
    }
    return localObject;
  }
  
  private final void b(String paramString)
  {
    try
    {
      boolean bool = d(paramString).delete();
      e(paramString);
      if (!bool)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = c(paramString);
        eb.b("Could not delete cache entry for key=%s, filename=%s", arrayOfObject);
      }
      return;
    }
    finally {}
  }
  
  private static int c(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1) {
      throw new EOFException();
    }
    return i;
  }
  
  private static String c(String paramString)
  {
    int i = paramString.length() / 2;
    String str1 = String.valueOf(String.valueOf(paramString.substring(0, i).hashCode()));
    String str2 = String.valueOf(String.valueOf(paramString.substring(i).hashCode()));
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  private final File d(String paramString)
  {
    return new File(this.c, c(paramString));
  }
  
  private final void e(String paramString)
  {
    mf localmf = (mf)this.a.remove(paramString);
    if (localmf != null) {
      this.b -= localmf.a;
    }
  }
  
  /* Error */
  public final agn a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/google/android/gms/internal/ads/le:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 97 2 0
    //   12: checkcast 87	com/google/android/gms/internal/ads/mf
    //   15: astore_3
    //   16: aload_3
    //   17: ifnonnull +11 -> 28
    //   20: aconst_null
    //   21: astore 9
    //   23: aload_0
    //   24: monitorexit
    //   25: aload 9
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 167	com/google/android/gms/internal/ads/le:d	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 4
    //   35: new 99	com/google/android/gms/internal/ads/nf
    //   38: dup
    //   39: new 227	java/io/BufferedInputStream
    //   42: dup
    //   43: aload 4
    //   45: invokestatic 229	com/google/android/gms/internal/ads/le:a	(Ljava/io/File;)Ljava/io/InputStream;
    //   48: invokespecial 230	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   51: aload 4
    //   53: invokevirtual 232	java/io/File:length	()J
    //   56: invokespecial 235	com/google/android/gms/internal/ads/nf:<init>	(Ljava/io/InputStream;J)V
    //   59: astore 5
    //   61: aload 5
    //   63: invokestatic 238	com/google/android/gms/internal/ads/mf:a	(Lcom/google/android/gms/internal/ads/nf;)Lcom/google/android/gms/internal/ads/mf;
    //   66: astore 10
    //   68: aload_1
    //   69: aload 10
    //   71: getfield 241	com/google/android/gms/internal/ads/mf:b	Ljava/lang/String;
    //   74: invokestatic 247	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   77: ifne +55 -> 132
    //   80: iconst_3
    //   81: anewarray 4	java/lang/Object
    //   84: astore 18
    //   86: aload 18
    //   88: iconst_0
    //   89: aload 4
    //   91: invokevirtual 250	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   94: aastore
    //   95: aload 18
    //   97: iconst_1
    //   98: aload_1
    //   99: aastore
    //   100: aload 18
    //   102: iconst_2
    //   103: aload 10
    //   105: getfield 241	com/google/android/gms/internal/ads/mf:b	Ljava/lang/String;
    //   108: aastore
    //   109: ldc 252
    //   111: aload 18
    //   113: invokestatic 186	com/google/android/gms/internal/ads/eb:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload_0
    //   117: aload_1
    //   118: invokespecial 176	com/google/android/gms/internal/ads/le:e	(Ljava/lang/String;)V
    //   121: aload 5
    //   123: invokevirtual 255	com/google/android/gms/internal/ads/nf:close	()V
    //   126: aconst_null
    //   127: astore 9
    //   129: goto -106 -> 23
    //   132: aload 5
    //   134: aload 5
    //   136: invokevirtual 102	com/google/android/gms/internal/ads/nf:a	()J
    //   139: invokestatic 55	com/google/android/gms/internal/ads/le:a	(Lcom/google/android/gms/internal/ads/nf;J)[B
    //   142: astore 11
    //   144: new 257	com/google/android/gms/internal/ads/agn
    //   147: dup
    //   148: invokespecial 258	com/google/android/gms/internal/ads/agn:<init>	()V
    //   151: astore 12
    //   153: aload 12
    //   155: aload 11
    //   157: putfield 261	com/google/android/gms/internal/ads/agn:a	[B
    //   160: aload 12
    //   162: aload_3
    //   163: getfield 263	com/google/android/gms/internal/ads/mf:c	Ljava/lang/String;
    //   166: putfield 264	com/google/android/gms/internal/ads/agn:b	Ljava/lang/String;
    //   169: aload 12
    //   171: aload_3
    //   172: getfield 266	com/google/android/gms/internal/ads/mf:d	J
    //   175: putfield 268	com/google/android/gms/internal/ads/agn:c	J
    //   178: aload 12
    //   180: aload_3
    //   181: getfield 270	com/google/android/gms/internal/ads/mf:e	J
    //   184: putfield 271	com/google/android/gms/internal/ads/agn:d	J
    //   187: aload 12
    //   189: aload_3
    //   190: getfield 274	com/google/android/gms/internal/ads/mf:f	J
    //   193: putfield 275	com/google/android/gms/internal/ads/agn:e	J
    //   196: aload 12
    //   198: aload_3
    //   199: getfield 278	com/google/android/gms/internal/ads/mf:g	J
    //   202: putfield 279	com/google/android/gms/internal/ads/agn:f	J
    //   205: aload_3
    //   206: getfield 283	com/google/android/gms/internal/ads/mf:h	Ljava/util/List;
    //   209: astore 13
    //   211: new 285	java/util/TreeMap
    //   214: dup
    //   215: getstatic 289	java/lang/String:CASE_INSENSITIVE_ORDER	Ljava/util/Comparator;
    //   218: invokespecial 292	java/util/TreeMap:<init>	(Ljava/util/Comparator;)V
    //   221: astore 14
    //   223: aload 13
    //   225: invokeinterface 296 1 0
    //   230: astore 15
    //   232: aload 15
    //   234: invokeinterface 301 1 0
    //   239: ifeq +91 -> 330
    //   242: aload 15
    //   244: invokeinterface 305 1 0
    //   249: checkcast 148	com/google/android/gms/internal/ads/apr
    //   252: astore 16
    //   254: aload 14
    //   256: aload 16
    //   258: invokevirtual 307	com/google/android/gms/internal/ads/apr:a	()Ljava/lang/String;
    //   261: aload 16
    //   263: invokevirtual 309	com/google/android/gms/internal/ads/apr:b	()Ljava/lang/String;
    //   266: invokeinterface 93 3 0
    //   271: pop
    //   272: goto -40 -> 232
    //   275: astore 6
    //   277: aload 5
    //   279: invokevirtual 255	com/google/android/gms/internal/ads/nf:close	()V
    //   282: aload 6
    //   284: athrow
    //   285: astore 7
    //   287: iconst_2
    //   288: anewarray 4	java/lang/Object
    //   291: astore 8
    //   293: aload 8
    //   295: iconst_0
    //   296: aload 4
    //   298: invokevirtual 250	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   301: aastore
    //   302: aload 8
    //   304: iconst_1
    //   305: aload 7
    //   307: invokevirtual 310	java/io/IOException:toString	()Ljava/lang/String;
    //   310: aastore
    //   311: ldc_w 312
    //   314: aload 8
    //   316: invokestatic 186	com/google/android/gms/internal/ads/eb:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   319: aload_0
    //   320: aload_1
    //   321: invokespecial 314	com/google/android/gms/internal/ads/le:b	(Ljava/lang/String;)V
    //   324: aconst_null
    //   325: astore 9
    //   327: goto -304 -> 23
    //   330: aload 12
    //   332: aload 14
    //   334: putfield 316	com/google/android/gms/internal/ads/agn:g	Ljava/util/Map;
    //   337: aload 12
    //   339: aload_3
    //   340: getfield 283	com/google/android/gms/internal/ads/mf:h	Ljava/util/List;
    //   343: invokestatic 320	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   346: putfield 321	com/google/android/gms/internal/ads/agn:h	Ljava/util/List;
    //   349: aload 5
    //   351: invokevirtual 255	com/google/android/gms/internal/ads/nf:close	()V
    //   354: aload 12
    //   356: astore 9
    //   358: goto -335 -> 23
    //   361: astore_2
    //   362: aload_0
    //   363: monitorexit
    //   364: aload_2
    //   365: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	366	0	this	le
    //   0	366	1	paramString	String
    //   361	4	2	localObject1	Object
    //   15	325	3	localmf1	mf
    //   33	264	4	localFile	File
    //   59	291	5	localnf	nf
    //   275	8	6	localObject2	Object
    //   285	21	7	localIOException	IOException
    //   291	24	8	arrayOfObject1	Object[]
    //   21	336	9	localObject3	Object
    //   66	38	10	localmf2	mf
    //   142	14	11	arrayOfByte	byte[]
    //   151	204	12	localagn	agn
    //   209	15	13	localList	List
    //   221	112	14	localTreeMap	java.util.TreeMap
    //   230	13	15	localIterator	Iterator
    //   252	10	16	localapr	apr
    //   84	28	18	arrayOfObject2	Object[]
    // Exception table:
    //   from	to	target	type
    //   61	121	275	finally
    //   132	232	275	finally
    //   232	272	275	finally
    //   330	349	275	finally
    //   35	61	285	java/io/IOException
    //   121	126	285	java/io/IOException
    //   277	285	285	java/io/IOException
    //   349	354	285	java/io/IOException
    //   2	16	361	finally
    //   28	35	361	finally
    //   35	61	361	finally
    //   121	126	361	finally
    //   277	285	361	finally
    //   287	324	361	finally
    //   349	354	361	finally
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/google/android/gms/internal/ads/le:c	Ljava/io/File;
    //   6: invokevirtual 324	java/io/File:exists	()Z
    //   9: ifne +41 -> 50
    //   12: aload_0
    //   13: getfield 36	com/google/android/gms/internal/ads/le:c	Ljava/io/File;
    //   16: invokevirtual 327	java/io/File:mkdirs	()Z
    //   19: ifne +28 -> 47
    //   22: iconst_1
    //   23: anewarray 4	java/lang/Object
    //   26: astore 13
    //   28: aload 13
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 36	com/google/android/gms/internal/ads/le:c	Ljava/io/File;
    //   35: invokevirtual 250	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: ldc_w 329
    //   42: aload 13
    //   44: invokestatic 331	com/google/android/gms/internal/ads/eb:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: aload_0
    //   51: getfield 36	com/google/android/gms/internal/ads/le:c	Ljava/io/File;
    //   54: invokevirtual 335	java/io/File:listFiles	()[Ljava/io/File;
    //   57: astore_2
    //   58: aload_2
    //   59: ifnull -12 -> 47
    //   62: aload_2
    //   63: arraylength
    //   64: istore_3
    //   65: iconst_0
    //   66: istore 4
    //   68: iload 4
    //   70: iload_3
    //   71: if_icmpge -24 -> 47
    //   74: aload_2
    //   75: iload 4
    //   77: aaload
    //   78: astore 5
    //   80: aload 5
    //   82: invokevirtual 232	java/io/File:length	()J
    //   85: lstore 8
    //   87: new 99	com/google/android/gms/internal/ads/nf
    //   90: dup
    //   91: new 227	java/io/BufferedInputStream
    //   94: dup
    //   95: aload 5
    //   97: invokestatic 229	com/google/android/gms/internal/ads/le:a	(Ljava/io/File;)Ljava/io/InputStream;
    //   100: invokespecial 230	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   103: lload 8
    //   105: invokespecial 235	com/google/android/gms/internal/ads/nf:<init>	(Ljava/io/InputStream;J)V
    //   108: astore 10
    //   110: aload 10
    //   112: invokestatic 238	com/google/android/gms/internal/ads/mf:a	(Lcom/google/android/gms/internal/ads/nf;)Lcom/google/android/gms/internal/ads/mf;
    //   115: astore 12
    //   117: aload 12
    //   119: lload 8
    //   121: putfield 89	com/google/android/gms/internal/ads/mf:a	J
    //   124: aload_0
    //   125: aload 12
    //   127: getfield 241	com/google/android/gms/internal/ads/mf:b	Ljava/lang/String;
    //   130: aload 12
    //   132: invokespecial 337	com/google/android/gms/internal/ads/le:a	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/mf;)V
    //   135: aload 10
    //   137: invokevirtual 255	com/google/android/gms/internal/ads/nf:close	()V
    //   140: goto +29 -> 169
    //   143: astore 11
    //   145: aload 10
    //   147: invokevirtual 255	com/google/android/gms/internal/ads/nf:close	()V
    //   150: aload 11
    //   152: athrow
    //   153: astore 6
    //   155: aload 5
    //   157: invokevirtual 173	java/io/File:delete	()Z
    //   160: pop
    //   161: goto +8 -> 169
    //   164: astore_1
    //   165: aload_0
    //   166: monitorexit
    //   167: aload_1
    //   168: athrow
    //   169: iinc 4 1
    //   172: goto -104 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	le
    //   164	4	1	localObject1	Object
    //   57	18	2	arrayOfFile	File[]
    //   64	8	3	i	int
    //   66	104	4	j	int
    //   78	78	5	localFile	File
    //   153	1	6	localIOException	IOException
    //   85	35	8	l	long
    //   108	38	10	localnf	nf
    //   143	8	11	localObject2	Object
    //   115	16	12	localmf	mf
    //   26	17	13	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   110	135	143	finally
    //   80	110	153	java/io/IOException
    //   135	140	153	java/io/IOException
    //   145	153	153	java/io/IOException
    //   2	47	164	finally
    //   50	58	164	finally
    //   62	65	164	finally
    //   74	80	164	finally
    //   80	110	164	finally
    //   135	140	164	finally
    //   145	153	164	finally
    //   155	161	164	finally
  }
  
  public final void a(String paramString, agn paramagn)
  {
    int i = 0;
    for (;;)
    {
      BufferedOutputStream localBufferedOutputStream;
      mf localmf1;
      try
      {
        int j = paramagn.a.length;
        mf localmf2;
        if (this.b + j >= this.d)
        {
          if (eb.a) {
            eb.a("Pruning old cache entries.", new Object[0]);
          }
          long l1 = this.b;
          long l2 = SystemClock.elapsedRealtime();
          Iterator localIterator = this.a.entrySet().iterator();
          if (!localIterator.hasNext()) {
            break label412;
          }
          localmf2 = (mf)((Map.Entry)localIterator.next()).getValue();
          if (!d(localmf2.b).delete()) {
            continue;
          }
          this.b -= localmf2.a;
          localIterator.remove();
          k = i + 1;
          if ((float)(this.b + j) >= 0.9F * this.d) {
            break label406;
          }
          if (eb.a)
          {
            Object[] arrayOfObject3 = new Object[3];
            arrayOfObject3[0] = Integer.valueOf(k);
            arrayOfObject3[1] = Long.valueOf(this.b - l1);
            arrayOfObject3[2] = Long.valueOf(SystemClock.elapsedRealtime() - l2);
            eb.a("pruned %d files, %d bytes, %d ms", arrayOfObject3);
          }
        }
        File localFile = d(paramString);
        try
        {
          localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(localFile));
          localmf1 = new mf(paramString, paramagn);
          if (localmf1.a(localBufferedOutputStream)) {
            break label382;
          }
          localBufferedOutputStream.close();
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localFile.getAbsolutePath();
          eb.b("Failed to write header for %s", arrayOfObject2);
          throw new IOException();
        }
        catch (IOException localIOException)
        {
          if (!localFile.delete())
          {
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = localFile.getAbsolutePath();
            eb.b("Could not clean up file %s", arrayOfObject1);
          }
        }
        return;
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = localmf2.b;
        arrayOfObject4[1] = c(localmf2.b);
        eb.b("Could not delete cache entry for key=%s, filename=%s", arrayOfObject4);
        continue;
        localBufferedOutputStream.write(paramagn.a);
      }
      finally {}
      label382:
      localBufferedOutputStream.close();
      a(paramString, localmf1);
      continue;
      label406:
      i = k;
      continue;
      label412:
      int k = i;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.le
 * JD-Core Version:    0.7.0.1
 */