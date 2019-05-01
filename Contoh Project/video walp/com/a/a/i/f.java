package com.a.a.i;

import java.io.FilterInputStream;
import java.io.InputStream;

public class f
  extends FilterInputStream
{
  private int a = -2147483648;
  
  public f(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  private long a(long paramLong)
  {
    if (this.a == 0) {
      paramLong = -1L;
    }
    while ((this.a == -2147483648) || (paramLong <= this.a)) {
      return paramLong;
    }
    return this.a;
  }
  
  private void b(long paramLong)
  {
    if ((this.a != -2147483648) && (paramLong != -1L)) {
      this.a = ((int)(this.a - paramLong));
    }
  }
  
  public int available()
  {
    if (this.a == -2147483648) {
      return super.available();
    }
    return Math.min(this.a, super.available());
  }
  
  public void mark(int paramInt)
  {
    try
    {
      super.mark(paramInt);
      this.a = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public int read()
  {
    if (a(1L) == -1L) {
      return -1;
    }
    int i = super.read();
    b(1L);
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = (int)a(paramInt2);
    if (i == -1) {
      return -1;
    }
    int j = super.read(paramArrayOfByte, paramInt1, i);
    b(j);
    return j;
  }
  
  public void reset()
  {
    try
    {
      super.reset();
      this.a = -2147483648;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public long skip(long paramLong)
  {
    long l1 = a(paramLong);
    if (l1 == -1L) {
      return 0L;
    }
    long l2 = super.skip(l1);
    b(l2);
    return l2;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.f
 * JD-Core Version:    0.7.0.1
 */