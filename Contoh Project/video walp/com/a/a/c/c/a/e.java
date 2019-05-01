package com.a.a.c.c.a;

import com.a.a.c.c.g;
import com.a.a.c.c.n;
import com.a.a.c.c.n.a;
import com.a.a.c.c.o;
import com.a.a.c.c.r;
import com.a.a.c.j;
import java.io.InputStream;
import java.net.URL;

public class e
  implements n<URL, InputStream>
{
  private final n<g, InputStream> a;
  
  public e(n<g, InputStream> paramn)
  {
    this.a = paramn;
  }
  
  public n.a<InputStream> a(URL paramURL, int paramInt1, int paramInt2, j paramj)
  {
    return this.a.a(new g(paramURL), paramInt1, paramInt2, paramj);
  }
  
  public boolean a(URL paramURL)
  {
    return true;
  }
  
  public static class a
    implements o<URL, InputStream>
  {
    public n<URL, InputStream> a(r paramr)
    {
      return new e(paramr.a(g.class, InputStream.class));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.a.e
 * JD-Core Version:    0.7.0.1
 */