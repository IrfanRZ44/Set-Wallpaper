package com.a.a.d;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

class a
  implements h
{
  private final Set<i> a = Collections.newSetFromMap(new WeakHashMap());
  private boolean b;
  private boolean c;
  
  void a()
  {
    this.b = true;
    Iterator localIterator = com.a.a.i.i.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).c();
    }
  }
  
  public void a(i parami)
  {
    this.a.add(parami);
    if (this.c)
    {
      parami.e();
      return;
    }
    if (this.b)
    {
      parami.c();
      return;
    }
    parami.d();
  }
  
  void b()
  {
    this.b = false;
    Iterator localIterator = com.a.a.i.i.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).d();
    }
  }
  
  public void b(i parami)
  {
    this.a.remove(parami);
  }
  
  void c()
  {
    this.c = true;
    Iterator localIterator = com.a.a.i.i.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).e();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.a
 * JD-Core Version:    0.7.0.1
 */