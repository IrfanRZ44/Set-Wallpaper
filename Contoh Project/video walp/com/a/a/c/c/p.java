package com.a.a.c.c;

import android.support.v4.f.k.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p
{
  private final r a;
  private final a b = new a();
  
  public p(k.a<List<Throwable>> parama)
  {
    this(new r(parama));
  }
  
  private p(r paramr)
  {
    this.a = paramr;
  }
  
  private static <A> Class<A> b(A paramA)
  {
    return paramA.getClass();
  }
  
  private <A> List<n<A, ?>> b(Class<A> paramClass)
  {
    List localList = this.b.a(paramClass);
    if (localList == null)
    {
      localList = Collections.unmodifiableList(this.a.a(paramClass));
      this.b.a(paramClass, localList);
    }
    return localList;
  }
  
  public List<Class<?>> a(Class<?> paramClass)
  {
    try
    {
      List localList = this.a.b(paramClass);
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public <A> List<n<A, ?>> a(A paramA)
  {
    try
    {
      List localList = b(b(paramA));
      int i = localList.size();
      ArrayList localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        n localn = (n)localList.get(j);
        if (localn.a(paramA)) {
          localArrayList.add(localn);
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  public <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo)
  {
    try
    {
      this.a.a(paramClass, paramClass1, paramo);
      this.b.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static class a
  {
    private final Map<Class<?>, a<?>> a = new HashMap();
    
    public <Model> List<n<Model, ?>> a(Class<Model> paramClass)
    {
      a locala = (a)this.a.get(paramClass);
      if (locala == null) {
        return null;
      }
      return locala.a;
    }
    
    public void a()
    {
      this.a.clear();
    }
    
    public <Model> void a(Class<Model> paramClass, List<n<Model, ?>> paramList)
    {
      if ((a)this.a.put(paramClass, new a(paramList)) != null) {
        throw new IllegalStateException("Already cached loaders for model: " + paramClass);
      }
    }
    
    private static class a<Model>
    {
      final List<n<Model, ?>> a;
      
      public a(List<n<Model, ?>> paramList)
      {
        this.a = paramList;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.p
 * JD-Core Version:    0.7.0.1
 */