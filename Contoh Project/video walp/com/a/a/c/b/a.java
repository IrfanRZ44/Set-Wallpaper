package com.a.a.c.b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.a.a.i.i;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class a
{
  final Map<com.a.a.c.h, b> a = new HashMap();
  private final boolean b;
  private final Handler c = new Handler(Looper.getMainLooper(), new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      if (paramAnonymousMessage.what == 1)
      {
        a.this.a((a.b)paramAnonymousMessage.obj);
        return true;
      }
      return false;
    }
  });
  private o.a d;
  private ReferenceQueue<o<?>> e;
  private Thread f;
  private volatile boolean g;
  private volatile a h;
  
  a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  private ReferenceQueue<o<?>> b()
  {
    if (this.e == null)
    {
      this.e = new ReferenceQueue();
      this.f = new Thread(new Runnable()
      {
        public void run()
        {
          Process.setThreadPriority(10);
          a.this.a();
        }
      }, "glide-active-resources");
      this.f.start();
    }
    return this.e;
  }
  
  void a()
  {
    while (!this.g) {
      try
      {
        b localb = (b)this.e.remove();
        this.c.obtainMessage(1, localb).sendToTarget();
        a locala = this.h;
        if (locala != null) {
          locala.a();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
    }
  }
  
  void a(b paramb)
  {
    i.a();
    this.a.remove(paramb.a);
    if ((!paramb.b) || (paramb.c == null)) {
      return;
    }
    o localo = new o(paramb.c, true, false);
    localo.a(paramb.a, this.d);
    this.d.a(paramb.a, localo);
  }
  
  void a(o.a parama)
  {
    this.d = parama;
  }
  
  void a(com.a.a.c.h paramh)
  {
    b localb = (b)this.a.remove(paramh);
    if (localb != null) {
      localb.a();
    }
  }
  
  void a(com.a.a.c.h paramh, o<?> paramo)
  {
    b localb1 = new b(paramh, paramo, b(), this.b);
    b localb2 = (b)this.a.put(paramh, localb1);
    if (localb2 != null) {
      localb2.a();
    }
  }
  
  o<?> b(com.a.a.c.h paramh)
  {
    b localb = (b)this.a.get(paramh);
    Object localObject;
    if (localb == null) {
      localObject = null;
    }
    do
    {
      return localObject;
      localObject = (o)localb.get();
    } while (localObject != null);
    a(localb);
    return localObject;
  }
  
  static abstract interface a
  {
    public abstract void a();
  }
  
  static final class b
    extends WeakReference<o<?>>
  {
    final com.a.a.c.h a;
    final boolean b;
    u<?> c;
    
    b(com.a.a.c.h paramh, o<?> paramo, ReferenceQueue<? super o<?>> paramReferenceQueue, boolean paramBoolean)
    {
      super(paramReferenceQueue);
      this.a = ((com.a.a.c.h)com.a.a.i.h.a(paramh));
      if ((paramo.b()) && (paramBoolean)) {}
      for (u localu = (u)com.a.a.i.h.a(paramo.a());; localu = null)
      {
        this.c = localu;
        this.b = paramo.b();
        return;
      }
    }
    
    void a()
    {
      this.c = null;
      clear();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a
 * JD-Core Version:    0.7.0.1
 */