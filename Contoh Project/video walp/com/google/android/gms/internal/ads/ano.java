package com.google.android.gms.internal.ads;

public final class ano
  extends aew<ano>
{
  private Integer a = null;
  
  public ano()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final ano b(aes paramaes)
  {
    int k;
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
      }
      int j = paramaes.j();
      try
      {
        k = paramaes.g();
        if ((k < 0) || (k > 3)) {
          break;
        }
        this.a = Integer.valueOf(k);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        paramaes.e(j);
        a(paramaes, i);
      }
    }
    throw new IllegalArgumentException(46 + k + " is not a valid enum VideoErrorCode");
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += aeu.b(1, this.a.intValue());
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ano
 * JD-Core Version:    0.7.0.1
 */