package com.google.android.gms.internal.ads;

final class cx
  implements Runnable
{
  cx(cp paramcp) {}
  
  public final void run()
  {
    synchronized (cp.a(this.a))
    {
      if (this.a.a == null) {
        return;
      }
      this.a.b_();
      cp.a(this.a, 2, "Timed out waiting for ad response.");
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.cx
 * JD-Core Version:    0.7.0.1
 */