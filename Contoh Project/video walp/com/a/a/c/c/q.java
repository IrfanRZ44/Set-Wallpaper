package com.a.a.c.c;

import android.support.v4.f.k.a;
import com.a.a.c.a;
import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.b.p;
import com.a.a.c.j;
import com.a.a.g;
import com.a.a.i.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class q<Model, Data>
  implements n<Model, Data>
{
  private final List<n<Model, Data>> a;
  private final k.a<List<Throwable>> b;
  
  q(List<n<Model, Data>> paramList, k.a<List<Throwable>> parama)
  {
    this.a = paramList;
    this.b = parama;
  }
  
  public n.a<Data> a(Model paramModel, int paramInt1, int paramInt2, j paramj)
  {
    int i = this.a.size();
    ArrayList localArrayList = new ArrayList(i);
    int j = 0;
    Object localObject1 = null;
    Object localObject2;
    if (j < i)
    {
      n localn = (n)this.a.get(j);
      if (!localn.a(paramModel)) {
        break label146;
      }
      n.a locala = localn.a(paramModel, paramInt1, paramInt2, paramj);
      if (locala == null) {
        break label146;
      }
      localObject2 = locala.a;
      localArrayList.add(locala.c);
    }
    for (;;)
    {
      j++;
      localObject1 = localObject2;
      break;
      if (!localArrayList.isEmpty()) {
        return new n.a(localObject1, new a(localArrayList, this.b));
      }
      return null;
      label146:
      localObject2 = localObject1;
    }
  }
  
  public boolean a(Model paramModel)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      if (((n)localIterator.next()).a(paramModel)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
  }
  
  static class a<Data>
    implements d<Data>, d.a<Data>
  {
    private final List<d<Data>> a;
    private final k.a<List<Throwable>> b;
    private int c;
    private g d;
    private d.a<? super Data> e;
    private List<Throwable> f;
    
    a(List<d<Data>> paramList, k.a<List<Throwable>> parama)
    {
      this.b = parama;
      h.a(paramList);
      this.a = paramList;
      this.c = 0;
    }
    
    private void e()
    {
      if (this.c < -1 + this.a.size())
      {
        this.c = (1 + this.c);
        a(this.d, this.e);
        return;
      }
      h.a(this.f);
      this.e.a(new p("Fetch failed", new ArrayList(this.f)));
    }
    
    public Class<Data> a()
    {
      return ((d)this.a.get(0)).a();
    }
    
    public void a(g paramg, d.a<? super Data> parama)
    {
      this.d = paramg;
      this.e = parama;
      this.f = ((List)this.b.a());
      ((d)this.a.get(this.c)).a(paramg, this);
    }
    
    public void a(Exception paramException)
    {
      ((List)h.a(this.f)).add(paramException);
      e();
    }
    
    public void a(Data paramData)
    {
      if (paramData != null)
      {
        this.e.a(paramData);
        return;
      }
      e();
    }
    
    public void b()
    {
      if (this.f != null) {
        this.b.a(this.f);
      }
      this.f = null;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((d)localIterator.next()).b();
      }
    }
    
    public void c()
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((d)localIterator.next()).c();
      }
    }
    
    public a d()
    {
      return ((d)this.a.get(0)).d();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.q
 * JD-Core Version:    0.7.0.1
 */