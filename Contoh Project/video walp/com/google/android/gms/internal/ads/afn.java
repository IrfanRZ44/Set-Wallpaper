package com.google.android.gms.internal.ads;

public final class afn
  extends aew<afn>
{
  public Integer a = null;
  public String b = null;
  public byte[] c = null;
  
  public afn()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final afn b(aes paramaes)
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
          k = paramaes.c();
          if ((k < 0) || (k > 1)) {
            break label110;
          }
          this.a = Integer.valueOf(k);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(j);
          a(paramaes, i);
        }
        continue;
        throw new IllegalArgumentException(36 + k + " is not a valid enum Type");
      case 18: 
        label110:
        this.b = paramaes.e();
        break;
      }
      this.c = paramaes.f();
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
 * Qualified Name:     com.google.android.gms.internal.ads.afn
 * JD-Core Version:    0.7.0.1
 */