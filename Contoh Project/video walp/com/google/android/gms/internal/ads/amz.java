package com.google.android.gms.internal.ads;

public final class amz
  extends aew<amz>
{
  private Integer a = null;
  private anl b = null;
  private String c = null;
  private String d = null;
  
  public amz()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final amz b(aes paramaes)
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
      case 40: 
        int j = paramaes.j();
        int k;
        try
        {
          k = paramaes.g();
          if ((k < 0) || (k > 2)) {
            break label118;
          }
          this.a = Integer.valueOf(k);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(j);
          a(paramaes, i);
        }
        continue;
        throw new IllegalArgumentException(40 + k + " is not a valid enum Platform");
      case 50: 
        if (this.b == null) {
          this.b = new anl();
        }
        paramaes.a(this.b);
        break;
      case 58: 
        label118:
        this.c = paramaes.e();
        break;
      }
      this.d = paramaes.e();
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += aeu.b(5, this.a.intValue());
    }
    if (this.b != null) {
      i += aeu.b(6, this.b);
    }
    if (this.c != null) {
      i += aeu.b(7, this.c);
    }
    if (this.d != null) {
      i += aeu.b(8, this.d);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(5, this.a.intValue());
    }
    if (this.b != null) {
      paramaeu.a(6, this.b);
    }
    if (this.c != null) {
      paramaeu.a(7, this.c);
    }
    if (this.d != null) {
      paramaeu.a(8, this.d);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amz
 * JD-Core Version:    0.7.0.1
 */