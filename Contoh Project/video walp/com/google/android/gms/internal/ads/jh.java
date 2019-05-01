package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;

final class jh
  extends jj
{
  jh(jg paramjg, Context paramContext)
  {
    super(null);
  }
  
  public final void a()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("admob", 0);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    synchronized (jg.a(this.b))
    {
      jg.a(this.b, localSharedPreferences);
      this.b.a = localEditor;
      jg.a(this.b, jg.b(this.b));
      jg.b(this.b, jg.d(this.b).getBoolean("use_https", jg.c(this.b)));
      jg.c(this.b, jg.d(this.b).getBoolean("content_url_opted_out", jg.e(this.b)));
      jg.a(this.b, jg.d(this.b).getString("content_url_hashes", jg.f(this.b)));
      jg.d(this.b, jg.d(this.b).getBoolean("auto_collect_location", jg.g(this.b)));
      jg.e(this.b, jg.d(this.b).getBoolean("content_vertical_opted_out", jg.h(this.b)));
      jg.b(this.b, jg.d(this.b).getString("content_vertical_hashes", jg.i(this.b)));
      jg.a(this.b, jg.d(this.b).getInt("version_code", jg.j(this.b)));
      jg.c(this.b, jg.d(this.b).getString("app_settings_json", jg.k(this.b)));
      jg.a(this.b, jg.d(this.b).getLong("app_settings_last_update_ms", jg.l(this.b)));
      jg.b(this.b, jg.d(this.b).getLong("app_last_background_time_ms", jg.m(this.b)));
      jg.b(this.b, jg.d(this.b).getInt("request_in_session_count", jg.n(this.b)));
      jg.c(this.b, jg.d(this.b).getLong("first_ad_req_time_ms", jg.o(this.b)));
      jg.a(this.b, jg.d(this.b).getStringSet("never_pool_slots", jg.p(this.b)));
      try
      {
        jg.a(this.b, new JSONObject(jg.d(this.b).getString("native_advanced_settings", "{}")));
        jg.a(this.b, jg.q(this.b));
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          je.c("Could not convert native advanced settings to json object", localJSONException);
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jh
 * JD-Core Version:    0.7.0.1
 */