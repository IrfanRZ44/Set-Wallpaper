package com.google.android.gms.internal.ads;

public final class amw
  extends aew<amw>
{
  private String a = null;
  private amu[] b = amu.b();
  private Integer c = null;
  private Integer d = null;
  private Integer e = null;
  
  public amw()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final amw b(aes paramaes)
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
        int n = aff.a(paramaes, 18);
        if (this.b == null) {}
        amu[] arrayOfamu;
        for (int i1 = 0;; i1 = this.b.length)
        {
          arrayOfamu = new amu[n + i1];
          if (i1 != 0) {
            System.arraycopy(this.b, 0, arrayOfamu, 0, i1);
          }
          while (i1 < -1 + arrayOfamu.length)
          {
            arrayOfamu[i1] = new amu();
            paramaes.a(arrayOfamu[i1]);
            paramaes.a();
            i1++;
          }
        }
        arrayOfamu[i1] = new amu();
        paramaes.a(arrayOfamu[i1]);
        this.b = arrayOfamu;
        break;
      case 24: 
        int m = paramaes.j();
        try
        {
          this.c = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException3)
        {
          paramaes.e(m);
          a(paramaes, i);
        }
        break;
      case 32: 
        int k = paramaes.j();
        try
        {
          this.d = Integer.valueOf(ams.a(paramaes.g()));
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
        this.e = Integer.valueOf(ams.a(paramaes.g()));
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
    if (this.d != null) {
      i += aeu.b(4, this.d.intValue());
    }
    if (this.e != null) {
      i += aeu.b(5, this.e.intValue());
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
    if (this.d != null) {
      paramaeu.a(4, this.d.intValue());
    }
    if (this.e != null) {
      paramaeu.a(5, this.e.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amw
 * JD-Core Version:    0.7.0.1
 */