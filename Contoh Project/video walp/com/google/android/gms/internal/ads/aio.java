package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class aio
  extends aiy
{
  private final boolean d;
  
  public aio(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 61);
    this.d = paramahn.j();
  }
  
  protected final void a()
  {
    Method localMethod = this.c;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a.a();
    arrayOfObject[1] = Boolean.valueOf(this.d);
    long l = ((Long)localMethod.invoke(null, arrayOfObject)).longValue();
    synchronized (this.b)
    {
      this.b.P = Long.valueOf(l);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aio
 * JD-Core Version:    0.7.0.1
 */