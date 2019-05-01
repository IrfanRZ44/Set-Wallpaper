package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zq<E>
  extends AbstractList<E>
  implements abj<E>
{
  private boolean a = true;
  
  public boolean a()
  {
    return this.a;
  }
  
  public void add(int paramInt, E paramE)
  {
    c();
    super.add(paramInt, paramE);
  }
  
  public boolean add(E paramE)
  {
    c();
    return super.add(paramE);
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    c();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    c();
    return super.addAll(paramCollection);
  }
  
  public final void b()
  {
    this.a = false;
  }
  
  protected final void c()
  {
    if (!this.a) {
      throw new UnsupportedOperationException();
    }
  }
  
  public void clear()
  {
    c();
    super.clear();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    for (;;)
    {
      return true;
      if (!(paramObject instanceof List)) {
        return false;
      }
      if (!(paramObject instanceof RandomAccess)) {
        return super.equals(paramObject);
      }
      List localList = (List)paramObject;
      int i = size();
      if (i != localList.size()) {
        return false;
      }
      for (int j = 0; j < i; j++) {
        if (!get(j).equals(localList.get(j))) {
          return false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + get(k).hashCode();
    }
    return j;
  }
  
  public E remove(int paramInt)
  {
    c();
    return super.remove(paramInt);
  }
  
  public boolean remove(Object paramObject)
  {
    c();
    return super.remove(paramObject);
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    c();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    c();
    return super.retainAll(paramCollection);
  }
  
  public E set(int paramInt, E paramE)
  {
    c();
    return super.set(paramInt, paramE);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zq
 * JD-Core Version:    0.7.0.1
 */