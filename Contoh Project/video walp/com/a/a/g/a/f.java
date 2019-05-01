package com.a.a.g.a;

import com.a.a.i.i;

public abstract class f<Z>
  extends a<Z>
{
  private final int a;
  private final int b;
  
  public f()
  {
    this(-2147483648, -2147483648);
  }
  
  public f(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final void a(g paramg)
  {
    if (!i.a(this.a, this.b)) {
      throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.a + " and height: " + this.b + ", either provide dimensions in the constructor or call override()");
    }
    paramg.a(this.a, this.b);
  }
  
  public void b(g paramg) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.g.a.f
 * JD-Core Version:    0.7.0.1
 */