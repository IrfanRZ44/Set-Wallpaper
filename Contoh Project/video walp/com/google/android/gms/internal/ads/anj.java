package com.google.android.gms.internal.ads;

public final class anj
  extends aew<anj>
{
  private static volatile anj[] a;
  private String b = null;
  private Integer c = null;
  private ank d = null;
  
  public anj()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final anj b(aes paramaes)
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
        this.b = paramaes.e();
        break;
      case 16: 
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
  
  public static anj[] b()
  {
    if (a == null) {}
    synchronized (afa.b)
    {
      if (a == null) {
        a = new anj[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += aeu.b(1, this.b);
    }
    if (this.c != null) {
      i += aeu.b(2, this.c.intValue());
    }
    if (this.d != null) {
      i += aeu.b(3, this.d);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.b != null) {
      paramaeu.a(1, this.b);
    }
    if (this.c != null) {
      paramaeu.a(2, this.c.intValue());
    }
    if (this.d != null) {
      paramaeu.a(3, this.d);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.anj
 * JD-Core Version:    0.7.0.1
 */