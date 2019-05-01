package com.google.android.gms.internal.ads;

public final class aft
  extends aew<aft>
{
  public byte[][] a = aff.d;
  public byte[] b = null;
  public Integer c;
  private Integer d;
  
  public aft()
  {
    this.Z = -1;
  }
  
  private final aft b(aes paramaes)
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
        int m = aff.a(paramaes, 10);
        if (this.a == null) {}
        byte[][] arrayOfByte;
        for (int n = 0;; n = this.a.length)
        {
          arrayOfByte = new byte[m + n][];
          if (n != 0) {
            System.arraycopy(this.a, 0, arrayOfByte, 0, n);
          }
          while (n < -1 + arrayOfByte.length)
          {
            arrayOfByte[n] = paramaes.f();
            paramaes.a();
            n++;
          }
        }
        arrayOfByte[n] = paramaes.f();
        this.a = arrayOfByte;
        break;
      case 18: 
        this.b = paramaes.f();
        break;
      case 24: 
        int k = paramaes.j();
        try
        {
          this.d = Integer.valueOf(ym.b(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          paramaes.e(k);
          a(paramaes, i);
        }
        break;
      }
      int j = paramaes.j();
      try
      {
        this.c = Integer.valueOf(ym.c(paramaes.g()));
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        paramaes.e(j);
        a(paramaes, i);
      }
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int m;
    int n;
    if ((this.a != null) && (this.a.length > 0))
    {
      m = 0;
      n = 0;
      while (i < this.a.length)
      {
        byte[] arrayOfByte = this.a[i];
        if (arrayOfByte != null)
        {
          n++;
          m += aeu.b(arrayOfByte);
        }
        i++;
      }
    }
    for (int k = j + m + n * 1;; k = j)
    {
      if (this.b != null) {
        k += aeu.b(2, this.b);
      }
      if (this.d != null) {
        k += aeu.b(3, this.d.intValue());
      }
      if (this.c != null) {
        k += aeu.b(4, this.c.intValue());
      }
      return k;
    }
  }
  
  public final void a(aeu paramaeu)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        byte[] arrayOfByte = this.a[i];
        if (arrayOfByte != null) {
          paramaeu.a(1, arrayOfByte);
        }
      }
    }
    if (this.b != null) {
      paramaeu.a(2, this.b);
    }
    if (this.d != null) {
      paramaeu.a(3, this.d.intValue());
    }
    if (this.c != null) {
      paramaeu.a(4, this.c.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aft
 * JD-Core Version:    0.7.0.1
 */