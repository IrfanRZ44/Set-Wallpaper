package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class nf
  extends FilterInputStream
{
  private final long a;
  private long b;
  
  nf(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.a = paramLong;
  }
  
  final long a()
  {
    return this.a - this.b;
  }
  
  public final int read()
  {
    int i = super.read();
    if (i != -1) {
      this.b = (1L + this.b);
    }
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (i != -1) {
      this.b += i;
    }
    return i;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.nf
 * JD-Core Version:    0.7.0.1
 */