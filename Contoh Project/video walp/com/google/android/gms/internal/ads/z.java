package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class z
  extends aja
  implements y
{
  public static y a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
    if ((localIInterface instanceof y)) {
      return (y)localIInterface;
    }
    return new aa(paramIBinder);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.z
 * JD-Core Version:    0.7.0.1
 */