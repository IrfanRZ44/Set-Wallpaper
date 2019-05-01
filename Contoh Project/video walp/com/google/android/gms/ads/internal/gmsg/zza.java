package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class zza
  implements zzv<Object>
{
  private final zzb a;
  
  public zza(zzb paramzzb)
  {
    this.a = paramzzb;
  }
  
  private static Bundle a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Bundle localBundle;
    String str1;
    for (;;)
    {
      Object localObject;
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        Iterator localIterator = localJSONObject.keys();
        localBundle = new Bundle();
        if (!localIterator.hasNext()) {
          break label244;
        }
        str1 = (String)localIterator.next();
        localObject = localJSONObject.get(str1);
        if (localObject == null) {
          continue;
        }
        if ((localObject instanceof Boolean))
        {
          localBundle.putBoolean(str1, ((Boolean)localObject).booleanValue());
          continue;
        }
        if (!(localObject instanceof Double)) {
          break label123;
        }
      }
      catch (JSONException localJSONException)
      {
        je.b("Failed to convert ad metadata to JSON.", localJSONException);
        return null;
      }
      localBundle.putDouble(str1, ((Double)localObject).doubleValue());
      continue;
      label123:
      if ((localObject instanceof Integer))
      {
        localBundle.putInt(str1, ((Integer)localObject).intValue());
      }
      else if ((localObject instanceof Long))
      {
        localBundle.putLong(str1, ((Long)localObject).longValue());
      }
      else
      {
        if (!(localObject instanceof String)) {
          break;
        }
        localBundle.putString(str1, (String)localObject);
      }
    }
    String str2 = String.valueOf(str1);
    if (str2.length() != 0) {}
    for (String str3 = "Unsupported type for key:".concat(str2);; str3 = new String("Unsupported type for key:"))
    {
      je.e(str3);
      break;
    }
    label244:
    return localBundle;
  }
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    if (this.a == null) {
      return;
    }
    String str1 = (String)paramMap.get("name");
    if (str1 == null) {
      je.d("Ad metadata with no name parameter.");
    }
    for (String str2 = "";; str2 = str1)
    {
      Bundle localBundle = a((String)paramMap.get("info"));
      if (localBundle == null)
      {
        je.c("Failed to convert ad metadata to Bundle.");
        return;
      }
      this.a.zza(str2, localBundle);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zza
 * JD-Core Version:    0.7.0.1
 */