package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class awi
  extends aja
  implements awh
{
  public awi()
  {
    super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a(paramParcel1.readString());
    }
    for (;;)
    {
      paramParcel2.writeNoException();
      return true;
      a();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awi
 * JD-Core Version:    0.7.0.1
 */