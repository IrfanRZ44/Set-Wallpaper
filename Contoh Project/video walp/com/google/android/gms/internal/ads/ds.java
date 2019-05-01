package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class ds
  extends aiz
  implements dq
{
  ds(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  public final zzaej a(zzaef paramzzaef)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramzzaef);
    Parcel localParcel2 = a(1, localParcel1);
    zzaej localzzaej = (zzaej)ajb.a(localParcel2, zzaej.CREATOR);
    localParcel2.recycle();
    return localzzaej;
  }
  
  public final void a(zzaef paramzzaef, dt paramdt)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzaef);
    ajb.a(localParcel, paramdt);
    b(2, localParcel);
  }
  
  public final void a(zzaey paramzzaey, dw paramdw)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzaey);
    ajb.a(localParcel, paramdw);
    b(4, localParcel);
  }
  
  public final void b(zzaey paramzzaey, dw paramdw)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzaey);
    ajb.a(localParcel, paramdw);
    b(5, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ds
 * JD-Core Version:    0.7.0.1
 */