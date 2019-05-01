package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class bek
  extends aiz
  implements bei
{
  bek(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public final zzzt a()
  {
    Parcel localParcel = a(2, i_());
    zzzt localzzzt = (zzzt)ajb.a(localParcel, zzzt.CREATOR);
    localParcel.recycle();
    return localzzzt;
  }
  
  public final void a(a parama, String paramString, Bundle paramBundle, bel parambel)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    localParcel.writeString(paramString);
    ajb.a(localParcel, paramBundle);
    ajb.a(localParcel, parambel);
    b(1, localParcel);
  }
  
  public final void a(byte[] paramArrayOfByte, String paramString, Bundle paramBundle, a parama, bee parambee, bcq parambcq, zzjn paramzzjn)
  {
    Parcel localParcel = i_();
    localParcel.writeByteArray(paramArrayOfByte);
    localParcel.writeString(paramString);
    ajb.a(localParcel, paramBundle);
    ajb.a(localParcel, parama);
    ajb.a(localParcel, parambee);
    ajb.a(localParcel, parambcq);
    ajb.a(localParcel, paramzzjn);
    b(4, localParcel);
  }
  
  public final void a(byte[] paramArrayOfByte, String paramString, Bundle paramBundle, a parama, beg parambeg, bcq parambcq)
  {
    Parcel localParcel = i_();
    localParcel.writeByteArray(paramArrayOfByte);
    localParcel.writeString(paramString);
    ajb.a(localParcel, paramBundle);
    ajb.a(localParcel, parama);
    ajb.a(localParcel, parambeg);
    ajb.a(localParcel, parambcq);
    b(6, localParcel);
  }
  
  public final zzzt b()
  {
    Parcel localParcel = a(3, i_());
    zzzt localzzzt = (zzzt)ajb.a(localParcel, zzzt.CREATOR);
    localParcel.recycle();
    return localzzzt;
  }
  
  public final aqg c()
  {
    Parcel localParcel = a(5, i_());
    aqg localaqg = aqh.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localaqg;
  }
  
  public final void d()
  {
    b(7, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bek
 * JD-Core Version:    0.7.0.1
 */