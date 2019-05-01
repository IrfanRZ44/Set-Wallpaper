package com.google.android.gms.internal.ads;

public final class anq
  extends aew<anq>
{
  private Integer a = null;
  private ano b = null;
  private Integer c = null;
  private Integer d = null;
  private Integer e = null;
  
  public anq()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final anq b(aes paramaes)
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
        int j = paramaes.j();
        try
        {
          this.a = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(j);
          a(paramaes, i);
        }
        break;
      case 18: 
        if (this.b == null) {
          this.b = new ano();
        }
        paramaes.a(this.b);
        break;
      case 24: 
        this.c = Integer.valueOf(paramaes.g());
        break;
      case 32: 
        this.d = Integer.valueOf(paramaes.g());
        break;
      }
      this.e = Integer.valueOf(paramaes.g());
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += aeu.b(1, this.a.intValue());
    }
    if (this.b != null) {
      i += aeu.b(2, this.b);
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
      paramaeu.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramaeu.a(2, this.b);
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
 * Qualified Name:     com.google.android.gms.internal.ads.anq
 * JD-Core Version:    0.7.0.1
 */