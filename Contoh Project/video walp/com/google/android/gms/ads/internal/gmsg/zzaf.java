package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class zzaf
  implements zzv<Object>
{
  private final Object a = new Object();
  @GuardedBy("mLock")
  private final Map<String, zzag> b = new HashMap();
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("id");
    String str2 = (String)paramMap.get("fail");
    String str3 = (String)paramMap.get("fail_reason");
    String str4 = (String)paramMap.get("fail_stack");
    String str5 = (String)paramMap.get("result");
    if (TextUtils.isEmpty(str4)) {}
    zzag localzzag;
    for (String str6 = "Unknown Fail Reason.";; str6 = str3)
    {
      String str8;
      if (TextUtils.isEmpty(str4)) {
        str8 = "";
      }
      synchronized (this.a)
      {
        for (;;)
        {
          localzzag = (zzag)this.b.remove(str1);
          if (localzzag != null) {
            break label212;
          }
          String str9 = String.valueOf(str1);
          if (str9.length() == 0) {
            break;
          }
          str10 = "Received result for unexpected method invocation: ".concat(str9);
          je.e(str10);
          return;
          String str7 = String.valueOf(str4);
          if (str7.length() != 0) {
            str8 = "\n".concat(str7);
          } else {
            str8 = new String("\n");
          }
        }
        String str10 = new String("Received result for unexpected method invocation: ");
      }
      label212:
      if (!TextUtils.isEmpty(str2))
      {
        String str13 = String.valueOf(str6);
        String str14 = String.valueOf(str8);
        if (str14.length() != 0) {}
        for (String str15 = str13.concat(str14);; str15 = new String(str13))
        {
          localzzag.zzau(str15);
          return;
        }
      }
      if (str5 == null)
      {
        localzzag.zzd(null);
        return;
      }
      for (;;)
      {
        try
        {
          JSONObject localJSONObject = new JSONObject(str5);
          if (je.a())
          {
            String str11 = String.valueOf(localJSONObject.toString(2));
            if (str11.length() == 0) {
              continue;
            }
            str12 = "Result GMSG: ".concat(str11);
            je.a(str12);
          }
          localzzag.zzd(localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          String str12;
          localzzag.zzau(localJSONException.getMessage());
          continue;
        }
        return;
        str12 = new String("Result GMSG: ");
      }
    }
  }
  
  public final void zza(String paramString, zzag paramzzag)
  {
    synchronized (this.a)
    {
      this.b.put(paramString, paramzzag);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzaf
 * JD-Core Version:    0.7.0.1
 */