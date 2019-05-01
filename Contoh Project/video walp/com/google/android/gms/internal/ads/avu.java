package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class avu
  extends aiz
  implements avr
{
  avu(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
  }
  
  public final void a(avg paramavg)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramavg);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avu
 * JD-Core Version:    0.7.0.1
 */