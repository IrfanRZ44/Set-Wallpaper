package android.support.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

class an
{
  private static final aq a = new ao();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18)
    {
      a = new ap();
      return;
    }
  }
  
  static am a(ViewGroup paramViewGroup)
  {
    return a.a(paramViewGroup);
  }
  
  static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, paramBoolean);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.an
 * JD-Core Version:    0.7.0.1
 */