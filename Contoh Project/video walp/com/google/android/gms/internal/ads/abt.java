package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class abt
  extends zq<String>
  implements abu, RandomAccess
{
  private static final abt a;
  private static final abu b = a;
  private final List<Object> c;
  
  static
  {
    abt localabt = new abt();
    a = localabt;
    localabt.b();
  }
  
  public abt()
  {
    this(10);
  }
  
  public abt(int paramInt)
  {
    this(new ArrayList(paramInt));
  }
  
  private abt(ArrayList<Object> paramArrayList)
  {
    this.c = paramArrayList;
  }
  
  private static String a(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof zw)) {
      return ((zw)paramObject).c();
    }
    return abg.b((byte[])paramObject);
  }
  
  public final void a(zw paramzw)
  {
    c();
    this.c.add(paramzw);
    this.modCount = (1 + this.modCount);
  }
  
  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection)
  {
    c();
    if ((paramCollection instanceof abu)) {
      paramCollection = ((abu)paramCollection).d();
    }
    boolean bool = this.c.addAll(paramInt, paramCollection);
    this.modCount = (1 + this.modCount);
    return bool;
  }
  
  public final boolean addAll(Collection<? extends String> paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final Object b(int paramInt)
  {
    return this.c.get(paramInt);
  }
  
  public final void clear()
  {
    c();
    this.c.clear();
    this.modCount = (1 + this.modCount);
  }
  
  public final List<?> d()
  {
    return Collections.unmodifiableList(this.c);
  }
  
  public final abu e()
  {
    if (a()) {
      this = new aea(this);
    }
    return this;
  }
  
  public final int size()
  {
    return this.c.size();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abt
 * JD-Core Version:    0.7.0.1
 */