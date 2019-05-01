package com.a.a.c.d.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f
{
  private final List<a<?, ?>> a = new ArrayList();
  
  public <Z, R> e<Z, R> a(Class<Z> paramClass, Class<R> paramClass1)
  {
    try
    {
      e locale2;
      if (paramClass1.isAssignableFrom(paramClass)) {
        locale2 = g.a();
      }
      a locala;
      for (e locale1 = locale2;; locale1 = locala.a)
      {
        return locale1;
        Iterator localIterator = this.a.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          locala = (a)localIterator.next();
        } while (!locala.a(paramClass, paramClass1));
      }
      throw new IllegalArgumentException("No transcoder registered to transcode from " + paramClass + " to " + paramClass1);
    }
    finally {}
  }
  
  public <Z, R> void a(Class<Z> paramClass, Class<R> paramClass1, e<Z, R> parame)
  {
    try
    {
      this.a.add(new a(paramClass, paramClass1, parame));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public <Z, R> List<Class<R>> b(Class<Z> paramClass, Class<R> paramClass1)
  {
    for (;;)
    {
      try
      {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2;
        if (paramClass1.isAssignableFrom(paramClass))
        {
          localArrayList1.add(paramClass1);
          localArrayList2 = localArrayList1;
          return localArrayList2;
        }
        Iterator localIterator = this.a.iterator();
        if (localIterator.hasNext())
        {
          if (((a)localIterator.next()).a(paramClass, paramClass1)) {
            localArrayList1.add(paramClass1);
          }
        }
        else {
          localArrayList2 = localArrayList1;
        }
      }
      finally {}
    }
  }
  
  private static final class a<Z, R>
  {
    final e<Z, R> a;
    private final Class<Z> b;
    private final Class<R> c;
    
    a(Class<Z> paramClass, Class<R> paramClass1, e<Z, R> parame)
    {
      this.b = paramClass;
      this.c = paramClass1;
      this.a = parame;
    }
    
    public boolean a(Class<?> paramClass1, Class<?> paramClass2)
    {
      return (this.b.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.c));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.f.f
 * JD-Core Version:    0.7.0.1
 */