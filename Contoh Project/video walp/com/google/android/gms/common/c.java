package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class c
  implements Parcelable.Creator<Feature>
{
  public Feature a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    String str = null;
    int j = 0;
    long l = -1L;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str = a.g(paramParcel, k);
        break;
      case 2: 
        j = a.d(paramParcel, k);
        break;
      case 3: 
        l = a.e(paramParcel, k);
      }
    }
    a.n(paramParcel, i);
    return new Feature(str, j, l);
  }
  
  public Feature[] a(int paramInt)
  {
    return new Feature[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.c
 * JD-Core Version:    0.7.0.1
 */