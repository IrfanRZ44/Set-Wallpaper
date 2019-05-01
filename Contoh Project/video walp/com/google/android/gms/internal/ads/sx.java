package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class sx
  extends aja
  implements sw
{
  public static sw a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
    if ((localIInterface instanceof sw)) {
      return (sw)localIInterface;
    }
    return new sy(paramIBinder);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.sx
 * JD-Core Version:    0.7.0.1
 */