package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@cm
@TargetApi(11)
public class rd
  extends qf
{
  public rd(qe paramqe, boolean paramBoolean)
  {
    super(paramqe, paramBoolean);
  }
  
  protected final WebResourceResponse a(WebView paramWebView, String paramString, Map<String, String> paramMap)
  {
    if (!(paramWebView instanceof qe))
    {
      je.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
      return null;
    }
    qe localqe = (qe)paramWebView;
    if (this.a != null) {
      this.a.a(paramString, paramMap, 1);
    }
    if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName()))
    {
      if (paramMap == null) {
        paramMap = Collections.emptyMap();
      }
      return super.a(paramString, paramMap);
    }
    if (localqe.t() != null) {
      localqe.t().n();
    }
    String str;
    if (localqe.r().d())
    {
      arq localarq3 = asa.K;
      str = (String)aos.f().a(localarq3);
    }
    for (;;)
    {
      zzbv.zzek();
      return jn.c(localqe.getContext(), localqe.i().a, str);
      if (localqe.x())
      {
        arq localarq2 = asa.J;
        str = (String)aos.f().a(localarq2);
      }
      else
      {
        arq localarq1 = asa.I;
        str = (String)aos.f().a(localarq1);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.rd
 * JD-Core Version:    0.7.0.1
 */