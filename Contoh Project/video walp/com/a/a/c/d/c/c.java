package com.a.a.c.d.c;

import android.graphics.drawable.Drawable;
import com.a.a.c.b.u;

final class c
  extends b<Drawable>
{
  private c(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  static u<Drawable> a(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      return new c(paramDrawable);
    }
    return null;
  }
  
  public Class<Drawable> c()
  {
    return this.a.getClass();
  }
  
  public int e()
  {
    return Math.max(1, 4 * (this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight()));
  }
  
  public void f() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.c.c
 * JD-Core Version:    0.7.0.1
 */