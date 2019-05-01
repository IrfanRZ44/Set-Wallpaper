package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

final class ale
  implements Runnable
{
  private ValueCallback<String> e = new alf(this);
  
  ale(alc paramalc, akw paramakw, WebView paramWebView, boolean paramBoolean) {}
  
  public final void run()
  {
    if (this.b.getSettings().getJavaScriptEnabled()) {}
    try
    {
      this.b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.e);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.e.onReceiveValue("");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ale
 * JD-Core Version:    0.7.0.1
 */