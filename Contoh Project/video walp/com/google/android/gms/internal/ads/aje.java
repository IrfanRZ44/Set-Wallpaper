package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aje
  extends aja
  implements ajd
{
  public static ajd a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
    if ((localIInterface instanceof ajd)) {
      return (ajd)localIInterface;
    }
    return new ajf(paramIBinder);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aje
 * JD-Core Version:    0.7.0.1
 */