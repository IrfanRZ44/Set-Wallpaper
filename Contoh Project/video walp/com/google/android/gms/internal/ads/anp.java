package com.google.android.gms.internal.ads;

public final class anp
  extends aew<anp>
{
  private anl a = null;
  private Integer b = null;
  private ano c = null;
  private ank d = null;
  
  public anp()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final anp b(aes paramaes)
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
          this.a = new anl();
        }
        paramaes.a(this.a);
        break;
      case 16: 
        int j = paramaes.j();
        try
        {
          this.b = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(j);
          a(paramaes, i);
        }
        break;
      case 26: 
        if (this.c == null) {
          this.c = new ano();
        }
        paramaes.a(this.c);
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
    if (this.b != null) {
      i += aeu.b(2, this.b.intValue());
    }
    if (this.c != null) {
      i += aeu.b(3, this.c);
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
    if (this.b != null) {
      paramaeu.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramaeu.a(3, this.c);
    }
    if (this.d != null) {
      paramaeu.a(4, this.d);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.anp
 * JD-Core Version:    0.7.0.1
 */