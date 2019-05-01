package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;
import javax.annotation.Nullable;

public final class WakeLockEvent
  extends StatsEvent
{
  public static final Parcelable.Creator<WakeLockEvent> CREATOR = new c();
  private final int a;
  private final long b;
  private int c;
  private final String d;
  private final String e;
  private final String f;
  private final int g;
  private final List<String> h;
  private final String i;
  private final long j;
  private int k;
  private final String l;
  private final float m;
  private final long n;
  private long o;
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, List<String> paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat, long paramLong3, String paramString5)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramInt2;
    this.d = paramString1;
    this.e = paramString3;
    this.f = paramString5;
    this.g = paramInt3;
    this.o = -1L;
    this.h = paramList;
    this.i = paramString2;
    this.j = paramLong2;
    this.k = paramInt4;
    this.l = paramString4;
    this.m = paramFloat;
    this.n = paramLong3;
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
  
  public final int f()
  {
    return this.g;
  }
  
  @Nullable
  public final List<String> g()
  {
    return this.h;
  }
  
  public final String h()
  {
    return this.i;
  }
  
  public final long i()
  {
    return this.o;
  }
  
  public final int j()
  {
    return this.k;
  }
  
  public final long k()
  {
    return this.j;
  }
  
  public final long l()
  {
    return this.n;
  }
  
  public final String m()
  {
    String str1 = c();
    int i1 = f();
    String str2;
    int i2;
    String str3;
    label37:
    String str4;
    label48:
    float f1;
    if (g() == null)
    {
      str2 = "";
      i2 = j();
      if (d() != null) {
        break label211;
      }
      str3 = "";
      if (n() != null) {
        break label220;
      }
      str4 = "";
      f1 = o();
      if (e() != null) {
        break label229;
      }
    }
    label211:
    label220:
    label229:
    for (String str5 = "";; str5 = e())
    {
      return 45 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "\t" + str1 + "\t" + i1 + "\t" + str2 + "\t" + i2 + "\t" + str3 + "\t" + str4 + "\t" + f1 + "\t" + str5;
      str2 = TextUtils.join(",", g());
      break;
      str3 = d();
      break label37;
      str4 = n();
      break label48;
    }
  }
  
  public final String n()
  {
    return this.l;
  }
  
  public final float o()
  {
    return this.m;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, a());
    b.a(paramParcel, 4, c(), false);
    b.a(paramParcel, 5, f());
    b.b(paramParcel, 6, g(), false);
    b.a(paramParcel, 8, k());
    b.a(paramParcel, 10, d(), false);
    b.a(paramParcel, 11, b());
    b.a(paramParcel, 12, h(), false);
    b.a(paramParcel, 13, n(), false);
    b.a(paramParcel, 14, j());
    b.a(paramParcel, 15, o());
    b.a(paramParcel, 16, l());
    b.a(paramParcel, 17, e(), false);
    b.a(paramParcel, i1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.WakeLockEvent
 * JD-Core Version:    0.7.0.1
 */