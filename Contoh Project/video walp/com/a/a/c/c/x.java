package com.a.a.c.c;

import android.net.Uri;
import com.a.a.c.j;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class x<Data>
  implements n<Uri, Data>
{
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "http", "https" })));
  private final n<g, Data> b;
  
  public x(n<g, Data> paramn)
  {
    this.b = paramn;
  }
  
  public n.a<Data> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    g localg = new g(paramUri.toString());
    return this.b.a(localg, paramInt1, paramInt2, paramj);
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
      return new x(paramr.a(g.class, InputStream.class));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.x
 * JD-Core Version:    0.7.0.1
 */