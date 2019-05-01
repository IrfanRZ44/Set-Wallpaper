package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public final class zzms
  extends zzjn
{
  public zzms(zzjn paramzzjn)
  {
    super(paramzzjn.a, paramzzjn.b, paramzzjn.c, paramzzjn.d, paramzzjn.e, paramzzjn.f, paramzzjn.g, paramzzjn.h, paramzzjn.i, paramzzjn.j);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.b);
    b.a(paramParcel, 6, this.e);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzms
 * JD-Core Version:    0.7.0.1
 */