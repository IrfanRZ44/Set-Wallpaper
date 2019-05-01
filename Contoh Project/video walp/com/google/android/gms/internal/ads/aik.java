package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class aik
  extends aiy
{
  private long d = -1L;
  
  public aik(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 12);
  }
  
  protected final void a()
  {
    this.b.f = Long.valueOf(-1L);
    zo localzo = this.b;
    Method localMethod = this.c;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a.a();
    localzo.f = ((Long)localMethod.invoke(null, arrayOfObject));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aik
 * JD-Core Version:    0.7.0.1
 */