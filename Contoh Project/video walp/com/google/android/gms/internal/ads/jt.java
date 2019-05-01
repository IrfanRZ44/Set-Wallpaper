package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@cm
@TargetApi(8)
public class jt
{
  public static boolean a(qe paramqe)
  {
    if (paramqe == null) {
      return false;
    }
    paramqe.onPause();
    return true;
  }
  
  public static boolean b(qe paramqe)
  {
    if (paramqe == null) {
      return false;
    }
    paramqe.onResume();
    return true;
  }
  
  public static boolean e()
  {
    int i = Process.myUid();
    return (i == 0) || (i == 1000);
  }
  
  public int a()
  {
    return 0;
  }
  
  public Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    return new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }
  
  public WebResourceResponse a(String paramString1, String paramString2, int paramInt, String paramString3, Map<String, String> paramMap, InputStream paramInputStream)
  {
    return new WebResourceResponse(paramString1, paramString2, paramInputStream);
  }
  
  public qf a(qe paramqe, boolean paramBoolean)
  {
    return new qf(paramqe, paramBoolean);
  }
  
  public String a(Context paramContext)
  {
    return "";
  }
  
  public String a(SslError paramSslError)
  {
    return "";
  }
  
  public Set<String> a(Uri paramUri)
  {
    if (paramUri.isOpaque()) {
      return Collections.emptySet();
    }
    String str = paramUri.getEncodedQuery();
    if (str == null) {
      return Collections.emptySet();
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = 0;
    do
    {
      int j = str.indexOf('&', i);
      if (j == -1) {
        j = str.length();
      }
      int k = str.indexOf('=', i);
      if ((k > j) || (k == -1)) {
        k = j;
      }
      localLinkedHashSet.add(Uri.decode(str.substring(i, k)));
      i = j + 1;
    } while (i < str.length());
    return Collections.unmodifiableSet(localLinkedHashSet);
  }
  
  public void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeGlobalOnLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public boolean a(DownloadManager.Request paramRequest)
  {
    return false;
  }
  
  public boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    return false;
  }
  
  public boolean a(View paramView)
  {
    return (paramView.getWindowToken() != null) || (paramView.getWindowVisibility() != 8);
  }
  
  public boolean a(Window paramWindow)
  {
    return false;
  }
  
  public int b()
  {
    return 1;
  }
  
  public void b(Context paramContext) {}
  
  public boolean b(View paramView)
  {
    return false;
  }
  
  public int c()
  {
    return 5;
  }
  
  public CookieManager c(Context paramContext)
  {
    if (e()) {
      return null;
    }
    try
    {
      CookieSyncManager.createInstance(paramContext);
      CookieManager localCookieManager = CookieManager.getInstance();
      return localCookieManager;
    }
    catch (Throwable localThrowable)
    {
      je.b("Failed to obtain CookieManager.", localThrowable);
      zzbv.zzeo().a(localThrowable, "ApiLevelUtil.getCookieManager");
    }
    return null;
  }
  
  public boolean c(View paramView)
  {
    return false;
  }
  
  public ViewGroup.LayoutParams d()
  {
    return new ViewGroup.LayoutParams(-2, -2);
  }
  
  public int f()
  {
    return 0;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jt
 * JD-Core Version:    0.7.0.1
 */