package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class v
  extends aiz
  implements u
{
  v(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
  }
  
  public final IBinder a(a parama)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    Parcel localParcel2 = a(1, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    localParcel2.recycle();
    return localIBinder;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.v
 * JD-Core Version:    0.7.0.1
 */