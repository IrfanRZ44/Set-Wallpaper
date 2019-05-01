package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c.a;

final class alz
  implements c.a
{
  alz(alw paramalw) {}
  
  public final void a(int paramInt)
  {
    synchronized (alw.c(this.a))
    {
      alw.a(this.a, null);
      alw.c(this.a).notifyAll();
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    synchronized (alw.c(this.a))
    {
      try
      {
        if (alw.d(this.a) != null) {
          alw.a(this.a, alw.d(this.a).x());
        }
        alw.c(this.a).notifyAll();
        return;
      }
      catch (DeadObjectException localDeadObjectException)
      {
        for (;;)
        {
          je.b("Unable to obtain a cache service instance.", localDeadObjectException);
          alw.a(this.a);
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.alz
 * JD-Core Version:    0.7.0.1
 */