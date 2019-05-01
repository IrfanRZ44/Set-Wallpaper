package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class apu
  extends aiz
  implements aps
{
  apu(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apu
 * JD-Core Version:    0.7.0.1
 */