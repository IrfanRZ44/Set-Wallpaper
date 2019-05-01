package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class hc
  implements qi
{
  public abstract ph a(avs<?> paramavs, Map<String, String> paramMap);
  
  @Deprecated
  public final HttpResponse b(avs<?> paramavs, Map<String, String> paramMap)
  {
    ph localph = a(paramavs, paramMap);
    BasicHttpResponse localBasicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), localph.a(), ""));
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localph.b().iterator();
    while (localIterator.hasNext())
    {
      apr localapr = (apr)localIterator.next();
      localArrayList.add(new BasicHeader(localapr.a(), localapr.b()));
    }
    localBasicHttpResponse.setHeaders((Header[])localArrayList.toArray(new Header[localArrayList.size()]));
    InputStream localInputStream = localph.d();
    if (localInputStream != null)
    {
      BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
      localBasicHttpEntity.setContent(localInputStream);
      localBasicHttpEntity.setContentLength(localph.c());
      localBasicHttpResponse.setEntity(localBasicHttpEntity);
    }
    return localBasicHttpResponse;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hc
 * JD-Core Version:    0.7.0.1
 */