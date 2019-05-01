package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.support.v7.a.a.d;
import android.support.v7.a.a.g;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class e
  extends m
  implements o, View.OnKeyListener, PopupWindow.OnDismissListener
{
  final Handler a;
  final List<a> b = new ArrayList();
  View c;
  boolean d;
  private final Context e;
  private final int f;
  private final int g;
  private final int h;
  private final boolean i;
  private final List<h> j = new ArrayList();
  private final ViewTreeObserver.OnGlobalLayoutListener k = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public void onGlobalLayout()
    {
      if ((e.this.isShowing()) && (e.this.b.size() > 0) && (!((e.a)e.this.b.get(0)).a.isModal()))
      {
        View localView = e.this.c;
        if ((localView != null) && (localView.isShown())) {
          break label77;
        }
        e.this.dismiss();
      }
      for (;;)
      {
        return;
        label77:
        Iterator localIterator = e.this.b.iterator();
        while (localIterator.hasNext()) {
          ((e.a)localIterator.next()).a.show();
        }
      }
    }
  };
  private final View.OnAttachStateChangeListener l = new View.OnAttachStateChangeListener()
  {
    public void onViewAttachedToWindow(View paramAnonymousView) {}
    
    public void onViewDetachedFromWindow(View paramAnonymousView)
    {
      if (e.a(e.this) != null)
      {
        if (!e.a(e.this).isAlive()) {
          e.a(e.this, paramAnonymousView.getViewTreeObserver());
        }
        e.a(e.this).removeGlobalOnLayoutListener(e.b(e.this));
      }
      paramAnonymousView.removeOnAttachStateChangeListener(this);
    }
  };
  private final MenuItemHoverListener m = new MenuItemHoverListener()
  {
    public void onItemHoverEnter(final h paramAnonymoush, final MenuItem paramAnonymousMenuItem)
    {
      e.this.a.removeCallbacksAndMessages(null);
      int i = 0;
      int j = e.this.b.size();
      if (i < j) {
        if (paramAnonymoush != ((e.a)e.this.b.get(i)).b) {}
      }
      for (int k = i;; k = -1)
      {
        if (k == -1)
        {
          return;
          i++;
          break;
        }
        int m = k + 1;
        if (m < e.this.b.size()) {}
        for (final e.a locala = (e.a)e.this.b.get(m);; locala = null)
        {
          Runnable local1 = new Runnable()
          {
            public void run()
            {
              if (locala != null)
              {
                e.this.d = true;
                locala.b.b(false);
                e.this.d = false;
              }
              if ((paramAnonymousMenuItem.isEnabled()) && (paramAnonymousMenuItem.hasSubMenu())) {
                paramAnonymoush.a(paramAnonymousMenuItem, 4);
              }
            }
          };
          long l = 200L + SystemClock.uptimeMillis();
          e.this.a.postAtTime(local1, paramAnonymoush, l);
          return;
        }
      }
    }
    
    public void onItemHoverExit(h paramAnonymoush, MenuItem paramAnonymousMenuItem)
    {
      e.this.a.removeCallbacksAndMessages(paramAnonymoush);
    }
  };
  private int n = 0;
  private int o = 0;
  private View p;
  private int q;
  private boolean r;
  private boolean s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private o.a x;
  private ViewTreeObserver y;
  private PopupWindow.OnDismissListener z;
  
  public e(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.e = paramContext;
    this.p = paramView;
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramBoolean;
    this.v = false;
    this.q = g();
    Resources localResources = paramContext.getResources();
    this.f = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    this.a = new Handler();
  }
  
  private MenuItem a(h paramh1, h paramh2)
  {
    int i1 = paramh1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      MenuItem localMenuItem = paramh1.getItem(i2);
      if ((localMenuItem.hasSubMenu()) && (paramh2 == localMenuItem.getSubMenu())) {
        return localMenuItem;
      }
    }
    return null;
  }
  
  private View a(a parama, h paramh)
  {
    int i1 = 0;
    MenuItem localMenuItem = a(parama.b, paramh);
    if (localMenuItem == null) {
      return null;
    }
    ListView localListView = parama.a();
    ListAdapter localListAdapter = localListView.getAdapter();
    int i2;
    g localg;
    if ((localListAdapter instanceof HeaderViewListAdapter))
    {
      HeaderViewListAdapter localHeaderViewListAdapter = (HeaderViewListAdapter)localListAdapter;
      i2 = localHeaderViewListAdapter.getHeadersCount();
      localg = (g)localHeaderViewListAdapter.getWrappedAdapter();
      int i3 = localg.getCount();
      label72:
      if (i1 >= i3) {
        break label157;
      }
      if (localMenuItem != localg.a(i1)) {
        break label113;
      }
    }
    label157:
    for (int i4 = i1;; i4 = -1)
    {
      if (i4 == -1)
      {
        return null;
        localg = (g)localListAdapter;
        i2 = 0;
        break;
        label113:
        i1++;
        break label72;
      }
      int i5 = i4 + i2 - localListView.getFirstVisiblePosition();
      if ((i5 < 0) || (i5 >= localListView.getChildCount())) {
        return null;
      }
      return localListView.getChildAt(i5);
    }
  }
  
  private void c(h paramh)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.e);
    g localg = new g(paramh, localLayoutInflater, this.i);
    int i1;
    MenuPopupWindow localMenuPopupWindow;
    View localView;
    a locala1;
    label134:
    int i3;
    label168:
    int i5;
    int i4;
    label195:
    int i6;
    if ((!isShowing()) && (this.v))
    {
      localg.a(true);
      i1 = a(localg, null, this.e, this.f);
      localMenuPopupWindow = f();
      localMenuPopupWindow.setAdapter(localg);
      localMenuPopupWindow.setContentWidth(i1);
      localMenuPopupWindow.setDropDownGravity(this.o);
      if (this.b.size() <= 0) {
        break label378;
      }
      a locala3 = (a)this.b.get(-1 + this.b.size());
      localView = a(locala3, paramh);
      locala1 = locala3;
      if (localView == null) {
        break label526;
      }
      localMenuPopupWindow.setTouchModal(false);
      localMenuPopupWindow.setEnterTransition(null);
      int i2 = d(i1);
      if (i2 != 1) {
        break label387;
      }
      i3 = 1;
      this.q = i2;
      if (Build.VERSION.SDK_INT < 26) {
        break label393;
      }
      localMenuPopupWindow.setAnchorView(localView);
      i5 = 0;
      i4 = 0;
      if ((0x5 & this.o) != 5) {
        break label498;
      }
      if (i3 == 0) {
        break label485;
      }
      i6 = i4 + i1;
      label217:
      localMenuPopupWindow.setHorizontalOffset(i6);
      localMenuPopupWindow.setOverlapAnchor(true);
      localMenuPopupWindow.setVerticalOffset(i5);
    }
    for (;;)
    {
      a locala2 = new a(localMenuPopupWindow, paramh, this.q);
      this.b.add(locala2);
      localMenuPopupWindow.show();
      ListView localListView = localMenuPopupWindow.getListView();
      localListView.setOnKeyListener(this);
      if ((locala1 == null) && (this.w) && (paramh.m() != null))
      {
        FrameLayout localFrameLayout = (FrameLayout)localLayoutInflater.inflate(a.g.abc_popup_menu_header_item_layout, localListView, false);
        TextView localTextView = (TextView)localFrameLayout.findViewById(16908310);
        localFrameLayout.setEnabled(false);
        localTextView.setText(paramh.m());
        localListView.addHeaderView(localFrameLayout, null, false);
        localMenuPopupWindow.show();
      }
      return;
      if (!isShowing()) {
        break;
      }
      localg.a(m.b(paramh));
      break;
      label378:
      localView = null;
      locala1 = null;
      break label134;
      label387:
      i3 = 0;
      break label168;
      label393:
      int[] arrayOfInt1 = new int[2];
      this.p.getLocationOnScreen(arrayOfInt1);
      int[] arrayOfInt2 = new int[2];
      localView.getLocationOnScreen(arrayOfInt2);
      if ((0x7 & this.o) == 5)
      {
        arrayOfInt1[0] += this.p.getWidth();
        arrayOfInt2[0] += localView.getWidth();
      }
      i4 = arrayOfInt2[0] - arrayOfInt1[0];
      i5 = arrayOfInt2[1] - arrayOfInt1[1];
      break label195;
      label485:
      i6 = i4 - localView.getWidth();
      break label217;
      label498:
      if (i3 != 0)
      {
        i6 = i4 + localView.getWidth();
        break label217;
      }
      i6 = i4 - i1;
      break label217;
      label526:
      if (this.r) {
        localMenuPopupWindow.setHorizontalOffset(this.t);
      }
      if (this.s) {
        localMenuPopupWindow.setVerticalOffset(this.u);
      }
      localMenuPopupWindow.setEpicenterBounds(e());
    }
  }
  
  private int d(int paramInt)
  {
    ListView localListView = ((a)this.b.get(-1 + this.b.size())).a();
    int[] arrayOfInt = new int[2];
    localListView.getLocationOnScreen(arrayOfInt);
    Rect localRect = new Rect();
    this.c.getWindowVisibleDisplayFrame(localRect);
    if (this.q == 1)
    {
      if (paramInt + (arrayOfInt[0] + localListView.getWidth()) > localRect.right) {
        return 0;
      }
      return 1;
    }
    if (arrayOfInt[0] - paramInt < 0) {
      return 1;
    }
    return 0;
  }
  
  private int d(h paramh)
  {
    int i1 = 0;
    int i2 = this.b.size();
    while (i1 < i2)
    {
      if (paramh == ((a)this.b.get(i1)).b) {
        return i1;
      }
      i1++;
    }
    return -1;
  }
  
  private MenuPopupWindow f()
  {
    MenuPopupWindow localMenuPopupWindow = new MenuPopupWindow(this.e, null, this.g, this.h);
    localMenuPopupWindow.setHoverListener(this.m);
    localMenuPopupWindow.setOnItemClickListener(this);
    localMenuPopupWindow.setOnDismissListener(this);
    localMenuPopupWindow.setAnchorView(this.p);
    localMenuPopupWindow.setDropDownGravity(this.o);
    localMenuPopupWindow.setModal(true);
    localMenuPopupWindow.setInputMethodMode(2);
    return localMenuPopupWindow;
  }
  
  private int g()
  {
    int i1 = 1;
    if (s.e(this.p) == i1) {
      i1 = 0;
    }
    return i1;
  }
  
  public void a(int paramInt)
  {
    if (this.n != paramInt)
    {
      this.n = paramInt;
      this.o = d.a(paramInt, s.e(this.p));
    }
  }
  
  public void a(Parcelable paramParcelable) {}
  
  public void a(h paramh)
  {
    paramh.a(this, this.e);
    if (isShowing())
    {
      c(paramh);
      return;
    }
    this.j.add(paramh);
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    int i1 = d(paramh);
    if (i1 < 0) {}
    do
    {
      return;
      int i2 = i1 + 1;
      if (i2 < this.b.size()) {
        ((a)this.b.get(i2)).b.b(false);
      }
      a locala = (a)this.b.remove(i1);
      locala.b.b(this);
      if (this.d)
      {
        locala.a.setExitTransition(null);
        locala.a.setAnimationStyle(0);
      }
      locala.a.dismiss();
      int i3 = this.b.size();
      if (i3 > 0) {}
      for (this.q = ((a)this.b.get(i3 - 1)).c; i3 == 0; this.q = g())
      {
        dismiss();
        if (this.x != null) {
          this.x.a(paramh, true);
        }
        if (this.y != null)
        {
          if (this.y.isAlive()) {
            this.y.removeGlobalOnLayoutListener(this.k);
          }
          this.y = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        this.z.onDismiss();
        return;
      }
    } while (!paramBoolean);
    ((a)this.b.get(0)).b.b(false);
  }
  
  public void a(o.a parama)
  {
    this.x = parama;
  }
  
  public void a(View paramView)
  {
    if (this.p != paramView)
    {
      this.p = paramView;
      this.o = d.a(this.n, s.e(this.p));
    }
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.z = paramOnDismissListener;
  }
  
  public void a(boolean paramBoolean)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      a(((a)localIterator.next()).a().getAdapter()).notifyDataSetChanged();
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(u paramu)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (paramu == locala.b)
      {
        locala.a().requestFocus();
        return true;
      }
    }
    if (paramu.hasVisibleItems())
    {
      a(paramu);
      if (this.x != null) {
        this.x.a(paramu);
      }
      return true;
    }
    return false;
  }
  
  public void b(int paramInt)
  {
    this.r = true;
    this.t = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public Parcelable c()
  {
    return null;
  }
  
  public void c(int paramInt)
  {
    this.s = true;
    this.u = paramInt;
  }
  
  public void c(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  protected boolean d()
  {
    return false;
  }
  
  public void dismiss()
  {
    int i1 = this.b.size();
    if (i1 > 0)
    {
      a[] arrayOfa = (a[])this.b.toArray(new a[i1]);
      for (int i2 = i1 - 1; i2 >= 0; i2--)
      {
        a locala = arrayOfa[i2];
        if (locala.a.isShowing()) {
          locala.a.dismiss();
        }
      }
    }
  }
  
  public ListView getListView()
  {
    if (this.b.isEmpty()) {
      return null;
    }
    return ((a)this.b.get(-1 + this.b.size())).a();
  }
  
  public boolean isShowing()
  {
    return (this.b.size() > 0) && (((a)this.b.get(0)).a.isShowing());
  }
  
  public void onDismiss()
  {
    int i1 = this.b.size();
    int i2 = 0;
    a locala;
    if (i2 < i1)
    {
      locala = (a)this.b.get(i2);
      if (locala.a.isShowing()) {}
    }
    for (;;)
    {
      if (locala != null) {
        locala.b.b(false);
      }
      return;
      i2++;
      break;
      locala = null;
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
    if (isShowing()) {}
    do
    {
      return;
      Iterator localIterator = this.j.iterator();
      while (localIterator.hasNext()) {
        c((h)localIterator.next());
      }
      this.j.clear();
      this.c = this.p;
    } while (this.c == null);
    if (this.y == null) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.y = this.c.getViewTreeObserver();
      if (i1 != 0) {
        this.y.addOnGlobalLayoutListener(this.k);
      }
      this.c.addOnAttachStateChangeListener(this.l);
      return;
    }
  }
  
  private static class a
  {
    public final MenuPopupWindow a;
    public final h b;
    public final int c;
    
    public a(MenuPopupWindow paramMenuPopupWindow, h paramh, int paramInt)
    {
      this.a = paramMenuPopupWindow;
      this.b = paramh;
      this.c = paramInt;
    }
    
    public ListView a()
    {
      return this.a.getListView();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.e
 * JD-Core Version:    0.7.0.1
 */