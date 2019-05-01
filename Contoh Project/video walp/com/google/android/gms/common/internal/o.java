package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class o
  implements Parcelable.Creator<ValidateAccountRequest>
{
  public ValidateAccountRequest a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        j = a.d(paramParcel, k);
      }
    }
    a.n(paramParcel, i);
    return new ValidateAccountRequest(j);
  }
  
  public ValidateAccountRequest[] a(int paramInt)
  {
    return new ValidateAccountRequest[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.o
 * JD-Core Version:    0.7.0.1
 */