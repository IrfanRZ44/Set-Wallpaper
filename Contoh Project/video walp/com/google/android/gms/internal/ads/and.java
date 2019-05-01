package com.google.android.gms.internal.ads;

public final class and
  extends aew<and>
{
  private anb a = null;
  private anj[] b = anj.b();
  private Integer c = null;
  private ank d = null;
  
  public and()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final and b(aes paramaes)
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
        if (this.a == null) {
          this.a = new anb();
        }
        paramaes.a(this.a);
        break;
      case 18: 
        int k = aff.a(paramaes, 18);
        if (this.b == null) {}
        anj[] arrayOfanj;
        for (int m = 0;; m = this.b.length)
        {
          arrayOfanj = new anj[k + m];
          if (m != 0) {
            System.arraycopy(this.b, 0, arrayOfanj, 0, m);
          }
          while (m < -1 + arrayOfanj.length)
          {
            arrayOfanj[m] = new anj();
            paramaes.a(arrayOfanj[m]);
            paramaes.a();
            m++;
          }
        }
        arrayOfanj[m] = new anj();
        paramaes.a(arrayOfanj[m]);
        this.b = arrayOfanj;
        break;
      case 24: 
        int j = paramaes.j();
        try
        {
          this.c = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(j);
          a(paramaes, i);
        }
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
    int i = super.a();
    if (this.a != null) {
      i += aeu.b(1, this.a);
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        anj localanj = this.b[k];
        if (localanj != null) {
          j += aeu.b(2, localanj);
        }
      }
      i = j;
    }
    if (this.c != null) {
      i += aeu.b(3, this.c.intValue());
    }
    if (this.d != null) {
      i += aeu.b(4, this.d);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        anj localanj = this.b[i];
        if (localanj != null) {
          paramaeu.a(2, localanj);
        }
      }
    }
    if (this.c != null) {
      paramaeu.a(3, this.c.intValue());
    }
    if (this.d != null) {
      paramaeu.a(4, this.d);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.and
 * JD-Core Version:    0.7.0.1
 */