package com.google.android.gms.internal.ads;

public final class amt
  extends aew<amt>
{
  public Integer a = null;
  public amw b = null;
  private Integer c = null;
  private amv d = null;
  private amu[] e = amu.b();
  private amx f = null;
  private ang g = null;
  private anf h = null;
  private anc i = null;
  private and j = null;
  private anm[] k = anm.b();
  
  public amt()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final amt b(aes paramaes)
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
      case 56: 
        int i5 = paramaes.j();
        int i6;
        try
        {
          i6 = paramaes.g();
          if ((i6 < 0) || (i6 > 9)) {
            break label177;
          }
          this.a = Integer.valueOf(i6);
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          paramaes.e(i5);
          a(paramaes, m);
        }
        continue;
        throw new IllegalArgumentException(43 + i6 + " is not a valid enum AdInitiater");
      case 64: 
        int i4 = paramaes.j();
        try
        {
          this.c = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          paramaes.e(i4);
          a(paramaes, m);
        }
        break;
      case 74: 
        if (this.d == null) {
          this.d = new amv();
        }
        paramaes.a(this.d);
        break;
      case 82: 
        if (this.b == null) {
          this.b = new amw();
        }
        paramaes.a(this.b);
        break;
      case 90: 
        int i2 = aff.a(paramaes, 90);
        if (this.e == null) {}
        amu[] arrayOfamu;
        for (int i3 = 0;; i3 = this.e.length)
        {
          arrayOfamu = new amu[i2 + i3];
          if (i3 != 0) {
            System.arraycopy(this.e, 0, arrayOfamu, 0, i3);
          }
          while (i3 < -1 + arrayOfamu.length)
          {
            arrayOfamu[i3] = new amu();
            paramaes.a(arrayOfamu[i3]);
            paramaes.a();
            i3++;
          }
        }
        arrayOfamu[i3] = new amu();
        paramaes.a(arrayOfamu[i3]);
        this.e = arrayOfamu;
        break;
      case 98: 
        if (this.f == null) {
          this.f = new amx();
        }
        paramaes.a(this.f);
        break;
      case 106: 
        if (this.g == null) {
          this.g = new ang();
        }
        paramaes.a(this.g);
        break;
      case 114: 
        if (this.h == null) {
          this.h = new anf();
        }
        paramaes.a(this.h);
        break;
      case 122: 
        if (this.i == null) {
          this.i = new anc();
        }
        paramaes.a(this.i);
        break;
      case 130: 
        label177:
        if (this.j == null) {
          this.j = new and();
        }
        paramaes.a(this.j);
        break;
      }
      int n = aff.a(paramaes, 138);
      if (this.k == null) {}
      anm[] arrayOfanm;
      for (int i1 = 0;; i1 = this.k.length)
      {
        arrayOfanm = new anm[n + i1];
        if (i1 != 0) {
          System.arraycopy(this.k, 0, arrayOfanm, 0, i1);
        }
        while (i1 < -1 + arrayOfanm.length)
        {
          arrayOfanm[i1] = new anm();
          paramaes.a(arrayOfanm[i1]);
          paramaes.a();
          i1++;
        }
      }
      arrayOfanm[i1] = new anm();
      paramaes.a(arrayOfanm[i1]);
      this.k = arrayOfanm;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null) {
      m += aeu.b(7, this.a.intValue());
    }
    if (this.c != null) {
      m += aeu.b(8, this.c.intValue());
    }
    if (this.d != null) {
      m += aeu.b(9, this.d);
    }
    if (this.b != null) {
      m += aeu.b(10, this.b);
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i2 = m;
      for (int i3 = 0; i3 < this.e.length; i3++)
      {
        amu localamu = this.e[i3];
        if (localamu != null) {
          i2 += aeu.b(11, localamu);
        }
      }
      m = i2;
    }
    if (this.f != null) {
      m += aeu.b(12, this.f);
    }
    if (this.g != null) {
      m += aeu.b(13, this.g);
    }
    if (this.h != null) {
      m += aeu.b(14, this.h);
    }
    if (this.i != null) {
      m += aeu.b(15, this.i);
    }
    if (this.j != null) {
      m += aeu.b(16, this.j);
    }
    if (this.k != null)
    {
      int n = this.k.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.k.length)
        {
          anm localanm = this.k[i1];
          if (localanm != null) {
            m += aeu.b(17, localanm);
          }
          i1++;
        }
      }
    }
    return m;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(7, this.a.intValue());
    }
    if (this.c != null) {
      paramaeu.a(8, this.c.intValue());
    }
    if (this.d != null) {
      paramaeu.a(9, this.d);
    }
    if (this.b != null) {
      paramaeu.a(10, this.b);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i1 = 0; i1 < this.e.length; i1++)
      {
        amu localamu = this.e[i1];
        if (localamu != null) {
          paramaeu.a(11, localamu);
        }
      }
    }
    if (this.f != null) {
      paramaeu.a(12, this.f);
    }
    if (this.g != null) {
      paramaeu.a(13, this.g);
    }
    if (this.h != null) {
      paramaeu.a(14, this.h);
    }
    if (this.i != null) {
      paramaeu.a(15, this.i);
    }
    if (this.j != null) {
      paramaeu.a(16, this.j);
    }
    if (this.k != null)
    {
      int m = this.k.length;
      int n = 0;
      if (m > 0) {
        while (n < this.k.length)
        {
          anm localanm = this.k[n];
          if (localanm != null) {
            paramaeu.a(17, localanm);
          }
          n++;
        }
      }
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amt
 * JD-Core Version:    0.7.0.1
 */