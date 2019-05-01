package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

@cm
public final class pk
  implements zzv<pd>
{
  private boolean a;
  
  private static int a(Context paramContext, Map<String, String> paramMap, String paramString, int paramInt)
  {
    String str = (String)paramMap.get(paramString);
    if (str != null) {}
    try
    {
      aos.a();
      int i = lz.a(paramContext, Integer.parseInt(str));
      paramInt = i;
      return paramInt;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      je.e(34 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Could not parse " + paramString + " in a video GMSG: " + str);
    }
    return paramInt;
  }
  
  private static void a(op paramop, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("minBufferMs");
    String str2 = (String)paramMap.get("maxBufferMs");
    String str3 = (String)paramMap.get("bufferForPlaybackMs");
    String str4 = (String)paramMap.get("bufferForPlaybackAfterRebufferMs");
    if (str1 != null) {}
    try
    {
      Integer.parseInt(str1);
      if (str2 != null) {
        Integer.parseInt(str2);
      }
      if (str3 != null) {
        Integer.parseInt(str3);
      }
      if (str4 != null) {
        Integer.parseInt(str4);
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      je.e(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[] { str1, str2 }));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pk
 * JD-Core Version:    0.7.0.1
 */