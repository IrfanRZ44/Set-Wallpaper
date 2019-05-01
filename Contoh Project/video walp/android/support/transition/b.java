package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

class b
  implements d
{
  public void a(Animator paramAnimator)
  {
    ArrayList localArrayList = paramAnimator.getListeners();
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localArrayList.get(j);
        if ((localAnimatorListener instanceof a)) {
          ((a)localAnimatorListener).onAnimationPause(paramAnimator);
        }
      }
    }
  }
  
  public void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter) {}
  
  public void b(Animator paramAnimator)
  {
    ArrayList localArrayList = paramAnimator.getListeners();
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localArrayList.get(j);
        if ((localAnimatorListener instanceof a)) {
          ((a)localAnimatorListener).onAnimationResume(paramAnimator);
        }
      }
    }
  }
  
  static abstract interface a
  {
    public abstract void onAnimationPause(Animator paramAnimator);
    
    public abstract void onAnimationResume(Animator paramAnimator);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.b
 * JD-Core Version:    0.7.0.1
 */