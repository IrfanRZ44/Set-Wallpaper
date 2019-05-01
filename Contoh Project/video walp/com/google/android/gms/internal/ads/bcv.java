package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bcv
  extends aiz
  implements bct
{
  bcv(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
  }
  
  public final int a()
  {
    Parcel localParcel = a(1, i_());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcv
 * JD-Core Version:    0.7.0.1
 */