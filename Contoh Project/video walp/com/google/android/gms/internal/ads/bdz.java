package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

final class bdz
  implements Runnable
{
  bdz(bdo parambdo, AdRequest.ErrorCode paramErrorCode) {}
  
  public final void run()
  {
    try
    {
      bdo.a(this.b).a(beb.a(this.a));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdz
 * JD-Core Version:    0.7.0.1
 */