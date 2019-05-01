package com.google.android.gms.internal.ads;

public final class acr
  extends aew<acr>
{
  private Long a = null;
  private Integer b = null;
  private Boolean c = null;
  private int[] d = aff.a;
  private Long e = null;
  
  public acr()
  {
    this.Z = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null) {
      j += aeu.d(1, this.a.longValue());
    }
    if (this.b != null) {
      j += aeu.b(2, this.b.intValue());
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      j += 1 + aeu.b(3);
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int k = 0;
      while (i < this.d.length)
      {
        k += aeu.a(this.d[i]);
        i++;
      }
      j = j + k + 1 * this.d.length;
    }
    if (this.e != null) {
      j += aeu.c(5, this.e.longValue());
    }
    return j;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.a != null) {
      paramaeu.b(1, this.a.longValue());
    }
    if (this.b != null) {
      paramaeu.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramaeu.a(3, this.c.booleanValue());
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++) {
        paramaeu.a(4, this.d[i]);
      }
    }
    if (this.e != null) {
      paramaeu.a(5, this.e.longValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.acr
 * JD-Core Version:    0.7.0.1
 */