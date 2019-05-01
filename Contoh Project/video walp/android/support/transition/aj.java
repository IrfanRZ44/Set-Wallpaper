package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;

class aj
{
  static Animator a(View paramView, ah paramah, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, TimeInterpolator paramTimeInterpolator)
  {
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    int[] arrayOfInt = (int[])paramah.b.getTag(y.a.transition_position);
    if (arrayOfInt != null)
    {
      paramFloat1 = f1 + (arrayOfInt[0] - paramInt1);
      paramFloat2 = f2 + (arrayOfInt[1] - paramInt2);
    }
    int i = paramInt1 + Math.round(paramFloat1 - f1);
    int j = paramInt2 + Math.round(paramFloat2 - f2);
    paramView.setTranslationX(paramFloat1);
    paramView.setTranslationY(paramFloat2);
    if ((paramFloat1 == paramFloat3) && (paramFloat2 == paramFloat4)) {
      return null;
    }
    PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[2];
    arrayOfPropertyValuesHolder[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[] { paramFloat1, paramFloat3 });
    arrayOfPropertyValuesHolder[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] { paramFloat2, paramFloat4 });
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(paramView, arrayOfPropertyValuesHolder);
    a locala = new a(paramView, paramah.b, i, j, f1, f2, null);
    localObjectAnimator.addListener(locala);
    a.a(localObjectAnimator, locala);
    localObjectAnimator.setInterpolator(paramTimeInterpolator);
    return localObjectAnimator;
  }
  
  private static class a
    extends AnimatorListenerAdapter
  {
    private final View a;
    private final View b;
    private final int c;
    private final int d;
    private int[] e;
    private float f;
    private float g;
    private final float h;
    private final float i;
    
    private a(View paramView1, View paramView2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
    {
      this.b = paramView1;
      this.a = paramView2;
      this.c = (paramInt1 - Math.round(this.b.getTranslationX()));
      this.d = (paramInt2 - Math.round(this.b.getTranslationY()));
      this.h = paramFloat1;
      this.i = paramFloat2;
      this.e = ((int[])this.a.getTag(y.a.transition_position));
      if (this.e != null) {
        this.a.setTag(y.a.transition_position, null);
      }
    }
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      if (this.e == null) {
        this.e = new int[2];
      }
      this.e[0] = Math.round(this.c + this.b.getTranslationX());
      this.e[1] = Math.round(this.d + this.b.getTranslationY());
      this.a.setTag(y.a.transition_position, this.e);
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      this.b.setTranslationX(this.h);
      this.b.setTranslationY(this.i);
    }
    
    public void onAnimationPause(Animator paramAnimator)
    {
      this.f = this.b.getTranslationX();
      this.g = this.b.getTranslationY();
      this.b.setTranslationX(this.h);
      this.b.setTranslationY(this.i);
    }
    
    public void onAnimationResume(Animator paramAnimator)
    {
      this.b.setTranslationX(this.f);
      this.b.setTranslationY(this.g);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.aj
 * JD-Core Version:    0.7.0.1
 */