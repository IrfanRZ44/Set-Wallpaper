package com.a.a.c.b;

import com.a.a.c.j;
import java.security.MessageDigest;
import java.util.Map;

class m
  implements com.a.a.c.h
{
  private final Object b;
  private final int c;
  private final int d;
  private final Class<?> e;
  private final Class<?> f;
  private final com.a.a.c.h g;
  private final Map<Class<?>, com.a.a.c.m<?>> h;
  private final j i;
  private int j;
  
  m(Object paramObject, com.a.a.c.h paramh, int paramInt1, int paramInt2, Map<Class<?>, com.a.a.c.m<?>> paramMap, Class<?> paramClass1, Class<?> paramClass2, j paramj)
  {
    this.b = com.a.a.i.h.a(paramObject);
    this.g = ((com.a.a.c.h)com.a.a.i.h.a(paramh, "Signature must not be null"));
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = ((Map)com.a.a.i.h.a(paramMap));
    this.e = ((Class)com.a.a.i.h.a(paramClass1, "Resource class must not be null"));
    this.f = ((Class)com.a.a.i.h.a(paramClass2, "Transcode class must not be null"));
    this.i = ((j)com.a.a.i.h.a(paramj));
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof m;
    boolean bool2 = false;
    if (bool1)
    {
      m localm = (m)paramObject;
      boolean bool3 = this.b.equals(localm.b);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.g.equals(localm.g);
        bool2 = false;
        if (bool4)
        {
          int k = this.d;
          int m = localm.d;
          bool2 = false;
          if (k == m)
          {
            int n = this.c;
            int i1 = localm.c;
            bool2 = false;
            if (n == i1)
            {
              boolean bool5 = this.h.equals(localm.h);
              bool2 = false;
              if (bool5)
              {
                boolean bool6 = this.e.equals(localm.e);
                bool2 = false;
                if (bool6)
                {
                  boolean bool7 = this.f.equals(localm.f);
                  bool2 = false;
                  if (bool7)
                  {
                    boolean bool8 = this.i.equals(localm.i);
                    bool2 = false;
                    if (bool8) {
                      bool2 = true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    if (this.j == 0)
    {
      this.j = this.b.hashCode();
      this.j = (31 * this.j + this.g.hashCode());
      this.j = (31 * this.j + this.c);
      this.j = (31 * this.j + this.d);
      this.j = (31 * this.j + this.h.hashCode());
      this.j = (31 * this.j + this.e.hashCode());
      this.j = (31 * this.j + this.f.hashCode());
      this.j = (31 * this.j + this.i.hashCode());
    }
    return this.j;
  }
  
  public String toString()
  {
    return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.m
 * JD-Core Version:    0.7.0.1
 */