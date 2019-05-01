package com.google.android.gms.internal.ads;

public final class amu
  extends aew<amu>
{
  private static volatile amu[] a;
  private Integer b = null;
  private ani c = null;
  
  public amu()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final amu b(aes paramaes)
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
        int k;
        try
        {
          k = paramaes.g();
          if ((k < 0) || (k > 10)) {
            break label103;
          }
          this.b = Integer.valueOf(k);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(j);
          a(paramaes, i);
        }
        continue;
        label103:
        throw new IllegalArgumentException(44 + k + " is not a valid enum AdFormatType");
      }
      if (this.c == null) {
        this.c = new ani();
      }
      paramaes.a(this.c);
    }
  }
  
  public static amu[] b()
  {
    if (a == null) {}
    synchronized (afa.b)
    {
      if (a == null) {
        a = new amu[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += aeu.b(1, this.b.intValue());
    }
    if (this.c != null) {
      i += aeu.b(2, this.c);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.b != null) {
      paramaeu.a(1, this.b.intValue());
    }
    if (this.c != null) {
      paramaeu.a(2, this.c);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amu
 * JD-Core Version:    0.7.0.1
 */