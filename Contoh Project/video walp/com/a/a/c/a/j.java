package com.a.a.c.a;

import android.text.TextUtils;
import android.util.Log;
import com.a.a.c.a;
import com.a.a.c.e;
import com.a.a.i.b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class j
  implements d<InputStream>
{
  static final b a = new a();
  private final com.a.a.c.c.g b;
  private final int c;
  private final b d;
  private HttpURLConnection e;
  private InputStream f;
  private volatile boolean g;
  
  public j(com.a.a.c.c.g paramg, int paramInt)
  {
    this(paramg, paramInt, a);
  }
  
  j(com.a.a.c.c.g paramg, int paramInt, b paramb)
  {
    this.b = paramg;
    this.c = paramInt;
    this.d = paramb;
  }
  
  private InputStream a(HttpURLConnection paramHttpURLConnection)
  {
    int i;
    if (TextUtils.isEmpty(paramHttpURLConnection.getContentEncoding())) {
      i = paramHttpURLConnection.getContentLength();
    }
    for (this.f = b.a(paramHttpURLConnection.getInputStream(), i);; this.f = paramHttpURLConnection.getInputStream())
    {
      return this.f;
      if (Log.isLoggable("HttpUrlFetcher", 3)) {
        Log.d("HttpUrlFetcher", "Got non empty content encoding: " + paramHttpURLConnection.getContentEncoding());
      }
    }
  }
  
  private InputStream a(URL paramURL1, int paramInt, URL paramURL2, Map<String, String> paramMap)
  {
    if (paramInt >= 5) {
      throw new e("Too many (> 5) redirects!");
    }
    if (paramURL2 != null) {
      try
      {
        if (paramURL1.toURI().equals(paramURL2.toURI())) {
          throw new e("In re-direct loop");
        }
      }
      catch (URISyntaxException localURISyntaxException) {}
    }
    this.e = this.d.a(paramURL1);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.e.addRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    this.e.setConnectTimeout(this.c);
    this.e.setReadTimeout(this.c);
    this.e.setUseCaches(false);
    this.e.setDoInput(true);
    this.e.setInstanceFollowRedirects(false);
    this.e.connect();
    this.f = this.e.getInputStream();
    if (this.g) {
      return null;
    }
    int i = this.e.getResponseCode();
    if (a(i)) {
      return a(this.e);
    }
    if (b(i))
    {
      String str = this.e.getHeaderField("Location");
      if (TextUtils.isEmpty(str)) {
        throw new e("Received empty or null redirect url");
      }
      URL localURL = new URL(paramURL1, str);
      b();
      return a(localURL, paramInt + 1, paramURL1, paramMap);
    }
    if (i == -1) {
      throw new e(i);
    }
    throw new e(this.e.getResponseMessage(), i);
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt / 100 == 2;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt / 100 == 3;
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  public void a(com.a.a.g paramg, d.a<? super InputStream> parama)
  {
    long l = com.a.a.i.d.a();
    try
    {
      parama.a(a(this.b.a(), 0, null, this.b.b()));
      return;
    }
    catch (IOException localIOException)
    {
      if (Log.isLoggable("HttpUrlFetcher", 3)) {
        Log.d("HttpUrlFetcher", "Failed to load data for url", localIOException);
      }
      parama.a(localIOException);
      return;
    }
    finally
    {
      if (Log.isLoggable("HttpUrlFetcher", 2)) {
        Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + com.a.a.i.d.a(l));
      }
    }
  }
  
  public void b()
  {
    if (this.f != null) {}
    try
    {
      this.f.close();
      label14:
      if (this.e != null) {
        this.e.disconnect();
      }
      this.e = null;
      return;
    }
    catch (IOException localIOException)
    {
      break label14;
    }
  }
  
  public void c()
  {
    this.g = true;
  }
  
  public a d()
  {
    return a.b;
  }
  
  private static class a
    implements j.b
  {
    public HttpURLConnection a(URL paramURL)
    {
      return (HttpURLConnection)paramURL.openConnection();
    }
  }
  
  static abstract interface b
  {
    public abstract HttpURLConnection a(URL paramURL);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.j
 * JD-Core Version:    0.7.0.1
 */