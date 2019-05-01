package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class eo
  extends dr
{
  private static final Object a = new Object();
  @GuardedBy("sLock")
  private static eo b;
  private final Context c;
  private final en d;
  private final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
  
  private eo(Context paramContext, en paramen)
  {
    this.c = paramContext;
    this.d = paramen;
  }
  
  public static eo a(Context paramContext, en paramen)
  {
    synchronized (a)
    {
      if (b == null)
      {
        if (paramContext.getApplicationContext() != null) {
          paramContext = paramContext.getApplicationContext();
        }
        asa.a(paramContext);
        b = new eo(paramContext, paramen);
        if (paramContext.getApplicationContext() != null) {
          zzbv.zzek().c(paramContext);
        }
        jb.a(paramContext);
      }
      eo localeo = b;
      return localeo;
    }
  }
  
  private static zzaej a(Context paramContext, en paramen, zzaef paramzzaef, ScheduledExecutorService paramScheduledExecutorService)
  {
    je.b("Starting ad request from service using: google.afma.request.getAdDictionary");
    arq localarq1 = asa.N;
    asn localasn = new asn(((Boolean)aos.f().a(localarq1)).booleanValue(), "load_ad", paramzzaef.d.a);
    if ((paramzzaef.a > 10) && (paramzzaef.A != -1L)) {
      localasn.a(localasn.a(paramzzaef.A), new String[] { "cts" });
    }
    asl localasl = localasn.a();
    ne localne1 = paramen.i.a(paramContext);
    arq localarq2 = asa.cA;
    ne localne2 = mt.a(localne1, ((Long)aos.f().a(localarq2)).longValue(), TimeUnit.MILLISECONDS, paramScheduledExecutorService);
    ne localne3 = paramen.h.a(paramContext);
    arq localarq3 = asa.bv;
    ne localne4 = mt.a(localne3, ((Long)aos.f().a(localarq3)).longValue(), TimeUnit.MILLISECONDS, paramScheduledExecutorService);
    ne localne5 = paramen.c.a(paramzzaef.g.packageName);
    ne localne6 = paramen.c.b(paramzzaef.g.packageName);
    ne localne7 = paramen.j.a(paramzzaef.h, paramzzaef.g);
    Future localFuture = zzbv.zzev().a(paramContext);
    Object localObject1 = mt.a(null);
    Bundle localBundle1 = paramzzaef.c.c;
    int i;
    ne localne8;
    nd localnd;
    ne localne11;
    arq localarq8;
    if ((localBundle1 != null) && (localBundle1.getString("_ad") != null))
    {
      i = 1;
      if ((paramzzaef.G) && (i == 0)) {
        localObject1 = paramen.f.a(paramzzaef.f);
      }
      arq localarq4 = asa.cr;
      localne8 = mt.a((ne)localObject1, ((Long)aos.f().a(localarq4)).longValue(), TimeUnit.MILLISECONDS, paramScheduledExecutorService);
      localnd = mt.a(null);
      arq localarq5 = asa.aJ;
      if (!((Boolean)aos.f().a(localarq5)).booleanValue()) {
        break label1142;
      }
      localne11 = paramen.j.a(paramContext);
      localarq8 = asa.aK;
    }
    label565:
    label876:
    label1142:
    for (Object localObject2 = mt.a(localne11, ((Long)aos.f().a(localarq8)).longValue(), TimeUnit.MILLISECONDS, paramScheduledExecutorService);; localObject2 = localnd)
    {
      if ((paramzzaef.a >= 4) && (paramzzaef.o != null)) {}
      for (Bundle localBundle2 = paramzzaef.o;; localBundle2 = null)
      {
        arq localarq6 = asa.ad;
        ((Boolean)aos.f().a(localarq6)).booleanValue();
        zzbv.zzek();
        if ((jn.a(paramContext, "android.permission.ACCESS_NETWORK_STATE")) && (((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo() == null)) {
          je.b("Device is offline.");
        }
        if (paramzzaef.a >= 7) {}
        for (String str1 = paramzzaef.v;; str1 = UUID.randomUUID().toString())
        {
          new eu(paramContext, str1, paramzzaef.f.packageName);
          if (paramzzaef.c.c == null) {
            break label565;
          }
          String str5 = paramzzaef.c.c.getString("_ad");
          if (str5 == null) {
            break label565;
          }
          return et.a(paramContext, paramzzaef, str5);
          i = 0;
          break;
        }
        List localList = paramen.d.a(paramzzaef.w);
        arq localarq7 = asa.cA;
        Bundle localBundle3 = (Bundle)mt.a(localne2, null, ((Long)aos.f().a(localarq7)).longValue(), TimeUnit.MILLISECONDS);
        fm localfm = (fm)mt.a(localne4, null);
        Location localLocation = (Location)mt.a(localne8, null);
        AdvertisingIdClient.Info localInfo = (AdvertisingIdClient.Info)mt.a((Future)localObject2, null);
        String str2 = (String)mt.a(localne7, null);
        String str3 = (String)mt.a(localne5, null);
        String str4 = (String)mt.a(localne6, null);
        fc localfc = (fc)mt.a(localFuture, null);
        if (localfc == null)
        {
          je.e("Error fetching device info. This is not recoverable.");
          return new zzaej(0);
        }
        em localem = new em();
        localem.j = paramzzaef;
        localem.k = localfc;
        localem.e = localfm;
        localem.d = localLocation;
        localem.b = localBundle3;
        localem.h = str2;
        localem.i = localInfo;
        if (localList == null) {
          localem.c.clear();
        }
        localem.c = localList;
        localem.a = localBundle2;
        localem.f = str3;
        localem.g = str4;
        localem.l = paramen.b.a(paramContext);
        localem.m = paramen.k;
        JSONObject localJSONObject = et.a(paramContext, localem);
        if (localJSONObject == null) {
          return new zzaej(0);
        }
        if (paramzzaef.a < 7) {}
        try
        {
          localJSONObject.put("request_id", str1);
          localasn.a(localasl, new String[] { "arc" });
          localasn.a();
          ne localne9 = mt.a(mt.a(paramen.l.a().b(localJSONObject), ep.a, paramScheduledExecutorService), 10L, TimeUnit.SECONDS, paramScheduledExecutorService);
          ne localne10 = paramen.e.a();
          if (localne10 != null) {
            mr.a(localne10, "AdRequestServiceImpl.loadAd.flags");
          }
          fa localfa = (fa)mt.a(localne9, null);
          if (localfa == null) {
            return new zzaej(0);
          }
          if (localfa.a() != -2) {
            return new zzaej(localfa.a());
          }
          localasn.d();
          boolean bool = TextUtils.isEmpty(localfa.i());
          zzaej localzzaej = null;
          if (!bool) {
            localzzaej = et.a(paramContext, paramzzaef, localfa.i());
          }
          if ((localzzaej == null) && (!TextUtils.isEmpty(localfa.e()))) {
            localzzaej = a(paramzzaef, paramContext, paramzzaef.k.a, localfa.e(), str3, str4, localfa, localasn, paramen);
          }
          if (localzzaej == null) {
            localzzaej = new zzaej(0);
          }
          localasn.a(localasl, new String[] { "tts" });
          localzzaej.w = localasn.b();
          return localzzaej;
        }
        catch (JSONException localJSONException)
        {
          break label876;
        }
      }
    }
  }
  
  /* Error */
  public static zzaej a(zzaef paramzzaef, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, fa paramfa, asn paramasn, en paramen)
  {
    // Byte code:
    //   0: aload 7
    //   2: ifnull +874 -> 876
    //   5: aload 7
    //   7: invokevirtual 152	com/google/android/gms/internal/ads/asn:a	()Lcom/google/android/gms/internal/ads/asl;
    //   10: astore 9
    //   12: new 497	com/google/android/gms/internal/ads/ey
    //   15: dup
    //   16: aload_0
    //   17: aload 6
    //   19: invokevirtual 499	com/google/android/gms/internal/ads/fa:c	()Ljava/lang/String;
    //   22: invokespecial 502	com/google/android/gms/internal/ads/ey:<init>	(Lcom/google/android/gms/internal/ads/zzaef;Ljava/lang/String;)V
    //   25: astore 10
    //   27: aload_3
    //   28: invokestatic 506	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore 14
    //   33: aload 14
    //   35: invokevirtual 509	java/lang/String:length	()I
    //   38: ifeq +418 -> 456
    //   41: ldc_w 511
    //   44: aload 14
    //   46: invokevirtual 514	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   49: astore 15
    //   51: aload 15
    //   53: invokestatic 92	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;)V
    //   56: new 516	java/net/URL
    //   59: dup
    //   60: aload_3
    //   61: invokespecial 518	java/net/URL:<init>	(Ljava/lang/String;)V
    //   64: astore 16
    //   66: invokestatic 522	com/google/android/gms/ads/internal/zzbv:zzer	()Lcom/google/android/gms/common/util/c;
    //   69: invokeinterface 526 1 0
    //   74: lstore 17
    //   76: iconst_0
    //   77: istore 19
    //   79: aload 16
    //   81: astore 20
    //   83: aload 8
    //   85: ifnull +13 -> 98
    //   88: aload 8
    //   90: getfield 529	com/google/android/gms/internal/ads/en:g	Lcom/google/android/gms/internal/ads/fk;
    //   93: invokeinterface 533 1 0
    //   98: aload 20
    //   100: invokevirtual 537	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   103: checkcast 539	java/net/HttpURLConnection
    //   106: astore 21
    //   108: invokestatic 63	com/google/android/gms/ads/internal/zzbv:zzek	()Lcom/google/android/gms/internal/ads/jn;
    //   111: aload_1
    //   112: aload_2
    //   113: iconst_0
    //   114: aload 21
    //   116: invokevirtual 542	com/google/android/gms/internal/ads/jn:a	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //   119: aload 6
    //   121: invokevirtual 544	com/google/android/gms/internal/ads/fa:g	()Z
    //   124: ifeq +39 -> 163
    //   127: aload 4
    //   129: invokestatic 476	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   132: ifne +13 -> 145
    //   135: aload 21
    //   137: ldc_w 546
    //   140: aload 4
    //   142: invokevirtual 550	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload 5
    //   147: invokestatic 476	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   150: ifne +13 -> 163
    //   153: aload 21
    //   155: ldc_w 552
    //   158: aload 5
    //   160: invokevirtual 550	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: aload_0
    //   164: getfield 555	com/google/android/gms/internal/ads/zzaef:H	Ljava/lang/String;
    //   167: astore 23
    //   169: aload 23
    //   171: invokestatic 476	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   174: ifne +19 -> 193
    //   177: ldc_w 557
    //   180: invokestatic 92	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;)V
    //   183: aload 21
    //   185: ldc_w 559
    //   188: aload 23
    //   190: invokevirtual 550	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: aconst_null
    //   194: astore 24
    //   196: aload 6
    //   198: ifnull +71 -> 269
    //   201: aload 6
    //   203: invokevirtual 561	com/google/android/gms/internal/ads/fa:d	()Ljava/lang/String;
    //   206: invokestatic 476	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   209: istore 25
    //   211: aconst_null
    //   212: astore 24
    //   214: iload 25
    //   216: ifne +53 -> 269
    //   219: aload 21
    //   221: iconst_1
    //   222: invokevirtual 565	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   225: aload 6
    //   227: invokevirtual 561	com/google/android/gms/internal/ads/fa:d	()Ljava/lang/String;
    //   230: invokevirtual 569	java/lang/String:getBytes	()[B
    //   233: astore 24
    //   235: aload 21
    //   237: aload 24
    //   239: arraylength
    //   240: invokevirtual 572	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   243: new 574	java/io/BufferedOutputStream
    //   246: dup
    //   247: aload 21
    //   249: invokevirtual 578	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   252: invokespecial 581	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   255: astore 26
    //   257: aload 26
    //   259: aload 24
    //   261: invokevirtual 585	java/io/BufferedOutputStream:write	([B)V
    //   264: aload 26
    //   266: invokestatic 590	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   269: new 592	com/google/android/gms/internal/ads/md
    //   272: dup
    //   273: aload_0
    //   274: getfield 299	com/google/android/gms/internal/ads/zzaef:v	Ljava/lang/String;
    //   277: invokespecial 593	com/google/android/gms/internal/ads/md:<init>	(Ljava/lang/String;)V
    //   280: astore 29
    //   282: aload 29
    //   284: aload 21
    //   286: aload 24
    //   288: invokevirtual 596	com/google/android/gms/internal/ads/md:a	(Ljava/net/HttpURLConnection;[B)V
    //   291: aload 21
    //   293: invokevirtual 599	java/net/HttpURLConnection:getResponseCode	()I
    //   296: istore 30
    //   298: aload 21
    //   300: invokevirtual 603	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   303: astore 31
    //   305: aload 29
    //   307: aload 21
    //   309: iload 30
    //   311: invokevirtual 606	com/google/android/gms/internal/ads/md:a	(Ljava/net/HttpURLConnection;I)V
    //   314: iload 30
    //   316: sipush 200
    //   319: if_icmplt +247 -> 566
    //   322: iload 30
    //   324: sipush 300
    //   327: if_icmpge +239 -> 566
    //   330: aload 20
    //   332: invokevirtual 607	java/net/URL:toString	()Ljava/lang/String;
    //   335: astore 39
    //   337: new 609	java/io/InputStreamReader
    //   340: dup
    //   341: aload 21
    //   343: invokevirtual 613	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   346: invokespecial 616	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   349: astore 40
    //   351: invokestatic 63	com/google/android/gms/ads/internal/zzbv:zzek	()Lcom/google/android/gms/internal/ads/jn;
    //   354: pop
    //   355: aload 40
    //   357: invokestatic 619	com/google/android/gms/internal/ads/jn:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   360: astore 44
    //   362: aload 40
    //   364: invokestatic 590	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   367: aload 29
    //   369: aload 44
    //   371: invokevirtual 621	com/google/android/gms/internal/ads/md:a	(Ljava/lang/String;)V
    //   374: aload 39
    //   376: aload 31
    //   378: aload 44
    //   380: iload 30
    //   382: invokestatic 624	com/google/android/gms/internal/ads/eo:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   385: aload 10
    //   387: aload 39
    //   389: aload 31
    //   391: aload 44
    //   393: invokevirtual 627	com/google/android/gms/internal/ads/ey:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    //   396: aload 7
    //   398: ifnull +21 -> 419
    //   401: aload 7
    //   403: aload 9
    //   405: iconst_1
    //   406: anewarray 144	java/lang/String
    //   409: dup
    //   410: iconst_0
    //   411: ldc_w 629
    //   414: aastore
    //   415: invokevirtual 149	com/google/android/gms/internal/ads/asn:a	(Lcom/google/android/gms/internal/ads/asl;[Ljava/lang/String;)Z
    //   418: pop
    //   419: aload 10
    //   421: lload 17
    //   423: aload 6
    //   425: invokevirtual 631	com/google/android/gms/internal/ads/fa:j	()Z
    //   428: invokevirtual 634	com/google/android/gms/internal/ads/ey:a	(JZ)Lcom/google/android/gms/internal/ads/zzaej;
    //   431: astore 46
    //   433: aload 21
    //   435: invokevirtual 637	java/net/HttpURLConnection:disconnect	()V
    //   438: aload 8
    //   440: ifnull +433 -> 873
    //   443: aload 8
    //   445: getfield 529	com/google/android/gms/internal/ads/en:g	Lcom/google/android/gms/internal/ads/fk;
    //   448: invokeinterface 639 1 0
    //   453: goto +420 -> 873
    //   456: new 144	java/lang/String
    //   459: dup
    //   460: ldc_w 511
    //   463: invokespecial 640	java/lang/String:<init>	(Ljava/lang/String;)V
    //   466: astore 15
    //   468: goto -417 -> 51
    //   471: astore 11
    //   473: aload 11
    //   475: invokevirtual 643	java/io/IOException:getMessage	()Ljava/lang/String;
    //   478: invokestatic 506	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   481: astore 12
    //   483: aload 12
    //   485: invokevirtual 509	java/lang/String:length	()I
    //   488: ifeq +352 -> 840
    //   491: ldc_w 645
    //   494: aload 12
    //   496: invokevirtual 514	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   499: astore 13
    //   501: aload 13
    //   503: invokestatic 352	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   506: new 354	com/google/android/gms/internal/ads/zzaej
    //   509: dup
    //   510: iconst_2
    //   511: invokespecial 357	com/google/android/gms/internal/ads/zzaej:<init>	(I)V
    //   514: areturn
    //   515: astore 27
    //   517: aconst_null
    //   518: astore 28
    //   520: aload 28
    //   522: invokestatic 590	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   525: aload 27
    //   527: athrow
    //   528: astore 22
    //   530: aload 21
    //   532: invokevirtual 637	java/net/HttpURLConnection:disconnect	()V
    //   535: aload 8
    //   537: ifnull +13 -> 550
    //   540: aload 8
    //   542: getfield 529	com/google/android/gms/internal/ads/en:g	Lcom/google/android/gms/internal/ads/fk;
    //   545: invokeinterface 639 1 0
    //   550: aload 22
    //   552: athrow
    //   553: astore 41
    //   555: aconst_null
    //   556: astore 42
    //   558: aload 42
    //   560: invokestatic 590	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   563: aload 41
    //   565: athrow
    //   566: aload 20
    //   568: invokevirtual 607	java/net/URL:toString	()Ljava/lang/String;
    //   571: aload 31
    //   573: aconst_null
    //   574: iload 30
    //   576: invokestatic 624	com/google/android/gms/internal/ads/eo:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   579: iload 30
    //   581: sipush 300
    //   584: if_icmplt +148 -> 732
    //   587: iload 30
    //   589: sipush 400
    //   592: if_icmpge +140 -> 732
    //   595: aload 21
    //   597: ldc_w 647
    //   600: invokevirtual 650	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   603: astore 33
    //   605: aload 33
    //   607: invokestatic 476	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   610: ifeq +42 -> 652
    //   613: ldc_w 652
    //   616: invokestatic 352	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   619: new 354	com/google/android/gms/internal/ads/zzaej
    //   622: dup
    //   623: iconst_0
    //   624: invokespecial 357	com/google/android/gms/internal/ads/zzaej:<init>	(I)V
    //   627: astore 38
    //   629: aload 21
    //   631: invokevirtual 637	java/net/HttpURLConnection:disconnect	()V
    //   634: aload 8
    //   636: ifnull +13 -> 649
    //   639: aload 8
    //   641: getfield 529	com/google/android/gms/internal/ads/en:g	Lcom/google/android/gms/internal/ads/fk;
    //   644: invokeinterface 639 1 0
    //   649: aload 38
    //   651: areturn
    //   652: new 516	java/net/URL
    //   655: dup
    //   656: aload 33
    //   658: invokespecial 518	java/net/URL:<init>	(Ljava/lang/String;)V
    //   661: astore 34
    //   663: iload 19
    //   665: iconst_1
    //   666: iadd
    //   667: istore 35
    //   669: getstatic 655	com/google/android/gms/internal/ads/asa:df	Lcom/google/android/gms/internal/ads/arq;
    //   672: astore 36
    //   674: iload 35
    //   676: invokestatic 104	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   679: aload 36
    //   681: invokevirtual 109	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   684: checkcast 657	java/lang/Integer
    //   687: invokevirtual 660	java/lang/Integer:intValue	()I
    //   690: if_icmple +101 -> 791
    //   693: ldc_w 662
    //   696: invokestatic 352	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   699: new 354	com/google/android/gms/internal/ads/zzaej
    //   702: dup
    //   703: iconst_0
    //   704: invokespecial 357	com/google/android/gms/internal/ads/zzaej:<init>	(I)V
    //   707: astore 37
    //   709: aload 21
    //   711: invokevirtual 637	java/net/HttpURLConnection:disconnect	()V
    //   714: aload 8
    //   716: ifnull +13 -> 729
    //   719: aload 8
    //   721: getfield 529	com/google/android/gms/internal/ads/en:g	Lcom/google/android/gms/internal/ads/fk;
    //   724: invokeinterface 639 1 0
    //   729: aload 37
    //   731: areturn
    //   732: new 664	java/lang/StringBuilder
    //   735: dup
    //   736: bipush 46
    //   738: invokespecial 665	java/lang/StringBuilder:<init>	(I)V
    //   741: ldc_w 667
    //   744: invokevirtual 671	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: iload 30
    //   749: invokevirtual 674	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   752: invokevirtual 675	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   755: invokestatic 352	com/google/android/gms/internal/ads/je:e	(Ljava/lang/String;)V
    //   758: new 354	com/google/android/gms/internal/ads/zzaej
    //   761: dup
    //   762: iconst_0
    //   763: invokespecial 357	com/google/android/gms/internal/ads/zzaej:<init>	(I)V
    //   766: astore 32
    //   768: aload 21
    //   770: invokevirtual 637	java/net/HttpURLConnection:disconnect	()V
    //   773: aload 8
    //   775: ifnull +13 -> 788
    //   778: aload 8
    //   780: getfield 529	com/google/android/gms/internal/ads/en:g	Lcom/google/android/gms/internal/ads/fk;
    //   783: invokeinterface 639 1 0
    //   788: aload 32
    //   790: areturn
    //   791: aload 10
    //   793: aload 31
    //   795: invokevirtual 678	com/google/android/gms/internal/ads/ey:a	(Ljava/util/Map;)V
    //   798: aload 21
    //   800: invokevirtual 637	java/net/HttpURLConnection:disconnect	()V
    //   803: aload 8
    //   805: ifnull +24 -> 829
    //   808: aload 8
    //   810: getfield 529	com/google/android/gms/internal/ads/en:g	Lcom/google/android/gms/internal/ads/fk;
    //   813: invokeinterface 639 1 0
    //   818: iload 35
    //   820: istore 19
    //   822: aload 34
    //   824: astore 20
    //   826: goto -743 -> 83
    //   829: iload 35
    //   831: istore 19
    //   833: aload 34
    //   835: astore 20
    //   837: goto -754 -> 83
    //   840: new 144	java/lang/String
    //   843: dup
    //   844: ldc_w 645
    //   847: invokespecial 640	java/lang/String:<init>	(Ljava/lang/String;)V
    //   850: astore 13
    //   852: goto -351 -> 501
    //   855: astore 41
    //   857: aload 40
    //   859: astore 42
    //   861: goto -303 -> 558
    //   864: astore 27
    //   866: aload 26
    //   868: astore 28
    //   870: goto -350 -> 520
    //   873: aload 46
    //   875: areturn
    //   876: aconst_null
    //   877: astore 9
    //   879: goto -867 -> 12
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	882	0	paramzzaef	zzaef
    //   0	882	1	paramContext	Context
    //   0	882	2	paramString1	String
    //   0	882	3	paramString2	String
    //   0	882	4	paramString3	String
    //   0	882	5	paramString4	String
    //   0	882	6	paramfa	fa
    //   0	882	7	paramasn	asn
    //   0	882	8	paramen	en
    //   10	868	9	localasl	asl
    //   25	767	10	localey	ey
    //   471	3	11	localIOException	java.io.IOException
    //   481	14	12	str1	String
    //   499	352	13	str2	String
    //   31	14	14	str3	String
    //   49	418	15	str4	String
    //   64	16	16	localURL1	java.net.URL
    //   74	348	17	l	long
    //   77	755	19	i	int
    //   81	755	20	localObject1	Object
    //   106	693	21	localHttpURLConnection	java.net.HttpURLConnection
    //   528	23	22	localObject2	Object
    //   167	22	23	str5	String
    //   194	93	24	arrayOfByte	byte[]
    //   209	6	25	bool	boolean
    //   255	612	26	localBufferedOutputStream	java.io.BufferedOutputStream
    //   515	11	27	localObject3	Object
    //   864	1	27	localObject4	Object
    //   518	351	28	localObject5	Object
    //   280	88	29	localmd	md
    //   296	452	30	j	int
    //   303	491	31	localMap	Map
    //   766	23	32	localzzaej1	zzaej
    //   603	54	33	str6	String
    //   661	173	34	localURL2	java.net.URL
    //   667	163	35	k	int
    //   672	8	36	localarq	arq
    //   707	23	37	localzzaej2	zzaej
    //   627	23	38	localzzaej3	zzaej
    //   335	53	39	str7	String
    //   349	509	40	localInputStreamReader	java.io.InputStreamReader
    //   553	11	41	localObject6	Object
    //   855	1	41	localObject7	Object
    //   556	304	42	localObject8	Object
    //   360	32	44	str8	String
    //   431	443	46	localzzaej4	zzaej
    // Exception table:
    //   from	to	target	type
    //   12	51	471	java/io/IOException
    //   51	76	471	java/io/IOException
    //   88	98	471	java/io/IOException
    //   98	108	471	java/io/IOException
    //   433	438	471	java/io/IOException
    //   443	453	471	java/io/IOException
    //   456	468	471	java/io/IOException
    //   530	535	471	java/io/IOException
    //   540	550	471	java/io/IOException
    //   550	553	471	java/io/IOException
    //   629	634	471	java/io/IOException
    //   639	649	471	java/io/IOException
    //   709	714	471	java/io/IOException
    //   719	729	471	java/io/IOException
    //   768	773	471	java/io/IOException
    //   778	788	471	java/io/IOException
    //   798	803	471	java/io/IOException
    //   808	818	471	java/io/IOException
    //   243	257	515	finally
    //   108	145	528	finally
    //   145	163	528	finally
    //   163	193	528	finally
    //   201	211	528	finally
    //   219	243	528	finally
    //   264	269	528	finally
    //   269	314	528	finally
    //   330	337	528	finally
    //   362	396	528	finally
    //   401	419	528	finally
    //   419	433	528	finally
    //   520	528	528	finally
    //   558	566	528	finally
    //   566	579	528	finally
    //   595	629	528	finally
    //   652	663	528	finally
    //   669	709	528	finally
    //   732	768	528	finally
    //   791	798	528	finally
    //   337	351	553	finally
    //   351	362	855	finally
    //   257	264	864	finally
  }
  
  private static void a(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (je.a(2))
    {
      je.a(39 + String.valueOf(paramString1).length() + "Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        if (localIterator1.hasNext())
        {
          String str1 = (String)localIterator1.next();
          je.a(5 + String.valueOf(str1).length() + "    " + str1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(str1)).iterator();
          label143:
          String str2;
          if (localIterator2.hasNext())
          {
            str2 = String.valueOf((String)localIterator2.next());
            if (str2.length() == 0) {
              break label194;
            }
          }
          label194:
          for (String str3 = "      ".concat(str2);; str3 = new String("      "))
          {
            je.a(str3);
            break label143;
            break;
          }
        }
      }
      je.a("  Body:");
      if (paramString2 != null) {
        for (int i = 0; i < Math.min(paramString2.length(), 100000); i += 1000) {
          je.a(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
        }
      }
      je.a("    null");
      je.a(34 + "  Response Code:\n    " + paramInt + "\n}");
    }
  }
  
  public final zzaej a(zzaef paramzzaef)
  {
    return a(this.c, this.d, paramzzaef, this.e);
  }
  
  public final void a(zzaef paramzzaef, dt paramdt)
  {
    zzbv.zzeo().a(this.c, paramzzaef.k);
    ne localne = jl.a(new eq(this, paramzzaef, paramdt));
    zzbv.zzez().a();
    zzbv.zzez().b().postDelayed(new er(this, localne), 60000L);
  }
  
  public final void a(zzaey paramzzaey, dw paramdw)
  {
    je.a("Nonagon code path entered in octagon");
    throw new IllegalArgumentException();
  }
  
  public final void b(zzaey paramzzaey, dw paramdw)
  {
    je.a("Nonagon code path entered in octagon");
    throw new IllegalArgumentException();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.eo
 * JD-Core Version:    0.7.0.1
 */