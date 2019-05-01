package com.flask.colorpicker.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.a.d;
import com.flask.colorpicker.a.d.a;
import com.flask.colorpicker.f;

public class LightnessSlider
  extends AbsCustomSlider
{
  private int j;
  private Paint k = d.a().a();
  private Paint l = d.a().a();
  private Paint m = d.a().a(-1).a(PorterDuff.Mode.CLEAR).a();
  private ColorPickerView n;
  
  public LightnessSlider(Context paramContext)
  {
    super(paramContext);
  }
  
  public LightnessSlider(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public LightnessSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void a(float paramFloat)
  {
    if (this.n != null) {
      this.n.setLightness(paramFloat);
    }
  }
  
  protected void a(Canvas paramCanvas)
  {
    int i = paramCanvas.getWidth();
    int i1 = paramCanvas.getHeight();
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(this.j, arrayOfFloat);
    int i2 = Math.max(2, i / 256);
    int i3 = 0;
    while (i3 <= i)
    {
      arrayOfFloat[2] = (i3 / (i - 1));
      this.k.setColor(Color.HSVToColor(arrayOfFloat));
      paramCanvas.drawRect(i3, 0.0F, i3 + i2, i1, this.k);
      i3 += i2;
    }
  }
  
  protected void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    this.l.setColor(f.a(this.j, this.i));
    paramCanvas.drawCircle(paramFloat1, paramFloat2, this.g, this.m);
    paramCanvas.drawCircle(paramFloat1, paramFloat2, 0.75F * this.g, this.l);
  }
  
  public void setColor(int paramInt)
  {
    this.j = paramInt;
    this.i = f.b(paramInt);
    if (this.c != null)
    {
      a();
      invalidate();
    }
  }
  
  public void setColorPicker(ColorPickerView paramColorPickerView)
  {
    this.n = paramColorPickerView;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.slider.LightnessSlider
 * JD-Core Version:    0.7.0.1
 */