package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

public final class aim
  extends aiy
{
  public aim(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 3);
  }
  
  protected final void a()
  {
    synchronized (this.b)
    {
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.a();
      aha localaha = new aha((String)localMethod.invoke(null, arrayOfObject));
      synchronized (this.b)
      {
        this.b.c = Long.valueOf(localaha.a);
        this.b.O = Long.valueOf(localaha.b);
        return;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aim
 * JD-Core Version:    0.7.0.1
 */