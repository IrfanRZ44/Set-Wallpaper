package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public class k
  extends a
{
  private final ListView f;
  
  public k(ListView paramListView)
  {
    super(paramListView);
    this.f = paramListView;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    l.a(this.f, paramInt2);
  }
  
  public boolean e(int paramInt)
  {
    return false;
  }
  
  public boolean f(int paramInt)
  {
    ListView localListView = this.f;
    int i = localListView.getCount();
    if (i == 0) {}
    int j;
    int k;
    int m;
    do
    {
      return false;
      j = localListView.getChildCount();
      k = localListView.getFirstVisiblePosition();
      m = k + j;
      if (paramInt <= 0) {
        break;
      }
    } while ((m >= i) && (localListView.getChildAt(j - 1).getBottom() <= localListView.getHeight()));
    do
    {
      return true;
      if (paramInt >= 0) {
        break;
      }
    } while ((k > 0) || (localListView.getChildAt(0).getTop() < 0));
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.k
 * JD-Core Version:    0.7.0.1
 */