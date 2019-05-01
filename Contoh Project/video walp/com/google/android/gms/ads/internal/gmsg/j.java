package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.je;
import java.util.Map;

final class j
  implements zzv<Object>
{
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    String str1 = String.valueOf((String)paramMap.get("string"));
    if (str1.length() != 0) {}
    for (String str2 = "Received log message: ".concat(str1);; str2 = new String("Received log message: "))
    {
      je.d(str2);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.j
 * JD-Core Version:    0.7.0.1
 */