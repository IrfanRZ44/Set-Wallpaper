package com.google.android.gms.internal.ads;

public final class ana
  extends aew<ana>
{
  public String a = null;
  public long[] b = aff.b;
  public amy c = null;
  public amt d = null;
  private Integer e = null;
  private Integer f = null;
  private Integer g = null;
  private anl h = null;
  private amz i = null;
  private ane j = null;
  
  public ana()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final ana b(aes paramaes)
  {
    for (;;)
    {
      int k = paramaes.a();
      switch (k)
      {
      default: 
        if (super.a(paramaes, k)) {
          continue;
        }
      case 0: 
        return this;
      case 72: 
        this.e = Integer.valueOf(paramaes.g());
        break;
      case 82: 
        this.a = paramaes.e();
        break;
      case 88: 
        this.f = Integer.valueOf(paramaes.g());
        break;
      case 96: 
        int i5 = paramaes.j();
        try
        {
          this.g = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(i5);
          a(paramaes, k);
        }
        break;
      case 106: 
        if (this.h == null) {
          this.h = new anl();
        }
        paramaes.a(this.h);
        break;
      case 112: 
        int i3 = aff.a(paramaes, 112);
        if (this.b == null) {}
        long[] arrayOfLong2;
        for (int i4 = 0;; i4 = this.b.length)
        {
          arrayOfLong2 = new long[i3 + i4];
          if (i4 != 0) {
            System.arraycopy(this.b, 0, arrayOfLong2, 0, i4);
          }
          while (i4 < -1 + arrayOfLong2.length)
          {
            arrayOfLong2[i4] = paramaes.h();
            paramaes.a();
            i4++;
          }
        }
        arrayOfLong2[i4] = paramaes.h();
        this.b = arrayOfLong2;
        break;
      case 114: 
        int m = paramaes.c(paramaes.g());
        int n = paramaes.j();
        for (int i1 = 0; paramaes.i() > 0; i1++) {
          paramaes.h();
        }
        paramaes.e(n);
        if (this.b == null) {}
        long[] arrayOfLong1;
        for (int i2 = 0;; i2 = this.b.length)
        {
          arrayOfLong1 = new long[i1 + i2];
          if (i2 != 0) {
            System.arraycopy(this.b, 0, arrayOfLong1, 0, i2);
          }
          while (i2 < arrayOfLong1.length)
          {
            arrayOfLong1[i2] = paramaes.h();
            i2++;
          }
        }
        this.b = arrayOfLong1;
        paramaes.d(m);
        break;
      case 122: 
        if (this.c == null) {
          this.c = new amy();
        }
        paramaes.a(this.c);
        break;
      case 130: 
        if (this.i == null) {
          this.i = new amz();
        }
        paramaes.a(this.i);
        break;
      case 138: 
        if (this.j == null) {
          this.j = new ane();
        }
        paramaes.a(this.j);
        break;
      }
      if (this.d == null) {
        this.d = new amt();
      }
      paramaes.a(this.d);
    }
  }
  
  protected final int a()
  {
    int k = 0;
    int m = super.a();
    if (this.e != null) {
      m += aeu.b(9, this.e.intValue());
    }
    if (this.a != null) {
      m += aeu.b(10, this.a);
    }
    if (this.f != null)
    {
      int i1 = this.f.intValue();
      m += aeu.b(11) + aeu.d(i1);
    }
    if (this.g != null) {
      m += aeu.b(12, this.g.intValue());
    }
    if (this.h != null) {
      m += aeu.b(13, this.h);
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int n = 0;
      while (k < this.b.length)
      {
        n += aeu.a(this.b[k]);
        k++;
      }
      m = m + n + 1 * this.b.length;
    }
    if (this.c != null) {
      m += aeu.b(15, this.c);
    }
    if (this.i != null) {
      m += aeu.b(16, this.i);
    }
    if (this.j != null) {
      m += aeu.b(17, this.j);
    }
    if (this.d != null) {
      m += aeu.b(18, this.d);
    }
    return m;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.e != null) {
      paramaeu.a(9, this.e.intValue());
    }
    if (this.a != null) {
      paramaeu.a(10, this.a);
    }
    if (this.f != null)
    {
      int n = this.f.intValue();
      paramaeu.c(11, 0);
      paramaeu.c(n);
    }
    if (this.g != null) {
      paramaeu.a(12, this.g.intValue());
    }
    if (this.h != null) {
      paramaeu.a(13, this.h);
    }
    if (this.b != null)
    {
      int k = this.b.length;
      int m = 0;
      if (k > 0) {
        while (m < this.b.length)
        {
          paramaeu.a(14, this.b[m]);
          m++;
        }
      }
    }
    if (this.c != null) {
      paramaeu.a(15, this.c);
    }
    if (this.i != null) {
      paramaeu.a(16, this.i);
    }
    if (this.j != null) {
      paramaeu.a(17, this.j);
    }
    if (this.d != null) {
      paramaeu.a(18, this.d);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ana
 * JD-Core Version:    0.7.0.1
 */