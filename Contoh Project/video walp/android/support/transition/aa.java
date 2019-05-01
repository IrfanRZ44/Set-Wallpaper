package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

public class aa
{
  private ViewGroup a;
  private Runnable b;
  
  static aa a(View paramView)
  {
    return (aa)paramView.getTag(y.a.transition_current_scene);
  }
  
  static void a(View paramView, aa paramaa)
  {
    paramView.setTag(y.a.transition_current_scene, paramaa);
  }
  
  public void a()
  {
    if ((a(this.a) == this) && (this.b != null)) {
      this.b.run();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.aa
 * JD-Core Version:    0.7.0.1
 */