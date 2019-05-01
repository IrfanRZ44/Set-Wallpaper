package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

@cm
final class ni<V>
  extends FutureTask<V>
  implements ne<V>
{
  private final ng a = new ng();
  
  ni(Runnable paramRunnable, @Nullable V paramV)
  {
    super(paramRunnable, paramV);
  }
  
  ni(Callable<V> paramCallable)
  {
    super(paramCallable);
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    this.a.a(paramRunnable, paramExecutor);
  }
  
  protected final void done()
  {
    this.a.a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ni
 * JD-Core Version:    0.7.0.1
 */