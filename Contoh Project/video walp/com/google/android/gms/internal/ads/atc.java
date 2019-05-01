package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class atc
  implements zzv<Object>
{
  atc(atb paramatb) {}
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    try
    {
      this.a.b = Long.valueOf(Long.parseLong((String)paramMap.get("timestamp")));
      this.a.a = ((String)paramMap.get("id"));
      str = (String)paramMap.get("asset_id");
      if (atb.a(this.a) == null)
      {
        je.b("Received unconfirmed click but UnconfirmedClickListener is null.");
        return;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str;
      for (;;)
      {
        je.c("Failed to call parse unconfirmedClickTimestamp.");
      }
      try
      {
        atb.a(this.a).a(str);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atc
 * JD-Core Version:    0.7.0.1
 */