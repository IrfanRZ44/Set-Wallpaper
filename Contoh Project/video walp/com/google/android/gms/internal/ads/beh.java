package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class beh
  extends aiz
  implements beg
{
  beh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
  }
  
  public final void a(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(3, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.beh
 * JD-Core Version:    0.7.0.1
 */