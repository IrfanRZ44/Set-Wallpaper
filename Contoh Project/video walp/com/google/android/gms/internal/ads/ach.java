package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ach
  implements acg
{
  public final int a(int paramInt, Object paramObject1, Object paramObject2)
  {
    acf localacf = (acf)paramObject1;
    if (localacf.isEmpty()) {}
    Iterator localIterator;
    do
    {
      return 0;
      localIterator = localacf.entrySet().iterator();
    } while (!localIterator.hasNext());
    Map.Entry localEntry = (Map.Entry)localIterator.next();
    localEntry.getKey();
    localEntry.getValue();
    throw new NoSuchMethodError();
  }
  
  public final Object a(Object paramObject1, Object paramObject2)
  {
    acf localacf1 = (acf)paramObject1;
    acf localacf2 = (acf)paramObject2;
    if (!localacf2.isEmpty())
    {
      if (!localacf1.d()) {
        localacf1 = localacf1.b();
      }
      localacf1.a(localacf2);
    }
    return localacf1;
  }
  
  public final Map<?, ?> a(Object paramObject)
  {
    return (acf)paramObject;
  }
  
  public final Map<?, ?> b(Object paramObject)
  {
    return (acf)paramObject;
  }
  
  public final boolean c(Object paramObject)
  {
    return !((acf)paramObject).d();
  }
  
  public final Object d(Object paramObject)
  {
    ((acf)paramObject).c();
    return paramObject;
  }
  
  public final Object e(Object paramObject)
  {
    return acf.a().b();
  }
  
  public final ace<?, ?> f(Object paramObject)
  {
    throw new NoSuchMethodError();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ach
 * JD-Core Version:    0.7.0.1
 */