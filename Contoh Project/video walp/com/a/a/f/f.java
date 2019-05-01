package com.a.a.f;

import com.a.a.c.l;
import java.util.ArrayList;
import java.util.List;

public class f
{
  private final List<a<?>> a = new ArrayList();
  
  /* Error */
  public <Z> l<Z> a(Class<Z> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	com/a/a/f/f:a	Ljava/util/List;
    //   6: invokeinterface 23 1 0
    //   11: istore_3
    //   12: iconst_0
    //   13: istore 4
    //   15: iload 4
    //   17: iload_3
    //   18: if_icmpge +46 -> 64
    //   21: aload_0
    //   22: getfield 16	com/a/a/f/f:a	Ljava/util/List;
    //   25: iload 4
    //   27: invokeinterface 27 2 0
    //   32: checkcast 29	com/a/a/f/f$a
    //   35: astore 5
    //   37: aload 5
    //   39: aload_1
    //   40: invokevirtual 32	com/a/a/f/f$a:a	(Ljava/lang/Class;)Z
    //   43: ifeq +15 -> 58
    //   46: aload 5
    //   48: getfield 35	com/a/a/f/f$a:a	Lcom/a/a/c/l;
    //   51: astore 6
    //   53: aload_0
    //   54: monitorexit
    //   55: aload 6
    //   57: areturn
    //   58: iinc 4 1
    //   61: goto -46 -> 15
    //   64: aconst_null
    //   65: astore 6
    //   67: goto -14 -> 53
    //   70: astore_2
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	f
    //   0	75	1	paramClass	Class<Z>
    //   70	4	2	localObject	Object
    //   11	8	3	i	int
    //   13	46	4	j	int
    //   35	12	5	locala	a
    //   51	15	6	locall	l
    // Exception table:
    //   from	to	target	type
    //   2	12	70	finally
    //   21	53	70	finally
  }
  
  public <Z> void a(Class<Z> paramClass, l<Z> paraml)
  {
    try
    {
      this.a.add(new a(paramClass, paraml));
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
    final l<T> a;
    private final Class<T> b;
    
    a(Class<T> paramClass, l<T> paraml)
    {
      this.b = paramClass;
      this.a = paraml;
    }
    
    boolean a(Class<?> paramClass)
    {
      return this.b.isAssignableFrom(paramClass);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.f.f
 * JD-Core Version:    0.7.0.1
 */