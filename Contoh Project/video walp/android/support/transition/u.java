package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

class u
{
  private static final x a = new v();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new w();
      return;
    }
  }
  
  static PropertyValuesHolder a(Property<?, PointF> paramProperty, Path paramPath)
  {
    return a.a(paramProperty, paramPath);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.u
 * JD-Core Version:    0.7.0.1
 */