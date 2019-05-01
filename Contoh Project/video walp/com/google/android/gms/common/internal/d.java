package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.a;

public class d
  implements Parcelable.Creator<ConnectionInfo>
{
  public ConnectionInfo a(Parcel paramParcel)
  {
    Feature[] arrayOfFeature = null;
    int i = a.b(paramParcel);
    Bundle localBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = a.a(paramParcel);
      switch (a.a(j))
      {
      default: 
        a.b(paramParcel, j);
        break;
      case 1: 
        localBundle = a.i(paramParcel, j);
        break;
      case 2: 
        arrayOfFeature = (Feature[])a.b(paramParcel, j, Feature.CREATOR);
      }
    }
    a.n(paramParcel, i);
    return new ConnectionInfo(localBundle, arrayOfFeature);
  }
  
  public ConnectionInfo[] a(int paramInt)
  {
    return new ConnectionInfo[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.d
 * JD-Core Version:    0.7.0.1
 */