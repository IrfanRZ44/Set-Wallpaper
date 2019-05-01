package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class e
  extends bb
{
  private float a = 3.0F;
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    return (float)Math.sqrt(f1 * f1 + f2 * f2);
  }
  
  public long a(ViewGroup paramViewGroup, Transition paramTransition, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) && (paramah2 == null)) {
      return 0L;
    }
    int i;
    int j;
    int k;
    Rect localRect;
    int m;
    if ((paramah2 == null) || (b(paramah1) == 0))
    {
      i = -1;
      paramah2 = paramah1;
      j = c(paramah2);
      k = d(paramah2);
      localRect = paramTransition.m();
      if (localRect == null) {
        break label148;
      }
      m = localRect.centerX();
    }
    label148:
    int[] arrayOfInt;
    for (int n = localRect.centerY();; n = Math.round(arrayOfInt[1] + paramViewGroup.getHeight() / 2 + paramViewGroup.getTranslationY()))
    {
      float f = a(j, k, m, n) / a(0.0F, 0.0F, paramViewGroup.getWidth(), paramViewGroup.getHeight());
      long l = paramTransition.b();
      if (l < 0L) {
        l = 300L;
      }
      return Math.round(f * ((float)(l * i) / this.a));
      i = 1;
      break;
      arrayOfInt = new int[2];
      paramViewGroup.getLocationOnScreen(arrayOfInt);
      m = Math.round(arrayOfInt[0] + paramViewGroup.getWidth() / 2 + paramViewGroup.getTranslationX());
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.e
 * JD-Core Version:    0.7.0.1
 */