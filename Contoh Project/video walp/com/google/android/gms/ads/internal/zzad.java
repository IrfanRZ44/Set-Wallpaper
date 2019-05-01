package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.bbb;
import com.google.android.gms.internal.ads.bbc;
import com.google.android.gms.internal.ads.bbg;
import com.google.android.gms.internal.ads.bbj;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.mr;
import com.google.android.gms.internal.ads.mt;
import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.zzang;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class zzad
{
  private final Object a = new Object();
  private Context b;
  private long c = 0L;
  
  final void a(Context paramContext, zzang paramzzang, boolean paramBoolean, in paramin, String paramString1, String paramString2, Runnable paramRunnable)
  {
    if (zzbv.zzer().b() - this.c < 5000L) {
      je.e("Not retrying to fetch app settings");
    }
    for (;;)
    {
      return;
      this.c = zzbv.zzer().b();
      int j;
      if (paramin == null) {
        j = 1;
      }
      while (j != 0)
      {
        if (paramContext != null) {
          break label140;
        }
        je.e("Context not provided to fetch application settings");
        return;
        long l1 = paramin.a();
        long l2 = zzbv.zzer().a() - l1;
        arq localarq = asa.ct;
        if (l2 > ((Long)aos.f().a(localarq)).longValue()) {}
        for (int i = 1;; i = 0)
        {
          if ((i == 0) && (paramin.b())) {
            break label134;
          }
          j = 1;
          break;
        }
        label134:
        j = 0;
      }
    }
    label140:
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      je.e("App settings could not be fetched. Required parameters missing");
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    bbb localbbb;
    if (localContext != null)
    {
      this.b = localContext;
      localbbb = zzbv.zzey().a(this.b, paramzzang).a("google.afma.config.fetchAppSettings", bbg.a, bbg.a);
    }
    for (;;)
    {
      JSONObject localJSONObject;
      try
      {
        localJSONObject = new JSONObject();
        if (TextUtils.isEmpty(paramString1)) {
          break label316;
        }
        localJSONObject.put("app_id", paramString1);
        localJSONObject.put("is_init", paramBoolean);
        localJSONObject.put("pn", paramContext.getPackageName());
        ne localne1 = localbbb.b(localJSONObject);
        ne localne2 = mt.a(localne1, c.a, nk.b);
        if (paramRunnable != null) {
          localne1.a(paramRunnable, nk.b);
        }
        mr.a(localne2, "ConfigLoader.maybeFetchNewAppSettings");
        return;
      }
      catch (Exception localException)
      {
        je.b("Error requesting application settings", localException);
        return;
      }
      localContext = paramContext;
      break;
      label316:
      if (!TextUtils.isEmpty(paramString2)) {
        localJSONObject.put("ad_unit_id", paramString2);
      }
    }
  }
  
  public final void zza(Context paramContext, zzang paramzzang, String paramString, Runnable paramRunnable)
  {
    a(paramContext, paramzzang, true, null, paramString, null, paramRunnable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzad
 * JD-Core Version:    0.7.0.1
 */