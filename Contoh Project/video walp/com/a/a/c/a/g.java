package com.a.a.c.a;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class g
  extends FilterInputStream
{
  private static final byte[] a = { -1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0 };
  private static final int b = a.length;
  private static final int c = 2 + b;
  private final byte d;
  private int e;
  
  public g(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    if ((paramInt < -1) || (paramInt > 8)) {
      throw new IllegalArgumentException("Cannot add invalid orientation: " + paramInt);
    }
    this.d = ((byte)paramInt);
  }
  
  public void mark(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean markSupported()
  {
    return false;
  }
  
  public int read()
  {
    int i;
    if ((this.e < 2) || (this.e > c)) {
      i = super.read();
    }
    for (;;)
    {
      if (i != -1) {
        this.e = (1 + this.e);
      }
      return i;
      if (this.e == c) {
        i = this.d;
      } else {
        i = 0xFF & a[(-2 + this.e)];
      }
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i;
    if (this.e > c) {
      i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    }
    for (;;)
    {
      if (i > 0) {
        this.e = (i + this.e);
      }
      return i;
      if (this.e == c)
      {
        paramArrayOfByte[paramInt1] = this.d;
        i = 1;
      }
      else if (this.e < 2)
      {
        i = super.read(paramArrayOfByte, paramInt1, 2 - this.e);
      }
      else
      {
        i = Math.min(c - this.e, paramInt2);
        System.arraycopy(a, -2 + this.e, paramArrayOfByte, paramInt1, i);
      }
    }
  }
  
  public void reset()
  {
    throw new UnsupportedOperationException();
  }
  
  public long skip(long paramLong)
  {
    long l = super.skip(paramLong);
    if (l > 0L) {
      this.e = ((int)(l + this.e));
    }
    return l;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.g
 * JD-Core Version:    0.7.0.1
 */