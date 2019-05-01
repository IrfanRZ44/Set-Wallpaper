package com.google.android.gms.internal.ads;

import android.os.Handler;

final class cy
  implements Runnable
{
  cy(cp paramcp, nr paramnr) {}
  
  public final void run()
  {
    synchronized (cp.a(this.b))
    {
      this.b.a = this.b.a(cp.b(this.b).j, this.a);
      if (this.b.a == null)
      {
        cp.a(this.b, 0, "Could not start the ad request service.");
        jn.a.removeCallbacks(cp.c(this.b));
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.cy
 * JD-Core Version:    0.7.0.1
 */