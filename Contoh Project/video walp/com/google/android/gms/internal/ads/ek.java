package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

public final class ek
  implements zzv<Object>
{
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = String.valueOf((String)paramMap.get("errors"));
    if (str2.length() != 0) {}
    for (String str3 = "Invalid request: ".concat(str2);; str3 = new String("Invalid request: "))
    {
      je.e(str3);
      ec.d().zzat(str1);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ek
 * JD-Core Version:    0.7.0.1
 */