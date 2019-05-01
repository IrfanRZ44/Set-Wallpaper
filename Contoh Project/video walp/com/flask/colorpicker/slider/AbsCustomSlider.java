package com.flask.colorpicker.slider;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.flask.colorpicker.e.a;

public abstract class AbsCustomSlider
  extends View
{
  protected Bitmap a;
  protected Canvas b;
  protected Bitmap c;
  protected Canvas d;
  protected a e;
  protected int f;
  protected int g = 20;
  protected int h = 5;
  protected float i = 1.0F;
  
  public AbsCustomSlider(Context paramContext)
  {
    super(paramContext);
  }
  
  public AbsCustomSlider(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AbsCustomSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected int a(int paramInt)
  {
    return getResources().getDimensionPixelSize(paramInt);
  }
  
  protected void a()
  {
    this.g = a(e.a.default_slider_handler_radius);
    this.h = a(e.a.default_slider_bar_height);
    this.f = this.g;
    if (this.c == null) {
      b();
    }
    a(this.d);
    invalidate();
  }
  
  protected abstract void a(float paramFloat);
  
  protected abstract void a(Canvas paramCanvas);
  
  protected abstract void a(Canvas paramCanvas, float paramFloat1, float paramFloat2);
  
  protected void b()
  {
    int j = getWidth();
    int k = getHeight();
    this.c = Bitmap.createBitmap(j - 2 * this.f, this.h, Bitmap.Config.ARGB_8888);
    this.d = new Canvas(this.c);
    if ((this.a == null) || (this.a.getWidth() != j) || (this.a.getHeight() != k))
    {
      if (this.a != null) {
        this.a.recycle();
      }
      this.a = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
      this.b = new Canvas(this.a);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.c != null) && (this.b != null))
    {
      this.b.drawColor(0, PorterDuff.Mode.CLEAR);
      this.b.drawBitmap(this.c, this.f, (getHeight() - this.c.getHeight()) / 2, null);
      float f1 = this.g + this.i * (getWidth() - 2 * this.g);
      float f2 = getHeight() / 2.0F;
      a(this.b, f1, f2);
      paramCanvas.drawBitmap(this.a, 0.0F, 0.0F, null);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int j = View.MeasureSpec.getMode(paramInt1);
    if (j == 0) {}
    for (;;)
    {
      int k = View.MeasureSpec.getMode(paramInt2);
      if (k == 0) {}
      for (;;)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        return;
        if (j == -2147483648)
        {
          paramInt1 = View.MeasureSpec.getSize(paramInt1);
          break;
        }
        if (j != 1073741824) {
          break label96;
        }
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        break;
        if (k == -2147483648) {
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
        } else if (k == 1073741824) {
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
        } else {
          paramInt2 = 0;
        }
      }
      label96:
      paramInt1 = 0;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return true;
      if (this.c != null)
      {
        this.i = ((paramMotionEvent.getX() - this.f) / this.c.getWidth());
        this.i = Math.max(0.0F, Math.min(this.i, 1.0F));
        a(this.i);
        invalidate();
        continue;
        a(this.i);
        if (this.e != null) {
          this.e.a(this.i);
        }
        invalidate();
      }
    }
  }
  
  public void setOnValueChangedListener(a parama)
  {
    this.e = parama;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.slider.AbsCustomSlider
 * JD-Core Version:    0.7.0.1
 */