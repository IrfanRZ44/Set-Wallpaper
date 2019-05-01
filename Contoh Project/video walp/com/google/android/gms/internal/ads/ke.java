package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public final class ke
  extends kc
{
  public final WebResourceResponse a(String paramString1, String paramString2, int paramInt, String paramString3, Map<String, String> paramMap, InputStream paramInputStream)
  {
    return new WebResourceResponse(paramString1, paramString2, paramInt, paramString3, paramMap, paramInputStream);
  }
  
  public final qf a(qe paramqe, boolean paramBoolean)
  {
    return new re(paramqe, paramBoolean);
  }
  
  public final CookieManager c(Context paramContext)
  {
    if (e()) {
      return null;
    }
    try
    {
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
  
  public final int f()
  {
    return 16974374;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ke
 * JD-Core Version:    0.7.0.1
 */