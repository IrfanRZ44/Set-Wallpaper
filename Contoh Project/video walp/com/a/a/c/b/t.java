package com.a.a.c.b;

import android.support.v4.f.k.a;
import com.a.a.i.a.a;
import com.a.a.i.a.a.a;
import com.a.a.i.a.a.c;
import com.a.a.i.a.b;
import com.a.a.i.h;

final class t<Z>
  implements u<Z>, a.c
{
  private static final k.a<t<?>> a = a.b(20, new a.a()
  {
    public t<?> a()
    {
      return new t();
    }
  });
  private final b b = b.a();
  private u<Z> c;
  private boolean d;
  private boolean e;
  
  static <Z> t<Z> a(u<Z> paramu)
  {
    t localt = (t)h.a((t)a.a());
    localt.b(paramu);
    return localt;
  }
  
  private void b()
  {
    this.c = null;
    a.a(this);
  }
  
  private void b(u<Z> paramu)
  {
    this.e = false;
    this.d = true;
    this.c = paramu;
  }
  
  void a()
  {
    try
    {
      this.b.b();
      if (!this.d) {
        throw new IllegalStateException("Already unlocked");
      }
    }
    finally {}
    this.d = false;
    if (this.e) {
      f();
    }
  }
  
  public b a_()
  {
    return this.b;
  }
  
  public Class<Z> c()
  {
    return this.c.c();
  }
  
  public Z d()
  {
    return this.c.d();
  }
  
  public int e()
  {
    return this.c.e();
  }
  
  public void f()
  {
    try
    {
      this.b.b();
      this.e = true;
      if (!this.d)
      {
        this.c.f();
        b();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.t
 * JD-Core Version:    0.7.0.1
 */