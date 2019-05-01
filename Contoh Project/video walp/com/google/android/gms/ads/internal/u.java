package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.atf;
import com.google.android.gms.internal.ads.avo;
import com.google.android.gms.internal.ads.je;

final class u
  implements Runnable
{
  u(zzbc paramzzbc, atf paramatf) {}
  
  public final void run()
  {
    try
    {
      if (this.b.e.i != null)
      {
        this.b.e.i.a(this.a);
        this.b.a(this.a.j());
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
 * Qualified Name:     com.google.android.gms.ads.internal.u
 * JD-Core Version:    0.7.0.1
 */