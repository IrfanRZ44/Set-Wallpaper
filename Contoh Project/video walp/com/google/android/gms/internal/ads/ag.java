package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class ag
  extends aja
  implements af
{
  public static af a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
    if ((localIInterface instanceof af)) {
      return (af)localIInterface;
    }
    return new ah(paramIBinder);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ag
 * JD-Core Version:    0.7.0.1
 */