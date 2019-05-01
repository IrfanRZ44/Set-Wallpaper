package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@cm
public final class asc
{
  private String a;
  private Map<String, String> b;
  private Context c = null;
  private String d = null;
  
  public asc(Context paramContext, String paramString)
  {
    this.c = paramContext;
    this.d = paramString;
    arq localarq = asa.O;
    this.a = ((String)aos.f().a(localarq));
    this.b = new LinkedHashMap();
    this.b.put("s", "gmob_sdk");
    this.b.put("v", "3");
    this.b.put("os", Build.VERSION.RELEASE);
    this.b.put("sdk", Build.VERSION.SDK);
    Map localMap1 = this.b;
    zzbv.zzek();
    localMap1.put("device", jn.b());
    Map localMap2 = this.b;
    String str1;
    Map localMap3;
    if (paramContext.getApplicationContext() != null)
    {
      str1 = paramContext.getApplicationContext().getPackageName();
      localMap2.put("app", str1);
      localMap3 = this.b;
      zzbv.zzek();
      if (!jn.k(paramContext)) {
        break label287;
      }
    }
    label287:
    for (String str2 = "1";; str2 = "0")
    {
      localMap3.put("is_lite_sdk", str2);
      Future localFuture = zzbv.zzev().a(this.c);
      try
      {
        localFuture.get();
        this.b.put("network_coarse", Integer.toString(((fc)localFuture.get()).n));
        this.b.put("network_fine", Integer.toString(((fc)localFuture.get()).o));
        return;
      }
      catch (Exception localException)
      {
        zzbv.zzeo().a(localException, "CsiConfiguration.CsiConfiguration");
      }
      str1 = paramContext.getPackageName();
      break;
    }
  }
  
  final String a()
  {
    return this.a;
  }
  
  final Context b()
  {
    return this.c;
  }
  
  final String c()
  {
    return this.d;
  }
  
  final Map<String, String> d()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asc
 * JD-Core Version:    0.7.0.1
 */