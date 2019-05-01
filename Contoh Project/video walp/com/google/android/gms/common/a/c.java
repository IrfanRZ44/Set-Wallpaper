package com.google.android.gms.common.a;

import android.content.Context;

public class c
{
  private static c b = new c();
  private b a = null;
  
  public static b b(Context paramContext)
  {
    return b.a(paramContext);
  }
  
  /* Error */
  public b a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	com/google/android/gms/common/a/c:a	Lcom/google/android/gms/common/a/b;
    //   6: ifnonnull +22 -> 28
    //   9: aload_1
    //   10: invokevirtual 27	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   13: ifnonnull +24 -> 37
    //   16: aload_0
    //   17: new 29	com/google/android/gms/common/a/b
    //   20: dup
    //   21: aload_1
    //   22: invokespecial 32	com/google/android/gms/common/a/b:<init>	(Landroid/content/Context;)V
    //   25: putfield 18	com/google/android/gms/common/a/c:a	Lcom/google/android/gms/common/a/b;
    //   28: aload_0
    //   29: getfield 18	com/google/android/gms/common/a/c:a	Lcom/google/android/gms/common/a/b;
    //   32: astore_3
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_3
    //   36: areturn
    //   37: aload_1
    //   38: invokevirtual 27	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   41: astore 4
    //   43: aload 4
    //   45: astore_1
    //   46: goto -30 -> 16
    //   49: astore_2
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_2
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	c
    //   0	54	1	paramContext	Context
    //   49	4	2	localObject	Object
    //   32	4	3	localb	b
    //   41	3	4	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	16	49	finally
    //   16	28	49	finally
    //   28	33	49	finally
    //   37	43	49	finally
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a.c
 * JD-Core Version:    0.7.0.1
 */