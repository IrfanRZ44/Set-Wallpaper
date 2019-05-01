package com.google.android.gms.internal.ads;

public final class ane
  extends aew<ane>
{
  private Integer a = null;
  private Integer b = null;
  
  public ane()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final ane b(aes paramaes)
  {
    int i;
    int n;
    for (;;)
    {
      i = paramaes.a();
      switch (i)
      {
      default: 
        if (super.a(paramaes, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        int m = paramaes.j();
        try
        {
          n = paramaes.g();
          if ((n < 0) || (n > 2)) {
            break label104;
          }
          this.a = Integer.valueOf(n);
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          paramaes.e(m);
          a(paramaes, i);
        }
      }
    }
    label104:
    throw new IllegalArgumentException(43 + n + " is not a valid enum NetworkType");
    int j = paramaes.j();
    int k;
    do
    {
      try
      {
        k = paramaes.g();
        if ((k < 0) || (k > 2)) {
          continue;
        }
        this.b = Integer.valueOf(k);
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        paramaes.e(j);
        a(paramaes, i);
      }
      break;
    } while ((k >= 4) && (k <= 4));
    throw new IllegalArgumentException(51 + k + " is not a valid enum CellularNetworkType");
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += aeu.b(1, this.a.intValue());
    }
    if (this.b != null) {
      i += aeu.b(2, this.b.intValue());
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramaeu.a(2, this.b.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ane
 * JD-Core Version:    0.7.0.1
 */