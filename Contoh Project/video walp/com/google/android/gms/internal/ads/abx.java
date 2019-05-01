package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class abx
  extends abv
{
  private static final Class<?> a = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private abx()
  {
    super(null);
  }
  
  private static <L> List<L> a(Object paramObject, long paramLong, int paramInt)
  {
    Object localObject = c(paramObject, paramLong);
    if (((List)localObject).isEmpty()) {
      if ((localObject instanceof abu))
      {
        localObject = new abt(paramInt);
        aed.a(paramObject, paramLong, localObject);
      }
    }
    do
    {
      return localObject;
      localObject = new ArrayList(paramInt);
      break;
      if (a.isAssignableFrom(localObject.getClass()))
      {
        ArrayList localArrayList = new ArrayList(paramInt + ((List)localObject).size());
        localArrayList.addAll((Collection)localObject);
        aed.a(paramObject, paramLong, localArrayList);
        return localArrayList;
      }
    } while (!(localObject instanceof aea));
    abt localabt = new abt(paramInt + ((List)localObject).size());
    localabt.addAll((aea)localObject);
    aed.a(paramObject, paramLong, localabt);
    return localabt;
  }
  
  private static <E> List<E> c(Object paramObject, long paramLong)
  {
    return (List)aed.f(paramObject, paramLong);
  }
  
  final <L> List<L> a(Object paramObject, long paramLong)
  {
    return a(paramObject, paramLong, 10);
  }
  
  final <E> void a(Object paramObject1, Object paramObject2, long paramLong)
  {
    List localList1 = c(paramObject2, paramLong);
    List localList2 = a(paramObject1, paramLong, localList1.size());
    int i = localList2.size();
    int j = localList1.size();
    if ((i > 0) && (j > 0)) {
      localList2.addAll(localList1);
    }
    if (i > 0) {}
    for (;;)
    {
      aed.a(paramObject1, paramLong, localList2);
      return;
      localList2 = localList1;
    }
  }
  
  final void b(Object paramObject, long paramLong)
  {
    List localList = (List)aed.f(paramObject, paramLong);
    if ((localList instanceof abu)) {}
    for (Object localObject = ((abu)localList).e();; localObject = Collections.unmodifiableList(localList))
    {
      aed.a(paramObject, paramLong, localObject);
      do
      {
        return;
      } while (a.isAssignableFrom(localList.getClass()));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abx
 * JD-Core Version:    0.7.0.1
 */