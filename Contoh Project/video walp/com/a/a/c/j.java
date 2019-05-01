package com.a.a.c;

import android.support.v4.f.a;
import java.security.MessageDigest;

public final class j
  implements h
{
  private final a<i<?>, Object> b = new a();
  
  private static <T> void a(i<T> parami, Object paramObject, MessageDigest paramMessageDigest)
  {
    parami.a(paramObject, paramMessageDigest);
  }
  
  public <T> j a(i<T> parami, T paramT)
  {
    this.b.put(parami, paramT);
    return this;
  }
  
  public <T> T a(i<T> parami)
  {
    if (this.b.containsKey(parami)) {
      return this.b.get(parami);
    }
    return parami.a();
  }
  
  public void a(j paramj)
  {
    this.b.a(paramj.b);
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    for (int i = 0; i < this.b.size(); i++) {
      a((i)this.b.b(i), this.b.c(i), paramMessageDigest);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof j))
    {
      j localj = (j)paramObject;
      return this.b.equals(localj.b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public String toString()
  {
    return "Options{values=" + this.b + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.j
 * JD-Core Version:    0.7.0.1
 */