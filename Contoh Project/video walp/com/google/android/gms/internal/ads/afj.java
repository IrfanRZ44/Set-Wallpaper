package com.google.android.gms.internal.ads;

public final class afj
  extends aew<afj>
{
  public afi[] a = afi.b();
  private afk b = null;
  private byte[] c = null;
  private byte[] d = null;
  private Integer e = null;
  
  public afj()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += aeu.b(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.a.length; k++)
      {
        afi localafi = this.a[k];
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
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.b != null) {
      paramaeu.a(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        afi localafi = this.a[i];
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
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afj
 * JD-Core Version:    0.7.0.1
 */