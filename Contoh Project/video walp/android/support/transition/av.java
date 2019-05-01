package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

class av
  implements ba
{
  private float[] a;
  
  public at a(View paramView)
  {
    return ar.d(paramView);
  }
  
  public void a(View paramView, float paramFloat)
  {
    Float localFloat = (Float)paramView.getTag(y.a.save_non_transition_alpha);
    if (localFloat != null)
    {
      paramView.setAlpha(paramFloat * localFloat.floatValue());
      return;
    }
    paramView.setAlpha(paramFloat);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setLeft(paramInt1);
    paramView.setTop(paramInt2);
    paramView.setRight(paramInt3);
    paramView.setBottom(paramInt4);
  }
  
  public void a(View paramView, Matrix paramMatrix)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent instanceof View))
    {
      View localView = (View)localViewParent;
      a(localView, paramMatrix);
      paramMatrix.preTranslate(-localView.getScrollX(), -localView.getScrollY());
    }
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    Matrix localMatrix = paramView.getMatrix();
    if (!localMatrix.isIdentity()) {
      paramMatrix.preConcat(localMatrix);
    }
  }
  
  public be b(View paramView)
  {
    return new bc(paramView.getWindowToken());
  }
  
  public void b(View paramView, Matrix paramMatrix)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent instanceof View))
    {
      View localView = (View)localViewParent;
      b(localView, paramMatrix);
      paramMatrix.postTranslate(localView.getScrollX(), localView.getScrollY());
    }
    paramMatrix.postTranslate(paramView.getLeft(), paramView.getTop());
    Matrix localMatrix1 = paramView.getMatrix();
    if (!localMatrix1.isIdentity())
    {
      Matrix localMatrix2 = new Matrix();
      if (localMatrix1.invert(localMatrix2)) {
        paramMatrix.postConcat(localMatrix2);
      }
    }
  }
  
  public float c(View paramView)
  {
    Float localFloat = (Float)paramView.getTag(y.a.save_non_transition_alpha);
    if (localFloat != null) {
      return paramView.getAlpha() / localFloat.floatValue();
    }
    return paramView.getAlpha();
  }
  
  public void c(View paramView, Matrix paramMatrix)
  {
    if ((paramMatrix == null) || (paramMatrix.isIdentity()))
    {
      paramView.setPivotX(paramView.getWidth() / 2);
      paramView.setPivotY(paramView.getHeight() / 2);
      paramView.setTranslationX(0.0F);
      paramView.setTranslationY(0.0F);
      paramView.setScaleX(1.0F);
      paramView.setScaleY(1.0F);
      paramView.setRotation(0.0F);
      return;
    }
    float[] arrayOfFloat = this.a;
    if (arrayOfFloat == null)
    {
      arrayOfFloat = new float[9];
      this.a = arrayOfFloat;
    }
    paramMatrix.getValues(arrayOfFloat);
    float f1 = arrayOfFloat[3];
    float f2 = (float)Math.sqrt(1.0F - f1 * f1);
    if (arrayOfFloat[0] < 0.0F) {}
    for (int i = -1;; i = 1)
    {
      float f3 = f2 * i;
      float f4 = (float)Math.toDegrees(Math.atan2(f1, f3));
      float f5 = arrayOfFloat[0] / f3;
      float f6 = arrayOfFloat[4] / f3;
      float f7 = arrayOfFloat[2];
      float f8 = arrayOfFloat[5];
      paramView.setPivotX(0.0F);
      paramView.setPivotY(0.0F);
      paramView.setTranslationX(f7);
      paramView.setTranslationY(f8);
      paramView.setRotation(f4);
      paramView.setScaleX(f5);
      paramView.setScaleY(f6);
      return;
    }
  }
  
  public void d(View paramView)
  {
    if (paramView.getTag(y.a.save_non_transition_alpha) == null) {
      paramView.setTag(y.a.save_non_transition_alpha, Float.valueOf(paramView.getAlpha()));
    }
  }
  
  public void e(View paramView)
  {
    if (paramView.getVisibility() == 0) {
      paramView.setTag(y.a.save_non_transition_alpha, null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.av
 * JD-Core Version:    0.7.0.1
 */