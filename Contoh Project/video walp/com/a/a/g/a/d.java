package com.a.a.g.a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.a.a.g.b.b;
import com.a.a.g.b.b.a;

public abstract class d<Z>
  extends i<ImageView, Z>
  implements b.a
{
  private Animatable b;
  
  public d(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  private void b(Z paramZ)
  {
    a(paramZ);
    c(paramZ);
  }
  
  private void c(Z paramZ)
  {
    if ((paramZ instanceof Animatable))
    {
      this.b = ((Animatable)paramZ);
      this.b.start();
      return;
    }
    this.b = null;
  }
  
  public void a(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    if (this.b != null) {
      this.b.stop();
    }
    b(null);
    e(paramDrawable);
  }
  
  protected abstract void a(Z paramZ);
  
  public void a(Z paramZ, b<? super Z> paramb)
  {
    if ((paramb == null) || (!paramb.a(paramZ, this)))
    {
      b(paramZ);
      return;
    }
    c(paramZ);
  }
  
  public void b(Drawable paramDrawable)
  {
    super.b(paramDrawable);
    b(null);
    e(paramDrawable);
  }
  
  public void c()
  {
    if (this.b != null) {
      this.b.start();
    }
  }
  
  public void c(Drawable paramDrawable)
  {
    super.c(paramDrawable);
    b(null);
    e(paramDrawable);
  }
  
  public void d()
  {
    if (this.b != null) {
      this.b.stop();
    }
  }
  
  public void e(Drawable paramDrawable)
  {
    ((ImageView)this.a).setImageDrawable(paramDrawable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.g.a.d
 * JD-Core Version:    0.7.0.1
 */