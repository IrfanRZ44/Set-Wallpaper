package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class awd
  extends aiz
  implements awb
{
  awd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
  }
  
  public final void a(apj paramapj, a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramapj);
    ajb.a(localParcel, parama);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awd
 * JD-Core Version:    0.7.0.1
 */