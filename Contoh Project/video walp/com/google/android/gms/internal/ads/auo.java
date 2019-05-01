package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public abstract class auo
  extends aja
  implements aun
{
  public auo()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public static aun a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    if ((localIInterface instanceof aun)) {
      return (aun)localIInterface;
    }
    return new aup(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a locala = a();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala);
    }
    for (;;)
    {
      return true;
      Uri localUri = b();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localUri);
      continue;
      double d = c();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.auo
 * JD-Core Version:    0.7.0.1
 */