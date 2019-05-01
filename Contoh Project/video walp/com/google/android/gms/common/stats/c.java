package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

public class c
  implements Parcelable.Creator<WakeLockEvent>
{
  public WakeLockEvent a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    long l1 = 0L;
    int k = 0;
    String str1 = null;
    int m = 0;
    ArrayList localArrayList = null;
    String str2 = null;
    long l2 = 0L;
    int n = 0;
    String str3 = null;
    String str4 = null;
    float f = 0.0F;
    long l3 = 0L;
    String str5 = null;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      case 3: 
      case 7: 
      case 9: 
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        j = a.d(paramParcel, i1);
        break;
      case 2: 
        l1 = a.e(paramParcel, i1);
        break;
      case 4: 
        str1 = a.g(paramParcel, i1);
        break;
      case 5: 
        m = a.d(paramParcel, i1);
        break;
      case 6: 
        localArrayList = a.m(paramParcel, i1);
        break;
      case 8: 
        l2 = a.e(paramParcel, i1);
        break;
      case 10: 
        str3 = a.g(paramParcel, i1);
        break;
      case 11: 
        k = a.d(paramParcel, i1);
        break;
      case 12: 
        str2 = a.g(paramParcel, i1);
        break;
      case 13: 
        str4 = a.g(paramParcel, i1);
        break;
      case 14: 
        n = a.d(paramParcel, i1);
        break;
      case 15: 
        f = a.f(paramParcel, i1);
        break;
      case 16: 
        l3 = a.e(paramParcel, i1);
        break;
      case 17: 
        str5 = a.g(paramParcel, i1);
      }
    }
    a.n(paramParcel, i);
    return new WakeLockEvent(j, l1, k, str1, m, localArrayList, str2, l2, n, str3, str4, f, l3, str5);
  }
  
  public WakeLockEvent[] a(int paramInt)
  {
    return new WakeLockEvent[paramInt];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.c
 * JD-Core Version:    0.7.0.1
 */