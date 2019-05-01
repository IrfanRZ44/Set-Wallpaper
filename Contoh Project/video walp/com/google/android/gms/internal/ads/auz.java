package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class auz
  extends aiz
  implements aux
{
  auz(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
  }
  
  public final void a()
  {
    b(2, i_());
  }
  
  public final void a(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(1, localParcel);
  }
  
  public final void b(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(3, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.auz
 * JD-Core Version:    0.7.0.1
 */