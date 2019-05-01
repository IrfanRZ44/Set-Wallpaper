package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class ex
  implements zzv<Object>
{
  ex(eu parameu) {}
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    fa localfa;
    synchronized (eu.a(this.a))
    {
      if (eu.b(this.a).isDone()) {
        return;
      }
      localfa = new fa(-2, paramMap);
      if (!eu.c(this.a).equals(localfa.h())) {
        return;
      }
    }
    eu.b(this.a).b(localfa);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ex
 * JD-Core Version:    0.7.0.1
 */