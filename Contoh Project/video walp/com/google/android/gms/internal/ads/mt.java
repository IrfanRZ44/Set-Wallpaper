package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@cm
public final class mt
{
  public static <T> nc<T> a(Throwable paramThrowable)
  {
    return new nc(paramThrowable);
  }
  
  public static <T> nd<T> a(T paramT)
  {
    return new nd(paramT);
  }
  
  public static <V> ne<V> a(ne<V> paramne, long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService)
  {
    np localnp = new np();
    a(localnp, paramne);
    ScheduledFuture localScheduledFuture = paramScheduledExecutorService.schedule(new mx(localnp), paramLong, paramTimeUnit);
    a(paramne, localnp);
    localnp.a(new my(localScheduledFuture), nk.b);
    return localnp;
  }
  
  public static <A, B> ne<B> a(ne<A> paramne, mo<? super A, ? extends B> parammo, Executor paramExecutor)
  {
    np localnp = new np();
    paramne.a(new mw(localnp, parammo, paramne), paramExecutor);
    a(localnp, paramne);
    return localnp;
  }
  
  public static <A, B> ne<B> a(ne<A> paramne, mp<A, B> parammp, Executor paramExecutor)
  {
    np localnp = new np();
    paramne.a(new mv(localnp, parammp, paramne), paramExecutor);
    a(localnp, paramne);
    return localnp;
  }
  
  public static <V, X extends Throwable> ne<V> a(ne<? extends V> paramne, Class<X> paramClass, mo<? super X, ? extends V> parammo, Executor paramExecutor)
  {
    np localnp = new np();
    a(localnp, paramne);
    paramne.a(new mz(localnp, paramne, paramClass, parammo, paramExecutor), nk.b);
    return localnp;
  }
  
  public static <T> T a(Future<T> paramFuture, T paramT)
  {
    try
    {
      arq localarq = asa.bz;
      Object localObject = paramFuture.get(((Long)aos.f().a(localarq)).longValue(), TimeUnit.MILLISECONDS);
      return localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      paramFuture.cancel(true);
      je.c("InterruptedException caught while resolving future.", localInterruptedException);
      Thread.currentThread().interrupt();
      zzbv.zzeo().b(localInterruptedException, "Futures.resolveFuture");
      return paramT;
    }
    catch (Exception localException)
    {
      paramFuture.cancel(true);
      je.b("Error waiting for future.", localException);
      zzbv.zzeo().b(localException, "Futures.resolveFuture");
    }
    return paramT;
  }
  
  public static <T> T a(Future<T> paramFuture, T paramT, long paramLong, TimeUnit paramTimeUnit)
  {
    try
    {
      Object localObject = paramFuture.get(paramLong, paramTimeUnit);
      return localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      paramFuture.cancel(true);
      je.c("InterruptedException caught while resolving future.", localInterruptedException);
      Thread.currentThread().interrupt();
      zzbv.zzeo().a(localInterruptedException, "Futures.resolveFuture");
      return paramT;
    }
    catch (Exception localException)
    {
      paramFuture.cancel(true);
      je.b("Error waiting for future.", localException);
      zzbv.zzeo().a(localException, "Futures.resolveFuture");
    }
    return paramT;
  }
  
  public static <V> void a(ne<V> paramne, mq<V> parammq, Executor paramExecutor)
  {
    paramne.a(new mu(parammq, paramne), paramExecutor);
  }
  
  private static <V> void a(ne<? extends V> paramne, np<V> paramnp)
  {
    a(paramnp, paramne);
    paramne.a(new na(paramnp, paramne), nk.b);
  }
  
  private static <A, B> void a(ne<A> paramne, Future<B> paramFuture)
  {
    paramne.a(new nb(paramne, paramFuture), nk.b);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.mt
 * JD-Core Version:    0.7.0.1
 */