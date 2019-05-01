package org.greenrobot.eventbus;

import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

final class b
  implements Runnable, l
{
  private final k a;
  private final c b;
  private volatile boolean c;
  
  b(c paramc)
  {
    this.b = paramc;
    this.a = new k();
  }
  
  public void a(q paramq, Object paramObject)
  {
    j localj = j.a(paramq, paramObject);
    try
    {
      this.a.a(localj);
      if (!this.c)
      {
        this.c = true;
        this.b.b().execute(this);
      }
      return;
    }
    finally {}
  }
  
  public void run()
  {
    try
    {
      localj = this.a.a(1000);
      if (localj != null) {}
    }
    catch (InterruptedException localInterruptedException)
    {
      j localj;
      localInterruptedException = localInterruptedException;
      this.b.c().a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", localInterruptedException);
      return;
    }
    finally
    {
      this.c = false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.b
 * JD-Core Version:    0.7.0.1
 */