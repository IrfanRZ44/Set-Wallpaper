package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.c.a;

final class axg
  implements c.a
{
  axg(axe paramaxe, np paramnp, zzsg paramzzsg) {}
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle)
  {
    awz localawz;
    synchronized (axe.b(this.a))
    {
      if (axe.c(this.a)) {
        return;
      }
      axe.a(this.a, true);
      localawz = axe.d(this.a);
      if (localawz == null) {
        return;
      }
    }
    ne localne = jl.a(new axh(this, localawz, this.b, this.c));
    this.b.a(new axi(this.b, localne), nk.b);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.axg
 * JD-Core Version:    0.7.0.1
 */