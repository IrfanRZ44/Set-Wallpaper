package android.support.v4.d;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c
{
  private final Object a = new Object();
  private HandlerThread b;
  private Handler c;
  private int d;
  private Handler.Callback e = new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
        return true;
      case 1: 
        c.a(c.this, (Runnable)paramAnonymousMessage.obj);
        return true;
      }
      c.a(c.this);
      return true;
    }
  };
  private final int f;
  private final int g;
  private final String h;
  
  public c(String paramString, int paramInt1, int paramInt2)
  {
    this.h = paramString;
    this.g = paramInt1;
    this.f = paramInt2;
    this.d = 0;
  }
  
  private void a()
  {
    synchronized (this.a)
    {
      if (this.c.hasMessages(1)) {
        return;
      }
      this.b.quit();
      this.b = null;
      this.c = null;
      return;
    }
  }
  
  private void a(Runnable paramRunnable)
  {
    synchronized (this.a)
    {
      if (this.b == null)
      {
        this.b = new HandlerThread(this.h, this.g);
        this.b.start();
        this.c = new Handler(this.b.getLooper(), this.e);
        this.d = (1 + this.d);
      }
      this.c.removeMessages(0);
      this.c.sendMessage(this.c.obtainMessage(1, paramRunnable));
      return;
    }
  }
  
  private void b(Runnable paramRunnable)
  {
    paramRunnable.run();
    synchronized (this.a)
    {
      this.c.removeMessages(0);
      this.c.sendMessageDelayed(this.c.obtainMessage(0), this.f);
      return;
    }
  }
  
  public <T> T a(final Callable<T> paramCallable, int paramInt)
  {
    localReentrantLock = new ReentrantLock();
    final Condition localCondition = localReentrantLock.newCondition();
    final AtomicReference localAtomicReference = new AtomicReference();
    final AtomicBoolean localAtomicBoolean = new AtomicBoolean(true);
    a(new Runnable()
    {
      public void run()
      {
        try
        {
          localAtomicReference.set(paramCallable.call());
          label16:
          localReentrantLock.lock();
          try
          {
            localAtomicBoolean.set(false);
            localCondition.signal();
            return;
          }
          finally
          {
            localReentrantLock.unlock();
          }
        }
        catch (Exception localException)
        {
          break label16;
        }
      }
    });
    localReentrantLock.lock();
    label108:
    do
    {
      try
      {
        if (!localAtomicBoolean.get())
        {
          Object localObject3 = localAtomicReference.get();
          return localObject3;
        }
        long l1 = TimeUnit.MILLISECONDS.toNanos(paramInt);
        l2 = l1;
      }
      finally
      {
        long l2;
        long l3;
        Object localObject2;
        localReentrantLock.unlock();
      }
      try
      {
        l3 = localCondition.awaitNanos(l2);
        l2 = l3;
      }
      catch (InterruptedException localInterruptedException)
      {
        break label108;
      }
      if (!localAtomicBoolean.get())
      {
        localObject2 = localAtomicReference.get();
        localReentrantLock.unlock();
        return localObject2;
      }
    } while (l2 > 0L);
    throw new InterruptedException("timeout");
  }
  
  public <T> void a(final Callable<T> paramCallable, final a<T> parama)
  {
    a(new Runnable()
    {
      public void run()
      {
        try
        {
          Object localObject2 = paramCallable.call();
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            final Object localObject1 = null;
          }
        }
        this.b.post(new Runnable()
        {
          public void run()
          {
            c.2.this.c.a(localObject1);
          }
        });
      }
    });
  }
  
  public static abstract interface a<T>
  {
    public abstract void a(T paramT);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.c
 * JD-Core Version:    0.7.0.1
 */