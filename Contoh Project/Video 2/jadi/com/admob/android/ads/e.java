package com.admob.android.ads;

import java.util.Map;
import org.json.JSONObject;

public final class e
{
  private static boolean a = false;
  
  public static r a(String paramString1, String paramString2, String paramString3)
  {
    return a(paramString1, paramString2, paramString3, null);
  }
  
  public static r a(String paramString1, String paramString2, String paramString3, h paramh)
  {
    return a(paramString1, paramString2, paramString3, paramh, 5000, null, null);
  }
  
  public static r a(String paramString1, String paramString2, String paramString3, h paramh, int paramInt)
  {
    r localr = a(paramString1, null, paramString3, paramh, 5000, null, null);
    if (localr != null) {
      localr.a(1);
    }
    return localr;
  }
  
  public static r a(String paramString1, String paramString2, String paramString3, h paramh, int paramInt, Map<String, String> paramMap, String paramString4)
  {
    return new i(paramString1, paramString2, paramString3, paramh, paramInt, null, paramString4);
  }
  
  public static r a(String paramString1, String paramString2, String paramString3, JSONObject paramJSONObject, h paramh)
  {
    if (paramJSONObject == null) {}
    for (String str = null;; str = paramJSONObject.toString())
    {
      r localr = a(paramString1, paramString2, paramString3, paramh, 5000, null, str);
      localr.a("application/json");
      return localr;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.e
 * JD-Core Version:    0.7.0.1
 */