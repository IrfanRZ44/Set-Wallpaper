package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class a
  implements Parcelable.Creator<ConnectionEvent>
{
  public ConnectionEvent a(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int j = 0;
    long l1 = 0L;
    int k = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    long l2 = 0L;
    long l3 = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(m))
      {
      case 3: 
      case 9: 
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 2: 
        l1 = com.google.android.gms.common.internal.safeparcel.a.e(paramParcel, m);
        break;
      case 4: 
        str1 = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 5: 
        str2 = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 6: 
        str3 = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 7: 
        str4 = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 8: 
        str5 = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 10: 
        l2 = com.google.android.gms.common.internal.safeparcel.a.e(paramParcel, m);
        break;
      case 11: 
        l3 = com.google.android.gms.common.internal.safeparcel.a.e(paramParcel, m);
        break;
      case 12: 
        k = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 13: 
        str6 = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
      }
    }
    com.google.android.gms.common.internal.safeparcel.a.n(paramParcel, i);
    return new ConnectionEvent(j, l1, k, str1, str2, str3, str4, str5, str6, l2, l3);
  }
  
  public ConnectionEvent[] a(int paramInt)
  {
    return new ConnectionEvent[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.a
 * JD-Core Version:    0.7.0.1
 */