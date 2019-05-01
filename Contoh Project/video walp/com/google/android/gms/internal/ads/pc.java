package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class pc
{
  private final boolean a;
  private final int b;
  private final int c;
  private final int d;
  private final String e;
  private final int f;
  private final int g;
  private final int h;
  private final boolean i;
  
  public pc(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        localJSONObject1 = new JSONObject(paramString);
        localJSONObject2 = localJSONObject1;
      }
      catch (JSONException localJSONException)
      {
        JSONObject localJSONObject2 = null;
        continue;
      }
      this.a = a(localJSONObject2, "aggressive_media_codec_release", asa.B);
      this.b = b(localJSONObject2, "byte_buffer_precache_limit", asa.m);
      this.c = b(localJSONObject2, "exo_cache_buffer_size", asa.p);
      this.d = b(localJSONObject2, "exo_connect_timeout_millis", asa.i);
      this.e = c(localJSONObject2, "exo_player_version", asa.h);
      this.f = b(localJSONObject2, "exo_read_timeout_millis", asa.j);
      this.g = b(localJSONObject2, "load_check_interval_bytes", asa.k);
      this.h = b(localJSONObject2, "player_precache_limit", asa.l);
      this.i = a(localJSONObject2, "use_cache_data_source", asa.cH);
      return;
      JSONObject localJSONObject1 = null;
    }
  }
  
  private static boolean a(JSONObject paramJSONObject, String paramString, arq<Boolean> paramarq)
  {
    if (paramJSONObject != null) {
      try
      {
        boolean bool = paramJSONObject.getBoolean(paramString);
        return bool;
      }
      catch (JSONException localJSONException) {}
    }
    return ((Boolean)aos.f().a(paramarq)).booleanValue();
  }
  
  private static int b(JSONObject paramJSONObject, String paramString, arq<Integer> paramarq)
  {
    if (paramJSONObject != null) {
      try
      {
        int j = paramJSONObject.getInt(paramString);
        return j;
      }
      catch (JSONException localJSONException) {}
    }
    return ((Integer)aos.f().a(paramarq)).intValue();
  }
  
  private static String c(JSONObject paramJSONObject, String paramString, arq<String> paramarq)
  {
    if (paramJSONObject != null) {
      try
      {
        String str = paramJSONObject.getString(paramString);
        return str;
      }
      catch (JSONException localJSONException) {}
    }
    return (String)aos.f().a(paramarq);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pc
 * JD-Core Version:    0.7.0.1
 */