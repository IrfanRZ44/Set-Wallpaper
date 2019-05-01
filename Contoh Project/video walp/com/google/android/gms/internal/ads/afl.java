package com.google.android.gms.internal.ads;

public final class afl
  extends aew<afl>
{
  private afm a = null;
  private afi[] b = afi.b();
  private byte[] c = null;
  private byte[] d = null;
  private Integer e = null;
  private byte[] f = null;
  
  public afl()
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
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        afi localafi = this.b[k];
        if (localafi != null) {
          j += aeu.b(2, localafi);
        }
      }
      i = j;
    }
    if (this.c != null) {
      i += aeu.b(3, this.c);
    }
    if (this.d != null) {
      i += aeu.b(4, this.d);
    }
    if (this.e != null) {
      i += aeu.b(5, this.e.intValue());
    }
    if (this.f != null) {
      i += aeu.b(6, this.f);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.a(1, this.a);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        afi localafi = this.b[i];
        if (localafi != null) {
          paramaeu.a(2, localafi);
        }
      }
    }
    if (this.c != null) {
      paramaeu.a(3, this.c);
    }
    if (this.d != null) {
      paramaeu.a(4, this.d);
    }
    if (this.e != null) {
      paramaeu.a(5, this.e.intValue());
    }
    if (this.f != null) {
      paramaeu.a(6, this.f);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afl
 * JD-Core Version:    0.7.0.1
 */