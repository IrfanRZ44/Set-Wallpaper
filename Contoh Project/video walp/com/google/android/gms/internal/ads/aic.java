package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class aic
  extends aiy
{
  private static volatile String d = null;
  private static final Object e = new Object();
  
  public aic(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 29);
  }
  
  protected final void a()
  {
    this.b.o = "E";
    if (d == null) {
      synchronized (e)
      {
        if (d == null)
        {
          Method localMethod = this.c;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.a.a();
          d = (String)localMethod.invoke(null, arrayOfObject);
        }
      }
    }
    synchronized (this.b)
    {
      this.b.o = afv.a(d.getBytes(), true);
      return;
      localObject3 = finally;
      throw localObject3;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aic
 * JD-Core Version:    0.7.0.1
 */