package com.a.a.c.b;

import com.a.a.c.b.b.a;
import com.a.a.c.c.n;
import com.a.a.c.c.n.a;
import com.a.a.c.d;
import com.a.a.c.j;
import com.a.a.c.l;
import com.a.a.c.m;
import com.a.a.e;
import com.a.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class f<Transcode>
{
  private final List<n.a<?>> a = new ArrayList();
  private final List<com.a.a.c.h> b = new ArrayList();
  private e c;
  private Object d;
  private int e;
  private int f;
  private Class<?> g;
  private g.d h;
  private j i;
  private Map<Class<?>, m<?>> j;
  private Class<Transcode> k;
  private boolean l;
  private boolean m;
  private com.a.a.c.h n;
  private g o;
  private i p;
  private boolean q;
  private boolean r;
  
  <X> d<X> a(X paramX)
  {
    return this.c.c().a(paramX);
  }
  
  List<n<File, ?>> a(File paramFile)
  {
    return this.c.c().c(paramFile);
  }
  
  void a()
  {
    this.c = null;
    this.d = null;
    this.n = null;
    this.g = null;
    this.k = null;
    this.i = null;
    this.o = null;
    this.j = null;
    this.p = null;
    this.a.clear();
    this.l = false;
    this.b.clear();
    this.m = false;
  }
  
  <R> void a(e parame, Object paramObject, com.a.a.c.h paramh, int paramInt1, int paramInt2, i parami, Class<?> paramClass, Class<R> paramClass1, g paramg, j paramj, Map<Class<?>, m<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, g.d paramd)
  {
    this.c = parame;
    this.d = paramObject;
    this.n = paramh;
    this.e = paramInt1;
    this.f = paramInt2;
    this.p = parami;
    this.g = paramClass;
    this.h = paramd;
    this.k = paramClass1;
    this.o = paramg;
    this.i = paramj;
    this.j = paramMap;
    this.q = paramBoolean1;
    this.r = paramBoolean2;
  }
  
  boolean a(u<?> paramu)
  {
    return this.c.c().a(paramu);
  }
  
  boolean a(com.a.a.c.h paramh)
  {
    List localList = n();
    int i1 = localList.size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((n.a)localList.get(i2)).a.equals(paramh)) {
        return true;
      }
    }
    return false;
  }
  
  boolean a(Class<?> paramClass)
  {
    return b(paramClass) != null;
  }
  
  a b()
  {
    return this.h.a();
  }
  
  <Data> s<Data, ?, Transcode> b(Class<Data> paramClass)
  {
    return this.c.c().a(paramClass, this.g, this.k);
  }
  
  <Z> l<Z> b(u<Z> paramu)
  {
    return this.c.c().b(paramu);
  }
  
  i c()
  {
    return this.p;
  }
  
  <Z> m<Z> c(Class<Z> paramClass)
  {
    Object localObject = (m)this.j.get(paramClass);
    if (localObject == null)
    {
      Iterator localIterator = this.j.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (((Class)localEntry.getKey()).isAssignableFrom(paramClass)) {
          localObject = (m)localEntry.getValue();
        }
      }
    }
    if (localObject == null)
    {
      if ((this.j.isEmpty()) && (this.q)) {
        throw new IllegalArgumentException("Missing transformation for " + paramClass + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
      }
      localObject = com.a.a.c.d.b.a();
    }
    return localObject;
  }
  
  g d()
  {
    return this.o;
  }
  
  j e()
  {
    return this.i;
  }
  
  com.a.a.c.h f()
  {
    return this.n;
  }
  
  int g()
  {
    return this.e;
  }
  
  int h()
  {
    return this.f;
  }
  
  com.a.a.c.b.a.b i()
  {
    return this.c.e();
  }
  
  Class<?> j()
  {
    return this.k;
  }
  
  Class<?> k()
  {
    return this.d.getClass();
  }
  
  List<Class<?>> l()
  {
    return this.c.c().b(this.d.getClass(), this.g, this.k);
  }
  
  boolean m()
  {
    return this.r;
  }
  
  List<n.a<?>> n()
  {
    if (!this.l)
    {
      this.l = true;
      this.a.clear();
      List localList = this.c.c().c(this.d);
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        n.a locala = ((n)localList.get(i2)).a(this.d, this.e, this.f, this.i);
        if (locala != null) {
          this.a.add(locala);
        }
      }
    }
    return this.a;
  }
  
  List<com.a.a.c.h> o()
  {
    if (!this.m)
    {
      this.m = true;
      this.b.clear();
      List localList = n();
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        n.a locala = (n.a)localList.get(i2);
        if (!this.b.contains(locala.a)) {
          this.b.add(locala.a);
        }
        for (int i3 = 0; i3 < locala.b.size(); i3++) {
          if (!this.b.contains(locala.b.get(i3))) {
            this.b.add(locala.b.get(i3));
          }
        }
      }
    }
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.f
 * JD-Core Version:    0.7.0.1
 */