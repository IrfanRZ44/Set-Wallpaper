package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;

final class d
  implements Runnable
{
  d(zzah paramzzah, zzjj paramzzjj) {}
  
  public final void run()
  {
    synchronized (zzah.a(this.b))
    {
      if (zzah.b(this.b))
      {
        zzah.a(this.b, this.a);
        return;
      }
      zzah.a(this.b, this.a, 1);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.d
 * JD-Core Version:    0.7.0.1
 */