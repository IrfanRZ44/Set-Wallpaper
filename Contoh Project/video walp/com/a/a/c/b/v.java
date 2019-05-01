package com.a.a.c.b;

import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.c.n;
import com.a.a.c.c.n.a;
import com.a.a.c.h;
import com.a.a.c.m;
import java.io.File;
import java.util.List;

class v
  implements d.a<Object>, e
{
  private final e.a a;
  private final f<?> b;
  private int c;
  private int d = -1;
  private h e;
  private List<n<File, ?>> f;
  private int g;
  private volatile n.a<?> h;
  private File i;
  private w j;
  
  v(f<?> paramf, e.a parama)
  {
    this.b = paramf;
    this.a = parama;
  }
  
  private boolean c()
  {
    return this.g < this.f.size();
  }
  
  public void a(Exception paramException)
  {
    this.a.a(this.j, paramException, this.h.c, com.a.a.c.a.d);
  }
  
  public void a(Object paramObject)
  {
    this.a.a(this.e, paramObject, this.h.c, com.a.a.c.a.d, this.j);
  }
  
  public boolean a()
  {
    List localList1 = this.b.o();
    if (localList1.isEmpty())
    {
      bool1 = false;
      return bool1;
    }
    List localList2 = this.b.l();
    if (localList2.isEmpty())
    {
      if (File.class.equals(this.b.j())) {
        return false;
      }
      throw new IllegalStateException("Failed to find any load path from " + this.b.k() + " to " + this.b.j());
    }
    do
    {
      this.d = 0;
      do
      {
        h localh = (h)localList1.get(this.c);
        Class localClass = (Class)localList2.get(this.d);
        m localm = this.b.c(localClass);
        this.j = new w(this.b.i(), localh, this.b.f(), this.b.g(), this.b.h(), localm, localClass, this.b.e());
        this.i = this.b.b().a(this.j);
        if (this.i != null)
        {
          this.e = localh;
          this.f = this.b.a(this.i);
          this.g = 0;
        }
        if ((this.f != null) && (c())) {
          break;
        }
        this.d = (1 + this.d);
      } while (this.d < localList2.size());
      this.c = (1 + this.c);
    } while (this.c < localList1.size());
    return false;
    this.h = null;
    boolean bool1 = false;
    label323:
    boolean bool2;
    if ((!bool1) && (c()))
    {
      List localList3 = this.f;
      int k = this.g;
      this.g = (k + 1);
      this.h = ((n)localList3.get(k)).a(this.i, this.b.g(), this.b.h(), this.b.e());
      if ((this.h == null) || (!this.b.a(this.h.c.a()))) {
        break label460;
      }
      bool2 = true;
      this.h.c.a(this.b.d(), this);
    }
    for (;;)
    {
      bool1 = bool2;
      break label323;
      break;
      label460:
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
 * Qualified Name:     com.a.a.c.b.v
 * JD-Core Version:    0.7.0.1
 */