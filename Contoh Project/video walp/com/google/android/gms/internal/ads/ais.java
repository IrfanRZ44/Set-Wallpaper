package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class ais
  extends aiy
{
  private final ahx d;
  private long e;
  
  public ais(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2, ahx paramahx)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 53);
    this.d = paramahx;
    if (paramahx != null) {
      this.e = paramahx.a();
    }
  }
  
  protected final void a()
  {
    if (this.d != null)
    {
      zo localzo = this.b;
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(this.e);
      localzo.I = ((Long)localMethod.invoke(null, arrayOfObject));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ais
 * JD-Core Version:    0.7.0.1
 */