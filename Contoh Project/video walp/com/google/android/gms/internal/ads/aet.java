package com.google.android.gms.internal.ads;

public final class aet
  extends aew<aet>
{
  public Long a = null;
  private String b = null;
  private byte[] c = null;
  
  public aet()
  {
    this.Z = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += aeu.d(1, this.a.longValue());
    }
    if (this.b != null) {
      i += aeu.b(3, this.b);
    }
    if (this.c != null) {
      i += aeu.b(4, this.c);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.b(1, this.a.longValue());
    }
    if (this.b != null) {
      paramaeu.a(3, this.b);
    }
    if (this.c != null) {
      paramaeu.a(4, this.c);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aet
 * JD-Core Version:    0.7.0.1
 */