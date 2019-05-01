package com.a.a.f;

import com.a.a.c.d;
import java.util.ArrayList;
import java.util.List;

public class a
{
  private final List<a<?>> a = new ArrayList();
  
  /* Error */
  public <T> d<T> a(Class<T> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	com/a/a/f/a:a	Ljava/util/List;
    //   6: invokeinterface 23 1 0
    //   11: astore_3
    //   12: aload_3
    //   13: invokeinterface 29 1 0
    //   18: ifeq +35 -> 53
    //   21: aload_3
    //   22: invokeinterface 33 1 0
    //   27: checkcast 35	com/a/a/f/a$a
    //   30: astore 5
    //   32: aload 5
    //   34: aload_1
    //   35: invokevirtual 38	com/a/a/f/a$a:a	(Ljava/lang/Class;)Z
    //   38: ifeq -26 -> 12
    //   41: aload 5
    //   43: getfield 41	com/a/a/f/a$a:a	Lcom/a/a/c/d;
    //   46: astore 4
    //   48: aload_0
    //   49: monitorexit
    //   50: aload 4
    //   52: areturn
    //   53: aconst_null
    //   54: astore 4
    //   56: goto -8 -> 48
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	a
    //   0	64	1	paramClass	Class<T>
    //   59	4	2	localObject	Object
    //   11	11	3	localIterator	java.util.Iterator
    //   46	9	4	locald	d
    //   30	12	5	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	12	59	finally
    //   12	48	59	finally
  }
  
  public <T> void a(Class<T> paramClass, d<T> paramd)
  {
    try
    {
      this.a.add(new a(paramClass, paramd));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static final class a<T>
  {
    final d<T> a;
    private final Class<T> b;
    
    a(Class<T> paramClass, d<T> paramd)
    {
      this.b = paramClass;
      this.a = paramd;
    }
    
    boolean a(Class<?> paramClass)
    {
      return this.b.isAssignableFrom(paramClass);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.f.a
 * JD-Core Version:    0.7.0.1
 */