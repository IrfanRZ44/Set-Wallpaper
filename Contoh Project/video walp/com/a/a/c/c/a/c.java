package com.a.a.c.c.a;

import android.content.Context;
import android.net.Uri;
import com.a.a.c.c.n;
import com.a.a.c.c.n.a;
import com.a.a.c.c.o;
import com.a.a.c.c.r;
import com.a.a.c.j;
import java.io.InputStream;

public class c
  implements n<Uri, InputStream>
{
  private final Context a;
  
  public c(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  public n.a<InputStream> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    if (com.a.a.c.a.a.b.a(paramInt1, paramInt2)) {
      return new n.a(new com.a.a.h.b(paramUri), com.a.a.c.a.a.c.a(this.a, paramUri));
    }
    return null;
  }
  
  public boolean a(Uri paramUri)
  {
    return com.a.a.c.a.a.b.c(paramUri);
  }
  
  public static class a
    implements o<Uri, InputStream>
  {
    private final Context a;
    
    public a(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public n<Uri, InputStream> a(r paramr)
    {
      return new c(this.a);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.a.c
 * JD-Core Version:    0.7.0.1
 */