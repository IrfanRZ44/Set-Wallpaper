package com.google.android.gms.internal.ads;

public final class amv
  extends aew<amv>
{
  private String a = null;
  private amu[] b = amu.b();
  private Integer c = null;
  
  public amv()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final amv b(aes paramaes)
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
      case 18: 
        int k = aff.a(paramaes, 18);
        if (this.b == null) {}
        amu[] arrayOfamu;
        for (int m = 0;; m = this.b.length)
        {
          arrayOfamu = new amu[k + m];
          if (m != 0) {
            System.arraycopy(this.b, 0, arrayOfamu, 0, m);
          }
          while (m < -1 + arrayOfamu.length)
          {
            arrayOfamu[m] = new amu();
            paramaes.a(arrayOfamu[m]);
            paramaes.a();
            m++;
          }
        }
        arrayOfamu[m] = new amu();
        paramaes.a(arrayOfamu[m]);
        this.b = arrayOfamu;
        break;
      }
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
        amu localamu = this.b[k];
        if (localamu != null) {
          j += aeu.b(2, localamu);
        }
      }
      i = j;
    }
    if (this.c != null) {
      i += aeu.b(3, this.c.intValue());
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
        amu localamu = this.b[i];
        if (localamu != null) {
          paramaeu.a(2, localamu);
        }
      }
    }
    if (this.c != null) {
      paramaeu.a(3, this.c.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amv
 * JD-Core Version:    0.7.0.1
 */