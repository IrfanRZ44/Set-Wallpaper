package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public final class aup
  extends aiz
  implements aun
{
  aup(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public final a a()
  {
    Parcel localParcel = a(1, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final Uri b()
  {
    Parcel localParcel = a(2, i_());
    Uri localUri = (Uri)ajb.a(localParcel, Uri.CREATOR);
    localParcel.recycle();
    return localUri;
  }
  
  public final double c()
  {
    Parcel localParcel = a(3, i_());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aup
 * JD-Core Version:    0.7.0.1
 */