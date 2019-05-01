package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class aho
  extends Thread
{
  private static final boolean a = eb.a;
  private final BlockingQueue<avs<?>> b;
  private final BlockingQueue<avs<?>> c;
  private final zn d;
  private final b e;
  private volatile boolean f = false;
  private final ajq g;
  
  public aho(BlockingQueue<avs<?>> paramBlockingQueue1, BlockingQueue<avs<?>> paramBlockingQueue2, zn paramzn, b paramb)
  {
    this.b = paramBlockingQueue1;
    this.c = paramBlockingQueue2;
    this.d = paramzn;
    this.e = paramb;
    this.g = new ajq(this);
  }
  
  private final void b()
  {
    avs localavs = (avs)this.b.take();
    localavs.b("cache-queue-take");
    localavs.g();
    agn localagn = this.d.a(localavs.e());
    if (localagn == null)
    {
      localavs.b("cache-miss");
      if (!ajq.a(this.g, localavs)) {
        this.c.put(localavs);
      }
    }
    do
    {
      return;
      if (!localagn.a()) {
        break;
      }
      localavs.b("cache-hit-expired");
      localavs.a(localagn);
    } while (ajq.a(this.g, localavs));
    this.c.put(localavs);
    return;
    localavs.b("cache-hit");
    bbw localbbw = localavs.a(new atr(localagn.a, localagn.g));
    localavs.b("cache-hit-parsed");
    if (localagn.f < System.currentTimeMillis()) {}
    for (int i = 1; i != 0; i = 0)
    {
      localavs.b("cache-hit-refresh-needed");
      localavs.a(localagn);
      localbbw.d = true;
      if (ajq.a(this.g, localavs)) {
        break;
      }
      this.e.a(localavs, localbbw, new aip(this, localavs));
      return;
    }
    this.e.a(localavs, localbbw);
  }
  
  public final void a()
  {
    this.f = true;
    interrupt();
  }
  
  public final void run()
  {
    if (a) {
      eb.a("start new dispatcher", new Object[0]);
    }
    Process.setThreadPriority(10);
    this.d.a();
    try
    {
      do
      {
        for (;;)
        {
          b();
        }
      } while (!this.f);
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aho
 * JD-Core Version:    0.7.0.1
 */