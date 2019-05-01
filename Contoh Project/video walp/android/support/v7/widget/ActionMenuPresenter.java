package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.b.a;
import android.support.v7.a.a.a;
import android.support.v7.a.a.g;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.n;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.p.a;
import android.support.v7.view.menu.s;
import android.support.v7.view.menu.u;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

class ActionMenuPresenter
  extends android.support.v7.view.menu.b
  implements b.a
{
  private b A;
  d g;
  e h;
  a i;
  c j;
  final f k = new f();
  int l;
  private Drawable m;
  private boolean n;
  private boolean o;
  private boolean p;
  private int q;
  private int r;
  private int s;
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w;
  private int x;
  private final SparseBooleanArray y = new SparseBooleanArray();
  private View z;
  
  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, a.g.abc_action_menu_layout, a.g.abc_action_menu_item_layout);
  }
  
  private View a(MenuItem paramMenuItem)
  {
    ViewGroup localViewGroup = (ViewGroup)this.f;
    View localView;
    if (localViewGroup == null)
    {
      localView = null;
      return localView;
    }
    int i1 = localViewGroup.getChildCount();
    for (int i2 = 0;; i2++)
    {
      if (i2 >= i1) {
        break label68;
      }
      localView = localViewGroup.getChildAt(i2);
      if (((localView instanceof p.a)) && (((p.a)localView).getItemData() == paramMenuItem)) {
        break;
      }
    }
    label68:
    return null;
  }
  
  public p a(ViewGroup paramViewGroup)
  {
    p localp1 = this.f;
    p localp2 = super.a(paramViewGroup);
    if (localp1 != localp2) {
      ((ActionMenuView)localp2).setPresenter(this);
    }
    return localp2;
  }
  
  public View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramj.getActionView();
    if ((localView == null) || (paramj.n())) {
      localView = super.a(paramj, paramView, paramViewGroup);
    }
    if (paramj.isActionViewExpanded()) {}
    for (int i1 = 8;; i1 = 0)
    {
      localView.setVisibility(i1);
      ActionMenuView localActionMenuView = (ActionMenuView)paramViewGroup;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (!localActionMenuView.checkLayoutParams(localLayoutParams)) {
        localView.setLayoutParams(localActionMenuView.generateLayoutParams(localLayoutParams));
      }
      return localView;
    }
  }
  
  public void a(Context paramContext, h paramh)
  {
    super.a(paramContext, paramh);
    Resources localResources = paramContext.getResources();
    android.support.v7.view.a locala = android.support.v7.view.a.a(paramContext);
    if (!this.p) {
      this.o = locala.b();
    }
    if (!this.v) {
      this.q = locala.c();
    }
    if (!this.t) {
      this.s = locala.a();
    }
    int i1 = this.q;
    if (this.o)
    {
      if (this.g == null)
      {
        this.g = new d(this.a);
        if (this.n)
        {
          this.g.setImageDrawable(this.m);
          this.m = null;
          this.n = false;
        }
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.g.measure(i2, i2);
      }
      i1 -= this.g.getMeasuredWidth();
    }
    for (;;)
    {
      this.r = i1;
      this.x = ((int)(56.0F * localResources.getDisplayMetrics().density));
      this.z = null;
      return;
      this.g = null;
    }
  }
  
  public void a(Configuration paramConfiguration)
  {
    if (!this.t) {
      this.s = android.support.v7.view.a.a(this.b).a();
    }
    if (this.c != null) {
      this.c.a(true);
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    if (this.g != null)
    {
      this.g.setImageDrawable(paramDrawable);
      return;
    }
    this.n = true;
    this.m = paramDrawable;
  }
  
  public void a(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {}
    MenuItem localMenuItem;
    do
    {
      SavedState localSavedState;
      do
      {
        return;
        localSavedState = (SavedState)paramParcelable;
      } while (localSavedState.a <= 0);
      localMenuItem = this.c.findItem(localSavedState.a);
    } while (localMenuItem == null);
    a((u)localMenuItem.getSubMenu());
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    h();
    super.a(paramh, paramBoolean);
  }
  
  public void a(j paramj, p.a parama)
  {
    parama.a(paramj, 0);
    ActionMenuView localActionMenuView = (ActionMenuView)this.f;
    ActionMenuItemView localActionMenuItemView = (ActionMenuItemView)parama;
    localActionMenuItemView.setItemInvoker(localActionMenuView);
    if (this.A == null) {
      this.A = new b();
    }
    localActionMenuItemView.setPopupCallback(this.A);
  }
  
  public void a(ActionMenuView paramActionMenuView)
  {
    this.f = paramActionMenuView;
    paramActionMenuView.initialize(this.c);
  }
  
  public void a(boolean paramBoolean)
  {
    int i1 = 1;
    super.a(paramBoolean);
    ((View)this.f).requestLayout();
    if (this.c != null)
    {
      ArrayList localArrayList2 = this.c.k();
      int i5 = localArrayList2.size();
      for (int i6 = 0; i6 < i5; i6++)
      {
        android.support.v4.view.b localb = ((j)localArrayList2.get(i6)).a();
        if (localb != null) {
          localb.setSubUiVisibilityListener(this);
        }
      }
    }
    ArrayList localArrayList1;
    int i2;
    int i3;
    int i4;
    if (this.c != null)
    {
      localArrayList1 = this.c.l();
      boolean bool = this.o;
      i2 = 0;
      if (bool)
      {
        i2 = 0;
        if (localArrayList1 != null)
        {
          i3 = localArrayList1.size();
          if (i3 != i1) {
            break label263;
          }
          if (((j)localArrayList1.get(0)).isActionViewExpanded()) {
            break label257;
          }
          i4 = i1;
          label147:
          i2 = i4;
        }
      }
      if (i2 == 0) {
        break label279;
      }
      if (this.g == null) {
        this.g = new d(this.a);
      }
      ViewGroup localViewGroup = (ViewGroup)this.g.getParent();
      if (localViewGroup != this.f)
      {
        if (localViewGroup != null) {
          localViewGroup.removeView(this.g);
        }
        ActionMenuView localActionMenuView = (ActionMenuView)this.f;
        localActionMenuView.addView(this.g, localActionMenuView.generateOverflowButtonLayoutParams());
      }
    }
    for (;;)
    {
      ((ActionMenuView)this.f).setOverflowReserved(this.o);
      return;
      localArrayList1 = null;
      break;
      label257:
      i4 = 0;
      break label147;
      label263:
      if (i3 > 0) {}
      for (;;)
      {
        i2 = i1;
        break;
        i1 = 0;
      }
      label279:
      if ((this.g != null) && (this.g.getParent() == this.f)) {
        ((ViewGroup)this.f).removeView(this.g);
      }
    }
  }
  
  public boolean a()
  {
    int i1;
    ArrayList localArrayList1;
    int i2;
    int i3;
    int i4;
    ViewGroup localViewGroup;
    int i5;
    int i6;
    int i7;
    int i8;
    label64:
    j localj3;
    if (this.c != null)
    {
      ArrayList localArrayList2 = this.c.i();
      i1 = localArrayList2.size();
      localArrayList1 = localArrayList2;
      i2 = this.s;
      i3 = this.r;
      i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
      localViewGroup = (ViewGroup)this.f;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
      if (i8 >= i1) {
        break label146;
      }
      localj3 = (j)localArrayList1.get(i8);
      if (!localj3.l()) {
        break label126;
      }
      i5++;
      label92:
      if ((!this.w) || (!localj3.isActionViewExpanded())) {
        break label849;
      }
    }
    label146:
    label310:
    label447:
    label833:
    label849:
    for (int i36 = 0;; i36 = i2)
    {
      i8++;
      i2 = i36;
      break label64;
      i1 = 0;
      localArrayList1 = null;
      break;
      label126:
      if (localj3.k())
      {
        i6++;
        break label92;
      }
      i7 = 1;
      break label92;
      if ((this.o) && ((i7 != 0) || (i5 + i6 > i2))) {
        i2--;
      }
      int i9 = i2 - i5;
      SparseBooleanArray localSparseBooleanArray = this.y;
      localSparseBooleanArray.clear();
      int i10;
      int i35;
      if (this.u)
      {
        i10 = i3 / this.x;
        i35 = i3 % this.x;
      }
      for (int i11 = this.x + i35 / i10;; i11 = 0)
      {
        int i12 = 0;
        int i13 = 0;
        int i14 = i10;
        j localj1;
        View localView2;
        int i15;
        int i33;
        if (i12 < i1)
        {
          localj1 = (j)localArrayList1.get(i12);
          if (localj1.l())
          {
            localView2 = a(localj1, this.z, localViewGroup);
            if (this.z == null) {
              this.z = localView2;
            }
            if (this.u)
            {
              i14 -= ActionMenuView.measureChildForCells(localView2, i11, i14, i4, 0);
              i15 = localView2.getMeasuredWidth();
              i33 = i3 - i15;
              if (i13 != 0) {
                break label833;
              }
            }
          }
        }
        for (;;)
        {
          int i34 = localj1.getGroupId();
          if (i34 != 0) {
            localSparseBooleanArray.put(i34, true);
          }
          localj1.d(true);
          int i16 = i33;
          int i17 = i9;
          i12++;
          i3 = i16;
          i9 = i17;
          i13 = i15;
          break;
          localView2.measure(i4, i4);
          break label310;
          int i18;
          boolean bool1;
          boolean bool2;
          View localView1;
          int i27;
          int i26;
          int i30;
          boolean bool3;
          int i19;
          int i20;
          if (localj1.k())
          {
            i18 = localj1.getGroupId();
            bool1 = localSparseBooleanArray.get(i18);
            if (((i9 > 0) || (bool1)) && (i3 > 0) && ((!this.u) || (i14 > 0)))
            {
              bool2 = true;
              if (!bool2) {
                break label818;
              }
              localView1 = a(localj1, this.z, localViewGroup);
              if (this.z == null) {
                this.z = localView1;
              }
              if (!this.u) {
                break label638;
              }
              int i31 = ActionMenuView.measureChildForCells(localView1, i11, i14, i4, 0);
              int i32 = i14 - i31;
              if (i31 != 0) {
                break label811;
              }
              i27 = 0;
              i26 = i32;
              int i28 = localView1.getMeasuredWidth();
              i3 -= i28;
              if (i13 == 0) {
                i13 = i28;
              }
              if (!this.u) {
                break label668;
              }
              if (i3 < 0) {
                break label662;
              }
              i30 = 1;
              bool3 = i27 & i30;
              i19 = i13;
              i20 = i26;
            }
          }
          for (;;)
          {
            int i21;
            if ((bool3) && (i18 != 0))
            {
              localSparseBooleanArray.put(i18, true);
              i21 = i9;
            }
            for (;;)
            {
              if (bool3) {
                i21--;
              }
              localj1.d(bool3);
              i15 = i19;
              i16 = i3;
              int i22 = i20;
              i17 = i21;
              i14 = i22;
              break;
              bool2 = false;
              break label447;
              label638:
              localView1.measure(i4, i4);
              int i25 = bool2;
              i26 = i14;
              i27 = i25;
              break label519;
              i30 = 0;
              break label557;
              if (i3 + i13 > 0) {}
              for (int i29 = 1;; i29 = 0)
              {
                bool3 = i27 & i29;
                i19 = i13;
                i20 = i26;
                break;
              }
              if (bool1)
              {
                localSparseBooleanArray.put(i18, false);
                int i23 = i9;
                int i24 = 0;
                for (;;)
                {
                  if (i24 < i12)
                  {
                    j localj2 = (j)localArrayList1.get(i24);
                    if (localj2.getGroupId() == i18)
                    {
                      if (localj2.j()) {
                        i23++;
                      }
                      localj2.d(false);
                    }
                    i24++;
                    continue;
                    localj1.d(false);
                    i15 = i13;
                    i16 = i3;
                    i17 = i9;
                    break;
                    return true;
                  }
                }
                i21 = i23;
              }
              else
              {
                i21 = i9;
              }
            }
            i27 = bool2;
            break label515;
            bool3 = bool2;
            i19 = i13;
            i20 = i14;
          }
          i15 = i13;
        }
        i10 = 0;
      }
    }
  }
  
  public boolean a(int paramInt, j paramj)
  {
    return paramj.j();
  }
  
  public boolean a(u paramu)
  {
    if (!paramu.hasVisibleItems()) {}
    View localView;
    do
    {
      return false;
      for (u localu = paramu; localu.s() != this.c; localu = (u)localu.s()) {}
      localView = a(localu.getItem());
    } while (localView == null);
    this.l = paramu.getItem().getItemId();
    int i1 = paramu.size();
    int i2 = 0;
    if (i2 < i1)
    {
      MenuItem localMenuItem = paramu.getItem(i2);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null)) {}
    }
    for (boolean bool = true;; bool = false)
    {
      this.i = new a(this.b, paramu, localView);
      this.i.a(bool);
      this.i.b();
      super.a(paramu);
      return true;
      i2++;
      break;
    }
  }
  
  public boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.g) {
      return false;
    }
    return super.a(paramViewGroup, paramInt);
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      super.a(null);
    }
    while (this.c == null) {
      return;
    }
    this.c.b(false);
  }
  
  public Parcelable c()
  {
    SavedState localSavedState = new SavedState();
    localSavedState.a = this.l;
    return localSavedState;
  }
  
  public void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
    this.p = true;
  }
  
  public void d(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public Drawable e()
  {
    if (this.g != null) {
      return this.g.getDrawable();
    }
    if (this.n) {
      return this.m;
    }
    return null;
  }
  
  public boolean f()
  {
    if ((this.o) && (!j()) && (this.c != null) && (this.f != null) && (this.j == null) && (!this.c.l().isEmpty()))
    {
      this.j = new c(new e(this.b, this.c, this.g, true));
      ((View)this.f).post(this.j);
      super.a(null);
      return true;
    }
    return false;
  }
  
  public boolean g()
  {
    if ((this.j != null) && (this.f != null))
    {
      ((View)this.f).removeCallbacks(this.j);
      this.j = null;
      return true;
    }
    e locale = this.h;
    if (locale != null)
    {
      locale.e();
      return true;
    }
    return false;
  }
  
  public boolean h()
  {
    return g() | i();
  }
  
  public boolean i()
  {
    if (this.i != null)
    {
      this.i.e();
      return true;
    }
    return false;
  }
  
  public boolean j()
  {
    return (this.h != null) && (this.h.g());
  }
  
  public boolean k()
  {
    return (this.j != null) || (j());
  }
  
  public boolean l()
  {
    return this.o;
  }
  
  private static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public ActionMenuPresenter.SavedState a(Parcel paramAnonymousParcel)
      {
        return new ActionMenuPresenter.SavedState(paramAnonymousParcel);
      }
      
      public ActionMenuPresenter.SavedState[] a(int paramAnonymousInt)
      {
        return new ActionMenuPresenter.SavedState[paramAnonymousInt];
      }
    };
    public int a;
    
    SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.a = paramParcel.readInt();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.a);
    }
  }
  
  private class a
    extends n
  {
    public a(Context paramContext, u paramu, View paramView)
    {
      super(paramu, paramView, false, a.a.actionOverflowMenuStyle);
      if (!((j)paramu.getItem()).j()) {
        if (ActionMenuPresenter.this.g != null) {
          break label61;
        }
      }
      label61:
      for (Object localObject = (View)ActionMenuPresenter.c(ActionMenuPresenter.this);; localObject = ActionMenuPresenter.this.g)
      {
        a((View)localObject);
        a(ActionMenuPresenter.this.k);
        return;
      }
    }
    
    protected void f()
    {
      ActionMenuPresenter.this.i = null;
      ActionMenuPresenter.this.l = 0;
      super.f();
    }
  }
  
  private class b
    extends ActionMenuItemView.b
  {
    b() {}
    
    public s a()
    {
      if (ActionMenuPresenter.this.i != null) {
        return ActionMenuPresenter.this.i.c();
      }
      return null;
    }
  }
  
  private class c
    implements Runnable
  {
    private ActionMenuPresenter.e b;
    
    public c(ActionMenuPresenter.e parame)
    {
      this.b = parame;
    }
    
    public void run()
    {
      if (ActionMenuPresenter.d(ActionMenuPresenter.this) != null) {
        ActionMenuPresenter.e(ActionMenuPresenter.this).f();
      }
      View localView = (View)ActionMenuPresenter.f(ActionMenuPresenter.this);
      if ((localView != null) && (localView.getWindowToken() != null) && (this.b.d())) {
        ActionMenuPresenter.this.h = this.b;
      }
      ActionMenuPresenter.this.j = null;
    }
  }
  
  private class d
    extends AppCompatImageView
    implements ActionMenuView.ActionMenuChildView
  {
    private final float[] b = new float[2];
    
    public d(Context paramContext)
    {
      super(null, a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      TooltipCompat.setTooltipText(this, getContentDescription());
      setOnTouchListener(new ForwardingListener(this)
      {
        public s getPopup()
        {
          if (ActionMenuPresenter.this.h == null) {
            return null;
          }
          return ActionMenuPresenter.this.h.c();
        }
        
        public boolean onForwardingStarted()
        {
          ActionMenuPresenter.this.f();
          return true;
        }
        
        public boolean onForwardingStopped()
        {
          if (ActionMenuPresenter.this.j != null) {
            return false;
          }
          ActionMenuPresenter.this.g();
          return true;
        }
      });
    }
    
    public boolean needsDividerAfter()
    {
      return false;
    }
    
    public boolean needsDividerBefore()
    {
      return false;
    }
    
    public boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      ActionMenuPresenter.this.f();
      return true;
    }
    
    protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        int j = getHeight();
        int k = Math.max(i, j) / 2;
        int m = getPaddingLeft() - getPaddingRight();
        int n = getPaddingTop() - getPaddingBottom();
        int i1 = (i + m) / 2;
        int i2 = (j + n) / 2;
        android.support.v4.a.a.a.a(localDrawable2, i1 - k, i2 - k, i1 + k, i2 + k);
      }
      return bool;
    }
  }
  
  private class e
    extends n
  {
    public e(Context paramContext, h paramh, View paramView, boolean paramBoolean)
    {
      super(paramh, paramView, paramBoolean, a.a.actionOverflowMenuStyle);
      a(8388613);
      a(ActionMenuPresenter.this.k);
    }
    
    protected void f()
    {
      if (ActionMenuPresenter.a(ActionMenuPresenter.this) != null) {
        ActionMenuPresenter.b(ActionMenuPresenter.this).close();
      }
      ActionMenuPresenter.this.h = null;
      super.f();
    }
  }
  
  private class f
    implements o.a
  {
    f() {}
    
    public void a(h paramh, boolean paramBoolean)
    {
      if ((paramh instanceof u)) {
        paramh.p().b(false);
      }
      o.a locala = ActionMenuPresenter.this.d();
      if (locala != null) {
        locala.a(paramh, paramBoolean);
      }
    }
    
    public boolean a(h paramh)
    {
      if (paramh == null) {
        return false;
      }
      ActionMenuPresenter.this.l = ((u)paramh).getItem().getItemId();
      o.a locala = ActionMenuPresenter.this.d();
      if (locala != null) {}
      for (boolean bool = locala.a(paramh);; bool = false) {
        return bool;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionMenuPresenter
 * JD-Core Version:    0.7.0.1
 */