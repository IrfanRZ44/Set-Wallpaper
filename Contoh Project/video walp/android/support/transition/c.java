package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class c
  implements d
{
  public void a(Animator paramAnimator)
  {
    paramAnimator.pause();
  }
  
  public void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    paramAnimator.addPauseListener(paramAnimatorListenerAdapter);
  }
  
  public void b(Animator paramAnimator)
  {
    paramAnimator.resume();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.c
 * JD-Core Version:    0.7.0.1
 */