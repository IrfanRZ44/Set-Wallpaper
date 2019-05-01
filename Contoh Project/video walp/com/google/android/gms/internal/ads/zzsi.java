package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public final class zzsi
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzsi> CREATOR = new axb();
  public final boolean a;
  public final String b;
  public final int c;
  public final byte[] d;
  public final String[] e;
  public final String[] f;
  public final boolean g;
  public final long h;
  
  zzsi(boolean paramBoolean1, String paramString, int paramInt, byte[] paramArrayOfByte, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean2, long paramLong)
  {
    this.a = paramBoolean1;
    this.b = paramString;
    this.c = paramInt;
    this.d = paramArrayOfByte;
    this.e = paramArrayOfString1;
    this.f = paramArrayOfString2;
    this.g = paramBoolean2;
    this.h = paramLong;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, this.b, false);
    b.a(paramParcel, 3, this.c);
    b.a(paramParcel, 4, this.d, false);
    b.a(paramParcel, 5, this.e, false);
    b.a(paramParcel, 6, this.f, false);
    b.a(paramParcel, 7, this.g);
    b.a(paramParcel, 8, this.h);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzsi
 * JD-Core Version:    0.7.0.1
 */