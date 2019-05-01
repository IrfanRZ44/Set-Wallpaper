package com.google.android.gms.ads.internal.gmsg;

import android.os.Handler;
import com.google.android.gms.internal.ads.ayy;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import java.util.Map;
import org.json.JSONObject;

final class p
  implements Runnable
{
  p(HttpClient paramHttpClient, Map paramMap, ayy paramayy) {}
  
  public final void run()
  {
    je.b("Received Http request.");
    String str = (String)this.b.get("http_request");
    JSONObject localJSONObject2;
    try
    {
      JSONObject localJSONObject1 = new JSONObject(str);
      localJSONObject2 = this.c.send(localJSONObject1);
      if (localJSONObject2 == null)
      {
        je.c("Response should not be null.");
        return;
      }
    }
    catch (Exception localException)
    {
      je.b("Error converting request to json.", localException);
      return;
    }
    jn.a.post(new q(this, localJSONObject2));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.p
 * JD-Core Version:    0.7.0.1
 */