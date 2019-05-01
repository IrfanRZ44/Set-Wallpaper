package com.a.a.c.b.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.a.a.i.i;

class c
  implements l
{
  private final b a = new b();
  private final h<a, Bitmap> b = new h();
  
  static String c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return "[" + paramInt1 + "x" + paramInt2 + "], " + paramConfig;
  }
  
  private static String d(Bitmap paramBitmap)
  {
    return c(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
  }
  
  public Bitmap a()
  {
    return (Bitmap)this.b.a();
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    a locala = this.a.a(paramInt1, paramInt2, paramConfig);
    return (Bitmap)this.b.a(locala);
  }
  
  public void a(Bitmap paramBitmap)
  {
    a locala = this.a.a(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
    this.b.a(locala, paramBitmap);
  }
  
  public String b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return c(paramInt1, paramInt2, paramConfig);
  }
  
  public String b(Bitmap paramBitmap)
  {
    return d(paramBitmap);
  }
  
  public int c(Bitmap paramBitmap)
  {
    return i.a(paramBitmap);
  }
  
  public String toString()
  {
    return "AttributeStrategy:\n  " + this.b;
  }
  
  static class a
    implements m
  {
    private final c.b a;
    private int b;
    private int c;
    private Bitmap.Config d;
    
    public a(c.b paramb)
    {
      this.a = paramb;
    }
    
    public void a()
    {
      this.a.a(this);
    }
    
    public void a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
    {
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramConfig;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (bool1)
      {
        a locala = (a)paramObject;
        int i = this.b;
        int j = locala.b;
        bool2 = false;
        if (i == j)
        {
          int k = this.c;
          int m = locala.c;
          bool2 = false;
          if (k == m)
          {
            Bitmap.Config localConfig1 = this.d;
            Bitmap.Config localConfig2 = locala.d;
            bool2 = false;
            if (localConfig1 == localConfig2) {
              bool2 = true;
            }
          }
        }
      }
      return bool2;
    }
    
    public int hashCode()
    {
      int i = 31 * (31 * this.b + this.c);
      if (this.d != null) {}
      for (int j = this.d.hashCode();; j = 0) {
        return j + i;
      }
    }
    
    public String toString()
    {
      return c.c(this.b, this.c, this.d);
    }
  }
  
  static class b
    extends d<c.a>
  {
    protected c.a a()
    {
      return new c.a(this);
    }
    
    c.a a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
    {
      c.a locala = (c.a)c();
      locala.a(paramInt1, paramInt2, paramConfig);
      return locala;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a.c
 * JD-Core Version:    0.7.0.1
 */