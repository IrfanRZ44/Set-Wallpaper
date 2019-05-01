package com.a.a.c.b.c;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
  implements ExecutorService
{
  private static final long a = TimeUnit.SECONDS.toMillis(10L);
  private static volatile int b;
  private final ExecutorService c;
  
  a(ExecutorService paramExecutorService)
  {
    this.c = paramExecutorService;
  }
  
  public static a a()
  {
    return a(1, "disk-cache", b.d);
  }
  
  public static a a(int paramInt, b paramb)
  {
    return new a(new ThreadPoolExecutor(0, paramInt, a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a("animation", paramb, true)));
  }
  
  public static a a(int paramInt, String paramString, b paramb)
  {
    return new a(new ThreadPoolExecutor(paramInt, paramInt, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(paramString, paramb, true)));
  }
  
  public static a b()
  {
    return b(e(), "source", b.d);
  }
  
  public static a b(int paramInt, String paramString, b paramb)
  {
    return new a(new ThreadPoolExecutor(paramInt, paramInt, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(paramString, paramb, false)));
  }
  
  public static a c()
  {
    return new a(new ThreadPoolExecutor(0, 2147483647, a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a("source-unlimited", b.d, false)));
  }
  
  public static a d()
  {
    if (e() >= 4) {}
    for (int i = 2;; i = 1) {
      return a(i, b.d);
    }
  }
  
  public static int e()
  {
    if (b == 0) {
      b = Math.min(4, b.a());
    }
    return b;
  }
  
  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.c.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public void execute(Runnable paramRunnable)
  {
    this.c.execute(paramRunnable);
  }
  
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection)
  {
    return this.c.invokeAll(paramCollection);
  }
  
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return this.c.invokeAll(paramCollection, paramLong, paramTimeUnit);
  }
  
  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection)
  {
    return this.c.invokeAny(paramCollection);
  }
  
  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return this.c.invokeAny(paramCollection, paramLong, paramTimeUnit);
  }
  
  public boolean isShutdown()
  {
    return this.c.isShutdown();
  }
  
  public boolean isTerminated()
  {
    return this.c.isTerminated();
  }
  
  public void shutdown()
  {
    this.c.shutdown();
  }
  
  public List<Runnable> shutdownNow()
  {
    return this.c.shutdownNow();
  }
  
  public Future<?> submit(Runnable paramRunnable)
  {
    return this.c.submit(paramRunnable);
  }
  
  public <T> Future<T> submit(Runnable paramRunnable, T paramT)
  {
    return this.c.submit(paramRunnable, paramT);
  }
  
  public <T> Future<T> submit(Callable<T> paramCallable)
  {
    return this.c.submit(paramCallable);
  }
  
  public String toString()
  {
    return this.c.toString();
  }
  
  private static final class a
    implements ThreadFactory
  {
    final a.b a;
    final boolean b;
    private final String c;
    private int d;
    
    a(String paramString, a.b paramb, boolean paramBoolean)
    {
      this.c = paramString;
      this.a = paramb;
      this.b = paramBoolean;
    }
    
    public Thread newThread(Runnable paramRunnable)
    {
      try
      {
        Thread local1 = new Thread(paramRunnable, "glide-" + this.c + "-thread-" + this.d)
        {
          public void run()
          {
            Process.setThreadPriority(9);
            if (a.a.this.b) {
              StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
            }
            try
            {
              super.run();
              return;
            }
            catch (Throwable localThrowable)
            {
              a.a.this.a.a(localThrowable);
            }
          }
        };
        this.d = (1 + this.d);
        return local1;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
  }
  
  public static abstract interface b
  {
    public static final b a = new b()
    {
      public void a(Throwable paramAnonymousThrowable) {}
    };
    public static final b b = new b()
    {
      public void a(Throwable paramAnonymousThrowable)
      {
        if ((paramAnonymousThrowable != null) && (Log.isLoggable("GlideExecutor", 6))) {
          Log.e("GlideExecutor", "Request threw uncaught throwable", paramAnonymousThrowable);
        }
      }
    };
    public static final b c = new b()
    {
      public void a(Throwable paramAnonymousThrowable)
      {
        if (paramAnonymousThrowable != null) {
          throw new RuntimeException("Request threw uncaught throwable", paramAnonymousThrowable);
        }
      }
    };
    public static final b d = b;
    
    public abstract void a(Throwable paramThrowable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.c.a
 * JD-Core Version:    0.7.0.1
 */