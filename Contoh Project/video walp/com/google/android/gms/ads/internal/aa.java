package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aoy;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.je;

final class aa
  extends WebViewClient
{
  aa(zzbp paramzzbp) {}
  
  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    if (zzbp.a(this.a) != null) {}
    try
    {
      zzbp.a(this.a).a(0);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.startsWith(this.a.b())) {
      return false;
    }
    arq localarq1 = asa.cu;
    if (paramString.startsWith((String)aos.f().a(localarq1)))
    {
      if (zzbp.a(this.a) != null) {}
      try
      {
        zzbp.a(this.a).a(3);
        this.a.a(0);
        return true;
      }
      catch (RemoteException localRemoteException4)
      {
        for (;;)
        {
          je.d("#007 Could not call remote method.", localRemoteException4);
        }
      }
    }
    arq localarq2 = asa.cv;
    if (paramString.startsWith((String)aos.f().a(localarq2)))
    {
      if (zzbp.a(this.a) != null) {}
      try
      {
        zzbp.a(this.a).a(0);
        this.a.a(0);
        return true;
      }
      catch (RemoteException localRemoteException3)
      {
        for (;;)
        {
          je.d("#007 Could not call remote method.", localRemoteException3);
        }
      }
    }
    arq localarq3 = asa.cw;
    if (paramString.startsWith((String)aos.f().a(localarq3)))
    {
      if (zzbp.a(this.a) != null) {}
      try
      {
        zzbp.a(this.a).c();
        int i = this.a.a(paramString);
        this.a.a(i);
        return true;
      }
      catch (RemoteException localRemoteException2)
      {
        for (;;)
        {
          je.d("#007 Could not call remote method.", localRemoteException2);
        }
      }
    }
    if (paramString.startsWith("gmsg://")) {
      return true;
    }
    if (zzbp.a(this.a) != null) {}
    try
    {
      zzbp.a(this.a).b();
      String str = zzbp.a(this.a, paramString);
      zzbp.b(this.a, str);
      return true;
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        je.d("#007 Could not call remote method.", localRemoteException1);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.aa
 * JD-Core Version:    0.7.0.1
 */