package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

@cm
public abstract class mn
  extends AbstractExecutorService
  implements nj
{
  public final ne<?> a(Runnable paramRunnable)
  {
    return (ne)super.submit(paramRunnable);
  }
  
  public final <T> ne<T> a(Callable<T> paramCallable)
  {
    return (ne)super.submit(paramCallable);
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
  {
    return new ni(paramRunnable, paramT);
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Callable<T> paramCallable)
  {
    return new ni(paramCallable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.mn
 * JD-Core Version:    0.7.0.1
 */