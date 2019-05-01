package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

@cm
public final class pt
  implements zzv<pd>
{
  private static Integer a(Map<String, String> paramMap, String paramString)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    try
    {
      Integer localInteger = Integer.valueOf(Integer.parseInt((String)paramMap.get(paramString)));
      return localInteger;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str = (String)paramMap.get(paramString);
      je.e(39 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Precache invalid numeric parameter '" + paramString + "': " + str);
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pt
 * JD-Core Version:    0.7.0.1
 */