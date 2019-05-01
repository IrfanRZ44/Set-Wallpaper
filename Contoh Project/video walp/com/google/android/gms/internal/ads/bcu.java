package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class bcu
  extends aja
  implements bct
{
  public bcu()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      int i = a();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcu
 * JD-Core Version:    0.7.0.1
 */