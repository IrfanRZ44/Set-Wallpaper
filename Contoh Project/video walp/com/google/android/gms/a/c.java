package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.n;

public abstract class c<T>
{
  private final String a;
  private T b;
  
  protected c(String paramString)
  {
    this.a = paramString;
  }
  
  protected final T a(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.b == null)
    {
      n.a(paramContext);
      Context localContext = i.c(paramContext);
      if (localContext == null) {
        throw new a("Could not get remote context.");
      }
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.b = a((IBinder)localClassLoader.loadClass(this.a).newInstance());
      return this.b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new a("Could not load creator class.", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new a("Could not instantiate creator.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new a("Could not access creator.", localIllegalAccessException);
    }
  }
  
  protected abstract T a(IBinder paramIBinder);
  
  public static class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
    
    public a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.a.c
 * JD-Core Version:    0.7.0.1
 */