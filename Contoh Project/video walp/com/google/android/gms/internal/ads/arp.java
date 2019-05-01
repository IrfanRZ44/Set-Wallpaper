package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class arp
  extends Thread
{
  private final BlockingQueue<avs<?>> a;
  private final aqr b;
  private final zn c;
  private final b d;
  private volatile boolean e = false;
  
  public arp(BlockingQueue<avs<?>> paramBlockingQueue, aqr paramaqr, zn paramzn, b paramb)
  {
    this.a = paramBlockingQueue;
    this.b = paramaqr;
    this.c = paramzn;
    this.d = paramb;
  }
  
  private final void b()
  {
    long l = SystemClock.elapsedRealtime();
    avs localavs = (avs)this.a.take();
    try
    {
      localavs.b("network-queue-take");
      localavs.g();
      TrafficStats.setThreadStatsTag(localavs.d());
      atr localatr = this.b.a(localavs);
      localavs.b("network-http-complete");
      if ((localatr.e) && (localavs.l()))
      {
        localavs.c("not-modified");
        localavs.m();
        return;
      }
      bbw localbbw = localavs.a(localatr);
      localavs.b("network-parse-complete");
      if ((localavs.h()) && (localbbw.b != null))
      {
        this.c.a(localavs.e(), localbbw.b);
        localavs.b("network-cache-written");
      }
      localavs.k();
      this.d.a(localavs, localbbw);
      localavs.a(localbbw);
      return;
    }
    catch (df localdf2)
    {
      localdf2.a(SystemClock.elapsedRealtime() - l);
      this.d.a(localavs, localdf2);
      localavs.m();
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.toString();
      eb.a(localException, "Unhandled exception %s", arrayOfObject);
      df localdf1 = new df(localException);
      localdf1.a(SystemClock.elapsedRealtime() - l);
      this.d.a(localavs, localdf1);
      localavs.m();
    }
  }
  
  public final void a()
  {
    this.e = true;
    interrupt();
  }
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      do
      {
        for (;;)
        {
          b();
        }
      } while (!this.e);
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.arp
 * JD-Core Version:    0.7.0.1
 */