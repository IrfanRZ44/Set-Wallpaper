package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@cm
public final class bcd
{
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    if (TextUtils.isEmpty(paramString3)) {
      paramString3 = "";
    }
    return paramString1.replaceAll(paramString2, paramString3);
  }
  
  public static List<String> a(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray != null)
    {
      ArrayList localArrayList = new ArrayList(localJSONArray.length());
      for (int i = 0; i < localJSONArray.length(); i++) {
        localArrayList.add(localJSONArray.getString(i));
      }
      return Collections.unmodifiableList(localArrayList);
    }
    return null;
  }
  
  public static void a(Context paramContext, String paramString1, ij paramij, String paramString2, boolean paramBoolean, List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    if (paramBoolean) {}
    for (String str1 = "1";; str1 = "0")
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str2 = a(a(a(a(a(a(a((String)localIterator.next(), "@gw_adlocid@", paramString2), "@gw_adnetrefresh@", str1), "@gw_qdata@", paramij.r.i), "@gw_sdkver@", paramString1), "@gw_sessid@", aos.c()), "@gw_seqnum@", paramij.j), "@gw_adnetstatus@", paramij.t);
        if (paramij.o != null) {
          str2 = a(a(str2, "@gw_adnetid@", paramij.o.b), "@gw_allocid@", paramij.o.d);
        }
        String str3 = id.a(str2, paramContext);
        zzbv.zzek();
        jn.a(paramContext, paramString1, str3);
      }
      break;
    }
  }
  
  public static void a(Context paramContext, String paramString1, List<String> paramList, String paramString2, zzaig paramzzaig)
  {
    if ((paramList == null) || (paramList.isEmpty())) {}
    for (;;)
    {
      return;
      if ((!TextUtils.isEmpty(paramString2)) && (md.c())) {
        paramString2 = "fakeUserForAdDebugLog";
      }
      long l = zzbv.zzer().a();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = a(a((String)localIterator.next(), "@gw_rwd_userid@", Uri.encode(paramString2)), "@gw_tmstmp@", Long.toString(l));
        if (paramzzaig != null) {
          str = a(a(str, "@gw_rwd_itm@", Uri.encode(paramzzaig.a)), "@gw_rwd_amt@", Integer.toString(paramzzaig.b));
        }
        zzbv.zzek();
        jn.a(paramContext, paramString1, str);
      }
    }
  }
  
  public static boolean a(String paramString, int[] paramArrayOfInt)
  {
    if (TextUtils.isEmpty(paramString)) {}
    String[] arrayOfString;
    do
    {
      do
      {
        return false;
      } while (paramArrayOfInt.length != 2);
      arrayOfString = paramString.split("x");
    } while (arrayOfString.length != 2);
    try
    {
      paramArrayOfInt[0] = Integer.parseInt(arrayOfString[0]);
      paramArrayOfInt[1] = Integer.parseInt(arrayOfString[1]);
      return true;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcd
 * JD-Core Version:    0.7.0.1
 */