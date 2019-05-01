package com.a.a.h;

import java.security.MessageDigest;

public final class b
  implements com.a.a.c.h
{
  private final Object b;
  
  public b(Object paramObject)
  {
    this.b = com.a.a.i.h.a(paramObject);
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(this.b.toString().getBytes(a));
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof b))
    {
      b localb = (b)paramObject;
      return this.b.equals(localb.b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public String toString()
  {
    return "ObjectKey{object=" + this.b + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.h.b
 * JD-Core Version:    0.7.0.1
 */