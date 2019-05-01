package com.a.a.c.d.a;

import android.graphics.Bitmap;
import com.a.a.c.j;
import com.a.a.c.k;
import com.a.a.i.i;

public final class u
  implements k<Bitmap, Bitmap>
{
  public com.a.a.c.b.u<Bitmap> a(Bitmap paramBitmap, int paramInt1, int paramInt2, j paramj)
  {
    return new a(paramBitmap);
  }
  
  public boolean a(Bitmap paramBitmap, j paramj)
  {
    return true;
  }
  
  private static final class a
    implements com.a.a.c.b.u<Bitmap>
  {
    private final Bitmap a;
    
    a(Bitmap paramBitmap)
    {
      this.a = paramBitmap;
    }
    
    public Bitmap a()
    {
      return this.a;
    }
    
    public Class<Bitmap> c()
    {
      return Bitmap.class;
    }
    
    public int e()
    {
      return i.a(this.a);
    }
    
    public void f() {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.u
 * JD-Core Version:    0.7.0.1
 */