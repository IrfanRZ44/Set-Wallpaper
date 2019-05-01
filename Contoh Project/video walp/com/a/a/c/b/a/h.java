package com.a.a.c.b.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class h<K extends m, V>
{
  private final a<K, V> a = new a();
  private final Map<K, a<K, V>> b = new HashMap();
  
  private void a(a<K, V> parama)
  {
    d(parama);
    parama.c = this.a;
    parama.b = this.a.b;
    c(parama);
  }
  
  private void b(a<K, V> parama)
  {
    d(parama);
    parama.c = this.a.c;
    parama.b = this.a;
    c(parama);
  }
  
  private static <K, V> void c(a<K, V> parama)
  {
    parama.b.c = parama;
    parama.c.b = parama;
  }
  
  private static <K, V> void d(a<K, V> parama)
  {
    parama.c.b = parama.b;
    parama.b.c = parama.c;
  }
  
  public V a()
  {
    for (a locala = this.a.c; !locala.equals(this.a); locala = locala.c)
    {
      Object localObject = locala.a();
      if (localObject != null) {
        return localObject;
      }
      d(locala);
      this.b.remove(locala.a);
      ((m)locala.a).a();
    }
    return null;
  }
  
  public V a(K paramK)
  {
    a locala = (a)this.b.get(paramK);
    if (locala == null)
    {
      locala = new a(paramK);
      this.b.put(paramK, locala);
    }
    for (;;)
    {
      a(locala);
      return locala.a();
      paramK.a();
    }
  }
  
  public void a(K paramK, V paramV)
  {
    a locala = (a)this.b.get(paramK);
    if (locala == null)
    {
      locala = new a(paramK);
      b(locala);
      this.b.put(paramK, locala);
    }
    for (;;)
    {
      locala.a(paramV);
      return;
      paramK.a();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("GroupedLinkedMap( ");
    a locala = this.a.b;
    int i = 0;
    while (!locala.equals(this.a))
    {
      i = 1;
      localStringBuilder.append('{').append(locala.a).append(':').append(locala.b()).append("}, ");
      locala = locala.b;
    }
    if (i != 0) {
      localStringBuilder.delete(-2 + localStringBuilder.length(), localStringBuilder.length());
    }
    return " )";
  }
  
  private static class a<K, V>
  {
    final K a;
    a<K, V> b = this;
    a<K, V> c = this;
    private List<V> d;
    
    a()
    {
      this(null);
    }
    
    a(K paramK)
    {
      this.a = paramK;
    }
    
    public V a()
    {
      int i = b();
      if (i > 0) {
        return this.d.remove(i - 1);
      }
      return null;
    }
    
    public void a(V paramV)
    {
      if (this.d == null) {
        this.d = new ArrayList();
      }
      this.d.add(paramV);
    }
    
    public int b()
    {
      if (this.d != null) {
        return this.d.size();
      }
      return 0;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a.h
 * JD-Core Version:    0.7.0.1
 */