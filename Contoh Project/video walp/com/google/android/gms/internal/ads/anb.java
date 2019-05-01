package com.google.android.gms.internal.ads;

public final class anb
  extends aew<anb>
{
  private String a = null;
  private Integer b = null;
  private int[] c = aff.a;
  private ank d = null;
  
  public anb()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final anb b(aes paramaes)
  {
    for (;;)
    {
      int i = paramaes.a();
      switch (i)
      {
      default: 
        if (super.a(paramaes, i)) {
          continue;
        }
      case 0: 
        return this;
      case 10: 
        this.a = paramaes.e();
        break;
      case 16: 
        int i3 = paramaes.j();
        try
        {
          this.b = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(i3);
          a(paramaes, i);
        }
        break;
      case 24: 
        int i1 = aff.a(paramaes, 24);
        if (this.c == null) {}
        int[] arrayOfInt2;
        for (int i2 = 0;; i2 = this.c.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0) {
            System.arraycopy(this.c, 0, arrayOfInt2, 0, i2);
          }
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = paramaes.g();
            paramaes.a();
            i2++;
          }
        }
        arrayOfInt2[i2] = paramaes.g();
        this.c = arrayOfInt2;
        break;
      case 26: 
        int j = paramaes.c(paramaes.g());
        int k = paramaes.j();
        for (int m = 0; paramaes.i() > 0; m++) {
          paramaes.g();
        }
        paramaes.e(k);
        if (this.c == null) {}
        int[] arrayOfInt1;
        for (int n = 0;; n = this.c.length)
        {
          arrayOfInt1 = new int[m + n];
          if (n != 0) {
            System.arraycopy(this.c, 0, arrayOfInt1, 0, n);
          }
          while (n < arrayOfInt1.length)
          {
            arrayOfInt1[n] = paramaes.g();
            n++;
          }
        }
        this.c = arrayOfInt1;
        paramaes.d(j);
        break;
      }
      if (this.d == null) {
        this.d = new ank();
      }
      paramaes.a(this.d);
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null) {
      j += aeu.b(1, this.a);
    }
    if (this.b != null) {
      j += aeu.b(2, this.b.intValue());
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int k = 0;
      while (i < this.c.length)
      {
        k += aeu.a(this.c[i]);
        i++;
      }
      j = j + k + 1 * this.c.length;
    }
    if (this.d != null) {
      j += aeu.b(4, this.d);
    }
    return j;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a);
    }
    if (this.b != null) {
      paramaeu.a(2, this.b.intValue());
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++) {
        paramaeu.a(3, this.c[i]);
      }
    }
    if (this.d != null) {
      paramaeu.a(4, this.d);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.anb
 * JD-Core Version:    0.7.0.1
 */