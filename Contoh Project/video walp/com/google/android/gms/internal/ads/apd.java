package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class apd
  extends aiz
  implements apb
{
  apd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  public final String getMediationAdapterClassName()
  {
    Parcel localParcel = a(2, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final boolean isLoading()
  {
    Parcel localParcel = a(3, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void zza(zzjj paramzzjj, int paramInt)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzjj);
    localParcel.writeInt(paramInt);
    b(5, localParcel);
  }
  
  public final String zzck()
  {
    Parcel localParcel = a(4, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void zzd(zzjj paramzzjj)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzjj);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apd
 * JD-Core Version:    0.7.0.1
 */