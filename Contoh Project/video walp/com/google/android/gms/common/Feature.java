package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.m.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public class Feature
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Feature> CREATOR = new c();
  private final String a;
  @Deprecated
  private final int b;
  private final long c;
  
  public Feature(String paramString, int paramInt, long paramLong)
  {
    this.a = paramString;
    this.b = paramInt;
    this.c = paramLong;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public long b()
  {
    if (this.c == -1L) {
      return this.b;
    }
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Feature;
    boolean bool2 = false;
    if (bool1)
    {
      Feature localFeature = (Feature)paramObject;
      if ((a() == null) || (!a().equals(localFeature.a())))
      {
        String str1 = a();
        bool2 = false;
        if (str1 == null)
        {
          String str2 = localFeature.a();
          bool2 = false;
          if (str2 != null) {}
        }
      }
      else
      {
        boolean bool3 = b() < localFeature.b();
        bool2 = false;
        if (!bool3) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = a();
    arrayOfObject[1] = Long.valueOf(b());
    return m.a(arrayOfObject);
  }
  
  public String toString()
  {
    return m.a(this).a("name", a()).a("version", Long.valueOf(b())).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, a(), false);
    b.a(paramParcel, 2, this.b);
    b.a(paramParcel, 3, b());
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.Feature
 * JD-Core Version:    0.7.0.1
 */