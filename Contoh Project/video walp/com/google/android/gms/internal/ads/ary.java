package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.common.i;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class ary
{
  private final Object a = new Object();
  private final ConditionVariable b = new ConditionVariable();
  private volatile boolean c = false;
  private SharedPreferences d = null;
  private Context e;
  
  public final <T> T a(arq<T> paramarq)
  {
    if (!this.b.block(5000L)) {
      throw new IllegalStateException("Flags.initialize() was not called!");
    }
    if ((!this.c) || (this.d == null)) {}
    synchronized (this.a)
    {
      if ((!this.c) || (this.d == null))
      {
        Object localObject3 = paramarq.b();
        return localObject3;
      }
      return lq.a(this.e, new arz(this, paramarq));
    }
  }
  
  public final void a(Context paramContext)
  {
    if (this.c) {
      return;
    }
    synchronized (this.a)
    {
      if (this.c) {
        return;
      }
    }
    Object localObject3;
    if (paramContext.getApplicationContext() == null)
    {
      localObject3 = paramContext;
      this.e = ((Context)localObject3);
    }
    for (;;)
    {
      Context localContext1;
      try
      {
        localContext1 = i.c(paramContext);
        if ((localContext1 == null) && (paramContext != null))
        {
          Context localContext2 = paramContext.getApplicationContext();
          if (localContext2 == null)
          {
            if (paramContext != null) {
              continue;
            }
            this.b.open();
            return;
            Context localContext3 = paramContext.getApplicationContext();
            localObject3 = localContext3;
            break;
          }
          paramContext = localContext2;
          continue;
          aos.d();
          this.d = paramContext.getSharedPreferences("google_ads_flags", 0);
          this.c = true;
          this.b.open();
          return;
        }
      }
      finally
      {
        this.b.open();
      }
      paramContext = localContext1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ary
 * JD-Core Version:    0.7.0.1
 */