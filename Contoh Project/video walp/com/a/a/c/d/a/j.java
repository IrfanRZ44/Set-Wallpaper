package com.a.a.c.d.a;

public abstract class j
{
  public static final j a = new e();
  public static final j b = new d();
  public static final j c = new a();
  public static final j d = new b();
  public static final j e = new c();
  public static final j f = new f();
  public static final j g = b;
  
  public abstract float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract g b(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private static class a
    extends j
  {
    public float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int i = Math.min(paramInt2 / paramInt4, paramInt1 / paramInt3);
      if (i == 0) {
        return 1.0F;
      }
      return 1.0F / Integer.highestOneBit(i);
    }
    
    public j.g b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return j.g.b;
    }
  }
  
  private static class b
    extends j
  {
    public float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int i = 1;
      int j = (int)Math.ceil(Math.max(paramInt2 / paramInt4, paramInt1 / paramInt3));
      int k = Math.max(i, Integer.highestOneBit(j));
      if (k < j) {}
      for (;;)
      {
        return 1.0F / (k << i);
        i = 0;
      }
    }
    
    public j.g b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return j.g.a;
    }
  }
  
  private static class c
    extends j
  {
    public float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Math.min(1.0F, a.a(paramInt1, paramInt2, paramInt3, paramInt4));
    }
    
    public j.g b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return j.g.b;
    }
  }
  
  private static class d
    extends j
  {
    public float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Math.max(paramInt3 / paramInt1, paramInt4 / paramInt2);
    }
    
    public j.g b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return j.g.b;
    }
  }
  
  private static class e
    extends j
  {
    public float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Math.min(paramInt3 / paramInt1, paramInt4 / paramInt2);
    }
    
    public j.g b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return j.g.b;
    }
  }
  
  private static class f
    extends j
  {
    public float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return 1.0F;
    }
    
    public j.g b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return j.g.b;
    }
  }
  
  public static enum g
  {
    static
    {
      g[] arrayOfg = new g[2];
      arrayOfg[0] = a;
      arrayOfg[1] = b;
      c = arrayOfg;
    }
    
    private g() {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.j
 * JD-Core Version:    0.7.0.1
 */