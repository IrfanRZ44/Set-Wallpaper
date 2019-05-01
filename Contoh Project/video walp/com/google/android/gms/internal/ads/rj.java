package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;

public final class rj
  extends hc
{
  private final sk a = null;
  private final SSLSocketFactory b = null;
  
  public rj()
  {
    this(null);
  }
  
  private rj(sk paramsk)
  {
    this(null, null);
  }
  
  private rj(sk paramsk, SSLSocketFactory paramSSLSocketFactory) {}
  
  private static InputStream a(HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      InputStream localInputStream = paramHttpURLConnection.getInputStream();
      return localInputStream;
    }
    catch (IOException localIOException) {}
    return paramHttpURLConnection.getErrorStream();
  }
  
  private static List<apr> a(Map<String, List<String>> paramMap)
  {
    ArrayList localArrayList = new ArrayList(paramMap.size());
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      if (localEntry.getKey() != null)
      {
        Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
        while (localIterator2.hasNext())
        {
          String str = (String)localIterator2.next();
          localArrayList.add(new apr((String)localEntry.getKey(), str));
        }
      }
    }
    return localArrayList;
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, avs<?> paramavs)
  {
    byte[] arrayOfByte = paramavs.a();
    String str1;
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      str1 = String.valueOf("UTF-8");
      if (str1.length() == 0) {
        break label68;
      }
    }
    label68:
    for (String str2 = "application/x-www-form-urlencoded; charset=".concat(str1);; str2 = new String("application/x-www-form-urlencoded; charset="))
    {
      paramHttpURLConnection.addRequestProperty("Content-Type", str2);
      DataOutputStream localDataOutputStream = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
      return;
    }
  }
  
  public final ph a(avs<?> paramavs, Map<String, String> paramMap)
  {
    String str1 = paramavs.e();
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramavs.b());
    localHashMap.putAll(paramMap);
    String str2;
    if (this.a != null)
    {
      str2 = this.a.a(str1);
      if (str2 == null)
      {
        String str4 = String.valueOf(str1);
        if (str4.length() != 0) {}
        for (String str5 = "URL blocked by rewriter: ".concat(str4);; str5 = new String("URL blocked by rewriter: ")) {
          throw new IOException(str5);
        }
      }
    }
    else
    {
      str2 = str1;
    }
    URL localURL = new URL(str2);
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
    localHttpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
    int i = paramavs.i();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    "https".equals(localURL.getProtocol());
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      localHttpURLConnection.addRequestProperty(str3, (String)localHashMap.get(str3));
    }
    switch (paramavs.c())
    {
    default: 
      throw new IllegalStateException("Unknown method type.");
    case 0: 
      localHttpURLConnection.setRequestMethod("GET");
    }
    int j;
    for (;;)
    {
      j = localHttpURLConnection.getResponseCode();
      if (j != -1) {
        break;
      }
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
      localHttpURLConnection.setRequestMethod("DELETE");
      continue;
      localHttpURLConnection.setRequestMethod("POST");
      a(localHttpURLConnection, paramavs);
      continue;
      localHttpURLConnection.setRequestMethod("PUT");
      a(localHttpURLConnection, paramavs);
      continue;
      localHttpURLConnection.setRequestMethod("HEAD");
      continue;
      localHttpURLConnection.setRequestMethod("OPTIONS");
      continue;
      localHttpURLConnection.setRequestMethod("TRACE");
      continue;
      localHttpURLConnection.setRequestMethod("PATCH");
      a(localHttpURLConnection, paramavs);
    }
    if ((paramavs.c() != 4) && ((100 > j) || (j >= 200)) && (j != 204) && (j != 304)) {}
    for (int k = 1; k == 0; k = 0) {
      return new ph(j, a(localHttpURLConnection.getHeaderFields()));
    }
    return new ph(j, a(localHttpURLConnection.getHeaderFields()), localHttpURLConnection.getContentLength(), a(localHttpURLConnection));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.rj
 * JD-Core Version:    0.7.0.1
 */