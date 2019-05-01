package com.a.a.c.d.e;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.a.a.b.a;
import com.a.a.c;
import com.a.a.c.m;
import com.a.a.g.a.f;
import com.a.a.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class g
{
  final j a;
  private final a b;
  private final Handler c;
  private final List<b> d = new ArrayList();
  private final com.a.a.c.b.a.e e;
  private boolean f;
  private boolean g;
  private boolean h;
  private com.a.a.i<Bitmap> i;
  private a j;
  private boolean k;
  private a l;
  private Bitmap m;
  private m<Bitmap> n;
  private a o;
  private d p;
  
  g(com.a.a.c.b.a.e parame, j paramj, a parama, Handler paramHandler, com.a.a.i<Bitmap> parami, m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this.a = paramj;
    if (paramHandler == null) {
      paramHandler = new Handler(Looper.getMainLooper(), new c());
    }
    this.e = parame;
    this.c = paramHandler;
    this.i = parami;
    this.b = parama;
    a(paramm, paramBitmap);
  }
  
  g(c paramc, a parama, int paramInt1, int paramInt2, m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this(paramc.a(), c.b(paramc.c()), parama, null, a(c.b(paramc.c()), paramInt1, paramInt2), paramm, paramBitmap);
  }
  
  private static com.a.a.i<Bitmap> a(j paramj, int paramInt1, int paramInt2)
  {
    return paramj.f().a(com.a.a.g.e.a(com.a.a.c.b.i.b).a(true).b(true).a(paramInt1, paramInt2));
  }
  
  private int j()
  {
    return com.a.a.i.i.a(i().getWidth(), i().getHeight(), i().getConfig());
  }
  
  private void k()
  {
    if (this.f) {
      return;
    }
    this.f = true;
    this.k = false;
    m();
  }
  
  private void l()
  {
    this.f = false;
  }
  
  private void m()
  {
    if ((!this.f) || (this.g)) {
      return;
    }
    if (this.h) {
      if (this.o != null) {
        break label78;
      }
    }
    label78:
    for (boolean bool = true;; bool = false)
    {
      com.a.a.i.h.a(bool, "Pending target must be null when starting from the first frame");
      this.b.f();
      this.h = false;
      if (this.o == null) {
        break;
      }
      a locala = this.o;
      this.o = null;
      a(locala);
      return;
    }
    this.g = true;
    int i1 = this.b.c();
    long l1 = SystemClock.uptimeMillis() + i1;
    this.b.b();
    this.l = new a(this.c, this.b.e(), l1);
    this.i.a(com.a.a.g.e.a(o())).a(this.b).a(this.l);
  }
  
  private void n()
  {
    if (this.m != null)
    {
      this.e.a(this.m);
      this.m = null;
    }
  }
  
  private static com.a.a.c.h o()
  {
    return new com.a.a.h.b(Double.valueOf(Math.random()));
  }
  
  Bitmap a()
  {
    return this.m;
  }
  
  void a(a parama)
  {
    if (this.p != null) {
      this.p.a();
    }
    this.g = false;
    if (this.k)
    {
      this.c.obtainMessage(2, parama).sendToTarget();
      return;
    }
    if (!this.f)
    {
      this.o = parama;
      return;
    }
    if (parama.a() != null)
    {
      n();
      a locala = this.j;
      this.j = parama;
      for (int i1 = -1 + this.d.size(); i1 >= 0; i1--) {
        ((b)this.d.get(i1)).f();
      }
      if (locala != null) {
        this.c.obtainMessage(2, locala).sendToTarget();
      }
    }
    m();
  }
  
  void a(b paramb)
  {
    if (this.k) {
      throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }
    if (this.d.contains(paramb)) {
      throw new IllegalStateException("Cannot subscribe twice in a row");
    }
    boolean bool = this.d.isEmpty();
    this.d.add(paramb);
    if (bool) {
      k();
    }
  }
  
  void a(m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this.n = ((m)com.a.a.i.h.a(paramm));
    this.m = ((Bitmap)com.a.a.i.h.a(paramBitmap));
    this.i = this.i.a(new com.a.a.g.e().a(paramm));
  }
  
  int b()
  {
    return i().getWidth();
  }
  
  void b(b paramb)
  {
    this.d.remove(paramb);
    if (this.d.isEmpty()) {
      l();
    }
  }
  
  int c()
  {
    return i().getHeight();
  }
  
  int d()
  {
    return this.b.g() + j();
  }
  
  int e()
  {
    if (this.j != null) {
      return this.j.a;
    }
    return -1;
  }
  
  ByteBuffer f()
  {
    return this.b.a().asReadOnlyBuffer();
  }
  
  int g()
  {
    return this.b.d();
  }
  
  void h()
  {
    this.d.clear();
    n();
    l();
    if (this.j != null)
    {
      this.a.a(this.j);
      this.j = null;
    }
    if (this.l != null)
    {
      this.a.a(this.l);
      this.l = null;
    }
    if (this.o != null)
    {
      this.a.a(this.o);
      this.o = null;
    }
    this.b.i();
    this.k = true;
  }
  
  Bitmap i()
  {
    if (this.j != null) {
      return this.j.a();
    }
    return this.m;
  }
  
  static class a
    extends f<Bitmap>
  {
    final int a;
    private final Handler b;
    private final long c;
    private Bitmap d;
    
    a(Handler paramHandler, int paramInt, long paramLong)
    {
      this.b = paramHandler;
      this.a = paramInt;
      this.c = paramLong;
    }
    
    Bitmap a()
    {
      return this.d;
    }
    
    public void a(Bitmap paramBitmap, com.a.a.g.b.b<? super Bitmap> paramb)
    {
      this.d = paramBitmap;
      Message localMessage = this.b.obtainMessage(1, this);
      this.b.sendMessageAtTime(localMessage, this.c);
    }
  }
  
  public static abstract interface b
  {
    public abstract void f();
  }
  
  private class c
    implements Handler.Callback
  {
    c() {}
    
    public boolean handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 1)
      {
        g.a locala2 = (g.a)paramMessage.obj;
        g.this.a(locala2);
        return true;
      }
      if (paramMessage.what == 2)
      {
        g.a locala1 = (g.a)paramMessage.obj;
        g.this.a.a(locala1);
      }
      return false;
    }
  }
  
  static abstract interface d
  {
    public abstract void a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.e.g
 * JD-Core Version:    0.7.0.1
 */