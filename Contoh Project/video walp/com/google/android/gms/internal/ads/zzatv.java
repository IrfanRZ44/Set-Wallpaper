package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class zzatv
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzatv> CREATOR = new td();
  private final int a;
  private zo b;
  private byte[] c;
  
  zzatv(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = null;
    this.c = paramArrayOfByte;
    b();
  }
  
  private final void b()
  {
    if ((this.b == null) && (this.c != null)) {}
    while ((this.b != null) && (this.c == null)) {
      return;
    }
    if ((this.b != null) && (this.c != null)) {
      throw new IllegalStateException("Invalid internal representation - full");
    }
    if ((this.b == null) && (this.c == null)) {
      throw new IllegalStateException("Invalid internal representation - empty");
    }
    throw new IllegalStateException("Impossible");
  }
  
  public final zo a()
  {
    if (this.b != null) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {}
      try
      {
        byte[] arrayOfByte = this.c;
        this.b = ((zo)afc.a(new zo(), arrayOfByte));
        this.c = null;
        b();
        return this.b;
      }
      catch (afb localafb)
      {
        throw new IllegalStateException(localafb);
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    if (this.c != null) {}
    for (byte[] arrayOfByte = this.c;; arrayOfByte = afc.a(this.b))
    {
      b.a(paramParcel, 2, arrayOfByte, false);
      b.a(paramParcel, i);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzatv
 * JD-Core Version:    0.7.0.1
 */