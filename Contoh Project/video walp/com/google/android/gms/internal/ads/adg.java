package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class adg
{
  private static final Class<?> a = ;
  private static final adx<?, ?> b = a(false);
  private static final adx<?, ?> c = a(true);
  private static final adx<?, ?> d = new adz();
  
  static int a(int paramInt, Object paramObject, ade paramade)
  {
    if ((paramObject instanceof abs)) {
      return aak.a(paramInt, (abs)paramObject);
    }
    return aak.b(paramInt, (acl)paramObject, paramade);
  }
  
  static int a(int paramInt, List<?> paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = i * aak.e(paramInt);
    if ((paramList instanceof abu))
    {
      abu localabu = (abu)paramList;
      int n = 0;
      if (n < i)
      {
        Object localObject2 = localabu.b(n);
        if ((localObject2 instanceof zw)) {}
        for (int i1 = j + aak.b((zw)localObject2);; i1 = j + aak.b((String)localObject2))
        {
          n++;
          j = i1;
          break;
        }
      }
      return j;
    }
    int k = 0;
    if (k < i)
    {
      Object localObject1 = paramList.get(k);
      if ((localObject1 instanceof zw)) {}
      for (int m = j + aak.b((zw)localObject1);; m = j + aak.b((String)localObject1))
      {
        k++;
        j = m;
        break;
      }
    }
    return j;
  }
  
  static int a(int paramInt, List<?> paramList, ade paramade)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = i * aak.e(paramInt);
    int k = 0;
    if (k < i)
    {
      Object localObject = paramList.get(k);
      if ((localObject instanceof abs)) {}
      for (int m = j + aak.a((abs)localObject);; m = j + aak.a((acl)localObject, paramade))
      {
        k++;
        j = m;
        break;
      }
    }
    return j;
  }
  
  static int a(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    return a(paramList) + paramList.size() * aak.e(paramInt);
  }
  
  static int a(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {}
    for (;;)
    {
      return j;
      if (!(paramList instanceof abz)) {
        break;
      }
      abz localabz = (abz)paramList;
      int n = 0;
      while (n < i)
      {
        int i1 = j + aak.d(localabz.b(n));
        n++;
        j = i1;
      }
    }
    int k = 0;
    int m = 0;
    while (k < i)
    {
      m += aak.d(((Long)paramList.get(k)).longValue());
      k++;
    }
    return m;
  }
  
  public static adx<?, ?> a()
  {
    return b;
  }
  
  private static adx<?, ?> a(boolean paramBoolean)
  {
    try
    {
      Class localClass = e();
      if (localClass == null) {
        return null;
      }
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      Constructor localConstructor = localClass.getConstructor(arrayOfClass);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      adx localadx = (adx)localConstructor.newInstance(arrayOfObject);
      return localadx;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  static <UT, UB> UB a(int paramInt1, int paramInt2, UB paramUB, adx<UT, UB> paramadx)
  {
    if (paramUB == null) {
      paramUB = paramadx.a();
    }
    paramadx.a(paramUB, paramInt1, paramInt2);
    return paramUB;
  }
  
  static <UT, UB> UB a(int paramInt, List<Integer> paramList, abi<?> paramabi, UB paramUB, adx<UT, UB> paramadx)
  {
    if (paramabi == null) {
      return paramUB;
    }
    Object localObject1;
    if ((paramList instanceof RandomAccess))
    {
      int j = paramList.size();
      int k = 0;
      int m = 0;
      localObject1 = paramUB;
      if (k < j)
      {
        int n = ((Integer)paramList.get(k)).intValue();
        int i2;
        Object localObject3;
        if (paramabi.a(n) != null)
        {
          if (k != m) {
            paramList.set(m, Integer.valueOf(n));
          }
          i2 = m + 1;
          localObject3 = localObject1;
        }
        for (;;)
        {
          k++;
          localObject1 = localObject3;
          m = i2;
          break;
          Object localObject2 = a(paramInt, n, localObject1, paramadx);
          int i1 = m;
          localObject3 = localObject2;
          i2 = i1;
        }
      }
      if (m != j) {
        paramList.subList(m, j).clear();
      }
    }
    for (;;)
    {
      return localObject1;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        if (paramabi.a(i) == null)
        {
          paramUB = a(paramInt, i, paramUB, paramadx);
          localIterator.remove();
        }
      }
      localObject1 = paramUB;
    }
  }
  
  public static void a(int paramInt, List<String> paramList, aer paramaer)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.a(paramInt, paramList);
    }
  }
  
  public static void a(int paramInt, List<?> paramList, aer paramaer, ade paramade)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.a(paramInt, paramList, paramade);
    }
  }
  
  public static void a(int paramInt, List<Double> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.g(paramInt, paramList, paramBoolean);
    }
  }
  
  static <T, FT extends aay<FT>> void a(aat<FT> paramaat, T paramT1, T paramT2)
  {
    aaw localaaw = paramaat.a(paramT2);
    if (!localaaw.b()) {
      paramaat.b(paramT1).a(localaaw);
    }
  }
  
  static <T> void a(acg paramacg, T paramT1, T paramT2, long paramLong)
  {
    aed.a(paramT1, paramLong, paramacg.a(aed.f(paramT1, paramLong), aed.f(paramT2, paramLong)));
  }
  
  static <T, UT, UB> void a(adx<UT, UB> paramadx, T paramT1, T paramT2)
  {
    paramadx.a(paramT1, paramadx.c(paramadx.b(paramT1), paramadx.b(paramT2)));
  }
  
  public static void a(Class<?> paramClass)
  {
    if ((!abe.class.isAssignableFrom(paramClass)) && (a != null) && (!a.isAssignableFrom(paramClass))) {
      throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 < 40) {}
    long l1;
    long l2;
    long l3;
    do
    {
      return true;
      l1 = 1L + (paramInt2 - paramInt1);
      l2 = 3L + 2L * paramInt3;
      l3 = 3L + paramInt3;
    } while (l1 + 9L <= l2 + l3 * 3L);
    return false;
  }
  
  static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  static int b(int paramInt, List<zw> paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = i * aak.e(paramInt);
    for (int k = 0; k < paramList.size(); k++) {
      j += aak.b((zw)paramList.get(k));
    }
    return j;
  }
  
  static int b(int paramInt, List<acl> paramList, ade paramade)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += aak.c(paramInt, (acl)paramList.get(j), paramade);
      j++;
    }
    return k;
  }
  
  static int b(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return b(paramList) + i * aak.e(paramInt);
  }
  
  static int b(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {}
    for (;;)
    {
      return j;
      if (!(paramList instanceof abz)) {
        break;
      }
      abz localabz = (abz)paramList;
      int n = 0;
      while (n < i)
      {
        int i1 = j + aak.e(localabz.b(n));
        n++;
        j = i1;
      }
    }
    int k = 0;
    int m = 0;
    while (k < i)
    {
      m += aak.e(((Long)paramList.get(k)).longValue());
      k++;
    }
    return m;
  }
  
  public static adx<?, ?> b()
  {
    return c;
  }
  
  public static void b(int paramInt, List<zw> paramList, aer paramaer)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.b(paramInt, paramList);
    }
  }
  
  public static void b(int paramInt, List<?> paramList, aer paramaer, ade paramade)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.b(paramInt, paramList, paramade);
    }
  }
  
  public static void b(int paramInt, List<Float> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.f(paramInt, paramList, paramBoolean);
    }
  }
  
  static int c(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return c(paramList) + i * aak.e(paramInt);
  }
  
  static int c(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {}
    for (;;)
    {
      return j;
      if (!(paramList instanceof abz)) {
        break;
      }
      abz localabz = (abz)paramList;
      int n = 0;
      while (n < i)
      {
        int i1 = j + aak.f(localabz.b(n));
        n++;
        j = i1;
      }
    }
    int k = 0;
    int m = 0;
    while (k < i)
    {
      m += aak.f(((Long)paramList.get(k)).longValue());
      k++;
    }
    return m;
  }
  
  public static adx<?, ?> c()
  {
    return d;
  }
  
  public static void c(int paramInt, List<Long> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.c(paramInt, paramList, paramBoolean);
    }
  }
  
  static int d(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return d(paramList) + i * aak.e(paramInt);
  }
  
  static int d(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {}
    for (;;)
    {
      return j;
      if (!(paramList instanceof abf)) {
        break;
      }
      abf localabf = (abf)paramList;
      int n = 0;
      while (n < i)
      {
        int i1 = j + aak.k(localabf.b(n));
        n++;
        j = i1;
      }
    }
    int k = 0;
    int m = 0;
    while (k < i)
    {
      m += aak.k(((Integer)paramList.get(k)).intValue());
      k++;
    }
    return m;
  }
  
  private static Class<?> d()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.GeneratedMessage");
      return localClass;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static void d(int paramInt, List<Long> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.d(paramInt, paramList, paramBoolean);
    }
  }
  
  static int e(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return e(paramList) + i * aak.e(paramInt);
  }
  
  static int e(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {}
    for (;;)
    {
      return j;
      if (!(paramList instanceof abf)) {
        break;
      }
      abf localabf = (abf)paramList;
      int n = 0;
      while (n < i)
      {
        int i1 = j + aak.f(localabf.b(n));
        n++;
        j = i1;
      }
    }
    int k = 0;
    int m = 0;
    while (k < i)
    {
      m += aak.f(((Integer)paramList.get(k)).intValue());
      k++;
    }
    return m;
  }
  
  private static Class<?> e()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static void e(int paramInt, List<Long> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.n(paramInt, paramList, paramBoolean);
    }
  }
  
  static int f(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return f(paramList) + i * aak.e(paramInt);
  }
  
  static int f(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {}
    for (;;)
    {
      return j;
      if (!(paramList instanceof abf)) {
        break;
      }
      abf localabf = (abf)paramList;
      int n = 0;
      while (n < i)
      {
        int i1 = j + aak.g(localabf.b(n));
        n++;
        j = i1;
      }
    }
    int k = 0;
    int m = 0;
    while (k < i)
    {
      m += aak.g(((Integer)paramList.get(k)).intValue());
      k++;
    }
    return m;
  }
  
  public static void f(int paramInt, List<Long> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.e(paramInt, paramList, paramBoolean);
    }
  }
  
  static int g(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return g(paramList) + i * aak.e(paramInt);
  }
  
  static int g(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {}
    for (;;)
    {
      return j;
      if (!(paramList instanceof abf)) {
        break;
      }
      abf localabf = (abf)paramList;
      int n = 0;
      while (n < i)
      {
        int i1 = j + aak.h(localabf.b(n));
        n++;
        j = i1;
      }
    }
    int k = 0;
    int m = 0;
    while (k < i)
    {
      m += aak.h(((Integer)paramList.get(k)).intValue());
      k++;
    }
    return m;
  }
  
  public static void g(int paramInt, List<Long> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.l(paramInt, paramList, paramBoolean);
    }
  }
  
  static int h(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * aak.i(paramInt, 0);
  }
  
  static int h(List<?> paramList)
  {
    return paramList.size() << 2;
  }
  
  public static void h(int paramInt, List<Integer> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.a(paramInt, paramList, paramBoolean);
    }
  }
  
  static int i(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * aak.g(paramInt, 0L);
  }
  
  static int i(List<?> paramList)
  {
    return paramList.size() << 3;
  }
  
  public static void i(int paramInt, List<Integer> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.j(paramInt, paramList, paramBoolean);
    }
  }
  
  static int j(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * aak.b(paramInt, true);
  }
  
  static int j(List<?> paramList)
  {
    return paramList.size();
  }
  
  public static void j(int paramInt, List<Integer> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.m(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void k(int paramInt, List<Integer> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.b(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void l(int paramInt, List<Integer> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.k(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void m(int paramInt, List<Integer> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.h(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void n(int paramInt, List<Boolean> paramList, aer paramaer, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramaer.i(paramInt, paramList, paramBoolean);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adg
 * JD-Core Version:    0.7.0.1
 */