package android.support.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition
  extends TransitionSet
{
  public AutoTransition()
  {
    q();
  }
  
  public AutoTransition(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    q();
  }
  
  private void q()
  {
    a(1);
    b(new Fade(2)).b(new ChangeBounds()).b(new Fade(1));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.AutoTransition
 * JD-Core Version:    0.7.0.1
 */