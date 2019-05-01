package com.a.a.c.c;

import android.util.Base64;
import com.a.a.c.a;
import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.j;
import com.a.a.g;
import com.a.a.h.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class e<Data>
  implements n<String, Data>
{
  private final a<Data> a;
  
  public e(a<Data> parama)
  {
    this.a = parama;
  }
  
  public n.a<Data> a(String paramString, int paramInt1, int paramInt2, j paramj)
  {
    return new n.a(new b(paramString), new b(paramString, this.a));
  }
  
  public boolean a(String paramString)
  {
    return paramString.startsWith("data:image");
  }
  
  public static abstract interface a<Data>
  {
    public abstract Class<Data> a();
    
    public abstract Data a(String paramString);
    
    public abstract void a(Data paramData);
  }
  
  private static final class b<Data>
    implements d<Data>
  {
    private final String a;
    private final e.a<Data> b;
    private Data c;
    
    b(String paramString, e.a<Data> parama)
    {
      this.a = paramString;
      this.b = parama;
    }
    
    public Class<Data> a()
    {
      return this.b.a();
    }
    
    public void a(g paramg, d.a<? super Data> parama)
    {
      try
      {
        this.c = this.b.a(this.a);
        parama.a(this.c);
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        parama.a(localIllegalArgumentException);
      }
    }
    
    public void b()
    {
      try
      {
        this.b.a(this.c);
        return;
      }
      catch (IOException localIOException) {}
    }
    
    public void c() {}
    
    public a d()
    {
      return a.a;
    }
  }
  
  public static final class c
    implements o<String, InputStream>
  {
    private final e.a<InputStream> a = new e.a()
    {
      public Class<InputStream> a()
      {
        return InputStream.class;
      }
      
      public void a(InputStream paramAnonymousInputStream)
      {
        paramAnonymousInputStream.close();
      }
      
      public InputStream b(String paramAnonymousString)
      {
        if (!paramAnonymousString.startsWith("data:image")) {
          throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int i = paramAnonymousString.indexOf(',');
        if (i == -1) {
          throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (!paramAnonymousString.substring(0, i).endsWith(";base64")) {
          throw new IllegalArgumentException("Not a base64 image data URL.");
        }
        return new ByteArrayInputStream(Base64.decode(paramAnonymousString.substring(i + 1), 0));
      }
    };
    
    public n<String, InputStream> a(r paramr)
    {
      return new e(this.a);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.e
 * JD-Core Version:    0.7.0.1
 */