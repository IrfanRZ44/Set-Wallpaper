package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class ga
  extends aiz
  implements fz
{
  ga(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
  }
  
  public final void a(fw paramfw, String paramString)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramfw);
    localParcel.writeString(paramString);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ga
 * JD-Core Version:    0.7.0.1
 */