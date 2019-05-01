package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.atm;
import com.google.android.gms.internal.ads.awe;
import com.google.android.gms.internal.ads.je;

final class v
  implements Runnable
{
  v(zzbc paramzzbc, atm paramatm) {}
  
  public final void run()
  {
    try
    {
      if (this.b.e.k != null)
      {
        this.b.e.k.a(this.a);
        this.b.a(this.a.n());
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.v
 * JD-Core Version:    0.7.0.1
 */