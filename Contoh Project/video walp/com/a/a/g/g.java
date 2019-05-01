package com.a.a.g;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.f.k.a;
import android.util.Log;
import com.a.a.c.b.j;
import com.a.a.c.b.j.d;
import com.a.a.c.b.p;
import com.a.a.c.b.u;
import com.a.a.g.a.h;
import com.a.a.i.a.a.a;
import com.a.a.i.a.a.c;
import com.a.a.i.i;

public final class g<R>
  implements com.a.a.g.a.g, b, f, a.c
{
  private static final k.a<g<?>> a = com.a.a.i.a.a.a(150, new a.a()
  {
    public g<?> a()
    {
      return new g();
    }
  });
  private static final boolean c = Log.isLoggable("Request", 2);
  private int A;
  private int B;
  private boolean b;
  private final String d;
  private final com.a.a.i.a.b e;
  private d<R> f;
  private c g;
  private Context h;
  private com.a.a.e i;
  private Object j;
  private Class<R> k;
  private e l;
  private int m;
  private int n;
  private com.a.a.g o;
  private h<R> p;
  private d<R> q;
  private j r;
  private com.a.a.g.b.c<? super R> s;
  private u<R> t;
  private j.d u;
  private long v;
  private a w;
  private Drawable x;
  private Drawable y;
  private Drawable z;
  
  g()
  {
    if (c) {}
    for (String str = String.valueOf(super.hashCode());; str = null)
    {
      this.d = str;
      this.e = com.a.a.i.a.b.a();
      return;
    }
  }
  
  private static int a(int paramInt, float paramFloat)
  {
    if (paramInt == -2147483648) {
      return paramInt;
    }
    return Math.round(paramFloat * paramInt);
  }
  
  private Drawable a(int paramInt)
  {
    if (this.l.u() != null) {}
    for (Resources.Theme localTheme = this.l.u();; localTheme = this.h.getTheme()) {
      return com.a.a.c.d.c.a.a(this.i, paramInt, localTheme);
    }
  }
  
  public static <R> g<R> a(Context paramContext, com.a.a.e parame, Object paramObject, Class<R> paramClass, e parame1, int paramInt1, int paramInt2, com.a.a.g paramg, h<R> paramh, d<R> paramd1, d<R> paramd2, c paramc, j paramj, com.a.a.g.b.c<? super R> paramc1)
  {
    g localg = (g)a.a();
    if (localg == null) {
      localg = new g();
    }
    localg.b(paramContext, parame, paramObject, paramClass, parame1, paramInt1, paramInt2, paramg, paramh, paramd1, paramd2, paramc, paramj, paramc1);
    return localg;
  }
  
  private void a(p paramp, int paramInt)
  {
    this.e.b();
    int i1 = this.i.d();
    if (i1 <= paramInt)
    {
      Log.w("Glide", "Load failed for " + this.j + " with size [" + this.A + "x" + this.B + "]", paramp);
      if (i1 <= 4) {
        paramp.a("Glide");
      }
    }
    this.u = null;
    this.w = a.e;
    this.b = true;
    try
    {
      if (((this.q == null) || (!this.q.a(paramp, this.j, this.p, s()))) && ((this.f == null) || (!this.f.a(paramp, this.j, this.p, s())))) {
        o();
      }
      this.b = false;
      u();
      return;
    }
    finally
    {
      this.b = false;
    }
  }
  
  private void a(u<?> paramu)
  {
    this.r.a(paramu);
    this.t = null;
  }
  
  private void a(u<R> paramu, R paramR, com.a.a.c.a parama)
  {
    boolean bool = s();
    this.w = a.d;
    this.t = paramu;
    if (this.i.d() <= 3) {
      Log.d("Glide", "Finished loading " + paramR.getClass().getSimpleName() + " from " + parama + " for " + this.j + " with size [" + this.A + "x" + this.B + "] in " + com.a.a.i.d.a(this.v) + " ms");
    }
    this.b = true;
    try
    {
      if (((this.q == null) || (!this.q.a(paramR, this.j, this.p, parama, bool))) && ((this.f == null) || (!this.f.a(paramR, this.j, this.p, parama, bool))))
      {
        com.a.a.g.b.b localb = this.s.a(parama, bool);
        this.p.a(paramR, localb);
      }
      this.b = false;
      t();
      return;
    }
    finally
    {
      this.b = false;
    }
  }
  
  private void a(String paramString)
  {
    Log.v("Request", paramString + " this: " + this.d);
  }
  
  private void b(Context paramContext, com.a.a.e parame, Object paramObject, Class<R> paramClass, e parame1, int paramInt1, int paramInt2, com.a.a.g paramg, h<R> paramh, d<R> paramd1, d<R> paramd2, c paramc, j paramj, com.a.a.g.b.c<? super R> paramc1)
  {
    this.h = paramContext;
    this.i = parame;
    this.j = paramObject;
    this.k = paramClass;
    this.l = parame1;
    this.m = paramInt1;
    this.n = paramInt2;
    this.o = paramg;
    this.p = paramh;
    this.f = paramd1;
    this.q = paramd2;
    this.g = paramc;
    this.r = paramj;
    this.s = paramc1;
    this.w = a.a;
  }
  
  private void k()
  {
    if (this.b) {
      throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }
  }
  
  private Drawable l()
  {
    if (this.x == null)
    {
      this.x = this.l.o();
      if ((this.x == null) && (this.l.p() > 0)) {
        this.x = a(this.l.p());
      }
    }
    return this.x;
  }
  
  private Drawable m()
  {
    if (this.y == null)
    {
      this.y = this.l.r();
      if ((this.y == null) && (this.l.q() > 0)) {
        this.y = a(this.l.q());
      }
    }
    return this.y;
  }
  
  private Drawable n()
  {
    if (this.z == null)
    {
      this.z = this.l.t();
      if ((this.z == null) && (this.l.s() > 0)) {
        this.z = a(this.l.s());
      }
    }
    return this.z;
  }
  
  private void o()
  {
    if (!r()) {
      return;
    }
    Object localObject = this.j;
    Drawable localDrawable = null;
    if (localObject == null) {
      localDrawable = n();
    }
    if (localDrawable == null) {
      localDrawable = l();
    }
    if (localDrawable == null) {
      localDrawable = m();
    }
    this.p.c(localDrawable);
  }
  
  private boolean p()
  {
    return (this.g == null) || (this.g.b(this));
  }
  
  private boolean q()
  {
    return (this.g == null) || (this.g.d(this));
  }
  
  private boolean r()
  {
    return (this.g == null) || (this.g.c(this));
  }
  
  private boolean s()
  {
    return (this.g == null) || (!this.g.j());
  }
  
  private void t()
  {
    if (this.g != null) {
      this.g.e(this);
    }
  }
  
  private void u()
  {
    if (this.g != null) {
      this.g.f(this);
    }
  }
  
  public void a()
  {
    k();
    this.e.b();
    this.v = com.a.a.i.d.a();
    if (this.j == null)
    {
      if (i.a(this.m, this.n))
      {
        this.A = this.m;
        this.B = this.n;
      }
      if (n() == null) {}
      for (int i1 = 5;; i1 = 3)
      {
        a(new p("Received null model"), i1);
        return;
      }
    }
    if (this.w == a.b) {
      throw new IllegalArgumentException("Cannot restart a running request");
    }
    if (this.w == a.d)
    {
      a(this.t, com.a.a.c.a.e);
      return;
    }
    this.w = a.c;
    if (i.a(this.m, this.n)) {
      a(this.m, this.n);
    }
    for (;;)
    {
      if (((this.w == a.b) || (this.w == a.c)) && (r())) {
        this.p.b(m());
      }
      if (!c) {
        break;
      }
      a("finished run method in " + com.a.a.i.d.a(this.v));
      return;
      this.p.a(this);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.e.b();
    if (c) {
      a("Got onSizeReady in " + com.a.a.i.d.a(this.v));
    }
    if (this.w != a.c) {}
    do
    {
      return;
      this.w = a.b;
      float f1 = this.l.C();
      this.A = a(paramInt1, f1);
      this.B = a(paramInt2, f1);
      if (c) {
        a("finished setup for calling load in " + com.a.a.i.d.a(this.v));
      }
      this.u = this.r.a(this.i, this.j, this.l.w(), this.A, this.B, this.l.m(), this.k, this.o, this.l.n(), this.l.j(), this.l.k(), this.l.D(), this.l.l(), this.l.v(), this.l.E(), this.l.F(), this.l.G(), this);
      if (this.w != a.b) {
        this.u = null;
      }
    } while (!c);
    a("finished onSizeReady in " + com.a.a.i.d.a(this.v));
  }
  
  public void a(p paramp)
  {
    a(paramp, 5);
  }
  
  public void a(u<?> paramu, com.a.a.c.a parama)
  {
    this.e.b();
    this.u = null;
    if (paramu == null)
    {
      a(new p("Expected to receive a Resource<R> with an object of " + this.k + " inside, but instead got null."));
      return;
    }
    Object localObject1 = paramu.d();
    if ((localObject1 == null) || (!this.k.isAssignableFrom(localObject1.getClass())))
    {
      a(paramu);
      StringBuilder localStringBuilder1 = new StringBuilder().append("Expected to receive an object of ").append(this.k).append(" but instead got ");
      Object localObject2;
      StringBuilder localStringBuilder2;
      if (localObject1 != null)
      {
        localObject2 = localObject1.getClass();
        localStringBuilder2 = localStringBuilder1.append(localObject2).append("{").append(localObject1).append("} inside Resource{").append(paramu).append("}.");
        if (localObject1 == null) {
          break label199;
        }
      }
      label199:
      for (String str = "";; str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.")
      {
        a(new p(str));
        return;
        localObject2 = "";
        break;
      }
    }
    if (!p())
    {
      a(paramu);
      this.w = a.d;
      return;
    }
    a(paramu, localObject1, parama);
  }
  
  public boolean a(b paramb)
  {
    boolean bool1 = paramb instanceof g;
    boolean bool2 = false;
    g localg;
    if (bool1)
    {
      localg = (g)paramb;
      int i1 = this.m;
      int i2 = localg.m;
      bool2 = false;
      if (i1 == i2)
      {
        int i3 = this.n;
        int i4 = localg.n;
        bool2 = false;
        if (i3 == i4)
        {
          boolean bool3 = i.b(this.j, localg.j);
          bool2 = false;
          if (bool3)
          {
            boolean bool4 = this.k.equals(localg.k);
            bool2 = false;
            if (bool4)
            {
              boolean bool5 = this.l.equals(localg.l);
              bool2 = false;
              if (bool5)
              {
                com.a.a.g localg1 = this.o;
                com.a.a.g localg2 = localg.o;
                bool2 = false;
                if (localg1 == localg2)
                {
                  if (this.q == null) {
                    break label171;
                  }
                  d locald2 = localg.q;
                  bool2 = false;
                  if (locald2 == null) {}
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      bool2 = true;
      label171:
      d locald1;
      do
      {
        return bool2;
        locald1 = localg.q;
        bool2 = false;
      } while (locald1 != null);
    }
  }
  
  public com.a.a.i.a.b a_()
  {
    return this.e;
  }
  
  public void b()
  {
    c();
    this.w = a.h;
  }
  
  public void c()
  {
    i.a();
    k();
    this.e.b();
    if (this.w == a.g) {
      return;
    }
    j();
    if (this.t != null) {
      a(this.t);
    }
    if (q()) {
      this.p.a(m());
    }
    this.w = a.g;
  }
  
  public boolean d()
  {
    return (this.w == a.b) || (this.w == a.c);
  }
  
  public boolean e()
  {
    return this.w == a.d;
  }
  
  public boolean f()
  {
    return e();
  }
  
  public boolean g()
  {
    return (this.w == a.f) || (this.w == a.g);
  }
  
  public boolean h()
  {
    return this.w == a.e;
  }
  
  public void i()
  {
    k();
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = null;
    this.m = -1;
    this.n = -1;
    this.p = null;
    this.q = null;
    this.f = null;
    this.g = null;
    this.s = null;
    this.u = null;
    this.x = null;
    this.y = null;
    this.z = null;
    this.A = -1;
    this.B = -1;
    a.a(this);
  }
  
  void j()
  {
    k();
    this.e.b();
    this.p.b(this);
    this.w = a.f;
    if (this.u != null)
    {
      this.u.a();
      this.u = null;
    }
  }
  
  private static enum a
  {
    static
    {
      a[] arrayOfa = new a[8];
      arrayOfa[0] = a;
      arrayOfa[1] = b;
      arrayOfa[2] = c;
      arrayOfa[3] = d;
      arrayOfa[4] = e;
      arrayOfa[5] = f;
      arrayOfa[6] = g;
      arrayOfa[7] = h;
      i = arrayOfa;
    }
    
    private a() {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.g.g
 * JD-Core Version:    0.7.0.1
 */