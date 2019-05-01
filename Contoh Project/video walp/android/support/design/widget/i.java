package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
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
import android.support.design.a.c;

class i
  extends android.support.v7.d.a.a
{
  static final double a = Math.cos(Math.toRadians(45.0D));
  final Paint b;
  final Paint c;
  final RectF d;
  float e;
  Path f;
  float g;
  float h;
  float i;
  float j;
  private boolean k = true;
  private final int l;
  private final int m;
  private final int n;
  private boolean o = true;
  private float p;
  private boolean q = false;
  
  public i(Context paramContext, Drawable paramDrawable, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramDrawable);
    this.l = android.support.v4.content.a.getColor(paramContext, a.c.design_fab_shadow_start_color);
    this.m = android.support.v4.content.a.getColor(paramContext, a.c.design_fab_shadow_mid_color);
    this.n = android.support.v4.content.a.getColor(paramContext, a.c.design_fab_shadow_end_color);
    this.b = new Paint(5);
    this.b.setStyle(Paint.Style.FILL);
    this.e = Math.round(paramFloat1);
    this.d = new RectF();
    this.c = new Paint(this.b);
    this.c.setAntiAlias(false);
    a(paramFloat2, paramFloat3);
  }
  
  public static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (float)(1.5F * paramFloat1 + (1.0D - a) * paramFloat2);
    }
    return 1.5F * paramFloat1;
  }
  
  private void a(Canvas paramCanvas)
  {
    int i1 = paramCanvas.save();
    paramCanvas.rotate(this.p, this.d.centerX(), this.d.centerY());
    float f1 = -this.e - this.i;
    float f2 = this.e;
    int i2;
    if (this.d.width() - 2.0F * f2 > 0.0F)
    {
      i2 = 1;
      if (this.d.height() - 2.0F * f2 <= 0.0F) {
        break label578;
      }
    }
    label578:
    for (int i3 = 1;; i3 = 0)
    {
      float f3 = this.j - 0.25F * this.j;
      float f4 = this.j - 0.5F * this.j;
      float f5 = this.j - 1.0F * this.j;
      float f6 = f2 / (f4 + f2);
      float f7 = f2 / (f3 + f2);
      float f8 = f2 / (f2 + f5);
      int i4 = paramCanvas.save();
      paramCanvas.translate(f2 + this.d.left, f2 + this.d.top);
      paramCanvas.scale(f6, f7);
      paramCanvas.drawPath(this.f, this.b);
      if (i2 != 0)
      {
        paramCanvas.scale(1.0F / f6, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.d.width() - 2.0F * f2, -this.e, this.c);
      }
      paramCanvas.restoreToCount(i4);
      int i5 = paramCanvas.save();
      paramCanvas.translate(this.d.right - f2, this.d.bottom - f2);
      paramCanvas.scale(f6, f8);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.f, this.b);
      if (i2 != 0)
      {
        paramCanvas.scale(1.0F / f6, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.d.width() - 2.0F * f2, -this.e + this.i, this.c);
      }
      paramCanvas.restoreToCount(i5);
      int i6 = paramCanvas.save();
      paramCanvas.translate(f2 + this.d.left, this.d.bottom - f2);
      paramCanvas.scale(f6, f8);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.f, this.b);
      if (i3 != 0)
      {
        paramCanvas.scale(1.0F / f8, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.d.height() - 2.0F * f2, -this.e, this.c);
      }
      paramCanvas.restoreToCount(i6);
      int i7 = paramCanvas.save();
      paramCanvas.translate(this.d.right - f2, f2 + this.d.top);
      paramCanvas.scale(f6, f7);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.f, this.b);
      if (i3 != 0)
      {
        paramCanvas.scale(1.0F / f7, 1.0F);
        paramCanvas.drawRect(0.0F, f1, this.d.height() - 2.0F * f2, -this.e, this.c);
      }
      paramCanvas.restoreToCount(i7);
      paramCanvas.restoreToCount(i1);
      return;
      i2 = 0;
      break;
    }
  }
  
  private void a(Rect paramRect)
  {
    float f1 = 1.5F * this.h;
    this.d.set(paramRect.left + this.h, f1 + paramRect.top, paramRect.right - this.h, paramRect.bottom - f1);
    b().setBounds((int)this.d.left, (int)this.d.top, (int)this.d.right, (int)this.d.bottom);
    c();
  }
  
  public static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramFloat1 = (float)(paramFloat1 + (1.0D - a) * paramFloat2);
    }
    return paramFloat1;
  }
  
  private static int c(float paramFloat)
  {
    int i1 = Math.round(paramFloat);
    if (i1 % 2 == 1) {
      i1--;
    }
    return i1;
  }
  
  private void c()
  {
    RectF localRectF1 = new RectF(-this.e, -this.e, this.e, this.e);
    RectF localRectF2 = new RectF(localRectF1);
    localRectF2.inset(-this.i, -this.i);
    if (this.f == null) {
      this.f = new Path();
    }
    for (;;)
    {
      this.f.setFillType(Path.FillType.EVEN_ODD);
      this.f.moveTo(-this.e, 0.0F);
      this.f.rLineTo(-this.i, 0.0F);
      this.f.arcTo(localRectF2, 180.0F, 90.0F, false);
      this.f.arcTo(localRectF1, 270.0F, -90.0F, false);
      this.f.close();
      float f1 = -localRectF2.top;
      if (f1 > 0.0F)
      {
        float f4 = this.e / f1;
        float f5 = f4 + (1.0F - f4) / 2.0F;
        Paint localPaint2 = this.b;
        int[] arrayOfInt2 = new int[4];
        arrayOfInt2[0] = 0;
        arrayOfInt2[1] = this.l;
        arrayOfInt2[2] = this.m;
        arrayOfInt2[3] = this.n;
        localPaint2.setShader(new RadialGradient(0.0F, 0.0F, f1, arrayOfInt2, new float[] { 0.0F, f4, f5, 1.0F }, Shader.TileMode.CLAMP));
      }
      Paint localPaint1 = this.c;
      float f2 = localRectF1.top;
      float f3 = localRectF2.top;
      int[] arrayOfInt1 = new int[3];
      arrayOfInt1[0] = this.l;
      arrayOfInt1[1] = this.m;
      arrayOfInt1[2] = this.n;
      localPaint1.setShader(new LinearGradient(0.0F, f2, 0.0F, f3, arrayOfInt1, new float[] { 0.0F, 0.5F, 1.0F }, Shader.TileMode.CLAMP));
      this.c.setAntiAlias(false);
      return;
      this.f.reset();
    }
  }
  
  public float a()
  {
    return this.j;
  }
  
  final void a(float paramFloat)
  {
    if (this.p != paramFloat)
    {
      this.p = paramFloat;
      invalidateSelf();
    }
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 < 0.0F) || (paramFloat2 < 0.0F)) {
      throw new IllegalArgumentException("invalid shadow size");
    }
    float f1 = c(paramFloat1);
    float f2 = c(paramFloat2);
    if (f1 > f2)
    {
      if (!this.q) {
        this.q = true;
      }
      f1 = f2;
    }
    if ((this.j == f1) && (this.h == f2)) {
      return;
    }
    this.j = f1;
    this.h = f2;
    this.i = Math.round(f1 * 1.5F);
    this.g = f2;
    this.k = true;
    invalidateSelf();
  }
  
  public void a(boolean paramBoolean)
  {
    this.o = paramBoolean;
    invalidateSelf();
  }
  
  public void b(float paramFloat)
  {
    a(paramFloat, this.h);
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.k)
    {
      a(getBounds());
      this.k = false;
    }
    a(paramCanvas);
    super.draw(paramCanvas);
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int i1 = (int)Math.ceil(a(this.h, this.e, this.o));
    int i2 = (int)Math.ceil(b(this.h, this.e, this.o));
    paramRect.set(i2, i1, i2, i1);
    return true;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.k = true;
  }
  
  public void setAlpha(int paramInt)
  {
    super.setAlpha(paramInt);
    this.b.setAlpha(paramInt);
    this.c.setAlpha(paramInt);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.i
 * JD-Core Version:    0.7.0.1
 */