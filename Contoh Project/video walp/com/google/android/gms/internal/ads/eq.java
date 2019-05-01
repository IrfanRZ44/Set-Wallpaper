package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;

final class eq
  implements Runnable
{
  eq(eo parameo, zzaef paramzzaef, dt paramdt) {}
  
  public final void run()
  {
    try
    {
      zzaej localzzaej2 = this.c.a(this.a);
      localzzaej1 = localzzaej2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          this.b.a(localzzaej1);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          zzaej localzzaej1;
          je.c("Fail to forward ad response.", localRemoteException);
        }
        localException = localException;
        zzbv.zzeo().a(localException, "AdRequestServiceImpl.loadAdAsync");
        je.c("Could not fetch ad response due to an Exception.", localException);
        localzzaej1 = null;
      }
    }
    if (localzzaej1 == null) {
      localzzaej1 = new zzaej(0);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.eq
 * JD-Core Version:    0.7.0.1
 */