package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class aut
  extends aja
  implements aus
{
  public aut()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public static aus a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    if ((localIInterface instanceof aus)) {
      return (aus)localIInterface;
    }
    return new auu(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a(paramParcel1.readString(), a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
    for (;;)
    {
      return true;
      a locala = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala);
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      a();
      paramParcel2.writeNoException();
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      continue;
      b(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aut
 * JD-Core Version:    0.7.0.1
 */