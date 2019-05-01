package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class aqf
  extends aiz
  implements aqe
{
  aqf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
  }
  
  public final IBinder a(a parama, int paramInt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    localParcel1.writeInt(12451000);
    Parcel localParcel2 = a(1, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    localParcel2.recycle();
    return localIBinder;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqf
 * JD-Core Version:    0.7.0.1
 */