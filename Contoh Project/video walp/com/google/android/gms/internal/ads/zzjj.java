package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

@cm
public final class zzjj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzjj> CREATOR = new aod();
  public final int a;
  public final long b;
  public final Bundle c;
  public final int d;
  public final List<String> e;
  public final boolean f;
  public final int g;
  public final boolean h;
  public final String i;
  public final zzmq j;
  public final Location k;
  public final String l;
  public final Bundle m;
  public final Bundle n;
  public final List<String> o;
  public final String p;
  public final String q;
  public final boolean r;
  
  public zzjj(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List<String> paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, zzmq paramzzmq, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List<String> paramList2, String paramString3, String paramString4, boolean paramBoolean3)
  {
    this.a = paramInt1;
    this.b = paramLong;
    if (paramBundle1 == null) {
      paramBundle1 = new Bundle();
    }
    this.c = paramBundle1;
    this.d = paramInt2;
    this.e = paramList1;
    this.f = paramBoolean1;
    this.g = paramInt3;
    this.h = paramBoolean2;
    this.i = paramString1;
    this.j = paramzzmq;
    this.k = paramLocation;
    this.l = paramString2;
    if (paramBundle2 == null) {
      paramBundle2 = new Bundle();
    }
    this.m = paramBundle2;
    this.n = paramBundle3;
    this.o = paramList2;
    this.p = paramString3;
    this.q = paramString4;
    this.r = paramBoolean3;
  }
  
  public final zzjj a()
  {
    Bundle localBundle = this.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    if (localBundle == null)
    {
      localBundle = this.c;
      this.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", this.c);
    }
    return new zzjj(this.a, this.b, localBundle, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzjj)) {}
    zzjj localzzjj;
    do
    {
      return false;
      localzzjj = (zzjj)paramObject;
    } while ((this.a != localzzjj.a) || (this.b != localzzjj.b) || (!m.a(this.c, localzzjj.c)) || (this.d != localzzjj.d) || (!m.a(this.e, localzzjj.e)) || (this.f != localzzjj.f) || (this.g != localzzjj.g) || (this.h != localzzjj.h) || (!m.a(this.i, localzzjj.i)) || (!m.a(this.j, localzzjj.j)) || (!m.a(this.k, localzzjj.k)) || (!m.a(this.l, localzzjj.l)) || (!m.a(this.m, localzzjj.m)) || (!m.a(this.n, localzzjj.n)) || (!m.a(this.o, localzzjj.o)) || (!m.a(this.p, localzzjj.p)) || (!m.a(this.q, localzzjj.q)) || (this.r != localzzjj.r));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[18];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.b);
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = Integer.valueOf(this.d);
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = Boolean.valueOf(this.f);
    arrayOfObject[6] = Integer.valueOf(this.g);
    arrayOfObject[7] = Boolean.valueOf(this.h);
    arrayOfObject[8] = this.i;
    arrayOfObject[9] = this.j;
    arrayOfObject[10] = this.k;
    arrayOfObject[11] = this.l;
    arrayOfObject[12] = this.m;
    arrayOfObject[13] = this.n;
    arrayOfObject[14] = this.o;
    arrayOfObject[15] = this.p;
    arrayOfObject[16] = this.q;
    arrayOfObject[17] = Boolean.valueOf(this.r);
    return m.a(arrayOfObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, this.b);
    b.a(paramParcel, 3, this.c, false);
    b.a(paramParcel, 4, this.d);
    b.b(paramParcel, 5, this.e, false);
    b.a(paramParcel, 6, this.f);
    b.a(paramParcel, 7, this.g);
    b.a(paramParcel, 8, this.h);
    b.a(paramParcel, 9, this.i, false);
    b.a(paramParcel, 10, this.j, paramInt, false);
    b.a(paramParcel, 11, this.k, paramInt, false);
    b.a(paramParcel, 12, this.l, false);
    b.a(paramParcel, 13, this.m, false);
    b.a(paramParcel, 14, this.n, false);
    b.b(paramParcel, 15, this.o, false);
    b.a(paramParcel, 16, this.p, false);
    b.a(paramParcel, 17, this.q, false);
    b.a(paramParcel, 18, this.r);
    b.a(paramParcel, i1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzjj
 * JD-Core Version:    0.7.0.1
 */