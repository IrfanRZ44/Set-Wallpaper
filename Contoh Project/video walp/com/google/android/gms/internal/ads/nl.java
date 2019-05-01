package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;

final class nl
  implements Executor
{
  private final Handler a = new jf(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      try
      {
        paramRunnable.run();
        return;
      }
      catch (Throwable localThrowable)
      {
        zzbv.zzek();
        jn.a(zzbv.zzeo().m(), localThrowable);
        throw localThrowable;
      }
    }
    this.a.post(paramRunnable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.nl
 * JD-Core Version:    0.7.0.1
 */