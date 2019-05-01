package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.j;
import android.support.v7.view.a;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class m
  extends ActionBar
  implements ActionBarOverlayLayout.ActionBarVisibilityCallback
{
  private static final Interpolator t;
  private static final Interpolator u;
  private boolean A;
  private boolean B;
  private ArrayList<ActionBar.a> C = new ArrayList();
  private boolean D;
  private int E = 0;
  private boolean F;
  private boolean G = true;
  private boolean H;
  Context a;
  ActionBarOverlayLayout b;
  ActionBarContainer c;
  DecorToolbar d;
  ActionBarContextView e;
  View f;
  ScrollingTabContainerView g;
  a h;
  b i;
  b.a j;
  boolean k = true;
  boolean l;
  boolean m;
  android.support.v7.view.h n;
  boolean o;
  final x p = new y()
  {
    public void onAnimationEnd(View paramAnonymousView)
    {
      if ((m.this.k) && (m.this.f != null))
      {
        m.this.f.setTranslationY(0.0F);
        m.this.c.setTranslationY(0.0F);
      }
      m.this.c.setVisibility(8);
      m.this.c.setTransitioning(false);
      m.this.n = null;
      m.this.h();
      if (m.this.b != null) {
        s.p(m.this.b);
      }
    }
  };
  final x q = new y()
  {
    public void onAnimationEnd(View paramAnonymousView)
    {
      m.this.n = null;
      m.this.c.requestLayout();
    }
  };
  final z r = new z()
  {
    public void a(View paramAnonymousView)
    {
      ((View)m.this.c.getParent()).invalidate();
    }
  };
  private Context v;
  private Activity w;
  private Dialog x;
  private ArrayList<Object> y = new ArrayList();
  private int z = -1;
  
  static
  {
    if (!m.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      s = bool;
      t = new AccelerateInterpolator();
      u = new DecelerateInterpolator();
      return;
    }
  }
  
  public m(Activity paramActivity, boolean paramBoolean)
  {
    this.w = paramActivity;
    View localView = paramActivity.getWindow().getDecorView();
    a(localView);
    if (!paramBoolean) {
      this.f = localView.findViewById(16908290);
    }
  }
  
  public m(Dialog paramDialog)
  {
    this.x = paramDialog;
    a(paramDialog.getWindow().getDecorView());
  }
  
  private void a(View paramView)
  {
    this.b = ((ActionBarOverlayLayout)paramView.findViewById(a.f.decor_content_parent));
    if (this.b != null) {
      this.b.setActionBarVisibilityCallback(this);
    }
    this.d = b(paramView.findViewById(a.f.action_bar));
    this.e = ((ActionBarContextView)paramView.findViewById(a.f.action_context_bar));
    this.c = ((ActionBarContainer)paramView.findViewById(a.f.action_bar_container));
    if ((this.d == null) || (this.e == null) || (this.c == null)) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
    }
    this.a = this.d.getContext();
    int i1;
    a locala;
    if ((0x4 & this.d.getDisplayOptions()) != 0)
    {
      i1 = 1;
      if (i1 != 0) {
        this.A = true;
      }
      locala = a.a(this.a);
      if ((!locala.f()) && (i1 == 0)) {
        break label273;
      }
    }
    label273:
    for (boolean bool = true;; bool = false)
    {
      b(bool);
      j(locala.d());
      TypedArray localTypedArray = this.a.obtainStyledAttributes(null, a.j.ActionBar, a.a.actionBarStyle, 0);
      if (localTypedArray.getBoolean(a.j.ActionBar_hideOnContentScroll, false)) {
        c(true);
      }
      int i2 = localTypedArray.getDimensionPixelSize(a.j.ActionBar_elevation, 0);
      if (i2 != 0) {
        a(i2);
      }
      localTypedArray.recycle();
      return;
      i1 = 0;
      break;
    }
  }
  
  static boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {}
    while ((!paramBoolean1) && (!paramBoolean2)) {
      return true;
    }
    return false;
  }
  
  private DecorToolbar b(View paramView)
  {
    if ((paramView instanceof DecorToolbar)) {
      return (DecorToolbar)paramView;
    }
    if ((paramView instanceof Toolbar)) {
      return ((Toolbar)paramView).getWrapper();
    }
    if ("Can't make a decor toolbar out of " + paramView != null) {}
    for (String str = paramView.getClass().getSimpleName();; str = "null") {
      throw new IllegalStateException(str);
    }
  }
  
  private void j()
  {
    if (!this.F)
    {
      this.F = true;
      if (this.b != null) {
        this.b.setShowingForActionMode(true);
      }
      k(false);
    }
  }
  
  private void j(boolean paramBoolean)
  {
    boolean bool1 = true;
    this.D = paramBoolean;
    boolean bool2;
    label45:
    label78:
    boolean bool3;
    label98:
    ActionBarOverlayLayout localActionBarOverlayLayout;
    if (!this.D)
    {
      this.d.setEmbeddedTabView(null);
      this.c.setTabContainer(this.g);
      if (i() != 2) {
        break label155;
      }
      bool2 = bool1;
      if (this.g != null)
      {
        if (!bool2) {
          break label160;
        }
        this.g.setVisibility(0);
        if (this.b != null) {
          s.p(this.b);
        }
      }
      DecorToolbar localDecorToolbar = this.d;
      if ((this.D) || (!bool2)) {
        break label172;
      }
      bool3 = bool1;
      localDecorToolbar.setCollapsible(bool3);
      localActionBarOverlayLayout = this.b;
      if ((this.D) || (!bool2)) {
        break label178;
      }
    }
    for (;;)
    {
      localActionBarOverlayLayout.setHasNonEmbeddedTabs(bool1);
      return;
      this.c.setTabContainer(null);
      this.d.setEmbeddedTabView(this.g);
      break;
      label155:
      bool2 = false;
      break label45;
      label160:
      this.g.setVisibility(8);
      break label78;
      label172:
      bool3 = false;
      break label98;
      label178:
      bool1 = false;
    }
  }
  
  private void k()
  {
    if (this.F)
    {
      this.F = false;
      if (this.b != null) {
        this.b.setShowingForActionMode(false);
      }
      k(false);
    }
  }
  
  private void k(boolean paramBoolean)
  {
    if (a(this.l, this.m, this.F)) {
      if (!this.G)
      {
        this.G = true;
        g(paramBoolean);
      }
    }
    while (!this.G) {
      return;
    }
    this.G = false;
    h(paramBoolean);
  }
  
  private boolean l()
  {
    return s.x(this.c);
  }
  
  public int a()
  {
    return this.d.getDisplayOptions();
  }
  
  public b a(b.a parama)
  {
    if (this.h != null) {
      this.h.c();
    }
    this.b.setHideOnContentScrollEnabled(false);
    this.e.killMode();
    a locala = new a(this.e.getContext(), parama);
    if (locala.e())
    {
      this.h = locala;
      locala.d();
      this.e.initForMode(locala);
      i(true);
      this.e.sendAccessibilityEvent(32);
      return locala;
    }
    return null;
  }
  
  public void a(float paramFloat)
  {
    s.a(this.c, paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = this.d.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0) {
      this.A = true;
    }
    this.d.setDisplayOptions(paramInt1 & paramInt2 | i1 & (paramInt2 ^ 0xFFFFFFFF));
  }
  
  public void a(Configuration paramConfiguration)
  {
    j(a.a(this.a).d());
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.d.setTitle(paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 4;; i1 = 0)
    {
      a(i1, 4);
      return;
    }
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.h == null) {}
    Menu localMenu;
    do
    {
      return false;
      localMenu = this.h.b();
    } while (localMenu == null);
    int i1;
    if (paramKeyEvent != null)
    {
      i1 = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i1).getKeyboardType() == 1) {
        break label70;
      }
    }
    label70:
    for (boolean bool = true;; bool = false)
    {
      localMenu.setQwertyMode(bool);
      return localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      i1 = -1;
      break;
    }
  }
  
  public Context b()
  {
    int i1;
    if (this.v == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.a.getTheme().resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 == 0) {
        break label61;
      }
    }
    label61:
    for (this.v = new ContextThemeWrapper(this.a, i1);; this.v = this.a) {
      return this.v;
    }
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.d.setWindowTitle(paramCharSequence);
  }
  
  public void b(boolean paramBoolean)
  {
    this.d.setHomeButtonEnabled(paramBoolean);
  }
  
  public void c(boolean paramBoolean)
  {
    if ((paramBoolean) && (!this.b.isInOverlayMode())) {
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    this.o = paramBoolean;
    this.b.setHideOnContentScrollEnabled(paramBoolean);
  }
  
  public void d(boolean paramBoolean)
  {
    if (!this.A) {
      a(paramBoolean);
    }
  }
  
  public void e(boolean paramBoolean)
  {
    this.H = paramBoolean;
    if ((!paramBoolean) && (this.n != null)) {
      this.n.c();
    }
  }
  
  public void enableContentAnimations(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public void f(boolean paramBoolean)
  {
    if (paramBoolean == this.B) {}
    for (;;)
    {
      return;
      this.B = paramBoolean;
      int i1 = this.C.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((ActionBar.a)this.C.get(i2)).a(paramBoolean);
      }
    }
  }
  
  public boolean f()
  {
    if ((this.d != null) && (this.d.hasExpandedActionView()))
    {
      this.d.collapseActionView();
      return true;
    }
    return false;
  }
  
  public void g(boolean paramBoolean)
  {
    if (this.n != null) {
      this.n.c();
    }
    this.c.setVisibility(0);
    if ((this.E == 0) && ((this.H) || (paramBoolean)))
    {
      this.c.setTranslationY(0.0F);
      float f1 = -this.c.getHeight();
      if (paramBoolean)
      {
        int[] arrayOfInt = { 0, 0 };
        this.c.getLocationInWindow(arrayOfInt);
        f1 -= arrayOfInt[1];
      }
      this.c.setTranslationY(f1);
      android.support.v7.view.h localh = new android.support.v7.view.h();
      w localw = s.k(this.c).b(0.0F);
      localw.a(this.r);
      localh.a(localw);
      if ((this.k) && (this.f != null))
      {
        this.f.setTranslationY(f1);
        localh.a(s.k(this.f).b(0.0F));
      }
      localh.a(u);
      localh.a(250L);
      localh.a(this.q);
      this.n = localh;
      localh.a();
    }
    for (;;)
    {
      if (this.b != null) {
        s.p(this.b);
      }
      return;
      this.c.setAlpha(1.0F);
      this.c.setTranslationY(0.0F);
      if ((this.k) && (this.f != null)) {
        this.f.setTranslationY(0.0F);
      }
      this.q.onAnimationEnd(null);
    }
  }
  
  void h()
  {
    if (this.j != null)
    {
      this.j.a(this.i);
      this.i = null;
      this.j = null;
    }
  }
  
  public void h(boolean paramBoolean)
  {
    if (this.n != null) {
      this.n.c();
    }
    if ((this.E == 0) && ((this.H) || (paramBoolean)))
    {
      this.c.setAlpha(1.0F);
      this.c.setTransitioning(true);
      android.support.v7.view.h localh = new android.support.v7.view.h();
      float f1 = -this.c.getHeight();
      if (paramBoolean)
      {
        int[] arrayOfInt = { 0, 0 };
        this.c.getLocationInWindow(arrayOfInt);
        f1 -= arrayOfInt[1];
      }
      w localw = s.k(this.c).b(f1);
      localw.a(this.r);
      localh.a(localw);
      if ((this.k) && (this.f != null)) {
        localh.a(s.k(this.f).b(f1));
      }
      localh.a(t);
      localh.a(250L);
      localh.a(this.p);
      this.n = localh;
      localh.a();
      return;
    }
    this.p.onAnimationEnd(null);
  }
  
  public void hideForSystem()
  {
    if (!this.m)
    {
      this.m = true;
      k(true);
    }
  }
  
  public int i()
  {
    return this.d.getNavigationMode();
  }
  
  public void i(boolean paramBoolean)
  {
    w localw2;
    w localw1;
    if (paramBoolean)
    {
      j();
      if (!l()) {
        break label105;
      }
      if (!paramBoolean) {
        break label75;
      }
      localw2 = this.d.setupAnimatorToVisibility(4, 100L);
      localw1 = this.e.setupAnimatorToVisibility(0, 200L);
    }
    for (;;)
    {
      android.support.v7.view.h localh = new android.support.v7.view.h();
      localh.a(localw2, localw1);
      localh.a();
      return;
      k();
      break;
      label75:
      localw1 = this.d.setupAnimatorToVisibility(0, 200L);
      localw2 = this.e.setupAnimatorToVisibility(8, 100L);
    }
    label105:
    if (paramBoolean)
    {
      this.d.setVisibility(4);
      this.e.setVisibility(0);
      return;
    }
    this.d.setVisibility(0);
    this.e.setVisibility(8);
  }
  
  public void onContentScrollStarted()
  {
    if (this.n != null)
    {
      this.n.c();
      this.n = null;
    }
  }
  
  public void onContentScrollStopped() {}
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    this.E = paramInt;
  }
  
  public void showForSystem()
  {
    if (this.m)
    {
      this.m = false;
      k(true);
    }
  }
  
  public class a
    extends b
    implements h.a
  {
    private final Context b;
    private final android.support.v7.view.menu.h c;
    private b.a d;
    private WeakReference<View> e;
    
    public a(Context paramContext, b.a parama)
    {
      this.b = paramContext;
      this.d = parama;
      this.c = new android.support.v7.view.menu.h(paramContext).a(1);
      this.c.a(this);
    }
    
    public MenuInflater a()
    {
      return new g(this.b);
    }
    
    public void a(int paramInt)
    {
      b(m.this.a.getResources().getString(paramInt));
    }
    
    public void a(android.support.v7.view.menu.h paramh)
    {
      if (this.d == null) {
        return;
      }
      d();
      m.this.e.showOverflowMenu();
    }
    
    public void a(View paramView)
    {
      m.this.e.setCustomView(paramView);
      this.e = new WeakReference(paramView);
    }
    
    public void a(CharSequence paramCharSequence)
    {
      m.this.e.setSubtitle(paramCharSequence);
    }
    
    public void a(boolean paramBoolean)
    {
      super.a(paramBoolean);
      m.this.e.setTitleOptional(paramBoolean);
    }
    
    public boolean a(android.support.v7.view.menu.h paramh, MenuItem paramMenuItem)
    {
      if (this.d != null) {
        return this.d.a(this, paramMenuItem);
      }
      return false;
    }
    
    public Menu b()
    {
      return this.c;
    }
    
    public void b(int paramInt)
    {
      a(m.this.a.getResources().getString(paramInt));
    }
    
    public void b(CharSequence paramCharSequence)
    {
      m.this.e.setTitle(paramCharSequence);
    }
    
    public void c()
    {
      if (m.this.h != this) {
        return;
      }
      if (!m.a(m.this.l, m.this.m, false))
      {
        m.this.i = this;
        m.this.j = this.d;
      }
      for (;;)
      {
        this.d = null;
        m.this.i(false);
        m.this.e.closeMode();
        m.this.d.getViewGroup().sendAccessibilityEvent(32);
        m.this.b.setHideOnContentScrollEnabled(m.this.o);
        m.this.h = null;
        return;
        this.d.a(this);
      }
    }
    
    public void d()
    {
      if (m.this.h != this) {
        return;
      }
      this.c.g();
      try
      {
        this.d.b(this, this.c);
        return;
      }
      finally
      {
        this.c.h();
      }
    }
    
    public boolean e()
    {
      this.c.g();
      try
      {
        boolean bool = this.d.a(this, this.c);
        return bool;
      }
      finally
      {
        this.c.h();
      }
    }
    
    public CharSequence f()
    {
      return m.this.e.getTitle();
    }
    
    public CharSequence g()
    {
      return m.this.e.getSubtitle();
    }
    
    public boolean h()
    {
      return m.this.e.isTitleOptional();
    }
    
    public View i()
    {
      if (this.e != null) {
        return (View)this.e.get();
      }
      return null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.m
 * JD-Core Version:    0.7.0.1
 */