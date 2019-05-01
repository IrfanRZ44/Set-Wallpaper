package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class acs<T>
  implements ade<T>
{
  private final acl a;
  private final adx<?, ?> b;
  private final boolean c;
  private final aat<?> d;
  
  private acs(adx<?, ?> paramadx, aat<?> paramaat, acl paramacl)
  {
    this.b = paramadx;
    this.c = paramaat.a(paramacl);
    this.d = paramaat;
    this.a = paramacl;
  }
  
  static <T> acs<T> a(adx<?, ?> paramadx, aat<?> paramaat, acl paramacl)
  {
    return new acs(paramadx, paramaat, paramacl);
  }
  
  public final int a(T paramT)
  {
    int i = this.b.b(paramT).hashCode();
    if (this.c)
    {
      aaw localaaw = this.d.a(paramT);
      i = i * 53 + localaaw.hashCode();
    }
    return i;
  }
  
  public final T a()
  {
    return this.a.o().d();
  }
  
  public final void a(T paramT, add paramadd, aar paramaar)
  {
    adx localadx = this.b;
    aat localaat = this.d;
    Object localObject1 = localadx.c(paramT);
    aaw localaaw = localaat.b(paramT);
    label259:
    label313:
    for (;;)
    {
      int k;
      Object localObject3;
      try
      {
        int i = paramadd.a();
        if (i == 2147483647) {
          return;
        }
        int j = paramadd.b();
        if (j == 11) {
          break label313;
        }
        if ((j & 0x7) == 2)
        {
          Object localObject4 = localaat.a(paramaar, this.a, j >>> 3);
          if (localObject4 != null)
          {
            localaat.a(paramadd, localObject4, paramaar, localaaw);
            bool = true;
            if (bool) {
              continue;
            }
            return;
          }
          bool = localadx.a(localObject1, paramadd);
          continue;
        }
        boolean bool = paramadd.c();
        continue;
        if (paramadd.a() == 2147483647) {
          break label259;
        }
        int m = paramadd.b();
        if (m == 16)
        {
          k = paramadd.o();
          localObject3 = localaat.a(paramaar, this.a, k);
          continue;
        }
        if (m != 26) {
          break label250;
        }
        if (localObject3 != null)
        {
          localaat.a(paramadd, localObject3, paramaar, localaaw);
          continue;
        }
        localzw = paramadd.n();
      }
      finally
      {
        localadx.b(paramT, localObject1);
      }
      zw localzw;
      continue;
      label250:
      if (!paramadd.c())
      {
        if (paramadd.b() != 12) {
          throw abk.e();
        }
        if (localzw != null) {
          if (localObject3 != null)
          {
            localaat.a(localzw, localObject3, paramaar, localaaw);
          }
          else
          {
            localadx.a(localObject1, k, localzw);
            continue;
            localObject3 = null;
            localzw = null;
            k = 0;
          }
        }
      }
    }
  }
  
  public final void a(T paramT, aer paramaer)
  {
    Iterator localIterator = this.d.a(paramT).e();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      aay localaay = (aay)localEntry.getKey();
      if ((localaay.c() != aeq.i) || (localaay.d()) || (localaay.e())) {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
      if ((localEntry instanceof abp)) {
        paramaer.a(localaay.a(), ((abp)localEntry).a().c());
      } else {
        paramaer.a(localaay.a(), localEntry.getValue());
      }
    }
    adx localadx = this.b;
    localadx.b(localadx.b(paramT), paramaer);
  }
  
  public final void a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zt paramzt)
  {
    ady localady = ((abe)paramT).zzdtt;
    if (localady == ady.a())
    {
      localady = ady.b();
      ((abe)paramT).zzdtt = localady;
    }
    while (paramInt1 < paramInt2)
    {
      int i = zs.a(paramArrayOfByte, paramInt1, paramzt);
      int j = paramzt.a;
      if (j != 11)
      {
        if ((j & 0x7) == 2) {
          paramInt1 = zs.a(j, paramArrayOfByte, i, paramInt2, localady, paramzt);
        } else {
          paramInt1 = zs.a(j, paramArrayOfByte, i, paramInt2, paramzt);
        }
      }
      else
      {
        int k = i;
        int m = 0;
        Object localObject = null;
        while (k < paramInt2)
        {
          k = zs.a(paramArrayOfByte, k, paramzt);
          int n = paramzt.a;
          int i1 = n >>> 3;
          int i2 = n & 0x7;
          switch (i1)
          {
          }
          do
          {
            do
            {
              if (n == 12) {
                break label270;
              }
              k = zs.a(n, paramArrayOfByte, k, paramInt2, paramzt);
              break;
            } while (i2 != 0);
            int i4 = zs.a(paramArrayOfByte, k, paramzt);
            int i5 = paramzt.a;
            k = i4;
            m = i5;
            break;
          } while (i2 != 2);
          int i3 = zs.e(paramArrayOfByte, k, paramzt);
          zw localzw = (zw)paramzt.c;
          k = i3;
          localObject = localzw;
        }
        label270:
        if (localObject != null) {
          localady.a(0x2 | m << 3, localObject);
        }
        paramInt1 = k;
      }
    }
    if (paramInt1 != paramInt2) {
      throw abk.g();
    }
  }
  
  public final boolean a(T paramT1, T paramT2)
  {
    if (!this.b.b(paramT1).equals(this.b.b(paramT2))) {
      return false;
    }
    if (this.c) {
      return this.d.a(paramT1).equals(this.d.a(paramT2));
    }
    return true;
  }
  
  public final int b(T paramT)
  {
    adx localadx = this.b;
    int i = 0 + localadx.e(localadx.b(paramT));
    if (this.c) {
      i += this.d.a(paramT).i();
    }
    return i;
  }
  
  public final void b(T paramT1, T paramT2)
  {
    adg.a(this.b, paramT1, paramT2);
    if (this.c) {
      adg.a(this.d, paramT1, paramT2);
    }
  }
  
  public final void c(T paramT)
  {
    this.b.d(paramT);
    this.d.c(paramT);
  }
  
  public final boolean d(T paramT)
  {
    return this.d.a(paramT).g();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.acs
 * JD-Core Version:    0.7.0.1
 */