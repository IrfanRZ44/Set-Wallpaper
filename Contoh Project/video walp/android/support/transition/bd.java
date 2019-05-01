package android.support.transition;

import android.view.View;
import android.view.WindowId;

class bd
  implements be
{
  private final WindowId a;
  
  bd(View paramView)
  {
    this.a = paramView.getWindowId();
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof bd)) && (((bd)paramObject).a.equals(this.a));
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.bd
 * JD-Core Version:    0.7.0.1
 */