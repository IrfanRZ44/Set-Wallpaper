package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class amr
  implements b
{
  private final Executor a;
  
  public amr(Handler paramHandler)
  {
    this.a = new ans(this, paramHandler);
  }
  
  public final void a(avs<?> paramavs, bbw<?> parambbw)
  {
    a(paramavs, parambbw, null);
  }
  
  public final void a(avs<?> paramavs, bbw<?> parambbw, Runnable paramRunnable)
  {
    paramavs.k();
    paramavs.b("post-response");
    this.a.execute(new aoq(this, paramavs, parambbw, paramRunnable));
  }
  
  public final void a(avs<?> paramavs, df paramdf)
  {
    paramavs.b("post-error");
    bbw localbbw = bbw.a(paramdf);
    this.a.execute(new aoq(this, paramavs, localbbw, null));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amr
 * JD-Core Version:    0.7.0.1
 */