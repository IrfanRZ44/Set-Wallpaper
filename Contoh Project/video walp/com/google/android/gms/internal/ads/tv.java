package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class tv<P>
{
  private final P a;
  private final byte[] b;
  private final ww c;
  private final xp d;
  
  public tv(P paramP, byte[] paramArrayOfByte, ww paramww, xp paramxp)
  {
    this.a = paramP;
    this.b = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
    this.c = paramww;
    this.d = paramxp;
  }
  
  public final P a()
  {
    return this.a;
  }
  
  public final byte[] b()
  {
    if (this.b == null) {
      return null;
    }
    return Arrays.copyOf(this.b, this.b.length);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tv
 * JD-Core Version:    0.7.0.1
 */