package com.admob.android.ads;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class p
  extends Animation
{
  private float[] a;
  private float[] b;
  
  public p(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, PointF paramPointF)
  {
    this.a = paramArrayOfFloat1;
    this.b = paramArrayOfFloat2;
  }
  
  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if ((paramFloat < 0.0D) || (paramFloat > 1.0D))
    {
      paramTransformation.setTransformationType(Transformation.TYPE_IDENTITY);
      return;
    }
    Matrix localMatrix = paramTransformation.getMatrix();
    float[] arrayOfFloat = new float[this.a.length];
    for (int i = 0; i < this.a.length; i++) {
      arrayOfFloat[i] = (this.a[i] + paramFloat * (this.b[i] - this.a[i]));
    }
    localMatrix.setSkew(this.a[0], this.a[1]);
    paramTransformation.setTransformationType(Transformation.TYPE_MATRIX);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.p
 * JD-Core Version:    0.7.0.1
 */