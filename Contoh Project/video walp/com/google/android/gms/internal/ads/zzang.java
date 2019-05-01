package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public final class zzang
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzang> CREATOR = new mm();
  public String a;
  public int b;
  public int c;
  public boolean d;
  public boolean e;
  
  public zzang(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this(paramInt1, paramInt2, paramBoolean, false, false);
  }
  
  public zzang(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(12451000, paramInt2, true, false, paramBoolean2);
  }
  
  private zzang(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {}
  
  zzang(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public static zzang a()
  {
    return new zzang(12451009, 12451009, true);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.b);
    b.a(paramParcel, 4, this.c);
    b.a(paramParcel, 5, this.d);
    b.a(paramParcel, 6, this.e);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzang
 * JD-Core Version:    0.7.0.1
 */