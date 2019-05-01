package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.m.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class Status
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new c();
  public static final Status a = new Status(0);
  public static final Status b = new Status(14);
  public static final Status c = new Status(8);
  public static final Status d = new Status(15);
  public static final Status e = new Status(16);
  public static final Status f;
  private static final Status g = new Status(17);
  private final int h;
  private final int i;
  private final String j;
  private final PendingIntent k;
  
  static
  {
    f = new Status(18);
  }
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramString;
    this.k = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public final String a()
  {
    return this.j;
  }
  
  public final int b()
  {
    return this.i;
  }
  
  public final String c()
  {
    if (this.j != null) {
      return this.j;
    }
    return a.a(this.i);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    Status localStatus;
    do
    {
      return false;
      localStatus = (Status)paramObject;
    } while ((this.h != localStatus.h) || (this.i != localStatus.i) || (!m.a(this.j, localStatus.j)) || (!m.a(this.k, localStatus.k)));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.h);
    arrayOfObject[1] = Integer.valueOf(this.i);
    arrayOfObject[2] = this.j;
    arrayOfObject[3] = this.k;
    return m.a(arrayOfObject);
  }
  
  public final String toString()
  {
    return m.a(this).a("statusCode", c()).a("resolution", this.k).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = b.a(paramParcel);
    b.a(paramParcel, 1, b());
    b.a(paramParcel, 2, a(), false);
    b.a(paramParcel, 3, this.k, paramInt, false);
    b.a(paramParcel, 1000, this.h);
    b.a(paramParcel, m);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Status
 * JD-Core Version:    0.7.0.1
 */