package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public final class bbc
{
  private final Object a = new Object();
  @GuardedBy("mLock")
  private bbj b;
  
  public final bbj a(Context paramContext, zzang paramzzang)
  {
    for (;;)
    {
      Context localContext;
      synchronized (this.a)
      {
        if (this.b == null)
        {
          localContext = paramContext.getApplicationContext();
          if (localContext == null)
          {
            arq localarq = asa.a;
            this.b = new bbj(paramContext, paramzzang, (String)aos.f().a(localarq));
          }
        }
        else
        {
          bbj localbbj = this.b;
          return localbbj;
        }
      }
      paramContext = localContext;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbc
 * JD-Core Version:    0.7.0.1
 */