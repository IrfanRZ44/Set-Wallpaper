package com.a.a.c.b;

import android.os.Build.VERSION;
import android.support.v4.f.k.a;
import android.util.Log;
import com.a.a.c.d.a.k;
import com.a.a.c.j;
import com.a.a.c.l;
import com.a.a.h.d;
import com.a.a.i.a.a.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class g<R>
  implements e.a, a.c, Comparable<g<?>>, Runnable
{
  private com.a.a.c.a.d<?> A;
  private volatile e B;
  private volatile boolean C;
  private volatile boolean D;
  private final f<R> a = new f();
  private final List<Throwable> b = new ArrayList();
  private final com.a.a.i.a.b c = com.a.a.i.a.b.a();
  private final d d;
  private final k.a<g<?>> e;
  private final c<?> f = new c();
  private final e g = new e();
  private com.a.a.e h;
  private com.a.a.c.h i;
  private com.a.a.g j;
  private m k;
  private int l;
  private int m;
  private i n;
  private j o;
  private a<R> p;
  private int q;
  private g r;
  private f s;
  private long t;
  private boolean u;
  private Thread v;
  private com.a.a.c.h w;
  private com.a.a.c.h x;
  private Object y;
  private com.a.a.c.a z;
  
  g(d paramd, k.a<g<?>> parama)
  {
    this.d = paramd;
    this.e = parama;
  }
  
  private g a(g paramg)
  {
    switch (1.b[paramg.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("Unrecognized stage: " + paramg);
    case 5: 
      if (this.n.a()) {
        return g.b;
      }
      return a(g.b);
    case 1: 
      if (this.n.b()) {
        return g.c;
      }
      return a(g.c);
    case 2: 
      if (this.u) {
        return g.f;
      }
      return g.d;
    }
    return g.f;
  }
  
  private <Data> u<R> a(com.a.a.c.a.d<?> paramd, Data paramData, com.a.a.c.a parama)
  {
    if (paramData == null)
    {
      paramd.b();
      return null;
    }
    try
    {
      long l1 = com.a.a.i.d.a();
      u localu = a(paramData, parama);
      if (Log.isLoggable("DecodeJob", 2)) {
        a("Decoded result " + localu, l1);
      }
      return localu;
    }
    finally
    {
      paramd.b();
    }
  }
  
  private <Data> u<R> a(Data paramData, com.a.a.c.a parama)
  {
    return a(paramData, parama, this.a.b(paramData.getClass()));
  }
  
  private <Data, ResourceType> u<R> a(Data paramData, com.a.a.c.a parama, s<Data, ResourceType, R> params)
  {
    j localj = a(parama);
    com.a.a.c.a.e locale = this.h.c().b(paramData);
    try
    {
      u localu = params.a(locale, localj, this.l, this.m, new b(parama));
      return localu;
    }
    finally
    {
      locale.b();
    }
  }
  
  private j a(com.a.a.c.a parama)
  {
    j localj1 = this.o;
    if (Build.VERSION.SDK_INT < 26) {}
    while ((localj1.a(k.d) != null) || ((parama != com.a.a.c.a.d) && (!this.a.m()))) {
      return localj1;
    }
    j localj2 = new j();
    localj2.a(this.o);
    localj2.a(k.d, Boolean.valueOf(true));
    return localj2;
  }
  
  private void a(u<R> paramu, com.a.a.c.a parama)
  {
    m();
    this.p.a(paramu, parama);
  }
  
  private void a(String paramString, long paramLong)
  {
    a(paramString, paramLong, null);
  }
  
  private void a(String paramString1, long paramLong, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(paramString1).append(" in ").append(com.a.a.i.d.a(paramLong)).append(", load key: ").append(this.k);
    if (paramString2 != null) {}
    for (String str = ", " + paramString2;; str = "")
    {
      Log.v("DecodeJob", str + ", thread: " + Thread.currentThread().getName());
      return;
    }
  }
  
  private void b(u<R> paramu, com.a.a.c.a parama)
  {
    if ((paramu instanceof q)) {
      ((q)paramu).a();
    }
    boolean bool = this.f.a();
    t localt = null;
    if (bool)
    {
      localt = t.a(paramu);
      paramu = localt;
    }
    a(paramu, parama);
    this.r = g.e;
    try
    {
      if (this.f.a()) {
        this.f.a(this.d, this.o);
      }
      if (localt != null) {
        localt.a();
      }
      e();
      return;
    }
    finally
    {
      if (localt != null) {
        localt.a();
      }
    }
  }
  
  private void e()
  {
    if (this.g.a()) {
      g();
    }
  }
  
  private void f()
  {
    if (this.g.b()) {
      g();
    }
  }
  
  private void g()
  {
    this.g.c();
    this.f.b();
    this.a.a();
    this.C = false;
    this.h = null;
    this.i = null;
    this.o = null;
    this.j = null;
    this.k = null;
    this.p = null;
    this.r = null;
    this.B = null;
    this.v = null;
    this.w = null;
    this.y = null;
    this.z = null;
    this.A = null;
    this.t = 0L;
    this.D = false;
    this.b.clear();
    this.e.a(this);
  }
  
  private int h()
  {
    return this.j.ordinal();
  }
  
  private void i()
  {
    switch (1.a[this.s.ordinal()])
    {
    default: 
      throw new IllegalStateException("Unrecognized run reason: " + this.s);
    case 1: 
      this.r = a(g.a);
      this.B = j();
      k();
      return;
    case 2: 
      k();
      return;
    }
    n();
  }
  
  private e j()
  {
    switch (1.b[this.r.ordinal()])
    {
    default: 
      throw new IllegalStateException("Unrecognized stage: " + this.r);
    case 1: 
      return new v(this.a, this);
    case 2: 
      return new b(this.a, this);
    case 3: 
      return new y(this.a, this);
    }
    return null;
  }
  
  private void k()
  {
    this.v = Thread.currentThread();
    this.t = com.a.a.i.d.a();
    boolean bool = false;
    while ((!this.D) && (this.B != null))
    {
      bool = this.B.a();
      if (!bool)
      {
        this.r = a(this.r);
        this.B = j();
        if (this.r == g.d) {
          c();
        }
      }
    }
    while (((this.r != g.f) && (!this.D)) || (bool)) {
      return;
    }
    l();
  }
  
  private void l()
  {
    m();
    p localp = new p("Failed to load resource", new ArrayList(this.b));
    this.p.a(localp);
    f();
  }
  
  private void m()
  {
    this.c.b();
    if (this.C) {
      throw new IllegalStateException("Already notified");
    }
    this.C = true;
  }
  
  private void n()
  {
    if (Log.isLoggable("DecodeJob", 2)) {
      a("Retrieved data", this.t, "data: " + this.y + ", cache key: " + this.w + ", fetcher: " + this.A);
    }
    try
    {
      u localu2 = a(this.A, this.y, this.z);
      localu1 = localu2;
    }
    catch (p localp)
    {
      for (;;)
      {
        localp.a(this.x, this.z);
        this.b.add(localp);
        u localu1 = null;
      }
      k();
    }
    if (localu1 != null)
    {
      b(localu1, this.z);
      return;
    }
  }
  
  public int a(g<?> paramg)
  {
    int i1 = h() - paramg.h();
    if (i1 == 0) {
      i1 = this.q - paramg.q;
    }
    return i1;
  }
  
  g<R> a(com.a.a.e parame, Object paramObject, m paramm, com.a.a.c.h paramh, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, com.a.a.g paramg, i parami, Map<Class<?>, com.a.a.c.m<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, j paramj, a<R> parama, int paramInt3)
  {
    this.a.a(parame, paramObject, paramh, paramInt1, paramInt2, parami, paramClass, paramClass1, paramg, paramj, paramMap, paramBoolean1, paramBoolean2, this.d);
    this.h = parame;
    this.i = paramh;
    this.j = paramg;
    this.k = paramm;
    this.l = paramInt1;
    this.m = paramInt2;
    this.n = parami;
    this.u = paramBoolean3;
    this.o = paramj;
    this.p = parama;
    this.q = paramInt3;
    this.s = f.a;
    return this;
  }
  
  <Z> u<Z> a(com.a.a.c.a parama, u<Z> paramu)
  {
    Class localClass = paramu.d().getClass();
    com.a.a.c.m localm;
    Object localObject1;
    if (parama != com.a.a.c.a.d)
    {
      localm = this.a.c(localClass);
      localObject1 = localm.a(this.h, paramu, this.l, this.m);
    }
    for (;;)
    {
      if (!paramu.equals(localObject1)) {
        paramu.f();
      }
      com.a.a.c.c localc;
      l locall1;
      boolean bool;
      if (this.a.a((u)localObject1))
      {
        l locall2 = this.a.b((u)localObject1);
        localc = locall2.a(this.o);
        locall1 = locall2;
        if (this.a.a(this.w)) {
          break label170;
        }
        bool = true;
      }
      for (;;)
      {
        if (this.n.a(bool, parama, localc))
        {
          if (locall1 == null)
          {
            throw new h.d(((u)localObject1).d().getClass());
            localc = com.a.a.c.c.c;
            locall1 = null;
            break;
            label170:
            bool = false;
            continue;
          }
          switch (1.c[localc.ordinal()])
          {
          default: 
            throw new IllegalArgumentException("Unknown strategy: " + localc);
          }
        }
      }
      for (Object localObject2 = new c(this.w, this.i);; localObject2 = new w(this.a.i(), this.w, this.i, this.l, this.m, localm, localClass, this.o))
      {
        localObject1 = t.a((u)localObject1);
        this.f.a((com.a.a.c.h)localObject2, locall1, (t)localObject1);
        return localObject1;
      }
      localObject1 = paramu;
      localm = null;
    }
  }
  
  public void a(com.a.a.c.h paramh, Exception paramException, com.a.a.c.a.d<?> paramd, com.a.a.c.a parama)
  {
    paramd.b();
    p localp = new p("Fetching data failed", paramException);
    localp.a(paramh, parama, paramd.a());
    this.b.add(localp);
    if (Thread.currentThread() != this.v)
    {
      this.s = f.b;
      this.p.a(this);
      return;
    }
    k();
  }
  
  public void a(com.a.a.c.h paramh1, Object paramObject, com.a.a.c.a.d<?> paramd, com.a.a.c.a parama, com.a.a.c.h paramh2)
  {
    this.w = paramh1;
    this.y = paramObject;
    this.A = paramd;
    this.z = parama;
    this.x = paramh2;
    if (Thread.currentThread() != this.v)
    {
      this.s = f.c;
      this.p.a(this);
      return;
    }
    android.support.v4.os.c.a("DecodeJob.decodeFromRetrievedData");
    try
    {
      n();
      return;
    }
    finally
    {
      android.support.v4.os.c.a();
    }
  }
  
  void a(boolean paramBoolean)
  {
    if (this.g.a(paramBoolean)) {
      g();
    }
  }
  
  boolean a()
  {
    g localg = a(g.a);
    return (localg == g.b) || (localg == g.c);
  }
  
  public com.a.a.i.a.b a_()
  {
    return this.c;
  }
  
  public void b()
  {
    this.D = true;
    e locale = this.B;
    if (locale != null) {
      locale.b();
    }
  }
  
  public void c()
  {
    this.s = f.b;
    this.p.a(this);
  }
  
  public void run()
  {
    android.support.v4.os.c.a("DecodeJob#run");
    com.a.a.c.a.d locald = this.A;
    try
    {
      if (this.D)
      {
        l();
        return;
      }
      i();
      return;
    }
    catch (Throwable localThrowable)
    {
      if (Log.isLoggable("DecodeJob", 3)) {
        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.D + ", stage: " + this.r, localThrowable);
      }
      if (this.r != g.e)
      {
        this.b.add(localThrowable);
        l();
      }
      if (!this.D) {
        throw localThrowable;
      }
    }
    finally
    {
      if (locald != null) {
        locald.b();
      }
      android.support.v4.os.c.a();
    }
    if (locald != null) {
      locald.b();
    }
    android.support.v4.os.c.a();
  }
  
  static abstract interface a<R>
  {
    public abstract void a(g<?> paramg);
    
    public abstract void a(p paramp);
    
    public abstract void a(u<R> paramu, com.a.a.c.a parama);
  }
  
  private final class b<Z>
    implements h.a<Z>
  {
    private final com.a.a.c.a b;
    
    b(com.a.a.c.a parama)
    {
      this.b = parama;
    }
    
    public u<Z> a(u<Z> paramu)
    {
      return g.this.a(this.b, paramu);
    }
  }
  
  private static class c<Z>
  {
    private com.a.a.c.h a;
    private l<Z> b;
    private t<Z> c;
    
    void a(g.d paramd, j paramj)
    {
      android.support.v4.os.c.a("DecodeJob.encode");
      try
      {
        paramd.a().a(this.a, new d(this.b, this.c, paramj));
        return;
      }
      finally
      {
        this.c.a();
        android.support.v4.os.c.a();
      }
    }
    
    <X> void a(com.a.a.c.h paramh, l<X> paraml, t<X> paramt)
    {
      this.a = paramh;
      this.b = paraml;
      this.c = paramt;
    }
    
    boolean a()
    {
      return this.c != null;
    }
    
    void b()
    {
      this.a = null;
      this.b = null;
      this.c = null;
    }
  }
  
  static abstract interface d
  {
    public abstract com.a.a.c.b.b.a a();
  }
  
  private static class e
  {
    private boolean a;
    private boolean b;
    private boolean c;
    
    private boolean b(boolean paramBoolean)
    {
      return ((this.c) || (paramBoolean) || (this.b)) && (this.a);
    }
    
    boolean a()
    {
      try
      {
        this.b = true;
        boolean bool = b(false);
        return bool;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
    
    boolean a(boolean paramBoolean)
    {
      try
      {
        this.a = true;
        boolean bool = b(paramBoolean);
        return bool;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
    
    boolean b()
    {
      try
      {
        this.c = true;
        boolean bool = b(false);
        return bool;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
    
    void c()
    {
      try
      {
        this.b = false;
        this.a = false;
        this.c = false;
        return;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
  }
  
  private static enum f
  {
    static
    {
      f[] arrayOff = new f[3];
      arrayOff[0] = a;
      arrayOff[1] = b;
      arrayOff[2] = c;
      d = arrayOff;
    }
    
    private f() {}
  }
  
  private static enum g
  {
    static
    {
      g[] arrayOfg = new g[6];
      arrayOfg[0] = a;
      arrayOfg[1] = b;
      arrayOfg[2] = c;
      arrayOfg[3] = d;
      arrayOfg[4] = e;
      arrayOfg[5] = f;
      g = arrayOfg;
    }
    
    private g() {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.g
 * JD-Core Version:    0.7.0.1
 */