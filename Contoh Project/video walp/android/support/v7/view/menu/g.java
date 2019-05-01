package android.support.v7.view.menu;

import android.support.v7.a.a.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class g
  extends BaseAdapter
{
  static final int a = a.g.abc_popup_menu_item_layout;
  h b;
  private int c = -1;
  private boolean d;
  private final boolean e;
  private final LayoutInflater f;
  
  public g(h paramh, LayoutInflater paramLayoutInflater, boolean paramBoolean)
  {
    this.e = paramBoolean;
    this.f = paramLayoutInflater;
    this.b = paramh;
    b();
  }
  
  public h a()
  {
    return this.b;
  }
  
  public j a(int paramInt)
  {
    if (this.e) {}
    for (ArrayList localArrayList = this.b.l();; localArrayList = this.b.i())
    {
      if ((this.c >= 0) && (paramInt >= this.c)) {
        paramInt++;
      }
      return (j)localArrayList.get(paramInt);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  void b()
  {
    j localj = this.b.r();
    if (localj != null)
    {
      ArrayList localArrayList = this.b.l();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++) {
        if ((j)localArrayList.get(j) == localj)
        {
          this.c = j;
          return;
        }
      }
    }
    this.c = -1;
  }
  
  public int getCount()
  {
    if (this.e) {}
    for (ArrayList localArrayList = this.b.l(); this.c < 0; localArrayList = this.b.i()) {
      return localArrayList.size();
    }
    return -1 + localArrayList.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {}
    for (View localView = this.f.inflate(a, paramViewGroup, false);; localView = paramView)
    {
      p.a locala = (p.a)localView;
      if (this.d) {
        ((ListMenuItemView)localView).setForceShowIcon(true);
      }
      locala.a(a(paramInt), 0);
      return localView;
    }
  }
  
  public void notifyDataSetChanged()
  {
    b();
    super.notifyDataSetChanged();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.g
 * JD-Core Version:    0.7.0.1
 */