package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class apn
  extends aiz
  implements apm
{
  apn(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
  }
  
  public final IBinder a(a parama, zzjn paramzzjn, String paramString, bck parambck, int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    ajb.a(localParcel1, paramzzjn);
    localParcel1.writeString(paramString);
    ajb.a(localParcel1, parambck);
    localParcel1.writeInt(12451000);
    localParcel1.writeInt(paramInt2);
    Parcel localParcel2 = a(2, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    localParcel2.recycle();
    return localIBinder;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apn
 * JD-Core Version:    0.7.0.1
 */