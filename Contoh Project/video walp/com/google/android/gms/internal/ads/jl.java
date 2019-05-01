package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@cm
public final class jl
{
  public static final nj a = nk.a(new ThreadPoolExecutor(2, 2147483647, 10L, TimeUnit.SECONDS, new SynchronousQueue(), a("Default")));
  private static final nj b;
  
  static
  {
    ThreadPoolExecutor localThreadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
    localThreadPoolExecutor.allowCoreThreadTimeOut(true);
    b = nk.a(localThreadPoolExecutor);
  }
  
  public static ne<?> a(Runnable paramRunnable)
  {
    return a.a(paramRunnable);
  }
  
  public static <T> ne<T> a(Callable<T> paramCallable)
  {
    return a.a(paramCallable);
  }
  
  private static ThreadFactory a(String paramString)
  {
    return new jm(paramString);
  }
  
  public static ne<?> b(Runnable paramRunnable)
  {
    return b.a(paramRunnable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jl
 * JD-Core Version:    0.7.0.1
 */