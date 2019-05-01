package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class fx
  extends aja
  implements fw
{
  public fx()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      String str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    }
    for (;;)
    {
      return true;
      int i = b();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fx
 * JD-Core Version:    0.7.0.1
 */