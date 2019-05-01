package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.a.a;
import org.greenrobot.eventbus.a.b;

class p
{
  private static final Map<Class<?>, List<o>> a = new ConcurrentHashMap();
  private static final a[] e = new a[4];
  private List<b> b;
  private final boolean c;
  private final boolean d;
  
  p(List<b> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramList;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
  }
  
  private List<o> a(a parama)
  {
    ArrayList localArrayList = new ArrayList(parama.a);
    parama.a();
    a[] arrayOfa = e;
    for (int i = 0;; i++)
    {
      if (i < 4) {}
      try
      {
        if (e[i] == null)
        {
          e[i] = parama;
          return localArrayList;
        }
      }
      finally {}
    }
  }
  
  private a a()
  {
    a[] arrayOfa = e;
    for (int i = 0;; i++)
    {
      if (i < 4) {}
      try
      {
        a locala = e[i];
        if (locala == null) {
          continue;
        }
        e[i] = null;
        return locala;
      }
      finally {}
      return new a();
    }
  }
  
  private List<o> b(Class<?> paramClass)
  {
    a locala = a();
    locala.a(paramClass);
    while (locala.f != null)
    {
      locala.h = b(locala);
      if (locala.h != null) {
        for (o localo : locala.h.b()) {
          if (locala.a(localo.a, localo.c)) {
            locala.a.add(localo);
          }
        }
      }
      c(locala);
      locala.b();
    }
    return a(locala);
  }
  
  private a b(a parama)
  {
    if ((parama.h != null) && (parama.h.c() != null))
    {
      a locala2 = parama.h.c();
      if (parama.f == locala2.a()) {
        return locala2;
      }
    }
    if (this.b != null)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        a locala1 = ((b)localIterator.next()).a(parama.f);
        if (locala1 != null) {
          return locala1;
        }
      }
    }
    return null;
  }
  
  private List<o> c(Class<?> paramClass)
  {
    a locala = a();
    locala.a(paramClass);
    while (locala.f != null)
    {
      c(locala);
      locala.b();
    }
    return a(locala);
  }
  
  private void c(a parama)
  {
    try
    {
      Method[] arrayOfMethod2 = parama.f.getDeclaredMethods();
      localObject = arrayOfMethod2;
    }
    catch (Throwable localThrowable)
    {
      Class[] arrayOfClass;
      do
      {
        for (;;)
        {
          int i;
          int j;
          int k;
          Method[] arrayOfMethod1 = parama.f.getMethods();
          parama.g = true;
          Object localObject = arrayOfMethod1;
        }
      } while ((!this.c) || (!localMethod.isAnnotationPresent(m.class)));
      String str2 = localMethod.getDeclaringClass().getName() + "." + localMethod.getName();
      throw new e("@Subscribe method " + str2 + "must have exactly 1 parameter but has " + arrayOfClass.length);
    }
    i = localObject.length;
    j = 0;
    if (j < i)
    {
      Method localMethod = localObject[j];
      k = localMethod.getModifiers();
      if (((k & 0x1) != 0) && ((k & 0x1448) == 0))
      {
        arrayOfClass = localMethod.getParameterTypes();
        if (arrayOfClass.length == 1)
        {
          localm = (m)localMethod.getAnnotation(m.class);
          if (localm != null)
          {
            localClass = arrayOfClass[0];
            if (parama.a(localMethod, localClass))
            {
              localThreadMode = localm.a();
              parama.a.add(new o(localMethod, localClass, localThreadMode, localm.c(), localm.b()));
            }
          }
        }
      }
      while ((!this.c) || (!localMethod.isAnnotationPresent(m.class)))
      {
        m localm;
        Class localClass;
        ThreadMode localThreadMode;
        j++;
        break;
      }
      String str1 = localMethod.getDeclaringClass().getName() + "." + localMethod.getName();
      throw new e(str1 + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
    }
  }
  
  List<o> a(Class<?> paramClass)
  {
    List localList1 = (List)a.get(paramClass);
    if (localList1 != null) {
      return localList1;
    }
    if (this.d) {}
    for (List localList2 = c(paramClass); localList2.isEmpty(); localList2 = b(paramClass)) {
      throw new e("Subscriber " + paramClass + " and its super classes have no public methods with the @Subscribe annotation");
    }
    a.put(paramClass, localList2);
    return localList2;
  }
  
  static class a
  {
    final List<o> a = new ArrayList();
    final Map<Class, Object> b = new HashMap();
    final Map<String, Class> c = new HashMap();
    final StringBuilder d = new StringBuilder(128);
    Class<?> e;
    Class<?> f;
    boolean g;
    a h;
    
    private boolean b(Method paramMethod, Class<?> paramClass)
    {
      this.d.setLength(0);
      this.d.append(paramMethod.getName());
      this.d.append('>').append(paramClass.getName());
      String str = this.d.toString();
      Class localClass1 = paramMethod.getDeclaringClass();
      Class localClass2 = (Class)this.c.put(str, localClass1);
      if ((localClass2 == null) || (localClass2.isAssignableFrom(localClass1))) {
        return true;
      }
      this.c.put(str, localClass2);
      return false;
    }
    
    void a()
    {
      this.a.clear();
      this.b.clear();
      this.c.clear();
      this.d.setLength(0);
      this.e = null;
      this.f = null;
      this.g = false;
      this.h = null;
    }
    
    void a(Class<?> paramClass)
    {
      this.f = paramClass;
      this.e = paramClass;
      this.g = false;
      this.h = null;
    }
    
    boolean a(Method paramMethod, Class<?> paramClass)
    {
      Object localObject = this.b.put(paramClass, paramMethod);
      if (localObject == null) {
        return true;
      }
      if ((localObject instanceof Method))
      {
        if (!b((Method)localObject, paramClass)) {
          throw new IllegalStateException();
        }
        this.b.put(paramClass, this);
      }
      return b(paramMethod, paramClass);
    }
    
    void b()
    {
      if (this.g) {
        this.f = null;
      }
      String str;
      do
      {
        return;
        this.f = this.f.getSuperclass();
        str = this.f.getName();
      } while ((!str.startsWith("java.")) && (!str.startsWith("javax.")) && (!str.startsWith("android.")));
      this.f = null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.p
 * JD-Core Version:    0.7.0.1
 */