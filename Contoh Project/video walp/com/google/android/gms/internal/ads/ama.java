package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c.b;

final class ama
  implements c.b
{
  ama(alw paramalw) {}
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    synchronized (alw.c(this.a))
    {
      alw.a(this.a, null);
      if (alw.d(this.a) != null) {
        alw.a(this.a, null);
      }
      alw.c(this.a).notifyAll();
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ama
 * JD-Core Version:    0.7.0.1
 */