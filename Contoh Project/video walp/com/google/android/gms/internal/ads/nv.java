package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@cm
public class nv<T>
  implements nr<T>
{
  private final Object a = new Object();
  private int b = 0;
  private final BlockingQueue<nw> c = new LinkedBlockingQueue();
  private T d;
  
  public final void a()
  {
    synchronized (this.a)
    {
      if (this.b != 0) {
        throw new UnsupportedOperationException();
      }
    }
    this.b = -1;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((nw)localIterator.next()).b.a();
    }
    this.c.clear();
  }
  
  public final void a(nu<T> paramnu, ns paramns)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.b == 1)
        {
          paramnu.a(this.d);
          return;
        }
        if (this.b == -1) {
          paramns.a();
        }
      }
      if (this.b == 0) {
        this.c.add(new nw(this, paramnu, paramns));
      }
    }
  }
  
  public final void a(T paramT)
  {
    synchronized (this.a)
    {
      if (this.b != 0) {
        throw new UnsupportedOperationException();
      }
    }
    this.d = paramT;
    this.b = 1;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((nw)localIterator.next()).a.a(paramT);
    }
    this.c.clear();
  }
  
  public final int b()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.nv
 * JD-Core Version:    0.7.0.1
 */