package com.a.a.f;

import com.a.a.c.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e
{
  private final List<String> a = new ArrayList();
  private final Map<String, List<a<?, ?>>> b = new HashMap();
  
  private List<a<?, ?>> a(String paramString)
  {
    try
    {
      if (!this.a.contains(paramString)) {
        this.a.add(paramString);
      }
      Object localObject2 = (List)this.b.get(paramString);
      if (localObject2 == null)
      {
        localObject2 = new ArrayList();
        this.b.put(paramString, localObject2);
      }
      return localObject2;
    }
    finally {}
  }
  
  public <T, R> List<k<T, R>> a(Class<T> paramClass, Class<R> paramClass1)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList();
      Iterator localIterator1 = this.a.iterator();
      while (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        List localList = (List)this.b.get(str);
        if (localList != null)
        {
          Iterator localIterator2 = localList.iterator();
          while (localIterator2.hasNext())
          {
            a locala = (a)localIterator2.next();
            if (locala.a(paramClass, paramClass1)) {
              localArrayList.add(locala.b);
            }
          }
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  public <T, R> void a(String paramString, k<T, R> paramk, Class<T> paramClass, Class<R> paramClass1)
  {
    try
    {
      a(paramString).add(new a(paramClass, paramClass1, paramk));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(List<String> paramList)
  {
    try
    {
      ArrayList localArrayList = new ArrayList(this.a);
      this.a.clear();
      this.a.addAll(paramList);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!paramList.contains(str)) {
          this.a.add(str);
        }
      }
    }
    finally {}
  }
  
  public <T, R> List<Class<R>> b(Class<T> paramClass, Class<R> paramClass1)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList();
      Iterator localIterator1 = this.a.iterator();
      while (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        List localList = (List)this.b.get(str);
        if (localList != null)
        {
          Iterator localIterator2 = localList.iterator();
          while (localIterator2.hasNext())
          {
            a locala = (a)localIterator2.next();
            if ((locala.a(paramClass, paramClass1)) && (!localArrayList.contains(locala.a))) {
              localArrayList.add(locala.a);
            }
          }
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  private static class a<T, R>
  {
    final Class<R> a;
    final k<T, R> b;
    private final Class<T> c;
    
    public a(Class<T> paramClass, Class<R> paramClass1, k<T, R> paramk)
    {
      this.c = paramClass;
      this.a = paramClass1;
      this.b = paramk;
    }
    
    public boolean a(Class<?> paramClass1, Class<?> paramClass2)
    {
      return (this.c.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.a));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.f.e
 * JD-Core Version:    0.7.0.1
 */