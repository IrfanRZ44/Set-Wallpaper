package com.google.android.gms.internal.ads;

public final class amx
  extends aew<amx>
{
  private Integer a = null;
  private ank b = null;
  private ank c = null;
  private ank d = null;
  private ank[] e = ank.b();
  private Integer f = null;
  
  public amx()
  {
    this.Y = null;
    this.Z = -1;
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
    if (this.d != null) {
      i += aeu.b(4, this.d);
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.e.length; k++)
      {
        ank localank = this.e[k];
        if (localank != null) {
          j += aeu.b(5, localank);
        }
      }
      i = j;
    }
    if (this.f != null) {
      i += aeu.b(6, this.f.intValue());
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
    if (this.d != null) {
      paramaeu.a(4, this.d);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i = 0; i < this.e.length; i++)
      {
        ank localank = this.e[i];
        if (localank != null) {
          paramaeu.a(5, localank);
        }
      }
    }
    if (this.f != null) {
      paramaeu.a(6, this.f.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amx
 * JD-Core Version:    0.7.0.1
 */