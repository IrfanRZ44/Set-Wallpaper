package com.a.a.c.b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.a.a.c.h;
import com.a.a.g.f;
import com.a.a.i.a.a.c;
import com.a.a.i.a.b;
import com.a.a.i.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class k<R>
  implements g.a<R>, a.c
{
  private static final a a = new a();
  private static final Handler b = new Handler(Looper.getMainLooper(), new b());
  private final List<f> c = new ArrayList(2);
  private final b d = b.a();
  private final android.support.v4.f.k.a<k<?>> e;
  private final a f;
  private final l g;
  private final com.a.a.c.b.c.a h;
  private final com.a.a.c.b.c.a i;
  private final com.a.a.c.b.c.a j;
  private final com.a.a.c.b.c.a k;
  private h l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private u<?> q;
  private com.a.a.c.a r;
  private boolean s;
  private p t;
  private boolean u;
  private List<f> v;
  private o<?> w;
  private g<R> x;
  private volatile boolean y;
  
  k(com.a.a.c.b.c.a parama1, com.a.a.c.b.c.a parama2, com.a.a.c.b.c.a parama3, com.a.a.c.b.c.a parama4, l paraml, android.support.v4.f.k.a<k<?>> parama)
  {
    this(parama1, parama2, parama3, parama4, paraml, parama, a);
  }
  
  k(com.a.a.c.b.c.a parama1, com.a.a.c.b.c.a parama2, com.a.a.c.b.c.a parama3, com.a.a.c.b.c.a parama4, l paraml, android.support.v4.f.k.a<k<?>> parama, a parama5)
  {
    this.h = parama1;
    this.i = parama2;
    this.j = parama3;
    this.k = parama4;
    this.g = paraml;
    this.e = parama;
    this.f = parama5;
  }
  
  private void a(boolean paramBoolean)
  {
    i.a();
    this.c.clear();
    this.l = null;
    this.w = null;
    this.q = null;
    if (this.v != null) {
      this.v.clear();
    }
    this.u = false;
    this.y = false;
    this.s = false;
    this.x.a(paramBoolean);
    this.x = null;
    this.t = null;
    this.r = null;
    this.e.a(this);
  }
  
  private void c(f paramf)
  {
    if (this.v == null) {
      this.v = new ArrayList(2);
    }
    if (!this.v.contains(paramf)) {
      this.v.add(paramf);
    }
  }
  
  private boolean d(f paramf)
  {
    return (this.v != null) && (this.v.contains(paramf));
  }
  
  private com.a.a.c.b.c.a g()
  {
    if (this.n) {
      return this.j;
    }
    if (this.o) {
      return this.k;
    }
    return this.i;
  }
  
  k<R> a(h paramh, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.l = paramh;
    this.m = paramBoolean1;
    this.n = paramBoolean2;
    this.o = paramBoolean3;
    this.p = paramBoolean4;
    return this;
  }
  
  public void a(g<?> paramg)
  {
    g().execute(paramg);
  }
  
  public void a(p paramp)
  {
    this.t = paramp;
    b.obtainMessage(2, this).sendToTarget();
  }
  
  public void a(u<R> paramu, com.a.a.c.a parama)
  {
    this.q = paramu;
    this.r = parama;
    b.obtainMessage(1, this).sendToTarget();
  }
  
  void a(f paramf)
  {
    i.a();
    this.d.b();
    if (this.s)
    {
      paramf.a(this.w, this.r);
      return;
    }
    if (this.u)
    {
      paramf.a(this.t);
      return;
    }
    this.c.add(paramf);
  }
  
  boolean a()
  {
    return this.p;
  }
  
  public b a_()
  {
    return this.d;
  }
  
  void b()
  {
    if ((this.u) || (this.s) || (this.y)) {
      return;
    }
    this.y = true;
    this.x.b();
    this.g.a(this, this.l);
  }
  
  public void b(g<R> paramg)
  {
    this.x = paramg;
    if (paramg.a()) {}
    for (com.a.a.c.b.c.a locala = this.h;; locala = g())
    {
      locala.execute(paramg);
      return;
    }
  }
  
  void b(f paramf)
  {
    i.a();
    this.d.b();
    if ((this.s) || (this.u)) {
      c(paramf);
    }
    do
    {
      return;
      this.c.remove(paramf);
    } while (!this.c.isEmpty());
    b();
  }
  
  void c()
  {
    this.d.b();
    if (this.y)
    {
      this.q.f();
      a(false);
      return;
    }
    if (this.c.isEmpty()) {
      throw new IllegalStateException("Received a resource without any callbacks to notify");
    }
    if (this.s) {
      throw new IllegalStateException("Already have resource");
    }
    this.w = this.f.a(this.q, this.m);
    this.s = true;
    this.w.g();
    this.g.a(this, this.l, this.w);
    int i1 = this.c.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      f localf = (f)this.c.get(i2);
      if (!d(localf))
      {
        this.w.g();
        localf.a(this.w, this.r);
      }
    }
    this.w.h();
    a(false);
  }
  
  void e()
  {
    this.d.b();
    if (!this.y) {
      throw new IllegalStateException("Not cancelled");
    }
    this.g.a(this, this.l);
    a(false);
  }
  
  void f()
  {
    this.d.b();
    if (this.y)
    {
      a(false);
      return;
    }
    if (this.c.isEmpty()) {
      throw new IllegalStateException("Received an exception without any callbacks to notify");
    }
    if (this.u) {
      throw new IllegalStateException("Already failed once");
    }
    this.u = true;
    this.g.a(this, this.l, null);
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      if (!d(localf)) {
        localf.a(this.t);
      }
    }
    a(false);
  }
  
  static class a
  {
    public <R> o<R> a(u<R> paramu, boolean paramBoolean)
    {
      return new o(paramu, paramBoolean, true);
    }
  }
  
  private static class b
    implements Handler.Callback
  {
    public boolean handleMessage(Message paramMessage)
    {
      k localk = (k)paramMessage.obj;
      switch (paramMessage.what)
      {
      default: 
        throw new IllegalStateException("Unrecognized message: " + paramMessage.what);
      case 1: 
        localk.c();
      }
      for (;;)
      {
        return true;
        localk.f();
        continue;
        localk.e();
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.k
 * JD-Core Version:    0.7.0.1
 */