package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class m
  implements o, s, AdapterView.OnItemClickListener
{
  private Rect a;
  
  protected static int a(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt)
  {
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int m = 0;
    int n = 0;
    View localView = null;
    int i1 = 0;
    Object localObject1 = paramViewGroup;
    Object localObject2;
    label83:
    int i3;
    if (m < k)
    {
      int i2 = paramListAdapter.getItemViewType(m);
      if (i2 != n)
      {
        n = i2;
        localView = null;
      }
      if (localObject1 != null) {
        break label145;
      }
      localObject2 = new FrameLayout(paramContext);
      localView = paramListAdapter.getView(m, localView, (ViewGroup)localObject2);
      localView.measure(i, j);
      i3 = localView.getMeasuredWidth();
      if (i3 >= paramInt) {
        return paramInt;
      }
      if (i3 <= i1) {
        break label152;
      }
    }
    for (;;)
    {
      m++;
      i1 = i3;
      localObject1 = localObject2;
      break;
      return i1;
      label145:
      localObject2 = localObject1;
      break label83;
      label152:
      i3 = i1;
    }
  }
  
  protected static g a(ListAdapter paramListAdapter)
  {
    if ((paramListAdapter instanceof HeaderViewListAdapter)) {
      return (g)((HeaderViewListAdapter)paramListAdapter).getWrappedAdapter();
    }
    return (g)paramListAdapter;
  }
  
  protected static boolean b(h paramh)
  {
    int i = paramh.size();
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        MenuItem localMenuItem = paramh.getItem(j);
        if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null)) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public abstract void a(int paramInt);
  
  public void a(Context paramContext, h paramh) {}
  
  public void a(Rect paramRect)
  {
    this.a = paramRect;
  }
  
  public abstract void a(h paramh);
  
  public abstract void a(View paramView);
  
  public abstract void a(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public boolean a(h paramh, j paramj)
  {
    return false;
  }
  
  public int b()
  {
    return 0;
  }
  
  public abstract void b(int paramInt);
  
  public abstract void b(boolean paramBoolean);
  
  public boolean b(h paramh, j paramj)
  {
    return false;
  }
  
  public abstract void c(int paramInt);
  
  public abstract void c(boolean paramBoolean);
  
  protected boolean d()
  {
    return true;
  }
  
  public Rect e()
  {
    return this.a;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ListAdapter localListAdapter = (ListAdapter)paramAdapterView.getAdapter();
    h localh = a(localListAdapter).b;
    MenuItem localMenuItem = (MenuItem)localListAdapter.getItem(paramInt);
    if (d()) {}
    for (int i = 0;; i = 4)
    {
      localh.a(localMenuItem, this, i);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.m
 * JD-Core Version:    0.7.0.1
 */