package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
public class jw
  extends jv
{
  public qf a(qe paramqe, boolean paramBoolean)
  {
    return new rc(paramqe, paramBoolean);
  }
  
  public final Set<String> a(Uri paramUri)
  {
    return paramUri.getQueryParameterNames();
  }
  
  public final boolean a(DownloadManager.Request paramRequest)
  {
    paramRequest.allowScanningByMediaScanner();
    paramRequest.setNotificationVisibility(1);
    return true;
  }
  
  public boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    super.a(paramContext, paramWebSettings);
    return ((Boolean)lq.a(paramContext, new jx(this, paramContext, paramWebSettings))).booleanValue();
  }
  
  public final boolean a(Window paramWindow)
  {
    paramWindow.setFlags(16777216, 16777216);
    return true;
  }
  
  public final boolean b(View paramView)
  {
    paramView.setLayerType(0, null);
    return true;
  }
  
  public final boolean c(View paramView)
  {
    paramView.setLayerType(1, null);
    return true;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jw
 * JD-Core Version:    0.7.0.1
 */