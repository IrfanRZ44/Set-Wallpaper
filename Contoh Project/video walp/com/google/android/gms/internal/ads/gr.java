package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.a.b;

final class gr
  implements Runnable
{
  gr(gp paramgp, bcn parambcn, zzjj paramzzjj, gx paramgx) {}
  
  public final void run()
  {
    String str1;
    try
    {
      this.a.a(b.a(gp.a(this.d)), this.b, null, this.c, gp.b(this.d));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      str1 = String.valueOf(this.d.a);
      if (str1.length() == 0) {}
    }
    for (String str2 = "Fail to initialize adapter ".concat(str1);; str2 = new String("Fail to initialize adapter "))
    {
      je.c(str2, localRemoteException);
      this.d.a(this.d.a, 0);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gr
 * JD-Core Version:    0.7.0.1
 */