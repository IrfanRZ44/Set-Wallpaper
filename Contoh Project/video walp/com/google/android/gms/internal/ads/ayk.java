package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class ayk
  implements Runnable
{
  ayk(axl paramaxl, ayl paramayl, aym paramaym) {}
  
  public final void run()
  {
    try
    {
      this.a.a(this.b);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.c("Could not propagate interstitial ad event.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayk
 * JD-Core Version:    0.7.0.1
 */