package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class ara
  implements Runnable
{
  ara(aqz paramaqz) {}
  
  public final void run()
  {
    if (aqx.a(this.a.a) != null) {}
    try
    {
      aqx.a(this.a.a).a(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not notify onAdFailedToLoad event.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ara
 * JD-Core Version:    0.7.0.1
 */