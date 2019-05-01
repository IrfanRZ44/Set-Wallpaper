package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public final class axd
  extends aiz
  implements axc
{
  axd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
  }
  
  public final ParcelFileDescriptor a(zzsg paramzzsg)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramzzsg);
    Parcel localParcel2 = a(1, localParcel1);
    ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)ajb.a(localParcel2, ParcelFileDescriptor.CREATOR);
    localParcel2.recycle();
    return localParcelFileDescriptor;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.axd
 * JD-Core Version:    0.7.0.1
 */