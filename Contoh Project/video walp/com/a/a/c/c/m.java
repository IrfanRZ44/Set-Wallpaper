package com.a.a.c.c;

import com.a.a.i.e;
import com.a.a.i.i;
import java.util.Queue;

public class m<A, B>
{
  private final e<a<A>, B> a;
  
  public m()
  {
    this(250L);
  }
  
  public m(long paramLong)
  {
    this.a = new e(paramLong)
    {
      protected void a(m.a<A> paramAnonymousa, B paramAnonymousB)
      {
        paramAnonymousa.a();
      }
    };
  }
  
  public B a(A paramA, int paramInt1, int paramInt2)
  {
    a locala = a.a(paramA, paramInt1, paramInt2);
    Object localObject = this.a.b(locala);
    locala.a();
    return localObject;
  }
  
  public void a(A paramA, int paramInt1, int paramInt2, B paramB)
  {
    a locala = a.a(paramA, paramInt1, paramInt2);
    this.a.b(locala, paramB);
  }
  
  static final class a<A>
  {
    private static final Queue<a<?>> a = i.a(0);
    private int b;
    private int c;
    private A d;
    
    static <A> a<A> a(A paramA, int paramInt1, int paramInt2)
    {
      synchronized (a)
      {
        a locala = (a)a.poll();
        if (locala == null) {
          locala = new a();
        }
        locala.b(paramA, paramInt1, paramInt2);
        return locala;
      }
    }
    
    private void b(A paramA, int paramInt1, int paramInt2)
    {
      this.d = paramA;
      this.c = paramInt1;
      this.b = paramInt2;
    }
    
    public void a()
    {
      synchronized (a)
      {
        a.offer(this);
        return;
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (bool1)
      {
        a locala = (a)paramObject;
        int i = this.c;
        int j = locala.c;
        bool2 = false;
        if (i == j)
        {
          int k = this.b;
          int m = locala.b;
          bool2 = false;
          if (k == m)
          {
            boolean bool3 = this.d.equals(locala.d);
            bool2 = false;
            if (bool3) {
              bool2 = true;
            }
          }
        }
      }
      return bool2;
    }
    
    public int hashCode()
    {
      return 31 * (31 * this.b + this.c) + this.d.hashCode();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.m
 * JD-Core Version:    0.7.0.1
 */