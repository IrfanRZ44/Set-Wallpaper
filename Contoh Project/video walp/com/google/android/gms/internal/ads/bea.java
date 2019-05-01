package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bea
  implements Runnable
{
  bea(bdo parambdo) {}
  
  public final void run()
  {
    try
    {
      bdo.a(this.a).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bea
 * JD-Core Version:    0.7.0.1
 */