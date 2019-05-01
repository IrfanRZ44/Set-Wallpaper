package com.a.a.c.b;

import com.a.a.c.b.a.b;
import com.a.a.c.h;
import com.a.a.c.j;
import com.a.a.c.m;
import com.a.a.i.e;
import com.a.a.i.i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class w
  implements h
{
  private static final e<Class<?>, byte[]> b = new e(50L);
  private final b c;
  private final h d;
  private final h e;
  private final int f;
  private final int g;
  private final Class<?> h;
  private final j i;
  private final m<?> j;
  
  w(b paramb, h paramh1, h paramh2, int paramInt1, int paramInt2, m<?> paramm, Class<?> paramClass, j paramj)
  {
    this.c = paramb;
    this.d = paramh1;
    this.e = paramh2;
    this.f = paramInt1;
    this.g = paramInt2;
    this.j = paramm;
    this.h = paramClass;
    this.i = paramj;
  }
  
  private byte[] a()
  {
    byte[] arrayOfByte = (byte[])b.b(this.h);
    if (arrayOfByte == null)
    {
      arrayOfByte = this.h.getName().getBytes(a);
      b.b(this.h, arrayOfByte);
    }
    return arrayOfByte;
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    byte[] arrayOfByte = (byte[])this.c.b(8, [B.class);
    ByteBuffer.wrap(arrayOfByte).putInt(this.f).putInt(this.g).array();
    this.e.a(paramMessageDigest);
    this.d.a(paramMessageDigest);
    paramMessageDigest.update(arrayOfByte);
    if (this.j != null) {
      this.j.a(paramMessageDigest);
    }
    this.i.a(paramMessageDigest);
    paramMessageDigest.update(a());
    this.c.a(arrayOfByte);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof w;
    boolean bool2 = false;
    if (bool1)
    {
      w localw = (w)paramObject;
      int k = this.g;
      int m = localw.g;
      bool2 = false;
      if (k == m)
      {
        int n = this.f;
        int i1 = localw.f;
        bool2 = false;
        if (n == i1)
        {
          boolean bool3 = i.a(this.j, localw.j);
          bool2 = false;
          if (bool3)
          {
            boolean bool4 = this.h.equals(localw.h);
            bool2 = false;
            if (bool4)
            {
              boolean bool5 = this.d.equals(localw.d);
              bool2 = false;
              if (bool5)
              {
                boolean bool6 = this.e.equals(localw.e);
                bool2 = false;
                if (bool6)
                {
                  boolean bool7 = this.i.equals(localw.i);
                  bool2 = false;
                  if (bool7) {
                    bool2 = true;
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
    int k = 31 * (31 * (31 * this.d.hashCode() + this.e.hashCode()) + this.f) + this.g;
    if (this.j != null) {
      k = k * 31 + this.j.hashCode();
    }
    return 31 * (k * 31 + this.h.hashCode()) + this.i.hashCode();
  }
  
  public String toString()
  {
    return "ResourceCacheKey{sourceKey=" + this.d + ", signature=" + this.e + ", width=" + this.f + ", height=" + this.g + ", decodedResourceClass=" + this.h + ", transformation='" + this.j + '\'' + ", options=" + this.i + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.w
 * JD-Core Version:    0.7.0.1
 */