package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class ahp
  implements ThreadFactory
{
  private final ThreadFactory a = Executors.defaultThreadFactory();
  
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = this.a.newThread(paramRunnable);
    localThread.setName(String.valueOf(localThread.getName()).concat(":"));
    return localThread;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ahp
 * JD-Core Version:    0.7.0.1
 */