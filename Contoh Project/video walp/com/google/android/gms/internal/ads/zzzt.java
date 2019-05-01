package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzzt
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzzt> CREATOR = new bes();
  private final int a;
  private final int b;
  private final int c;
  
  zzzt(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public static zzzt a(sv paramsv)
  {
    return new zzzt(paramsv.a, paramsv.b, paramsv.c);
  }
  
  public final String toString()
  {
    int i = this.a;
    int j = this.b;
    int k = this.c;
    return 35 + i + "." + j + "." + k;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, this.b);
    b.a(paramParcel, 3, this.c);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzzt
 * JD-Core Version:    0.7.0.1
 */