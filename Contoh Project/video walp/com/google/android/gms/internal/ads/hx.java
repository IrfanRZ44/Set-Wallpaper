package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
@TargetApi(21)
final class hx
{
  private static final Map<String, String> a;
  private final Context b;
  private final List<String> c;
  private final hk d;
  
  static
  {
    HashMap localHashMap = new HashMap();
    if (k.i())
    {
      localHashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
      localHashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
    }
    a = localHashMap;
  }
  
  hx(Context paramContext, List<String> paramList, hk paramhk)
  {
    this.b = paramContext;
    this.c = paramList;
    this.d = paramhk;
  }
  
  final List<String> a(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str1 = paramArrayOfString[j];
      Iterator localIterator = this.c.iterator();
      label37:
      String str2;
      int k;
      label72:
      int m;
      if (localIterator.hasNext())
      {
        str2 = (String)localIterator.next();
        if (str2.equals(str1))
        {
          k = 1;
          if (k == 0) {
            break label225;
          }
          if (a.containsKey(str1))
          {
            zzbv.zzek();
            if (!jn.a(this.b, (String)a.get(str1))) {
              break label207;
            }
          }
          m = 1;
          label120:
          if (m == 0) {
            break label213;
          }
          localArrayList.add(str1);
        }
      }
      for (;;)
      {
        j++;
        break;
        String str3 = String.valueOf("android.webkit.resource.");
        String str4 = String.valueOf(str2);
        if (str4.length() != 0) {}
        for (String str5 = str3.concat(str4);; str5 = new String(str3))
        {
          if (!str5.equals(str1)) {
            break label199;
          }
          k = 1;
          break;
        }
        label199:
        break label37;
        k = 0;
        break label72;
        label207:
        m = 0;
        break label120;
        label213:
        this.d.c(str1);
        continue;
        label225:
        this.d.b(str1);
      }
    }
    return localArrayList;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hx
 * JD-Core Version:    0.7.0.1
 */