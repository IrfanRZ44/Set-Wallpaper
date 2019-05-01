package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class awj
  extends aiz
  implements awh
{
  awj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
  }
  
  public final void a()
  {
    b(2, i_());
  }
  
  public final void a(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(1, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awj
 * JD-Core Version:    0.7.0.1
 */