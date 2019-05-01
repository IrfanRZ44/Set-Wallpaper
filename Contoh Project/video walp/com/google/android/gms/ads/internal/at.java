package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.ath;
import com.google.android.gms.internal.ads.avr;
import com.google.android.gms.internal.ads.je;

final class at
  implements Runnable
{
  at(zzq paramzzq, ath paramath) {}
  
  public final void run()
  {
    try
    {
      if (this.b.e.j != null)
      {
        this.b.e.j.a(this.a);
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
 * Qualified Name:     com.google.android.gms.ads.internal.at
 * JD-Core Version:    0.7.0.1
 */