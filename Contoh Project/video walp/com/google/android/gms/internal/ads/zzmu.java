package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

@cm
public final class zzmu
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzmu> CREATOR = new ark();
  public final boolean a;
  public final boolean b;
  public final boolean c;
  
  public zzmu(VideoOptions paramVideoOptions)
  {
    this(paramVideoOptions.getStartMuted(), paramVideoOptions.getCustomControlsRequested(), paramVideoOptions.getClickToExpandRequested());
  }
  
  public zzmu(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a);
    b.a(paramParcel, 3, this.b);
    b.a(paramParcel, 4, this.c);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzmu
 * JD-Core Version:    0.7.0.1
 */