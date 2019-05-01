package com.a.a.c.d.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.a.a.c.b.q;
import com.a.a.c.b.u;
import com.a.a.c.d.e.c;
import com.a.a.i.h;

public abstract class b<T extends Drawable>
  implements q, u<T>
{
  protected final T a;
  
  public b(T paramT)
  {
    this.a = ((Drawable)h.a(paramT));
  }
  
  public void a()
  {
    if ((this.a instanceof BitmapDrawable)) {
      ((BitmapDrawable)this.a).getBitmap().prepareToDraw();
    }
    while (!(this.a instanceof c)) {
      return;
    }
    ((c)this.a).b().prepareToDraw();
  }
  
  public final T b()
  {
    Drawable.ConstantState localConstantState = this.a.getConstantState();
    if (localConstantState == null) {
      return this.a;
    }
    return localConstantState.newDrawable();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.c.b
 * JD-Core Version:    0.7.0.1
 */