package com.a.a.c;

import java.security.MessageDigest;

public final class i<T>
{
  private static final a<Object> a = new a()
  {
    public void a(byte[] paramAnonymousArrayOfByte, Object paramAnonymousObject, MessageDigest paramAnonymousMessageDigest) {}
  };
  private final T b;
  private final a<T> c;
  private final String d;
  private volatile byte[] e;
  
  private i(String paramString, T paramT, a<T> parama)
  {
    this.d = com.a.a.i.h.a(paramString);
    this.b = paramT;
    this.c = ((a)com.a.a.i.h.a(parama));
  }
  
  public static <T> i<T> a(String paramString)
  {
    return new i(paramString, null, c());
  }
  
  public static <T> i<T> a(String paramString, T paramT)
  {
    return new i(paramString, paramT, c());
  }
  
  public static <T> i<T> a(String paramString, T paramT, a<T> parama)
  {
    return new i(paramString, paramT, parama);
  }
  
  private byte[] b()
  {
    if (this.e == null) {
      this.e = this.d.getBytes(h.a);
    }
    return this.e;
  }
  
  private static <T> a<T> c()
  {
    return a;
  }
  
  public T a()
  {
    return this.b;
  }
  
  public void a(T paramT, MessageDigest paramMessageDigest)
  {
    this.c.a(b(), paramT, paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof i))
    {
      i locali = (i)paramObject;
      return this.d.equals(locali.d);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.d.hashCode();
  }
  
  public String toString()
  {
    return "Option{key='" + this.d + '\'' + '}';
  }
  
  public static abstract interface a<T>
  {
    public abstract void a(byte[] paramArrayOfByte, T paramT, MessageDigest paramMessageDigest);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.i
 * JD-Core Version:    0.7.0.1
 */