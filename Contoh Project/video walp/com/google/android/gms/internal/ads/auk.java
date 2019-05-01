package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class auk
  extends aja
  implements auj
{
  public auk()
  {
    super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
  }
  
  public static auj a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    if ((localIInterface instanceof auj)) {
      return (auj)localIInterface;
    }
    return new aul(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 2: 
      String str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    }
    for (;;)
    {
      return true;
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.auk
 * JD-Core Version:    0.7.0.1
 */