package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class adh<K extends Comparable<K>, V>
  extends AbstractMap<K, V>
{
  private final int a;
  private List<ado> b;
  private Map<K, V> c;
  private boolean d;
  private volatile adq e;
  private Map<K, V> f;
  private volatile adk g;
  
  private adh(int paramInt)
  {
    this.a = paramInt;
    this.b = Collections.emptyList();
    this.c = Collections.emptyMap();
    this.f = Collections.emptyMap();
  }
  
  private final int a(K paramK)
  {
    int i = -1 + this.b.size();
    if (i >= 0)
    {
      int i1 = paramK.compareTo((Comparable)((ado)this.b.get(i)).getKey());
      if (i1 > 0) {
        return -(i + 2);
      }
      if (i1 == 0) {
        return i;
      }
    }
    for (;;)
    {
      int k;
      int j;
      if (k <= j)
      {
        int m = (k + j) / 2;
        int n = paramK.compareTo((Comparable)((ado)this.b.get(m)).getKey());
        if (n < 0) {
          j = m - 1;
        } else if (n > 0) {
          k = m + 1;
        } else {
          return m;
        }
      }
      else
      {
        return -(k + 1);
        j = i;
        k = 0;
      }
    }
  }
  
  static <FieldDescriptorType extends aay<FieldDescriptorType>> adh<FieldDescriptorType, Object> a(int paramInt)
  {
    return new adi(paramInt);
  }
  
  private final V c(int paramInt)
  {
    f();
    Object localObject = ((ado)this.b.remove(paramInt)).getValue();
    if (!this.c.isEmpty())
    {
      Iterator localIterator = g().entrySet().iterator();
      this.b.add(new ado(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    return localObject;
  }
  
  private final void f()
  {
    if (this.d) {
      throw new UnsupportedOperationException();
    }
  }
  
  private final SortedMap<K, V> g()
  {
    f();
    if ((this.c.isEmpty()) && (!(this.c instanceof TreeMap)))
    {
      this.c = new TreeMap();
      this.f = ((TreeMap)this.c).descendingMap();
    }
    return (SortedMap)this.c;
  }
  
  public final V a(K paramK, V paramV)
  {
    f();
    int i = a(paramK);
    if (i >= 0) {
      return ((ado)this.b.get(i)).setValue(paramV);
    }
    f();
    if ((this.b.isEmpty()) && (!(this.b instanceof ArrayList))) {
      this.b = new ArrayList(this.a);
    }
    int j = -(i + 1);
    if (j >= this.a) {
      return g().put(paramK, paramV);
    }
    if (this.b.size() == this.a)
    {
      ado localado = (ado)this.b.remove(-1 + this.a);
      g().put((Comparable)localado.getKey(), localado.getValue());
    }
    this.b.add(j, new ado(this, paramK, paramV));
    return null;
  }
  
  public void a()
  {
    Map localMap1;
    if (!this.d)
    {
      if (!this.c.isEmpty()) {
        break label55;
      }
      localMap1 = Collections.emptyMap();
      this.c = localMap1;
      if (!this.f.isEmpty()) {
        break label66;
      }
    }
    label55:
    label66:
    for (Map localMap2 = Collections.emptyMap();; localMap2 = Collections.unmodifiableMap(this.f))
    {
      this.f = localMap2;
      this.d = true;
      return;
      localMap1 = Collections.unmodifiableMap(this.c);
      break;
    }
  }
  
  public final Map.Entry<K, V> b(int paramInt)
  {
    return (Map.Entry)this.b.get(paramInt);
  }
  
  public final boolean b()
  {
    return this.d;
  }
  
  public final int c()
  {
    return this.b.size();
  }
  
  public void clear()
  {
    f();
    if (!this.b.isEmpty()) {
      this.b.clear();
    }
    if (!this.c.isEmpty()) {
      this.c.clear();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    Comparable localComparable = (Comparable)paramObject;
    return (a(localComparable) >= 0) || (this.c.containsKey(localComparable));
  }
  
  public final Iterable<Map.Entry<K, V>> d()
  {
    if (this.c.isEmpty()) {
      return adl.a();
    }
    return this.c.entrySet();
  }
  
  final Set<Map.Entry<K, V>> e()
  {
    if (this.g == null) {
      this.g = new adk(this, null);
    }
    return this.g;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    if (this.e == null) {
      this.e = new adq(this, null);
    }
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    adh localadh;
    int i;
    int j;
    do
    {
      return true;
      if (!(paramObject instanceof adh)) {
        return super.equals(paramObject);
      }
      localadh = (adh)paramObject;
      i = size();
      if (i != localadh.size()) {
        return false;
      }
      j = c();
      if (j != localadh.c()) {
        return entrySet().equals(localadh.entrySet());
      }
      for (int k = 0; k < j; k++) {
        if (!b(k).equals(localadh.b(k))) {
          return false;
        }
      }
    } while (j == i);
    return this.c.equals(localadh.c);
  }
  
  public V get(Object paramObject)
  {
    Comparable localComparable = (Comparable)paramObject;
    int i = a(localComparable);
    if (i >= 0) {
      return ((ado)this.b.get(i)).getValue();
    }
    return this.c.get(localComparable);
  }
  
  public int hashCode()
  {
    int i = c();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((ado)this.b.get(j)).hashCode();
      j++;
    }
    if (this.c.size() > 0) {
      return k + this.c.hashCode();
    }
    return k;
  }
  
  public V remove(Object paramObject)
  {
    f();
    Comparable localComparable = (Comparable)paramObject;
    int i = a(localComparable);
    if (i >= 0) {
      return c(i);
    }
    if (this.c.isEmpty()) {
      return null;
    }
    return this.c.remove(localComparable);
  }
  
  public int size()
  {
    return this.b.size() + this.c.size();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adh
 * JD-Core Version:    0.7.0.1
 */