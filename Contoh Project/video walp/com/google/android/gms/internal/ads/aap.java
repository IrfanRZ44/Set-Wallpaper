package com.google.android.gms.internal.ads;

public final class aap
  extends aew<aap>
{
  private static volatile aap[] t;
  public Long a = null;
  public Long b = null;
  public Long c = null;
  public Long d = null;
  public Long e = null;
  public Long f = null;
  public Integer g;
  public Long h = null;
  public Long i = null;
  public Long j = null;
  public Integer k;
  public Long l = null;
  public Long m = null;
  public Long n = null;
  public Long o = null;
  public Long p = null;
  public Long q = null;
  public Long r = null;
  public Long s = null;
  private Long u = null;
  private Long v = null;
  
  public aap()
  {
    this.Z = -1;
  }
  
  private final aap b(aes paramaes)
  {
    for (;;)
    {
      int i1 = paramaes.a();
      switch (i1)
      {
      default: 
        if (super.a(paramaes, i1)) {
          continue;
        }
      case 0: 
        return this;
      case 8: 
        this.a = Long.valueOf(paramaes.h());
        break;
      case 16: 
        this.b = Long.valueOf(paramaes.h());
        break;
      case 24: 
        this.c = Long.valueOf(paramaes.h());
        break;
      case 32: 
        this.d = Long.valueOf(paramaes.h());
        break;
      case 40: 
        this.e = Long.valueOf(paramaes.h());
        break;
      case 48: 
        this.f = Long.valueOf(paramaes.h());
        break;
      case 56: 
        int i3 = paramaes.j();
        try
        {
          this.g = Integer.valueOf(ym.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          paramaes.e(i3);
          a(paramaes, i1);
        }
        break;
      case 64: 
        this.h = Long.valueOf(paramaes.h());
        break;
      case 72: 
        this.i = Long.valueOf(paramaes.h());
        break;
      case 80: 
        this.j = Long.valueOf(paramaes.h());
        break;
      case 88: 
        int i2 = paramaes.j();
        try
        {
          this.k = Integer.valueOf(ym.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          paramaes.e(i2);
          a(paramaes, i1);
        }
        break;
      case 96: 
        this.l = Long.valueOf(paramaes.h());
        break;
      case 104: 
        this.m = Long.valueOf(paramaes.h());
        break;
      case 112: 
        this.n = Long.valueOf(paramaes.h());
        break;
      case 120: 
        this.o = Long.valueOf(paramaes.h());
        break;
      case 128: 
        this.p = Long.valueOf(paramaes.h());
        break;
      case 136: 
        this.q = Long.valueOf(paramaes.h());
        break;
      case 144: 
        this.r = Long.valueOf(paramaes.h());
        break;
      case 152: 
        this.s = Long.valueOf(paramaes.h());
        break;
      case 160: 
        this.u = Long.valueOf(paramaes.h());
        break;
      }
      this.v = Long.valueOf(paramaes.h());
    }
  }
  
  public static aap[] b()
  {
    if (t == null) {}
    synchronized (afa.b)
    {
      if (t == null) {
        t = new aap[0];
      }
      return t;
    }
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.a != null) {
      i1 += aeu.d(1, this.a.longValue());
    }
    if (this.b != null) {
      i1 += aeu.d(2, this.b.longValue());
    }
    if (this.c != null) {
      i1 += aeu.d(3, this.c.longValue());
    }
    if (this.d != null) {
      i1 += aeu.d(4, this.d.longValue());
    }
    if (this.e != null) {
      i1 += aeu.d(5, this.e.longValue());
    }
    if (this.f != null) {
      i1 += aeu.d(6, this.f.longValue());
    }
    if (this.g != null) {
      i1 += aeu.b(7, this.g.intValue());
    }
    if (this.h != null) {
      i1 += aeu.d(8, this.h.longValue());
    }
    if (this.i != null) {
      i1 += aeu.d(9, this.i.longValue());
    }
    if (this.j != null) {
      i1 += aeu.d(10, this.j.longValue());
    }
    if (this.k != null) {
      i1 += aeu.b(11, this.k.intValue());
    }
    if (this.l != null) {
      i1 += aeu.d(12, this.l.longValue());
    }
    if (this.m != null) {
      i1 += aeu.d(13, this.m.longValue());
    }
    if (this.n != null) {
      i1 += aeu.d(14, this.n.longValue());
    }
    if (this.o != null) {
      i1 += aeu.d(15, this.o.longValue());
    }
    if (this.p != null) {
      i1 += aeu.d(16, this.p.longValue());
    }
    if (this.q != null) {
      i1 += aeu.d(17, this.q.longValue());
    }
    if (this.r != null) {
      i1 += aeu.d(18, this.r.longValue());
    }
    if (this.s != null) {
      i1 += aeu.d(19, this.s.longValue());
    }
    if (this.u != null) {
      i1 += aeu.d(20, this.u.longValue());
    }
    if (this.v != null) {
      i1 += aeu.d(21, this.v.longValue());
    }
    return i1;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.b(1, this.a.longValue());
    }
    if (this.b != null) {
      paramaeu.b(2, this.b.longValue());
    }
    if (this.c != null) {
      paramaeu.b(3, this.c.longValue());
    }
    if (this.d != null) {
      paramaeu.b(4, this.d.longValue());
    }
    if (this.e != null) {
      paramaeu.b(5, this.e.longValue());
    }
    if (this.f != null) {
      paramaeu.b(6, this.f.longValue());
    }
    if (this.g != null) {
      paramaeu.a(7, this.g.intValue());
    }
    if (this.h != null) {
      paramaeu.b(8, this.h.longValue());
    }
    if (this.i != null) {
      paramaeu.b(9, this.i.longValue());
    }
    if (this.j != null) {
      paramaeu.b(10, this.j.longValue());
    }
    if (this.k != null) {
      paramaeu.a(11, this.k.intValue());
    }
    if (this.l != null) {
      paramaeu.b(12, this.l.longValue());
    }
    if (this.m != null) {
      paramaeu.b(13, this.m.longValue());
    }
    if (this.n != null) {
      paramaeu.b(14, this.n.longValue());
    }
    if (this.o != null) {
      paramaeu.b(15, this.o.longValue());
    }
    if (this.p != null) {
      paramaeu.b(16, this.p.longValue());
    }
    if (this.q != null) {
      paramaeu.b(17, this.q.longValue());
    }
    if (this.r != null) {
      paramaeu.b(18, this.r.longValue());
    }
    if (this.s != null) {
      paramaeu.b(19, this.s.longValue());
    }
    if (this.u != null) {
      paramaeu.b(20, this.u.longValue());
    }
    if (this.v != null) {
      paramaeu.b(21, this.v.longValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aap
 * JD-Core Version:    0.7.0.1
 */