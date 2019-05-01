package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bef
  extends aiz
  implements bee
{
  bef(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
  }
  
  public final void a(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(2, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bef
 * JD-Core Version:    0.7.0.1
 */