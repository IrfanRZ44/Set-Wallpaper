package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public final class zzahk
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzahk> CREATOR = new gn();
  public final zzjj a;
  public final String b;
  
  public zzahk(zzjj paramzzjj, String paramString)
  {
    this.a = paramzzjj;
    this.b = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, paramInt, false);
    b.a(paramParcel, 3, this.b, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzahk
 * JD-Core Version:    0.7.0.1
 */