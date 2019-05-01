package com.a.a.g;

public final class a
  implements b, c
{
  private final c a;
  private b b;
  private b c;
  
  public a(c paramc)
  {
    this.a = paramc;
  }
  
  private boolean g(b paramb)
  {
    return (paramb.equals(this.b)) || ((this.b.h()) && (paramb.equals(this.c)));
  }
  
  private boolean k()
  {
    return (this.a == null) || (this.a.b(this));
  }
  
  private boolean l()
  {
    return (this.a == null) || (this.a.d(this));
  }
  
  private boolean m()
  {
    return (this.a == null) || (this.a.c(this));
  }
  
  private boolean n()
  {
    return (this.a != null) && (this.a.j());
  }
  
  public void a()
  {
    if (!this.b.d()) {
      this.b.a();
    }
  }
  
  public void a(b paramb1, b paramb2)
  {
    this.b = paramb1;
    this.c = paramb2;
  }
  
  public boolean a(b paramb)
  {
    boolean bool1 = paramb instanceof a;
    boolean bool2 = false;
    if (bool1)
    {
      a locala = (a)paramb;
      boolean bool3 = this.b.a(locala.b);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.c.a(locala.c);
        bool2 = false;
        if (bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public void b()
  {
    if (!this.b.h()) {
      this.b.b();
    }
    if (this.c.d()) {
      this.c.b();
    }
  }
  
  public boolean b(b paramb)
  {
    return (k()) && (g(paramb));
  }
  
  public void c()
  {
    this.b.c();
    if (this.c.d()) {
      this.c.c();
    }
  }
  
  public boolean c(b paramb)
  {
    return (m()) && (g(paramb));
  }
  
  public boolean d()
  {
    if (this.b.h()) {
      return this.c.d();
    }
    return this.b.d();
  }
  
  public boolean d(b paramb)
  {
    return (l()) && (g(paramb));
  }
  
  public void e(b paramb)
  {
    if (this.a != null) {
      this.a.e(this);
    }
  }
  
  public boolean e()
  {
    if (this.b.h()) {
      return this.c.e();
    }
    return this.b.e();
  }
  
  public void f(b paramb)
  {
    if (!paramb.equals(this.c)) {
      if (!this.c.d()) {
        this.c.a();
      }
    }
    while (this.a == null) {
      return;
    }
    this.a.f(this);
  }
  
  public boolean f()
  {
    if (this.b.h()) {
      return this.c.f();
    }
    return this.b.f();
  }
  
  public boolean g()
  {
    if (this.b.h()) {
      return this.c.g();
    }
    return this.b.g();
  }
  
  public boolean h()
  {
    return (this.b.h()) && (this.c.h());
  }
  
  public void i()
  {
    this.b.i();
    this.c.i();
  }
  
  public boolean j()
  {
    return (n()) || (f());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.g.a
 * JD-Core Version:    0.7.0.1
 */