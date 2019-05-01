package com.a.a.c.b;

import android.os.Looper;

class o<Z>
  implements u<Z>
{
  private final boolean a;
  private final boolean b;
  private a c;
  private com.a.a.c.h d;
  private int e;
  private boolean f;
  private final u<Z> g;
  
  o(u<Z> paramu, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.g = ((u)com.a.a.i.h.a(paramu));
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }
  
  u<Z> a()
  {
    return this.g;
  }
  
  void a(com.a.a.c.h paramh, a parama)
  {
    this.d = paramh;
    this.c = parama;
  }
  
  boolean b()
  {
    return this.a;
  }
  
  public Class<Z> c()
  {
    return this.g.c();
  }
  
  public Z d()
  {
    return this.g.d();
  }
  
  public int e()
  {
    return this.g.e();
  }
  
  public void f()
  {
    if (this.e > 0) {
      throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }
    if (this.f) {
      throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
    }
    this.f = true;
    if (this.b) {
      this.g.f();
    }
  }
  
  void g()
  {
    if (this.f) {
      throw new IllegalStateException("Cannot acquire a recycled resource");
    }
    if (!Looper.getMainLooper().equals(Looper.myLooper())) {
      throw new IllegalThreadStateException("Must call acquire on the main thread");
    }
    this.e = (1 + this.e);
  }
  
  void h()
  {
    if (this.e <= 0) {
      throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
    }
    if (!Looper.getMainLooper().equals(Looper.myLooper())) {
      throw new IllegalThreadStateException("Must call release on the main thread");
    }
    int i = -1 + this.e;
    this.e = i;
    if (i == 0) {
      this.c.a(this.d, this);
    }
  }
  
  public String toString()
  {
    return "EngineResource{isCacheable=" + this.a + ", listener=" + this.c + ", key=" + this.d + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + this.g + '}';
  }
  
  static abstract interface a
  {
    public abstract void a(com.a.a.c.h paramh, o<?> paramo);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.o
 * JD-Core Version:    0.7.0.1
 */