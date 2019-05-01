package com.a.a.g;

public class h
  implements b, c
{
  private final c a;
  private b b;
  private b c;
  private boolean d;
  
  h()
  {
    this(null);
  }
  
  public h(c paramc)
  {
    this.a = paramc;
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
    this.d = true;
    if ((!this.b.e()) && (!this.c.d())) {
      this.c.a();
    }
    if ((this.d) && (!this.b.d())) {
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
    boolean bool1 = paramb instanceof h;
    boolean bool2 = false;
    h localh;
    if (bool1)
    {
      localh = (h)paramb;
      if (this.b != null) {
        break label63;
      }
      b localb2 = localh.b;
      bool2 = false;
      if (localb2 == null)
      {
        if (this.c != null) {
          break label89;
        }
        b localb1 = localh.c;
        bool2 = false;
        if (localb1 != null) {}
      }
    }
    for (;;)
    {
      bool2 = true;
      label63:
      label89:
      boolean bool4;
      do
      {
        boolean bool3;
        do
        {
          return bool2;
          bool3 = this.b.a(localh.b);
          bool2 = false;
        } while (!bool3);
        break;
        bool4 = this.c.a(localh.c);
        bool2 = false;
      } while (!bool4);
    }
  }
  
  public void b()
  {
    this.d = false;
    this.b.b();
    this.c.b();
  }
  
  public boolean b(b paramb)
  {
    return (k()) && ((paramb.equals(this.b)) || (!this.b.f()));
  }
  
  public void c()
  {
    this.d = false;
    this.c.c();
    this.b.c();
  }
  
  public boolean c(b paramb)
  {
    return (m()) && (paramb.equals(this.b)) && (!j());
  }
  
  public boolean d()
  {
    return this.b.d();
  }
  
  public boolean d(b paramb)
  {
    return (l()) && (paramb.equals(this.b));
  }
  
  public void e(b paramb)
  {
    if (paramb.equals(this.c)) {}
    do
    {
      return;
      if (this.a != null) {
        this.a.e(this);
      }
    } while (this.c.e());
    this.c.c();
  }
  
  public boolean e()
  {
    return (this.b.e()) || (this.c.e());
  }
  
  public void f(b paramb)
  {
    if (!paramb.equals(this.b)) {}
    while (this.a == null) {
      return;
    }
    this.a.f(this);
  }
  
  public boolean f()
  {
    return (this.b.f()) || (this.c.f());
  }
  
  public boolean g()
  {
    return this.b.g();
  }
  
  public boolean h()
  {
    return this.b.h();
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
 * Qualified Name:     com.a.a.g.h
 * JD-Core Version:    0.7.0.1
 */