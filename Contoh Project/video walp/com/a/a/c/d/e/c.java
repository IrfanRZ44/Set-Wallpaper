package com.a.a.c.d.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.a.a.b.a;
import com.a.a.c.m;
import com.a.a.i.h;
import java.nio.ByteBuffer;

public class c
  extends Drawable
  implements Animatable, g.b
{
  private final a a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e = true;
  private int f;
  private int g = -1;
  private boolean h;
  private Paint i;
  private Rect j;
  
  public c(Context paramContext, a parama, m<Bitmap> paramm, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    this(new a(new g(com.a.a.c.a(paramContext), parama, paramInt1, paramInt2, paramm, paramBitmap)));
  }
  
  c(a parama)
  {
    this.a = ((a)h.a(parama));
  }
  
  private void h()
  {
    this.f = 0;
  }
  
  private void i()
  {
    boolean bool;
    if (!this.d)
    {
      bool = true;
      h.a(bool, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
      if (this.a.a.g() != 1) {
        break label39;
      }
      invalidateSelf();
    }
    label39:
    while (this.b)
    {
      return;
      bool = false;
      break;
    }
    this.b = true;
    this.a.a.a(this);
    invalidateSelf();
  }
  
  private void j()
  {
    this.b = false;
    this.a.a.b(this);
  }
  
  private Rect k()
  {
    if (this.j == null) {
      this.j = new Rect();
    }
    return this.j;
  }
  
  private Paint l()
  {
    if (this.i == null) {
      this.i = new Paint(2);
    }
    return this.i;
  }
  
  private Drawable.Callback m()
  {
    for (Drawable.Callback localCallback = getCallback(); (localCallback instanceof Drawable); localCallback = ((Drawable)localCallback).getCallback()) {}
    return localCallback;
  }
  
  public int a()
  {
    return this.a.a.d();
  }
  
  public void a(m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this.a.a.a(paramm, paramBitmap);
  }
  
  public Bitmap b()
  {
    return this.a.a.a();
  }
  
  public ByteBuffer c()
  {
    return this.a.a.f();
  }
  
  public int d()
  {
    return this.a.a.g();
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.d) {
      return;
    }
    if (this.h)
    {
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), k());
      this.h = false;
    }
    paramCanvas.drawBitmap(this.a.a.i(), null, k(), l());
  }
  
  public int e()
  {
    return this.a.a.e();
  }
  
  public void f()
  {
    if (m() == null)
    {
      stop();
      invalidateSelf();
    }
    do
    {
      return;
      invalidateSelf();
      if (e() == -1 + d()) {
        this.f = (1 + this.f);
      }
    } while ((this.g == -1) || (this.f < this.g));
    stop();
  }
  
  public void g()
  {
    this.d = true;
    this.a.a.h();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.a;
  }
  
  public int getIntrinsicHeight()
  {
    return this.a.a.c();
  }
  
  public int getIntrinsicWidth()
  {
    return this.a.a.b();
  }
  
  public int getOpacity()
  {
    return -2;
  }
  
  public boolean isRunning()
  {
    return this.b;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.h = true;
  }
  
  public void setAlpha(int paramInt)
  {
    l().setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    l().setColorFilter(paramColorFilter);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool;
    if (!this.d)
    {
      bool = true;
      h.a(bool, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
      this.e = paramBoolean1;
      if (paramBoolean1) {
        break label40;
      }
      j();
    }
    for (;;)
    {
      return super.setVisible(paramBoolean1, paramBoolean2);
      bool = false;
      break;
      label40:
      if (this.c) {
        i();
      }
    }
  }
  
  public void start()
  {
    this.c = true;
    h();
    if (this.e) {
      i();
    }
  }
  
  public void stop()
  {
    this.c = false;
    j();
  }
  
  static final class a
    extends Drawable.ConstantState
  {
    final g a;
    
    a(g paramg)
    {
      this.a = paramg;
    }
    
    public int getChangingConfigurations()
    {
      return 0;
    }
    
    public Drawable newDrawable()
    {
      return new c(this);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return newDrawable();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.e.c
 * JD-Core Version:    0.7.0.1
 */