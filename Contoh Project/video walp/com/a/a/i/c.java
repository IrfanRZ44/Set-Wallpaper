package com.a.a.i;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class c
  extends InputStream
{
  private static final Queue<c> a = i.a(0);
  private InputStream b;
  private IOException c;
  
  public static c a(InputStream paramInputStream)
  {
    synchronized (a)
    {
      c localc = (c)a.poll();
      if (localc == null) {
        localc = new c();
      }
      localc.b(paramInputStream);
      return localc;
    }
  }
  
  public IOException a()
  {
    return this.c;
  }
  
  public int available()
  {
    return this.b.available();
  }
  
  public void b()
  {
    this.c = null;
    this.b = null;
    synchronized (a)
    {
      a.offer(this);
      return;
    }
  }
  
  void b(InputStream paramInputStream)
  {
    this.b = paramInputStream;
  }
  
  public void close()
  {
    this.b.close();
  }
  
  public void mark(int paramInt)
  {
    this.b.mark(paramInt);
  }
  
  public boolean markSupported()
  {
    return this.b.markSupported();
  }
  
  public int read()
  {
    try
    {
      int i = this.b.read();
      return i;
    }
    catch (IOException localIOException)
    {
      this.c = localIOException;
    }
    return -1;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    try
    {
      int i = this.b.read(paramArrayOfByte);
      return i;
    }
    catch (IOException localIOException)
    {
      this.c = localIOException;
    }
    return -1;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      int i = this.b.read(paramArrayOfByte, paramInt1, paramInt2);
      return i;
    }
    catch (IOException localIOException)
    {
      this.c = localIOException;
    }
    return -1;
  }
  
  public void reset()
  {
    try
    {
      this.b.reset();
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
    try
    {
      long l = this.b.skip(paramLong);
      return l;
    }
    catch (IOException localIOException)
    {
      this.c = localIOException;
    }
    return 0L;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.c
 * JD-Core Version:    0.7.0.1
 */