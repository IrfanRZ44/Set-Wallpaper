package com.google.android.gms.internal.ads;

public final class afp
  extends aew<afp>
{
  public String a = null;
  public Long b = null;
  public Boolean c = null;
  
  public afp()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += aeu.b(1, this.a);
    }
    if (this.b != null) {
      i += aeu.d(2, this.b.longValue());
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + aeu.b(3);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a);
    }
    if (this.b != null) {
      paramaeu.b(2, this.b.longValue());
    }
    if (this.c != null) {
      paramaeu.a(3, this.c.booleanValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afp
 * JD-Core Version:    0.7.0.1
 */