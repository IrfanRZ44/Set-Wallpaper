package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bdr
  implements Runnable
{
  bdr(bdo parambdo) {}
  
  public final void run()
  {
    try
    {
      bdo.a(this.a).e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdr
 * JD-Core Version:    0.7.0.1
 */