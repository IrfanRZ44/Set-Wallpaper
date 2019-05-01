package com.a.a.d;

import com.a.a.g.a.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class p
  implements i
{
  private final Set<h<?>> a = Collections.newSetFromMap(new WeakHashMap());
  
  public List<h<?>> a()
  {
    return com.a.a.i.i.a(this.a);
  }
  
  public void a(h<?> paramh)
  {
    this.a.add(paramh);
  }
  
  public void b()
  {
    this.a.clear();
  }
  
  public void b(h<?> paramh)
  {
    this.a.remove(paramh);
  }
  
  public void c()
  {
    Iterator localIterator = com.a.a.i.i.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((h)localIterator.next()).c();
    }
  }
  
  public void d()
  {
    Iterator localIterator = com.a.a.i.i.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((h)localIterator.next()).d();
    }
  }
  
  public void e()
  {
    Iterator localIterator = com.a.a.i.i.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((h)localIterator.next()).e();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.p
 * JD-Core Version:    0.7.0.1
 */