package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a.b;
import android.support.v7.b.a.c;

class y
  extends Drawable
{
  static a a;
  private static final double b = Math.cos(Math.toRadians(45.0D));
  private final int c;
  private Paint d;
  private Paint e;
  private Paint f;
  private final RectF g;
  private float h;
  private Path i;
  private float j;
  private float k;
  private float l;
  private ColorStateList m;
  private boolean n = true;
  private final int o;
  private final int p;
  private boolean q = true;
  private boolean r = false;
  
  y(Resources paramResources, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.o = paramResources.getColor(a.b.cardview_shadow_start_color);
    this.p = paramResources.getColor(a.b.cardview_shadow_end_color);
    this.c = paramResources.getDimensionPixelSize(a.c.cardview_compat_inset_shadow);
    this.d = new Paint(5);
    b(paramColorStateList);
    this.e = new Paint(5);
    this.e.setStyle(Paint.Style.FILL);
    this.h = ((int)(0.5F + paramFloat1));
    this.g = new RectF();
    this.f = new Paint(this.e);
    this.f.setAntiAlias(false);
    a(paramFloat2, paramFloat3);
  }
  
  static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (float)(1.5F * paramFloat1 + (1.0D - b) * paramFloat2);
    }
    return 1.5F * paramFloat1;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 < 0.0F) {
      throw new IllegalArgumentException("Invalid shadow size " + paramFloat1 + ". Must be >= 0");
    }
    if (paramFloat2 < 0.0F) {
      throw new IllegalArgumentException("Invalid max shadow size " + paramFloat2 + ". Must be >= 0");
    }
    float f1 = d(paramFloat1);
    float f2 = d(paramFloat2);
    if (f1 > f2)
    {
      if (!this.r) {
        this.r = true;
      }
      f1 = f2;
    }
    if ((this.l == f1) && (this.j == f2)) {
      return;
    }
    this.l = f1;
    this.j = f2;
    this.k = ((int)(0.5F + (f1 * 1.5F + this.c)));
    this.n = true;
    invalidateSelf();
  }
  
  private void a(Canvas paramCanvas)
  {
    float f1 = -this.h - this.k;
    float f2 = this.h + this.c + this.l / 2.0F;
    int i1;
    if (this.g.width() - 2.0F * f2 > 0.0F)
    {
      i1 = 1;
      if (this.g.height() - 2.0F * f2 <= 0.0F) {
        break label405;
      }
    }
    label405:
    for (int i2 = 1;; i2 = 0)
    {
      int i3 = paramCanvas.save();
      paramCanvas.translate(f2 + this.g.left, f2 + this.g.top);
      paramCanvas.drawPath(this.i, this.e);
      if (i1 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.g.width() - 2.0F * f2, -this.h, this.f);
      }
      paramCanvas.restoreToCount(i3);
      int i4 = paramCanvas.save();
      paramCanvas.translate(this.g.right - f2, this.g.bottom - f2);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.i, this.e);
      if (i1 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.g.width() - 2.0F * f2, -this.h + this.k, this.f);
      }
      paramCanvas.restoreToCount(i4);
      int i5 = paramCanvas.save();
      paramCanvas.translate(f2 + this.g.left, this.g.bottom - f2);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.i, this.e);
      if (i2 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.g.height() - 2.0F * f2, -this.h, this.f);
      }
      paramCanvas.restoreToCount(i5);
      int i6 = paramCanvas.save();
      paramCanvas.translate(this.g.right - f2, f2 + this.g.top);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.i, this.e);
      if (i2 != 0) {
        paramCanvas.drawRect(0.0F, f1, this.g.height() - 2.0F * f2, -this.h, this.f);
      }
      paramCanvas.restoreToCount(i6);
      return;
      i1 = 0;
      break;
    }
  }
  
  static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramFloat1 = (float)(paramFloat1 + (1.0D - b) * paramFloat2);
    }
    return paramFloat1;
  }
  
  private void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList == null) {
      paramColorStateList = ColorStateList.valueOf(0);
    }
    this.m = paramColorStateList;
    this.d.setColor(this.m.getColorForState(getState(), this.m.getDefaultColor()));
  }
  
  private void b(Rect paramRect)
  {
    float f1 = 1.5F * this.j;
    this.g.set(paramRect.left + this.j, f1 + paramRect.top, paramRect.right - this.j, paramRect.bottom - f1);
    g();
  }
  
  private int d(float paramFloat)
  {
    int i1 = (int)(0.5F + paramFloat);
    if (i1 % 2 == 1) {
      i1--;
    }
    return i1;
  }
  
  private void g()
  {
    RectF localRectF1 = new RectF(-this.h, -this.h, this.h, this.h);
    RectF localRectF2 = new RectF(localRectF1);
    localRectF2.inset(-this.k, -this.k);
    if (this.i == null) {
      this.i = new Path();
    }
    for (;;)
    {
      this.i.setFillType(Path.FillType.EVEN_ODD);
      this.i.moveTo(-this.h, 0.0F);
      this.i.rLineTo(-this.k, 0.0F);
      this.i.arcTo(localRectF2, 180.0F, 90.0F, false);
      this.i.arcTo(localRectF1, 270.0F, -90.0F, false);
      this.i.close();
      float f1 = this.h / (this.h + this.k);
      Paint localPaint1 = this.e;
      float f2 = this.h + this.k;
      int[] arrayOfInt1 = new int[3];
      arrayOfInt1[0] = this.o;
      arrayOfInt1[1] = this.o;
      arrayOfInt1[2] = this.p;
      localPaint1.setShader(new RadialGradient(0.0F, 0.0F, f2, arrayOfInt1, new float[] { 0.0F, f1, 1.0F }, Shader.TileMode.CLAMP));
      Paint localPaint2 = this.f;
      float f3 = -this.h + this.k;
      float f4 = -this.h - this.k;
      int[] arrayOfInt2 = new int[3];
      arrayOfInt2[0] = this.o;
      arrayOfInt2[1] = this.o;
      arrayOfInt2[2] = this.p;
      localPaint2.setShader(new LinearGradient(0.0F, f3, 0.0F, f4, arrayOfInt2, new float[] { 0.0F, 0.5F, 1.0F }, Shader.TileMode.CLAMP));
      this.f.setAntiAlias(false);
      return;
      this.i.reset();
    }
  }
  
  float a()
  {
    return this.h;
  }
  
  void a(float paramFloat)
  {
    if (paramFloat < 0.0F) {
      throw new IllegalArgumentException("Invalid radius " + paramFloat + ". Must be >= 0");
    }
    float f1 = (int)(0.5F + paramFloat);
    if (this.h == f1) {
      return;
    }
    this.h = f1;
    this.n = true;
    invalidateSelf();
  }
  
  void a(ColorStateList paramColorStateList)
  {
    b(paramColorStateList);
    invalidateSelf();
  }
  
  void a(Rect paramRect)
  {
    getPadding(paramRect);
  }
  
  void a(boolean paramBoolean)
  {
    this.q = paramBoolean;
    invalidateSelf();
  }
  
  float b()
  {
    return this.l;
  }
  
  void b(float paramFloat)
  {
    a(paramFloat, this.j);
  }
  
  float c()
  {
    return this.j;
  }
  
  void c(float paramFloat)
  {
    a(this.l, paramFloat);
  }
  
  float d()
  {
    return 2.0F * Math.max(this.j, this.h + this.c + this.j / 2.0F) + 2.0F * (this.j + this.c);
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.n)
    {
      b(getBounds());
      this.n = false;
    }
    paramCanvas.translate(0.0F, this.l / 2.0F);
    a(paramCanvas);
    paramCanvas.translate(0.0F, -this.l / 2.0F);
    a.a(paramCanvas, this.g, this.h, this.d);
  }
  
  float e()
  {
    return 2.0F * Math.max(this.j, this.h + this.c + 1.5F * this.j / 2.0F) + 2.0F * (1.5F * this.j + this.c);
  }
  
  ColorStateList f()
  {
    return this.m;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int i1 = (int)Math.ceil(a(this.j, this.h, this.q));
    int i2 = (int)Math.ceil(b(this.j, this.h, this.q));
    paramRect.set(i2, i1, i2, i1);
    return true;
  }
  
  public boolean isStateful()
  {
    return ((this.m != null) && (this.m.isStateful())) || (super.isStateful());
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.n = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    int i1 = this.m.getColorForState(paramArrayOfInt, this.m.getDefaultColor());
    if (this.d.getColor() == i1) {
      return false;
    }
    this.d.setColor(i1);
    this.n = true;
    invalidateSelf();
    return true;
  }
  
  public void setAlpha(int paramInt)
  {
    this.d.setAlpha(paramInt);
    this.e.setAlpha(paramInt);
    this.f.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.d.setColorFilter(paramColorFilter);
  }
  
  static abstract interface a
  {
    public abstract void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y
 * JD-Core Version:    0.7.0.1
 */