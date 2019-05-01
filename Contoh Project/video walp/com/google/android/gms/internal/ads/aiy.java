package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class aiy
  implements Callable
{
  protected final ahn a;
  protected final zo b;
  protected Method c;
  private final String d = getClass().getSimpleName();
  private final String e;
  private final String f;
  private final int g;
  private final int h;
  
  public aiy(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2)
  {
    this.a = paramahn;
    this.e = paramString1;
    this.f = paramString2;
    this.b = paramzo;
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  protected abstract void a();
  
  public Void b()
  {
    try
    {
      long l = System.nanoTime();
      this.c = this.a.a(this.e, this.f);
      if (this.c == null) {
        return null;
      }
      a();
      agq localagq = this.a.h();
      if ((localagq != null) && (this.g != -2147483648))
      {
        localagq.a(this.h, this.g, (System.nanoTime() - l) / 1000L);
        return null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return null;
    }
    catch (InvocationTargetException localInvocationTargetException) {}
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aiy
 * JD-Core Version:    0.7.0.1
 */