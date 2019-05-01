package android.support.v4.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class h<K, V>
{
  h<K, V>.b b;
  h<K, V>.c c;
  h<K, V>.e d;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      if (!paramMap.containsKey(localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool3;
    if (paramSet == paramObject) {
      bool3 = bool1;
    }
    boolean bool2;
    do
    {
      return bool3;
      bool2 = paramObject instanceof Set;
      bool3 = false;
    } while (!bool2);
    Set localSet = (Set)paramObject;
    try
    {
      if (paramSet.size() == localSet.size())
      {
        boolean bool4 = paramSet.containsAll(localSet);
        if (!bool4) {}
      }
      for (;;)
      {
        return bool1;
        bool1 = false;
      }
      return false;
    }
    catch (ClassCastException localClassCastException)
    {
      return false;
    }
    catch (NullPointerException localNullPointerException) {}
  }
  
  public static <K, V> boolean b(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      paramMap.remove(localIterator.next());
    }
    return i != paramMap.size();
  }
  
  public static <K, V> boolean c(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
      }
    }
    return i != paramMap.size();
  }
  
  protected abstract int a();
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract V a(int paramInt, V paramV);
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(K paramK, V paramV);
  
  public <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    int i = a();
    if (paramArrayOfT.length < i) {}
    for (Object localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);; localObject = paramArrayOfT)
    {
      for (int j = 0; j < i; j++) {
        localObject[j] = a(j, paramInt);
      }
      if (localObject.length > i) {
        localObject[i] = null;
      }
      return localObject;
    }
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map<K, V> b();
  
  public Object[] b(int paramInt)
  {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = a(j, paramInt);
    }
    return arrayOfObject;
  }
  
  protected abstract void c();
  
  public Set<Map.Entry<K, V>> d()
  {
    if (this.b == null) {
      this.b = new b();
    }
    return this.b;
  }
  
  public Set<K> e()
  {
    if (this.c == null) {
      this.c = new c();
    }
    return this.c;
  }
  
  public Collection<V> f()
  {
    if (this.d == null) {
      this.d = new e();
    }
    return this.d;
  }
  
  final class a<T>
    implements Iterator<T>
  {
    final int a;
    int b;
    int c;
    boolean d = false;
    
    a(int paramInt)
    {
      this.a = paramInt;
      this.b = h.this.a();
    }
    
    public boolean hasNext()
    {
      return this.c < this.b;
    }
    
    public T next()
    {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      Object localObject = h.this.a(this.c, this.a);
      this.c = (1 + this.c);
      this.d = true;
      return localObject;
    }
    
    public void remove()
    {
      if (!this.d) {
        throw new IllegalStateException();
      }
      this.c = (-1 + this.c);
      this.b = (-1 + this.b);
      this.d = false;
      h.this.a(this.c);
    }
  }
  
  final class b
    implements Set<Map.Entry<K, V>>
  {
    b() {}
    
    public boolean a(Map.Entry<K, V> paramEntry)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = h.this.a();
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        h.this.a(localEntry.getKey(), localEntry.getValue());
      }
      return i != h.this.a();
    }
    
    public void clear()
    {
      h.this.c();
    }
    
    public boolean contains(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {}
      Map.Entry localEntry;
      int i;
      do
      {
        return false;
        localEntry = (Map.Entry)paramObject;
        i = h.this.a(localEntry.getKey());
      } while (i < 0);
      return c.a(h.this.a(i, 1), localEntry.getValue());
    }
    
    public boolean containsAll(Collection<?> paramCollection)
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext()) {
        if (!contains(localIterator.next())) {
          return false;
        }
      }
      return true;
    }
    
    public boolean equals(Object paramObject)
    {
      return h.a(this, paramObject);
    }
    
    public int hashCode()
    {
      int i = -1 + h.this.a();
      int j = 0;
      if (i >= 0)
      {
        Object localObject1 = h.this.a(i, 0);
        Object localObject2 = h.this.a(i, 1);
        int k;
        if (localObject1 == null)
        {
          k = 0;
          label44:
          if (localObject2 != null) {
            break label79;
          }
        }
        label79:
        for (int m = 0;; m = localObject2.hashCode())
        {
          int n = j + (m ^ k);
          i--;
          j = n;
          break;
          k = localObject1.hashCode();
          break label44;
        }
      }
      return j;
    }
    
    public boolean isEmpty()
    {
      return h.this.a() == 0;
    }
    
    public Iterator<Map.Entry<K, V>> iterator()
    {
      return new h.d(h.this);
    }
    
    public boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean removeAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean retainAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public int size()
    {
      return h.this.a();
    }
    
    public Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }
    
    public <T> T[] toArray(T[] paramArrayOfT)
    {
      throw new UnsupportedOperationException();
    }
  }
  
  final class c
    implements Set<K>
  {
    c() {}
    
    public boolean add(K paramK)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends K> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public void clear()
    {
      h.this.c();
    }
    
    public boolean contains(Object paramObject)
    {
      return h.this.a(paramObject) >= 0;
    }
    
    public boolean containsAll(Collection<?> paramCollection)
    {
      return h.a(h.this.b(), paramCollection);
    }
    
    public boolean equals(Object paramObject)
    {
      return h.a(this, paramObject);
    }
    
    public int hashCode()
    {
      int i = -1 + h.this.a();
      int j = 0;
      if (i >= 0)
      {
        Object localObject = h.this.a(i, 0);
        if (localObject == null) {}
        for (int k = 0;; k = localObject.hashCode())
        {
          j += k;
          i--;
          break;
        }
      }
      return j;
    }
    
    public boolean isEmpty()
    {
      return h.this.a() == 0;
    }
    
    public Iterator<K> iterator()
    {
      return new h.a(h.this, 0);
    }
    
    public boolean remove(Object paramObject)
    {
      int i = h.this.a(paramObject);
      if (i >= 0)
      {
        h.this.a(i);
        return true;
      }
      return false;
    }
    
    public boolean removeAll(Collection<?> paramCollection)
    {
      return h.b(h.this.b(), paramCollection);
    }
    
    public boolean retainAll(Collection<?> paramCollection)
    {
      return h.c(h.this.b(), paramCollection);
    }
    
    public int size()
    {
      return h.this.a();
    }
    
    public Object[] toArray()
    {
      return h.this.b(0);
    }
    
    public <T> T[] toArray(T[] paramArrayOfT)
    {
      return h.this.a(paramArrayOfT, 0);
    }
  }
  
  final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    int a = -1 + h.this.a();
    int b = -1;
    boolean c = false;
    
    d() {}
    
    public Map.Entry<K, V> a()
    {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      this.b = (1 + this.b);
      this.c = true;
      return this;
    }
    
    public boolean equals(Object paramObject)
    {
      int i = 1;
      if (!this.c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      Map.Entry localEntry = (Map.Entry)paramObject;
      if ((c.a(localEntry.getKey(), h.this.a(this.b, 0))) && (c.a(localEntry.getValue(), h.this.a(this.b, i)))) {}
      for (;;)
      {
        return i;
        int j = 0;
      }
    }
    
    public K getKey()
    {
      if (!this.c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return h.this.a(this.b, 0);
    }
    
    public V getValue()
    {
      if (!this.c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return h.this.a(this.b, 1);
    }
    
    public boolean hasNext()
    {
      return this.b < this.a;
    }
    
    public int hashCode()
    {
      if (!this.c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      Object localObject1 = h.this.a(this.b, 0);
      Object localObject2 = h.this.a(this.b, 1);
      int i;
      int j;
      if (localObject1 == null)
      {
        i = 0;
        j = 0;
        if (localObject2 != null) {
          break label69;
        }
      }
      for (;;)
      {
        return j ^ i;
        i = localObject1.hashCode();
        break;
        label69:
        j = localObject2.hashCode();
      }
    }
    
    public void remove()
    {
      if (!this.c) {
        throw new IllegalStateException();
      }
      h.this.a(this.b);
      this.b = (-1 + this.b);
      this.a = (-1 + this.a);
      this.c = false;
    }
    
    public V setValue(V paramV)
    {
      if (!this.c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return h.this.a(this.b, paramV);
    }
    
    public String toString()
    {
      return getKey() + "=" + getValue();
    }
  }
  
  final class e
    implements Collection<V>
  {
    e() {}
    
    public boolean add(V paramV)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends V> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public void clear()
    {
      h.this.c();
    }
    
    public boolean contains(Object paramObject)
    {
      return h.this.b(paramObject) >= 0;
    }
    
    public boolean containsAll(Collection<?> paramCollection)
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext()) {
        if (!contains(localIterator.next())) {
          return false;
        }
      }
      return true;
    }
    
    public boolean isEmpty()
    {
      return h.this.a() == 0;
    }
    
    public Iterator<V> iterator()
    {
      return new h.a(h.this, 1);
    }
    
    public boolean remove(Object paramObject)
    {
      int i = h.this.b(paramObject);
      if (i >= 0)
      {
        h.this.a(i);
        return true;
      }
      return false;
    }
    
    public boolean removeAll(Collection<?> paramCollection)
    {
      int i = 0;
      int j = h.this.a();
      boolean bool = false;
      while (i < j)
      {
        if (paramCollection.contains(h.this.a(i, 1)))
        {
          h.this.a(i);
          i--;
          j--;
          bool = true;
        }
        i++;
      }
      return bool;
    }
    
    public boolean retainAll(Collection<?> paramCollection)
    {
      int i = 0;
      int j = h.this.a();
      boolean bool = false;
      while (i < j)
      {
        if (!paramCollection.contains(h.this.a(i, 1)))
        {
          h.this.a(i);
          i--;
          j--;
          bool = true;
        }
        i++;
      }
      return bool;
    }
    
    public int size()
    {
      return h.this.a();
    }
    
    public Object[] toArray()
    {
      return h.this.b(1);
    }
    
    public <T> T[] toArray(T[] paramArrayOfT)
    {
      return h.this.a(paramArrayOfT, 1);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.f.h
 * JD-Core Version:    0.7.0.1
 */