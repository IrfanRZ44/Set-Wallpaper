package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
final class sd
  extends WebViewClient
{
  private final sh a;
  private final sm b;
  private final sj c;
  private final sl d;
  private final sn e = new sn();
  
  sd(sh paramsh, sm paramsm, sj paramsj, sl paramsl)
  {
    this.a = paramsh;
    this.b = paramsm;
    this.c = paramsj;
    this.d = paramsl;
  }
  
  private final boolean a(se paramse)
  {
    return this.a.c(paramse);
  }
  
  private final WebResourceResponse b(se paramse)
  {
    return this.b.d(paramse);
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return;
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "Loading resource: ".concat(str1);; str2 = new String("Loading resource: "))
    {
      je.a(str2);
      this.c.b(new se(paramString));
      return;
    }
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return;
    }
    this.d.a(new se(paramString));
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.e.a(paramInt, paramString2);
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    this.e.a(paramSslError);
  }
  
  @TargetApi(24)
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if ((paramWebResourceRequest == null) || (paramWebResourceRequest.getUrl() == null)) {
      return null;
    }
    return b(new se(paramWebResourceRequest));
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return b(new se(paramString));
  }
  
  public final boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    }
    return true;
  }
  
  @TargetApi(24)
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if ((paramWebResourceRequest == null) || (paramWebResourceRequest.getUrl() == null)) {
      return false;
    }
    return a(new se(paramWebResourceRequest));
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return a(new se(paramString));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.sd
 * JD-Core Version:    0.7.0.1
 */