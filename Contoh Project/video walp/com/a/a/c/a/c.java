package com.a.a.c.a;

import com.a.a.c.b.a.b;
import java.io.OutputStream;

public final class c
  extends OutputStream
{
  private final OutputStream a;
  private byte[] b;
  private b c;
  private int d;
  
  public c(OutputStream paramOutputStream, b paramb)
  {
    this(paramOutputStream, paramb, 65536);
  }
  
  c(OutputStream paramOutputStream, b paramb, int paramInt)
  {
    this.a = paramOutputStream;
    this.c = paramb;
    this.b = ((byte[])paramb.a(paramInt, [B.class));
  }
  
  private void a()
  {
    if (this.d > 0)
    {
      this.a.write(this.b, 0, this.d);
      this.d = 0;
    }
  }
  
  private void b()
  {
    if (this.d == this.b.length) {
      a();
    }
  }
  
  private void c()
  {
    if (this.b != null)
    {
      this.c.a(this.b);
      this.b = null;
    }
  }
  
  public void close()
  {
    try
    {
      flush();
      this.a.close();
      c();
      return;
    }
    finally
    {
      this.a.close();
    }
  }
  
  public void flush()
  {
    a();
    this.a.flush();
  }
  
  public void write(int paramInt)
  {
    byte[] arrayOfByte = this.b;
    int i = this.d;
    this.d = (i + 1);
    arrayOfByte[i] = ((byte)paramInt);
    b();
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    do
    {
      int j = paramInt2 - i;
      int k = paramInt1 + i;
      if ((this.d == 0) && (j >= this.b.length))
      {
        this.a.write(paramArrayOfByte, k, j);
        return;
      }
      int m = Math.min(j, this.b.length - this.d);
      System.arraycopy(paramArrayOfByte, k, this.b, this.d, m);
      this.d = (m + this.d);
      i += m;
      b();
    } while (i < paramInt2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.c
 * JD-Core Version:    0.7.0.1
 */