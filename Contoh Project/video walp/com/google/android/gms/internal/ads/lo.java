package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class lo
{
  private long a;
  @GuardedBy("mLock")
  private long b = -9223372036854775808L;
  private Object c = new Object();
  
  public lo(long paramLong)
  {
    this.a = paramLong;
  }
  
  public final boolean a()
  {
    synchronized (this.c)
    {
      long l = zzbv.zzer().b();
      if (this.b + this.a > l) {
        return false;
      }
      this.b = l;
      return true;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.lo
 * JD-Core Version:    0.7.0.1
 */