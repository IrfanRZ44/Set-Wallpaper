package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@cm
public final class fa
{
  private final List<String> a;
  private final String b;
  private final String c;
  private final String d;
  private final boolean e;
  private final String f;
  private final String g;
  private String h;
  private final int i;
  private final boolean j;
  private final JSONObject k;
  
  public fa(int paramInt, Map<String, String> paramMap)
  {
    this.h = ((String)paramMap.get("url"));
    this.b = ((String)paramMap.get("base_uri"));
    this.c = ((String)paramMap.get("post_parameters"));
    this.e = b((String)paramMap.get("drt_include"));
    this.f = ((String)paramMap.get("request_id"));
    this.d = ((String)paramMap.get("type"));
    this.a = c((String)paramMap.get("errors"));
    this.i = paramInt;
    this.g = ((String)paramMap.get("fetched_ad"));
    this.j = b((String)paramMap.get("render_test_ad_label"));
    this.k = new JSONObject();
  }
  
  public fa(JSONObject paramJSONObject)
  {
    this.h = paramJSONObject.optString("url");
    this.b = paramJSONObject.optString("base_uri");
    this.c = paramJSONObject.optString("post_parameters");
    this.e = b(paramJSONObject.optString("drt_include"));
    this.f = paramJSONObject.optString("request_id");
    this.d = paramJSONObject.optString("type");
    this.a = c(paramJSONObject.optString("errors"));
    if (paramJSONObject.optInt("valid", 0) == m) {
      m = -2;
    }
    this.i = m;
    this.g = paramJSONObject.optString("fetched_ad");
    this.j = paramJSONObject.optBoolean("render_test_ad_label");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("preprocessor_flags");
    if (localJSONObject != null) {}
    for (;;)
    {
      this.k = localJSONObject;
      return;
      localJSONObject = new JSONObject();
    }
  }
  
  private static boolean b(String paramString)
  {
    return (paramString != null) && ((paramString.equals("1")) || (paramString.equals("true")));
  }
  
  private static List<String> c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Arrays.asList(paramString.split(","));
  }
  
  public final int a()
  {
    return this.i;
  }
  
  public final void a(String paramString)
  {
    this.h = paramString;
  }
  
  public final List<String> b()
  {
    return this.a;
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public final String d()
  {
    return this.c;
  }
  
  public final String e()
  {
    return this.h;
  }
  
  public final String f()
  {
    return this.d;
  }
  
  public final boolean g()
  {
    return this.e;
  }
  
  public final String h()
  {
    return this.f;
  }
  
  public final String i()
  {
    return this.g;
  }
  
  public final boolean j()
  {
    return this.j;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fa
 * JD-Core Version:    0.7.0.1
 */