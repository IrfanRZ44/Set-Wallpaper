package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.np;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class zzaa
  implements zzv<Object>
{
  private final HashMap<String, np<JSONObject>> a = new HashMap();
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = (String)paramMap.get("fetched_ad");
    je.b("Received ad from the cache.");
    np localnp = (np)this.a.get(str1);
    if (localnp == null)
    {
      je.c("Could not find the ad request for the corresponding ad response.");
      return;
    }
    try
    {
      localnp.b(new JSONObject(str2));
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Failed constructing JSON object from value passed from javascript", localJSONException);
      localnp.b(null);
      return;
    }
    finally
    {
      this.a.remove(str1);
    }
  }
  
  public final Future<JSONObject> zzas(String paramString)
  {
    np localnp = new np();
    this.a.put(paramString, localnp);
    return localnp;
  }
  
  public final void zzat(String paramString)
  {
    np localnp = (np)this.a.get(paramString);
    if (localnp == null)
    {
      je.c("Could not find the ad request for the corresponding ad response.");
      return;
    }
    if (!localnp.isDone()) {
      localnp.cancel(true);
    }
    this.a.remove(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzaa
 * JD-Core Version:    0.7.0.1
 */