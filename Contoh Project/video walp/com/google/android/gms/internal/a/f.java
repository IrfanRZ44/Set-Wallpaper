package com.google.android.gms.internal.a;

import android.os.IBinder;
import android.os.IInterface;

public abstract class f
  extends b
  implements e
{
  public static e a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    if ((localIInterface instanceof e)) {
      return (e)localIInterface;
    }
    return new g(paramIBinder);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.a.f
 * JD-Core Version:    0.7.0.1
 */