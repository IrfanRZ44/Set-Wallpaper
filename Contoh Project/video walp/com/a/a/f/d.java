package com.a.a.f;

import android.support.v4.f.a;
import com.a.a.i.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class d
{
  private final AtomicReference<g> a = new AtomicReference();
  private final a<g, List<Class<?>>> b = new a();
  
  public List<Class<?>> a(Class<?> paramClass1, Class<?> paramClass2)
  {
    g localg1 = (g)this.a.getAndSet(null);
    g localg2;
    if (localg1 == null) {
      localg2 = new g(paramClass1, paramClass2);
    }
    synchronized (this.b)
    {
      List localList = (List)this.b.get(localg2);
      this.a.set(localg2);
      return localList;
      localg1.a(paramClass1, paramClass2);
      localg2 = localg1;
    }
  }
  
  public void a(Class<?> paramClass1, Class<?> paramClass2, List<Class<?>> paramList)
  {
    synchronized (this.b)
    {
      this.b.put(new g(paramClass1, paramClass2), paramList);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.f.d
 * JD-Core Version:    0.7.0.1
 */