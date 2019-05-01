package com.a.a.c.c.a;

import com.a.a.c.c.g;
import com.a.a.c.c.m;
import com.a.a.c.c.n;
import com.a.a.c.c.n.a;
import com.a.a.c.c.o;
import com.a.a.c.c.r;
import com.a.a.c.i;
import java.io.InputStream;

public class a
  implements n<g, InputStream>
{
  public static final i<Integer> a = i.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
  private final m<g, g> b;
  
  public a()
  {
    this(null);
  }
  
  public a(m<g, g> paramm)
  {
    this.b = paramm;
  }
  
  public n.a<InputStream> a(g paramg, int paramInt1, int paramInt2, com.a.a.c.j paramj)
  {
    g localg;
    if (this.b != null)
    {
      localg = (g)this.b.a(paramg, 0, 0);
      if (localg != null) {
        break label69;
      }
      this.b.a(paramg, 0, 0, paramg);
    }
    for (;;)
    {
      return new n.a(paramg, new com.a.a.c.a.j(paramg, ((Integer)paramj.a(a)).intValue()));
      label69:
      paramg = localg;
    }
  }
  
  public boolean a(g paramg)
  {
    return true;
  }
  
  public static class a
    implements o<g, InputStream>
  {
    private final m<g, g> a = new m(500L);
    
    public n<g, InputStream> a(r paramr)
    {
      return new a(this.a);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.a.a
 * JD-Core Version:    0.7.0.1
 */