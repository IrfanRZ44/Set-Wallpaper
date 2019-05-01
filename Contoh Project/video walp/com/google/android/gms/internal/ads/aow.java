package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class aow
  extends aja
  implements aov
{
  public aow()
  {
    super("com.google.android.gms.ads.internal.client.IAdClickListener");
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
 * Qualified Name:     com.google.android.gms.internal.ads.aow
 * JD-Core Version:    0.7.0.1
 */