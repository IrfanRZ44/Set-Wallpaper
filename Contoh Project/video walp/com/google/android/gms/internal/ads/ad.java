package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class ad
  extends aja
  implements ab
{
  public static ab a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
    if ((localIInterface instanceof ab)) {
      return (ab)localIInterface;
    }
    return new ae(paramIBinder);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ad
 * JD-Core Version:    0.7.0.1
 */