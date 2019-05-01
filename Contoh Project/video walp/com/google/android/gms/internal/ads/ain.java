package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.List;

public final class ain
  extends aiy
{
  private List<Long> d = null;
  
  public ain(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 31);
  }
  
  protected final void a()
  {
    this.b.p = Long.valueOf(-1L);
    this.b.q = Long.valueOf(-1L);
    if (this.d == null)
    {
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.a();
      this.d = ((List)localMethod.invoke(null, arrayOfObject));
    }
    if ((this.d != null) && (this.d.size() == 2)) {
      synchronized (this.b)
      {
        this.b.p = Long.valueOf(((Long)this.d.get(0)).longValue());
        this.b.q = Long.valueOf(((Long)this.d.get(1)).longValue());
        return;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ain
 * JD-Core Version:    0.7.0.1
 */