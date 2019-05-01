package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class afe
{
  final int a;
  final byte[] b;
  
  afe(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    afe localafe;
    do
    {
      return true;
      if (!(paramObject instanceof afe)) {
        return false;
      }
      localafe = (afe)paramObject;
    } while ((this.a == localafe.a) && (Arrays.equals(this.b, localafe.b)));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (527 + this.a) + Arrays.hashCode(this.b);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afe
 * JD-Core Version:    0.7.0.1
 */