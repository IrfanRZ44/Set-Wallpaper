package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class auc
  implements zzv<Object>
{
  auc(atx paramatx, bq parambq) {}
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, paramMap.get(str));
      }
      localJSONObject.put("id", atx.b(this.b));
    }
    catch (JSONException localJSONException)
    {
      je.b("Unable to dispatch sendMessageToNativeJs event", localJSONException);
      return;
    }
    this.a.a("sendMessageToNativeJs", localJSONObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.auc
 * JD-Core Version:    0.7.0.1
 */