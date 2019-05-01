package android.support.v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.a;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
  extends ViewGroup
{
  static final int[] a;
  static final boolean b;
  private static final int[] c;
  private static final boolean d;
  private float A;
  private Drawable B;
  private Drawable C;
  private Drawable D;
  private CharSequence E;
  private CharSequence F;
  private Object G;
  private boolean H;
  private Drawable I = null;
  private Drawable J = null;
  private Drawable K = null;
  private Drawable L = null;
  private final ArrayList<View> M;
  private final b e = new b();
  private float f;
  private int g;
  private int h = -1728053248;
  private float i;
  private Paint j = new Paint();
  private final r k;
  private final r l;
  private final d m;
  private final d n;
  private int o;
  private boolean p;
  private boolean q = true;
  private int r = 3;
  private int s = 3;
  private int t = 3;
  private int u = 3;
  private boolean v;
  private boolean w;
  private c x;
  private List<c> y;
  private float z;
  
  static
  {
    boolean bool1 = true;
    int[] arrayOfInt1 = new int[bool1];
    arrayOfInt1[0] = 16843828;
    c = arrayOfInt1;
    int[] arrayOfInt2 = new int[bool1];
    arrayOfInt2[0] = 16842931;
    a = arrayOfInt2;
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool2 = bool1;
      b = bool2;
      if (Build.VERSION.SDK_INT < 21) {
        break label60;
      }
    }
    for (;;)
    {
      d = bool1;
      return;
      bool2 = false;
      break;
      label60:
      bool1 = false;
    }
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.g = ((int)(0.5F + 64.0F * f1));
    float f2 = 400.0F * f1;
    this.m = new d(3);
    this.n = new d(5);
    this.k = r.a(this, 1.0F, this.m);
    this.k.a(1);
    this.k.a(f2);
    this.m.a(this.k);
    this.l = r.a(this, 1.0F, this.n);
    this.l.a(2);
    this.l.a(f2);
    this.n.a(this.l);
    setFocusableInTouchMode(true);
    s.a(this, 1);
    s.a(this, new a());
    setMotionEventSplittingEnabled(false);
    TypedArray localTypedArray;
    if (s.q(this))
    {
      if (Build.VERSION.SDK_INT < 21) {
        break label342;
      }
      setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        @TargetApi(21)
        public WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
        {
          DrawerLayout localDrawerLayout = (DrawerLayout)paramAnonymousView;
          if (paramAnonymousWindowInsets.getSystemWindowInsetTop() > 0) {}
          for (boolean bool = true;; bool = false)
          {
            localDrawerLayout.a(paramAnonymousWindowInsets, bool);
            return paramAnonymousWindowInsets.consumeSystemWindowInsets();
          }
        }
      });
      setSystemUiVisibility(1280);
      localTypedArray = paramContext.obtainStyledAttributes(c);
    }
    for (;;)
    {
      try
      {
        this.B = localTypedArray.getDrawable(0);
        localTypedArray.recycle();
        this.f = (f1 * 10.0F);
        this.M = new ArrayList();
        return;
      }
      finally
      {
        localTypedArray.recycle();
      }
      label342:
      this.B = null;
    }
  }
  
  private boolean a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable == null) || (!android.support.v4.a.a.a.b(paramDrawable))) {
      return false;
    }
    android.support.v4.a.a.a.b(paramDrawable, paramInt);
    return true;
  }
  
  private void c(View paramView, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (((!paramBoolean) && (!g(localView))) || ((paramBoolean) && (localView == paramView))) {
        s.a(localView, 1);
      }
      for (;;)
      {
        i2++;
        break;
        s.a(localView, 4);
      }
    }
  }
  
  static String d(int paramInt)
  {
    if ((paramInt & 0x3) == 3) {
      return "LEFT";
    }
    if ((paramInt & 0x5) == 5) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  private void e()
  {
    if (d) {
      return;
    }
    this.C = f();
    this.D = g();
  }
  
  private Drawable f()
  {
    int i1 = s.e(this);
    if (i1 == 0)
    {
      if (this.I != null)
      {
        a(this.I, i1);
        return this.I;
      }
    }
    else if (this.J != null)
    {
      a(this.J, i1);
      return this.J;
    }
    return this.K;
  }
  
  private Drawable g()
  {
    int i1 = s.e(this);
    if (i1 == 0)
    {
      if (this.J != null)
      {
        a(this.J, i1);
        return this.J;
      }
    }
    else if (this.I != null)
    {
      a(this.I, i1);
      return this.I;
    }
    return this.L;
  }
  
  private boolean h()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((LayoutParams)getChildAt(i2).getLayoutParams()).c) {
        return true;
      }
    }
    return false;
  }
  
  private boolean i()
  {
    return c() != null;
  }
  
  static boolean l(View paramView)
  {
    return (s.d(paramView) != 4) && (s.d(paramView) != 2);
  }
  
  private static boolean m(View paramView)
  {
    Drawable localDrawable = paramView.getBackground();
    boolean bool = false;
    if (localDrawable != null)
    {
      int i1 = localDrawable.getOpacity();
      bool = false;
      if (i1 == -1) {
        bool = true;
      }
    }
    return bool;
  }
  
  public int a(int paramInt)
  {
    int i1 = s.e(this);
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      if (this.r != 3) {
        return this.r;
      }
      if (i1 == 0) {}
      for (int i5 = this.t; i5 != 3; i5 = this.u) {
        return i5;
      }
      if (this.s != 3) {
        return this.s;
      }
      if (i1 == 0) {}
      for (int i4 = this.u; i4 != 3; i4 = this.t) {
        return i4;
      }
      if (this.t != 3) {
        return this.t;
      }
      if (i1 == 0) {}
      for (int i3 = this.r; i3 != 3; i3 = this.s) {
        return i3;
      }
      if (this.u != 3) {
        return this.u;
      }
      if (i1 == 0) {}
      for (int i2 = this.s; i2 != 3; i2 = this.r) {
        return i2;
      }
    }
  }
  
  public int a(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return a(((LayoutParams)paramView.getLayoutParams()).a);
  }
  
  View a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((0x1 & ((LayoutParams)localView.getLayoutParams()).d) == 1) {
        return localView;
      }
    }
    return null;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = d.a(paramInt2, s.e(this));
    r localr;
    switch (paramInt2)
    {
    default: 
      if (paramInt1 != 0)
      {
        if (i1 == 3)
        {
          localr = this.k;
          label67:
          localr.e();
        }
      }
      else {
        switch (paramInt1)
        {
        }
      }
      break;
    }
    View localView1;
    do
    {
      View localView2;
      do
      {
        return;
        this.r = paramInt1;
        break;
        this.s = paramInt1;
        break;
        this.t = paramInt1;
        break;
        this.u = paramInt1;
        break;
        localr = this.l;
        break label67;
        localView2 = c(i1);
      } while (localView2 == null);
      h(localView2);
      return;
      localView1 = c(i1);
    } while (localView1 == null);
    i(localView1);
  }
  
  void a(int paramInt1, int paramInt2, View paramView)
  {
    int i1 = this.k.a();
    int i2 = this.l.a();
    int i3;
    LayoutParams localLayoutParams;
    if ((i1 == 1) || (i2 == 1))
    {
      i3 = 1;
      if ((paramView != null) && (paramInt2 == 0))
      {
        localLayoutParams = (LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams.b != 0.0F) {
          break label156;
        }
        b(paramView);
      }
    }
    for (;;)
    {
      if (i3 == this.o) {
        return;
      }
      this.o = i3;
      if (this.y == null) {
        return;
      }
      for (int i4 = -1 + this.y.size(); i4 >= 0; i4--) {
        ((c)this.y.get(i4)).onDrawerStateChanged(i3);
      }
      if ((i1 == 2) || (i2 == 2))
      {
        i3 = 2;
        break;
      }
      i3 = 0;
      break;
      label156:
      if (localLayoutParams.b == 1.0F) {
        c(paramView);
      }
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    View localView = c(paramInt);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + d(paramInt));
    }
    a(localView, paramBoolean);
  }
  
  public void a(c paramc)
  {
    if (paramc == null) {
      return;
    }
    if (this.y == null) {
      this.y = new ArrayList();
    }
    this.y.add(paramc);
  }
  
  void a(View paramView, float paramFloat)
  {
    if (this.y != null) {
      for (int i1 = -1 + this.y.size(); i1 >= 0; i1--) {
        ((c)this.y.get(i1)).onDrawerSlide(paramView, paramFloat);
      }
    }
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (this.q)
    {
      localLayoutParams.b = 1.0F;
      localLayoutParams.d = 1;
      c(paramView, true);
    }
    for (;;)
    {
      invalidate();
      return;
      if (paramBoolean)
      {
        localLayoutParams.d = (0x2 | localLayoutParams.d);
        if (a(paramView, 3)) {
          this.k.a(paramView, 0, paramView.getTop());
        } else {
          this.l.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
        }
      }
      else
      {
        c(paramView, 1.0F);
        a(localLayoutParams.a, 0, paramView);
        paramView.setVisibility(0);
      }
    }
  }
  
  public void a(Object paramObject, boolean paramBoolean)
  {
    this.G = paramObject;
    this.H = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      requestLayout();
      return;
    }
  }
  
  void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool = false;
    while (i2 < i1)
    {
      View localView = getChildAt(i2);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if ((!g(localView)) || ((paramBoolean) && (!localLayoutParams.c)))
      {
        i2++;
      }
      else
      {
        int i3 = localView.getWidth();
        if (a(localView, 3)) {
          bool |= this.k.a(localView, -i3, localView.getTop());
        }
        for (;;)
        {
          localLayoutParams.c = false;
          break;
          bool |= this.l.a(localView, getWidth(), localView.getTop());
        }
      }
    }
    this.m.a();
    this.n.a();
    if (bool) {
      invalidate();
    }
  }
  
  boolean a(View paramView, int paramInt)
  {
    return (paramInt & e(paramView)) == paramInt;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int i2 = getChildCount();
    int i3 = 0;
    int i4 = 0;
    if (i3 < i2)
    {
      View localView2 = getChildAt(i3);
      if (g(localView2)) {
        if (j(localView2))
        {
          i4 = 1;
          localView2.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
      for (;;)
      {
        i3++;
        break;
        this.M.add(localView2);
      }
    }
    if (i4 == 0)
    {
      int i5 = this.M.size();
      while (i1 < i5)
      {
        View localView1 = (View)this.M.get(i1);
        if (localView1.getVisibility() == 0) {
          localView1.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
        i1++;
      }
    }
    this.M.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((a() != null) || (g(paramView))) {
      s.a(paramView, 4);
    }
    for (;;)
    {
      if (!b) {
        s.a(paramView, this.e);
      }
      return;
      s.a(paramView, 1);
    }
  }
  
  public CharSequence b(int paramInt)
  {
    int i1 = d.a(paramInt, s.e(this));
    if (i1 == 3) {
      return this.E;
    }
    if (i1 == 5) {
      return this.F;
    }
    return null;
  }
  
  public void b()
  {
    a(false);
  }
  
  public void b(int paramInt, boolean paramBoolean)
  {
    View localView = c(paramInt);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + d(paramInt));
    }
    b(localView, paramBoolean);
  }
  
  public void b(c paramc)
  {
    if (paramc == null) {}
    while (this.y == null) {
      return;
    }
    this.y.remove(paramc);
  }
  
  void b(View paramView)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((0x1 & localLayoutParams.d) == 1)
    {
      localLayoutParams.d = 0;
      if (this.y != null) {
        for (int i1 = -1 + this.y.size(); i1 >= 0; i1--) {
          ((c)this.y.get(i1)).onDrawerClosed(paramView);
        }
      }
      c(paramView, false);
      if (hasWindowFocus())
      {
        View localView = getRootView();
        if (localView != null) {
          localView.sendAccessibilityEvent(32);
        }
      }
    }
  }
  
  void b(View paramView, float paramFloat)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (paramFloat == localLayoutParams.b) {
      return;
    }
    localLayoutParams.b = paramFloat;
    a(paramView, paramFloat);
  }
  
  public void b(View paramView, boolean paramBoolean)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (this.q)
    {
      localLayoutParams.b = 0.0F;
      localLayoutParams.d = 0;
    }
    for (;;)
    {
      invalidate();
      return;
      if (paramBoolean)
      {
        localLayoutParams.d = (0x4 | localLayoutParams.d);
        if (a(paramView, 3)) {
          this.k.a(paramView, -paramView.getWidth(), paramView.getTop());
        } else {
          this.l.a(paramView, getWidth(), paramView.getTop());
        }
      }
      else
      {
        c(paramView, 0.0F);
        a(localLayoutParams.a, 0, paramView);
        paramView.setVisibility(4);
      }
    }
  }
  
  View c()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((g(localView)) && (k(localView))) {
        return localView;
      }
    }
    return null;
  }
  
  View c(int paramInt)
  {
    int i1 = 0x7 & d.a(paramInt, s.e(this));
    int i2 = getChildCount();
    for (int i3 = 0; i3 < i2; i3++)
    {
      View localView = getChildAt(i3);
      if ((0x7 & e(localView)) == i1) {
        return localView;
      }
    }
    return null;
  }
  
  void c(View paramView)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((0x1 & localLayoutParams.d) == 0)
    {
      localLayoutParams.d = 1;
      if (this.y != null) {
        for (int i1 = -1 + this.y.size(); i1 >= 0; i1--) {
          ((c)this.y.get(i1)).onDrawerOpened(paramView);
        }
      }
      c(paramView, true);
      if (hasWindowFocus()) {
        sendAccessibilityEvent(32);
      }
    }
  }
  
  void c(View paramView, float paramFloat)
  {
    float f1 = d(paramView);
    int i1 = paramView.getWidth();
    int i2 = (int)(f1 * i1);
    int i3 = (int)(paramFloat * i1) - i2;
    if (a(paramView, 3)) {}
    for (;;)
    {
      paramView.offsetLeftAndRight(i3);
      b(paramView, paramFloat);
      return;
      i3 = -i3;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    int i1 = getChildCount();
    float f1 = 0.0F;
    for (int i2 = 0; i2 < i1; i2++) {
      f1 = Math.max(f1, ((LayoutParams)getChildAt(i2).getLayoutParams()).b);
    }
    this.i = f1;
    boolean bool1 = this.k.a(true);
    boolean bool2 = this.l.a(true);
    if ((bool1) || (bool2)) {
      s.c(this);
    }
  }
  
  float d(View paramView)
  {
    return ((LayoutParams)paramView.getLayoutParams()).b;
  }
  
  void d()
  {
    int i1 = 0;
    if (!this.w)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
      int i2 = getChildCount();
      while (i1 < i2)
      {
        getChildAt(i1).dispatchTouchEvent(localMotionEvent);
        i1++;
      }
      localMotionEvent.recycle();
      this.w = true;
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = f(paramView);
    int i2 = getWidth();
    int i3 = paramCanvas.save();
    int i4 = 0;
    View localView;
    int i16;
    int i17;
    if (bool1)
    {
      int i14 = getChildCount();
      int i15 = 0;
      for (;;)
      {
        if (i15 < i14)
        {
          localView = getChildAt(i15);
          if ((localView != paramView) && (localView.getVisibility() == 0) && (m(localView)) && (g(localView)))
          {
            if (localView.getHeight() < i1)
            {
              i16 = i2;
              i15++;
              i2 = i16;
              continue;
            }
            if (a(localView, 3))
            {
              i17 = localView.getRight();
              if (i17 <= i4) {
                break label496;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      i4 = i17;
      i16 = i2;
      break;
      i16 = localView.getLeft();
      if (i16 < i2) {
        break;
      }
      i16 = i2;
      break;
      paramCanvas.clipRect(i4, 0, i2, getHeight());
      int i5 = i2;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i3);
      if ((this.i > 0.0F) && (bool1))
      {
        int i13 = (int)(((0xFF000000 & this.h) >>> 24) * this.i) << 24 | 0xFFFFFF & this.h;
        this.j.setColor(i13);
        paramCanvas.drawRect(i4, 0.0F, i5, getHeight(), this.j);
      }
      do
      {
        return bool2;
        if ((this.C != null) && (a(paramView, 3)))
        {
          int i10 = this.C.getIntrinsicWidth();
          int i11 = paramView.getRight();
          int i12 = this.k.b();
          float f2 = Math.max(0.0F, Math.min(i11 / i12, 1.0F));
          this.C.setBounds(i11, paramView.getTop(), i10 + i11, paramView.getBottom());
          this.C.setAlpha((int)(255.0F * f2));
          this.C.draw(paramCanvas);
          return bool2;
        }
      } while ((this.D == null) || (!a(paramView, 5)));
      int i6 = this.D.getIntrinsicWidth();
      int i7 = paramView.getLeft();
      int i8 = getWidth() - i7;
      int i9 = this.l.b();
      float f1 = Math.max(0.0F, Math.min(i8 / i9, 1.0F));
      this.D.setBounds(i7 - i6, paramView.getTop(), i7, paramView.getBottom());
      this.D.setAlpha((int)(255.0F * f1));
      this.D.draw(paramCanvas);
      return bool2;
      label496:
      i17 = i4;
    }
  }
  
  int e(View paramView)
  {
    return d.a(((LayoutParams)paramView.getLayoutParams()).a, s.e(this));
  }
  
  public void e(int paramInt)
  {
    a(paramInt, true);
  }
  
  public void f(int paramInt)
  {
    b(paramInt, true);
  }
  
  boolean f(View paramView)
  {
    return ((LayoutParams)paramView.getLayoutParams()).a == 0;
  }
  
  public boolean g(int paramInt)
  {
    View localView = c(paramInt);
    if (localView != null) {
      return j(localView);
    }
    return false;
  }
  
  boolean g(View paramView)
  {
    int i1 = d.a(((LayoutParams)paramView.getLayoutParams()).a, s.e(paramView));
    if ((i1 & 0x3) != 0) {
      return true;
    }
    return (i1 & 0x5) != 0;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams)) {
      return new LayoutParams((LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public float getDrawerElevation()
  {
    if (d) {
      return this.f;
    }
    return 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.B;
  }
  
  public void h(View paramView)
  {
    a(paramView, true);
  }
  
  public boolean h(int paramInt)
  {
    View localView = c(paramInt);
    if (localView != null) {
      return k(localView);
    }
    return false;
  }
  
  public void i(View paramView)
  {
    b(paramView, true);
  }
  
  public boolean j(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return (0x1 & ((LayoutParams)paramView.getLayoutParams()).d) == 1;
  }
  
  public boolean k(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return ((LayoutParams)paramView.getLayoutParams()).b > 0.0F;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.q = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.q = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1;
    if ((this.H) && (this.B != null))
    {
      if (Build.VERSION.SDK_INT < 21) {
        break label77;
      }
      if (this.G == null) {
        break label72;
      }
      i1 = ((WindowInsets)this.G).getSystemWindowInsetTop();
    }
    for (;;)
    {
      if (i1 > 0)
      {
        this.B.setBounds(0, 0, getWidth(), i1);
        this.B.draw(paramCanvas);
      }
      return;
      label72:
      i1 = 0;
      continue;
      label77:
      i1 = 0;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    boolean bool1 = this.k.a(paramMotionEvent) | this.l.a(paramMotionEvent);
    switch (i1)
    {
    default: 
      i2 = 0;
      boolean bool2;
      if ((!bool1) && (i2 == 0) && (!h()))
      {
        boolean bool3 = this.w;
        bool2 = false;
        if (!bool3) {}
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    case 0: 
      label59:
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.z = f1;
      this.A = f2;
      if (this.i > 0.0F)
      {
        View localView = this.k.d((int)f1, (int)f2);
        if ((localView == null) || (!f(localView))) {
          break;
        }
      }
      break;
    }
    for (int i2 = 1;; i2 = 0)
    {
      this.v = false;
      this.w = false;
      break label59;
      if (!this.k.d(3)) {
        break;
      }
      this.m.a();
      this.n.a();
      i2 = 0;
      break label59;
      a(true);
      this.v = false;
      this.w = false;
      break;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (i()))
    {
      paramKeyEvent.startTracking();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      View localView = c();
      if ((localView != null) && (a(localView) == 0)) {
        b();
      }
      return localView != null;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    if (i3 < i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 8) {}
      LayoutParams localLayoutParams;
      for (;;)
      {
        i3++;
        break;
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (!f(localView)) {
          break label110;
        }
        localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
      }
      label110:
      int i4 = localView.getMeasuredWidth();
      int i5 = localView.getMeasuredHeight();
      int i6;
      float f1;
      label162:
      int i7;
      if (a(localView, 3))
      {
        i6 = -i4 + (int)(i4 * localLayoutParams.b);
        f1 = (i4 + i6) / i4;
        if (f1 == localLayoutParams.b) {
          break label313;
        }
        i7 = 1;
        label176:
        switch (0x70 & localLayoutParams.a)
        {
        default: 
          localView.layout(i6, localLayoutParams.topMargin, i4 + i6, i5 + localLayoutParams.topMargin);
          label237:
          if (i7 != 0) {
            b(localView, f1);
          }
          if (localLayoutParams.b <= 0.0F) {
            break;
          }
        }
      }
      for (int i10 = 0; localView.getVisibility() != i10; i10 = 4)
      {
        localView.setVisibility(i10);
        break;
        i6 = i1 - (int)(i4 * localLayoutParams.b);
        f1 = (i1 - i6) / i4;
        break label162;
        label313:
        i7 = 0;
        break label176;
        int i11 = paramInt4 - paramInt2;
        localView.layout(i6, i11 - localLayoutParams.bottomMargin - localView.getMeasuredHeight(), i4 + i6, i11 - localLayoutParams.bottomMargin);
        break label237;
        int i8 = paramInt4 - paramInt2;
        int i9 = (i8 - i5) / 2;
        if (i9 < localLayoutParams.topMargin) {
          i9 = localLayoutParams.topMargin;
        }
        for (;;)
        {
          localView.layout(i6, i9, i4 + i6, i5 + i9);
          break;
          if (i9 + i5 > i8 - localLayoutParams.bottomMargin) {
            i9 = i8 - localLayoutParams.bottomMargin - i5;
          }
        }
      }
    }
    this.p = false;
    this.q = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    if ((i1 != 1073741824) || (i2 != 1073741824)) {
      if (isInEditMode()) {
        if (i1 == -2147483648)
        {
          if (i2 != -2147483648) {
            break label157;
          }
          i5 = i4;
          i6 = i3;
        }
      }
    }
    for (;;)
    {
      label68:
      setMeasuredDimension(i6, i5);
      if ((this.G != null) && (s.q(this))) {}
      int i8;
      int i9;
      int i10;
      int i12;
      View localView;
      for (int i7 = 1;; i7 = 0)
      {
        i8 = s.e(this);
        i9 = 0;
        i10 = 0;
        int i11 = getChildCount();
        for (i12 = 0;; i12++)
        {
          if (i12 >= i11) {
            break label768;
          }
          localView = getChildAt(i12);
          if (localView.getVisibility() != 8) {
            break;
          }
        }
        if (i1 != 0) {
          break;
        }
        i3 = 300;
        break;
        label157:
        if (i2 != 0) {
          break label769;
        }
        i5 = 300;
        i6 = i3;
        break label68;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
      }
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      int i18;
      WindowInsets localWindowInsets2;
      if (i7 != 0)
      {
        i18 = d.a(localLayoutParams.a, i8);
        if (!s.q(localView)) {
          break label369;
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
          localWindowInsets2 = (WindowInsets)this.G;
          if (i18 != 3) {
            break label337;
          }
          localWindowInsets2 = localWindowInsets2.replaceSystemWindowInsets(localWindowInsets2.getSystemWindowInsetLeft(), localWindowInsets2.getSystemWindowInsetTop(), 0, localWindowInsets2.getSystemWindowInsetBottom());
          label272:
          localView.dispatchApplyWindowInsets(localWindowInsets2);
        }
      }
      for (;;)
      {
        if (f(localView))
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(i6 - localLayoutParams.leftMargin - localLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i5 - localLayoutParams.topMargin - localLayoutParams.bottomMargin, 1073741824));
          break;
          label337:
          if (i18 != 5) {
            break label272;
          }
          localWindowInsets2 = localWindowInsets2.replaceSystemWindowInsets(0, localWindowInsets2.getSystemWindowInsetTop(), localWindowInsets2.getSystemWindowInsetRight(), localWindowInsets2.getSystemWindowInsetBottom());
          break label272;
          label369:
          if (Build.VERSION.SDK_INT >= 21)
          {
            WindowInsets localWindowInsets1 = (WindowInsets)this.G;
            if (i18 == 3) {
              localWindowInsets1 = localWindowInsets1.replaceSystemWindowInsets(localWindowInsets1.getSystemWindowInsetLeft(), localWindowInsets1.getSystemWindowInsetTop(), 0, localWindowInsets1.getSystemWindowInsetBottom());
            }
            for (;;)
            {
              localLayoutParams.leftMargin = localWindowInsets1.getSystemWindowInsetLeft();
              localLayoutParams.topMargin = localWindowInsets1.getSystemWindowInsetTop();
              localLayoutParams.rightMargin = localWindowInsets1.getSystemWindowInsetRight();
              localLayoutParams.bottomMargin = localWindowInsets1.getSystemWindowInsetBottom();
              break;
              if (i18 == 5) {
                localWindowInsets1 = localWindowInsets1.replaceSystemWindowInsets(0, localWindowInsets1.getSystemWindowInsetTop(), localWindowInsets1.getSystemWindowInsetRight(), localWindowInsets1.getSystemWindowInsetBottom());
              }
            }
          }
        }
      }
      if (g(localView))
      {
        if ((d) && (s.l(localView) != this.f)) {
          s.a(localView, this.f);
        }
        int i13 = 0x7 & e(localView);
        if (i13 == 3) {}
        for (int i14 = 1; ((i14 != 0) && (i9 != 0)) || ((i14 == 0) && (i10 != 0)); i14 = 0) {
          throw new IllegalStateException("Child drawer has absolute gravity " + d(i13) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
        }
        int i16;
        int i15;
        if (i14 != 0)
        {
          int i17 = i10;
          i16 = 1;
          i15 = i17;
        }
        for (;;)
        {
          localView.measure(getChildMeasureSpec(paramInt1, this.g + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
          i9 = i16;
          i10 = i15;
          break;
          i15 = 1;
          i16 = i9;
        }
      }
      throw new IllegalStateException("Child " + localView + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
      label768:
      return;
      label769:
      i5 = i4;
      i6 = i3;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    SavedState localSavedState;
    do
    {
      return;
      localSavedState = (SavedState)paramParcelable;
      super.onRestoreInstanceState(localSavedState.getSuperState());
      if (localSavedState.a != 0)
      {
        View localView = c(localSavedState.a);
        if (localView != null) {
          h(localView);
        }
      }
      if (localSavedState.b != 3) {
        a(localSavedState.b, 3);
      }
      if (localSavedState.c != 3) {
        a(localSavedState.c, 5);
      }
      if (localSavedState.d != 3) {
        a(localSavedState.d, 8388611);
      }
    } while (localSavedState.e == 3);
    a(localSavedState.e, 8388613);
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    e();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    int i1 = getChildCount();
    label114:
    label120:
    label126:
    for (int i2 = 0;; i2++)
    {
      LayoutParams localLayoutParams;
      int i3;
      if (i2 < i1)
      {
        localLayoutParams = (LayoutParams)getChildAt(i2).getLayoutParams();
        if (localLayoutParams.d != 1) {
          break label114;
        }
        i3 = 1;
        if (localLayoutParams.d != 2) {
          break label120;
        }
      }
      for (int i4 = 1;; i4 = 0)
      {
        if ((i3 == 0) && (i4 == 0)) {
          break label126;
        }
        localSavedState.a = localLayoutParams.a;
        localSavedState.b = this.r;
        localSavedState.c = this.s;
        localSavedState.d = this.t;
        localSavedState.e = this.u;
        return localSavedState;
        i3 = 0;
        break;
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.k.b(paramMotionEvent);
    this.l.b(paramMotionEvent);
    boolean bool;
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 2: 
    default: 
      return true;
    case 0: 
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.z = f5;
      this.A = f6;
      this.v = false;
      this.w = false;
      return true;
    case 1: 
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      View localView1 = this.k.d((int)f1, (int)f2);
      if ((localView1 != null) && (f(localView1)))
      {
        float f3 = f1 - this.z;
        float f4 = f2 - this.A;
        int i1 = this.k.d();
        if (f3 * f3 + f4 * f4 < i1 * i1)
        {
          View localView2 = a();
          if (localView2 != null) {
            if (a(localView2) == 2) {
              bool = true;
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      a(bool);
      this.v = false;
      return true;
      bool = false;
      continue;
      a(true);
      this.v = false;
      this.w = false;
      return true;
      bool = true;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.v = paramBoolean;
    if (paramBoolean) {
      a(true);
    }
  }
  
  public void requestLayout()
  {
    if (!this.p) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    this.f = paramFloat;
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (g(localView)) {
        s.a(localView, this.f);
      }
    }
  }
  
  @Deprecated
  public void setDrawerListener(c paramc)
  {
    if (this.x != null) {
      b(this.x);
    }
    if (paramc != null) {
      a(paramc);
    }
    this.x = paramc;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    this.h = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v4.content.a.getDrawable(getContext(), paramInt);; localDrawable = null)
    {
      this.B = localDrawable;
      invalidate();
      return;
    }
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.B = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    this.B = new ColorDrawable(paramInt);
    invalidate();
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public int a = 0;
    float b;
    boolean c;
    int d;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.a);
      this.a = localTypedArray.getInt(0, 0);
      localTypedArray.recycle();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.a = paramLayoutParams.a;
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  protected static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public DrawerLayout.SavedState a(Parcel paramAnonymousParcel)
      {
        return new DrawerLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public DrawerLayout.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new DrawerLayout.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public DrawerLayout.SavedState[] a(int paramAnonymousInt)
      {
        return new DrawerLayout.SavedState[paramAnonymousInt];
      }
    };
    int a = 0;
    int b;
    int c;
    int d;
    int e;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.a = paramParcel.readInt();
      this.b = paramParcel.readInt();
      this.c = paramParcel.readInt();
      this.d = paramParcel.readInt();
      this.e = paramParcel.readInt();
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.a);
      paramParcel.writeInt(this.b);
      paramParcel.writeInt(this.c);
      paramParcel.writeInt(this.d);
      paramParcel.writeInt(this.e);
    }
  }
  
  class a
    extends android.support.v4.view.a
  {
    private final Rect b = new Rect();
    
    a() {}
    
    private void a(b paramb1, b paramb2)
    {
      Rect localRect = this.b;
      paramb2.a(localRect);
      paramb1.b(localRect);
      paramb2.c(localRect);
      paramb1.d(localRect);
      paramb1.e(paramb2.h());
      paramb1.a(paramb2.p());
      paramb1.b(paramb2.q());
      paramb1.d(paramb2.s());
      paramb1.j(paramb2.m());
      paramb1.h(paramb2.k());
      paramb1.c(paramb2.f());
      paramb1.d(paramb2.g());
      paramb1.f(paramb2.i());
      paramb1.g(paramb2.j());
      paramb1.i(paramb2.l());
      paramb1.a(paramb2.b());
    }
    
    private void a(b paramb, ViewGroup paramViewGroup)
    {
      int i = paramViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = paramViewGroup.getChildAt(j);
        if (DrawerLayout.l(localView)) {
          paramb.b(localView);
        }
      }
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        List localList = paramAccessibilityEvent.getText();
        View localView = DrawerLayout.this.c();
        if (localView != null)
        {
          int i = DrawerLayout.this.e(localView);
          CharSequence localCharSequence = DrawerLayout.this.b(i);
          if (localCharSequence != null) {
            localList.add(localCharSequence);
          }
        }
        return true;
      }
      return super.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
    {
      if (DrawerLayout.b) {
        super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      }
      for (;;)
      {
        paramb.b(DrawerLayout.class.getName());
        paramb.c(false);
        paramb.d(false);
        paramb.a(b.a.a);
        paramb.a(b.a.b);
        return;
        b localb = b.a(paramb);
        super.onInitializeAccessibilityNodeInfo(paramView, localb);
        paramb.a(paramView);
        ViewParent localViewParent = s.f(paramView);
        if ((localViewParent instanceof View)) {
          paramb.c((View)localViewParent);
        }
        a(paramb, localb);
        localb.t();
        a(paramb, (ViewGroup)paramView);
      }
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if ((DrawerLayout.b) || (DrawerLayout.l(paramView))) {
        return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
  }
  
  static final class b
    extends android.support.v4.view.a
  {
    public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      if (!DrawerLayout.l(paramView)) {
        paramb.c(null);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void onDrawerClosed(View paramView);
    
    public abstract void onDrawerOpened(View paramView);
    
    public abstract void onDrawerSlide(View paramView, float paramFloat);
    
    public abstract void onDrawerStateChanged(int paramInt);
  }
  
  private class d
    extends r.a
  {
    private final int b;
    private r c;
    private final Runnable d = new Runnable()
    {
      public void run()
      {
        DrawerLayout.d.this.b();
      }
    };
    
    d(int paramInt)
    {
      this.b = paramInt;
    }
    
    private void c()
    {
      int i = 3;
      if (this.b == i) {
        i = 5;
      }
      View localView = DrawerLayout.this.c(i);
      if (localView != null) {
        DrawerLayout.this.i(localView);
      }
    }
    
    public int a(View paramView, int paramInt1, int paramInt2)
    {
      return paramView.getTop();
    }
    
    public void a()
    {
      DrawerLayout.this.removeCallbacks(this.d);
    }
    
    public void a(int paramInt)
    {
      DrawerLayout.this.a(this.b, paramInt, this.c.c());
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      DrawerLayout.this.postDelayed(this.d, 160L);
    }
    
    public void a(r paramr)
    {
      this.c = paramr;
    }
    
    public void a(View paramView, float paramFloat1, float paramFloat2)
    {
      float f = DrawerLayout.this.d(paramView);
      int i = paramView.getWidth();
      int j;
      if (DrawerLayout.this.a(paramView, 3)) {
        if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (f > 0.5F))) {
          j = 0;
        }
      }
      for (;;)
      {
        this.c.a(j, paramView.getTop());
        DrawerLayout.this.invalidate();
        return;
        j = -i;
        continue;
        j = DrawerLayout.this.getWidth();
        if ((paramFloat1 < 0.0F) || ((paramFloat1 == 0.0F) && (f > 0.5F))) {
          j -= i;
        }
      }
    }
    
    public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int i = paramView.getWidth();
      float f;
      if (DrawerLayout.this.a(paramView, 3))
      {
        f = (i + paramInt1) / i;
        DrawerLayout.this.b(paramView, f);
        if (f != 0.0F) {
          break label82;
        }
      }
      label82:
      for (int j = 4;; j = 0)
      {
        paramView.setVisibility(j);
        DrawerLayout.this.invalidate();
        return;
        f = (DrawerLayout.this.getWidth() - paramInt1) / i;
        break;
      }
    }
    
    public boolean a(View paramView, int paramInt)
    {
      return (DrawerLayout.this.g(paramView)) && (DrawerLayout.this.a(paramView, this.b)) && (DrawerLayout.this.a(paramView) == 0);
    }
    
    public int b(View paramView)
    {
      if (DrawerLayout.this.g(paramView)) {
        return paramView.getWidth();
      }
      return 0;
    }
    
    public int b(View paramView, int paramInt1, int paramInt2)
    {
      if (DrawerLayout.this.a(paramView, 3)) {
        return Math.max(-paramView.getWidth(), Math.min(paramInt1, 0));
      }
      int i = DrawerLayout.this.getWidth();
      return Math.max(i - paramView.getWidth(), Math.min(paramInt1, i));
    }
    
    void b()
    {
      int i = this.c.b();
      int j;
      int i1;
      Object localObject;
      if (this.b == 3)
      {
        j = 1;
        if (j == 0) {
          break label164;
        }
        View localView2 = DrawerLayout.this.c(3);
        int n = 0;
        if (localView2 != null) {
          n = -localView2.getWidth();
        }
        i1 = n + i;
        localObject = localView2;
      }
      label164:
      int k;
      for (int m = i1;; m = k)
      {
        if ((localObject != null) && (((j != 0) && (((View)localObject).getLeft() < m)) || ((j == 0) && (((View)localObject).getLeft() > m) && (DrawerLayout.this.a((View)localObject) == 0))))
        {
          DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)((View)localObject).getLayoutParams();
          this.c.a((View)localObject, m, ((View)localObject).getTop());
          localLayoutParams.c = true;
          DrawerLayout.this.invalidate();
          c();
          DrawerLayout.this.d();
        }
        return;
        j = 0;
        break;
        View localView1 = DrawerLayout.this.c(5);
        k = DrawerLayout.this.getWidth() - i;
        localObject = localView1;
      }
    }
    
    public void b(int paramInt1, int paramInt2)
    {
      if ((paramInt1 & 0x1) == 1) {}
      for (View localView = DrawerLayout.this.c(3);; localView = DrawerLayout.this.c(5))
      {
        if ((localView != null) && (DrawerLayout.this.a(localView) == 0)) {
          this.c.a(localView, paramInt2);
        }
        return;
      }
    }
    
    public void b(View paramView, int paramInt)
    {
      ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).c = false;
      c();
    }
    
    public boolean b(int paramInt)
    {
      return false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.DrawerLayout
 * JD-Core Version:    0.7.0.1
 */