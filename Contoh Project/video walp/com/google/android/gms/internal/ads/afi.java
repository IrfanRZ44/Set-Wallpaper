package com.google.android.gms.internal.ads;

public final class afi
  extends aew<afi>
{
  private static volatile afi[] c;
  public byte[] a = null;
  public byte[] b = null;
  
  public afi()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  public static afi[] b()
  {
    if (c == null) {}
    synchronized (afa.b)
    {
      if (c == null) {
        c = new afi[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a() + aeu.b(1, this.a);
    if (this.b != null) {
      i += aeu.b(2, this.b);
    }
    return i;
  }
  
  public final void a(aeu paramaeu)
  {
    paramaeu.a(1, this.a);
    if (this.b != null) {
      paramaeu.a(2, this.b);
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afi
 * JD-Core Version:    0.7.0.1
 */