package com.admob.android.ads;

import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;

public final class n
  extends ScaleAnimation
{
  public n(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if ((paramFloat >= 0.0D) || (paramFloat <= 1.0D)) {
      super.applyTransformation(paramFloat, paramTransformation);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.n
 * JD-Core Version:    0.7.0.1
 */