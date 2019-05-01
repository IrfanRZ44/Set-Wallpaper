package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class in
{
  private final long a;
  private final List<String> b = new ArrayList();
  private final List<String> c = new ArrayList();
  private final Map<String, bbu> d = new HashMap();
  private String e;
  private String f;
  private boolean g = false;
  
  public in(String paramString, long paramLong)
  {
    this.f = paramString;
    this.a = paramLong;
    if (!TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      JSONObject localJSONObject1;
      int j;
      JSONObject localJSONObject2;
      String str2;
      String str3;
      try
      {
        localJSONObject1 = new JSONObject(paramString);
        if (localJSONObject1.optInt("status", -1) != 1)
        {
          this.g = false;
          je.e("App settings could not be fetched successfully.");
          return;
        }
        this.g = true;
        this.e = localJSONObject1.optString("app_id");
        JSONArray localJSONArray1 = localJSONObject1.optJSONArray("ad_unit_id_settings");
        if (localJSONArray1 == null) {
          break label278;
        }
        j = 0;
        if (j >= localJSONArray1.length()) {
          break label278;
        }
        localJSONObject2 = localJSONArray1.getJSONObject(j);
        str2 = localJSONObject2.optString("format");
        str3 = localJSONObject2.optString("ad_unit_id");
        if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str3))) {
          break label333;
        }
        if ("interstitial".equalsIgnoreCase(str2)) {
          this.c.add(str3);
        }
      }
      catch (JSONException localJSONException)
      {
        je.c("Exception occurred while processing app setting json", localJSONException);
        zzbv.zzeo().a(localJSONException, "AppSettings.parseAppSettingsJson");
        return;
      }
      if ("rewarded".equalsIgnoreCase(str2))
      {
        JSONObject localJSONObject3 = localJSONObject2.optJSONObject("mediation_config");
        if (localJSONObject3 != null)
        {
          bbu localbbu = new bbu(localJSONObject3);
          this.d.put(str3, localbbu);
          break label333;
          label278:
          JSONArray localJSONArray2 = localJSONObject1.optJSONArray("persistable_banner_ad_unit_ids");
          int i = 0;
          if (localJSONArray2 != null) {
            while (i < localJSONArray2.length())
            {
              String str1 = localJSONArray2.optString(i);
              this.b.add(str1);
              i++;
            }
          }
          return;
        }
      }
      label333:
      j++;
    }
  }
  
  public final long a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    return this.g;
  }
  
  public final String c()
  {
    return this.f;
  }
  
  public final String d()
  {
    return this.e;
  }
  
  public final Map<String, bbu> e()
  {
    return this.d;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.in
 * JD-Core Version:    0.7.0.1
 */