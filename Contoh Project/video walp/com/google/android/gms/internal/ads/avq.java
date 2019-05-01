package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class avq
  extends aiz
  implements avo
{
  avq(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
  }
  
  public final void a(avc paramavc)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramavc);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avq
 * JD-Core Version:    0.7.0.1
 */