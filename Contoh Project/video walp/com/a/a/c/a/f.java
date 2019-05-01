package com.a.a.c.a;

import com.a.a.i.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class f
{
  private static final e.a<?> b = new e.a()
  {
    public e<Object> a(Object paramAnonymousObject)
    {
      return new f.a(paramAnonymousObject);
    }
    
    public Class<Object> a()
    {
      throw new UnsupportedOperationException("Not implemented");
    }
  };
  private final Map<Class<?>, e.a<?>> a = new HashMap();
  
  public <T> e<T> a(T paramT)
  {
    try
    {
      h.a(paramT);
      Object localObject2 = (e.a)this.a.get(paramT.getClass());
      if (localObject2 == null)
      {
        Iterator localIterator = this.a.values().iterator();
        while (localIterator.hasNext())
        {
          e.a locala = (e.a)localIterator.next();
          if (locala.a().isAssignableFrom(paramT.getClass())) {
            localObject2 = locala;
          }
        }
      }
      if (localObject2 == null) {
        localObject2 = b;
      }
      e locale = ((e.a)localObject2).a(paramT);
      return locale;
    }
    finally {}
  }
  
  public void a(e.a<?> parama)
  {
    try
    {
      this.a.put(parama.a(), parama);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static final class a
    implements e<Object>
  {
    private final Object a;
    
    a(Object paramObject)
    {
      this.a = paramObject;
    }
    
    public Object a()
    {
      return this.a;
    }
    
    public void b() {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.f
 * JD-Core Version:    0.7.0.1
 */