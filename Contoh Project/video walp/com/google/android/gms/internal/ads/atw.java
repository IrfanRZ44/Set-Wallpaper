package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class atw
  implements zzv<Object>
{
  private final WeakReference<ats> a;
  private final String b;
  
  public atw(ats paramats, String paramString)
  {
    this.a = new WeakReference(paramats);
    this.b = paramString;
  }
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("ads_id");
    String str2 = (String)paramMap.get("eventName");
    if ((TextUtils.isEmpty(str1)) || (!this.b.equals(str1))) {}
    ats localats1;
    do
    {
      do
      {
        for (;;)
        {
          return;
          try
          {
            Integer.parseInt((String)paramMap.get("eventType"));
            if ("_ai".equals(str2))
            {
              ats localats2 = (ats)this.a.get();
              if (localats2 == null) {
                continue;
              }
              localats2.zzbr();
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              je.b("Parse Scion log event type error", localException);
            }
          }
        }
      } while (!"_ac".equals(str2));
      localats1 = (ats)this.a.get();
    } while (localats1 == null);
    localats1.zzbs();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atw
 * JD-Core Version:    0.7.0.1
 */