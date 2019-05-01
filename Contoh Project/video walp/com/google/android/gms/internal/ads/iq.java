package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

final class iq
  extends iz
{
  iq(io paramio) {}
  
  public final void a()
  {
    asc localasc = new asc(io.a(this.a), io.b(this.a).a);
    synchronized (io.c(this.a))
    {
      try
      {
        zzbv.zzet();
        asf.a(io.d(this.a), localasc);
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          je.c("Cannot config CSI reporter.", localIllegalArgumentException);
        }
      }
    }
  }
  
  public final void b_() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.iq
 * JD-Core Version:    0.7.0.1
 */