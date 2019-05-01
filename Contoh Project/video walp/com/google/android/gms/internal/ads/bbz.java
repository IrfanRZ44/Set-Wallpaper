package com.google.android.gms.internal.ads;

final class bbz
  implements Runnable
{
  bbz(bby parambby, bbx parambbx) {}
  
  public final void run()
  {
    synchronized (bby.a(this.b))
    {
      if (bby.b(this.b) != -2) {
        return;
      }
      bby.a(this.b, bby.c(this.b));
      if (bby.d(this.b) == null)
      {
        this.b.a(4);
        return;
      }
    }
    if ((bby.e(this.b)) && (!bby.a(this.b, 1)))
    {
      String str = bby.f(this.b);
      je.e(56 + String.valueOf(str).length() + "Ignoring adapter " + str + " as delayed impression is not supported");
      this.b.a(2);
      return;
    }
    this.a.a(this.b);
    bby.a(this.b, this.a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbz
 * JD-Core Version:    0.7.0.1
 */