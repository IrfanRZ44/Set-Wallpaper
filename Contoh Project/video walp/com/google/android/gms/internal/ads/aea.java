package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class aea
  extends AbstractList<String>
  implements abu, RandomAccess
{
  private final abu a;
  
  public aea(abu paramabu)
  {
    this.a = paramabu;
  }
  
  public final void a(zw paramzw)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object b(int paramInt)
  {
    return this.a.b(paramInt);
  }
  
  public final List<?> d()
  {
    return this.a.d();
  }
  
  public final abu e()
  {
    return this;
  }
  
  public final Iterator<String> iterator()
  {
    return new aec(this);
  }
  
  public final ListIterator<String> listIterator(int paramInt)
  {
    return new aeb(this, paramInt);
  }
  
  public final int size()
  {
    return this.a.size();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aea
 * JD-Core Version:    0.7.0.1
 */