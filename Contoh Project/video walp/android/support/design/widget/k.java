package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class k
{
  private static k a;
  private final Object b = new Object();
  private final Handler c = new Handler(Looper.getMainLooper(), new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
        return false;
      }
      k.this.a((k.b)paramAnonymousMessage.obj);
      return true;
    }
  });
  private b d;
  private b e;
  
  static k a()
  {
    if (a == null) {
      a = new k();
    }
    return a;
  }
  
  private boolean a(b paramb, int paramInt)
  {
    a locala = (a)paramb.a.get();
    if (locala != null)
    {
      this.c.removeCallbacksAndMessages(paramb);
      locala.a(paramInt);
      return true;
    }
    return false;
  }
  
  private void b()
  {
    if (this.e != null)
    {
      this.d = this.e;
      this.e = null;
      a locala = (a)this.d.a.get();
      if (locala != null) {
        locala.a();
      }
    }
    else
    {
      return;
    }
    this.d = null;
  }
  
  private void b(b paramb)
  {
    if (paramb.b == -2) {
      return;
    }
    int i = 2750;
    if (paramb.b > 0) {
      i = paramb.b;
    }
    for (;;)
    {
      this.c.removeCallbacksAndMessages(paramb);
      this.c.sendMessageDelayed(Message.obtain(this.c, 0, paramb), i);
      return;
      if (paramb.b == -1) {
        i = 1500;
      }
    }
  }
  
  private boolean f(a parama)
  {
    return (this.d != null) && (this.d.a(parama));
  }
  
  private boolean g(a parama)
  {
    return (this.e != null) && (this.e.a(parama));
  }
  
  public void a(a parama)
  {
    synchronized (this.b)
    {
      if (f(parama))
      {
        this.d = null;
        if (this.e != null) {
          b();
        }
      }
      return;
    }
  }
  
  public void a(a parama, int paramInt)
  {
    synchronized (this.b)
    {
      if (f(parama)) {
        a(this.d, paramInt);
      }
      while (!g(parama)) {
        return;
      }
      a(this.e, paramInt);
    }
  }
  
  void a(b paramb)
  {
    synchronized (this.b)
    {
      if ((this.d == paramb) || (this.e == paramb)) {
        a(paramb, 2);
      }
      return;
    }
  }
  
  public void b(a parama)
  {
    synchronized (this.b)
    {
      if (f(parama)) {
        b(this.d);
      }
      return;
    }
  }
  
  public void c(a parama)
  {
    synchronized (this.b)
    {
      if ((f(parama)) && (!this.d.c))
      {
        this.d.c = true;
        this.c.removeCallbacksAndMessages(this.d);
      }
      return;
    }
  }
  
  public void d(a parama)
  {
    synchronized (this.b)
    {
      if ((f(parama)) && (this.d.c))
      {
        this.d.c = false;
        b(this.d);
      }
      return;
    }
  }
  
  public boolean e(a parama)
  {
    for (;;)
    {
      synchronized (this.b)
      {
        if (!f(parama))
        {
          if (!g(parama)) {
            break label42;
          }
          break label36;
          return bool;
        }
      }
      label36:
      boolean bool = true;
      continue;
      label42:
      bool = false;
    }
  }
  
  static abstract interface a
  {
    public abstract void a();
    
    public abstract void a(int paramInt);
  }
  
  private static class b
  {
    final WeakReference<k.a> a;
    int b;
    boolean c;
    
    boolean a(k.a parama)
    {
      return (parama != null) && (this.a.get() == parama);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.k
 * JD-Core Version:    0.7.0.1
 */