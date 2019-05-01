package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class rg
{
  private static final Pattern a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
  private static final Pattern b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
  
  public static String a()
  {
    arq localarq = asa.L;
    String str = (String)aos.f().a(localarq);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("version", str);
      localJSONObject.put("sdk", "Google Mobile Ads");
      localJSONObject.put("sdkVersion", "12.4.51-000");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<script>");
      localStringBuilder.append("Object.defineProperty(window,'MRAID_ENV',{get:function(){return ").append(localJSONObject.toString()).append("}});");
      localStringBuilder.append("</script>");
      return localStringBuilder.toString();
    }
    catch (JSONException localJSONException)
    {
      je.c("Unable to build MRAID_ENV", localJSONException);
    }
    return null;
  }
  
  public static String a(String paramString, String... paramVarArgs)
  {
    int i = 0;
    if (paramVarArgs.length == 0) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Matcher localMatcher = a.matcher(paramString);
    if (localMatcher.find())
    {
      int k = localMatcher.end();
      localStringBuilder.append(paramString.substring(0, k));
      int m = paramVarArgs.length;
      while (i < m)
      {
        String str2 = paramVarArgs[i];
        if (str2 != null) {
          localStringBuilder.append(str2);
        }
        i++;
      }
      localStringBuilder.append(paramString.substring(k));
    }
    for (;;)
    {
      return localStringBuilder.toString();
      if (!b.matcher(paramString).find())
      {
        int j = paramVarArgs.length;
        while (i < j)
        {
          String str1 = paramVarArgs[i];
          if (str1 != null) {
            localStringBuilder.append(str1);
          }
          i++;
        }
      }
      localStringBuilder.append(paramString);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.rg
 * JD-Core Version:    0.7.0.1
 */