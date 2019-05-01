package com.google.android.gms.internal.ads;

public final class ank
  extends aew<ank>
{
  private static volatile ank[] a;
  private Integer b = null;
  private Integer c = null;
  
  public ank()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  public static ank[] b()
  {
    if (a == null) {}
    synchronized (afa.b)
    {
      if (a == null) {
        a = new ank[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += aeu.b(1, this.b.intValue());
    }
    if (this.c != null) {
      i += aeu.b(2, this.c.intValue());
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.b != null) {
      paramaeu.a(1, this.b.intValue());
    }
    if (this.c != null) {
      paramaeu.a(2, this.c.intValue());
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ank
 * JD-Core Version:    0.7.0.1
 */