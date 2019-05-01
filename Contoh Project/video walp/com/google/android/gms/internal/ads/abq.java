package com.google.android.gms.internal.ads;

public final class abq
  extends aew<abq>
{
  public Long a = null;
  public Long b = null;
  public Long c = null;
  private Long d = null;
  private Long e = null;
  
  public abq()
  {
    this.Z = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.d != null) {
      i += aeu.d(1, this.d.longValue());
    }
    if (this.e != null) {
      i += aeu.d(2, this.e.longValue());
    }
    if (this.a != null) {
      i += aeu.d(3, this.a.longValue());
    }
    if (this.b != null) {
      i += aeu.d(4, this.b.longValue());
    }
    if (this.c != null) {
      i += aeu.d(5, this.c.longValue());
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.d != null) {
      paramaeu.b(1, this.d.longValue());
    }
    if (this.e != null) {
      paramaeu.b(2, this.e.longValue());
    }
    if (this.a != null) {
      paramaeu.b(3, this.a.longValue());
    }
    if (this.b != null) {
      paramaeu.b(4, this.b.longValue());
    }
    if (this.c != null) {
      paramaeu.b(5, this.c.longValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abq
 * JD-Core Version:    0.7.0.1
 */