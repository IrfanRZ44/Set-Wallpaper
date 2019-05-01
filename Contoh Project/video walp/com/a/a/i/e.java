package com.a.a.i;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class e<T, Y>
{
  private final Map<T, Y> a = new LinkedHashMap(100, 0.75F, true);
  private final long b;
  private long c;
  private long d;
  
  public e(long paramLong)
  {
    this.b = paramLong;
    this.c = paramLong;
  }
  
  private void c()
  {
    a(this.c);
  }
  
  protected int a(Y paramY)
  {
    return 1;
  }
  
  public void a()
  {
    a(0L);
  }
  
  protected void a(long paramLong)
  {
    try
    {
      if (this.d > paramLong)
      {
        Iterator localIterator = this.a.entrySet().iterator();
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object localObject2 = localEntry.getValue();
        this.d -= a(localObject2);
        Object localObject3 = localEntry.getKey();
        localIterator.remove();
        a(localObject3, localObject2);
      }
      return;
    }
    finally {}
  }
  
  protected void a(T paramT, Y paramY) {}
  
  public long b()
  {
    try
    {
      long l = this.c;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public Y b(T paramT)
  {
    try
    {
      Object localObject2 = this.a.get(paramT);
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }
  
  /* Error */
  public Y b(T paramT, Y paramY)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: invokevirtual 59	com/a/a/i/e:a	(Ljava/lang/Object;)I
    //   7: istore 4
    //   9: iload 4
    //   11: i2l
    //   12: aload_0
    //   13: getfield 29	com/a/a/i/e:c	J
    //   16: lcmp
    //   17: iflt +17 -> 34
    //   20: aload_0
    //   21: aload_1
    //   22: aload_2
    //   23: invokevirtual 68	com/a/a/i/e:a	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   26: aconst_null
    //   27: astore 5
    //   29: aload_0
    //   30: monitorexit
    //   31: aload 5
    //   33: areturn
    //   34: aload_2
    //   35: ifnull +15 -> 50
    //   38: aload_0
    //   39: aload_0
    //   40: getfield 34	com/a/a/i/e:d	J
    //   43: iload 4
    //   45: i2l
    //   46: ladd
    //   47: putfield 34	com/a/a/i/e:d	J
    //   50: aload_0
    //   51: getfield 25	com/a/a/i/e:a	Ljava/util/Map;
    //   54: aload_1
    //   55: aload_2
    //   56: invokeinterface 77 3 0
    //   61: astore 5
    //   63: aload 5
    //   65: ifnull +35 -> 100
    //   68: aload_0
    //   69: aload_0
    //   70: getfield 34	com/a/a/i/e:d	J
    //   73: aload_0
    //   74: aload 5
    //   76: invokevirtual 59	com/a/a/i/e:a	(Ljava/lang/Object;)I
    //   79: i2l
    //   80: lsub
    //   81: putfield 34	com/a/a/i/e:d	J
    //   84: aload 5
    //   86: aload_2
    //   87: invokevirtual 81	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   90: ifne +10 -> 100
    //   93: aload_0
    //   94: aload_1
    //   95: aload 5
    //   97: invokevirtual 68	com/a/a/i/e:a	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   100: aload_0
    //   101: invokespecial 83	com/a/a/i/e:c	()V
    //   104: goto -75 -> 29
    //   107: astore_3
    //   108: aload_0
    //   109: monitorexit
    //   110: aload_3
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	e
    //   0	112	1	paramT	T
    //   0	112	2	paramY	Y
    //   107	4	3	localObject1	Object
    //   7	37	4	i	int
    //   27	69	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	107	finally
    //   38	50	107	finally
    //   50	63	107	finally
    //   68	100	107	finally
    //   100	104	107	finally
  }
  
  public Y c(T paramT)
  {
    try
    {
      Object localObject2 = this.a.remove(paramT);
      if (localObject2 != null) {
        this.d -= a(localObject2);
      }
      return localObject2;
    }
    finally {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.e
 * JD-Core Version:    0.7.0.1
 */