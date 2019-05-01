package com.a.a;

import android.support.v4.f.k.a;
import com.a.a.c.a.e.a;
import com.a.a.c.b.s;
import com.a.a.c.b.u;
import com.a.a.c.c.n;
import com.a.a.c.c.o;
import com.a.a.c.c.p;
import com.a.a.c.k;
import com.a.a.c.l;
import com.a.a.f.b;
import com.a.a.f.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class h
{
  private final p a = new p(this.j);
  private final com.a.a.f.a b = new com.a.a.f.a();
  private final com.a.a.f.e c = new com.a.a.f.e();
  private final com.a.a.f.f d = new com.a.a.f.f();
  private final com.a.a.c.a.f e = new com.a.a.c.a.f();
  private final com.a.a.c.d.f.f f = new com.a.a.c.d.f.f();
  private final b g = new b();
  private final com.a.a.f.d h = new com.a.a.f.d();
  private final c i = new c();
  private final k.a<List<Throwable>> j = com.a.a.i.a.a.a();
  
  public h()
  {
    a(Arrays.asList(new String[] { "Gif", "Bitmap", "BitmapDrawable" }));
  }
  
  private <Data, TResource, Transcode> List<com.a.a.c.b.h<Data, TResource, Transcode>> c(Class<Data> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.c.b(paramClass, paramClass1).iterator();
    while (localIterator1.hasNext())
    {
      Class localClass1 = (Class)localIterator1.next();
      Iterator localIterator2 = this.f.b(localClass1, paramClass2).iterator();
      while (localIterator2.hasNext())
      {
        Class localClass2 = (Class)localIterator2.next();
        localArrayList.add(new com.a.a.c.b.h(paramClass, localClass1, localClass2, this.c.a(paramClass, localClass1), this.f.a(localClass1, localClass2), this.j));
      }
    }
    return localArrayList;
  }
  
  public <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2)
  {
    s locals1 = this.i.a(paramClass, paramClass1, paramClass2);
    if (this.i.a(locals1)) {
      return null;
    }
    if (locals1 == null)
    {
      List localList = c(paramClass, paramClass1, paramClass2);
      boolean bool = localList.isEmpty();
      s locals2 = null;
      if (bool) {}
      for (;;)
      {
        this.i.a(paramClass, paramClass1, paramClass2, locals2);
        return locals2;
        locals2 = new s(paramClass, paramClass1, paramClass2, localList, this.j);
      }
    }
    return locals1;
  }
  
  public <X> com.a.a.c.d<X> a(X paramX)
  {
    com.a.a.c.d locald = this.b.a(paramX.getClass());
    if (locald != null) {
      return locald;
    }
    throw new e(paramX.getClass());
  }
  
  public h a(e.a<?> parama)
  {
    this.e.a(parama);
    return this;
  }
  
  public h a(com.a.a.c.f paramf)
  {
    this.g.a(paramf);
    return this;
  }
  
  public <Data> h a(Class<Data> paramClass, com.a.a.c.d<Data> paramd)
  {
    this.b.a(paramClass, paramd);
    return this;
  }
  
  public <TResource> h a(Class<TResource> paramClass, l<TResource> paraml)
  {
    this.d.a(paramClass, paraml);
    return this;
  }
  
  public <Model, Data> h a(Class<Model> paramClass, Class<Data> paramClass1, o<Model, Data> paramo)
  {
    this.a.a(paramClass, paramClass1, paramo);
    return this;
  }
  
  public <TResource, Transcode> h a(Class<TResource> paramClass, Class<Transcode> paramClass1, com.a.a.c.d.f.e<TResource, Transcode> parame)
  {
    this.f.a(paramClass, paramClass1, parame);
    return this;
  }
  
  public <Data, TResource> h a(Class<Data> paramClass, Class<TResource> paramClass1, k<Data, TResource> paramk)
  {
    a("legacy_append", paramClass, paramClass1, paramk);
    return this;
  }
  
  public <Data, TResource> h a(String paramString, Class<Data> paramClass, Class<TResource> paramClass1, k<Data, TResource> paramk)
  {
    this.c.a(paramString, paramk, paramClass, paramClass1);
    return this;
  }
  
  public final h a(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList);
    localArrayList.add(0, "legacy_prepend_all");
    localArrayList.add("legacy_append");
    this.c.a(localArrayList);
    return this;
  }
  
  public List<com.a.a.c.f> a()
  {
    List localList = this.g.a();
    if (localList.isEmpty()) {
      throw new b();
    }
    return localList;
  }
  
  public boolean a(u<?> paramu)
  {
    return this.d.a(paramu.c()) != null;
  }
  
  public <X> com.a.a.c.a.e<X> b(X paramX)
  {
    return this.e.a(paramX);
  }
  
  public <X> l<X> b(u<X> paramu)
  {
    l locall = this.d.a(paramu.c());
    if (locall != null) {
      return locall;
    }
    throw new d(paramu.c());
  }
  
  public <Model, TResource, Transcode> List<Class<?>> b(Class<Model> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2)
  {
    Object localObject = this.h.a(paramClass, paramClass1);
    if (localObject == null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator1 = this.a.a(paramClass).iterator();
      while (localIterator1.hasNext())
      {
        Class localClass1 = (Class)localIterator1.next();
        Iterator localIterator2 = this.c.b(localClass1, paramClass1).iterator();
        while (localIterator2.hasNext())
        {
          Class localClass2 = (Class)localIterator2.next();
          if ((!this.f.b(localClass2, paramClass2).isEmpty()) && (!localArrayList.contains(localClass2))) {
            localArrayList.add(localClass2);
          }
        }
      }
      this.h.a(paramClass, paramClass1, Collections.unmodifiableList(localArrayList));
      localObject = localArrayList;
    }
    return localObject;
  }
  
  public <Model> List<n<Model, ?>> c(Model paramModel)
  {
    List localList = this.a.a(paramModel);
    if (localList.isEmpty()) {
      throw new c(paramModel);
    }
    return localList;
  }
  
  public static class a
    extends RuntimeException
  {
    public a(String paramString)
    {
      super();
    }
  }
  
  public static final class b
    extends h.a
  {
    public b()
    {
      super();
    }
  }
  
  public static class c
    extends h.a
  {
    public c(Class<?> paramClass1, Class<?> paramClass2)
    {
      super();
    }
    
    public c(Object paramObject)
    {
      super();
    }
  }
  
  public static class d
    extends h.a
  {
    public d(Class<?> paramClass)
    {
      super();
    }
  }
  
  public static class e
    extends h.a
  {
    public e(Class<?> paramClass)
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.h
 * JD-Core Version:    0.7.0.1
 */