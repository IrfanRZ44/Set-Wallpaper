package android.arch.lifecycle;

import android.support.v4.app.Fragment;

public class x
{
  public static v a(Fragment paramFragment)
  {
    if ((paramFragment instanceof w)) {
      return ((w)paramFragment).getViewModelStore();
    }
    return d.a(paramFragment).getViewModelStore();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.x
 * JD-Core Version:    0.7.0.1
 */