package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class apz
  extends aja
  implements apy
{
  public apz()
  {
    super("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      long l = b();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      return true;
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apz
 * JD-Core Version:    0.7.0.1
 */