package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class nn
  extends mn
{
  private final Executor a;
  
  private nn(Executor paramExecutor)
  {
    this.a = paramExecutor;
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void execute(Runnable paramRunnable)
  {
    this.a.execute(paramRunnable);
  }
  
  public final boolean isShutdown()
  {
    return false;
  }
  
  public final boolean isTerminated()
  {
    return false;
  }
  
  public final void shutdown()
  {
    throw new UnsupportedOperationException();
  }
  
  public final List<Runnable> shutdownNow()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.nn
 * JD-Core Version:    0.7.0.1
 */