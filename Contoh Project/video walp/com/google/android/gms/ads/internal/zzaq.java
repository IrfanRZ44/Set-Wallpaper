package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ads.cm;

@cm
public final class zzaq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
  private final String a;
  public final boolean zzze;
  public final boolean zzzf;
  public final boolean zzzh;
  public final float zzzi;
  public final int zzzj;
  public final boolean zzzk;
  public final boolean zzzl;
  public final boolean zzzm;
  
  zzaq(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.zzze = paramBoolean1;
    this.zzzf = paramBoolean2;
    this.a = paramString;
    this.zzzh = paramBoolean3;
    this.zzzi = paramFloat;
    this.zzzj = paramInt;
    this.zzzk = paramBoolean4;
    this.zzzl = paramBoolean5;
    this.zzzm = paramBoolean6;
  }
  
  public zzaq(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this(paramBoolean1, paramBoolean2, null, paramBoolean3, paramFloat, paramInt, paramBoolean4, paramBoolean5, paramBoolean6);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.zzze);
    b.a(paramParcel, 3, this.zzzf);
    b.a(paramParcel, 4, this.a, false);
    b.a(paramParcel, 5, this.zzzh);
    b.a(paramParcel, 6, this.zzzi);
    b.a(paramParcel, 7, this.zzzj);
    b.a(paramParcel, 8, this.zzzk);
    b.a(paramParcel, 9, this.zzzl);
    b.a(paramParcel, 10, this.zzzm);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzaq
 * JD-Core Version:    0.7.0.1
 */