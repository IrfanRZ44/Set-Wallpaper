package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class bcl
  extends aja
  implements bck
{
  public bcl()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public static bck a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    if ((localIInterface instanceof bck)) {
      return (bck)localIInterface;
    }
    return new bcm(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      bcn localbcn = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localbcn);
    }
    for (;;)
    {
      return true;
      boolean bool = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool);
      continue;
      bei localbei = c(paramParcel1.readString());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localbei);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcl
 * JD-Core Version:    0.7.0.1
 */