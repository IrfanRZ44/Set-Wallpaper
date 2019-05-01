package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class ayp
{
  private final Map<ayq, ayr> a = new HashMap();
  private final LinkedList<ayq> b = new LinkedList();
  private axk c;
  
  static Set<String> a(zzjj paramzzjj)
  {
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(paramzzjj.c.keySet());
    Bundle localBundle = paramzzjj.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    if (localBundle != null) {
      localHashSet.addAll(localBundle.keySet());
    }
    return localHashSet;
  }
  
  private static void a(Bundle paramBundle, String paramString)
  {
    for (;;)
    {
      String[] arrayOfString = paramString.split("/", 2);
      if (arrayOfString.length == 0) {}
      do
      {
        return;
        String str = arrayOfString[0];
        if (arrayOfString.length == 1)
        {
          paramBundle.remove(str);
          return;
        }
        paramBundle = paramBundle.getBundle(str);
      } while (paramBundle == null);
      paramString = arrayOfString[1];
    }
  }
  
  private static void a(String paramString, ayq paramayq)
  {
    if (je.a(2)) {
      je.a(String.format(paramString, new Object[] { paramayq }));
    }
  }
  
  private static String[] a(String paramString)
  {
    try
    {
      String[] arrayOfString = paramString.split("");
      for (int i = 0; i < arrayOfString.length; i++) {
        arrayOfString[i] = new String(Base64.decode(arrayOfString[i], 0), "UTF-8");
      }
      return arrayOfString;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      arrayOfString = new String[0];
    }
  }
  
  static zzjj b(zzjj paramzzjj)
  {
    zzjj localzzjj = d(paramzzjj);
    Bundle localBundle = localzzjj.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    if (localBundle != null) {
      localBundle.putBoolean("_skipMediation", true);
    }
    localzzjj.c.putBoolean("_skipMediation", true);
    return localzzjj;
  }
  
  private final String b()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localStringBuilder.append(Base64.encodeToString(((ayq)localIterator.next()).toString().getBytes("UTF-8"), 0));
        if (localIterator.hasNext()) {
          localStringBuilder.append("");
        }
      }
      str = localStringBuilder.toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return "";
    }
    String str;
    return str;
  }
  
  private static boolean b(String paramString)
  {
    try
    {
      arq localarq = asa.ba;
      boolean bool = Pattern.matches((String)aos.f().a(localarq), paramString);
      return bool;
    }
    catch (RuntimeException localRuntimeException)
    {
      zzbv.zzeo().a(localRuntimeException, "InterstitialAdPool.isExcludedAdUnit");
    }
    return false;
  }
  
  private static zzjj c(zzjj paramzzjj)
  {
    zzjj localzzjj = d(paramzzjj);
    arq localarq = asa.aW;
    for (String str1 : ((String)aos.f().a(localarq)).split(","))
    {
      a(localzzjj.m, str1);
      if (str1.startsWith("com.google.ads.mediation.admob.AdMobAdapter/"))
      {
        String str2 = str1.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", "");
        a(localzzjj.c, str2);
      }
    }
    return localzzjj;
  }
  
  private static String c(String paramString)
  {
    try
    {
      Matcher localMatcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(paramString);
      if (localMatcher.matches())
      {
        String str = localMatcher.group(1);
        paramString = str;
      }
      return paramString;
    }
    catch (RuntimeException localRuntimeException) {}
    return paramString;
  }
  
  private static zzjj d(zzjj paramzzjj)
  {
    Parcel localParcel = Parcel.obtain();
    paramzzjj.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    zzjj localzzjj = (zzjj)zzjj.CREATOR.createFromParcel(localParcel);
    localParcel.recycle();
    arq localarq = asa.aN;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {
      localzzjj = localzzjj.a();
    }
    return localzzjj;
  }
  
  final ays a(zzjj paramzzjj, String paramString)
  {
    if (b(paramString)) {
      return null;
    }
    int i = new fd(this.c.a()).a().n;
    zzjj localzzjj = c(paramzzjj);
    String str1 = c(paramString);
    ayq localayq1 = new ayq(localzzjj, str1, i);
    ayr localayr1 = (ayr)this.a.get(localayq1);
    ayr localayr4;
    if (localayr1 == null)
    {
      a("Interstitial pool created at %s.", localayq1);
      localayr4 = new ayr(localzzjj, str1, i);
      this.a.put(localayq1, localayr4);
    }
    for (ayr localayr2 = localayr4;; localayr2 = localayr1)
    {
      this.b.remove(localayq1);
      this.b.add(localayq1);
      localayr2.g();
      for (;;)
      {
        int j = this.b.size();
        arq localarq1 = asa.aX;
        if (j <= ((Integer)aos.f().a(localarq1)).intValue()) {
          break;
        }
        ayq localayq2 = (ayq)this.b.remove();
        ayr localayr3 = (ayr)this.a.get(localayq2);
        a("Evicting interstitial queue for %s.", localayq2);
        while (localayr3.d() > 0)
        {
          ays localays2 = localayr3.a(null);
          if (localays2.e) {
            ayu.a().c();
          }
          localays2.a.zzdj();
        }
        this.a.remove(localayq2);
      }
      while (localayr2.d() > 0)
      {
        ays localays1 = localayr2.a(localzzjj);
        if (localays1.e)
        {
          long l = zzbv.zzer().a() - localays1.d;
          arq localarq2 = asa.aZ;
          if (l > 1000L * ((Integer)aos.f().a(localarq2)).intValue())
          {
            a("Expired interstitial at %s.", localayq1);
            ayu.a().b();
            continue;
          }
        }
        if (localays1.b != null) {}
        for (String str2 = " (inline) ";; str2 = " ")
        {
          a(34 + String.valueOf(str2).length() + "Pooled interstitial" + str2 + "returned at %s.", localayq1);
          return localays1;
        }
      }
      return null;
    }
  }
  
  final void a()
  {
    if (this.c == null) {}
    do
    {
      return;
      Iterator localIterator1 = this.a.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
        ayq localayq2 = (ayq)localEntry2.getKey();
        ayr localayr2 = (ayr)localEntry2.getValue();
        if (je.a(2))
        {
          int k = localayr2.d();
          int m = localayr2.e();
          if (m < k)
          {
            Object[] arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(k - m);
            arrayOfObject[1] = Integer.valueOf(k);
            arrayOfObject[2] = localayq2;
            je.a(String.format("Loading %s/%s pooled interstitials for %s.", arrayOfObject));
          }
        }
        int i = 0 + localayr2.f();
        for (;;)
        {
          int j = localayr2.d();
          arq localarq = asa.aY;
          if (j >= ((Integer)aos.f().a(localarq)).intValue()) {
            break;
          }
          a("Pooling and loading one new interstitial for %s.", localayq2);
          if (localayr2.a(this.c)) {
            i++;
          }
        }
        ayu.a().a(i);
      }
    } while (this.c == null);
    SharedPreferences.Editor localEditor = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
    localEditor.clear();
    Iterator localIterator2 = this.a.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      ayq localayq1 = (ayq)localEntry1.getKey();
      ayr localayr1 = (ayr)localEntry1.getValue();
      if (localayr1.h())
      {
        String str = new ayw(localayr1).a();
        localEditor.putString(localayq1.toString(), str);
        a("Saved interstitial queue for %s.", localayq1);
      }
    }
    localEditor.putString("PoolKeys", b());
    localEditor.apply();
  }
  
  /* Error */
  final void a(axk paramaxk)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 268	com/google/android/gms/internal/ads/ayp:c	Lcom/google/android/gms/internal/ads/axk;
    //   4: ifnonnull +337 -> 341
    //   7: aload_0
    //   8: aload_1
    //   9: invokevirtual 482	com/google/android/gms/internal/ads/axk:b	()Lcom/google/android/gms/internal/ads/axk;
    //   12: putfield 268	com/google/android/gms/internal/ads/ayp:c	Lcom/google/android/gms/internal/ads/axk;
    //   15: aload_0
    //   16: getfield 268	com/google/android/gms/internal/ads/ayp:c	Lcom/google/android/gms/internal/ads/axk;
    //   19: ifnull +322 -> 341
    //   22: aload_0
    //   23: getfield 268	com/google/android/gms/internal/ads/ayp:c	Lcom/google/android/gms/internal/ads/axk;
    //   26: invokevirtual 273	com/google/android/gms/internal/ads/axk:a	()Landroid/content/Context;
    //   29: ldc_w 436
    //   32: iconst_0
    //   33: invokevirtual 442	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   36: astore_2
    //   37: aload_0
    //   38: getfield 28	com/google/android/gms/internal/ads/ayp:b	Ljava/util/LinkedList;
    //   41: invokevirtual 322	java/util/LinkedList:size	()I
    //   44: ifle +77 -> 121
    //   47: aload_0
    //   48: getfield 28	com/google/android/gms/internal/ads/ayp:b	Ljava/util/LinkedList;
    //   51: invokevirtual 332	java/util/LinkedList:remove	()Ljava/lang/Object;
    //   54: checkcast 131	com/google/android/gms/internal/ads/ayq
    //   57: astore 17
    //   59: aload_0
    //   60: getfield 23	com/google/android/gms/internal/ads/ayp:a	Ljava/util/Map;
    //   63: aload 17
    //   65: invokeinterface 298 2 0
    //   70: checkcast 300	com/google/android/gms/internal/ads/ayr
    //   73: astore 18
    //   75: ldc_w 484
    //   78: aload 17
    //   80: invokestatic 304	com/google/android/gms/internal/ads/ayp:a	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ayq;)V
    //   83: aload 18
    //   85: invokevirtual 336	com/google/android/gms/internal/ads/ayr:d	()I
    //   88: ifle +18 -> 106
    //   91: aload 18
    //   93: aconst_null
    //   94: invokevirtual 339	com/google/android/gms/internal/ads/ayr:a	(Lcom/google/android/gms/internal/ads/zzjj;)Lcom/google/android/gms/internal/ads/ays;
    //   97: getfield 355	com/google/android/gms/internal/ads/ays:a	Lcom/google/android/gms/ads/internal/zzal;
    //   100: invokevirtual 360	com/google/android/gms/ads/internal/zzal:zzdj	()V
    //   103: goto -20 -> 83
    //   106: aload_0
    //   107: getfield 23	com/google/android/gms/internal/ads/ayp:a	Ljava/util/Map;
    //   110: aload 17
    //   112: invokeinterface 362 2 0
    //   117: pop
    //   118: goto -81 -> 37
    //   121: new 20	java/util/HashMap
    //   124: dup
    //   125: invokespecial 21	java/util/HashMap:<init>	()V
    //   128: astore_3
    //   129: aload_2
    //   130: invokeinterface 488 1 0
    //   135: invokeinterface 406 1 0
    //   140: invokeinterface 407 1 0
    //   145: astore 5
    //   147: aload 5
    //   149: invokeinterface 125 1 0
    //   154: ifeq +188 -> 342
    //   157: aload 5
    //   159: invokeinterface 129 1 0
    //   164: checkcast 409	java/util/Map$Entry
    //   167: astore 11
    //   169: aload 11
    //   171: invokeinterface 412 1 0
    //   176: checkcast 63	java/lang/String
    //   179: ldc_w 471
    //   182: invokevirtual 491	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   185: ifne -38 -> 147
    //   188: aload 11
    //   190: invokeinterface 415 1 0
    //   195: checkcast 63	java/lang/String
    //   198: invokestatic 494	com/google/android/gms/internal/ads/ayw:a	(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ayw;
    //   201: astore 12
    //   203: new 131	com/google/android/gms/internal/ads/ayq
    //   206: dup
    //   207: aload 12
    //   209: getfield 496	com/google/android/gms/internal/ads/ayw:a	Lcom/google/android/gms/internal/ads/zzjj;
    //   212: aload 12
    //   214: getfield 499	com/google/android/gms/internal/ads/ayw:b	Ljava/lang/String;
    //   217: aload 12
    //   219: getfield 501	com/google/android/gms/internal/ads/ayw:c	I
    //   222: invokespecial 292	com/google/android/gms/internal/ads/ayq:<init>	(Lcom/google/android/gms/internal/ads/zzjj;Ljava/lang/String;I)V
    //   225: astore 13
    //   227: aload_0
    //   228: getfield 23	com/google/android/gms/internal/ads/ayp:a	Ljava/util/Map;
    //   231: aload 13
    //   233: invokeinterface 504 2 0
    //   238: ifne -91 -> 147
    //   241: new 300	com/google/android/gms/internal/ads/ayr
    //   244: dup
    //   245: aload 12
    //   247: getfield 496	com/google/android/gms/internal/ads/ayw:a	Lcom/google/android/gms/internal/ads/zzjj;
    //   250: aload 12
    //   252: getfield 499	com/google/android/gms/internal/ads/ayw:b	Ljava/lang/String;
    //   255: aload 12
    //   257: getfield 501	com/google/android/gms/internal/ads/ayw:c	I
    //   260: invokespecial 305	com/google/android/gms/internal/ads/ayr:<init>	(Lcom/google/android/gms/internal/ads/zzjj;Ljava/lang/String;I)V
    //   263: astore 14
    //   265: aload_0
    //   266: getfield 23	com/google/android/gms/internal/ads/ayp:a	Ljava/util/Map;
    //   269: aload 13
    //   271: aload 14
    //   273: invokeinterface 309 3 0
    //   278: pop
    //   279: aload_3
    //   280: aload 13
    //   282: invokevirtual 134	com/google/android/gms/internal/ads/ayq:toString	()Ljava/lang/String;
    //   285: aload 13
    //   287: invokeinterface 309 3 0
    //   292: pop
    //   293: ldc_w 506
    //   296: aload 13
    //   298: invokestatic 304	com/google/android/gms/internal/ads/ayp:a	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ayq;)V
    //   301: goto -154 -> 147
    //   304: astore 4
    //   306: invokestatic 181	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   309: aload 4
    //   311: ldc_w 508
    //   314: invokevirtual 188	com/google/android/gms/internal/ads/io:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   317: ldc_w 510
    //   320: aload 4
    //   322: invokestatic 513	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   325: aload_0
    //   326: getfield 23	com/google/android/gms/internal/ads/ayp:a	Ljava/util/Map;
    //   329: invokeinterface 515 1 0
    //   334: aload_0
    //   335: getfield 28	com/google/android/gms/internal/ads/ayp:b	Ljava/util/LinkedList;
    //   338: invokevirtual 516	java/util/LinkedList:clear	()V
    //   341: return
    //   342: aload_2
    //   343: ldc_w 471
    //   346: ldc 148
    //   348: invokeinterface 519 3 0
    //   353: invokestatic 521	com/google/android/gms/internal/ads/ayp:a	(Ljava/lang/String;)[Ljava/lang/String;
    //   356: astore 6
    //   358: aload 6
    //   360: arraylength
    //   361: istore 7
    //   363: iconst_0
    //   364: istore 8
    //   366: iload 8
    //   368: iload 7
    //   370: if_icmpge -29 -> 341
    //   373: aload_3
    //   374: aload 6
    //   376: iload 8
    //   378: aaload
    //   379: invokeinterface 298 2 0
    //   384: checkcast 131	com/google/android/gms/internal/ads/ayq
    //   387: astore 9
    //   389: aload_0
    //   390: getfield 23	com/google/android/gms/internal/ads/ayp:a	Ljava/util/Map;
    //   393: aload 9
    //   395: invokeinterface 504 2 0
    //   400: ifeq +13 -> 413
    //   403: aload_0
    //   404: getfield 28	com/google/android/gms/internal/ads/ayp:b	Ljava/util/LinkedList;
    //   407: aload 9
    //   409: invokevirtual 315	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   412: pop
    //   413: iinc 8 1
    //   416: goto -50 -> 366
    //   419: astore 4
    //   421: goto -115 -> 306
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	424	0	this	ayp
    //   0	424	1	paramaxk	axk
    //   36	307	2	localSharedPreferences	SharedPreferences
    //   128	246	3	localHashMap	HashMap
    //   304	17	4	localRuntimeException	RuntimeException
    //   419	1	4	localIOException	java.io.IOException
    //   145	13	5	localIterator	Iterator
    //   356	19	6	arrayOfString	String[]
    //   361	10	7	i	int
    //   364	50	8	j	int
    //   387	21	9	localayq1	ayq
    //   167	22	11	localEntry	Map.Entry
    //   201	55	12	localayw	ayw
    //   225	72	13	localayq2	ayq
    //   263	9	14	localayr1	ayr
    //   57	54	17	localayq3	ayq
    //   73	19	18	localayr2	ayr
    // Exception table:
    //   from	to	target	type
    //   121	147	304	java/lang/RuntimeException
    //   147	301	304	java/lang/RuntimeException
    //   342	363	304	java/lang/RuntimeException
    //   373	413	304	java/lang/RuntimeException
    //   121	147	419	java/io/IOException
    //   147	301	419	java/io/IOException
    //   342	363	419	java/io/IOException
    //   373	413	419	java/io/IOException
  }
  
  final void b(zzjj paramzzjj, String paramString)
  {
    if (this.c == null) {
      return;
    }
    int i = new fd(this.c.a()).a().n;
    zzjj localzzjj = c(paramzzjj);
    String str = c(paramString);
    ayq localayq = new ayq(localzzjj, str, i);
    ayr localayr = (ayr)this.a.get(localayq);
    if (localayr == null)
    {
      a("Interstitial pool created at %s.", localayq);
      localayr = new ayr(localzzjj, str, i);
      this.a.put(localayq, localayr);
    }
    localayr.a(this.c, paramzzjj);
    localayr.g();
    a("Inline entry added to the queue at %s.", localayq);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayp
 * JD-Core Version:    0.7.0.1
 */