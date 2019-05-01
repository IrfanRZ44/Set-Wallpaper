package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

final class agr
  implements Runnable
{
  agr(agq paramagq) {}
  
  public final void run()
  {
    if (this.a.b != null) {
      return;
    }
    synchronized (agq.b())
    {
      if (this.a.b != null) {
        return;
      }
    }
    arq localarq = asa.bC;
    boolean bool1 = ((Boolean)aos.f().a(localarq)).booleanValue();
    boolean bool2 = bool1;
    if (bool2) {}
    try
    {
      agq.a = new amo(agq.a(this.a).a, "ADSHIELD", null);
      this.a.b = Boolean.valueOf(bool2);
      agq.b().open();
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        bool2 = false;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.agr
 * JD-Core Version:    0.7.0.1
 */