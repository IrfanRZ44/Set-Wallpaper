package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

public final class th
  extends ByteArrayOutputStream
{
  private final jc a;
  
  public th(jc paramjc, int paramInt)
  {
    this.a = paramjc;
    this.buf = this.a.a(Math.max(paramInt, 256));
  }
  
  private final void a(int paramInt)
  {
    if (paramInt + this.count <= this.buf.length) {
      return;
    }
    byte[] arrayOfByte = this.a.a(paramInt + this.count << 1);
    System.arraycopy(this.buf, 0, arrayOfByte, 0, this.count);
    this.a.a(this.buf);
    this.buf = arrayOfByte;
  }
  
  public final void close()
  {
    this.a.a(this.buf);
    this.buf = null;
    super.close();
  }
  
  public final void finalize()
  {
    this.a.a(this.buf);
  }
  
  public final void write(int paramInt)
  {
    try
    {
      a(1);
      super.write(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      a(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.th
 * JD-Core Version:    0.7.0.1
 */