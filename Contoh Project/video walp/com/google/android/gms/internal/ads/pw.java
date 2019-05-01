package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.common.util.k;

@cm
@TargetApi(11)
public final class pw
  extends WebChromeClient
{
  private final qe a;
  
  public pw(qe paramqe)
  {
    this.a = paramqe;
  }
  
  private static Context a(WebView paramWebView)
  {
    Object localObject;
    if (!(paramWebView instanceof qe)) {
      localObject = paramWebView.getContext();
    }
    qe localqe;
    do
    {
      return localObject;
      localqe = (qe)paramWebView;
      localObject = localqe.d();
    } while (localObject != null);
    return localqe.getContext();
  }
  
  private final boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    AlertDialog.Builder localBuilder;
    try
    {
      if ((this.a != null) && (this.a.t() != null) && (this.a.t().a() != null))
      {
        zzx localzzx = this.a.t().a();
        if ((localzzx != null) && (!localzzx.zzcy()))
        {
          localzzx.zzs(11 + String.valueOf(paramString1).length() + String.valueOf(paramString3).length() + "window." + paramString1 + "('" + paramString3 + "')");
          return false;
        }
      }
      localBuilder = new AlertDialog.Builder(paramContext);
      localBuilder.setTitle(paramString2);
      if (paramBoolean)
      {
        LinearLayout localLinearLayout = new LinearLayout(paramContext);
        localLinearLayout.setOrientation(1);
        TextView localTextView = new TextView(paramContext);
        localTextView.setText(paramString3);
        EditText localEditText = new EditText(paramContext);
        localEditText.setText(paramString4);
        localLinearLayout.addView(localTextView);
        localLinearLayout.addView(localEditText);
        localBuilder.setView(localLinearLayout).setPositiveButton(17039370, new qc(paramJsPromptResult, localEditText)).setNegativeButton(17039360, new qb(paramJsPromptResult)).setOnCancelListener(new qa(paramJsPromptResult)).create().show();
        return true;
      }
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      je.c("Fail to display Dialog.", localBadTokenException);
      return true;
    }
    localBuilder.setMessage(paramString3).setPositiveButton(17039370, new pz(paramJsResult)).setNegativeButton(17039360, new py(paramJsResult)).setOnCancelListener(new px(paramJsResult)).create().show();
    return true;
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    if (!(paramWebView instanceof qe))
    {
      je.e("Tried to close a WebView that wasn't an AdWebView.");
      return;
    }
    zzd localzzd = ((qe)paramWebView).p();
    if (localzzd == null)
    {
      je.e("Tried to close an AdWebView not associated with an overlay.");
      return;
    }
    localzzd.close();
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str1 = paramConsoleMessage.message();
    String str2 = paramConsoleMessage.sourceId();
    int i = paramConsoleMessage.lineNumber();
    String str3 = 19 + String.valueOf(str1).length() + String.valueOf(str2).length() + "JS: " + str1 + " (" + str2 + ":" + i + ")";
    if (str3.contains("Application Cache")) {
      return super.onConsoleMessage(paramConsoleMessage);
    }
    switch (qd.a[paramConsoleMessage.messageLevel().ordinal()])
    {
    default: 
      je.d(str3);
    }
    for (;;)
    {
      return super.onConsoleMessage(paramConsoleMessage);
      je.c(str3);
      continue;
      je.e(str3);
      continue;
      je.d(str3);
      continue;
      je.b(str3);
    }
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)paramMessage.obj;
    WebView localWebView = new WebView(paramWebView.getContext());
    if (this.a.u() != null) {
      localWebView.setWebViewClient(this.a.u());
    }
    localWebViewTransport.setWebView(localWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l = 5242880L - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L)
    {
      if ((paramLong2 <= l) && (paramLong2 <= 1048576L)) {}
      for (;;)
      {
        paramQuotaUpdater.updateQuota(paramLong2);
        return;
        paramLong2 = 0L;
      }
    }
    if (paramLong2 == 0L) {
      paramLong1 = Math.min(paramLong1 + Math.min(131072L, l), 1048576L);
    }
    for (;;)
    {
      paramLong2 = paramLong1;
      break;
      if (paramLong2 <= Math.min(1048576L - paramLong1, l)) {
        paramLong1 += paramLong2;
      }
    }
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      zzbv.zzek();
      if (!jn.a(this.a.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
      {
        zzbv.zzek();
        if (!jn.a(this.a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
          break label62;
        }
      }
    }
    label62:
    for (boolean bool = true;; bool = false)
    {
      paramCallback.invoke(paramString, bool, true);
      return;
    }
  }
  
  public final void onHideCustomView()
  {
    zzd localzzd = this.a.p();
    if (localzzd == null)
    {
      je.e("Could not get ad overlay when hiding custom view.");
      return;
    }
    localzzd.zznh();
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), "alert", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), "onBeforeUnload", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), "confirm", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(a(paramWebView), "prompt", paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  @TargetApi(21)
  public final void onPermissionRequest(PermissionRequest paramPermissionRequest)
  {
    if (k.i())
    {
      arq localarq = asa.aC;
      if (!((Boolean)aos.f().a(localarq)).booleanValue()) {}
    }
    else
    {
      super.onPermissionRequest(paramPermissionRequest);
      return;
    }
    if ((this.a == null) || (this.a.t() == null) || (this.a.t().m() == null))
    {
      super.onPermissionRequest(paramPermissionRequest);
      return;
    }
    String[] arrayOfString = this.a.t().m().a(paramPermissionRequest.getResources());
    if (arrayOfString.length > 0)
    {
      paramPermissionRequest.grant(arrayOfString);
      return;
    }
    paramPermissionRequest.deny();
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l1 = 5242880L - paramLong2;
    long l2 = 131072L + paramLong1;
    if (l1 < l2)
    {
      paramQuotaUpdater.updateQuota(0L);
      return;
    }
    paramQuotaUpdater.updateQuota(l2);
  }
  
  @Deprecated
  public final void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    zzd localzzd = this.a.p();
    if (localzzd == null)
    {
      je.e("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    localzzd.zza(paramView, paramCustomViewCallback);
    localzzd.setRequestedOrientation(paramInt);
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    onShowCustomView(paramView, -1, paramCustomViewCallback);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pw
 * JD-Core Version:    0.7.0.1
 */