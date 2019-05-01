package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class acf<K, V>
  extends LinkedHashMap<K, V>
{
  private static final acf b;
  private boolean a = true;
  
  static
  {
    acf localacf = new acf();
    b = localacf;
    localacf.a = false;
  }
  
  private acf() {}
  
  private acf(Map<K, V> paramMap)
  {
    super(paramMap);
  }
  
  private static int a(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return abg.c((byte[])paramObject);
    }
    if ((paramObject instanceof abh)) {
      throw new UnsupportedOperationException();
    }
    return paramObject.hashCode();
  }
  
  public static <K, V> acf<K, V> a()
  {
    return b;
  }
  
  private final void e()
  {
    if (!this.a) {
      throw new UnsupportedOperationException();
    }
  }
  
  public final void a(acf<K, V> paramacf)
  {
    e();
    if (!paramacf.isEmpty()) {
      putAll(paramacf);
    }
  }
  
  public final acf<K, V> b()
  {
    if (isEmpty()) {
      return new acf();
    }
    return new acf(this);
  }
  
  public final void c()
  {
    this.a = false;
  }
  
  public final void clear()
  {
    e();
    super.clear();
  }
  
  public final boolean d()
  {
    return this.a;
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    if (isEmpty()) {
      return Collections.emptySet();
    }
    return super.entrySet();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      int i;
      if (this != localMap) {
        if (size() != localMap.size()) {
          i = 0;
        }
      }
      while (i != 0)
      {
        return true;
        Iterator localIterator = entrySet().iterator();
        label171:
        for (;;)
        {
          if (!localIterator.hasNext()) {
            break label173;
          }
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (!localMap.containsKey(localEntry.getKey()))
          {
            i = 0;
            break;
          }
          Object localObject1 = localEntry.getValue();
          Object localObject2 = localMap.get(localEntry.getKey());
          if (((localObject1 instanceof byte[])) && ((localObject2 instanceof byte[]))) {}
          for (boolean bool = Arrays.equals((byte[])localObject1, (byte[])localObject2);; bool = localObject1.equals(localObject2))
          {
            if (bool) {
              break label171;
            }
            i = 0;
            break;
          }
        }
        label173:
        i = 1;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      i += (a(localEntry.getKey()) ^ a(localEntry.getValue()));
    }
    return i;
  }
  
  public final V put(K paramK, V paramV)
  {
    e();
    abg.a(paramK);
    abg.a(paramV);
    return super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    e();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      abg.a(localObject);
      abg.a(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    e();
    return super.remove(paramObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.acf
 * JD-Core Version:    0.7.0.1
 */