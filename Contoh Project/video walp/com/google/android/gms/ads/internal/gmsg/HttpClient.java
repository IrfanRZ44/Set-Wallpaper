package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.ayy;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.zzang;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@Keep
@KeepName
public class HttpClient
  implements zzv<ayy>
{
  private final Context mContext;
  private final zzang zzyf;
  
  public HttpClient(Context paramContext, zzang paramzzang)
  {
    this.mContext = paramContext;
    this.zzyf = paramzzang;
  }
  
  /* Error */
  private final c zza(b paramb)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 33	com/google/android/gms/ads/internal/gmsg/HttpClient$b:b	()Ljava/net/URL;
    //   4: invokevirtual 39	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   7: checkcast 41	java/net/HttpURLConnection
    //   10: astore 8
    //   12: invokestatic 47	com/google/android/gms/ads/internal/zzbv:zzek	()Lcom/google/android/gms/internal/ads/jn;
    //   15: aload_0
    //   16: getfield 21	com/google/android/gms/ads/internal/gmsg/HttpClient:mContext	Landroid/content/Context;
    //   19: aload_0
    //   20: getfield 23	com/google/android/gms/ads/internal/gmsg/HttpClient:zzyf	Lcom/google/android/gms/internal/ads/zzang;
    //   23: getfield 53	com/google/android/gms/internal/ads/zzang:a	Ljava/lang/String;
    //   26: iconst_0
    //   27: aload 8
    //   29: invokevirtual 58	com/google/android/gms/internal/ads/jn:a	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //   32: aload_1
    //   33: invokevirtual 62	com/google/android/gms/ads/internal/gmsg/HttpClient$b:c	()Ljava/util/ArrayList;
    //   36: checkcast 64	java/util/ArrayList
    //   39: astore 10
    //   41: aload 10
    //   43: invokevirtual 68	java/util/ArrayList:size	()I
    //   46: istore 11
    //   48: iconst_0
    //   49: istore 12
    //   51: iload 12
    //   53: iload 11
    //   55: if_icmpge +74 -> 129
    //   58: aload 10
    //   60: iload 12
    //   62: invokevirtual 72	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   65: astore 13
    //   67: iinc 12 1
    //   70: aload 13
    //   72: checkcast 74	com/google/android/gms/ads/internal/gmsg/HttpClient$a
    //   75: astore 14
    //   77: aload 8
    //   79: aload 14
    //   81: invokevirtual 77	com/google/android/gms/ads/internal/gmsg/HttpClient$a:a	()Ljava/lang/String;
    //   84: aload 14
    //   86: invokevirtual 79	com/google/android/gms/ads/internal/gmsg/HttpClient$a:b	()Ljava/lang/String;
    //   89: invokevirtual 83	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   92: goto -41 -> 51
    //   95: astore_3
    //   96: aload 8
    //   98: astore 4
    //   100: new 85	com/google/android/gms/ads/internal/gmsg/HttpClient$c
    //   103: dup
    //   104: aload_0
    //   105: iconst_0
    //   106: aconst_null
    //   107: aload_3
    //   108: invokevirtual 88	java/lang/Exception:toString	()Ljava/lang/String;
    //   111: invokespecial 91	com/google/android/gms/ads/internal/gmsg/HttpClient$c:<init>	(Lcom/google/android/gms/ads/internal/gmsg/HttpClient;ZLcom/google/android/gms/ads/internal/gmsg/HttpClient$d;Ljava/lang/String;)V
    //   114: astore 5
    //   116: aload 4
    //   118: ifnull +8 -> 126
    //   121: aload 4
    //   123: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   126: aload 5
    //   128: areturn
    //   129: aload_1
    //   130: invokevirtual 97	com/google/android/gms/ads/internal/gmsg/HttpClient$b:d	()Ljava/lang/String;
    //   133: invokestatic 103	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   136: istore 15
    //   138: aconst_null
    //   139: astore 16
    //   141: iload 15
    //   143: ifne +52 -> 195
    //   146: aload 8
    //   148: iconst_1
    //   149: invokevirtual 107	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   152: aload_1
    //   153: invokevirtual 97	com/google/android/gms/ads/internal/gmsg/HttpClient$b:d	()Ljava/lang/String;
    //   156: invokevirtual 113	java/lang/String:getBytes	()[B
    //   159: astore 16
    //   161: aload 8
    //   163: aload 16
    //   165: arraylength
    //   166: invokevirtual 117	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   169: new 119	java/io/BufferedOutputStream
    //   172: dup
    //   173: aload 8
    //   175: invokevirtual 123	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   178: invokespecial 126	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   181: astore 17
    //   183: aload 17
    //   185: aload 16
    //   187: invokevirtual 130	java/io/BufferedOutputStream:write	([B)V
    //   190: aload 17
    //   192: invokevirtual 133	java/io/BufferedOutputStream:close	()V
    //   195: new 135	com/google/android/gms/internal/ads/md
    //   198: dup
    //   199: invokespecial 136	com/google/android/gms/internal/ads/md:<init>	()V
    //   202: astore 18
    //   204: aload 18
    //   206: aload 8
    //   208: aload 16
    //   210: invokevirtual 139	com/google/android/gms/internal/ads/md:a	(Ljava/net/HttpURLConnection;[B)V
    //   213: new 64	java/util/ArrayList
    //   216: dup
    //   217: invokespecial 140	java/util/ArrayList:<init>	()V
    //   220: astore 19
    //   222: aload 8
    //   224: invokevirtual 144	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   227: ifnull +132 -> 359
    //   230: aload 8
    //   232: invokevirtual 144	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   235: invokeinterface 150 1 0
    //   240: invokeinterface 156 1 0
    //   245: astore 25
    //   247: aload 25
    //   249: invokeinterface 162 1 0
    //   254: ifeq +105 -> 359
    //   257: aload 25
    //   259: invokeinterface 166 1 0
    //   264: checkcast 168	java/util/Map$Entry
    //   267: astore 26
    //   269: aload 26
    //   271: invokeinterface 171 1 0
    //   276: checkcast 173	java/util/List
    //   279: invokeinterface 174 1 0
    //   284: astore 27
    //   286: aload 27
    //   288: invokeinterface 162 1 0
    //   293: ifeq -46 -> 247
    //   296: aload 27
    //   298: invokeinterface 166 1 0
    //   303: checkcast 109	java/lang/String
    //   306: astore 28
    //   308: aload 19
    //   310: new 74	com/google/android/gms/ads/internal/gmsg/HttpClient$a
    //   313: dup
    //   314: aload 26
    //   316: invokeinterface 177 1 0
    //   321: checkcast 109	java/lang/String
    //   324: aload 28
    //   326: invokespecial 179	com/google/android/gms/ads/internal/gmsg/HttpClient$a:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   329: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   332: pop
    //   333: goto -47 -> 286
    //   336: astore 9
    //   338: aload 8
    //   340: astore 7
    //   342: aload 9
    //   344: astore 6
    //   346: aload 7
    //   348: ifnull +8 -> 356
    //   351: aload 7
    //   353: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   356: aload 6
    //   358: athrow
    //   359: aload_1
    //   360: invokevirtual 184	com/google/android/gms/ads/internal/gmsg/HttpClient$b:a	()Ljava/lang/String;
    //   363: astore 20
    //   365: aload 8
    //   367: invokevirtual 187	java/net/HttpURLConnection:getResponseCode	()I
    //   370: istore 21
    //   372: invokestatic 47	com/google/android/gms/ads/internal/zzbv:zzek	()Lcom/google/android/gms/internal/ads/jn;
    //   375: pop
    //   376: new 189	com/google/android/gms/ads/internal/gmsg/HttpClient$d
    //   379: dup
    //   380: aload 20
    //   382: iload 21
    //   384: aload 19
    //   386: new 191	java/io/InputStreamReader
    //   389: dup
    //   390: aload 8
    //   392: invokevirtual 195	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   395: invokespecial 198	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   398: invokestatic 201	com/google/android/gms/internal/ads/jn:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   401: invokespecial 204	com/google/android/gms/ads/internal/gmsg/HttpClient$d:<init>	(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V
    //   404: astore 23
    //   406: aload 18
    //   408: aload 8
    //   410: aload 23
    //   412: invokevirtual 206	com/google/android/gms/ads/internal/gmsg/HttpClient$d:b	()I
    //   415: invokevirtual 209	com/google/android/gms/internal/ads/md:a	(Ljava/net/HttpURLConnection;I)V
    //   418: aload 18
    //   420: aload 23
    //   422: invokevirtual 210	com/google/android/gms/ads/internal/gmsg/HttpClient$d:d	()Ljava/lang/String;
    //   425: invokevirtual 213	com/google/android/gms/internal/ads/md:a	(Ljava/lang/String;)V
    //   428: new 85	com/google/android/gms/ads/internal/gmsg/HttpClient$c
    //   431: dup
    //   432: aload_0
    //   433: iconst_1
    //   434: aload 23
    //   436: aconst_null
    //   437: invokespecial 91	com/google/android/gms/ads/internal/gmsg/HttpClient$c:<init>	(Lcom/google/android/gms/ads/internal/gmsg/HttpClient;ZLcom/google/android/gms/ads/internal/gmsg/HttpClient$d;Ljava/lang/String;)V
    //   440: astore 24
    //   442: aload 8
    //   444: ifnull +8 -> 452
    //   447: aload 8
    //   449: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   452: aload 24
    //   454: areturn
    //   455: astore 6
    //   457: aconst_null
    //   458: astore 7
    //   460: goto -114 -> 346
    //   463: astore 6
    //   465: aload 4
    //   467: astore 7
    //   469: goto -123 -> 346
    //   472: astore_2
    //   473: aload_2
    //   474: astore_3
    //   475: aconst_null
    //   476: astore 4
    //   478: goto -378 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	481	0	this	HttpClient
    //   0	481	1	paramb	b
    //   472	2	2	localException1	Exception
    //   95	13	3	localException2	Exception
    //   474	1	3	localObject1	Object
    //   98	379	4	localHttpURLConnection1	java.net.HttpURLConnection
    //   114	13	5	localc1	c
    //   344	13	6	localObject2	Object
    //   455	1	6	localObject3	Object
    //   463	1	6	localObject4	Object
    //   340	128	7	localHttpURLConnection2	java.net.HttpURLConnection
    //   10	438	8	localHttpURLConnection3	java.net.HttpURLConnection
    //   336	7	9	localObject5	Object
    //   39	20	10	localArrayList1	ArrayList
    //   46	10	11	i	int
    //   49	19	12	j	int
    //   65	6	13	localObject6	Object
    //   75	10	14	locala	a
    //   136	6	15	bool	boolean
    //   139	70	16	arrayOfByte	byte[]
    //   181	10	17	localBufferedOutputStream	java.io.BufferedOutputStream
    //   202	217	18	localmd	com.google.android.gms.internal.ads.md
    //   220	165	19	localArrayList2	ArrayList
    //   363	18	20	str1	String
    //   370	13	21	k	int
    //   404	31	23	locald	d
    //   440	13	24	localc2	c
    //   245	13	25	localIterator1	Iterator
    //   267	48	26	localEntry	java.util.Map.Entry
    //   284	13	27	localIterator2	Iterator
    //   306	19	28	str2	String
    // Exception table:
    //   from	to	target	type
    //   12	48	95	java/lang/Exception
    //   58	67	95	java/lang/Exception
    //   70	92	95	java/lang/Exception
    //   129	138	95	java/lang/Exception
    //   146	195	95	java/lang/Exception
    //   195	247	95	java/lang/Exception
    //   247	286	95	java/lang/Exception
    //   286	333	95	java/lang/Exception
    //   359	442	95	java/lang/Exception
    //   12	48	336	finally
    //   58	67	336	finally
    //   70	92	336	finally
    //   129	138	336	finally
    //   146	195	336	finally
    //   195	247	336	finally
    //   247	286	336	finally
    //   286	333	336	finally
    //   359	442	336	finally
    //   0	12	455	finally
    //   100	116	463	finally
    //   0	12	472	java/lang/Exception
  }
  
  private static JSONObject zza(d paramd)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("http_request_id", paramd.a());
      if (paramd.d() != null) {
        localJSONObject.put("body", paramd.d());
      }
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = paramd.c().iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        localJSONArray.put(new JSONObject().put("key", locala.a()).put("value", locala.b()));
      }
      localJSONObject.put("headers", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      je.b("Error constructing JSON for http response.", localJSONException);
      return localJSONObject;
    }
    localJSONObject.put("response_code", paramd.b());
    return localJSONObject;
  }
  
  private static b zzc(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("http_request_id");
    String str2 = paramJSONObject.optString("url");
    String str3 = paramJSONObject.optString("post_body", null);
    URL localURL;
    ArrayList localArrayList;
    try
    {
      localURL = new URL(str2);
      localArrayList = new ArrayList();
      JSONArray localJSONArray = paramJSONObject.optJSONArray("headers");
      if (localJSONArray == null) {
        localJSONArray = new JSONArray();
      }
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        JSONObject localJSONObject = localJSONArray.optJSONObject(i);
        if (localJSONObject != null) {
          localArrayList.add(new a(localJSONObject.optString("key"), localJSONObject.optString("value")));
        }
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      for (;;)
      {
        je.b("Error constructing http request.", localMalformedURLException);
        localURL = null;
      }
    }
    return new b(str1, localURL, localArrayList, str3);
  }
  
  @Keep
  @KeepName
  public JSONObject send(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    String str = "";
    try
    {
      str = paramJSONObject.optString("http_request_id");
      c localc = zza(zzc(paramJSONObject));
      if (localc.c())
      {
        localJSONObject.put("response", zza(localc.b()));
        localJSONObject.put("success", true);
        return localJSONObject;
      }
      localJSONObject.put("response", new JSONObject().put("http_request_id", str));
      localJSONObject.put("success", false);
      localJSONObject.put("reason", localc.a());
      return localJSONObject;
    }
    catch (Exception localException)
    {
      je.b("Error executing http request.", localException);
      try
      {
        localJSONObject.put("response", new JSONObject().put("http_request_id", str));
        localJSONObject.put("success", false);
        localJSONObject.put("reason", localException.toString());
        return localJSONObject;
      }
      catch (JSONException localJSONException)
      {
        je.b("Error executing http request.", localJSONException);
      }
    }
    return localJSONObject;
  }
  
  @cm
  static final class a
  {
    private final String a;
    private final String b;
    
    public a(String paramString1, String paramString2)
    {
      this.a = paramString1;
      this.b = paramString2;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final String b()
    {
      return this.b;
    }
  }
  
  @cm
  static final class b
  {
    private final String a;
    private final URL b;
    private final ArrayList<HttpClient.a> c;
    private final String d;
    
    b(String paramString1, URL paramURL, ArrayList<HttpClient.a> paramArrayList, String paramString2)
    {
      this.a = paramString1;
      this.b = paramURL;
      this.c = paramArrayList;
      this.d = paramString2;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final URL b()
    {
      return this.b;
    }
    
    public final ArrayList<HttpClient.a> c()
    {
      return this.c;
    }
    
    public final String d()
    {
      return this.d;
    }
  }
  
  @cm
  final class c
  {
    private final HttpClient.d a;
    private final boolean b;
    private final String c;
    
    public c(boolean paramBoolean, HttpClient.d paramd, String paramString)
    {
      this.b = paramBoolean;
      this.a = paramd;
      this.c = paramString;
    }
    
    public final String a()
    {
      return this.c;
    }
    
    public final HttpClient.d b()
    {
      return this.a;
    }
    
    public final boolean c()
    {
      return this.b;
    }
  }
  
  @cm
  static final class d
  {
    private final String a;
    private final int b;
    private final List<HttpClient.a> c;
    private final String d;
    
    d(String paramString1, int paramInt, List<HttpClient.a> paramList, String paramString2)
    {
      this.a = paramString1;
      this.b = paramInt;
      this.c = paramList;
      this.d = paramString2;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final int b()
    {
      return this.b;
    }
    
    public final Iterable<HttpClient.a> c()
    {
      return this.c;
    }
    
    public final String d()
    {
      return this.d;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.HttpClient
 * JD-Core Version:    0.7.0.1
 */