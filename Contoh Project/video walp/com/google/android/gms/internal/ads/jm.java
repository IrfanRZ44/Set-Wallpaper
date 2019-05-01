package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class jm
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);
  
  jm(String paramString) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    String str = this.b;
    int i = this.a.getAndIncrement();
    return new Thread(paramRunnable, 23 + String.valueOf(str).length() + "AdWorker(" + str + ") #" + i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jm
 * JD-Core Version:    0.7.0.1
 */