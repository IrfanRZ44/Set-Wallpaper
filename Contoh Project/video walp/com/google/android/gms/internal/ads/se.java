package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class se
{
  public final String a;
  public final Uri b;
  public final Map<String, String> c;
  private final String d;
  
  @TargetApi(21)
  public se(WebResourceRequest paramWebResourceRequest)
  {
    this(paramWebResourceRequest.getUrl().toString(), paramWebResourceRequest.getUrl(), paramWebResourceRequest.getMethod(), paramWebResourceRequest.getRequestHeaders());
  }
  
  public se(String paramString)
  {
    this(paramString, Uri.parse(paramString), null, null);
  }
  
  private se(String paramString1, Uri paramUri, @Nullable String paramString2, @Nullable Map<String, String> paramMap)
  {
    this.a = paramString1;
    this.b = paramUri;
    if (paramString2 == null) {
      paramString2 = "GET";
    }
    this.d = paramString2;
    if (paramMap == null) {
      paramMap = Collections.emptyMap();
    }
    this.c = paramMap;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.se
 * JD-Core Version:    0.7.0.1
 */