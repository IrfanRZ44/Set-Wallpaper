package com.google.android.gms.internal.a;

import android.os.IBinder;
import android.os.Parcel;

public final class g
  extends a
  implements e
{
  g(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
  }
  
  public final String a()
  {
    Parcel localParcel = a(1, j_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final boolean a(boolean paramBoolean)
  {
    Parcel localParcel1 = j_();
    c.a(localParcel1, true);
    Parcel localParcel2 = a(2, localParcel1);
    boolean bool = c.a(localParcel2);
    localParcel2.recycle();
    return bool;
  }
  
  public final boolean b()
  {
    Parcel localParcel = a(6, j_());
    boolean bool = c.a(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.a.g
 * JD-Core Version:    0.7.0.1
 */