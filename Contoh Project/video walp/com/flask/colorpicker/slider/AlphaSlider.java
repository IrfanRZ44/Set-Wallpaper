package com.flask.colorpicker.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.a.d;
import com.flask.colorpicker.a.d.a;
import com.flask.colorpicker.f;

public class AlphaSlider
  extends AbsCustomSlider
{
  public int j;
  private Paint k = d.a().a();
  private Paint l = d.a().a();
  private Paint m = d.a().a();
  private Paint n = d.a().a(-1).a(PorterDuff.Mode.CLEAR).a();
  private ColorPickerView o;
  
  public AlphaSlider(Context paramContext)
  {
    super(paramContext);
  }
  
  public AlphaSlider(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AlphaSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void a(float paramFloat)
  {
    if (this.o != null) {
      this.o.setAlphaValue(paramFloat);
    }
  }
  
  protected void a(Canvas paramCanvas)
  {
    int i = paramCanvas.getWidth();
    int i1 = paramCanvas.getHeight();
    paramCanvas.drawRect(0.0F, 0.0F, i, i1, this.k);
    int i2 = Math.max(2, i / 256);
    int i3 = 0;
    while (i3 <= i)
    {
      float f = i3 / (i - 1);
      this.l.setColor(this.j);
      this.l.setAlpha(Math.round(f * 255.0F));
      paramCanvas.drawRect(i3, 0.0F, i3 + i2, i1, this.l);
      i3 += i2;
    }
  }
  
  protected void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    this.m.setColor(this.j);
    this.m.setAlpha(Math.round(255.0F * this.i));
    paramCanvas.drawCircle(paramFloat1, paramFloat2, this.g, this.n);
    if (this.i < 1.0F) {
      paramCanvas.drawCircle(paramFloat1, paramFloat2, 0.75F * this.g, this.k);
    }
    paramCanvas.drawCircle(paramFloat1, paramFloat2, 0.75F * this.g, this.m);
  }
  
  protected void b()
  {
    super.b();
    this.k.setShader(d.a(this.h / 2));
  }
  
  public void setColor(int paramInt)
  {
    this.j = paramInt;
    this.i = f.a(paramInt);
    if (this.c != null)
    {
      a();
      invalidate();
    }
  }
  
  public void setColorPicker(ColorPickerView paramColorPickerView)
  {
    this.o = paramColorPickerView;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.slider.AlphaSlider
 * JD-Core Version:    0.7.0.1
 */