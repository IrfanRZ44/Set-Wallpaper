package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b
  implements Parcelable.Creator<ConnectionResult>
{
  public ConnectionResult a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    PendingIntent localPendingIntent = null;
    int j = 0;
    int k = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        k = a.d(paramParcel, m);
        break;
      case 2: 
        j = a.d(paramParcel, m);
        break;
      case 3: 
        localPendingIntent = (PendingIntent)a.a(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 4: 
        str = a.g(paramParcel, m);
      }
    }
    a.n(paramParcel, i);
    return new ConnectionResult(k, j, localPendingIntent, str);
  }
  
  public ConnectionResult[] a(int paramInt)
  {
    return new ConnectionResult[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.b
 * JD-Core Version:    0.7.0.1
 */