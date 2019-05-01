package com.a.a.i;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b
  extends FilterInputStream
{
  private final long a;
  private int b;
  
  private b(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.a = paramLong;
  }
  
  private int a(int paramInt)
  {
    if (paramInt >= 0) {
      this.b = (paramInt + this.b);
    }
    while (this.a - this.b <= 0L) {
      return paramInt;
    }
    throw new IOException("Failed to read all expected data, expected: " + this.a + ", but read: " + this.b);
  }
  
  public static InputStream a(InputStream paramInputStream, long paramLong)
  {
    return new b(paramInputStream, paramLong);
  }
  
  public int available()
  {
    try
    {
      long l = Math.max(this.a - this.b, this.in.available());
      int i = (int)l;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public int read()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 68	java/io/FilterInputStream:read	()I
    //   6: istore_2
    //   7: iload_2
    //   8: iflt +15 -> 23
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: iload_3
    //   15: invokespecial 70	com/a/a/i/b:a	(I)I
    //   18: pop
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_2
    //   22: ireturn
    //   23: iconst_m1
    //   24: istore_3
    //   25: goto -12 -> 13
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	b
    //   28	4	1	localObject	Object
    //   6	16	2	i	int
    //   12	13	3	j	int
    // Exception table:
    //   from	to	target	type
    //   2	7	28	finally
    //   13	19	28	finally
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      int i = a(super.read(paramArrayOfByte, paramInt1, paramInt2));
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.b
 * JD-Core Version:    0.7.0.1
 */