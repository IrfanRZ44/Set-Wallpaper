package com.a.a.c.b;

import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.c.n;
import com.a.a.c.c.n.a;
import com.a.a.c.h;
import java.io.File;
import java.util.List;

class b
  implements d.a<Object>, e
{
  private final List<h> a;
  private final f<?> b;
  private final e.a c;
  private int d = -1;
  private h e;
  private List<n<File, ?>> f;
  private int g;
  private volatile n.a<?> h;
  private File i;
  
  b(f<?> paramf, e.a parama)
  {
    this(paramf.o(), paramf, parama);
  }
  
  b(List<h> paramList, f<?> paramf, e.a parama)
  {
    this.a = paramList;
    this.b = paramf;
    this.c = parama;
  }
  
  private boolean c()
  {
    return this.g < this.f.size();
  }
  
  public void a(Exception paramException)
  {
    this.c.a(this.e, paramException, this.h.c, com.a.a.c.a.c);
  }
  
  public void a(Object paramObject)
  {
    this.c.a(this.e, paramObject, this.h.c, com.a.a.c.a.c, this.e);
  }
  
  public boolean a()
  {
    boolean bool1 = false;
    while ((this.f == null) || (!c()))
    {
      this.d = (1 + this.d);
      int j = this.d;
      int k = this.a.size();
      bool1 = false;
      if (j >= k) {
        return bool1;
      }
      h localh = (h)this.a.get(this.d);
      c localc = new c(localh, this.b.f());
      this.i = this.b.b().a(localc);
      if (this.i != null)
      {
        this.e = localh;
        this.f = this.b.a(this.i);
        this.g = 0;
      }
    }
    this.h = null;
    label145:
    boolean bool2;
    if ((!bool1) && (c()))
    {
      List localList = this.f;
      int m = this.g;
      this.g = (m + 1);
      this.h = ((n)localList.get(m)).a(this.i, this.b.g(), this.b.h(), this.b.e());
      if ((this.h == null) || (!this.b.a(this.h.c.a()))) {
        break label280;
      }
      bool2 = true;
      this.h.c.a(this.b.d(), this);
    }
    for (;;)
    {
      bool1 = bool2;
      break label145;
      break;
      label280:
      bool2 = bool1;
    }
  }
  
  public void b()
  {
    n.a locala = this.h;
    if (locala != null) {
      locala.c.c();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.b
 * JD-Core Version:    0.7.0.1
 */