package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class arc
  implements Runnable
{
  arc(arb paramarb) {}
  
  public final void run()
  {
    if (arb.a(this.a) != null) {}
    try
    {
      arb.a(this.a).a(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not notify onAdFailedToLoad event.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.arc
 * JD-Core Version:    0.7.0.1
 */