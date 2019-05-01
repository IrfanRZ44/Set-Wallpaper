package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class aqa
  extends aiz
  implements apy
{
  aqa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
  }
  
  public final long b()
  {
    Parcel localParcel = a(1, i_());
    long l = localParcel.readLong();
    localParcel.recycle();
    return l;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqa
 * JD-Core Version:    0.7.0.1
 */