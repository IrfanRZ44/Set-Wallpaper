package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class bcm
  extends aiz
  implements bck
{
  bcm(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public final bcn a(String paramString)
  {
    Parcel localParcel1 = i_();
    localParcel1.writeString(paramString);
    Parcel localParcel2 = a(1, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if ((localIInterface instanceof bcn)) {
        localObject = (bcn)localIInterface;
      } else {
        localObject = new bcp(localIBinder);
      }
    }
  }
  
  public final boolean b(String paramString)
  {
    Parcel localParcel1 = i_();
    localParcel1.writeString(paramString);
    Parcel localParcel2 = a(2, localParcel1);
    boolean bool = ajb.a(localParcel2);
    localParcel2.recycle();
    return bool;
  }
  
  public final bei c(String paramString)
  {
    Parcel localParcel1 = i_();
    localParcel1.writeString(paramString);
    Parcel localParcel2 = a(3, localParcel1);
    bei localbei = bej.a(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return localbei;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcm
 * JD-Core Version:    0.7.0.1
 */