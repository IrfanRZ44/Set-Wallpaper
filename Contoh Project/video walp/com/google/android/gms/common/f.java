package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class f
  implements Parcelable.Creator<GoogleCertificatesQuery>
{
  public GoogleCertificatesQuery a(Parcel paramParcel)
  {
    IBinder localIBinder = null;
    int i = a.b(paramParcel);
    boolean bool = false;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = a.a(paramParcel);
      switch (a.a(j))
      {
      default: 
        a.b(paramParcel, j);
        break;
      case 1: 
        str = a.g(paramParcel, j);
        break;
      case 2: 
        localIBinder = a.h(paramParcel, j);
        break;
      case 3: 
        bool = a.c(paramParcel, j);
      }
    }
    a.n(paramParcel, i);
    return new GoogleCertificatesQuery(str, localIBinder, bool);
  }
  
  public GoogleCertificatesQuery[] a(int paramInt)
  {
    return new GoogleCertificatesQuery[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.f
 * JD-Core Version:    0.7.0.1
 */