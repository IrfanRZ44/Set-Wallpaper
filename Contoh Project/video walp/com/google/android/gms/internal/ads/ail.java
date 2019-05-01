package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class ail
  extends aiy
{
  private static volatile String d = null;
  private static final Object e = new Object();
  
  public ail(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 1);
  }
  
  protected final void a()
  {
    this.b.a = "E";
    if (d == null) {
      synchronized (e)
      {
        if (d == null) {
          d = (String)this.c.invoke(null, new Object[0]);
        }
      }
    }
    synchronized (this.b)
    {
      this.b.a = d;
      return;
      localObject3 = finally;
      throw localObject3;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ail
 * JD-Core Version:    0.7.0.1
 */