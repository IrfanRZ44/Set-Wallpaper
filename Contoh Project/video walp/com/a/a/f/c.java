package com.a.a.f;

import android.support.v4.f.a;
import com.a.a.c.b.h;
import com.a.a.c.b.s;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class c
{
  private static final s<?, ?, ?> a;
  private final a<com.a.a.i.g, s<?, ?, ?>> b = new a();
  private final AtomicReference<com.a.a.i.g> c = new AtomicReference();
  
  static
  {
    s locals = new s(Object.class, Object.class, Object.class, Collections.singletonList(new h(Object.class, Object.class, Object.class, Collections.emptyList(), new com.a.a.c.d.f.g(), null)), null);
    a = locals;
  }
  
  private com.a.a.i.g b(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3)
  {
    com.a.a.i.g localg = (com.a.a.i.g)this.c.getAndSet(null);
    if (localg == null) {
      localg = new com.a.a.i.g();
    }
    localg.a(paramClass1, paramClass2, paramClass3);
    return localg;
  }
  
  public <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2)
  {
    com.a.a.i.g localg = b(paramClass, paramClass1, paramClass2);
    synchronized (this.b)
    {
      s locals = (s)this.b.get(localg);
      this.c.set(localg);
      return locals;
    }
  }
  
  public void a(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3, s<?, ?, ?> params)
  {
    synchronized (this.b)
    {
      a locala2 = this.b;
      com.a.a.i.g localg = new com.a.a.i.g(paramClass1, paramClass2, paramClass3);
      if (params != null)
      {
        locala2.put(localg, params);
        return;
      }
      params = a;
    }
  }
  
  public boolean a(s<?, ?, ?> params)
  {
    return a.equals(params);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.f.c
 * JD-Core Version:    0.7.0.1
 */