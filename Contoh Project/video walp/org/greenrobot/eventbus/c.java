package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

public class c
{
  public static String a = "EventBus";
  static volatile c b;
  private static final d c = new d();
  private static final Map<Class<?>, List<Class<?>>> d = new HashMap();
  private final Map<Class<?>, CopyOnWriteArrayList<q>> e;
  private final Map<Object, List<Class<?>>> f;
  private final Map<Class<?>, Object> g;
  private final ThreadLocal<a> h = new ThreadLocal()
  {
    protected c.a a()
    {
      return new c.a();
    }
  };
  private final h i;
  private final l j;
  private final b k;
  private final a l;
  private final p m;
  private final ExecutorService n;
  private final boolean o;
  private final boolean p;
  private final boolean q;
  private final boolean r;
  private final boolean s;
  private final boolean t;
  private final int u;
  private final g v;
  
  public c()
  {
    this(c);
  }
  
  c(d paramd)
  {
    this.v = paramd.a();
    this.e = new HashMap();
    this.f = new HashMap();
    this.g = new ConcurrentHashMap();
    this.i = paramd.b();
    l locall;
    if (this.i != null)
    {
      locall = this.i.a(this);
      this.j = locall;
      this.k = new b(this);
      this.l = new a(this);
      if (paramd.j == null) {
        break label219;
      }
    }
    label219:
    for (int i1 = paramd.j.size();; i1 = 0)
    {
      this.u = i1;
      this.m = new p(paramd.j, paramd.h, paramd.g);
      this.p = paramd.a;
      this.q = paramd.b;
      this.r = paramd.c;
      this.s = paramd.d;
      this.o = paramd.e;
      this.t = paramd.f;
      this.n = paramd.i;
      return;
      locall = null;
      break;
    }
  }
  
  private static List<Class<?>> a(Class<?> paramClass)
  {
    synchronized (d)
    {
      Object localObject2 = (List)d.get(paramClass);
      if (localObject2 == null)
      {
        localObject2 = new ArrayList();
        for (Object localObject3 = paramClass; localObject3 != null; localObject3 = ((Class)localObject3).getSuperclass())
        {
          ((List)localObject2).add(localObject3);
          a((List)localObject2, ((Class)localObject3).getInterfaces());
        }
        d.put(paramClass, localObject2);
      }
      return localObject2;
    }
  }
  
  public static c a()
  {
    if (b == null) {}
    try
    {
      if (b == null) {
        b = new c();
      }
      return b;
    }
    finally {}
  }
  
  private void a(Object paramObject, Class<?> paramClass)
  {
    List localList = (List)this.e.get(paramClass);
    int i1;
    int i2;
    int i3;
    if (localList != null)
    {
      i1 = localList.size();
      i2 = 0;
      if (i2 < i1)
      {
        q localq = (q)localList.get(i2);
        if (localq.a != paramObject) {
          break label103;
        }
        localq.c = false;
        localList.remove(i2);
        i3 = i2 - 1;
      }
    }
    for (int i4 = i1 - 1;; i4 = i1)
    {
      int i5 = i3 + 1;
      i1 = i4;
      i2 = i5;
      break;
      return;
      label103:
      i3 = i2;
    }
  }
  
  private void a(Object paramObject, a parama)
  {
    Class localClass = paramObject.getClass();
    boolean bool2;
    if (this.t)
    {
      List localList = a(localClass);
      int i1 = localList.size();
      int i2 = 0;
      bool2 = false;
      while (i2 < i1)
      {
        bool2 |= a(paramObject, parama, (Class)localList.get(i2));
        i2++;
      }
    }
    for (boolean bool1 = bool2;; bool1 = a(paramObject, parama, localClass))
    {
      if (!bool1)
      {
        if (this.q) {
          this.v.a(Level.FINE, "No subscribers registered for event " + localClass);
        }
        if ((this.s) && (localClass != i.class) && (localClass != n.class)) {
          c(new i(this, paramObject));
        }
      }
      return;
    }
  }
  
