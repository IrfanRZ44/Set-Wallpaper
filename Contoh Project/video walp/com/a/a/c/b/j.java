package com.a.a.c.b;

import android.support.v4.f.k.a;
import android.util.Log;
import com.a.a.c.b.b.b;
import com.a.a.c.b.b.h.a;
import com.a.a.e;
import com.a.a.g.f;
import com.a.a.i.d;
import java.util.Map;

public class j
  implements h.a, l, o.a
{
  private final r a;
  private final n b;
  private final com.a.a.c.b.b.h c;
  private final b d;
  private final x e;
  private final c f;
  private final a g;
  private final a h;
  
  j(com.a.a.c.b.b.h paramh, com.a.a.c.b.b.a.a parama, com.a.a.c.b.c.a parama1, com.a.a.c.b.c.a parama2, com.a.a.c.b.c.a parama3, com.a.a.c.b.c.a parama4, r paramr, n paramn, a parama5, b paramb, a parama6, x paramx, boolean paramBoolean)
  {
    this.c = paramh;
    this.f = new c(parama);
    if (parama5 == null) {
      parama5 = new a(paramBoolean);
    }
    this.h = parama5;
    parama5.a(this);
    if (paramn == null) {
      paramn = new n();
    }
    this.b = paramn;
    if (paramr == null) {
      paramr = new r();
    }
    this.a = paramr;
    if (paramb == null) {}
    for (b localb = new b(parama1, parama2, parama3, parama4, this);; localb = paramb)
    {
      this.d = localb;
      if (parama6 == null)
      {
        c localc = this.f;
        parama6 = new a(localc);
      }
      this.g = parama6;
      if (paramx == null) {
        paramx = new x();
      }
      this.e = paramx;
      paramh.a(this);
      return;
    }
  }
  
  public j(com.a.a.c.b.b.h paramh, com.a.a.c.b.b.a.a parama, com.a.a.c.b.c.a parama1, com.a.a.c.b.c.a parama2, com.a.a.c.b.c.a parama3, com.a.a.c.b.c.a parama4, boolean paramBoolean)
  {
    this(paramh, parama, parama1, parama2, parama3, parama4, null, null, null, null, null, null, paramBoolean);
  }
  
  private o<?> a(com.a.a.c.h paramh)
  {
    u localu = this.c.a(paramh);
    if (localu == null) {
      return null;
    }
    if ((localu instanceof o)) {
      return (o)localu;
    }
    return new o(localu, true, true);
  }
  
  private o<?> a(com.a.a.c.h paramh, boolean paramBoolean)
  {
    Object localObject;
    if (!paramBoolean) {
      localObject = null;
    }
    do
    {
      return localObject;
      localObject = this.h.b(paramh);
    } while (localObject == null);
    ((o)localObject).g();
    return localObject;
  }
  
  private static void a(String paramString, long paramLong, com.a.a.c.h paramh)
  {
    Log.v("Engine", paramString + " in " + d.a(paramLong) + "ms, key: " + paramh);
  }
  
  private o<?> b(com.a.a.c.h paramh, boolean paramBoolean)
  {
    Object localObject;
    if (!paramBoolean) {
      localObject = null;
    }
    do
    {
      return localObject;
      localObject = a(paramh);
    } while (localObject == null);
    ((o)localObject).g();
    this.h.a(paramh, (o)localObject);
    return localObject;
  }
  
  public <R> d a(e parame, Object paramObject, com.a.a.c.h paramh, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, com.a.a.g paramg, i parami, Map<Class<?>, com.a.a.c.m<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, com.a.a.c.j paramj, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, f paramf)
  {
    com.a.a.i.i.a();
    long l = d.a();
    m localm = this.b.a(paramObject, paramh, paramInt1, paramInt2, paramMap, paramClass, paramClass1, paramj);
    o localo1 = a(localm, paramBoolean3);
    if (localo1 != null)
    {
      paramf.a(localo1, com.a.a.c.a.e);
      if (Log.isLoggable("Engine", 2)) {
        a("Loaded resource from active resources", l, localm);
      }
      return null;
    }
    o localo2 = b(localm, paramBoolean3);
    if (localo2 != null)
    {
      paramf.a(localo2, com.a.a.c.a.e);
      if (Log.isLoggable("Engine", 2)) {
        a("Loaded resource from cache", l, localm);
      }
      return null;
    }
    k localk1 = this.a.a(localm, paramBoolean6);
    if (localk1 != null)
    {
      localk1.a(paramf);
      if (Log.isLoggable("Engine", 2)) {
        a("Added to existing load", l, localm);
      }
      return new d(paramf, localk1);
    }
    k localk2 = this.d.a(localm, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6);
    g localg = this.g.a(parame, paramObject, localm, paramh, paramInt1, paramInt2, paramClass, paramClass1, paramg, parami, paramMap, paramBoolean1, paramBoolean2, paramBoolean6, paramj, localk2);
    this.a.a(localm, localk2);
    localk2.a(paramf);
    localk2.b(localg);
    if (Log.isLoggable("Engine", 2)) {
      a("Started new load", l, localm);
    }
    return new d(paramf, localk2);
  }
  
  public void a(k<?> paramk, com.a.a.c.h paramh)
  {
    com.a.a.i.i.a();
    this.a.b(paramh, paramk);
  }
  
  public void a(k<?> paramk, com.a.a.c.h paramh, o<?> paramo)
  {
    
    if (paramo != null)
    {
      paramo.a(paramh, this);
      if (paramo.b()) {
        this.h.a(paramh, paramo);
      }
    }
    this.a.b(paramh, paramk);
  }
  
  public void a(u<?> paramu)
  {
    
    if ((paramu instanceof o))
    {
      ((o)paramu).h();
      return;
    }
    throw new IllegalArgumentException("Cannot release anything but an EngineResource");
  }
  
  public void a(com.a.a.c.h paramh, o<?> paramo)
  {
    com.a.a.i.i.a();
    this.h.a(paramh);
    if (paramo.b())
    {
      this.c.b(paramh, paramo);
      return;
    }
    this.e.a(paramo);
  }
  
  public void b(u<?> paramu)
  {
    com.a.a.i.i.a();
    this.e.a(paramu);
  }
  
  static class a
  {
    final g.d a;
    final k.a<g<?>> b = com.a.a.i.a.a.a(150, new com.a.a.i.a.a.a()
    {
      public g<?> a()
      {
        return new g(j.a.this.a, j.a.this.b);
      }
    });
    private int c;
    
    a(g.d paramd)
    {
      this.a = paramd;
    }
    
    <R> g<R> a(e parame, Object paramObject, m paramm, com.a.a.c.h paramh, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, com.a.a.g paramg, i parami, Map<Class<?>, com.a.a.c.m<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, com.a.a.c.j paramj, g.a<R> parama)
    {
      g localg = (g)com.a.a.i.h.a((g)this.b.a());
      int i = this.c;
      this.c = (i + 1);
      return localg.a(parame, paramObject, paramm, paramh, paramInt1, paramInt2, paramClass, paramClass1, paramg, parami, paramMap, paramBoolean1, paramBoolean2, paramBoolean3, paramj, parama, i);
    }
  }
  
  static class b
  {
    final com.a.a.c.b.c.a a;
    final com.a.a.c.b.c.a b;
    final com.a.a.c.b.c.a c;
    final com.a.a.c.b.c.a d;
    final l e;
    final k.a<k<?>> f = com.a.a.i.a.a.a(150, new com.a.a.i.a.a.a()
    {
      public k<?> a()
      {
        return new k(j.b.this.a, j.b.this.b, j.b.this.c, j.b.this.d, j.b.this.e, j.b.this.f);
      }
    });
    
    b(com.a.a.c.b.c.a parama1, com.a.a.c.b.c.a parama2, com.a.a.c.b.c.a parama3, com.a.a.c.b.c.a parama4, l paraml)
    {
      this.a = parama1;
      this.b = parama2;
      this.c = parama3;
      this.d = parama4;
      this.e = paraml;
    }
    
    <R> k<R> a(com.a.a.c.h paramh, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    {
      return ((k)com.a.a.i.h.a((k)this.f.a())).a(paramh, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
    }
  }
  
  private static class c
    implements g.d
  {
    private final com.a.a.c.b.b.a.a a;
    private volatile com.a.a.c.b.b.a b;
    
    c(com.a.a.c.b.b.a.a parama)
    {
      this.a = parama;
    }
    
    public com.a.a.c.b.b.a a()
    {
      if (this.b == null) {}
      try
      {
        if (this.b == null) {
          this.b = this.a.a();
        }
        if (this.b == null) {
          this.b = new b();
        }
        return this.b;
      }
      finally {}
    }
  }
  
  public static class d
  {
    private final k<?> a;
    private final f b;
    
    d(f paramf, k<?> paramk)
    {
      this.b = paramf;
      this.a = paramk;
    }
    
    public void a()
    {
      this.a.b(this.b);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.j
 * JD-Core Version:    0.7.0.1
 */