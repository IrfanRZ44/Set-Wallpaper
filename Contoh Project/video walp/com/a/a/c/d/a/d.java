package com.a.a.c.d.a;

import android.graphics.Bitmap;
import com.a.a.c.b.a.e;
import com.a.a.c.b.q;
import com.a.a.c.b.u;
import com.a.a.i.h;
import com.a.a.i.i;

public class d
  implements q, u<Bitmap>
{
  private final Bitmap a;
  private final e b;
  
  public d(Bitmap paramBitmap, e parame)
  {
    this.a = ((Bitmap)h.a(paramBitmap, "Bitmap must not be null"));
    this.b = ((e)h.a(parame, "BitmapPool must not be null"));
  }
  
  public static d a(Bitmap paramBitmap, e parame)
  {
    if (paramBitmap == null) {
      return null;
    }
    return new d(paramBitmap, parame);
  }
  
  public void a()
  {
    this.a.prepareToDraw();
  }
  
  public Bitmap b()
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
  
  public void f()
  {
    this.b.a(this.a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.d
 * JD-Core Version:    0.7.0.1
 */