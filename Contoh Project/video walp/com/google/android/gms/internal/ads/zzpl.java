package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public final class zzpl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzpl> CREATOR = new aud();
  public final int a;
  public final boolean b;
  public final int c;
  public final boolean d;
  public final int e;
  public final zzmu f;
  
  public zzpl(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3, zzmu paramzzmu)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramInt2;
    this.d = paramBoolean2;
    this.e = paramInt3;
    this.f = paramzzmu;
  }
  
  public zzpl(NativeAdOptions paramNativeAdOptions) {}
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, this.b);
    b.a(paramParcel, 3, this.c);
    b.a(paramParcel, 4, this.d);
    b.a(paramParcel, 5, this.e);
    b.a(paramParcel, 6, this.f, paramInt, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzpl
 * JD-Core Version:    0.7.0.1
 */