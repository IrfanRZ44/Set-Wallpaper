package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b
  implements o
{
  protected Context a;
  protected Context b;
  protected h c;
  protected LayoutInflater d;
  protected LayoutInflater e;
  protected p f;
  private o.a g;
  private int h;
  private int i;
  private int j;
  
  public b(Context paramContext, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public p a(ViewGroup paramViewGroup)
  {
    if (this.f == null)
    {
      this.f = ((p)this.d.inflate(this.h, paramViewGroup, false));
      this.f.initialize(this.c);
      a(true);
    }
    return this.f;
  }
  
  public View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof p.a)) {}
    for (p.a locala = (p.a)paramView;; locala = b(paramViewGroup))
    {
      a(paramj, locala);
      return (View)locala;
    }
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void a(Context paramContext, h paramh)
  {
    this.b = paramContext;
    this.e = LayoutInflater.from(this.b);
    this.c = paramh;
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    if (this.g != null) {
      this.g.a(paramh, paramBoolean);
    }
  }
  
  public abstract void a(j paramj, p.a parama);
  
  public void a(o.a parama)
  {
    this.g = parama;
  }
  
  protected void a(View paramView, int paramInt)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null) {
      localViewGroup.removeView(paramView);
    }
    ((ViewGroup)this.f).addView(paramView, paramInt);
  }
  
  public void a(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.f;
    if (localViewGroup == null) {}
    label190:
    label199:
    for (;;)
    {
      return;
      int k;
      int i1;
      if (this.c != null)
      {
        this.c.j();
        ArrayList localArrayList = this.c.i();
        int m = localArrayList.size();
        int n = 0;
        k = 0;
        if (n < m)
        {
          j localj1 = (j)localArrayList.get(n);
          if (!a(k, localj1)) {
            break label190;
          }
          View localView1 = localViewGroup.getChildAt(k);
          if ((localView1 instanceof p.a)) {}
          for (j localj2 = ((p.a)localView1).getItemData();; localj2 = null)
          {
            View localView2 = a(localj1, localView1, localViewGroup);
            if (localj1 != localj2)
            {
              localView2.setPressed(false);
              localView2.jumpDrawablesToCurrentState();
            }
            if (localView2 != localView1) {
              a(localView2, k);
            }
            i1 = k + 1;
            n++;
            k = i1;
            break;
          }
        }
      }
      for (;;)
      {
        if (k >= localViewGroup.getChildCount()) {
          break label199;
        }
        if (!a(localViewGroup, k))
        {
          k++;
          continue;
          i1 = k;
          break;
          k = 0;
        }
      }
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(int paramInt, j paramj)
  {
    return true;
  }
  
  public boolean a(h paramh, j paramj)
  {
    return false;
  }
  
  public boolean a(u paramu)
  {
    if (this.g != null) {
      return this.g.a(paramu);
    }
    return false;
  }
  
  protected boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public int b()
  {
    return this.j;
  }
  
  public p.a b(ViewGroup paramViewGroup)
  {
    return (p.a)this.d.inflate(this.i, paramViewGroup, false);
  }
  
  public boolean b(h paramh, j paramj)
  {
    return false;
  }
  
  public o.a d()
  {
    return this.g;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.b
 * JD-Core Version:    0.7.0.1
 */