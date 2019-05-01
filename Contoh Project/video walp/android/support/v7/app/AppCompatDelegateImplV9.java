package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.app.NavUtils;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v7.a.a.a;
import android.support.v7.a.a.c;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.i;
import android.support.v7.a.a.j;
import android.support.v7.view.b.a;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.OnAttachListener;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImplV9
  extends d
  implements h.a, LayoutInflater.Factory2
{
  private static final boolean t;
  private View A;
  private boolean B;
  private boolean C;
  private boolean D;
  private PanelFeatureState[] E;
  private PanelFeatureState F;
  private boolean G;
  private final Runnable H = new Runnable()
  {
    public void run()
    {
      if ((0x1 & AppCompatDelegateImplV9.this.s) != 0) {
        AppCompatDelegateImplV9.this.f(0);
      }
      if ((0x1000 & AppCompatDelegateImplV9.this.s) != 0) {
        AppCompatDelegateImplV9.this.f(108);
      }
      AppCompatDelegateImplV9.this.r = false;
      AppCompatDelegateImplV9.this.s = 0;
    }
  };
  private boolean I;
  private Rect J;
  private Rect K;
  private AppCompatViewInflater L;
  android.support.v7.view.b m;
  ActionBarContextView n;
  PopupWindow o;
  Runnable p;
  w q = null;
  boolean r;
  int s;
  private DecorContentParent u;
  private a v;
  private d w;
  private boolean x;
  private ViewGroup y;
  private TextView z;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      t = bool;
      return;
    }
  }
  
  AppCompatDelegateImplV9(Context paramContext, Window paramWindow, b paramb)
  {
    super(paramContext, paramWindow, paramb);
  }
  
  private void a(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    int i = -1;
    if ((paramPanelFeatureState.o) || (p())) {}
    label88:
    label94:
    WindowManager localWindowManager;
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (paramPanelFeatureState.a == 0) {
            if ((0xF & this.a.getResources().getConfiguration().screenLayout) != 4) {
              break label88;
            }
          }
          for (int k = 1; k == 0; k = 0)
          {
            Window.Callback localCallback = q();
            if ((localCallback == null) || (localCallback.onMenuOpened(paramPanelFeatureState.a, paramPanelFeatureState.j))) {
              break label94;
            }
            a(paramPanelFeatureState, true);
            return;
          }
        }
        localWindowManager = (WindowManager)this.a.getSystemService("window");
      } while ((localWindowManager == null) || (!b(paramPanelFeatureState, paramKeyEvent)));
      if ((paramPanelFeatureState.g != null) && (!paramPanelFeatureState.q)) {
        break label379;
      }
      if (paramPanelFeatureState.g != null) {
        break;
      }
    } while ((!a(paramPanelFeatureState)) || (paramPanelFeatureState.g == null));
    label158:
    ViewGroup.LayoutParams localLayoutParams1;
    if ((c(paramPanelFeatureState)) && (paramPanelFeatureState.a()))
    {
      localLayoutParams1 = paramPanelFeatureState.h.getLayoutParams();
      if (localLayoutParams1 != null) {
        break label415;
      }
    }
    label409:
    label415:
    for (ViewGroup.LayoutParams localLayoutParams2 = new ViewGroup.LayoutParams(-2, -2);; localLayoutParams2 = localLayoutParams1)
    {
      int j = paramPanelFeatureState.b;
      paramPanelFeatureState.g.setBackgroundResource(j);
      ViewParent localViewParent = paramPanelFeatureState.h.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup))) {
        ((ViewGroup)localViewParent).removeView(paramPanelFeatureState.h);
      }
      paramPanelFeatureState.g.addView(paramPanelFeatureState.h, localLayoutParams2);
      if (!paramPanelFeatureState.h.hasFocus()) {
        paramPanelFeatureState.h.requestFocus();
      }
      for (i = -2;; i = -2)
      {
        label379:
        ViewGroup.LayoutParams localLayoutParams3;
        do
        {
          paramPanelFeatureState.n = false;
          WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(i, -2, paramPanelFeatureState.d, paramPanelFeatureState.e, 1002, 8519680, -3);
          localLayoutParams.gravity = paramPanelFeatureState.c;
          localLayoutParams.windowAnimations = paramPanelFeatureState.f;
          localWindowManager.addView(paramPanelFeatureState.g, localLayoutParams);
          paramPanelFeatureState.o = true;
          return;
          if ((!paramPanelFeatureState.q) || (paramPanelFeatureState.g.getChildCount() <= 0)) {
            break label158;
          }
          paramPanelFeatureState.g.removeAllViews();
          break label158;
          break;
          if (paramPanelFeatureState.i == null) {
            break label409;
          }
          localLayoutParams3 = paramPanelFeatureState.i.getLayoutParams();
        } while ((localLayoutParams3 != null) && (localLayoutParams3.width == i));
      }
    }
  }
  
  private void a(h paramh, boolean paramBoolean)
  {
    if ((this.u != null) && (this.u.canShowOverflowMenu()) && ((!ViewConfiguration.get(this.a).hasPermanentMenuKey()) || (this.u.isOverflowMenuShowPending())))
    {
      Window.Callback localCallback = q();
      if ((!this.u.isOverflowMenuShowing()) || (!paramBoolean)) {
        if ((localCallback != null) && (!p()))
        {
          if ((this.r) && ((0x1 & this.s) != 0))
          {
            this.b.getDecorView().removeCallbacks(this.H);
            this.H.run();
          }
          PanelFeatureState localPanelFeatureState2 = a(0, true);
          if ((localPanelFeatureState2.j != null) && (!localPanelFeatureState2.r) && (localCallback.onPreparePanel(0, localPanelFeatureState2.i, localPanelFeatureState2.j)))
          {
            localCallback.onMenuOpened(108, localPanelFeatureState2.j);
            this.u.showOverflowMenu();
          }
        }
      }
      do
      {
        return;
        this.u.hideOverflowMenu();
      } while (p());
      localCallback.onPanelClosed(108, a(0, true).j);
      return;
    }
    PanelFeatureState localPanelFeatureState1 = a(0, true);
    localPanelFeatureState1.q = true;
    a(localPanelFeatureState1, false);
    a(localPanelFeatureState1, null);
  }
  
  private boolean a(PanelFeatureState paramPanelFeatureState)
  {
    paramPanelFeatureState.a(n());
    paramPanelFeatureState.g = new c(paramPanelFeatureState.l);
    paramPanelFeatureState.c = 81;
    return true;
  }
  
  private boolean a(PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool1 = paramKeyEvent.isSystem();
    boolean bool2 = false;
    if (bool1) {}
    do
    {
      return bool2;
      if (!paramPanelFeatureState.m)
      {
        boolean bool3 = b(paramPanelFeatureState, paramKeyEvent);
        bool2 = false;
        if (!bool3) {}
      }
      else
      {
        h localh = paramPanelFeatureState.j;
        bool2 = false;
        if (localh != null) {
          bool2 = paramPanelFeatureState.j.performShortcut(paramInt1, paramKeyEvent, paramInt2);
        }
      }
    } while ((!bool2) || ((paramInt2 & 0x1) != 0) || (this.u != null));
    a(paramPanelFeatureState, true);
    return bool2;
  }
  
  private boolean a(ViewParent paramViewParent)
  {
    if (paramViewParent == null) {
      return false;
    }
    View localView = this.b.getDecorView();
    for (ViewParent localViewParent = paramViewParent;; localViewParent = localViewParent.getParent())
    {
      if (localViewParent == null) {
        return true;
      }
      if ((localViewParent == localView) || (!(localViewParent instanceof View)) || (s.A((View)localViewParent))) {
        return false;
      }
    }
  }
  
  private boolean b(PanelFeatureState paramPanelFeatureState)
  {
    Context localContext = this.a;
    TypedValue localTypedValue;
    Resources.Theme localTheme1;
    Resources.Theme localTheme2;
    Object localObject;
    if (((paramPanelFeatureState.a == 0) || (paramPanelFeatureState.a == 108)) && (this.u != null))
    {
      localTypedValue = new TypedValue();
      localTheme1 = localContext.getTheme();
      localTheme1.resolveAttribute(a.a.actionBarTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0)
      {
        localTheme2 = localContext.getResources().newTheme();
        localTheme2.setTo(localTheme1);
        localTheme2.applyStyle(localTypedValue.resourceId, true);
        localTheme2.resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
        if (localTypedValue.resourceId != 0)
        {
          if (localTheme2 == null)
          {
            localTheme2 = localContext.getResources().newTheme();
            localTheme2.setTo(localTheme1);
          }
          localTheme2.applyStyle(localTypedValue.resourceId, true);
        }
        Resources.Theme localTheme3 = localTheme2;
        if (localTheme3 == null) {
          break label207;
        }
        localObject = new android.support.v7.view.d(localContext, 0);
        ((Context)localObject).getTheme().setTo(localTheme3);
      }
    }
    for (;;)
    {
      h localh = new h((Context)localObject);
      localh.a(this);
      paramPanelFeatureState.a(localh);
      return true;
      localTheme1.resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
      localTheme2 = null;
      break;
      label207:
      localObject = localContext;
    }
  }
  
  private boolean b(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (p()) {
      return false;
    }
    if (paramPanelFeatureState.m) {
      return true;
    }
    if ((this.F != null) && (this.F != paramPanelFeatureState)) {
      a(this.F, false);
    }
    Window.Callback localCallback = q();
    if (localCallback != null) {
      paramPanelFeatureState.i = localCallback.onCreatePanelView(paramPanelFeatureState.a);
    }
    if ((paramPanelFeatureState.a == 0) || (paramPanelFeatureState.a == 108)) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (this.u != null)) {
        this.u.setMenuPrepared();
      }
      if ((paramPanelFeatureState.i != null) || ((i != 0) && ((m() instanceof j)))) {
        break label411;
      }
      if ((paramPanelFeatureState.j != null) && (!paramPanelFeatureState.r)) {
        break label279;
      }
      if ((paramPanelFeatureState.j == null) && ((!b(paramPanelFeatureState)) || (paramPanelFeatureState.j == null))) {
        break;
      }
      if ((i != 0) && (this.u != null))
      {
        if (this.v == null) {
          this.v = new a();
        }
        this.u.setMenu(paramPanelFeatureState.j, this.v);
      }
      paramPanelFeatureState.j.g();
      if (localCallback.onCreatePanelMenu(paramPanelFeatureState.a, paramPanelFeatureState.j)) {
        break label274;
      }
      paramPanelFeatureState.a(null);
      if ((i == 0) || (this.u == null)) {
        break;
      }
      this.u.setMenu(null, this.v);
      return false;
    }
    label274:
    paramPanelFeatureState.r = false;
    label279:
    paramPanelFeatureState.j.g();
    if (paramPanelFeatureState.s != null)
    {
      paramPanelFeatureState.j.d(paramPanelFeatureState.s);
      paramPanelFeatureState.s = null;
    }
    if (!localCallback.onPreparePanel(0, paramPanelFeatureState.i, paramPanelFeatureState.j))
    {
      if ((i != 0) && (this.u != null)) {
        this.u.setMenu(null, this.v);
      }
      paramPanelFeatureState.j.h();
      return false;
    }
    int j;
    if (paramKeyEvent != null)
    {
      j = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(j).getKeyboardType() == 1) {
        break label434;
      }
    }
    label411:
    label434:
    for (boolean bool = true;; bool = false)
    {
      paramPanelFeatureState.p = bool;
      paramPanelFeatureState.j.setQwertyMode(paramPanelFeatureState.p);
      paramPanelFeatureState.j.h();
      paramPanelFeatureState.m = true;
      paramPanelFeatureState.n = false;
      this.F = paramPanelFeatureState;
      return true;
      j = -1;
      break;
    }
  }
  
  private boolean c(PanelFeatureState paramPanelFeatureState)
  {
    if (paramPanelFeatureState.i != null)
    {
      paramPanelFeatureState.h = paramPanelFeatureState.i;
      return true;
    }
    if (paramPanelFeatureState.j == null) {
      return false;
    }
    if (this.w == null) {
      this.w = new d();
    }
    paramPanelFeatureState.h = ((View)paramPanelFeatureState.a(this.w));
    if (paramPanelFeatureState.h != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void d(int paramInt)
  {
    this.s |= 1 << paramInt;
    if (!this.r)
    {
      s.a(this.b.getDecorView(), this.H);
      this.r = true;
    }
  }
  
  private boolean d(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getRepeatCount() == 0)
    {
      PanelFeatureState localPanelFeatureState = a(paramInt, true);
      if (!localPanelFeatureState.o) {
        return b(localPanelFeatureState, paramKeyEvent);
      }
    }
    return false;
  }
  
  private boolean e(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    if (this.m != null) {
      return false;
    }
    PanelFeatureState localPanelFeatureState = a(paramInt, bool1);
    if ((paramInt == 0) && (this.u != null) && (this.u.canShowOverflowMenu()) && (!ViewConfiguration.get(this.a).hasPermanentMenuKey())) {
      if (!this.u.isOverflowMenuShowing())
      {
        if ((p()) || (!b(localPanelFeatureState, paramKeyEvent))) {
          break label234;
        }
        bool1 = this.u.showOverflowMenu();
      }
    }
    for (;;)
    {
      if (bool1)
      {
        AudioManager localAudioManager = (AudioManager)this.a.getSystemService("audio");
        if (localAudioManager == null) {
          break label221;
        }
        localAudioManager.playSoundEffect(0);
      }
      label124:
      return bool1;
      bool1 = this.u.hideOverflowMenu();
      continue;
      if ((!localPanelFeatureState.o) && (!localPanelFeatureState.n)) {
        break;
      }
      boolean bool2 = localPanelFeatureState.o;
      a(localPanelFeatureState, bool1);
      bool1 = bool2;
    }
    if (localPanelFeatureState.m)
    {
      if (!localPanelFeatureState.r) {
        break label239;
      }
      localPanelFeatureState.m = false;
    }
    label221:
    label234:
    label239:
    for (boolean bool3 = b(localPanelFeatureState, paramKeyEvent);; bool3 = bool1)
    {
      if (bool3)
      {
        a(localPanelFeatureState, paramKeyEvent);
        break;
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        break label124;
      }
      bool1 = false;
      break;
    }
  }
  
  private int h(int paramInt)
  {
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      paramInt = 108;
    }
    while (paramInt != 9) {
      return paramInt;
    }
    Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
    return 109;
  }
  
  private void w()
  {
    if (!this.x)
    {
      this.y = x();
      CharSequence localCharSequence = r();
      if (!TextUtils.isEmpty(localCharSequence)) {
        b(localCharSequence);
      }
      y();
      a(this.y);
      this.x = true;
      PanelFeatureState localPanelFeatureState = a(0, false);
      if ((!p()) && ((localPanelFeatureState == null) || (localPanelFeatureState.j == null))) {
        d(108);
      }
    }
  }
  
  private ViewGroup x()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(a.j.AppCompatTheme);
    if (!localTypedArray.hasValue(a.j.AppCompatTheme_windowActionBar))
    {
      localTypedArray.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    LayoutInflater localLayoutInflater;
    Object localObject1;
    if (localTypedArray.getBoolean(a.j.AppCompatTheme_windowNoTitle, false))
    {
      c(1);
      if (localTypedArray.getBoolean(a.j.AppCompatTheme_windowActionBarOverlay, false)) {
        c(109);
      }
      if (localTypedArray.getBoolean(a.j.AppCompatTheme_windowActionModeOverlay, false)) {
        c(10);
      }
      this.k = localTypedArray.getBoolean(a.j.AppCompatTheme_android_windowIsFloating, false);
      localTypedArray.recycle();
      this.b.getDecorView();
      localLayoutInflater = LayoutInflater.from(this.a);
      if (this.l) {
        break label451;
      }
      if (!this.k) {
        break label279;
      }
      ViewGroup localViewGroup4 = (ViewGroup)localLayoutInflater.inflate(a.g.abc_dialog_title_material, null);
      this.i = false;
      this.h = false;
      localObject1 = localViewGroup4;
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
        if (!localTypedArray.getBoolean(a.j.AppCompatTheme_windowActionBar, false)) {
          break;
        }
        c(108);
        break;
        label279:
        if (!this.h) {
          break label690;
        }
        TypedValue localTypedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(a.a.actionBarTheme, localTypedValue, true);
        if (localTypedValue.resourceId != 0) {}
        for (Object localObject2 = new android.support.v7.view.d(this.a, localTypedValue.resourceId);; localObject2 = this.a)
        {
          ViewGroup localViewGroup3 = (ViewGroup)LayoutInflater.from((Context)localObject2).inflate(a.g.abc_screen_toolbar, null);
          this.u = ((DecorContentParent)localViewGroup3.findViewById(a.f.decor_content_parent));
          this.u.setWindowCallback(q());
          if (this.i) {
            this.u.initFeature(109);
          }
          if (this.B) {
            this.u.initFeature(2);
          }
          if (this.C) {
            this.u.initFeature(5);
          }
          localObject1 = localViewGroup3;
          break;
        }
        label451:
        if (this.j) {}
        for (ViewGroup localViewGroup1 = (ViewGroup)localLayoutInflater.inflate(a.g.abc_screen_simple_overlay_action_mode, null);; localViewGroup1 = (ViewGroup)localLayoutInflater.inflate(a.g.abc_screen_simple, null))
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label517;
          }
          s.a(localViewGroup1, new o()
          {
            public aa a(View paramAnonymousView, aa paramAnonymousaa)
            {
              int i = paramAnonymousaa.b();
              int j = AppCompatDelegateImplV9.this.g(i);
              if (i != j) {
                paramAnonymousaa = paramAnonymousaa.a(paramAnonymousaa.a(), j, paramAnonymousaa.c(), paramAnonymousaa.d());
              }
              return s.a(paramAnonymousView, paramAnonymousaa);
            }
          });
          localObject1 = localViewGroup1;
          break;
        }
        label517:
        ((FitWindowsViewGroup)localViewGroup1).setOnFitSystemWindowsListener(new FitWindowsViewGroup.OnFitSystemWindowsListener()
        {
          public void onFitSystemWindows(Rect paramAnonymousRect)
          {
            paramAnonymousRect.top = AppCompatDelegateImplV9.this.g(paramAnonymousRect.top);
          }
        });
        localObject1 = localViewGroup1;
        continue;
      }
      if (this.u == null) {
        this.z = ((TextView)((ViewGroup)localObject1).findViewById(a.f.title));
      }
      ViewUtils.makeOptionalFitsSystemWindows((View)localObject1);
      ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)((ViewGroup)localObject1).findViewById(a.f.action_bar_activity_content);
      ViewGroup localViewGroup2 = (ViewGroup)this.b.findViewById(16908290);
      if (localViewGroup2 != null)
      {
        while (localViewGroup2.getChildCount() > 0)
        {
          View localView = localViewGroup2.getChildAt(0);
          localViewGroup2.removeViewAt(0);
          localContentFrameLayout.addView(localView);
        }
        localViewGroup2.setId(-1);
        localContentFrameLayout.setId(16908290);
        if ((localViewGroup2 instanceof FrameLayout)) {
          ((FrameLayout)localViewGroup2).setForeground(null);
        }
      }
      this.b.setContentView((View)localObject1);
      localContentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener()
      {
        public void onAttachedFromWindow() {}
        
        public void onDetachedFromWindow()
        {
          AppCompatDelegateImplV9.this.v();
        }
      });
      return localObject1;
      label690:
      localObject1 = null;
    }
  }
  
  private void y()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.y.findViewById(16908290);
    View localView = this.b.getDecorView();
    localContentFrameLayout.setDecorPadding(localView.getPaddingLeft(), localView.getPaddingTop(), localView.getPaddingRight(), localView.getPaddingBottom());
    TypedArray localTypedArray = this.a.obtainStyledAttributes(a.j.AppCompatTheme);
    localTypedArray.getValue(a.j.AppCompatTheme_windowMinWidthMajor, localContentFrameLayout.getMinWidthMajor());
    localTypedArray.getValue(a.j.AppCompatTheme_windowMinWidthMinor, localContentFrameLayout.getMinWidthMinor());
    if (localTypedArray.hasValue(a.j.AppCompatTheme_windowFixedWidthMajor)) {
      localTypedArray.getValue(a.j.AppCompatTheme_windowFixedWidthMajor, localContentFrameLayout.getFixedWidthMajor());
    }
    if (localTypedArray.hasValue(a.j.AppCompatTheme_windowFixedWidthMinor)) {
      localTypedArray.getValue(a.j.AppCompatTheme_windowFixedWidthMinor, localContentFrameLayout.getFixedWidthMinor());
    }
    if (localTypedArray.hasValue(a.j.AppCompatTheme_windowFixedHeightMajor)) {
      localTypedArray.getValue(a.j.AppCompatTheme_windowFixedHeightMajor, localContentFrameLayout.getFixedHeightMajor());
    }
    if (localTypedArray.hasValue(a.j.AppCompatTheme_windowFixedHeightMinor)) {
      localTypedArray.getValue(a.j.AppCompatTheme_windowFixedHeightMinor, localContentFrameLayout.getFixedHeightMinor());
    }
    localTypedArray.recycle();
    localContentFrameLayout.requestLayout();
  }
  
  private void z()
  {
    if (this.x) {
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
  }
  
  protected PanelFeatureState a(int paramInt, boolean paramBoolean)
  {
    Object localObject = this.E;
    if ((localObject == null) || (localObject.length <= paramInt))
    {
      PanelFeatureState[] arrayOfPanelFeatureState = new PanelFeatureState[paramInt + 1];
      if (localObject != null) {
        System.arraycopy(localObject, 0, arrayOfPanelFeatureState, 0, localObject.length);
      }
      this.E = arrayOfPanelFeatureState;
      localObject = arrayOfPanelFeatureState;
    }
    PanelFeatureState localPanelFeatureState1 = localObject[paramInt];
    if (localPanelFeatureState1 == null)
    {
      PanelFeatureState localPanelFeatureState2 = new PanelFeatureState(paramInt);
      localObject[paramInt] = localPanelFeatureState2;
      return localPanelFeatureState2;
    }
    return localPanelFeatureState1;
  }
  
  PanelFeatureState a(Menu paramMenu)
  {
    PanelFeatureState[] arrayOfPanelFeatureState = this.E;
    int i;
    if (arrayOfPanelFeatureState != null) {
      i = arrayOfPanelFeatureState.length;
    }
    for (int j = 0;; j++)
    {
      if (j >= i) {
        break label55;
      }
      PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[j];
      if ((localPanelFeatureState != null) && (localPanelFeatureState.j == paramMenu))
      {
        return localPanelFeatureState;
        i = 0;
        break;
      }
    }
    label55:
    return null;
  }
  
  android.support.v7.view.b a(b.a parama)
  {
    t();
    if (this.m != null) {
      this.m.c();
    }
    if (!(parama instanceof b)) {
      parama = new b(parama);
    }
    if ((this.e != null) && (!p())) {}
    for (;;)
    {
      try
      {
        android.support.v7.view.b localb2 = this.e.a(parama);
        localb1 = localb2;
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        localb1 = null;
        continue;
        if (this.n != null) {
          continue;
        }
        if (!this.k) {
          continue;
        }
        TypedValue localTypedValue = new TypedValue();
        Resources.Theme localTheme1 = this.a.getTheme();
        localTheme1.resolveAttribute(a.a.actionBarTheme, localTypedValue, true);
        if (localTypedValue.resourceId == 0) {
          continue;
        }
        Resources.Theme localTheme2 = this.a.getResources().newTheme();
        localTheme2.setTo(localTheme1);
        localTheme2.applyStyle(localTypedValue.resourceId, true);
        Object localObject = new android.support.v7.view.d(this.a, 0);
        ((Context)localObject).getTheme().setTo(localTheme2);
        this.n = new ActionBarContextView((Context)localObject);
        this.o = new PopupWindow((Context)localObject, null, a.a.actionModePopupWindowStyle);
        android.support.v4.widget.m.a(this.o, 2);
        this.o.setContentView(this.n);
        this.o.setWidth(-1);
        ((Context)localObject).getTheme().resolveAttribute(a.a.actionBarSize, localTypedValue, true);
        int i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, ((Context)localObject).getResources().getDisplayMetrics());
        this.n.setContentHeight(i);
        this.o.setHeight(-2);
        this.p = new Runnable()
        {
          public void run()
          {
            AppCompatDelegateImplV9.this.o.showAtLocation(AppCompatDelegateImplV9.this.n, 55, 0, 0);
            AppCompatDelegateImplV9.this.t();
            if (AppCompatDelegateImplV9.this.s())
            {
              AppCompatDelegateImplV9.this.n.setAlpha(0.0F);
              AppCompatDelegateImplV9.this.q = s.k(AppCompatDelegateImplV9.this.n).a(1.0F);
              AppCompatDelegateImplV9.this.q.a(new y()
              {
                public void onAnimationEnd(View paramAnonymous2View)
                {
                  AppCompatDelegateImplV9.this.n.setAlpha(1.0F);
                  AppCompatDelegateImplV9.this.q.a(null);
                  AppCompatDelegateImplV9.this.q = null;
                }
                
                public void onAnimationStart(View paramAnonymous2View)
                {
                  AppCompatDelegateImplV9.this.n.setVisibility(0);
                }
              });
              return;
            }
            AppCompatDelegateImplV9.this.n.setAlpha(1.0F);
            AppCompatDelegateImplV9.this.n.setVisibility(0);
          }
        };
        if (this.n == null) {
          continue;
        }
        t();
        this.n.killMode();
        Context localContext = this.n.getContext();
        ActionBarContextView localActionBarContextView = this.n;
        if (this.o != null) {
          continue;
        }
        boolean bool = true;
        android.support.v7.view.e locale = new android.support.v7.view.e(localContext, localActionBarContextView, parama, bool);
        if (!parama.a(locale, locale.b())) {
          continue;
        }
        locale.d();
        this.n.initForMode(locale);
        this.m = locale;
        if (!s()) {
          continue;
        }
        this.n.setAlpha(0.0F);
        this.q = s.k(this.n).a(1.0F);
        this.q.a(new y()
        {
          public void onAnimationEnd(View paramAnonymousView)
          {
            AppCompatDelegateImplV9.this.n.setAlpha(1.0F);
            AppCompatDelegateImplV9.this.q.a(null);
            AppCompatDelegateImplV9.this.q = null;
          }
          
          public void onAnimationStart(View paramAnonymousView)
          {
            AppCompatDelegateImplV9.this.n.setVisibility(0);
            AppCompatDelegateImplV9.this.n.sendAccessibilityEvent(32);
            if ((AppCompatDelegateImplV9.this.n.getParent() instanceof View)) {
              s.p((View)AppCompatDelegateImplV9.this.n.getParent());
            }
          }
        });
        if (this.o == null) {
          continue;
        }
        this.b.getDecorView().post(this.p);
        continue;
        localObject = this.a;
        continue;
        ViewStubCompat localViewStubCompat = (ViewStubCompat)this.y.findViewById(a.f.action_mode_bar_stub);
        if (localViewStubCompat == null) {
          continue;
        }
        localViewStubCompat.setLayoutInflater(LayoutInflater.from(n()));
        this.n = ((ActionBarContextView)localViewStubCompat.inflate());
        continue;
        bool = false;
        continue;
        this.n.setAlpha(1.0F);
        this.n.setVisibility(0);
        this.n.sendAccessibilityEvent(32);
        if (!(this.n.getParent() instanceof View)) {
          continue;
        }
        s.p((View)this.n.getParent());
        continue;
        this.m = null;
        continue;
      }
      if (localb1 != null)
      {
        this.m = localb1;
        if ((this.m != null) && (this.e != null)) {
          this.e.a(this.m);
        }
        return this.m;
      }
      android.support.v7.view.b localb1 = null;
    }
  }
  
  public <T extends View> T a(int paramInt)
  {
    w();
    return this.b.findViewById(paramInt);
  }
  
  View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.c instanceof LayoutInflater.Factory))
    {
      View localView = ((LayoutInflater.Factory)this.c).onCreateView(paramString, paramContext, paramAttributeSet);
      if (localView != null) {
        return localView;
      }
    }
    return null;
  }
  
  void a(int paramInt, PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    if (paramMenu == null)
    {
      if ((paramPanelFeatureState == null) && (paramInt >= 0) && (paramInt < this.E.length)) {
        paramPanelFeatureState = this.E[paramInt];
      }
      if (paramPanelFeatureState != null) {
        paramMenu = paramPanelFeatureState.j;
      }
    }
    if ((paramPanelFeatureState != null) && (!paramPanelFeatureState.o)) {}
    while (p()) {
      return;
    }
    this.c.onPanelClosed(paramInt, paramMenu);
  }
  
  void a(int paramInt, Menu paramMenu)
  {
    if (paramInt == 108)
    {
      ActionBar localActionBar = a();
      if (localActionBar != null) {
        localActionBar.f(false);
      }
    }
    PanelFeatureState localPanelFeatureState;
    do
    {
      do
      {
        return;
      } while (paramInt != 0);
      localPanelFeatureState = a(paramInt, true);
    } while (!localPanelFeatureState.o);
    a(localPanelFeatureState, false);
  }
  
  public void a(Configuration paramConfiguration)
  {
    if ((this.h) && (this.x))
    {
      ActionBar localActionBar = a();
      if (localActionBar != null) {
        localActionBar.a(paramConfiguration);
      }
    }
    AppCompatDrawableManager.get().onConfigurationChanged(this.a);
    i();
  }
  
  public void a(Bundle paramBundle)
  {
    ActionBar localActionBar;
    if (((this.c instanceof Activity)) && (NavUtils.getParentActivityName((Activity)this.c) != null))
    {
      localActionBar = m();
      if (localActionBar == null) {
        this.I = true;
      }
    }
    else
    {
      return;
    }
    localActionBar.d(true);
  }
  
  void a(PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramPanelFeatureState.a == 0) && (this.u != null) && (this.u.isOverflowMenuShowing())) {
      b(paramPanelFeatureState.j);
    }
    do
    {
      return;
      WindowManager localWindowManager = (WindowManager)this.a.getSystemService("window");
      if ((localWindowManager != null) && (paramPanelFeatureState.o) && (paramPanelFeatureState.g != null))
      {
        localWindowManager.removeView(paramPanelFeatureState.g);
        if (paramBoolean) {
          a(paramPanelFeatureState.a, paramPanelFeatureState, null);
        }
      }
      paramPanelFeatureState.m = false;
      paramPanelFeatureState.n = false;
      paramPanelFeatureState.o = false;
      paramPanelFeatureState.h = null;
      paramPanelFeatureState.q = true;
    } while (this.F != paramPanelFeatureState);
    this.F = null;
  }
  
  public void a(h paramh)
  {
    a(paramh, true);
  }
  
  public void a(Toolbar paramToolbar)
  {
    if (!(this.c instanceof Activity)) {
      return;
    }
    ActionBar localActionBar = a();
    if ((localActionBar instanceof m)) {
      throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    this.g = null;
    if (localActionBar != null) {
      localActionBar.g();
    }
    if (paramToolbar != null)
    {
      j localj = new j(paramToolbar, ((Activity)this.c).getTitle(), this.d);
      this.f = localj;
      this.b.setCallback(localj.h());
    }
    for (;;)
    {
      f();
      return;
      this.f = null;
      this.b.setCallback(this.d);
    }
  }
  
  public void a(View paramView)
  {
    w();
    ViewGroup localViewGroup = (ViewGroup)this.y.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.c.onContentChanged();
  }
  
  public void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    w();
    ViewGroup localViewGroup = (ViewGroup)this.y.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void a(ViewGroup paramViewGroup) {}
  
  boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    ActionBar localActionBar = a();
    if ((localActionBar != null) && (localActionBar.a(paramInt, paramKeyEvent))) {}
    boolean bool;
    do
    {
      do
      {
        return true;
        if ((this.F == null) || (!a(this.F, paramKeyEvent.getKeyCode(), paramKeyEvent, 1))) {
          break;
        }
      } while (this.F == null);
      this.F.n = true;
      return true;
      if (this.F != null) {
        break;
      }
      PanelFeatureState localPanelFeatureState = a(0, true);
      b(localPanelFeatureState, paramKeyEvent);
      bool = a(localPanelFeatureState, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      localPanelFeatureState.m = false;
    } while (bool);
    return false;
  }
  
  public boolean a(h paramh, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = q();
    if ((localCallback != null) && (!p()))
    {
      PanelFeatureState localPanelFeatureState = a(paramh.p());
      if (localPanelFeatureState != null) {
        return localCallback.onMenuItemSelected(localPanelFeatureState.a, paramMenuItem);
      }
    }
    return false;
  }
  
  boolean a(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramKeyEvent.getKeyCode() == 82) && (this.c.dispatchKeyEvent(paramKeyEvent))) {
      return bool;
    }
    int i = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() == 0) {}
    while (bool)
    {
      return c(i, paramKeyEvent);
      bool = false;
    }
    return b(i, paramKeyEvent);
  }
  
  public android.support.v7.view.b b(b.a parama)
  {
    if (parama == null) {
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    }
    if (this.m != null) {
      this.m.c();
    }
    b localb = new b(parama);
    ActionBar localActionBar = a();
    if (localActionBar != null)
    {
      this.m = localActionBar.a(localb);
      if ((this.m != null) && (this.e != null)) {
        this.e.a(this.m);
      }
    }
    if (this.m == null) {
      this.m = a(localb);
    }
    return this.m;
  }
  
  public View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    String str;
    boolean bool2;
    if (this.L == null)
    {
      str = this.a.obtainStyledAttributes(a.j.AppCompatTheme).getString(a.j.AppCompatTheme_viewInflaterClass);
      if ((str == null) || (AppCompatViewInflater.class.getName().equals(str))) {
        this.L = new AppCompatViewInflater();
      }
    }
    else
    {
      if (!t) {
        break label212;
      }
      if (!(paramAttributeSet instanceof XmlPullParser)) {
        break label199;
      }
      if (((XmlPullParser)paramAttributeSet).getDepth() <= 1) {
        break label193;
      }
      bool2 = true;
    }
    label86:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      for (;;)
      {
        return this.L.a(paramView, paramString, paramContext, paramAttributeSet, bool1, t, true, VectorEnabledTintResources.shouldBeUsed());
        try
        {
          this.L = ((AppCompatViewInflater)Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        catch (Throwable localThrowable)
        {
          Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + str + ". Falling back to default.", localThrowable);
          this.L = new AppCompatViewInflater();
        }
      }
      break;
      bool2 = false;
      break label86;
      bool2 = a((ViewParent)paramView);
      break label86;
    }
  }
  
  public void b(int paramInt)
  {
    w();
    ViewGroup localViewGroup = (ViewGroup)this.y.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.a).inflate(paramInt, localViewGroup);
    this.c.onContentChanged();
  }
  
  public void b(Bundle paramBundle)
  {
    w();
  }
  
  void b(h paramh)
  {
    if (this.D) {
      return;
    }
    this.D = true;
    this.u.dismissPopups();
    Window.Callback localCallback = q();
    if ((localCallback != null) && (!p())) {
      localCallback.onPanelClosed(108, paramh);
    }
    this.D = false;
  }
  
  public void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    w();
    ((ViewGroup)this.y.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void b(CharSequence paramCharSequence)
  {
    if (this.u != null) {
      this.u.setWindowTitle(paramCharSequence);
    }
    do
    {
      return;
      if (m() != null)
      {
        m().b(paramCharSequence);
        return;
      }
    } while (this.z == null);
    this.z.setText(paramCharSequence);
  }
  
  boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    switch (paramInt)
    {
    }
    do
    {
      bool1 = false;
      boolean bool2;
      PanelFeatureState localPanelFeatureState;
      do
      {
        return bool1;
        e(0, paramKeyEvent);
        return bool1;
        bool2 = this.G;
        this.G = false;
        localPanelFeatureState = a(0, false);
        if ((localPanelFeatureState == null) || (!localPanelFeatureState.o)) {
          break;
        }
      } while (bool2);
      a(localPanelFeatureState, bool1);
      return bool1;
    } while (!u());
    return bool1;
  }
  
  boolean b(int paramInt, Menu paramMenu)
  {
    if (paramInt == 108)
    {
      ActionBar localActionBar = a();
      if (localActionBar != null) {
        localActionBar.f(true);
      }
      return true;
    }
    return false;
  }
  
  public boolean c(int paramInt)
  {
    int i = h(paramInt);
    if ((this.l) && (i == 108)) {
      return false;
    }
    if ((this.h) && (i == 1)) {
      this.h = false;
    }
    switch (i)
    {
    default: 
      return this.b.requestFeature(i);
    case 108: 
      z();
      this.h = true;
      return true;
    case 109: 
      z();
      this.i = true;
      return true;
    case 10: 
      z();
      this.j = true;
      return true;
    case 2: 
      z();
      this.B = true;
      return true;
    case 5: 
      z();
      this.C = true;
      return true;
    }
    z();
    this.l = true;
    return true;
  }
  
  boolean c(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      return false;
    case 82: 
      d(0, paramKeyEvent);
      return bool;
    }
    if ((0x80 & paramKeyEvent.getFlags()) != 0) {}
    for (;;)
    {
      this.G = bool;
      break;
      bool = false;
    }
  }
  
  public void d()
  {
    ActionBar localActionBar = a();
    if (localActionBar != null) {
      localActionBar.e(false);
    }
  }
  
  public void e()
  {
    ActionBar localActionBar = a();
    if (localActionBar != null) {
      localActionBar.e(true);
    }
  }
  
  void e(int paramInt)
  {
    a(a(paramInt, true), true);
  }
  
  public void f()
  {
    ActionBar localActionBar = a();
    if ((localActionBar != null) && (localActionBar.e())) {
      return;
    }
    d(0);
  }
  
  void f(int paramInt)
  {
    PanelFeatureState localPanelFeatureState1 = a(paramInt, true);
    if (localPanelFeatureState1.j != null)
    {
      Bundle localBundle = new Bundle();
      localPanelFeatureState1.j.c(localBundle);
      if (localBundle.size() > 0) {
        localPanelFeatureState1.s = localBundle;
      }
      localPanelFeatureState1.j.g();
      localPanelFeatureState1.j.clear();
    }
    localPanelFeatureState1.r = true;
    localPanelFeatureState1.q = true;
    if (((paramInt == 108) || (paramInt == 0)) && (this.u != null))
    {
      PanelFeatureState localPanelFeatureState2 = a(0, false);
      if (localPanelFeatureState2 != null)
      {
        localPanelFeatureState2.m = false;
        b(localPanelFeatureState2, null);
      }
    }
  }
  
  int g(int paramInt)
  {
    int i = 1;
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int i2;
    int i3;
    label198:
    label205:
    int i1;
    if ((this.n != null) && ((this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.n.getLayoutParams();
      if (this.n.isShown())
      {
        if (this.J == null)
        {
          this.J = new Rect();
          this.K = new Rect();
        }
        Rect localRect1 = this.J;
        Rect localRect2 = this.K;
        localRect1.set(0, paramInt, 0, 0);
        ViewUtils.computeFitSystemWindows(this.y, localRect1, localRect2);
        if (localRect2.top == 0)
        {
          i2 = paramInt;
          if (localMarginLayoutParams.topMargin == i2) {
            break label358;
          }
          localMarginLayoutParams.topMargin = paramInt;
          if (this.A != null) {
            break label279;
          }
          this.A = new View(this.a);
          this.A.setBackgroundColor(this.a.getResources().getColor(a.c.abc_input_method_navigation_guard));
          this.y.addView(this.A, -1, new ViewGroup.LayoutParams(-1, paramInt));
          i3 = i;
          if (this.A == null) {
            break label318;
          }
          if ((!this.j) && (i != 0)) {
            paramInt = 0;
          }
          int i4 = i3;
          i1 = i;
          i = i4;
          label228:
          if (i != 0) {
            this.n.setLayoutParams(localMarginLayoutParams);
          }
        }
      }
    }
    for (int j = i1;; j = 0)
    {
      View localView;
      int k;
      if (this.A != null)
      {
        localView = this.A;
        k = 0;
        if (j == 0) {
          break label343;
        }
      }
      for (;;)
      {
        localView.setVisibility(k);
        return paramInt;
        i2 = 0;
        break;
        label279:
        ViewGroup.LayoutParams localLayoutParams = this.A.getLayoutParams();
        if (localLayoutParams.height != paramInt)
        {
          localLayoutParams.height = paramInt;
          this.A.setLayoutParams(localLayoutParams);
        }
        i3 = i;
        break label198;
        label318:
        i = 0;
        break label205;
        if (localMarginLayoutParams.topMargin == 0) {
          break label350;
        }
        localMarginLayoutParams.topMargin = 0;
        i1 = 0;
        break label228;
        label343:
        k = 8;
      }
      label350:
      i1 = 0;
      i = 0;
      break label228;
      label358:
      i3 = 0;
      break label198;
    }
  }
  
  public void g()
  {
    if (this.r) {
      this.b.getDecorView().removeCallbacks(this.H);
    }
    super.g();
    if (this.f != null) {
      this.f.g();
    }
  }
  
  public void h()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.a);
    if (localLayoutInflater.getFactory() == null) {
      android.support.v4.view.e.b(localLayoutInflater, this);
    }
    while ((localLayoutInflater.getFactory2() instanceof AppCompatDelegateImplV9)) {
      return;
    }
    Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
  }
  
  public void l()
  {
    w();
    if ((!this.h) || (this.f != null)) {}
    for (;;)
    {
      return;
      if ((this.c instanceof Activity)) {
        this.f = new m((Activity)this.c, this.i);
      }
      while (this.f != null)
      {
        this.f.d(this.I);
        return;
        if ((this.c instanceof Dialog)) {
          this.f = new m((Dialog)this.c);
        }
      }
    }
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = a(paramView, paramString, paramContext, paramAttributeSet);
    if (localView != null) {
      return localView;
    }
    return b(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  final boolean s()
  {
    return (this.x) && (this.y != null) && (s.x(this.y));
  }
  
  void t()
  {
    if (this.q != null) {
      this.q.b();
    }
  }
  
  boolean u()
  {
    if (this.m != null) {
      this.m.c();
    }
    ActionBar localActionBar;
    do
    {
      return true;
      localActionBar = a();
    } while ((localActionBar != null) && (localActionBar.f()));
    return false;
  }
  
  void v()
  {
    if (this.u != null) {
      this.u.dismissPopups();
    }
    if (this.o != null)
    {
      this.b.getDecorView().removeCallbacks(this.p);
      if (!this.o.isShowing()) {}
    }
    try
    {
      this.o.dismiss();
      label55:
      this.o = null;
      t();
      PanelFeatureState localPanelFeatureState = a(0, false);
      if ((localPanelFeatureState != null) && (localPanelFeatureState.j != null)) {
        localPanelFeatureState.j.close();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label55;
    }
  }
  
  protected static final class PanelFeatureState
  {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    h j;
    f k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    Bundle s;
    
    PanelFeatureState(int paramInt)
    {
      this.a = paramInt;
      this.q = false;
    }
    
    p a(o.a parama)
    {
      if (this.j == null) {
        return null;
      }
      if (this.k == null)
      {
        this.k = new f(this.l, a.g.abc_list_menu_item_layout);
        this.k.a(parama);
        this.j.a(this.k);
      }
      return this.k.a(this.g);
    }
    
    void a(Context paramContext)
    {
      TypedValue localTypedValue = new TypedValue();
      Resources.Theme localTheme = paramContext.getResources().newTheme();
      localTheme.setTo(paramContext.getTheme());
      localTheme.resolveAttribute(a.a.actionBarPopupTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0) {
        localTheme.applyStyle(localTypedValue.resourceId, true);
      }
      localTheme.resolveAttribute(a.a.panelMenuListTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0) {
        localTheme.applyStyle(localTypedValue.resourceId, true);
      }
      for (;;)
      {
        android.support.v7.view.d locald = new android.support.v7.view.d(paramContext, 0);
        locald.getTheme().setTo(localTheme);
        this.l = locald;
        TypedArray localTypedArray = locald.obtainStyledAttributes(a.j.AppCompatTheme);
        this.b = localTypedArray.getResourceId(a.j.AppCompatTheme_panelBackground, 0);
        this.f = localTypedArray.getResourceId(a.j.AppCompatTheme_android_windowAnimationStyle, 0);
        localTypedArray.recycle();
        return;
        localTheme.applyStyle(a.i.Theme_AppCompat_CompactMenu, true);
      }
    }
    
    void a(h paramh)
    {
      if (paramh == this.j) {}
      do
      {
        return;
        if (this.j != null) {
          this.j.b(this.k);
        }
        this.j = paramh;
      } while ((paramh == null) || (this.k == null));
      paramh.a(this.k);
    }
    
    public boolean a()
    {
      boolean bool = true;
      if (this.h == null) {
        bool = false;
      }
      while ((this.i != null) || (this.k.d().getCount() > 0)) {
        return bool;
      }
      return false;
    }
    
    private static class SavedState
      implements Parcelable
    {
      public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
      {
        public AppCompatDelegateImplV9.PanelFeatureState.SavedState a(Parcel paramAnonymousParcel)
        {
          return AppCompatDelegateImplV9.PanelFeatureState.SavedState.a(paramAnonymousParcel, null);
        }
        
        public AppCompatDelegateImplV9.PanelFeatureState.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
        {
          return AppCompatDelegateImplV9.PanelFeatureState.SavedState.a(paramAnonymousParcel, paramAnonymousClassLoader);
        }
        
        public AppCompatDelegateImplV9.PanelFeatureState.SavedState[] a(int paramAnonymousInt)
        {
          return new AppCompatDelegateImplV9.PanelFeatureState.SavedState[paramAnonymousInt];
        }
      };
      int a;
      boolean b;
      Bundle c;
      
      static SavedState a(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        int i = 1;
        SavedState localSavedState = new SavedState();
        localSavedState.a = paramParcel.readInt();
        if (paramParcel.readInt() == i) {}
        for (;;)
        {
          localSavedState.b = i;
          if (localSavedState.b) {
            localSavedState.c = paramParcel.readBundle(paramClassLoader);
          }
          return localSavedState;
          i = 0;
        }
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(this.a);
        if (this.b) {}
        for (int i = 1;; i = 0)
        {
          paramParcel.writeInt(i);
          if (this.b) {
            paramParcel.writeBundle(this.c);
          }
          return;
        }
      }
    }
  }
  
  private final class a
    implements o.a
  {
    a() {}
    
    public void a(h paramh, boolean paramBoolean)
    {
      AppCompatDelegateImplV9.this.b(paramh);
    }
    
    public boolean a(h paramh)
    {
      Window.Callback localCallback = AppCompatDelegateImplV9.this.q();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paramh);
      }
      return true;
    }
  }
  
  class b
    implements b.a
  {
    private b.a b;
    
    public b(b.a parama)
    {
      this.b = parama;
    }
    
    public void a(android.support.v7.view.b paramb)
    {
      this.b.a(paramb);
      if (AppCompatDelegateImplV9.this.o != null) {
        AppCompatDelegateImplV9.this.b.getDecorView().removeCallbacks(AppCompatDelegateImplV9.this.p);
      }
      if (AppCompatDelegateImplV9.this.n != null)
      {
        AppCompatDelegateImplV9.this.t();
        AppCompatDelegateImplV9.this.q = s.k(AppCompatDelegateImplV9.this.n).a(0.0F);
        AppCompatDelegateImplV9.this.q.a(new y()
        {
          public void onAnimationEnd(View paramAnonymousView)
          {
            AppCompatDelegateImplV9.this.n.setVisibility(8);
            if (AppCompatDelegateImplV9.this.o != null) {
              AppCompatDelegateImplV9.this.o.dismiss();
            }
            for (;;)
            {
              AppCompatDelegateImplV9.this.n.removeAllViews();
              AppCompatDelegateImplV9.this.q.a(null);
              AppCompatDelegateImplV9.this.q = null;
              return;
              if ((AppCompatDelegateImplV9.this.n.getParent() instanceof View)) {
                s.p((View)AppCompatDelegateImplV9.this.n.getParent());
              }
            }
          }
        });
      }
      if (AppCompatDelegateImplV9.this.e != null) {
        AppCompatDelegateImplV9.this.e.b(AppCompatDelegateImplV9.this.m);
      }
      AppCompatDelegateImplV9.this.m = null;
    }
    
    public boolean a(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.b.a(paramb, paramMenu);
    }
    
    public boolean a(android.support.v7.view.b paramb, MenuItem paramMenuItem)
    {
      return this.b.a(paramb, paramMenuItem);
    }
    
    public boolean b(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.b.b(paramb, paramMenu);
    }
  }
  
  private class c
    extends ContentFrameLayout
  {
    public c(Context paramContext)
    {
      super();
    }
    
    private boolean a(int paramInt1, int paramInt2)
    {
      return (paramInt1 < -5) || (paramInt2 < -5) || (paramInt1 > 5 + getWidth()) || (paramInt2 > 5 + getHeight());
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (AppCompatDelegateImplV9.this.a(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if ((paramMotionEvent.getAction() == 0) && (a((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
      {
        AppCompatDelegateImplV9.this.e(0);
        return true;
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(android.support.v7.c.a.b.b(getContext(), paramInt));
    }
  }
  
  private final class d
    implements o.a
  {
    d() {}
    
    public void a(h paramh, boolean paramBoolean)
    {
      h localh = paramh.p();
      if (localh != paramh) {}
      AppCompatDelegateImplV9.PanelFeatureState localPanelFeatureState;
      for (int i = 1;; i = 0)
      {
        AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
        if (i != 0) {
          paramh = localh;
        }
        localPanelFeatureState = localAppCompatDelegateImplV9.a(paramh);
        if (localPanelFeatureState != null)
        {
          if (i == 0) {
            break;
          }
          AppCompatDelegateImplV9.this.a(localPanelFeatureState.a, localPanelFeatureState, localh);
          AppCompatDelegateImplV9.this.a(localPanelFeatureState, true);
        }
        return;
      }
      AppCompatDelegateImplV9.this.a(localPanelFeatureState, paramBoolean);
    }
    
    public boolean a(h paramh)
    {
      if ((paramh == null) && (AppCompatDelegateImplV9.this.h))
      {
        Window.Callback localCallback = AppCompatDelegateImplV9.this.q();
        if ((localCallback != null) && (!AppCompatDelegateImplV9.this.p())) {
          localCallback.onMenuOpened(108, paramh);
        }
      }
      return true;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.AppCompatDelegateImplV9
 * JD-Core Version:    0.7.0.1
 */