package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import javax.annotation.Nullable;

public final class ConnectionEvent
  extends StatsEvent
{
  public static final Parcelable.Creator<ConnectionEvent> CREATOR = new a();
  private final int a;
  private final long b;
  private int c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final long j;
  private final long k;
  private long l;
  
  ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.l = -1L;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramLong2;
    this.k = paramLong3;
  }
  
  public final long a()
  {
    return this.b;
  }
  
  public final int b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final String d()
  {
    return this.e;
  }
  
  public final String e()
  {
    return this.f;
  }
  
  public final String f()
  {
    return this.g;
  }
  
  @Nullable
  public final String g()
  {
    return this.h;
  }
  
  public final String h()
  {
    return this.i;
  }
  
  public final long i()
  {
    return this.l;
  }
  
  public final long j()
  {
    return this.k;
  }
  
  public final long k()
  {
    return this.j;
  }
  
  public final long l()
  {
    return 0L;
  }
  
  public final String m()
  {
    String str1 = c();
    String str2 = d();
    String str3 = e();
    String str4 = f();
    if (this.h == null) {}
    for (String str5 = "";; str5 = this.h)
    {
      long l1 = j();
      return 26 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "\t" + str1 + "/" + str2 + "\t" + str3 + "/" + str4 + "\t" + str5 + "\t" + l1;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, a());
    b.a(paramParcel, 4, c(), false);
    b.a(paramParcel, 5, d(), false);
    b.a(paramParcel, 6, e(), false);
    b.a(paramParcel, 7, f(), false);
    b.a(paramParcel, 8, g(), false);
    b.a(paramParcel, 10, k());
    b.a(paramParcel, 11, j());
    b.a(paramParcel, 12, b());
    b.a(paramParcel, 13, h(), false);
    b.a(paramParcel, m);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.ConnectionEvent
 * JD-Core Version:    0.7.0.1
 */