package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.hz;
import java.util.Map;

@cm
public final class zzab
  implements zzv<Object>
{
  private final Context a;
  
  public zzab(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    if (!zzbv.zzfh().a(this.a)) {
      return;
    }
    String str1 = (String)paramMap.get("eventName");
    String str2 = (String)paramMap.get("eventId");
    zzbv.zzfh().a(this.a, str1, str2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzab
 * JD-Core Version:    0.7.0.1
 */