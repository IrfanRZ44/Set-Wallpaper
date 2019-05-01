package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

final class aai
  implements add
{
  private final aaf a;
  private int b;
  private int c;
  private int d = 0;
  
  private aai(aaf paramaaf)
  {
    this.a = ((aaf)abg.a(paramaaf, "input"));
    this.a.c = this;
  }
  
  public static aai a(aaf paramaaf)
  {
    if (paramaaf.c != null) {
      return paramaaf.c;
    }
    return new aai(paramaaf);
  }
  
  private final Object a(ael paramael, Class<?> paramClass, aar paramaar)
  {
    switch (aaj.a[paramael.ordinal()])
    {
    default: 
      throw new RuntimeException("unsupported field type.");
    case 1: 
      return Boolean.valueOf(k());
    case 2: 
      return n();
    case 3: 
      return Double.valueOf(d());
    case 4: 
      return Integer.valueOf(p());
    case 5: 
      return Integer.valueOf(j());
    case 6: 
      return Long.valueOf(i());
    case 7: 
      return Float.valueOf(e());
    case 8: 
      return Integer.valueOf(h());
    case 9: 
      return Long.valueOf(g());
    case 10: 
      a(2);
      return c(acy.a().a(paramClass), paramaar);
    case 11: 
      return Integer.valueOf(q());
    case 12: 
      return Long.valueOf(r());
    case 13: 
      return Integer.valueOf(s());
    case 14: 
      return Long.valueOf(t());
    case 15: 
      return m();
    case 16: 
      return Integer.valueOf(o());
    }
    return Long.valueOf(f());
  }
  
  private final void a(int paramInt)
  {
    if ((0x7 & this.b) != paramInt) {
      throw abk.f();
    }
  }
  
  private final void a(List<String> paramList, boolean paramBoolean)
  {
    if ((0x7 & this.b) != 2) {
      throw abk.f();
    }
    if (((paramList instanceof abu)) && (!paramBoolean))
    {
      abu localabu = (abu)paramList;
      int j;
      do
      {
        localabu.a(n());
        if (this.a.t()) {
          return;
        }
        j = this.a.a();
      } while (j == this.b);
      this.d = j;
      return;
    }
    label79:
    if (paramBoolean) {}
    for (String str = m();; str = l())
    {
      paramList.add(str);
      if (this.a.t()) {
        break;
      }
      int i = this.a.a();
      if (i == this.b) {
        break label79;
      }
      this.d = i;
      return;
    }
  }
  
  private static void b(int paramInt)
  {
    if ((paramInt & 0x7) != 0) {
      throw abk.g();
    }
  }
  
  private final <T> T c(ade<T> paramade, aar paramaar)
  {
    int i = this.a.m();
    if (this.a.a >= this.a.b) {
      throw new abk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
    int j = this.a.c(i);
    Object localObject = paramade.a();
    aaf localaaf1 = this.a;
    localaaf1.a = (1 + localaaf1.a);
    paramade.a(localObject, this, paramaar);
    paramade.c(localObject);
    this.a.a(0);
    aaf localaaf2 = this.a;
    localaaf2.a = (-1 + localaaf2.a);
    this.a.d(j);
    return localObject;
  }
  
  private static void c(int paramInt)
  {
    if ((paramInt & 0x3) != 0) {
      throw abk.g();
    }
  }
  
  private final <T> T d(ade<T> paramade, aar paramaar)
  {
    int i = this.c;
    this.c = (0x4 | this.b >>> 3 << 3);
    Object localObject2;
    try
    {
      localObject2 = paramade.a();
      paramade.a(localObject2, this, paramaar);
      paramade.c(localObject2);
      if (this.b != this.c) {
        throw abk.g();
      }
    }
    finally
    {
      this.c = i;
    }
    this.c = i;
    return localObject2;
  }
  
  private final void d(int paramInt)
  {
    if (this.a.u() != paramInt) {
      throw abk.a();
    }
  }
  
  public final int a()
  {
    if (this.d != 0)
    {
      this.b = this.d;
      this.d = 0;
    }
    while ((this.b == 0) || (this.b == this.c))
    {
      return 2147483647;
      this.b = this.a.a();
    }
    return this.b >>> 3;
  }
  
  public final <T> T a(ade<T> paramade, aar paramaar)
  {
    a(2);
    return c(paramade, paramaar);
  }
  
  public final void a(List<Double> paramList)
  {
    if ((paramList instanceof aan))
    {
      aan localaan = (aan)paramList;
      switch (0x7 & this.b)
      {
      default: 
        throw abk.f();
      case 2: 
        int n = this.a.m();
        b(n);
        int i1 = n + this.a.u();
        do
        {
          localaan.a(this.a.b());
        } while (this.a.u() < i1);
        return;
      }
      int m;
      do
      {
        localaan.a(this.a.b());
        if (this.a.t()) {
          break;
        }
        m = this.a.a();
      } while (m == this.b);
      this.d = m;
      return;
    }
    switch (0x7 & this.b)
    {
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m();
      b(j);
      int k = j + this.a.u();
      do
      {
        paramList.add(Double.valueOf(this.a.b()));
      } while (this.a.u() < k);
      return;
    }
    int i;
    do
    {
      paramList.add(Double.valueOf(this.a.b()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final <T> void a(List<T> paramList, ade<T> paramade, aar paramaar)
  {
    if ((0x7 & this.b) != 2) {
      throw abk.f();
    }
    int i = this.b;
    int j;
    do
    {
      paramList.add(c(paramade, paramaar));
      if ((this.a.t()) || (this.d != 0)) {
        return;
      }
      j = this.a.a();
    } while (j == i);
    this.d = j;
  }
  
  public final <K, V> void a(Map<K, V> paramMap, ace<K, V> paramace, aar paramaar)
  {
    a(2);
    int i = this.a.m();
    int j = this.a.c(i);
    Object localObject1 = paramace.b;
    Object localObject2 = paramace.d;
    for (;;)
    {
      try
      {
        int k = a();
        if (k == 2147483647) {
          break;
        }
        boolean bool = this.a.t();
        if (bool) {
          break;
        }
        switch (k)
        {
        default: 
          try
          {
            if (c()) {
              continue;
            }
            throw new abk("Unable to parse map entry.");
          }
          catch (abl localabl) {}
          if (c()) {
            continue;
          }
          throw new abk("Unable to parse map entry.");
        }
      }
      finally
      {
        this.a.d(j);
      }
      localObject1 = a(paramace.a, null, null);
      continue;
      Object localObject4 = a(paramace.c, paramace.d.getClass(), paramaar);
      localObject2 = localObject4;
    }
    paramMap.put(localObject1, localObject2);
    this.a.d(j);
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final <T> T b(ade<T> paramade, aar paramaar)
  {
    a(3);
    return d(paramade, paramaar);
  }
  
  public final void b(List<Float> paramList)
  {
    if ((paramList instanceof abc))
    {
      abc localabc = (abc)paramList;
      switch (0x7 & this.b)
      {
      case 3: 
      case 4: 
      default: 
        throw abk.f();
      case 2: 
        int n = this.a.m();
        c(n);
        int i1 = n + this.a.u();
        do
        {
          localabc.a(this.a.c());
        } while (this.a.u() < i1);
        return;
      }
      int m;
      do
      {
        localabc.a(this.a.c());
        if (this.a.t()) {
          break;
        }
        m = this.a.a();
      } while (m == this.b);
      this.d = m;
      return;
    }
    switch (0x7 & this.b)
    {
    case 3: 
    case 4: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m();
      c(j);
      int k = j + this.a.u();
      do
      {
        paramList.add(Float.valueOf(this.a.c()));
      } while (this.a.u() < k);
      return;
    }
    int i;
    do
    {
      paramList.add(Float.valueOf(this.a.c()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final <T> void b(List<T> paramList, ade<T> paramade, aar paramaar)
  {
    if ((0x7 & this.b) != 3) {
      throw abk.f();
    }
    int i = this.b;
    int j;
    do
    {
      paramList.add(d(paramade, paramaar));
      if ((this.a.t()) || (this.d != 0)) {
        return;
      }
      j = this.a.a();
    } while (j == i);
    this.d = j;
  }
  
  public final void c(List<Long> paramList)
  {
    if ((paramList instanceof abz))
    {
      abz localabz = (abz)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localabz.a(this.a.d());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localabz.a(this.a.d());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Long.valueOf(this.a.d()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Long.valueOf(this.a.d()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final boolean c()
  {
    if ((this.a.t()) || (this.b == this.c)) {
      return false;
    }
    return this.a.b(this.b);
  }
  
  public final double d()
  {
    a(1);
    return this.a.b();
  }
  
  public final void d(List<Long> paramList)
  {
    if ((paramList instanceof abz))
    {
      abz localabz = (abz)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localabz.a(this.a.e());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localabz.a(this.a.e());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Long.valueOf(this.a.e()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Long.valueOf(this.a.e()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final float e()
  {
    a(5);
    return this.a.c();
  }
  
  public final void e(List<Integer> paramList)
  {
    if ((paramList instanceof abf))
    {
      abf localabf = (abf)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localabf.c(this.a.f());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localabf.c(this.a.f());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Integer.valueOf(this.a.f()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Integer.valueOf(this.a.f()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final long f()
  {
    a(0);
    return this.a.d();
  }
  
  public final void f(List<Long> paramList)
  {
    if ((paramList instanceof abz))
    {
      abz localabz = (abz)paramList;
      switch (0x7 & this.b)
      {
      default: 
        throw abk.f();
      case 2: 
        int n = this.a.m();
        b(n);
        int i1 = n + this.a.u();
        do
        {
          localabz.a(this.a.g());
        } while (this.a.u() < i1);
        return;
      }
      int m;
      do
      {
        localabz.a(this.a.g());
        if (this.a.t()) {
          break;
        }
        m = this.a.a();
      } while (m == this.b);
      this.d = m;
      return;
    }
    switch (0x7 & this.b)
    {
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m();
      b(j);
      int k = j + this.a.u();
      do
      {
        paramList.add(Long.valueOf(this.a.g()));
      } while (this.a.u() < k);
      return;
    }
    int i;
    do
    {
      paramList.add(Long.valueOf(this.a.g()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final long g()
  {
    a(0);
    return this.a.e();
  }
  
  public final void g(List<Integer> paramList)
  {
    if ((paramList instanceof abf))
    {
      abf localabf = (abf)paramList;
      switch (0x7 & this.b)
      {
      case 3: 
      case 4: 
      default: 
        throw abk.f();
      case 2: 
        int n = this.a.m();
        c(n);
        int i1 = n + this.a.u();
        do
        {
          localabf.c(this.a.h());
        } while (this.a.u() < i1);
        return;
      }
      int m;
      do
      {
        localabf.c(this.a.h());
        if (this.a.t()) {
          break;
        }
        m = this.a.a();
      } while (m == this.b);
      this.d = m;
      return;
    }
    switch (0x7 & this.b)
    {
    case 3: 
    case 4: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m();
      c(j);
      int k = j + this.a.u();
      do
      {
        paramList.add(Integer.valueOf(this.a.h()));
      } while (this.a.u() < k);
      return;
    }
    int i;
    do
    {
      paramList.add(Integer.valueOf(this.a.h()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final int h()
  {
    a(0);
    return this.a.f();
  }
  
  public final void h(List<Boolean> paramList)
  {
    if ((paramList instanceof zu))
    {
      zu localzu = (zu)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localzu.a(this.a.i());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localzu.a(this.a.i());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Boolean.valueOf(this.a.i()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Boolean.valueOf(this.a.i()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final long i()
  {
    a(1);
    return this.a.g();
  }
  
  public final void i(List<String> paramList)
  {
    a(paramList, false);
  }
  
  public final int j()
  {
    a(5);
    return this.a.h();
  }
  
  public final void j(List<String> paramList)
  {
    a(paramList, true);
  }
  
  public final void k(List<zw> paramList)
  {
    if ((0x7 & this.b) != 2) {
      throw abk.f();
    }
    int i;
    do
    {
      paramList.add(n());
      if (this.a.t()) {
        return;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final boolean k()
  {
    a(0);
    return this.a.i();
  }
  
  public final String l()
  {
    a(2);
    return this.a.j();
  }
  
  public final void l(List<Integer> paramList)
  {
    if ((paramList instanceof abf))
    {
      abf localabf = (abf)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localabf.c(this.a.m());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localabf.c(this.a.m());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Integer.valueOf(this.a.m()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Integer.valueOf(this.a.m()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final String m()
  {
    a(2);
    return this.a.k();
  }
  
  public final void m(List<Integer> paramList)
  {
    if ((paramList instanceof abf))
    {
      abf localabf = (abf)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localabf.c(this.a.n());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localabf.c(this.a.n());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Integer.valueOf(this.a.n()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Integer.valueOf(this.a.n()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final zw n()
  {
    a(2);
    return this.a.l();
  }
  
  public final void n(List<Integer> paramList)
  {
    if ((paramList instanceof abf))
    {
      abf localabf = (abf)paramList;
      switch (0x7 & this.b)
      {
      case 3: 
      case 4: 
      default: 
        throw abk.f();
      case 2: 
        int n = this.a.m();
        c(n);
        int i1 = n + this.a.u();
        do
        {
          localabf.c(this.a.o());
        } while (this.a.u() < i1);
        return;
      }
      int m;
      do
      {
        localabf.c(this.a.o());
        if (this.a.t()) {
          break;
        }
        m = this.a.a();
      } while (m == this.b);
      this.d = m;
      return;
    }
    switch (0x7 & this.b)
    {
    case 3: 
    case 4: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m();
      c(j);
      int k = j + this.a.u();
      do
      {
        paramList.add(Integer.valueOf(this.a.o()));
      } while (this.a.u() < k);
      return;
    }
    int i;
    do
    {
      paramList.add(Integer.valueOf(this.a.o()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final int o()
  {
    a(0);
    return this.a.m();
  }
  
  public final void o(List<Long> paramList)
  {
    if ((paramList instanceof abz))
    {
      abz localabz = (abz)paramList;
      switch (0x7 & this.b)
      {
      default: 
        throw abk.f();
      case 2: 
        int n = this.a.m();
        b(n);
        int i1 = n + this.a.u();
        do
        {
          localabz.a(this.a.p());
        } while (this.a.u() < i1);
        return;
      }
      int m;
      do
      {
        localabz.a(this.a.p());
        if (this.a.t()) {
          break;
        }
        m = this.a.a();
      } while (m == this.b);
      this.d = m;
      return;
    }
    switch (0x7 & this.b)
    {
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m();
      b(j);
      int k = j + this.a.u();
      do
      {
        paramList.add(Long.valueOf(this.a.p()));
      } while (this.a.u() < k);
      return;
    }
    int i;
    do
    {
      paramList.add(Long.valueOf(this.a.p()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final int p()
  {
    a(0);
    return this.a.n();
  }
  
  public final void p(List<Integer> paramList)
  {
    if ((paramList instanceof abf))
    {
      abf localabf = (abf)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localabf.c(this.a.q());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localabf.c(this.a.q());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Integer.valueOf(this.a.q()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Integer.valueOf(this.a.q()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final int q()
  {
    a(5);
    return this.a.o();
  }
  
  public final void q(List<Long> paramList)
  {
    if ((paramList instanceof abz))
    {
      abz localabz = (abz)paramList;
      switch (0x7 & this.b)
      {
      case 1: 
      default: 
        throw abk.f();
      case 2: 
        int m = this.a.m() + this.a.u();
        do
        {
          localabz.a(this.a.r());
        } while (this.a.u() < m);
        d(m);
        return;
      }
      int k;
      do
      {
        localabz.a(this.a.r());
        if (this.a.t()) {
          break;
        }
        k = this.a.a();
      } while (k == this.b);
      this.d = k;
      return;
    }
    switch (0x7 & this.b)
    {
    case 1: 
    default: 
      throw abk.f();
    case 2: 
      int j = this.a.m() + this.a.u();
      do
      {
        paramList.add(Long.valueOf(this.a.r()));
      } while (this.a.u() < j);
      d(j);
      return;
    }
    int i;
    do
    {
      paramList.add(Long.valueOf(this.a.r()));
      if (this.a.t()) {
        break;
      }
      i = this.a.a();
    } while (i == this.b);
    this.d = i;
  }
  
  public final long r()
  {
    a(1);
    return this.a.p();
  }
  
  public final int s()
  {
    a(0);
    return this.a.q();
  }
  
  public final long t()
  {
    a(0);
    return this.a.r();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aai
 * JD-Core Version:    0.7.0.1
 */