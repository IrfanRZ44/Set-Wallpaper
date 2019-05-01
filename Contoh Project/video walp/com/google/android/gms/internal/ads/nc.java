package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@cm
final class nc<T>
  implements ne<T>
{
  private final Throwable a;
  private final ng b;
  
  nc(Throwable paramThrowable)
  {
    this.a = paramThrowable;
    this.b = new ng();
    this.b.a();
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    this.b.a(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return false;
  }
  
  public final T get()
  {
    throw new ExecutionException(this.a);
  }
  
  public final T get(long paramLong, TimeUnit paramTimeUnit)
  {
    throw new ExecutionException(this.a);
  }
  
  public final boolean isCancelled()
  {
    return false;
  }
  
  public final boolean isDone()
  {
    return true;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.nc
 * JD-Core Version:    0.7.0.1
 */