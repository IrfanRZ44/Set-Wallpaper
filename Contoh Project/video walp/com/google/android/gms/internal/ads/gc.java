package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;

final class gc
  extends hc
{
  private final qi a;
  
  gc(qi paramqi)
  {
    this.a = paramqi;
  }
  
  public final ph a(avs<?> paramavs, Map<String, String> paramMap)
  {
    HttpResponse localHttpResponse;
    int i;
    ArrayList localArrayList;
    try
    {
      localHttpResponse = this.a.b(paramavs, paramMap);
      i = localHttpResponse.getStatusLine().getStatusCode();
      Header[] arrayOfHeader = localHttpResponse.getAllHeaders();
      localArrayList = new ArrayList(arrayOfHeader.length);
      int j = arrayOfHeader.length;
      for (int k = 0; k < j; k++)
      {
        Header localHeader = arrayOfHeader[k];
        localArrayList.add(new apr(localHeader.getName(), localHeader.getValue()));
      }
      if (localHttpResponse.getEntity() != null) {
        break label140;
      }
    }
    catch (ConnectTimeoutException localConnectTimeoutException)
    {
      throw new SocketTimeoutException(localConnectTimeoutException.getMessage());
    }
    return new ph(i, localArrayList);
    label140:
    long l = localHttpResponse.getEntity().getContentLength();
    if ((int)l != l) {
      throw new IOException(40 + "Response too large: " + l);
    }
    return new ph(i, localArrayList, (int)localHttpResponse.getEntity().getContentLength(), localHttpResponse.getEntity().getContent());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gc
 * JD-Core Version:    0.7.0.1
 */