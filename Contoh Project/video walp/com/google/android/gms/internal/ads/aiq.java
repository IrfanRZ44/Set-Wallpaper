package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class aiq
  extends aiy
{
  private final StackTraceElement[] d;
  
  public aiq(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2, StackTraceElement[] paramArrayOfStackTraceElement)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 45);
    this.d = paramArrayOfStackTraceElement;
  }
  
  protected final void a()
  {
    ahl localahl;
    if (this.d != null)
    {
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.d;
      localahl = new ahl((String)localMethod.invoke(null, arrayOfObject));
    }
    for (;;)
    {
      synchronized (this.b)
      {
        this.b.B = localahl.a;
        if (localahl.b.booleanValue())
        {
          zo localzo2 = this.b;
          if (!localahl.c.booleanValue()) {
            break label113;
          }
          i = 0;
          localzo2.J = Integer.valueOf(i);
        }
        return;
      }
      return;
      label113:
      int i = 1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aiq
 * JD-Core Version:    0.7.0.1
 */