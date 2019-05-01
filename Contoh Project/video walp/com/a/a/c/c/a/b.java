package com.a.a.c.c.a;

import android.net.Uri;
import com.a.a.c.c.g;
import com.a.a.c.c.n;
import com.a.a.c.c.n.a;
import com.a.a.c.c.o;
import com.a.a.c.c.r;
import com.a.a.c.j;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class b
  implements n<Uri, InputStream>
{
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "http", "https" })));
  private final n<g, InputStream> b;
  
  public b(n<g, InputStream> paramn)
  {
    this.b = paramn;
  }
  
  public n.a<InputStream> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    return this.b.a(new g(paramUri.toString()), paramInt1, paramInt2, paramj);
  }
  
  public boolean a(Uri paramUri)
  {
    return a.contains(paramUri.getScheme());
  }
  
  public static class a
    implements o<Uri, InputStream>
  {
    public n<Uri, InputStream> a(r paramr)
    {
      return new b(paramr.a(g.class, InputStream.class));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.a.b
 * JD-Core Version:    0.7.0.1
 */