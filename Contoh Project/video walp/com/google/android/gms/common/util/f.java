package com.google.android.gms.common.util;

import android.os.SystemClock;

public class f
  implements c
{
  private static final f a = new f();
  
  public static c d()
  {
    return a;
  }
  
  public long a()
  {
    return System.currentTimeMillis();
  }
  
  public long b()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public long c()
  {
    return System.nanoTime();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.f
 * JD-Core Version:    0.7.0.1
 */