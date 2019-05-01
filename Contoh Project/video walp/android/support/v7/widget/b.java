package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class b
  extends a
{
  public b(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }
  
  public void getOutline(Outline paramOutline)
  {
    if (this.a.mIsSplit) {
      if (this.a.mSplitBackground != null) {
        this.a.mSplitBackground.getOutline(paramOutline);
      }
    }
    while (this.a.mBackground == null) {
      return;
    }
    this.a.mBackground.getOutline(paramOutline);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.b
 * JD-Core Version:    0.7.0.1
 */