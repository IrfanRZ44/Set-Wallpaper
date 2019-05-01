package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class m
  implements n
{
  private static Method a;
  private static boolean b;
  
  private void a()
  {
    if (!b) {}
    try
    {
      a = ImageView.class.getDeclaredMethod("animateTransform", new Class[] { Matrix.class });
      a.setAccessible(true);
      b = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Log.i("ImageViewUtilsApi21", "Failed to retrieve animateTransform method", localNoSuchMethodException);
      }
    }
  }
  
  public void a(ImageView paramImageView) {}
  
  public void a(ImageView paramImageView, Animator paramAnimator) {}
  
  public void a(ImageView paramImageView, Matrix paramMatrix)
  {
    a();
    if (a != null) {}
    try
    {
      a.invoke(paramImageView, new Object[] { paramMatrix });
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException.getCause());
    }
    catch (IllegalAccessException localIllegalAccessException) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.m
 * JD-Core Version:    0.7.0.1
 */