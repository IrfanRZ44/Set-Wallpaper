package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a.a;

public abstract class auy
  extends aja
  implements aux
{
  public auy()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
  }
  
  public static aux a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    if ((localIInterface instanceof aux)) {
      return (aux)localIInterface;
    }
    return new auz(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a(a.a.a(paramParcel1.readStrongBinder()));
    }
    for (;;)
    {
      paramParcel2.writeNoException();
      return true;
      a();
      continue;
      b(a.a.a(paramParcel1.readStrongBinder()));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.auy
 * JD-Core Version:    0.7.0.1
 */