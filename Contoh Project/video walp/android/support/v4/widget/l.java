package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

public final class l
{
  public static void a(ListView paramListView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramListView.scrollListBy(paramInt);
    }
    int i;
    View localView;
    do
    {
      do
      {
        return;
        i = paramListView.getFirstVisiblePosition();
      } while (i == -1);
      localView = paramListView.getChildAt(0);
    } while (localView == null);
    paramListView.setSelectionFromTop(i, localView.getTop() - paramInt);
  }
  
  public static boolean b(ListView paramListView, int paramInt)
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19) {
      bool = paramListView.canScrollList(paramInt);
    }
    label82:
    int k;
    int m;
    do
    {
      int j;
      int n;
      int i1;
      do
      {
        int i;
        do
        {
          return bool;
          i = paramListView.getChildCount();
          bool = false;
        } while (i == 0);
        j = paramListView.getFirstVisiblePosition();
        if (paramInt <= 0) {
          break label82;
        }
        n = paramListView.getChildAt(i - 1).getBottom();
        if (i + j < paramListView.getCount()) {
          break;
        }
        i1 = paramListView.getHeight() - paramListView.getListPaddingBottom();
        bool = false;
      } while (n <= i1);
      return true;
      k = paramListView.getChildAt(0).getTop();
      if (j > 0) {
        break;
      }
      m = paramListView.getListPaddingTop();
      bool = false;
    } while (k >= m);
    return true;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.l
 * JD-Core Version:    0.7.0.1
 */