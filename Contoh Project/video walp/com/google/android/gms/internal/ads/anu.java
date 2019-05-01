package com.google.android.gms.internal.ads;

public final class anu
  extends aew<anu>
{
  private Integer a = null;
  private ano b = null;
  private ank c = null;
  
  public anu()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final anu b(aes paramaes)
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
      }
      if (this.c == null) {
        this.c = new ank();
      }
      paramaes.a(this.c);
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
      i += aeu.b(3, this.c);
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
      paramaeu.a(3, this.c);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.anu
 * JD-Core Version:    0.7.0.1
 */