package com.google.android.gms.internal.ads;

public final class anl
  extends aew<anl>
{
  public Integer a = null;
  public Integer b = null;
  public Integer c = null;
  
  public anl()
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
      i += aeu.b(2, this.b.intValue());
    }
    if (this.c != null) {
      i += aeu.b(3, this.c.intValue());
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramaeu.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramaeu.a(3, this.c.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.anl
 * JD-Core Version:    0.7.0.1
 */