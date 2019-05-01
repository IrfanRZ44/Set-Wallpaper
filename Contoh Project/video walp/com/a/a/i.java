package com.a.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.a.a.g.a;
import com.a.a.g.b;
import com.a.a.g.d;

public class i<TranscodeType>
  implements Cloneable
{
  protected static final com.a.a.g.e a = new com.a.a.g.e().b(com.a.a.c.b.i.c).a(g.d).b(true);
  protected com.a.a.g.e b;
  private final Context c;
  private final j d;
  private final Class<TranscodeType> e;
  private final com.a.a.g.e f;
  private final c g;
  private final e h;
  private k<?, ? super TranscodeType> i;
  private Object j;
  private d<TranscodeType> k;
  private i<TranscodeType> l;
  private i<TranscodeType> m;
  private Float n;
  private boolean o = true;
  private boolean p;
  private boolean q;
  
  protected i(c paramc, j paramj, Class<TranscodeType> paramClass, Context paramContext)
  {
    this.g = paramc;
    this.d = paramj;
    this.e = paramClass;
    this.f = paramj.h();
    this.c = paramContext;
    this.i = paramj.b(paramClass);
    this.b = this.f;
    this.h = paramc.e();
  }
  
  private <Y extends com.a.a.g.a.h<TranscodeType>> Y a(Y paramY, d<TranscodeType> paramd, com.a.a.g.e parame)
  {
    com.a.a.i.i.a();
    com.a.a.i.h.a(paramY);
    if (!this.p) {
      throw new IllegalArgumentException("You must call #load() before calling #into()");
    }
    com.a.a.g.e locale = parame.i();
    b localb1 = b(paramY, paramd, locale);
    b localb2 = paramY.b();
    if ((localb1.a(localb2)) && (!a(locale, localb2)))
    {
      localb1.i();
      if (!((b)com.a.a.i.h.a(localb2)).d()) {
        localb2.a();
      }
      return paramY;
    }
    this.d.a(paramY);
    paramY.a(localb1);
    this.d.a(paramY, localb1);
    return paramY;
  }
  
  private b a(com.a.a.g.a.h<TranscodeType> paramh, d<TranscodeType> paramd, com.a.a.g.c paramc, k<?, ? super TranscodeType> paramk, g paramg, int paramInt1, int paramInt2, com.a.a.g.e parame)
  {
    a locala2;
    Object localObject;
    if (this.m != null)
    {
      a locala1 = new a(paramc);
      locala2 = locala1;
      localObject = locala1;
    }
    for (;;)
    {
      b localb = b(paramh, paramd, (com.a.a.g.c)localObject, paramk, paramg, paramInt1, paramInt2, parame);
      if (locala2 == null) {
        return localb;
      }
      int i1 = this.m.b.z();
      int i2 = this.m.b.B();
      if ((com.a.a.i.i.a(paramInt1, paramInt2)) && (!this.m.b.A()))
      {
        i1 = parame.z();
        i2 = parame.B();
      }
      i locali = this.m;
      k localk = this.m.i;
      g localg = this.m.b.y();
      com.a.a.g.e locale = this.m.b;
      locala2.a(localb, locali.a(paramh, paramd, locala2, localk, localg, i1, i2, locale));
      return locala2;
      localObject = paramc;
      locala2 = null;
    }
  }
  
  private b a(com.a.a.g.a.h<TranscodeType> paramh, d<TranscodeType> paramd, com.a.a.g.e parame, com.a.a.g.c paramc, k<?, ? super TranscodeType> paramk, g paramg, int paramInt1, int paramInt2)
  {
    return com.a.a.g.g.a(this.c, this.h, this.j, this.e, parame, paramInt1, paramInt2, paramg, paramh, paramd, this.k, paramc, this.h.b(), paramk.b());
  }
  
  private g a(g paramg)
  {
    switch (1.b[paramg.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("unknown priority: " + this.b.y());
    case 1: 
      return g.c;
    case 2: 
      return g.b;
    }
    return g.a;
  }
  
  private boolean a(com.a.a.g.e parame, b paramb)
  {
    return (!parame.v()) && (paramb.e());
  }
  
  private b b(com.a.a.g.a.h<TranscodeType> paramh, d<TranscodeType> paramd, com.a.a.g.c paramc, k<?, ? super TranscodeType> paramk, g paramg, int paramInt1, int paramInt2, com.a.a.g.e parame)
  {
    k localk;
    if (this.l != null)
    {
      if (this.q) {
        throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
      }
      localk = this.l.i;
      if (!this.l.o) {
        break label343;
      }
    }
    label332:
    label343:
    for (Object localObject = paramk;; localObject = localk)
    {
      g localg;
      int i1;
      int i2;
      int i5;
      int i3;
      if (this.l.b.x())
      {
        localg = this.l.b.y();
        i1 = this.l.b.z();
        i2 = this.l.b.B();
        if ((!com.a.a.i.i.a(paramInt1, paramInt2)) || (this.l.b.A())) {
          break label332;
        }
        i5 = parame.z();
        i3 = parame.B();
      }
      for (int i4 = i5;; i4 = i1)
      {
        com.a.a.g.h localh2 = new com.a.a.g.h(paramc);
        b localb1 = a(paramh, paramd, parame, localh2, paramk, paramg, paramInt1, paramInt2);
        this.q = true;
        i locali = this.l;
        com.a.a.g.e locale = this.l.b;
        b localb2 = locali.a(paramh, paramd, localh2, (k)localObject, localg, i4, i3, locale);
        this.q = false;
        localh2.a(localb1, localb2);
        return localh2;
        localg = a(paramg);
        break;
        if (this.n != null)
        {
          com.a.a.g.h localh1 = new com.a.a.g.h(paramc);
          localh1.a(a(paramh, paramd, parame, localh1, paramk, paramg, paramInt1, paramInt2), a(paramh, paramd, parame.a().a(this.n.floatValue()), localh1, paramk, a(paramg), paramInt1, paramInt2));
          return localh1;
        }
        return a(paramh, paramd, parame, paramc, paramk, paramg, paramInt1, paramInt2);
        i3 = i2;
      }
    }
  }
  
  private b b(com.a.a.g.a.h<TranscodeType> paramh, d<TranscodeType> paramd, com.a.a.g.e parame)
  {
    return a(paramh, paramd, null, this.i, parame.y(), parame.z(), parame.B(), parame);
  }
  
  private i<TranscodeType> b(Object paramObject)
  {
    this.j = paramObject;
    this.p = true;
    return this;
  }
  
  public <Y extends com.a.a.g.a.h<TranscodeType>> Y a(Y paramY)
  {
    return a(paramY, null);
  }
  
  <Y extends com.a.a.g.a.h<TranscodeType>> Y a(Y paramY, d<TranscodeType> paramd)
  {
    return a(paramY, paramd, a());
  }
  
  public com.a.a.g.a.i<ImageView, TranscodeType> a(ImageView paramImageView)
  {
    com.a.a.i.i.a();
    com.a.a.i.h.a(paramImageView);
    com.a.a.g.e locale = this.b;
    if ((!locale.c()) && (locale.b()) && (paramImageView.getScaleType() != null)) {
      switch (1.a[paramImageView.getScaleType().ordinal()])
      {
      }
    }
    for (;;)
    {
      return (com.a.a.g.a.i)a(this.h.a(paramImageView, this.e), null, locale);
      locale = locale.a().d();
      continue;
      locale = locale.a().g();
      continue;
      locale = locale.a().f();
      continue;
      locale = locale.a().g();
    }
  }
  
  protected com.a.a.g.e a()
  {
    if (this.f == this.b) {
      return this.b.a();
    }
    return this.b;
  }
  
  public i<TranscodeType> a(com.a.a.g.e parame)
  {
    com.a.a.i.h.a(parame);
    this.b = a().a(parame);
    return this;
  }
  
  public i<TranscodeType> a(Object paramObject)
  {
    return b(paramObject);
  }
  
  public i<TranscodeType> a(String paramString)
  {
    return b(paramString);
  }
  
  public i<TranscodeType> b()
  {
    try
    {
      i locali = (i)super.clone();
      locali.b = locali.b.a();
      locali.i = locali.i.a();
      return locali;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i
 * JD-Core Version:    0.7.0.1
 */