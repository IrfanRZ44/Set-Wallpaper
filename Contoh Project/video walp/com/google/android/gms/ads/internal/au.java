package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.support.v4.f.m;
import com.google.android.gms.internal.ads.avk;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.je;

final class au
  implements Runnable
{
  au(zzq paramzzq, avk paramavk) {}
  
  public final void run()
  {
    try
    {
      String str = this.a.l();
      ((avy)this.b.e.m.get(str)).a(this.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.au
 * JD-Core Version:    0.7.0.1
 */