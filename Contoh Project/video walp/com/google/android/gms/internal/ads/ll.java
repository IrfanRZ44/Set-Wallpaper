package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.n;

@cm
public final class ll
{
  private HandlerThread a = null;
  private Handler b = null;
  private int c = 0;
  private final Object d = new Object();
  
  public final Looper a()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if (this.c == 0)
        {
          if (this.a == null)
          {
            je.a("Starting the looper thread.");
            this.a = new HandlerThread("LooperProvider");
            this.a.start();
            this.b = new Handler(this.a.getLooper());
            je.a("Looper thread started.");
            this.c = (1 + this.c);
            Looper localLooper = this.a.getLooper();
            return localLooper;
          }
          je.a("Resuming the looper thread");
          this.d.notifyAll();
        }
      }
      n.a(this.a, "Invalid state: mHandlerThread should already been initialized.");
    }
  }
  
  public final Handler b()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ll
 * JD-Core Version:    0.7.0.1
 */