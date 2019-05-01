package com.google.android.gms.internal.ads;

public final class anc
  extends aew<anc>
{
  private Integer a = null;
  private int[] b = aff.a;
  
  public anc()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final anc b(aes paramaes)
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
      case 8: 
        int i3 = paramaes.j();
        try
        {
          this.a = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(i3);
          a(paramaes, i);
        }
        break;
      case 16: 
        int i1 = aff.a(paramaes, 16);
        if (this.b == null) {}
        int[] arrayOfInt2;
        for (int i2 = 0;; i2 = this.b.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0) {
            System.arraycopy(this.b, 0, arrayOfInt2, 0, i2);
          }
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = paramaes.g();
            paramaes.a();
            i2++;
          }
        }
        arrayOfInt2[i2] = paramaes.g();
        this.b = arrayOfInt2;
        break;
      }
      int j = paramaes.c(paramaes.g());
      int k = paramaes.j();
      for (int m = 0; paramaes.i() > 0; m++) {
        paramaes.g();
      }
      paramaes.e(k);
      if (this.b == null) {}
      int[] arrayOfInt1;
      for (int n = 0;; n = this.b.length)
      {
        arrayOfInt1 = new int[m + n];
        if (n != 0) {
          System.arraycopy(this.b, 0, arrayOfInt1, 0, n);
        }
        while (n < arrayOfInt1.length)
        {
          arrayOfInt1[n] = paramaes.g();
          n++;
        }
      }
      this.b = arrayOfInt1;
      paramaes.d(j);
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null) {
      j += aeu.b(1, this.a.intValue());
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int k = 0;
      while (i < this.b.length)
      {
        k += aeu.a(this.b[i]);
        i++;
      }
      j = j + k + 1 * this.b.length;
    }
    return j;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a.intValue());
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++) {
        paramaeu.a(2, this.b[i]);
      }
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.anc
 * JD-Core Version:    0.7.0.1
 */