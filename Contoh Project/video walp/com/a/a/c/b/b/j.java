package com.a.a.c.b.b;

import android.support.v4.f.k.a;
import com.a.a.i.a.a;
import com.a.a.i.a.a.a;
import com.a.a.i.a.a.c;
import com.a.a.i.a.b;
import com.a.a.i.e;
import com.a.a.i.i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class j
{
  private final e<com.a.a.c.h, String> a = new e(1000L);
  private final k.a<a> b = a.b(10, new a.a()
  {
    public j.a a()
    {
      try
      {
        j.a locala = new j.a(MessageDigest.getInstance("SHA-256"));
        return locala;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new RuntimeException(localNoSuchAlgorithmException);
      }
    }
  });
  
  private String b(com.a.a.c.h paramh)
  {
    a locala = (a)com.a.a.i.h.a(this.b.a());
    try
    {
      paramh.a(locala.a);
      String str = i.a(locala.a.digest());
      return str;
    }
    finally
    {
      this.b.a(locala);
    }
  }
  
  public String a(com.a.a.c.h paramh)
  {
    String str;
    synchronized (this.a)
    {
      str = (String)this.a.b(paramh);
      if (str == null) {
        str = b(paramh);
      }
    }
    synchronized (this.a)
    {
      this.a.b(paramh, str);
      return str;
      localObject1 = finally;
      throw localObject1;
    }
  }
  
  private static final class a
    implements a.c
  {
    final MessageDigest a;
    private final b b = b.a();
    
    a(MessageDigest paramMessageDigest)
    {
      this.a = paramMessageDigest;
    }
    
    public b a_()
    {
      return this.b;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.b.j
 * JD-Core Version:    0.7.0.1
 */