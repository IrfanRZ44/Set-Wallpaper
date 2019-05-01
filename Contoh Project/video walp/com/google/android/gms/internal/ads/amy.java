package com.google.android.gms.internal.ads;

public final class amy
  extends aew<amy>
{
  public String a = null;
  public anl b = null;
  private ank c = null;
  private Integer d = null;
  private Integer e = null;
  private Integer f = null;
  private Integer g = null;
  private Integer h = null;
  
  public amy()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final amy b(aes paramaes)
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
        if (this.c == null) {
          this.c = new ank();
        }
        paramaes.a(this.c);
        break;
      case 24: 
        this.d = Integer.valueOf(paramaes.g());
        break;
      case 34: 
        if (this.b == null) {
          this.b = new anl();
        }
        paramaes.a(this.b);
        break;
      case 40: 
        this.e = Integer.valueOf(paramaes.g());
        break;
      case 48: 
        int m = paramaes.j();
        try
        {
          this.f = Integer.valueOf(ams.a(paramaes.g()));
        }
        catch (IllegalArgumentException localIllegalArgumentException3)
        {
          paramaes.e(m);
          a(paramaes, i);
        }
        break;
      case 56: 
        int k = paramaes.j();
        try
        {
          this.g = Integer.valueOf(ams.a(paramaes.g()));
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
        this.h = Integer.valueOf(ams.a(paramaes.g()));
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
    if (this.c != null) {
      i += aeu.b(2, this.c);
    }
    if (this.d != null) {
      i += aeu.b(3, this.d.intValue());
    }
    if (this.b != null) {
      i += aeu.b(4, this.b);
    }
    if (this.e != null) {
      i += aeu.b(5, this.e.intValue());
    }
    if (this.f != null) {
      i += aeu.b(6, this.f.intValue());
    }
    if (this.g != null) {
      i += aeu.b(7, this.g.intValue());
    }
    if (this.h != null) {
      i += aeu.b(8, this.h.intValue());
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a);
    }
    if (this.c != null) {
      paramaeu.a(2, this.c);
    }
    if (this.d != null) {
      paramaeu.a(3, this.d.intValue());
    }
    if (this.b != null) {
      paramaeu.a(4, this.b);
    }
    if (this.e != null) {
      paramaeu.a(5, this.e.intValue());
    }
    if (this.f != null) {
      paramaeu.a(6, this.f.intValue());
    }
    if (this.g != null) {
      paramaeu.a(7, this.g.intValue());
    }
    if (this.h != null) {
      paramaeu.a(8, this.h.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amy
 * JD-Core Version:    0.7.0.1
 */