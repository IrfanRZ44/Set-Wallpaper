package com.a.a.i.a;

import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import android.support.v4.f.k.c;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private static final d<Object> a = new d()
  {
    public void a(Object paramAnonymousObject) {}
  };
  
  public static <T> k.a<List<T>> a()
  {
    return a(20);
  }
  
  public static <T> k.a<List<T>> a(int paramInt)
  {
    a(new k.c(paramInt), new a()new d
    {
      public List<T> a()
      {
        return new ArrayList();
      }
    }, new d()
    {
      public void a(List<T> paramAnonymousList)
      {
        paramAnonymousList.clear();
      }
    });
  }
  
  public static <T extends c> k.a<T> a(int paramInt, a<T> parama)
  {
    return a(new k.b(paramInt), parama);
  }
  
  private static <T extends c> k.a<T> a(k.a<T> parama, a<T> parama1)
  {
    return a(parama, parama1, b());
  }
  
  private static <T> k.a<T> a(k.a<T> parama, a<T> parama1, d<T> paramd)
  {
    return new b(parama, parama1, paramd);
  }
  
  public static <T extends c> k.a<T> b(int paramInt, a<T> parama)
  {
    return a(new k.c(paramInt), parama);
  }
  
  private static <T> d<T> b()
  {
    return a;
  }
  
  public static abstract interface a<T>
  {
    public abstract T b();
  }
  
  private static final class b<T>
    implements k.a<T>
  {
    private final a.a<T> a;
    private final a.d<T> b;
    private final k.a<T> c;
    
    b(k.a<T> parama, a.a<T> parama1, a.d<T> paramd)
    {
      this.c = parama;
      this.a = parama1;
      this.b = paramd;
    }
    
    public T a()
    {
      Object localObject = this.c.a();
      if (localObject == null)
      {
        localObject = this.a.b();
        if (Log.isLoggable("FactoryPools", 2)) {
          Log.v("FactoryPools", "Created new " + localObject.getClass());
        }
      }
      if ((localObject instanceof a.c)) {
        ((a.c)localObject).a_().a(false);
      }
      return localObject;
    }
    
    public boolean a(T paramT)
    {
      if ((paramT instanceof a.c)) {
        ((a.c)paramT).a_().a(true);
      }
      this.b.a(paramT);
      return this.c.a(paramT);
    }
  }
  
  public static abstract interface c
  {
    public abstract b a_();
  }
  
  public static abstract interface d<T>
  {
    public abstract void a(T paramT);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.a.a
 * JD-Core Version:    0.7.0.1
 */