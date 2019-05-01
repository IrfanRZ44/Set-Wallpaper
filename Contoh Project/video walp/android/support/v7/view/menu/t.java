package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.a.a.d;
import android.support.v7.a.a.g;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class t
  extends m
  implements o, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  final MenuPopupWindow a;
  View b;
  private final Context c;
  private final h d;
  private final g e;
  private final boolean f;
  private final int g;
  private final int h;
  private final int i;
  private final ViewTreeObserver.OnGlobalLayoutListener j = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public void onGlobalLayout()
    {
      if ((t.this.isShowing()) && (!t.this.a.isModal()))
      {
        View localView = t.this.b;
        if ((localView == null) || (!localView.isShown())) {
          t.this.dismiss();
        }
      }
      else
      {
        return;
      }
      t.this.a.show();
    }
  };
  private final View.OnAttachStateChangeListener k = new View.OnAttachStateChangeListener()
  {
    public void onViewAttachedToWindow(View paramAnonymousView) {}
    
    public void onViewDetachedFromWindow(View paramAnonymousView)
    {
      if (t.a(t.this) != null)
      {
        if (!t.a(t.this).isAlive()) {
          t.a(t.this, paramAnonymousView.getViewTreeObserver());
        }
        t.a(t.this).removeGlobalOnLayoutListener(t.b(t.this));
      }
      paramAnonymousView.removeOnAttachStateChangeListener(this);
    }
  };
  private PopupWindow.OnDismissListener l;
  private View m;
  private o.a n;
  private ViewTreeObserver o;
  private boolean p;
  private boolean q;
  private int r;
  private int s = 0;
  private boolean t;
  
  public t(Context paramContext, h paramh, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.c = paramContext;
    this.d = paramh;
    this.f = paramBoolean;
    this.e = new g(paramh, LayoutInflater.from(paramContext), this.f);
    this.h = paramInt1;
    this.i = paramInt2;
    Resources localResources = paramContext.getResources();
    this.g = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    this.m = paramView;
    this.a = new MenuPopupWindow(this.c, null, this.h, this.i);
    paramh.a(this, paramContext);
  }
  
  private boolean f()
  {
    if (isShowing()) {
      return true;
    }
    if ((this.p) || (this.m == null)) {
      return false;
    }
    this.b = this.m;
    this.a.setOnDismissListener(this);
    this.a.setOnItemClickListener(this);
    this.a.setModal(true);
    View localView = this.b;
    if (this.o == null) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.o = localView.getViewTreeObserver();
      if (i1 != 0) {
        this.o.addOnGlobalLayoutListener(this.j);
      }
      localView.addOnAttachStateChangeListener(this.k);
      this.a.setAnchorView(localView);
      this.a.setDropDownGravity(this.s);
      if (!this.q)
      {
        this.r = a(this.e, null, this.c, this.g);
        this.q = true;
      }
      this.a.setContentWidth(this.r);
      this.a.setInputMethodMode(2);
      this.a.setEpicenterBounds(e());
      this.a.show();
      ListView localListView = this.a.getListView();
      localListView.setOnKeyListener(this);
      if ((this.t) && (this.d.m() != null))
      {
        FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(this.c).inflate(a.g.abc_popup_menu_header_item_layout, localListView, false);
        TextView localTextView = (TextView)localFrameLayout.findViewById(16908310);
        if (localTextView != null) {
          localTextView.setText(this.d.m());
        }
        localFrameLayout.setEnabled(false);
        localListView.addHeaderView(localFrameLayout, null, false);
      }
      this.a.setAdapter(this.e);
      this.a.show();
      return true;
    }
  }
  
  public void a(int paramInt)
  {
    this.s = paramInt;
  }
  
  public void a(Parcelable paramParcelable) {}
  
  public void a(h paramh) {}
  
  public void a(h paramh, boolean paramBoolean)
  {
    if (paramh != this.d) {}
    do
    {
      return;
      dismiss();
    } while (this.n == null);
    this.n.a(paramh, paramBoolean);
  }
  
  public void a(o.a parama)
  {
    this.n = parama;
  }
  
  public void a(View paramView)
  {
    this.m = paramView;
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.l = paramOnDismissListener;
  }
  
  public void a(boolean paramBoolean)
  {
    this.q = false;
    if (this.e != null) {
      this.e.notifyDataSetChanged();
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(u paramu)
  {
    if (paramu.hasVisibleItems())
    {
      n localn = new n(this.c, paramu, this.b, this.f, this.h, this.i);
      localn.a(this.n);
      localn.a(m.b(paramu));
      localn.a(this.s);
      localn.a(this.l);
      this.l = null;
      this.d.b(false);
      if (localn.a(this.a.getHorizontalOffset(), this.a.getVerticalOffset()))
      {
        if (this.n != null) {
          this.n.a(paramu);
        }
        return true;
      }
    }
    return false;
  }
  
  public void b(int paramInt)
  {
    this.a.setHorizontalOffset(paramInt);
  }
  
  public void b(boolean paramBoolean)
  {
    this.e.a(paramBoolean);
  }
  
  public Parcelable c()
  {
    return null;
  }
  
  public void c(int paramInt)
  {
    this.a.setVerticalOffset(paramInt);
  }
  
  public void c(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public void dismiss()
  {
    if (isShowing()) {
      this.a.dismiss();
    }
  }
  
  public ListView getListView()
  {
    return this.a.getListView();
  }
  
  public boolean isShowing()
  {
    return (!this.p) && (this.a.isShowing());
  }
  
  public void onDismiss()
  {
    this.p = true;
    this.d.close();
    if (this.o != null)
    {
      if (!this.o.isAlive()) {
        this.o = this.b.getViewTreeObserver();
      }
      this.o.removeGlobalOnLayoutListener(this.j);
      this.o = null;
    }
    this.b.removeOnAttachStateChangeListener(this.k);
    if (this.l != null) {
      this.l.onDismiss();
    }
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public void show()
  {
    if (!f()) {
      throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.t
 * JD-Core Version:    0.7.0.1
 */