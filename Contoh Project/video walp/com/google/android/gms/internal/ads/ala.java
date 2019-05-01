package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class ala
  implements Runnable
{
  ala(akz paramakz) {}
  
  public final void run()
  {
    synchronized (akz.a(this.a))
    {
      if ((akz.b(this.a)) && (akz.c(this.a)))
      {
        akz.a(this.a, false);
        je.b("App went background");
        Iterator localIterator = akz.d(this.a).iterator();
        for (;;)
        {
          if (!localIterator.hasNext()) {
            break label113;
          }
          alb localalb = (alb)localIterator.next();
          try
          {
            localalb.a(false);
          }
          catch (Exception localException)
          {
            mk.b("", localException);
          }
        }
      }
    }
    je.b("App is still foreground");
    label113:
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ala
 * JD-Core Version:    0.7.0.1
 */