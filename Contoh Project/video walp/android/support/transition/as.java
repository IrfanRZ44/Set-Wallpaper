package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class as
  implements at
{
  private final ViewOverlay a;
  
  as(View paramView)
  {
    this.a = paramView.getOverlay();
  }
  
  public void a(Drawable paramDrawable)
  {
    this.a.add(paramDrawable);
  }
  
  public void b(Drawable paramDrawable)
  {
    this.a.remove(paramDrawable);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.as
 * JD-Core Version:    0.7.0.1
 */