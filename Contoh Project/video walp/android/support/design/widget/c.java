package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a;

class c
  extends Drawable
{
  final Paint a = new Paint(1);
  final Rect b = new Rect();
  final RectF c = new RectF();
  float d;
  private int e;
  private int f;
  private int g;
  private int h;
  private ColorStateList i;
  private int j;
  private boolean k = true;
  private float l;
  
  public c()
  {
    this.a.setStyle(Paint.Style.STROKE);
  }
  
  private Shader a()
  {
    Rect localRect = this.b;
    copyBounds(localRect);
    float f1 = this.d / localRect.height();
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = a.a(this.e, this.j);
    arrayOfInt[1] = a.a(this.f, this.j);
    arrayOfInt[2] = a.a(a.b(this.f, 0), this.j);
    arrayOfInt[3] = a.a(a.b(this.h, 0), this.j);
    arrayOfInt[4] = a.a(this.h, this.j);
    arrayOfInt[5] = a.a(this.g, this.j);
    float[] arrayOfFloat = new float[6];
    arrayOfFloat[0] = 0.0F;
    arrayOfFloat[1] = f1;
    arrayOfFloat[2] = 0.5F;
    arrayOfFloat[3] = 0.5F;
    arrayOfFloat[4] = (1.0F - f1);
    arrayOfFloat[5] = 1.0F;
    return new LinearGradient(0.0F, localRect.top, 0.0F, localRect.bottom, arrayOfInt, arrayOfFloat, Shader.TileMode.CLAMP);
  }
  
  void a(float paramFloat)
  {
    if (this.d != paramFloat)
    {
      this.d = paramFloat;
      this.a.setStrokeWidth(1.3333F * paramFloat);
      this.k = true;
      invalidateSelf();
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramInt4;
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null) {
      this.j = paramColorStateList.getColorForState(getState(), this.j);
    }
    this.i = paramColorStateList;
    this.k = true;
    invalidateSelf();
  }
  
  final void b(float paramFloat)
  {
    if (paramFloat != this.l)
    {
      this.l = paramFloat;
      invalidateSelf();
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.k)
    {
      this.a.setShader(a());
      this.k = false;
    }
    float f1 = this.a.getStrokeWidth() / 2.0F;
    RectF localRectF = this.c;
    copyBounds(this.b);
    localRectF.set(this.b);
    localRectF.left = (f1 + localRectF.left);
    localRectF.top = (f1 + localRectF.top);
    localRectF.right -= f1;
    localRectF.bottom -= f1;
    paramCanvas.save();
    paramCanvas.rotate(this.l, localRectF.centerX(), localRectF.centerY());
    paramCanvas.drawOval(localRectF, this.a);
    paramCanvas.restore();
  }
  
  public int getOpacity()
  {
    if (this.d > 0.0F) {
      return -3;
    }
    return -2;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int m = Math.round(this.d);
    paramRect.set(m, m, m, m);
    return true;
  }
  
  public boolean isStateful()
  {
    return ((this.i != null) && (this.i.isStateful())) || (super.isStateful());
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.k = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.i != null)
    {
      int m = this.i.getColorForState(paramArrayOfInt, this.j);
      if (m != this.j)
      {
        this.k = true;
        this.j = m;
      }
    }
    if (this.k) {
      invalidateSelf();
    }
    return this.k;
  }
  
  public void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.c
 * JD-Core Version:    0.7.0.1
 */