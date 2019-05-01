package com.google.android.gms.internal.ads;

public final class ang
  extends aew<ang>
{
  private Integer a = null;
  private Integer b = null;
  private Integer c = null;
  private Integer d = null;
  private Integer e = null;
  private Integer f = null;
  private Integer g = null;
  private Integer h = null;
  private Integer i = null;
  private Integer j = null;
  private anh k = null;
  
  public ang()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final ang b(aes paramaes)
  {
    for (;;)
    {
      int m = paramaes.a();
      switch (m)
      {
      default: 
        if (super.a(paramaes, m)) {
          continue;
        }
      case 0: 
        return this;
      case 8: 
        int i1 = paramaes.j();
        try
        {
          this.a = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          paramaes.e(i1);
          a(paramaes, m);
        }
        break;
      case 16: 
        int n = paramaes.j();
        try
        {
          this.b = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          paramaes.e(n);
          a(paramaes, m);
        }
        break;
      case 24: 
        this.c = Integer.valueOf(paramaes.g());
        break;
      case 32: 
        this.d = Integer.valueOf(paramaes.g());
        break;
      case 40: 
        this.e = Integer.valueOf(paramaes.g());
        break;
      case 48: 
        this.f = Integer.valueOf(paramaes.g());
        break;
      case 56: 
        this.g = Integer.valueOf(paramaes.g());
        break;
      case 64: 
        this.h = Integer.valueOf(paramaes.g());
        break;
      case 72: 
        this.i = Integer.valueOf(paramaes.g());
        break;
      case 80: 
        this.j = Integer.valueOf(paramaes.g());
        break;
      }
      if (this.k == null) {
        this.k = new anh();
      }
      paramaes.a(this.k);
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null) {
      m += aeu.b(1, this.a.intValue());
    }
    if (this.b != null) {
      m += aeu.b(2, this.b.intValue());
    }
    if (this.c != null) {
      m += aeu.b(3, this.c.intValue());
    }
    if (this.d != null) {
      m += aeu.b(4, this.d.intValue());
    }
    if (this.e != null) {
      m += aeu.b(5, this.e.intValue());
    }
    if (this.f != null) {
      m += aeu.b(6, this.f.intValue());
    }
    if (this.g != null) {
      m += aeu.b(7, this.g.intValue());
    }
    if (this.h != null) {
      m += aeu.b(8, this.h.intValue());
    }
    if (this.i != null) {
      m += aeu.b(9, this.i.intValue());
    }
    if (this.j != null) {
      m += aeu.b(10, this.j.intValue());
    }
    if (this.k != null) {
      m += aeu.b(11, this.k);
    }
    return m;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramaeu.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramaeu.a(3, this.c.intValue());
    }
    if (this.d != null) {
      paramaeu.a(4, this.d.intValue());
    }
    if (this.e != null) {
      paramaeu.a(5, this.e.intValue());
    }
    if (this.f != null) {
      paramaeu.a(6, this.f.intValue());
    }
    if (this.g != null) {
      paramaeu.a(7, this.g.intValue());
    }
    if (this.h != null) {
      paramaeu.a(8, this.h.intValue());
    }
    if (this.i != null) {
      paramaeu.a(9, this.i.intValue());
    }
    if (this.j != null) {
      paramaeu.a(10, this.j.intValue());
    }
    if (this.k != null) {
      paramaeu.a(11, this.k);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ang
 * JD-Core Version:    0.7.0.1
 */