package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.widget.ImageView;

class k
{
  private static final n a = new l();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new m();
      return;
    }
  }
  
  static void a(ImageView paramImageView)
  {
    a.a(paramImageView);
  }
  
  static void a(ImageView paramImageView, Animator paramAnimator)
  {
    a.a(paramImageView, paramAnimator);
  }
  
  static void a(ImageView paramImageView, Matrix paramMatrix)
  {
    a.a(paramImageView, paramMatrix);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.k
 * JD-Core Version:    0.7.0.1
 */