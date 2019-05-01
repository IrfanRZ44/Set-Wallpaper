package android.arch.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b
  extends c
{
  private final Object a = new Object();
  private ExecutorService b = Executors.newFixedThreadPool(2);
  private volatile Handler c;
  
  public void a(Runnable paramRunnable)
  {
    this.b.execute(paramRunnable);
  }
  
  public void b(Runnable paramRunnable)
  {
    if (this.c == null) {}
    synchronized (this.a)
    {
      if (this.c == null) {
        this.c = new Handler(Looper.getMainLooper());
      }
      this.c.post(paramRunnable);
      return;
    }
  }
  
  public boolean b()
  {
    return Looper.getMainLooper().getThread() == Thread.currentThread();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.a.a.b
 * JD-Core Version:    0.7.0.1
 */