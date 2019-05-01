package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import java.util.Map;

@cm
public final class zzc
  implements zzv<Object>
{
  private final zzd a;
  
  public zzc(zzd paramzzd)
  {
    this.a = paramzzd;
  }
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("name");
    if (str == null)
    {
      je.e("App event with no name parameter.");
      return;
    }
    this.a.onAppEvent(str, (String)paramMap.get("info"));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzc
 * JD-Core Version:    0.7.0.1
 */