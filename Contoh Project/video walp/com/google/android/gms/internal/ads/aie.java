package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class aie
  extends aiy
{
  public aie(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 5);
  }
  
  protected final void a()
  {
    this.b.d = Long.valueOf(-1L);
    this.b.e = Long.valueOf(-1L);
    Method localMethod = this.c;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a.a();
    int[] arrayOfInt = (int[])localMethod.invoke(null, arrayOfObject);
    synchronized (this.b)
    {
      this.b.d = Long.valueOf(arrayOfInt[0]);
      this.b.e = Long.valueOf(arrayOfInt[1]);
      if (arrayOfInt[2] != -2147483648) {
        this.b.N = Long.valueOf(arrayOfInt[2]);
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aie
 * JD-Core Version:    0.7.0.1
 */