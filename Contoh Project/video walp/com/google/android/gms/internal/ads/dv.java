package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class dv
  extends aiz
  implements dt
{
  dv(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
  }
  
  public final void a(zzaej paramzzaej)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzaej);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.dv
 * JD-Core Version:    0.7.0.1
 */