package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class a
  extends Drawable
{
  final ActionBarContainer a;
  
  public a(ActionBarContainer paramActionBarContainer)
  {
    this.a = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.a.mIsSplit) {
      if (this.a.mSplitBackground != null) {
        this.a.mSplitBackground.draw(paramCanvas);
      }
    }
    do
    {
      return;
      if (this.a.mBackground != null) {
        this.a.mBackground.draw(paramCanvas);
      }
    } while ((this.a.mStackedBackground == null) || (!this.a.mIsStacked));
    this.a.mStackedBackground.draw(paramCanvas);
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a
 * JD-Core Version:    0.7.0.1
 */