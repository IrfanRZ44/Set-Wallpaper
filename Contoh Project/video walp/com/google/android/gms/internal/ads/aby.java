package com.google.android.gms.internal.ads;

import java.util.List;

final class aby
  extends abv
{
  private aby()
  {
    super(null);
  }
  
  private static <E> abj<E> c(Object paramObject, long paramLong)
  {
    return (abj)aed.f(paramObject, paramLong);
  }
  
  final <L> List<L> a(Object paramObject, long paramLong)
  {
    abj localabj1 = c(paramObject, paramLong);
    if (!localabj1.a())
    {
      int i = localabj1.size();
      if (i == 0) {}
      for (int j = 10;; j = i << 1)
      {
        abj localabj2 = localabj1.a(j);
        aed.a(paramObject, paramLong, localabj2);
        return localabj2;
      }
    }
    return localabj1;
  }
  
  final <E> void a(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = c(paramObject1, paramLong);
    abj localabj = c(paramObject2, paramLong);
    int i = ((abj)localObject).size();
    int j = localabj.size();
    if ((i > 0) && (j > 0))
    {
      if (!((abj)localObject).a()) {
        localObject = ((abj)localObject).a(j + i);
      }
      ((abj)localObject).addAll(localabj);
    }
    if (i > 0) {}
    for (;;)
    {
      aed.a(paramObject1, paramLong, localObject);
      return;
      localObject = localabj;
    }
  }
  
  final void b(Object paramObject, long paramLong)
  {
    c(paramObject, paramLong).b();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aby
 * JD-Core Version:    0.7.0.1
 */