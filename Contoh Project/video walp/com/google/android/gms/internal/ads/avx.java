package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class avx
  extends aiz
  implements avv
{
  avx(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
  }
  
  public final void a(avk paramavk, String paramString)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramavk);
    localParcel.writeString(paramString);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avx
 * JD-Core Version:    0.7.0.1
 */