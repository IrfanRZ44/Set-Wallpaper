package android.support.transition;

import android.animation.TypeEvaluator;

class f
  implements TypeEvaluator<float[]>
{
  private float[] a;
  
  f(float[] paramArrayOfFloat)
  {
    this.a = paramArrayOfFloat;
  }
  
  public float[] a(float paramFloat, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float[] arrayOfFloat = this.a;
    if (arrayOfFloat == null) {
      arrayOfFloat = new float[paramArrayOfFloat1.length];
    }
    for (int i = 0; i < arrayOfFloat.length; i++)
    {
      float f = paramArrayOfFloat1[i];
      arrayOfFloat[i] = (f + paramFloat * (paramArrayOfFloat2[i] - f));
    }
    return arrayOfFloat;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.f
 * JD-Core Version:    0.7.0.1
 */