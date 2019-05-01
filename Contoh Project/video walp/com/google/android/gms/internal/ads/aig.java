package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class aig
  extends aiy
{
  private long d;
  
  public aig(ahn paramahn, String paramString1, String paramString2, zo paramzo, long paramLong, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 25);
    this.d = paramLong;
  }
  
  protected final void a()
  {
    long l = ((Long)this.c.invoke(null, new Object[0])).longValue();
    synchronized (this.b)
    {
      this.b.W = Long.valueOf(l);
      if (this.d != 0L)
      {
        this.b.j = Long.valueOf(l - this.d);
        this.b.m = Long.valueOf(this.d);
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aig
 * JD-Core Version:    0.7.0.1
 */