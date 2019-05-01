package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.support.v4.f.m;
import com.google.android.gms.internal.ads.atj;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.je;

final class x
  implements Runnable
{
  x(zzbc paramzzbc, String paramString, ij paramij) {}
  
  public final void run()
  {
    try
    {
      ((avy)this.c.e.m.get(this.a)).a((atj)this.b.C);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.x
 * JD-Core Version:    0.7.0.1
 */