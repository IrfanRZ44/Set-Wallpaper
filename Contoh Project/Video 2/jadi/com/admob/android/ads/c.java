package com.admob.android.ads;

import android.view.animation.Interpolator;

public final class c
  implements Interpolator
{
  private Interpolator a;
  private float b;
  private float c;
  
  public c(Interpolator paramInterpolator, long paramLong1, long paramLong2, long paramLong3)
  {
    this.a = paramInterpolator;
    this.b = ((float)paramLong1 / (float)paramLong3);
    this.c = ((float)paramLong2 / (float)paramLong3);
  }
  
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat <= this.b) {
      return -1.0F;
    }
    if (paramFloat <= this.b + this.c) {
      return this.a.getInterpolation((paramFloat - this.b) / this.c);
    }
    return 2.0F;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.c
 * JD-Core Version:    0.7.0.1
 */