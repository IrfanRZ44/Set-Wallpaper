package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class z
  implements TypeEvaluator<Rect>
{
  private Rect a;
  
  z() {}
  
  z(Rect paramRect)
  {
    this.a = paramRect;
  }
  
  public Rect a(float paramFloat, Rect paramRect1, Rect paramRect2)
  {
    int i = paramRect1.left + (int)(paramFloat * (paramRect2.left - paramRect1.left));
    int j = paramRect1.top + (int)(paramFloat * (paramRect2.top - paramRect1.top));
    int k = paramRect1.right + (int)(paramFloat * (paramRect2.right - paramRect1.right));
    int m = paramRect1.bottom + (int)(paramFloat * (paramRect2.bottom - paramRect1.bottom));
    if (this.a == null) {
      return new Rect(i, j, k, m);
    }
    this.a.set(i, j, k, m);
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.z
 * JD-Core Version:    0.7.0.1
 */