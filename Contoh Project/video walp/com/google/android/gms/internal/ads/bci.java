package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bci
  implements Runnable
{
  bci(bch parambch, bcb parambcb) {}
  
  public final void run()
  {
    try
    {
      this.a.c.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.c("Could not destroy mediation adapter.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bci
 * JD-Core Version:    0.7.0.1
 */