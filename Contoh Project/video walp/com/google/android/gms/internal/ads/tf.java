package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class tf
  extends aiz
  implements te
{
  tf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.gass.internal.IGassService");
  }
  
  public final zzatv a(zzatt paramzzatt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramzzatt);
    Parcel localParcel2 = a(1, localParcel1);
    zzatv localzzatv = (zzatv)ajb.a(localParcel2, zzatv.CREATOR);
    localParcel2.recycle();
    return localzzatv;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tf
 * JD-Core Version:    0.7.0.1
 */