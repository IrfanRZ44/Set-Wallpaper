package com.google.android.gms.internal.ads;

public final class ban
  extends nv<bax>
{
  private final Object a = new Object();
  private final bar b;
  private boolean c;
  
  public ban(bar parambar)
  {
    this.b = parambar;
  }
  
  public final void c()
  {
    synchronized (this.a)
    {
      if (this.c) {
        return;
      }
      this.c = true;
      a(new bao(this), new nt());
      a(new bap(this), new baq(this));
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ban
 * JD-Core Version:    0.7.0.1
 */