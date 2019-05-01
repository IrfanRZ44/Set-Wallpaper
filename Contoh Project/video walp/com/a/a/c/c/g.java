package com.a.a.c.c;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class g
  implements com.a.a.c.h
{
  private final h b;
  private final URL c;
  private final String d;
  private String e;
  private URL f;
  private volatile byte[] g;
  private int h;
  
  public g(String paramString)
  {
    this(paramString, h.b);
  }
  
  public g(String paramString, h paramh)
  {
    this.c = null;
    this.d = com.a.a.i.h.a(paramString);
    this.b = ((h)com.a.a.i.h.a(paramh));
  }
  
  public g(URL paramURL)
  {
    this(paramURL, h.b);
  }
  
  public g(URL paramURL, h paramh)
  {
    this.c = ((URL)com.a.a.i.h.a(paramURL));
    this.d = null;
    this.b = ((h)com.a.a.i.h.a(paramh));
  }
  
  private URL d()
  {
    if (this.f == null) {
      this.f = new URL(e());
    }
    return this.f;
  }
  
  private String e()
  {
    if (TextUtils.isEmpty(this.e))
    {
      String str = this.d;
      if (TextUtils.isEmpty(str)) {
        str = ((URL)com.a.a.i.h.a(this.c)).toString();
      }
      this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
    }
    return this.e;
  }
  
  private byte[] f()
  {
    if (this.g == null) {
      this.g = c().getBytes(a);
    }
    return this.g;
  }
  
  public URL a()
  {
    return d();
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(f());
  }
  
  public Map<String, String> b()
  {
    return this.b.a();
  }
  
  public String c()
  {
    if (this.d != null) {
      return this.d;
    }
    return ((URL)com.a.a.i.h.a(this.c)).toString();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof g;
    boolean bool2 = false;
    if (bool1)
    {
      g localg = (g)paramObject;
      boolean bool3 = c().equals(localg.c());
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.b.equals(localg.b);
        bool2 = false;
        if (bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    if (this.h == 0)
    {
      this.h = c().hashCode();
      this.h = (31 * this.h + this.b.hashCode());
    }
    return this.h;
  }
  
  public String toString()
  {
    return c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.g
 * JD-Core Version:    0.7.0.1
 */