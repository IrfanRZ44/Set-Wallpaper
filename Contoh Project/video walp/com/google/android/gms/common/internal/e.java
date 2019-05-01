package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;

public class e
  implements Parcelable.Creator<GetServiceRequest>
{
  public GetServiceRequest a(Parcel paramParcel)
  {
    boolean bool = false;
    Feature[] arrayOfFeature1 = null;
    int i = a.b(paramParcel);
    Feature[] arrayOfFeature2 = null;
    Account localAccount = null;
    Bundle localBundle = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
    String str = null;
    int j = 0;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      case 9: 
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        m = a.d(paramParcel, n);
        break;
      case 2: 
        k = a.d(paramParcel, n);
        break;
      case 3: 
        j = a.d(paramParcel, n);
        break;
      case 4: 
        str = a.g(paramParcel, n);
        break;
      case 5: 
        localIBinder = a.h(paramParcel, n);
        break;
      case 6: 
        arrayOfScope = (Scope[])a.b(paramParcel, n, Scope.CREATOR);
        break;
      case 7: 
        localBundle = a.i(paramParcel, n);
        break;
      case 8: 
        localAccount = (Account)a.a(paramParcel, n, Account.CREATOR);
        break;
      case 10: 
        arrayOfFeature2 = (Feature[])a.b(paramParcel, n, Feature.CREATOR);
        break;
      case 11: 
        arrayOfFeature1 = (Feature[])a.b(paramParcel, n, Feature.CREATOR);
        break;
      case 12: 
        bool = a.c(paramParcel, n);
      }
    }
    a.n(paramParcel, i);
    return new GetServiceRequest(m, k, j, str, localIBinder, arrayOfScope, localBundle, localAccount, arrayOfFeature2, arrayOfFeature1, bool);
  }
  
  public GetServiceRequest[] a(int paramInt)
  {
    return new GetServiceRequest[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e
 * JD-Core Version:    0.7.0.1
 */