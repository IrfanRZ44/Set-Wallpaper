package com.a.a.d;

import com.a.a.g.b;
import com.a.a.i.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class n
{
  private final Set<b> a = Collections.newSetFromMap(new WeakHashMap());
  private final List<b> b = new ArrayList();
  private boolean c;
  
  private boolean a(b paramb, boolean paramBoolean)
  {
    boolean bool1 = true;
    if (paramb == null) {}
    label63:
    for (;;)
    {
      return bool1;
      boolean bool2 = this.a.remove(paramb);
      if ((this.b.remove(paramb)) || (bool2)) {}
      for (;;)
      {
        if (!bool1) {
          break label63;
        }
        paramb.c();
        if (!paramBoolean) {
          break;
        }
        paramb.i();
        return bool1;
        bool1 = false;
      }
    }
  }
  
  public void a()
  {
    this.c = true;
    Iterator localIterator = i.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.d())
      {
        localb.b();
        this.b.add(localb);
      }
    }
  }
  
  public void a(b paramb)
  {
    this.a.add(paramb);
    if (!this.c)
    {
      paramb.a();
      return;
    }
    this.b.add(paramb);
  }
  
  public void b()
  {
    this.c = false;
    Iterator localIterator = i.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if ((!localb.e()) && (!localb.g()) && (!localb.d())) {
        localb.a();
      }
    }
    this.b.clear();
  }
  
  public boolean b(b paramb)
  {
    return a(paramb, true);
  }
  
  public void c()
  {
    Iterator localIterator = i.a(this.a).iterator();
    while (localIterator.hasNext()) {
      a((b)localIterator.next(), false);
    }
    this.b.clear();
  }
  
  public void d()
  {
    Iterator localIterator = i.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if ((!localb.e()) && (!localb.g()))
      {
        localb.b();
        if (!this.c) {
          localb.a();
        } else {
          this.b.add(localb);
        }
      }
    }
  }
  
  public String toString()
  {
    return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.n
 * JD-Core Version:    0.7.0.1
 */