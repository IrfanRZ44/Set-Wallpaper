package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class x
  extends Drawable
{
  private float a;
  private final Paint b;
  private final RectF c;
  private final Rect d;
  private float e;
  private boolean f = false;
  private boolean g = true;
  private ColorStateList h;
  private PorterDuffColorFilter i;
  private ColorStateList j;
  private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  
  x(ColorStateList paramColorStateList, float paramFloat)
  {
    this.a = paramFloat;
    this.b = new Paint(5);
    b(paramColorStateList);
    this.c = new RectF();
    this.d = new Rect();
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  private void a(Rect paramRect)
  {
    if (paramRect == null) {
      paramRect = getBounds();
    }
    this.c.set(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    this.d.set(paramRect);
    if (this.f)
    {
      float f1 = y.a(this.e, this.a, this.g);
      float f2 = y.b(this.e, this.a, this.g);
      this.d.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.c.set(this.d);
    }
  }
  
  private void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList == null) {
      paramColorStateList = ColorStateList.valueOf(0);
    }
    this.h = paramColorStateList;
    this.b.setColor(this.h.getColorForState(getState(), this.h.getDefaultColor()));
  }
  
  float a()
  {
    return this.e;
  }
  
  void a(float paramFloat)
  {
    if (paramFloat == this.a) {
      return;
    }
    this.a = paramFloat;
    a(null);
    invalidateSelf();
  }
  
  void a(float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramFloat == this.e) && (this.f == paramBoolean1) && (this.g == paramBoolean2)) {
      return;
    }
    this.e = paramFloat;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    a(null);
    invalidateSelf();
  }
  
  public void a(ColorStateList paramColorStateList)
  {
    b(paramColorStateList);
    invalidateSelf();
  }
  
  public float b()
  {
    return this.a;
  }
  
  public ColorStateList c()
  {
    return this.h;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Paint localPaint = this.b;
    if ((this.i != null) && (localPaint.getColorFilter() == null)) {
      localPaint.setColorFilter(this.i);
    }
    for (int m = 1;; m = 0)
    {
      paramCanvas.drawRoundRect(this.c, this.a, this.a, localPaint);
      if (m != 0) {
        localPaint.setColorFilter(null);
      }
      return;
    }
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(this.d, this.a);
  }
  
  public boolean isStateful()
  {
    return ((this.j != null) && (this.j.isStateful())) || ((this.h != null) && (this.h.isStateful())) || (super.isStateful());
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    a(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    int m = this.h.getColorForState(paramArrayOfInt, this.h.getDefaultColor());
    if (m != this.b.getColor()) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool) {
        this.b.setColor(m);
      }
      if ((this.j == null) || (this.k == null)) {
        break;
      }
      this.i = a(this.j, this.k);
      return true;
    }
    return bool;
  }
  
  public void setAlpha(int paramInt)
  {
    this.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.j = paramColorStateList;
    this.i = a(this.j, this.k);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.k = paramMode;
    this.i = a(this.j, this.k);
    invalidateSelf();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.x
 * JD-Core Version:    0.7.0.1
 */