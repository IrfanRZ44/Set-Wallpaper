package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class ew
  implements zzv<Object>
{
  ew(eu parameu) {}
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    fa localfa;
    synchronized (eu.a(this.a))
    {
      if (eu.b(this.a).isDone()) {
        return;
      }
      localfa = new fa(-2, paramMap);
      if (!eu.c(this.a).equals(localfa.h())) {
        return;
      }
    }
    String str1 = localfa.e();
    if (str1 == null)
    {
      je.e("URL missing in loadAdUrl GMSG.");
      return;
    }
    String str3;
    if (str1.contains("%40mediation_adapters%40"))
    {
      String str2 = str1.replaceAll("%40mediation_adapters%40", iy.a(eu.d(this.a), (String)paramMap.get("check_adapters"), eu.e(this.a)));
      localfa.a(str2);
      str3 = String.valueOf(str2);
      if (str3.length() == 0) {
        break label184;
      }
    }
    label184:
    for (String str4 = "Ad request URL modified to ".concat(str3);; str4 = new String("Ad request URL modified to "))
    {
      je.a(str4);
      eu.b(this.a).b(localfa);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ew
 * JD-Core Version:    0.7.0.1
 */