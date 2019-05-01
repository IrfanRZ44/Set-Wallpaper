package com.google.android.gms.internal.ads;

import dalvik.system.DexClassLoader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class aiw
{
  private static final String a = aiw.class.getSimpleName();
  private final ahn b;
  private final String c;
  private final String d;
  private final int e = 2;
  private volatile Method f = null;
  private final Class<?>[] g;
  private CountDownLatch h = new CountDownLatch(1);
  
  public aiw(ahn paramahn, String paramString1, String paramString2, Class<?>... paramVarArgs)
  {
    this.b = paramahn;
    this.c = paramString1;
    this.d = paramString2;
    this.g = paramVarArgs;
    this.b.c().submit(new aix(this));
  }
  
  private final String a(byte[] paramArrayOfByte, String paramString)
  {
    return new String(this.b.e().a(paramArrayOfByte, paramString), "UTF-8");
  }
  
  private final void b()
  {
    try
    {
      Class localClass = this.b.d().loadClass(a(this.b.f(), this.c));
      if (localClass == null) {
        return;
      }
      this.f = localClass.getMethod(a(this.b.f(), this.d), this.g);
      Method localMethod = this.f;
      if (localMethod == null) {
        return;
      }
      return;
    }
    catch (agz localagz) {}catch (UnsupportedEncodingException localUnsupportedEncodingException) {}catch (ClassNotFoundException localClassNotFoundException) {}catch (NoSuchMethodException localNoSuchMethodException) {}catch (NullPointerException localNullPointerException) {}finally
    {
      this.h.countDown();
    }
  }
  
  public final Method a()
  {
    Method localMethod1;
    if (this.f != null) {
      localMethod1 = this.f;
    }
    for (;;)
    {
      return localMethod1;
      try
      {
        boolean bool = this.h.await(2L, TimeUnit.SECONDS);
        localMethod1 = null;
        if (bool)
        {
          Method localMethod2 = this.f;
          return localMethod2;
        }
      }
      catch (InterruptedException localInterruptedException) {}
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aiw
 * JD-Core Version:    0.7.0.1
 */