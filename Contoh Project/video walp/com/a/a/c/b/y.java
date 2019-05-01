package com.a.a.c.b;

import android.util.Log;
import com.a.a.c.a.d.a;
import com.a.a.c.c.n.a;
import com.a.a.c.h;
import java.util.Collections;
import java.util.List;

class y
  implements d.a<Object>, e, e.a
{
  private final f<?> a;
  private final e.a b;
  private int c;
  private b d;
  private Object e;
  private volatile n.a<?> f;
  private c g;
  
  y(f<?> paramf, e.a parama)
  {
    this.a = paramf;
    this.b = parama;
  }
  
  private void b(Object paramObject)
  {
    long l = com.a.a.i.d.a();
    try
    {
      com.a.a.c.d locald = this.a.a(paramObject);
      d locald1 = new d(locald, paramObject, this.a.e());
      this.g = new c(this.f.a, this.a.f());
      this.a.b().a(this.g, locald1);
      if (Log.isLoggable("SourceGenerator", 2)) {
        Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.g + ", data: " + paramObject + ", encoder: " + locald + ", duration: " + com.a.a.i.d.a(l));
      }
      this.f.c.b();
      this.d = new b(Collections.singletonList(this.f.a), this.a, this);
      return;
    }
    finally
    {
      this.f.c.b();
    }
  }
  
  private boolean d()
  {
    return this.c < this.a.n().size();
  }
  
  public void a(h paramh, Exception paramException, com.a.a.c.a.d<?> paramd, com.a.a.c.a parama)
  {
    this.b.a(paramh, paramException, paramd, this.f.c.d());
  }
  
  public void a(h paramh1, Object paramObject, com.a.a.c.a.d<?> paramd, com.a.a.c.a parama, h paramh2)
  {
    this.b.a(paramh1, paramObject, paramd, this.f.c.d(), paramh1);
  }
  
  public void a(Exception paramException)
  {
    this.b.a(this.g, paramException, this.f.c, this.f.c.d());
  }
  
  public void a(Object paramObject)
  {
    i locali = this.a.c();
    if ((paramObject != null) && (locali.a(this.f.c.d())))
    {
      this.e = paramObject;
      this.b.c();
      return;
    }
    this.b.a(this.f.a, paramObject, this.f.c, this.f.c.d(), this.g);
  }
  
  public boolean a()
  {
    if (this.e != null)
    {
      Object localObject = this.e;
      this.e = null;
      b(localObject);
    }
    if ((this.d != null) && (this.d.a())) {
      return true;
    }
    this.d = null;
    this.f = null;
    for (boolean bool = false; (!bool) && (d()); bool = true)
    {
      label55:
      List localList = this.a.n();
      int i = this.c;
      this.c = (i + 1);
      this.f = ((n.a)localList.get(i));
      if ((this.f == null) || ((!this.a.c().a(this.f.c.d())) && (!this.a.a(this.f.c.a())))) {
        break label55;
      }
      this.f.c.a(this.a.d(), this);
    }
    return bool;
  }
  
  public void b()
  {
    n.a locala = this.f;
    if (locala != null) {
      locala.c.c();
    }
  }
  
  public void c()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.y
 * JD-Core Version:    0.7.0.1
 */