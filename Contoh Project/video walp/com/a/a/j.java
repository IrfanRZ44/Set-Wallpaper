package com.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.a.a.d.c.a;
import com.a.a.d.d;
import com.a.a.d.m;
import com.a.a.d.n;
import com.a.a.d.p;
import com.a.a.g.b;
import java.util.Iterator;
import java.util.List;

public class j
  implements com.a.a.d.i
{
  private static final com.a.a.g.e d = com.a.a.g.e.a(Bitmap.class).h();
  private static final com.a.a.g.e e = com.a.a.g.e.a(com.a.a.c.d.e.c.class).h();
  private static final com.a.a.g.e f = com.a.a.g.e.a(com.a.a.c.b.i.c).a(g.d).b(true);
  protected final c a;
  protected final Context b;
  final com.a.a.d.h c;
  private final n g;
  private final m h;
  private final p i = new p();
  private final Runnable j = new Runnable()
  {
    public void run()
    {
      j.this.c.a(j.this);
    }
  };
  private final Handler k = new Handler(Looper.getMainLooper());
  private final com.a.a.d.c l;
  private com.a.a.g.e m;
  
  public j(c paramc, com.a.a.d.h paramh, m paramm, Context paramContext)
  {
    this(paramc, paramh, paramm, new n(), paramc.d(), paramContext);
  }
  
  j(c paramc, com.a.a.d.h paramh, m paramm, n paramn, d paramd, Context paramContext)
  {
    this.a = paramc;
    this.c = paramh;
    this.h = paramm;
    this.g = paramn;
    this.b = paramContext;
    this.l = paramd.a(paramContext.getApplicationContext(), new a(paramn));
    if (com.a.a.i.i.c()) {
      this.k.post(this.j);
    }
    for (;;)
    {
      paramh.a(this.l);
      a(paramc.e().a());
      paramc.a(this);
      return;
      paramh.a(this);
    }
  }
  
  private void c(com.a.a.g.a.h<?> paramh)
  {
    if ((!b(paramh)) && (!this.a.a(paramh)) && (paramh.b() != null))
    {
      b localb = paramh.b();
      paramh.a(null);
      localb.c();
    }
  }
  
  public <ResourceType> i<ResourceType> a(Class<ResourceType> paramClass)
  {
    return new i(this.a, this, paramClass, this.b);
  }
  
  public i<Drawable> a(String paramString)
  {
    return g().a(paramString);
  }
  
  public void a()
  {
    com.a.a.i.i.a();
    this.g.a();
  }
  
  public void a(final com.a.a.g.a.h<?> paramh)
  {
    if (paramh == null) {
      return;
    }
    if (com.a.a.i.i.b())
    {
      c(paramh);
      return;
    }
    this.k.post(new Runnable()
    {
      public void run()
      {
        j.this.a(paramh);
      }
    });
  }
  
  void a(com.a.a.g.a.h<?> paramh, b paramb)
  {
    this.i.a(paramh);
    this.g.a(paramb);
  }
  
  protected void a(com.a.a.g.e parame)
  {
    this.m = parame.a().i();
  }
  
  <T> k<?, T> b(Class<T> paramClass)
  {
    return this.a.e().a(paramClass);
  }
  
  public void b()
  {
    com.a.a.i.i.a();
    this.g.b();
  }
  
  boolean b(com.a.a.g.a.h<?> paramh)
  {
    b localb = paramh.b();
    if (localb == null) {
      return true;
    }
    if (this.g.b(localb))
    {
      this.i.b(paramh);
      paramh.a(null);
      return true;
    }
    return false;
  }
  
  public void c()
  {
    b();
    this.i.c();
  }
  
  public void d()
  {
    a();
    this.i.d();
  }
  
  public void e()
  {
    this.i.e();
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext()) {
      a((com.a.a.g.a.h)localIterator.next());
    }
    this.i.b();
    this.g.c();
    this.c.b(this);
    this.c.b(this.l);
    this.k.removeCallbacks(this.j);
    this.a.b(this);
  }
  
  public i<Bitmap> f()
  {
    return a(Bitmap.class).a(d);
  }
  
  public i<Drawable> g()
  {
    return a(Drawable.class);
  }
  
  com.a.a.g.e h()
  {
    return this.m;
  }
  
  public String toString()
  {
    return super.toString() + "{tracker=" + this.g + ", treeNode=" + this.h + "}";
  }
  
  private static class a
    implements c.a
  {
    private final n a;
    
    a(n paramn)
    {
      this.a = paramn;
    }
    
    public void a(boolean paramBoolean)
    {
      if (paramBoolean) {
        this.a.d();
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.j
 * JD-Core Version:    0.7.0.1
 */