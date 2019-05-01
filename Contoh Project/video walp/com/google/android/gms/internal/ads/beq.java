package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class beq
  implements so<sp, Object>
{
  beq(beo parambeo, beg parambeg, bcq parambcq) {}
  
  public final void a(String paramString)
  {
    try
    {
      this.a.a(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("", localRemoteException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.beq
 * JD-Core Version:    0.7.0.1
 */