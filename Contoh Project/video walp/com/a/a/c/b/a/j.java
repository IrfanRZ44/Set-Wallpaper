package com.a.a.c.b.a;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class j
  implements b
{
  private final h<a, Object> a = new h();
  private final b b = new b();
  private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
  private final Map<Class<?>, a<?>> d = new HashMap();
  private final int e;
  private int f;
  
  public j()
  {
    this.e = 4194304;
  }
  
  public j(int paramInt)
  {
    this.e = paramInt;
  }
  
  private <T> T a(a parama)
  {
    return this.a.a(parama);
  }
  
  private <T> T a(a parama, Class<T> paramClass)
  {
    a locala = b(paramClass);
    Object localObject = a(parama);
    if (localObject != null)
    {
      this.f -= locala.a(localObject) * locala.b();
      c(locala.a(localObject), paramClass);
    }
    if (localObject == null)
    {
      if (Log.isLoggable(locala.a(), 2)) {
        Log.v(locala.a(), "Allocated " + parama.a + " bytes");
      }
      localObject = locala.a(parama.a);
    }
    return localObject;
  }
  
  private NavigableMap<Integer, Integer> a(Class<?> paramClass)
  {
    Object localObject = (NavigableMap)this.c.get(paramClass);
    if (localObject == null)
    {
      localObject = new TreeMap();
      this.c.put(paramClass, localObject);
    }
    return localObject;
  }
  
  private boolean a(int paramInt, Integer paramInteger)
  {
    return (paramInteger != null) && ((b()) || (paramInteger.intValue() <= paramInt * 8));
  }
  
  private <T> a<T> b(Class<T> paramClass)
  {
    Object localObject = (a)this.d.get(paramClass);
    if (localObject == null) {
      if (!paramClass.equals([I.class)) {
        break label49;
      }
    }
    for (localObject = new i();; localObject = new g())
    {
      this.d.put(paramClass, localObject);
      return localObject;
      label49:
      if (!paramClass.equals([B.class)) {
        break;
      }
    }
    throw new IllegalArgumentException("No array pool found for: " + paramClass.getSimpleName());
  }
  
  private <T> a<T> b(T paramT)
  {
    return b(paramT.getClass());
  }
  
  private boolean b()
  {
    return (this.f == 0) || (this.e / this.f >= 2);
  }
  
  private boolean b(int paramInt)
  {
    return paramInt <= this.e / 2;
  }
  
  private void c()
  {
    c(this.e);
  }
  
  private void c(int paramInt)
  {
    while (this.f > paramInt)
    {
      Object localObject = this.a.a();
      com.a.a.i.h.a(localObject);
      a locala = b(localObject);
      this.f -= locala.a(localObject) * locala.b();
      c(locala.a(localObject), localObject.getClass());
      if (Log.isLoggable(locala.a(), 2)) {
        Log.v(locala.a(), "evicted: " + locala.a(localObject));
      }
    }
  }
  
  private void c(int paramInt, Class<?> paramClass)
  {
    NavigableMap localNavigableMap = a(paramClass);
    Integer localInteger = (Integer)localNavigableMap.get(Integer.valueOf(paramInt));
    if (localInteger == null) {
      throw new NullPointerException("Tried to decrement empty size, size: " + paramInt + ", this: " + this);
    }
    if (localInteger.intValue() == 1)
    {
      localNavigableMap.remove(Integer.valueOf(paramInt));
      return;
    }
    localNavigableMap.put(Integer.valueOf(paramInt), Integer.valueOf(-1 + localInteger.intValue()));
  }
  
  /* Error */
  public <T> T a(int paramInt, Class<T> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokespecial 176	com/a/a/c/b/a/j:a	(Ljava/lang/Class;)Ljava/util/NavigableMap;
    //   7: iload_1
    //   8: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   11: invokeinterface 199 2 0
    //   16: checkcast 126	java/lang/Integer
    //   19: astore 4
    //   21: aload_0
    //   22: iload_1
    //   23: aload 4
    //   25: invokespecial 201	com/a/a/c/b/a/j:a	(ILjava/lang/Integer;)Z
    //   28: ifeq +32 -> 60
    //   31: aload_0
    //   32: getfield 33	com/a/a/c/b/a/j:b	Lcom/a/a/c/b/a/j$b;
    //   35: aload 4
    //   37: invokevirtual 129	java/lang/Integer:intValue	()I
    //   40: aload_2
    //   41: invokevirtual 204	com/a/a/c/b/a/j$b:a	(ILjava/lang/Class;)Lcom/a/a/c/b/a/j$a;
    //   44: astore 6
    //   46: aload_0
    //   47: aload 6
    //   49: aload_2
    //   50: invokespecial 206	com/a/a/c/b/a/j:a	(Lcom/a/a/c/b/a/j$a;Ljava/lang/Class;)Ljava/lang/Object;
    //   53: astore 7
    //   55: aload_0
    //   56: monitorexit
    //   57: aload 7
    //   59: areturn
    //   60: aload_0
    //   61: getfield 33	com/a/a/c/b/a/j:b	Lcom/a/a/c/b/a/j$b;
    //   64: iload_1
    //   65: aload_2
    //   66: invokevirtual 204	com/a/a/c/b/a/j$b:a	(ILjava/lang/Class;)Lcom/a/a/c/b/a/j$a;
    //   69: astore 5
    //   71: aload 5
    //   73: astore 6
    //   75: goto -29 -> 46
    //   78: astore_3
    //   79: aload_0
    //   80: monitorexit
    //   81: aload_3
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	j
    //   0	83	1	paramInt	int
    //   0	83	2	paramClass	Class<T>
    //   78	4	3	localObject1	Object
    //   19	17	4	localInteger	Integer
    //   69	3	5	locala	a
    //   44	30	6	localObject2	Object
    //   53	5	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	46	78	finally
    //   46	55	78	finally
    //   60	71	78	finally
  }
  
  public void a()
  {
    try
    {
      c(0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= 40) {}
    for (;;)
    {
      try
      {
        a();
        return;
      }
      finally {}
      if (paramInt >= 20) {
        c(this.e / 2);
      }
    }
  }
  
  public <T> void a(T paramT)
  {
    for (;;)
    {
      try
      {
        Class localClass = paramT.getClass();
        a locala = b(localClass);
        int i = locala.a(paramT);
        int j = i * locala.b();
        boolean bool = b(j);
        if (!bool) {
          return;
        }
        a locala1 = this.b.a(i, localClass);
        this.a.a(locala1, paramT);
        NavigableMap localNavigableMap = a(localClass);
        Integer localInteger1 = (Integer)localNavigableMap.get(Integer.valueOf(locala1.a));
        Integer localInteger2 = Integer.valueOf(locala1.a);
        if (localInteger1 == null)
        {
          m = 1;
          localNavigableMap.put(localInteger2, Integer.valueOf(m));
          this.f = (j + this.f);
          c();
          continue;
        }
        k = localInteger1.intValue();
      }
      finally {}
      int k;
      int m = k + 1;
    }
  }
  
  public <T> T b(int paramInt, Class<T> paramClass)
  {
    try
    {
      Object localObject2 = a(this.b.a(paramInt, paramClass), paramClass);
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }
  
  private static final class a
    implements m
  {
    int a;
    private final j.b b;
    private Class<?> c;
    
    a(j.b paramb)
    {
      this.b = paramb;
    }
    
    public void a()
    {
      this.b.a(this);
    }
    
    void a(int paramInt, Class<?> paramClass)
    {
      this.a = paramInt;
      this.c = paramClass;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (bool1)
      {
        a locala = (a)paramObject;
        int i = this.a;
        int j = locala.a;
        bool2 = false;
        if (i == j)
        {
          Class localClass1 = this.c;
          Class localClass2 = locala.c;
          bool2 = false;
          if (localClass1 == localClass2) {
            bool2 = true;
          }
        }
      }
      return bool2;
    }
    
    public int hashCode()
    {
      int i = 31 * this.a;
      if (this.c != null) {}
      for (int j = this.c.hashCode();; j = 0) {
        return j + i;
      }
    }
    
    public String toString()
    {
      return "Key{size=" + this.a + "array=" + this.c + '}';
    }
  }
  
  private static final class b
    extends d<j.a>
  {
    protected j.a a()
    {
      return new j.a(this);
    }
    
    j.a a(int paramInt, Class<?> paramClass)
    {
      j.a locala = (j.a)c();
      locala.a(paramInt, paramClass);
      return locala;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a.j
 * JD-Core Version:    0.7.0.1
 */