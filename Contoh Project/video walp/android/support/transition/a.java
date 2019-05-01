package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

class a
{
  private static final d a = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new c();
      return;
    }
  }
  
  static void a(Animator paramAnimator)
  {
    a.a(paramAnimator);
  }
  
  static void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    a.a(paramAnimator, paramAnimatorListenerAdapter);
  }
  
  static void b(Animator paramAnimator)
  {
    a.b(paramAnimator);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.a
 * JD-Core Version:    0.7.0.1
 */