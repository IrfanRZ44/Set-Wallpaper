package com.a.a.c.d.a;

import com.a.a.c.b.a.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class q
  extends FilterInputStream
{
  private volatile byte[] a;
  private int b;
  private int c;
  private int d = -1;
  private int e;
  private final b f;
  
  public q(InputStream paramInputStream, b paramb)
  {
    this(paramInputStream, paramb, 65536);
  }
  
  q(InputStream paramInputStream, b paramb, int paramInt)
  {
    super(paramInputStream);
    this.f = paramb;
    this.a = ((byte[])paramb.a(paramInt, [B.class));
  }
  
  private int a(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    if ((this.d == -1) || (this.e - this.d >= this.c))
    {
      int i = paramInputStream.read(paramArrayOfByte);
      if (i > 0)
      {
        this.d = -1;
        this.e = 0;
        this.b = i;
      }
      return i;
    }
    int j;
    if ((this.d == 0) && (this.c > paramArrayOfByte.length) && (this.b == paramArrayOfByte.length))
    {
      int m = 2 * paramArrayOfByte.length;
      if (m > this.c) {
        m = this.c;
      }
      byte[] arrayOfByte = (byte[])this.f.a(m, [B.class);
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
      this.a = arrayOfByte;
      this.f.a(paramArrayOfByte);
      paramArrayOfByte = arrayOfByte;
      this.e -= this.d;
      this.d = 0;
      this.b = 0;
      j = paramInputStream.read(paramArrayOfByte, this.e, paramArrayOfByte.length - this.e);
      if (j > 0) {
        break label232;
      }
    }
    label232:
    for (int k = this.e;; k = j + this.e)
    {
      this.b = k;
      return j;
      if (this.d <= 0) {
        break;
      }
      System.arraycopy(paramArrayOfByte, this.d, paramArrayOfByte, 0, paramArrayOfByte.length - this.d);
      break;
    }
  }
  
  private static IOException c()
  {
    throw new IOException("BufferedInputStream is closed");
  }
  
  public void a()
  {
    try
    {
      this.c = this.a.length;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public int available()
  {
    InputStream localInputStream;
    try
    {
      localInputStream = this.in;
      if ((this.a == null) || (localInputStream == null)) {
        throw c();
      }
    }
    finally {}
    int i = this.b - this.e;
    int j = localInputStream.available();
    int k = j + i;
    return k;
  }
  
  public void b()
  {
    try
    {
      if (this.a != null)
      {
        this.f.a(this.a);
        this.a = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void close()
  {
    if (this.a != null)
    {
      this.f.a(this.a);
      this.a = null;
    }
    InputStream localInputStream = this.in;
    this.in = null;
    if (localInputStream != null) {
      localInputStream.close();
    }
  }
  
  public void mark(int paramInt)
  {
    try
    {
      this.c = Math.max(this.c, paramInt);
      this.d = this.e;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean markSupported()
  {
    return true;
  }
  
  public int read()
  {
    int i = -1;
    byte[] arrayOfByte;
    InputStream localInputStream;
    try
    {
      arrayOfByte = this.a;
      localInputStream = this.in;
      if ((arrayOfByte == null) || (localInputStream == null)) {
        throw c();
      }
    }
    finally {}
    if (this.e >= this.b)
    {
      int m = a(localInputStream, arrayOfByte);
      if (m != i) {}
    }
    for (;;)
    {
      return i;
      if (arrayOfByte != this.a)
      {
        arrayOfByte = this.a;
        if (arrayOfByte == null) {
          throw c();
        }
      }
      if (this.b - this.e > 0)
      {
        int j = this.e;
        this.e = (j + 1);
        int k = arrayOfByte[j];
        i = k & 0xFF;
      }
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = this.a;
      if (arrayOfByte == null) {
        throw c();
      }
    }
    finally {}
    if (paramInt2 == 0) {
      i = 0;
    }
    for (;;)
    {
      return i;
      InputStream localInputStream = this.in;
      if (localInputStream == null) {
        throw c();
      }
      int n;
      label136:
      int j;
      int k;
      if (this.e < this.b)
      {
        if (this.b - this.e >= paramInt2) {}
        for (n = paramInt2;; n = this.b - this.e)
        {
          System.arraycopy(arrayOfByte, this.e, paramArrayOfByte, paramInt1, n);
          this.e = (n + this.e);
          if (n == paramInt2) {
            break;
          }
          if (localInputStream.available() != 0) {
            break label333;
          }
          break;
        }
        if ((this.d == i) && (j >= arrayOfByte.length))
        {
          k = localInputStream.read(paramArrayOfByte, paramInt1, j);
          if (k != i) {
            break label353;
          }
          if (j == paramInt2) {
            continue;
          }
          i = paramInt2 - j;
          continue;
        }
        if (a(localInputStream, arrayOfByte) == i)
        {
          if (j == paramInt2) {
            continue;
          }
          i = paramInt2 - j;
          continue;
        }
        if (arrayOfByte != this.a)
        {
          arrayOfByte = this.a;
          if (arrayOfByte == null) {
            throw c();
          }
        }
        if (this.b - this.e >= j) {}
        for (k = j;; k = this.b - this.e)
        {
          System.arraycopy(arrayOfByte, this.e, paramArrayOfByte, paramInt1, k);
          this.e = (k + this.e);
          break;
        }
      }
      label333:
      label353:
      do
      {
        int m = localInputStream.available();
        if (m == 0)
        {
          i = paramInt2 - j;
          break;
        }
        paramInt1 += k;
        break label136;
        i = n;
        break;
        paramInt1 += n;
        j = paramInt2 - n;
        break label136;
        j = paramInt2;
        break label136;
        j -= k;
      } while (j != 0);
      i = paramInt2;
    }
  }
  
  public void reset()
  {
    try
    {
      if (this.a == null) {
        throw new IOException("Stream is closed");
      }
    }
    finally {}
    if (-1 == this.d) {
      throw new a("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.c);
    }
    this.e = this.d;
  }
  
  public long skip(long paramLong)
  {
    if (paramLong < 1L) {
      paramLong = 0L;
    }
    for (;;)
    {
      return paramLong;
      byte[] arrayOfByte;
      try
      {
        arrayOfByte = this.a;
        if (arrayOfByte == null) {
          throw c();
        }
      }
      finally {}
      InputStream localInputStream = this.in;
      if (localInputStream == null) {
        throw c();
      }
      if (this.b - this.e >= paramLong)
      {
        this.e = ((int)(paramLong + this.e));
      }
      else
      {
        long l1 = this.b - this.e;
        this.e = this.b;
        if ((this.d != -1) && (paramLong <= this.c))
        {
          if (a(localInputStream, arrayOfByte) == -1)
          {
            paramLong = l1;
          }
          else if (this.b - this.e >= paramLong - l1)
          {
            this.e = ((int)(paramLong + this.e - l1));
          }
          else
          {
            paramLong = l1 + this.b - this.e;
            this.e = this.b;
          }
        }
        else
        {
          long l2 = localInputStream.skip(paramLong - l1);
          paramLong = l1 + l2;
        }
      }
    }
  }
  
  static class a
    extends IOException
  {
    a(String paramString)
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.q
 * JD-Core Version:    0.7.0.1
 */