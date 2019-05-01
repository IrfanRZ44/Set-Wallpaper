package com.a.a.c.c;

import android.support.v4.f.k.a;
import com.a.a.c.j;
import com.a.a.h.c;
import com.a.a.i.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class r
{
  private static final c a = new c();
  private static final n<Object, Object> b = new a();
  private final List<b<?, ?>> c = new ArrayList();
  private final c d;
  private final Set<b<?, ?>> e = new HashSet();
  private final k.a<List<Throwable>> f;
  
  public r(k.a<List<Throwable>> parama)
  {
    this(parama, a);
  }
  
  r(k.a<List<Throwable>> parama, c paramc)
  {
    this.f = parama;
    this.d = paramc;
  }
  
  private static <Model, Data> n<Model, Data> a()
  {
    return b;
  }
  
  private <Model, Data> n<Model, Data> a(b<?, ?> paramb)
  {
    return (n)h.a(paramb.b.a(this));
  }
  
  private <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo, boolean paramBoolean)
  {
    b localb = new b(paramClass, paramClass1, paramo);
    List localList = this.c;
    if (paramBoolean) {}
    for (int i = this.c.size();; i = 0)
    {
      localList.add(i, localb);
      return;
    }
  }
  
  public <Model, Data> n<Model, Data> a(Class<Model> paramClass, Class<Data> paramClass1)
  {
    ArrayList localArrayList;
    int i;
    try
    {
      localArrayList = new ArrayList();
      Iterator localIterator = this.c.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (this.e.contains(localb))
        {
          i = 1;
        }
        else if (localb.a(paramClass, paramClass1))
        {
          this.e.add(localb);
          localArrayList.add(a(localb));
          this.e.remove(localb);
        }
      }
      if (localArrayList.size() <= 1) {
        break label170;
      }
    }
    catch (Throwable localThrowable)
    {
      this.e.clear();
      throw localThrowable;
    }
    finally {}
    q localq = this.d.a(localArrayList, this.f);
    Object localObject2 = localq;
    for (;;)
    {
      return localObject2;
      label170:
      if (localArrayList.size() == 1)
      {
        localObject2 = (n)localArrayList.get(0);
      }
      else
      {
        if (i == 0) {
          break;
        }
        localObject2 = a();
      }
    }
    throw new h.c(paramClass, paramClass1);
  }
  
  <Model> List<n<Model, ?>> a(Class<Model> paramClass)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList();
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if ((!this.e.contains(localb)) && (localb.a(paramClass)))
        {
          this.e.add(localb);
          localArrayList.add(a(localb));
          this.e.remove(localb);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      this.e.clear();
      throw localThrowable;
    }
    finally {}
    return localArrayList;
  }
  
  <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo)
  {
    try
    {
      a(paramClass, paramClass1, paramo, true);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  List<Class<?>> b(Class<?> paramClass)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList();
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if ((!localArrayList.contains(localb.a)) && (localb.a(paramClass))) {
          localArrayList.add(localb.a);
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  private static class a
    implements n<Object, Object>
  {
    public n.a<Object> a(Object paramObject, int paramInt1, int paramInt2, j paramj)
    {
      return null;
    }
    
    public boolean a(Object paramObject)
    {
      return false;
    }
  }
  
  private static class b<Model, Data>
  {
    final Class<Data> a;
    final o<? extends Model, ? extends Data> b;
    private final Class<Model> c;
    
    public b(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo)
    {
      this.c = paramClass;
      this.a = paramClass1;
      this.b = paramo;
    }
    
    public boolean a(Class<?> paramClass)
    {
      return this.c.isAssignableFrom(paramClass);
    }
    
    public boolean a(Class<?> paramClass1, Class<?> paramClass2)
    {
      return (a(paramClass1)) && (this.a.isAssignableFrom(paramClass2));
    }
  }
  
  static class c
  {
    public <Model, Data> q<Model, Data> a(List<n<Model, Data>> paramList, k.a<List<Throwable>> parama)
    {
      return new q(paramList, parama);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.r
 * JD-Core Version:    0.7.0.1
 */