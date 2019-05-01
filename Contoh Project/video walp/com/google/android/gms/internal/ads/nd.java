package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@cm
final class nd<T>
  implements ne<T>
{
  private final T a;
  private final ng b;
  
  nd(T paramT)
  {
    this.a = paramT;
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
    return this.a;
  }
  
  public final T get(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.a;
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
 * Qualified Name:     com.google.android.gms.internal.ads.nd
 * JD-Core Version:    0.7.0.1
 */