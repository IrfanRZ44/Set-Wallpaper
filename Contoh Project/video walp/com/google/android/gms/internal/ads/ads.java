package com.google.android.gms.internal.ads;

public final class ads
  extends aew<ads>
{
  public byte[] a = null;
  public byte[] b = null;
  public byte[] c = null;
  public byte[] d = null;
  
  public ads()
  {
    this.Z = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += aeu.b(1, this.a);
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
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a);
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
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ads
 * JD-Core Version:    0.7.0.1
 */