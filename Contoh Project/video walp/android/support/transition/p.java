package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

class p
{
  private static final s a = new q();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new r();
      return;
    }
  }
  
  static <T> ObjectAnimator a(T paramT, Property<T, PointF> paramProperty, Path paramPath)
  {
    return a.a(paramT, paramProperty, paramPath);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.p
 * JD-Core Version:    0.7.0.1
 */