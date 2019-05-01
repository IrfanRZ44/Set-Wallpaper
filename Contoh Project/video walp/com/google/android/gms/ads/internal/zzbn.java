package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class zzbn
{
  private final Handler a;
  
  public zzbn(Handler paramHandler)
  {
    this.a = paramHandler;
  }
  
  public final boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    return this.a.postDelayed(paramRunnable, paramLong);
  }
  
  public final void removeCallbacks(Runnable paramRunnable)
  {
    this.a.removeCallbacks(paramRunnable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzbn
 * JD-Core Version:    0.7.0.1
 */