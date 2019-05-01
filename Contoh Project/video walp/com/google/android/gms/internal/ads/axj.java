package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c.b;

final class axj
  implements c.b
{
  axj(axe paramaxe, np paramnp) {}
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    synchronized (axe.b(this.b))
    {
      this.a.a(new RuntimeException("Connection failed."));
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.axj
 * JD-Core Version:    0.7.0.1
 */