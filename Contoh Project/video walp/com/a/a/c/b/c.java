package com.a.a.c.b;

import com.a.a.c.h;
import java.security.MessageDigest;

final class c
  implements h
{
  private final h b;
  private final h c;
  
  c(h paramh1, h paramh2)
  {
    this.b = paramh1;
    this.c = paramh2;
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    this.b.a(paramMessageDigest);
    this.c.a(paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = false;
    if (bool1)
    {
      c localc = (c)paramObject;
      boolean bool3 = this.b.equals(localc.b);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.c.equals(localc.c);
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
    return 31 * this.b.hashCode() + this.c.hashCode();
  }
  
  public String toString()
  {
    return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.c
 * JD-Core Version:    0.7.0.1
 */