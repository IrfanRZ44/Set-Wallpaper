package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class asd
{
  private BlockingQueue<asn> a = new ArrayBlockingQueue(100);
  private ExecutorService b;
  private LinkedHashMap<String, String> c = new LinkedHashMap();
  private Map<String, ash> d = new HashMap();
  private String e;
  private Context f;
  private String g;
  private AtomicBoolean h;
  private File i;
  
  /* Error */
  private final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/google/android/gms/internal/ads/asd:a	Ljava/util/concurrent/BlockingQueue;
    //   4: invokeinterface 57 1 0
    //   9: checkcast 59	com/google/android/gms/internal/ads/asn
    //   12: astore_2
    //   13: aload_2
    //   14: invokevirtual 62	com/google/android/gms/internal/ads/asn:b	()Ljava/lang/String;
    //   17: astore_3
    //   18: aload_3
    //   19: invokestatic 68	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   22: ifne -22 -> 0
    //   25: aload_0
    //   26: aload_0
    //   27: getfield 42	com/google/android/gms/internal/ads/asd:c	Ljava/util/LinkedHashMap;
    //   30: aload_2
    //   31: invokevirtual 71	com/google/android/gms/internal/ads/asn:c	()Ljava/util/Map;
    //   34: invokevirtual 74	com/google/android/gms/internal/ads/asd:a	(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    //   37: astore 4
    //   39: aload_0
    //   40: getfield 76	com/google/android/gms/internal/ads/asd:e	Ljava/lang/String;
    //   43: invokestatic 82	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   46: invokevirtual 86	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   49: astore 5
    //   51: aload 4
    //   53: invokeinterface 92 1 0
    //   58: invokeinterface 98 1 0
    //   63: astore 6
    //   65: aload 6
    //   67: invokeinterface 104 1 0
    //   72: ifeq +52 -> 124
    //   75: aload 6
    //   77: invokeinterface 107 1 0
    //   82: checkcast 109	java/util/Map$Entry
    //   85: astore 18
    //   87: aload 5
    //   89: aload 18
    //   91: invokeinterface 112 1 0
    //   96: checkcast 114	java/lang/String
    //   99: aload 18
    //   101: invokeinterface 117 1 0
    //   106: checkcast 114	java/lang/String
    //   109: invokevirtual 123	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   112: pop
    //   113: goto -48 -> 65
    //   116: astore_1
    //   117: ldc 125
    //   119: aload_1
    //   120: invokestatic 130	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   123: return
    //   124: new 132	java/lang/StringBuilder
    //   127: dup
    //   128: aload 5
    //   130: invokevirtual 136	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   133: invokevirtual 139	android/net/Uri:toString	()Ljava/lang/String;
    //   136: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: astore 7
    //   141: aload 7
    //   143: ldc 144
    //   145: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload_3
    //   149: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload 7
    //   155: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: astore 9
    //   160: aload_0
    //   161: getfield 151	com/google/android/gms/internal/ads/asd:h	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   164: invokevirtual 156	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   167: ifeq +138 -> 305
    //   170: aload_0
    //   171: getfield 158	com/google/android/gms/internal/ads/asd:i	Ljava/io/File;
    //   174: astore 11
    //   176: aload 11
    //   178: ifnull +119 -> 297
    //   181: new 160	java/io/FileOutputStream
    //   184: dup
    //   185: aload 11
    //   187: iconst_1
    //   188: invokespecial 163	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   191: astore 12
    //   193: aload 12
    //   195: aload 9
    //   197: invokevirtual 167	java/lang/String:getBytes	()[B
    //   200: invokevirtual 171	java/io/FileOutputStream:write	([B)V
    //   203: aload 12
    //   205: bipush 10
    //   207: invokevirtual 173	java/io/FileOutputStream:write	(I)V
    //   210: aload 12
    //   212: invokevirtual 176	java/io/FileOutputStream:close	()V
    //   215: goto -215 -> 0
    //   218: astore 17
    //   220: ldc 178
    //   222: aload 17
    //   224: invokestatic 130	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   227: goto -227 -> 0
    //   230: astore 13
    //   232: aconst_null
    //   233: astore 12
    //   235: ldc 180
    //   237: aload 13
    //   239: invokestatic 130	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   242: aload 12
    //   244: ifnull -244 -> 0
    //   247: aload 12
    //   249: invokevirtual 176	java/io/FileOutputStream:close	()V
    //   252: goto -252 -> 0
    //   255: astore 16
    //   257: ldc 178
    //   259: aload 16
    //   261: invokestatic 130	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   264: goto -264 -> 0
    //   267: astore 14
    //   269: aconst_null
    //   270: astore 12
    //   272: aload 12
    //   274: ifnull +8 -> 282
    //   277: aload 12
    //   279: invokevirtual 176	java/io/FileOutputStream:close	()V
    //   282: aload 14
    //   284: athrow
    //   285: astore 15
    //   287: ldc 178
    //   289: aload 15
    //   291: invokestatic 130	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   294: goto -12 -> 282
    //   297: ldc 182
    //   299: invokestatic 184	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   302: goto -302 -> 0
    //   305: invokestatic 190	com/google/android/gms/ads/internal/zzbv:zzek	()Lcom/google/android/gms/internal/ads/jn;
    //   308: pop
    //   309: aload_0
    //   310: getfield 192	com/google/android/gms/internal/ads/asd:f	Landroid/content/Context;
    //   313: aload_0
    //   314: getfield 194	com/google/android/gms/internal/ads/asd:g	Ljava/lang/String;
    //   317: aload 9
    //   319: invokestatic 199	com/google/android/gms/internal/ads/jn:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   322: goto -322 -> 0
    //   325: astore 14
    //   327: goto -55 -> 272
    //   330: astore 13
    //   332: goto -97 -> 235
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	335	0	this	asd
    //   116	4	1	localInterruptedException	java.lang.InterruptedException
    //   12	19	2	localasn	asn
    //   17	132	3	str1	String
    //   37	15	4	localMap	Map
    //   49	80	5	localBuilder	android.net.Uri.Builder
    //   63	13	6	localIterator	Iterator
    //   139	15	7	localStringBuilder	java.lang.StringBuilder
    //   158	160	9	str2	String
    //   174	12	11	localFile	File
    //   191	87	12	localFileOutputStream	java.io.FileOutputStream
    //   230	8	13	localIOException1	java.io.IOException
    //   330	1	13	localIOException2	java.io.IOException
    //   267	16	14	localObject1	Object
    //   325	1	14	localObject2	Object
    //   285	5	15	localIOException3	java.io.IOException
    //   255	5	16	localIOException4	java.io.IOException
    //   218	5	17	localIOException5	java.io.IOException
    //   85	15	18	localEntry	Map.Entry
    // Exception table:
    //   from	to	target	type
    //   0	18	116	java/lang/InterruptedException
    //   210	215	218	java/io/IOException
    //   181	193	230	java/io/IOException
    //   247	252	255	java/io/IOException
    //   181	193	267	finally
    //   277	282	285	java/io/IOException
    //   193	210	325	finally
    //   235	242	325	finally
    //   193	210	330	java/io/IOException
  }
  
  public final ash a(String paramString)
  {
    ash localash = (ash)this.d.get(paramString);
    if (localash != null) {
      return localash;
    }
    return ash.a;
  }
  
  final Map<String, String> a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(paramMap1);
    if (paramMap2 == null) {
      return localLinkedHashMap;
    }
    Iterator localIterator = paramMap2.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getKey();
      String str2 = (String)localEntry.getValue();
      String str3 = (String)localLinkedHashMap.get(str1);
      localLinkedHashMap.put(str1, a(str1).a(str3, str2));
    }
    return localLinkedHashMap;
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    this.f = paramContext;
    this.g = paramString1;
    this.e = paramString2;
    this.h = new AtomicBoolean(false);
    AtomicBoolean localAtomicBoolean = this.h;
    arq localarq = asa.P;
    localAtomicBoolean.set(((Boolean)aos.f().a(localarq)).booleanValue());
    if (this.h.get())
    {
      File localFile = Environment.getExternalStorageDirectory();
      if (localFile != null) {
        this.i = new File(localFile, "sdk_csi_data.txt");
      }
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.c.put((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    this.b = Executors.newSingleThreadExecutor();
    this.b.execute(new ase(this));
    this.d.put("action", ash.b);
    this.d.put("ad_format", ash.b);
    this.d.put("e", ash.c);
  }
  
  public final void a(List<String> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      this.c.put("e", TextUtils.join(",", paramList));
    }
  }
  
  public final boolean a(asn paramasn)
  {
    return this.a.offer(paramasn);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asd
 * JD-Core Version:    0.7.0.1
 */