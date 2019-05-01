package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class amg
  extends aiz
  implements amf
{
  amg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
  }
  
  public final zzhi a(zzhl paramzzhl)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramzzhl);
    Parcel localParcel2 = a(1, localParcel1);
    zzhi localzzhi = (zzhi)ajb.a(localParcel2, zzhi.CREATOR);
    localParcel2.recycle();
    return localzzhi;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amg
 * JD-Core Version:    0.7.0.1
 */