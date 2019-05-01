package android.support.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

class j
{
  private static final i.a a = new g.a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new h.a();
      return;
    }
  }
  
  static i a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
  {
    return a.a(paramView, paramViewGroup, paramMatrix);
  }
  
  static void a(View paramView)
  {
    a.a(paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.j
 * JD-Core Version:    0.7.0.1
 */