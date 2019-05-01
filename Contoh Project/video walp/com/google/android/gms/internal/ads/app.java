package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class app
  extends aja
  implements apo
{
  public app()
  {
    super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
  }
  
  public static apo a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    if ((localIInterface instanceof apo)) {
      return (apo)localIInterface;
    }
    return new apq(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      a();
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.app
 * JD-Core Version:    0.7.0.1
 */