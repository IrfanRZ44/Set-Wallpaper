package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class acz<E>
  extends zq<E>
{
  private static final acz<Object> a;
  private final List<E> b;
  
  static
  {
    acz localacz = new acz();
    a = localacz;
    localacz.b();
  }
  
  acz()
  {
    this(new ArrayList(10));
  }
  
  private acz(List<E> paramList)
  {
    this.b = paramList;
  }
  
  public static <E> acz<E> d()
  {
    return a;
  }
  
  public final void add(int paramInt, E paramE)
  {
    c();
    this.b.add(paramInt, paramE);
    this.modCount = (1 + this.modCount);
  }
  
  public final E get(int paramInt)
  {
    return this.b.get(paramInt);
  }
  
  public final E remove(int paramInt)
  {
    c();
    Object localObject = this.b.remove(paramInt);
    this.modCount = (1 + this.modCount);
    return localObject;
  }
  
  public final E set(int paramInt, E paramE)
  {
    c();
    Object localObject = this.b.set(paramInt, paramE);
    this.modCount = (1 + this.modCount);
    return localObject;
  }
  
  public final int size()
  {
    return this.b.size();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.acz
 * JD-Core Version:    0.7.0.1
 */