package com.admob.android.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.TextView;

public final class q
  extends TextView
{
  public float a = -1.0F;
  public boolean b = false;
  public float c;
  
  public q(Context paramContext, float paramFloat)
  {
    super(paramContext);
    setGravity(80);
    this.c = paramFloat;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.b)
    {
      int i = getMeasuredWidth();
      Typeface localTypeface = getTypeface();
      float f1 = getTextSize();
      CharSequence localCharSequence = getText();
      TextPaint localTextPaint = new TextPaint(getPaint());
      if (localCharSequence != null)
      {
        for (float f2 = f1; f2 >= this.a; f2 -= 0.5F)
        {
          localTextPaint.setTypeface(localTypeface);
          localTextPaint.setTextSize(f2);
          if (localTextPaint.measureText(localCharSequence, 0, localCharSequence.length()) <= i) {
            break;
          }
        }
        if (f1 != f2) {
          setTextSize(1, f2 / this.c);
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.q
 * JD-Core Version:    0.7.0.1
 */