package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ic
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);
  
  ic(hz paramhz) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    int i = this.a.getAndIncrement();
    return new Thread(paramRunnable, 42 + "AdWorker(SCION_TASK_EXECUTOR) #" + i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ic
 * JD-Core Version:    0.7.0.1
 */