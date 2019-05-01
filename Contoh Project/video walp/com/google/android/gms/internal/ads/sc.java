package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public class sc
  extends WebView
  implements sh, sj, sl, sm
{
  protected final WebViewClient a;
  private final List<sh> b = new CopyOnWriteArrayList();
  private final List<sm> c = new CopyOnWriteArrayList();
  private final List<sj> d = new CopyOnWriteArrayList();
  private final List<sl> e = new CopyOnWriteArrayList();
  private final rr f;
  
  public sc(rr paramrr)
  {
    super(paramrr);
    this.f = paramrr;
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setAllowFileAccess(false);
    localWebSettings.setSavePassword(false);
    localWebSettings.setSupportMultipleWindows(true);
    localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21) {
      localWebSettings.setMixedContentMode(2);
    }
    zzbv.zzem().a(getContext(), localWebSettings);
    removeJavascriptInterface("accessibility");
    removeJavascriptInterface("accessibilityTraversal");
    try
    {
      getSettings().setJavaScriptEnabled(true);
      setLayerType(1, null);
      this.a = new sd(this, this, this, this);
      super.setWebViewClient(this.a);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        je.b("Unable to enable Javascript.", localNullPointerException);
      }
    }
  }
  
  protected final rr I()
  {
    return this.f;
  }
  
  public void a(se paramse)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((sl)localIterator.next()).a(paramse);
    }
  }
  
  public final void a(sh paramsh)
  {
    this.b.add(paramsh);
  }
  
  public final void a(sj paramsj)
  {
    this.d.add(paramsj);
  }
  
  public final void a(sl paramsl)
  {
    this.e.add(paramsl);
  }
  
  public final void a(sm paramsm)
  {
    this.c.add(paramsm);
  }
  
  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      super.addJavascriptInterface(paramObject, paramString);
      return;
    }
    je.a("Ignore addJavascriptInterface due to low Android version.");
  }
  
  public final void b(se paramse)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((sj)localIterator.next()).b(paramse);
    }
  }
  
  public void b(String paramString)
  {
    si.a(this, paramString);
  }
  
  public final boolean c(se paramse)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      if (((sh)localIterator.next()).c(paramse)) {
        return true;
      }
    }
    return false;
  }
  
  public final WebResourceResponse d(se paramse)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      WebResourceResponse localWebResourceResponse = ((sm)localIterator.next()).d(paramse);
      if (localWebResourceResponse != null) {
        return localWebResourceResponse;
      }
    }
    return null;
  }
  
  public void loadUrl(String paramString)
  {
    try
    {
      super.loadUrl(paramString);
      return;
    }
    catch (Exception localException)
    {
      zzbv.zzeo().a(localException, "CoreWebView.loadUrl");
      je.d("#007 Could not call remote method.", localException);
      return;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      break label7;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      label7:
      break label7;
    }
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.sc
 * JD-Core Version:    0.7.0.1
 */