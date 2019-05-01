package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

final class aip
  implements Runnable
{
  aip(aho paramaho, avs paramavs) {}
  
  public final void run()
  {
    try
    {
      aho.a(this.b).put(this.a);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aip
 * JD-Core Version:    0.7.0.1
 */