  private void a(Object paramObject, o paramo)
  {
    Class localClass = paramo.c;
    q localq = new q(paramObject, paramo);
    CopyOnWriteArrayList localCopyOnWriteArrayList1 = (CopyOnWriteArrayList)this.e.get(localClass);
    CopyOnWriteArrayList localCopyOnWriteArrayList2;
    if (localCopyOnWriteArrayList1 == null)
    {
      localCopyOnWriteArrayList2 = new CopyOnWriteArrayList();
      this.e.put(localClass, localCopyOnWriteArrayList2);
    }
    label327:
    label328:
    for (CopyOnWriteArrayList localCopyOnWriteArrayList3 = localCopyOnWriteArrayList2;; localCopyOnWriteArrayList3 = localCopyOnWriteArrayList1)
    {
      int i1 = localCopyOnWriteArrayList3.size();
      for (int i2 = 0;; i2++) {
        if (i2 <= i1)
        {
          if ((i2 == i1) || (paramo.d > ((q)localCopyOnWriteArrayList3.get(i2)).b.d)) {
            localCopyOnWriteArrayList3.add(i2, localq);
          }
        }
        else
        {
          Object localObject = (List)this.f.get(paramObject);
          if (localObject == null)
          {
            localObject = new ArrayList();
            this.f.put(paramObject, localObject);
          }
          ((List)localObject).add(localClass);
          if (!paramo.e) {
            break label327;
          }
          if (!this.t) {
            break;
          }
          Iterator localIterator = this.g.entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            if (localClass.isAssignableFrom((Class)localEntry.getKey())) {
              b(localq, localEntry.getValue());
            }
          }
          if (!localCopyOnWriteArrayList1.contains(localq)) {
            break label328;
          }
          throw new e("Subscriber " + paramObject.getClass() + " already registered to event " + localClass);
        }
      }
      b(localq, this.g.get(localClass));
      return;
    }
  }
  
  static void a(List<Class<?>> paramList, Class<?>[] paramArrayOfClass)
  {
    int i1 = paramArrayOfClass.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      Class<?> localClass = paramArrayOfClass[i2];
      if (!paramList.contains(localClass))
      {
        paramList.add(localClass);
        a(paramList, localClass.getInterfaces());
      }
    }
  }
  
  private void a(q paramq, Object paramObject, Throwable paramThrowable)
  {
    if ((paramObject instanceof n)) {
      if (this.p)
      {
        this.v.a(Level.SEVERE, "SubscriberExceptionEvent subscriber " + paramq.a.getClass() + " threw an exception", paramThrowable);
        n localn = (n)paramObject;
        this.v.a(Level.SEVERE, "Initial event " + localn.c + " caused exception in " + localn.d, localn.b);
      }
    }
    do
    {
      return;
      if (this.o) {
        throw new e("Invoking subscriber failed", paramThrowable);
      }
      if (this.p) {
        this.v.a(Level.SEVERE, "Could not dispatch event: " + paramObject.getClass() + " to subscribing class " + paramq.a.getClass(), paramThrowable);
      }
    } while (!this.r);
    c(new n(this, paramThrowable, paramObject, paramq.a));
  }
  
  private void a(q paramq, Object paramObject, boolean paramBoolean)
  {
    switch (2.a[paramq.b.b.ordinal()])
    {
    default: 
      throw new IllegalStateException("Unknown thread mode: " + paramq.b.b);
    case 1: 
      a(paramq, paramObject);
      return;
    case 2: 
      if (paramBoolean)
      {
        a(paramq, paramObject);
        return;
      }
      this.j.a(paramq, paramObject);
      return;
    case 3: 
      if (this.j != null)
      {
        this.j.a(paramq, paramObject);
        return;
      }
      a(paramq, paramObject);
      return;
    case 4: 
      if (paramBoolean)
      {
        this.k.a(paramq, paramObject);
        return;
      }
      a(paramq, paramObject);
      return;
    }
    this.l.a(paramq, paramObject);
  }
  
  private boolean a(Object paramObject, a parama, Class<?> paramClass)
  {
    try
    {
      CopyOnWriteArrayList localCopyOnWriteArrayList = (CopyOnWriteArrayList)this.e.get(paramClass);
      if ((localCopyOnWriteArrayList == null) || (localCopyOnWriteArrayList.isEmpty())) {
        break label138;
      }
      localIterator = localCopyOnWriteArrayList.iterator();
    }
    finally
    {
      try
      {
        boolean bool;
        do
        {
          Iterator localIterator;
          q localq;
          a(localq, paramObject, parama.c);
          bool = parama.f;
          parama.e = null;
          parama.d = null;
          parama.f = false;
        } while (!bool);
        return true;
      }
      finally
      {
        parama.e = null;
        parama.d = null;
        parama.f = false;
      }
      localObject1 = finally;
    }
    if (localIterator.hasNext())
    {
      localq = (q)localIterator.next();
      parama.e = paramObject;
      parama.d = localq;
    }
    label138:
    return false;
  }
  
  private void b(q paramq, Object paramObject)
  {
    if (paramObject != null) {
      a(paramq, paramObject, d());
    }
  }
  
  private boolean d()
  {
    if (this.i != null) {
      return this.i.a();
    }
    return true;
  }
  
  public void a(Object paramObject)
  {
    Class localClass = paramObject.getClass();
    List localList = this.m.a(localClass);
    try
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        a(paramObject, (o)localIterator.next());
      }
    }
    finally {}
  }
  
  void a(j paramj)
  {
    Object localObject = paramj.a;
    q localq = paramj.b;
    j.a(paramj);
    if (localq.c) {
      a(localq, localObject);
    }
  }
  
  void a(q paramq, Object paramObject)
  {
    try
    {
      paramq.b.a.invoke(paramq.a, new Object[] { paramObject });
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      a(paramq, paramObject, localInvocationTargetException.getCause());
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalStateException("Unexpected exception", localIllegalAccessException);
    }
  }
  
  ExecutorService b()
  {
    return this.n;
  }
  
  public void b(Object paramObject)
  {
    try
    {
      List localList = (List)this.f.get(paramObject);
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext()) {
          a(paramObject, (Class)localIterator.next());
        }
        this.f.remove(paramObject);
      }
    }
    finally {}
    for (;;)
    {
      return;
      this.v.a(Level.WARNING, "Subscriber to unregister was not registered before: " + paramObject.getClass());
    }
  }
  
  public g c()
  {
    return this.v;
  }
  
  public void c(Object paramObject)
  {
    a locala = (a)this.h.get();
    List localList = locala.a;
    localList.add(paramObject);
    if (!locala.b)
    {
      locala.c = d();
      locala.b = true;
      if (locala.f) {
        throw new e("Internal error. Abort state was not reset");
      }
      try
      {
        if (!localList.isEmpty()) {}
        return;
      }
      finally
      {
        locala.b = false;
        locala.c = false;
      }
    }
  }
  
  public String toString()
  {
    return "EventBus[indexCount=" + this.u + ", eventInheritance=" + this.t + "]";
  }
  
  static final class a
  {
    final List<Object> a = new ArrayList();
    boolean b;
    boolean c;
    q d;
    Object e;
    boolean f;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.c
 * JD-Core Version:    0.7.0.1
 */