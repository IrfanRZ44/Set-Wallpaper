package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class aaw<FieldDescriptorType extends aay<FieldDescriptorType>>
{
  private static final aaw d = new aaw(true);
  private final adh<FieldDescriptorType, Object> a;
  private boolean b;
  private boolean c = false;
  
  private aaw()
  {
    this.a = adh.a(16);
  }
  
  private aaw(boolean paramBoolean)
  {
    this.a = adh.a(0);
    c();
  }
  
  static int a(ael paramael, int paramInt, Object paramObject)
  {
    int i = aak.e(paramInt);
    if (paramael == ael.j) {
      abg.a((acl)paramObject);
    }
    for (int j = i << 1;; j = i) {
      return j + b(paramael, paramObject);
    }
  }
  
  public static <T extends aay<T>> aaw<T> a()
  {
    return d;
  }
  
  private final Object a(FieldDescriptorType paramFieldDescriptorType)
  {
    Object localObject = this.a.get(paramFieldDescriptorType);
    if ((localObject instanceof abn)) {
      localObject = abn.a();
    }
    return localObject;
  }
  
  private static Object a(Object paramObject)
  {
    if ((paramObject instanceof act)) {
      paramObject = ((act)paramObject).a();
    }
    while (!(paramObject instanceof byte[])) {
      return paramObject;
    }
    byte[] arrayOfByte1 = (byte[])paramObject;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    return arrayOfByte2;
  }
  
  static void a(aak paramaak, ael paramael, int paramInt, Object paramObject)
  {
    if (paramael == ael.j)
    {
      abg.a((acl)paramObject);
      acl localacl = (acl)paramObject;
      paramaak.a(paramInt, 3);
      localacl.a(paramaak);
      paramaak.a(paramInt, 4);
      return;
    }
    paramaak.a(paramInt, paramael.b());
    switch (aax.b[paramael.ordinal()])
    {
    default: 
      return;
    case 1: 
      paramaak.a(((Double)paramObject).doubleValue());
      return;
    case 2: 
      paramaak.a(((Float)paramObject).floatValue());
      return;
    case 3: 
      paramaak.a(((Long)paramObject).longValue());
      return;
    case 4: 
      paramaak.a(((Long)paramObject).longValue());
      return;
    case 5: 
      paramaak.a(((Integer)paramObject).intValue());
      return;
    case 6: 
      paramaak.c(((Long)paramObject).longValue());
      return;
    case 7: 
      paramaak.d(((Integer)paramObject).intValue());
      return;
    case 8: 
      paramaak.a(((Boolean)paramObject).booleanValue());
      return;
    case 9: 
      ((acl)paramObject).a(paramaak);
      return;
    case 10: 
      paramaak.a((acl)paramObject);
      return;
    case 11: 
      if ((paramObject instanceof zw))
      {
        paramaak.a((zw)paramObject);
        return;
      }
      paramaak.a((String)paramObject);
      return;
    case 12: 
      if ((paramObject instanceof zw))
      {
        paramaak.a((zw)paramObject);
        return;
      }
      byte[] arrayOfByte = (byte[])paramObject;
      paramaak.c(arrayOfByte, 0, arrayOfByte.length);
      return;
    case 13: 
      paramaak.b(((Integer)paramObject).intValue());
      return;
    case 14: 
      paramaak.d(((Integer)paramObject).intValue());
      return;
    case 15: 
      paramaak.c(((Long)paramObject).longValue());
      return;
    case 16: 
      paramaak.c(((Integer)paramObject).intValue());
      return;
    case 17: 
      paramaak.b(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof abh))
    {
      paramaak.a(((abh)paramObject).a());
      return;
    }
    paramaak.a(((Integer)paramObject).intValue());
  }
  
  private final void a(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.d())
    {
      if (!(paramObject instanceof List)) {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
      localObject1 = new ArrayList();
      ((List)localObject1).addAll((List)paramObject);
      ArrayList localArrayList = (ArrayList)localObject1;
      int i = localArrayList.size();
      int j = 0;
      while (j < i)
      {
        Object localObject2 = localArrayList.get(j);
        j++;
        a(paramFieldDescriptorType.b(), localObject2);
      }
    }
    a(paramFieldDescriptorType.b(), paramObject);
    Object localObject1 = paramObject;
    if ((localObject1 instanceof abn)) {
      this.c = true;
    }
    this.a.a(paramFieldDescriptorType, localObject1);
  }
  
  private static void a(ael paramael, Object paramObject)
  {
    abg.a(paramObject);
    int i = aax.a[paramael.a().ordinal()];
    boolean bool1 = false;
    switch (i)
    {
    }
    while (!bool1)
    {
      throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      bool1 = paramObject instanceof Integer;
      continue;
      bool1 = paramObject instanceof Long;
      continue;
      bool1 = paramObject instanceof Float;
      continue;
      bool1 = paramObject instanceof Double;
      continue;
      bool1 = paramObject instanceof Boolean;
      continue;
      bool1 = paramObject instanceof String;
      continue;
      if (!(paramObject instanceof zw))
      {
        boolean bool4 = paramObject instanceof byte[];
        bool1 = false;
        if (!bool4) {}
      }
      else
      {
        bool1 = true;
        continue;
        if (!(paramObject instanceof Integer))
        {
          boolean bool3 = paramObject instanceof abh;
          bool1 = false;
          if (!bool3) {}
        }
        else
        {
          bool1 = true;
          continue;
          if (!(paramObject instanceof acl))
          {
            boolean bool2 = paramObject instanceof abn;
            bool1 = false;
            if (!bool2) {}
          }
          else
          {
            bool1 = true;
          }
        }
      }
    }
  }
  
  private static boolean a(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    aay localaay = (aay)paramEntry.getKey();
    if (localaay.c() == aeq.i)
    {
      if (localaay.d())
      {
        Iterator localIterator = ((List)paramEntry.getValue()).iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (((acl)localIterator.next()).k());
        return false;
      }
      Object localObject = paramEntry.getValue();
      if ((localObject instanceof acl))
      {
        if (!((acl)localObject).k()) {
          return false;
        }
      }
      else
      {
        if ((localObject instanceof abn)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  private static int b(aay<?> paramaay, Object paramObject)
  {
    int i = 0;
    ael localael = paramaay.b();
    int j = paramaay.a();
    if (paramaay.d())
    {
      if (paramaay.e())
      {
        Iterator localIterator2 = ((List)paramObject).iterator();
        while (localIterator2.hasNext()) {
          i += b(localael, localIterator2.next());
        }
        i = i + aak.e(j) + aak.l(i);
      }
      for (;;)
      {
        return i;
        Iterator localIterator1 = ((List)paramObject).iterator();
        while (localIterator1.hasNext()) {
          i += a(localael, j, localIterator1.next());
        }
      }
    }
    return a(localael, j, paramObject);
  }
  
  private static int b(ael paramael, Object paramObject)
  {
    switch (aax.b[paramael.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 1: 
      return aak.b(((Double)paramObject).doubleValue());
    case 2: 
      return aak.b(((Float)paramObject).floatValue());
    case 3: 
      return aak.d(((Long)paramObject).longValue());
    case 4: 
      return aak.e(((Long)paramObject).longValue());
    case 5: 
      return aak.f(((Integer)paramObject).intValue());
    case 6: 
      return aak.g(((Long)paramObject).longValue());
    case 7: 
      return aak.i(((Integer)paramObject).intValue());
    case 8: 
      return aak.b(((Boolean)paramObject).booleanValue());
    case 9: 
      return aak.c((acl)paramObject);
    case 12: 
      if ((paramObject instanceof zw)) {
        return aak.b((zw)paramObject);
      }
      return aak.b((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof zw)) {
        return aak.b((zw)paramObject);
      }
      return aak.b((String)paramObject);
    case 13: 
      return aak.g(((Integer)paramObject).intValue());
    case 14: 
      return aak.j(((Integer)paramObject).intValue());
    case 15: 
      return aak.h(((Long)paramObject).longValue());
    case 16: 
      return aak.h(((Integer)paramObject).intValue());
    case 17: 
      return aak.f(((Long)paramObject).longValue());
    case 10: 
      if ((paramObject instanceof abn)) {
        return aak.a((abn)paramObject);
      }
      return aak.b((acl)paramObject);
    }
    if ((paramObject instanceof abh)) {
      return aak.k(((abh)paramObject).a());
    }
    return aak.k(((Integer)paramObject).intValue());
  }
  
  private final void b(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    aay localaay = (aay)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    if ((localObject1 instanceof abn)) {
      localObject1 = abn.a();
    }
    if (localaay.d())
    {
      Object localObject4 = a(localaay);
      if (localObject4 == null) {
        localObject4 = new ArrayList();
      }
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        Object localObject5 = localIterator.next();
        ((List)localObject4).add(a(localObject5));
      }
      this.a.a(localaay, localObject4);
      return;
    }
    if (localaay.c() == aeq.i)
    {
      Object localObject2 = a(localaay);
      if (localObject2 == null)
      {
        this.a.a(localaay, a(localObject1));
        return;
      }
      if ((localObject2 instanceof act)) {}
      for (Object localObject3 = localaay.a((act)localObject2, (act)localObject1);; localObject3 = localaay.a(((acl)localObject2).n(), (acl)localObject1).e())
      {
        this.a.a(localaay, localObject3);
        return;
      }
    }
    this.a.a(localaay, a(localObject1));
  }
  
  private static int c(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    aay localaay = (aay)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if ((localaay.c() == aeq.i) && (!localaay.d()) && (!localaay.e()))
    {
      if ((localObject instanceof abn)) {
        return aak.b(((aay)paramEntry.getKey()).a(), (abn)localObject);
      }
      return aak.b(((aay)paramEntry.getKey()).a(), (acl)localObject);
    }
    return b(localaay, localObject);
  }
  
  public final void a(aaw<FieldDescriptorType> paramaaw)
  {
    for (int i = 0; i < paramaaw.a.c(); i++) {
      b(paramaaw.a.b(i));
    }
    Iterator localIterator = paramaaw.a.d().iterator();
    while (localIterator.hasNext()) {
      b((Map.Entry)localIterator.next());
    }
  }
  
  final boolean b()
  {
    return this.a.isEmpty();
  }
  
  public final void c()
  {
    if (this.b) {
      return;
    }
    this.a.a();
    this.b = true;
  }
  
  public final boolean d()
  {
    return this.b;
  }
  
  public final Iterator<Map.Entry<FieldDescriptorType, Object>> e()
  {
    if (this.c) {
      return new abr(this.a.entrySet().iterator());
    }
    return this.a.entrySet().iterator();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof aaw)) {
      return false;
    }
    aaw localaaw = (aaw)paramObject;
    return this.a.equals(localaaw.a);
  }
  
  final Iterator<Map.Entry<FieldDescriptorType, Object>> f()
  {
    if (this.c) {
      return new abr(this.a.e().iterator());
    }
    return this.a.e().iterator();
  }
  
  public final boolean g()
  {
    for (int i = 0; i < this.a.c(); i++) {
      if (!a(this.a.b(i))) {
        return false;
      }
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext()) {
      if (!a((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final int h()
  {
    int i = 0;
    int j = 0;
    while (i < this.a.c())
    {
      Map.Entry localEntry2 = this.a.b(i);
      j += b((aay)localEntry2.getKey(), localEntry2.getValue());
      i++;
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator.next();
      j += b((aay)localEntry1.getKey(), localEntry1.getValue());
    }
    return j;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final int i()
  {
    int i = 0;
    int j = 0;
    while (i < this.a.c())
    {
      j += c(this.a.b(i));
      i++;
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext()) {
      j += c((Map.Entry)localIterator.next());
    }
    return j;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aaw
 * JD-Core Version:    0.7.0.1
 */