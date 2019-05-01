package com.google.android.gms.internal.ads;

public class abs
{
  private static final aar a = ;
  private zw b;
  private volatile acl c;
  private volatile zw d;
  
  /* Error */
  private final acl b(acl paramacl)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	com/google/android/gms/internal/ads/abs:c	Lcom/google/android/gms/internal/ads/acl;
    //   4: ifnonnull +14 -> 18
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 28	com/google/android/gms/internal/ads/abs:c	Lcom/google/android/gms/internal/ads/acl;
    //   13: ifnull +10 -> 23
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_0
    //   19: getfield 28	com/google/android/gms/internal/ads/abs:c	Lcom/google/android/gms/internal/ads/acl;
    //   22: areturn
    //   23: aload_0
    //   24: aload_1
    //   25: putfield 28	com/google/android/gms/internal/ads/abs:c	Lcom/google/android/gms/internal/ads/acl;
    //   28: aload_0
    //   29: getstatic 32	com/google/android/gms/internal/ads/zw:a	Lcom/google/android/gms/internal/ads/zw;
    //   32: putfield 34	com/google/android/gms/internal/ads/abs:d	Lcom/google/android/gms/internal/ads/zw;
    //   35: aload_0
    //   36: monitorexit
    //   37: goto -19 -> 18
    //   40: astore_2
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_2
    //   44: athrow
    //   45: astore_3
    //   46: aload_0
    //   47: aload_1
    //   48: putfield 28	com/google/android/gms/internal/ads/abs:c	Lcom/google/android/gms/internal/ads/acl;
    //   51: aload_0
    //   52: getstatic 32	com/google/android/gms/internal/ads/zw:a	Lcom/google/android/gms/internal/ads/zw;
    //   55: putfield 34	com/google/android/gms/internal/ads/abs:d	Lcom/google/android/gms/internal/ads/zw;
    //   58: goto -23 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	abs
    //   0	61	1	paramacl	acl
    //   40	4	2	localObject	Object
    //   45	1	3	localabk	abk
    // Exception table:
    //   from	to	target	type
    //   9	18	40	finally
    //   23	35	40	finally
    //   35	37	40	finally
    //   41	43	40	finally
    //   46	58	40	finally
    //   23	35	45	com/google/android/gms/internal/ads/abk
  }
  
  public final acl a(acl paramacl)
  {
    acl localacl = this.c;
    this.b = null;
    this.d = null;
    this.c = paramacl;
    return localacl;
  }
  
  public final int b()
  {
    if (this.d != null) {
      return this.d.a();
    }
    if (this.c != null) {
      return this.c.l();
    }
    return 0;
  }
  
  public final zw c()
  {
    if (this.d != null) {
      return this.d;
    }
    try
    {
      if (this.d != null)
      {
        zw localzw2 = this.d;
        return localzw2;
      }
    }
    finally {}
    if (this.c == null) {}
    for (this.d = zw.a;; this.d = this.c.h())
    {
      zw localzw1 = this.d;
      return localzw1;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof abs)) {
      return false;
    }
    abs localabs = (abs)paramObject;
    acl localacl1 = this.c;
    acl localacl2 = localabs.c;
    if ((localacl1 == null) && (localacl2 == null)) {
      return c().equals(localabs.c());
    }
    if ((localacl1 != null) && (localacl2 != null)) {
      return localacl1.equals(localacl2);
    }
    if (localacl1 != null) {
      return localacl1.equals(localabs.b(localacl1.p()));
    }
    return b(localacl2.p()).equals(localacl2);
  }
  
  public int hashCode()
  {
    return 1;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abs
 * JD-Core Version:    0.7.0.1
 */