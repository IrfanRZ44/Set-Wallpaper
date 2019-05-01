package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.zzaig;
import java.util.Map;

@cm
public final class zzah
  implements zzv<Object>
{
  private final zzai a;
  
  public zzah(zzai paramzzai)
  {
    this.a = paramzzai;
  }
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("action");
    if ("grant".equals(str1))
    {
      try
      {
        int i = Integer.parseInt((String)paramMap.get("amount"));
        String str2 = (String)paramMap.get("type");
        if (TextUtils.isEmpty(str2)) {
          break label96;
        }
        zzaig localzzaig2 = new zzaig(str2, i);
        localzzaig1 = localzzaig2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          je.c("Unable to parse reward amount.", localNumberFormatException);
          zzaig localzzaig1 = null;
        }
      }
      this.a.zzb(localzzaig1);
    }
    label96:
    arq localarq2;
    do
    {
      arq localarq1;
      do
      {
        do
        {
          return;
          if ("video_start".equals(str1))
          {
            this.a.zzdk();
            return;
          }
        } while (!"video_complete".equals(str1));
        localarq1 = asa.ax;
      } while (!((Boolean)aos.f().a(localarq1)).booleanValue());
      localarq2 = asa.ax;
    } while (!((Boolean)aos.f().a(localarq2)).booleanValue());
    this.a.zzdl();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzah
 * JD-Core Version:    0.7.0.1
 */