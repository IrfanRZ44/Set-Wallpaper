package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class aam
  implements aer
{
  private final aak a;
  
  private aam(aak paramaak)
  {
    this.a = ((aak)abg.a(paramaak, "output"));
    this.a.a = this;
  }
  
  public static aam a(aak paramaak)
  {
    if (paramaak.a != null) {
      return paramaak.a;
    }
    return new aam(paramaak);
  }
  
  public final int a()
  {
    return abe.e.j;
  }
  
  public final void a(int paramInt)
  {
    this.a.a(paramInt, 3);
  }
  
  public final void a(int paramInt, double paramDouble)
  {
    this.a.a(paramInt, paramDouble);
  }
  
  public final void a(int paramInt, float paramFloat)
  {
    this.a.a(paramInt, paramFloat);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.e(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt, long paramLong)
  {
    this.a.a(paramInt, paramLong);
  }
  
  public final <K, V> void a(int paramInt, ace<K, V> paramace, Map<K, V> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.a.a(paramInt, 2);
      this.a.b(acd.a(paramace, localEntry.getKey(), localEntry.getValue()));
      acd.a(this.a, paramace, localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public final void a(int paramInt, zw paramzw)
  {
    this.a.a(paramInt, paramzw);
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof zw))
    {
      this.a.b(paramInt, (zw)paramObject);
      return;
    }
    this.a.a(paramInt, (acl)paramObject);
  }
  
  public final void a(int paramInt, Object paramObject, ade paramade)
  {
    this.a.a(paramInt, (acl)paramObject, paramade);
  }
  
  public final void a(int paramInt, String paramString)
  {
    this.a.a(paramInt, paramString);
  }
  
  public final void a(int paramInt, List<String> paramList)
  {
    boolean bool = paramList instanceof abu;
    int i = 0;
    if (bool)
    {
      abu localabu = (abu)paramList;
      int j = 0;
      if (j < paramList.size())
      {
        Object localObject = localabu.b(j);
        if ((localObject instanceof String)) {
          this.a.a(paramInt, (String)localObject);
        }
        for (;;)
        {
          j++;
          break;
          this.a.a(paramInt, (zw)localObject);
        }
      }
    }
    else
    {
      while (i < paramList.size())
      {
        this.a.a(paramInt, (String)paramList.get(i));
        i++;
      }
    }
  }
  
  public final void a(int paramInt, List<?> paramList, ade paramade)
  {
    for (int i = 0; i < paramList.size(); i++) {
      a(paramInt, paramList.get(i), paramade);
    }
  }
  
  public final void a(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.f(((Integer)paramList.get(j)).intValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.a(((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.b(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    this.a.a(paramInt, paramBoolean);
  }
  
  public final void b(int paramInt)
  {
    this.a.a(paramInt, 4);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.a.b(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt, long paramLong)
  {
    this.a.c(paramInt, paramLong);
  }
  
  public final void b(int paramInt, Object paramObject, ade paramade)
  {
    aak localaak = this.a;
    acl localacl = (acl)paramObject;
    localaak.a(paramInt, 3);
    paramade.a(localacl, localaak.a);
    localaak.a(paramInt, 4);
  }
  
  public final void b(int paramInt, List<zw> paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      this.a.a(paramInt, (zw)paramList.get(i));
    }
  }
  
  public final void b(int paramInt, List<?> paramList, ade paramade)
  {
    for (int i = 0; i < paramList.size(); i++) {
      b(paramInt, paramList.get(i), paramade);
    }
  }
  
  public final void b(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.i(((Integer)paramList.get(j)).intValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.d(((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.e(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    this.a.b(paramInt1, paramInt2);
  }
  
  public final void c(int paramInt, long paramLong)
  {
    this.a.a(paramInt, paramLong);
  }
  
  public final void c(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.d(((Long)paramList.get(j)).longValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.a(((Long)paramList.get(i)).longValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    this.a.e(paramInt1, paramInt2);
  }
  
  public final void d(int paramInt, long paramLong)
  {
    this.a.c(paramInt, paramLong);
  }
  
  public final void d(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.e(((Long)paramList.get(j)).longValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.a(((Long)paramList.get(i)).longValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    this.a.c(paramInt1, paramInt2);
  }
  
  public final void e(int paramInt, long paramLong)
  {
    this.a.b(paramInt, paramLong);
  }
  
  public final void e(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.g(((Long)paramList.get(j)).longValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.c(((Long)paramList.get(i)).longValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.c(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void f(int paramInt1, int paramInt2)
  {
    this.a.d(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt, List<Float> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.b(((Float)paramList.get(j)).floatValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.a(((Float)paramList.get(i)).floatValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    }
  }
  
  public final void g(int paramInt, List<Double> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.b(((Double)paramList.get(j)).doubleValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.a(((Double)paramList.get(i)).doubleValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    }
  }
  
  public final void h(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.k(((Integer)paramList.get(j)).intValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.a(((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.b(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void i(int paramInt, List<Boolean> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.b(((Boolean)paramList.get(j)).booleanValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.a(((Boolean)paramList.get(i)).booleanValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public final void j(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.g(((Integer)paramList.get(j)).intValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.b(((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.c(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void k(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.j(((Integer)paramList.get(j)).intValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.d(((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.e(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void l(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.h(((Long)paramList.get(j)).longValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.c(((Long)paramList.get(i)).longValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.c(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void m(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.h(((Integer)paramList.get(j)).intValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.c(((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.d(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void n(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      int j = 0;
      int k = 0;
      while (j < paramList.size())
      {
        k += aak.f(((Long)paramList.get(j)).longValue());
        j++;
      }
      this.a.b(k);
      while (i < paramList.size())
      {
        this.a.b(((Long)paramList.get(i)).longValue());
        i++;
      }
    }
    while (i < paramList.size())
    {
      this.a.b(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aam
 * JD-Core Version:    0.7.0.1
 */