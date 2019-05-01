package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public class np<T>
  implements ne<T>
{
  private final Object a = new Object();
  @GuardedBy("mLock")
  private T b;
  @GuardedBy("mLock")
  private Throwable c;
  @GuardedBy("mLock")
  private boolean d;
  @GuardedBy("mLock")
  private boolean e;
  private final ng f = new ng();
  
  @GuardedBy("mLock")
  private final boolean a()
  {
    return (this.c != null) || (this.d);
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    this.f.a(paramRunnable, paramExecutor);
  }
  
  public final void a(Throwable paramThrowable)
  {
    synchronized (this.a)
    {
      if (this.e) {
        return;
      }
      if (a())
      {
        zzbv.zzeo().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
        return;
      }
    }
    this.c = paramThrowable;
    this.a.notifyAll();
    this.f.a();
  }
  
  public final void b(T paramT)
  {
    synchronized (this.a)
    {
      if (this.e) {
        return;
      }
      if (a())
      {
        zzbv.zzeo().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
        return;
      }
    }
    this.d = true;
    this.b = paramT;
    this.a.notifyAll();
    this.f.a();
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return false;
    }
    synchronized (this.a)
    {
      if (a()) {
        return false;
      }
    }
    this.e = true;
    this.d = true;
    this.a.notifyAll();
    this.f.a();
    return true;
  }
  
  public T get()
  {
    synchronized (this.a)
    {
      boolean bool = a();
      if (bool) {}
    }
    if (this.e) {
      throw new CancellationException("SettableFuture was cancelled.");
    }
    Object localObject3 = this.b;
    return localObject3;
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    long l;
    synchronized (this.a)
    {
      boolean bool = a();
      if (bool) {}
    }
    if (!this.d) {
      throw new TimeoutException("SettableFuture timed out.");
    }
    if (this.e) {
      throw new CancellationException("SettableFuture was cancelled.");
    }
    Object localObject3 = this.b;
    return localObject3;
  }
  
  public boolean isCancelled()
  {
    synchronized (this.a)
    {
      boolean bool = this.e;
      return bool;
    }
  }
  
  public boolean isDone()
  {
    synchronized (this.a)
    {
      boolean bool = a();
      return bool;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.np
 * JD-Core Version:    0.7.0.1
 */