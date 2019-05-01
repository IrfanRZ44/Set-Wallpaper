package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.design.a.d;
import android.support.transition.AutoTransition;
import android.support.transition.TransitionSet;
import android.support.transition.ae;
import android.support.v4.f.k.a;
import android.support.v4.f.k.c;
import android.support.v4.view.b.b;
import android.support.v4.view.s;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.p;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class BottomNavigationMenuView
  extends ViewGroup
  implements p
{
  private final TransitionSet a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final View.OnClickListener f;
  private final k.a<BottomNavigationItemView> g = new k.c(5);
  private boolean h = true;
  private BottomNavigationItemView[] i;
  private int j = 0;
  private int k = 0;
  private ColorStateList l;
  private ColorStateList m;
  private int n;
  private int[] o;
  private BottomNavigationPresenter p;
  private h q;
  
  public BottomNavigationMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BottomNavigationMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getResources();
    this.b = localResources.getDimensionPixelSize(a.d.design_bottom_navigation_item_max_width);
    this.c = localResources.getDimensionPixelSize(a.d.design_bottom_navigation_item_min_width);
    this.d = localResources.getDimensionPixelSize(a.d.design_bottom_navigation_active_item_max_width);
    this.e = localResources.getDimensionPixelSize(a.d.design_bottom_navigation_height);
    this.a = new AutoTransition();
    this.a.a(0);
    this.a.c(115L);
    this.a.b(new b());
    this.a.b(new e());
    this.f = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        j localj = ((BottomNavigationItemView)paramAnonymousView).getItemData();
        if (!BottomNavigationMenuView.b(BottomNavigationMenuView.this).a(localj, BottomNavigationMenuView.a(BottomNavigationMenuView.this), 0)) {
          localj.setChecked(true);
        }
      }
    };
    this.o = new int[5];
  }
  
  private BottomNavigationItemView getNewItem()
  {
    BottomNavigationItemView localBottomNavigationItemView = (BottomNavigationItemView)this.g.a();
    if (localBottomNavigationItemView == null) {
      localBottomNavigationItemView = new BottomNavigationItemView(getContext());
    }
    return localBottomNavigationItemView;
  }
  
  public void a()
  {
    removeAllViews();
    if (this.i != null) {
      for (BottomNavigationItemView localBottomNavigationItemView2 : this.i) {
        this.g.a(localBottomNavigationItemView2);
      }
    }
    if (this.q.size() == 0)
    {
      this.j = 0;
      this.k = 0;
      this.i = null;
      return;
    }
    this.i = new BottomNavigationItemView[this.q.size()];
    if (this.q.size() > 3) {}
    for (boolean bool = true;; bool = false)
    {
      this.h = bool;
      for (int i1 = 0; i1 < this.q.size(); i1++)
      {
        this.p.b(true);
        this.q.getItem(i1).setCheckable(true);
        this.p.b(false);
        BottomNavigationItemView localBottomNavigationItemView1 = getNewItem();
        this.i[i1] = localBottomNavigationItemView1;
        localBottomNavigationItemView1.setIconTintList(this.l);
        localBottomNavigationItemView1.setTextColor(this.m);
        localBottomNavigationItemView1.setItemBackground(this.n);
        localBottomNavigationItemView1.setShiftingMode(this.h);
        localBottomNavigationItemView1.a((j)this.q.getItem(i1), 0);
        localBottomNavigationItemView1.setItemPosition(i1);
        localBottomNavigationItemView1.setOnClickListener(this.f);
        addView(localBottomNavigationItemView1);
      }
    }
    this.k = Math.min(-1 + this.q.size(), this.k);
    this.q.getItem(this.k).setChecked(true);
  }
  
  void a(int paramInt)
  {
    int i1 = this.q.size();
    for (int i2 = 0;; i2++) {
      if (i2 < i1)
      {
        MenuItem localMenuItem = this.q.getItem(i2);
        if (paramInt == localMenuItem.getItemId())
        {
          this.j = paramInt;
          this.k = i2;
          localMenuItem.setChecked(true);
        }
      }
      else
      {
        return;
      }
    }
  }
  
  public void b()
  {
    int i1 = this.q.size();
    if (i1 != this.i.length) {
      a();
    }
    for (;;)
    {
      return;
      int i2 = this.j;
      for (int i3 = 0; i3 < i1; i3++)
      {
        MenuItem localMenuItem = this.q.getItem(i3);
        if (localMenuItem.isChecked())
        {
          this.j = localMenuItem.getItemId();
          this.k = i3;
        }
      }
      if (i2 != this.j) {
        ae.a(this, this.a);
      }
      for (int i4 = 0; i4 < i1; i4++)
      {
        this.p.b(true);
        this.i[i4].a((j)this.q.getItem(i4), 0);
        this.p.b(false);
      }
    }
  }
  
  public ColorStateList getIconTintList()
  {
    return this.l;
  }
  
  public int getItemBackgroundRes()
  {
    return this.n;
  }
  
  public ColorStateList getItemTextColor()
  {
    return this.m;
  }
  
  public int getSelectedItemId()
  {
    return this.j;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public void initialize(h paramh)
  {
    this.q = paramh;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = 0;
    int i5 = 0;
    while (i4 < i1)
    {
      View localView = getChildAt(i4);
      if (localView.getVisibility() == 8)
      {
        i4++;
      }
      else
      {
        if (s.e(this) == 1) {
          localView.layout(i2 - i5 - localView.getMeasuredWidth(), 0, i2 - i5, i3);
        }
        for (;;)
        {
          i5 += localView.getMeasuredWidth();
          break;
          localView.layout(i5, 0, i5 + localView.getMeasuredWidth(), i3);
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = getChildCount();
    int i3 = View.MeasureSpec.makeMeasureSpec(this.e, 1073741824);
    int i12;
    int i13;
    int i14;
    int i15;
    if (this.h)
    {
      int i10 = i2 - 1;
      int i11 = Math.min(i1 - i10 * this.c, this.d);
      i12 = Math.min((i1 - i11) / i10, this.b);
      i13 = i1 - i11 - i10 * i12;
      i14 = 0;
      if (i14 >= i2) {
        break label252;
      }
      int[] arrayOfInt2 = this.o;
      if (i14 == this.k)
      {
        i15 = i11;
        label111:
        arrayOfInt2[i14] = i15;
        if (i13 <= 0) {
          break label364;
        }
        int[] arrayOfInt3 = this.o;
        arrayOfInt3[i14] = (1 + arrayOfInt3[i14]);
      }
    }
    label364:
    for (int i16 = i13 - 1;; i16 = i13)
    {
      i14++;
      i13 = i16;
      break;
      i15 = i12;
      break label111;
      if (i2 == 0) {}
      for (int i4 = 1;; i4 = i2)
      {
        int i5 = Math.min(i1 / i4, this.d);
        int i6 = i1 - i5 * i2;
        for (int i7 = 0; i7 < i2; i7++)
        {
          this.o[i7] = i5;
          if (i6 > 0)
          {
            int[] arrayOfInt1 = this.o;
            arrayOfInt1[i7] = (1 + arrayOfInt1[i7]);
            i6--;
          }
        }
      }
      label252:
      int i8 = 0;
      int i9 = 0;
      if (i8 < i2)
      {
        View localView = getChildAt(i8);
        if (localView.getVisibility() == 8) {}
        for (;;)
        {
          i8++;
          break;
          localView.measure(View.MeasureSpec.makeMeasureSpec(this.o[i8], 1073741824), i3);
          localView.getLayoutParams().width = localView.getMeasuredWidth();
          i9 += localView.getMeasuredWidth();
        }
      }
      setMeasuredDimension(View.resolveSizeAndState(i9, View.MeasureSpec.makeMeasureSpec(i9, 1073741824), 0), View.resolveSizeAndState(this.e, i3, 0));
      return;
    }
  }
  
  public void setIconTintList(ColorStateList paramColorStateList)
  {
    this.l = paramColorStateList;
    if (this.i == null) {}
    for (;;)
    {
      return;
      BottomNavigationItemView[] arrayOfBottomNavigationItemView = this.i;
      int i1 = arrayOfBottomNavigationItemView.length;
      for (int i2 = 0; i2 < i1; i2++) {
        arrayOfBottomNavigationItemView[i2].setIconTintList(paramColorStateList);
      }
    }
  }
  
  public void setItemBackgroundRes(int paramInt)
  {
    this.n = paramInt;
    if (this.i == null) {}
    for (;;)
    {
      return;
      BottomNavigationItemView[] arrayOfBottomNavigationItemView = this.i;
      int i1 = arrayOfBottomNavigationItemView.length;
      for (int i2 = 0; i2 < i1; i2++) {
        arrayOfBottomNavigationItemView[i2].setItemBackground(paramInt);
      }
    }
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.m = paramColorStateList;
    if (this.i == null) {}
    for (;;)
    {
      return;
      BottomNavigationItemView[] arrayOfBottomNavigationItemView = this.i;
      int i1 = arrayOfBottomNavigationItemView.length;
      for (int i2 = 0; i2 < i1; i2++) {
        arrayOfBottomNavigationItemView[i2].setTextColor(paramColorStateList);
      }
    }
  }
  
  public void setPresenter(BottomNavigationPresenter paramBottomNavigationPresenter)
  {
    this.p = paramBottomNavigationPresenter;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationMenuView
 * JD-Core Version:    0.7.0.1
 */