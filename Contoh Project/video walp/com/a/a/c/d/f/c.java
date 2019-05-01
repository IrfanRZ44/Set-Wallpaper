package com.a.a.c.d.f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.a.a.c.b.u;
import com.a.a.c.d.a.d;
import com.a.a.c.j;

public final class c
  implements e<Drawable, byte[]>
{
  private final com.a.a.c.b.a.e a;
  private final e<Bitmap, byte[]> b;
  private final e<com.a.a.c.d.e.c, byte[]> c;
  
  public c(com.a.a.c.b.a.e parame, e<Bitmap, byte[]> parame1, e<com.a.a.c.d.e.c, byte[]> parame2)
  {
    this.a = parame;
    this.b = parame1;
    this.c = parame2;
  }
  
  private static u<com.a.a.c.d.e.c> a(u<Drawable> paramu)
  {
    return paramu;
  }
  
  public u<byte[]> a(u<Drawable> paramu, j paramj)
  {
    Drawable localDrawable = (Drawable)paramu.d();
    if ((localDrawable instanceof BitmapDrawable)) {
      return this.b.a(d.a(((BitmapDrawable)localDrawable).getBitmap(), this.a), paramj);
    }
    if ((localDrawable instanceof com.a.a.c.d.e.c)) {
      return this.c.a(a(paramu), paramj);
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.f.c
 * JD-Core Version:    0.7.0.1
 */