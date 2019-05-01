package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

@cm
public final class ig
  implements ii
{
  public final ne<AdvertisingIdClient.Info> a(Context paramContext)
  {
    np localnp = new np();
    aos.a();
    if (lz.f(paramContext)) {
      jl.a(new ih(this, paramContext, localnp));
    }
    return localnp;
  }
  
  public final ne<String> a(String paramString, PackageInfo paramPackageInfo)
  {
    return mt.a(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ig
 * JD-Core Version:    0.7.0.1
 */