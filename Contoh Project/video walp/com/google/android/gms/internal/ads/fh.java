package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class fh
  extends fj
{
  private final Object a = new Object();
  private final Context b;
  private SharedPreferences c;
  private final bbb<JSONObject, JSONObject> d;
  
  public fh(Context paramContext, bbb<JSONObject, JSONObject> parambbb)
  {
    this.b = paramContext.getApplicationContext();
    this.d = parambbb;
  }
  
  public final ne<Void> a()
  {
    synchronized (this.a)
    {
      if (this.c != null)
      {
        long l1 = this.c.getLong("js_last_update", 0L);
        long l2 = zzbv.zzer().a() - l1;
        arq localarq1 = asa.bU;
        if (l2 < ((Long)aos.f().a(localarq1)).longValue()) {
          return mt.a(null);
        }
      }
      else
      {
        this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
      }
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("js", zzang.a().a);
      arq localarq2 = asa.bV;
      localJSONObject.put("mf", aos.f().a(localarq2));
      localJSONObject.put("cl", "193400285");
      localJSONObject.put("rapid_rc", "dev");
      localJSONObject.put("rapid_rollup", "HEAD");
      localJSONObject.put("dynamite_version", 279);
      return mt.a(this.d.b(localJSONObject), new fi(this), nk.b);
    }
    catch (JSONException localJSONException)
    {
      je.b("Unable to populate SDK Core Constants parameters.", localJSONException);
    }
    return mt.a(null);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fh
 * JD-Core Version:    0.7.0.1
 */