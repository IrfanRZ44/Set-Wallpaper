package com.a.a.i;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

public final class d
{
  private static final double a;
  
  static
  {
    double d = 1.0D;
    if (Build.VERSION.SDK_INT >= 17) {
      d /= Math.pow(10.0D, 6.0D);
    }
    a = d;
  }
  
  public static double a(long paramLong)
  {
    return (a() - paramLong) * a;
  }
  
  @TargetApi(17)
  public static long a()
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return SystemClock.elapsedRealtimeNanos();
    }
    return SystemClock.uptimeMillis();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.d
 * JD-Core Version:    0.7.0.1
 */