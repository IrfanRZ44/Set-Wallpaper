package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;

final class ir
{
  private final Object a = new Object();
  private volatile int b = is.a;
  private volatile long c = 0L;
  
  private final void a(int paramInt1, int paramInt2)
  {
    d();
    long l = zzbv.zzer().a();
    synchronized (this.a)
    {
      if (this.b != paramInt1) {
        return;
      }
      this.b = paramInt2;
      if (this.b == is.c) {
        this.c = l;
      }
      return;
    }
  }
  
  private final void d()
  {
    long l1 = zzbv.zzer().a();
    synchronized (this.a)
    {
      if (this.b == is.c)
      {
        long l2 = this.c;
        arq localarq = asa.di;
        if (l2 + ((Long)aos.f().a(localarq)).longValue() <= l1) {
          this.b = is.a;
        }
      }
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a(is.a, is.b);
      return;
    }
    a(is.b, is.a);
  }
  
  public final boolean a()
  {
    d();
    return this.b == is.b;
  }
  
  public final boolean b()
  {
    d();
    return this.b == is.c;
  }
  
  public final void c()
  {
    a(is.b, is.c);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ir
 * JD-Core Version:    0.7.0.1
 */