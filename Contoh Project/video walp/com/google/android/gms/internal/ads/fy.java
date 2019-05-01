package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class fy
  extends aiz
  implements fw
{
  fy(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  public final String a()
  {
    Parcel localParcel = a(1, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final int b()
  {
    Parcel localParcel = a(2, i_());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fy
 * JD-Core Version:    0.7.0.1
 */