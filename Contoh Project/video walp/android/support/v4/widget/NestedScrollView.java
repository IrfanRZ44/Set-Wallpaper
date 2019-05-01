package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.d;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v4.view.l;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView
  extends FrameLayout
  implements j, l
{
  private static final a w = new a();
  private static final int[] x = { 16843130 };
  private float A;
  private b B;
  private long a;
  private final Rect b = new Rect();
  private OverScroller c;
  private EdgeEffect d;
  private EdgeEffect e;
  private int f;
  private boolean g = true;
  private boolean h = false;
  private View i = null;
  private boolean j = false;
  private VelocityTracker k;
  private boolean l;
  private boolean m = true;
  private int n;
  private int o;
  private int p;
  private int q = -1;
  private final int[] r = new int[2];
  private final int[] s = new int[2];
  private int t;
  private int u;
  private SavedState v;
  private final n y;
  private final k z;
  
  public NestedScrollView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, x, paramInt, 0);
    setFillViewport(localTypedArray.getBoolean(0, false));
    localTypedArray.recycle();
    this.y = new n(this);
    this.z = new k(this);
    setNestedScrollingEnabled(true);
    s.a(this, w);
  }
  
  private View a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = getFocusables(2);
    Object localObject1 = null;
    int i1 = 0;
    int i2 = localArrayList.size();
    int i3 = 0;
    View localView;
    int i4;
    int i5;
    int i7;
    label87:
    Object localObject2;
    int i6;
    if (i3 < i2)
    {
      localView = (View)localArrayList.get(i3);
      i4 = localView.getTop();
      i5 = localView.getBottom();
      if ((paramInt1 >= i5) || (i4 >= paramInt2)) {
        break label221;
      }
      if ((paramInt1 < i4) && (i5 < paramInt2))
      {
        i7 = 1;
        if (localObject1 != null) {
          break label124;
        }
        int i9 = i7;
        localObject2 = localView;
        i6 = i9;
      }
    }
    for (;;)
    {
      i3++;
      localObject1 = localObject2;
      i1 = i6;
      break;
      i7 = 0;
      break label87;
      label124:
      if (((paramBoolean) && (i4 < localObject1.getTop())) || ((!paramBoolean) && (i5 > localObject1.getBottom()))) {}
      for (int i8 = 1;; i8 = 0)
      {
        if (i1 == 0) {
          break label187;
        }
        if ((i7 == 0) || (i8 == 0)) {
          break label221;
        }
        localObject2 = localView;
        i6 = i1;
        break;
      }
      label187:
      if (i7 != 0)
      {
        localObject2 = localView;
        i6 = 1;
      }
      else if (i8 != 0)
      {
        localObject2 = localView;
        i6 = i1;
        continue;
        return localObject1;
      }
      else
      {
        label221:
        i6 = i1;
        localObject2 = localObject1;
      }
    }
  }
  
  private void a()
  {
    this.c = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.n = localViewConfiguration.getScaledTouchSlop();
    this.o = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.p = localViewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i1) == this.q) {
      if (i1 != 0) {
        break label57;
      }
    }
    label57:
    for (int i2 = 1;; i2 = 0)
    {
      this.f = ((int)paramMotionEvent.getY(i2));
      this.q = paramMotionEvent.getPointerId(i2);
      if (this.k != null) {
        this.k.clear();
      }
      return;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = getHeight();
    int i2 = getScrollY();
    int i3 = i2 + i1;
    if (paramInt1 == 33) {}
    boolean bool2;
    for (boolean bool1 = true;; bool1 = false)
    {
      Object localObject = a(bool1, paramInt2, paramInt3);
      if (localObject == null) {
        localObject = this;
      }
      if (paramInt2 < i2) {
        break;
      }
      bool2 = false;
      if (paramInt3 > i3) {
        break;
      }
      if (localObject != findFocus()) {
        ((View)localObject).requestFocus(paramInt1);
      }
      return bool2;
    }
    if (bool1) {}
    for (int i4 = paramInt2 - i2;; i4 = paramInt3 - i3)
    {
      g(i4);
      bool2 = true;
      break;
    }
  }
  
  private boolean a(Rect paramRect, boolean paramBoolean)
  {
    int i1 = a(paramRect);
    if (i1 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        if (!paramBoolean) {
          break;
        }
        scrollBy(0, i1);
      }
      return bool;
    }
    b(0, i1);
    return bool;
  }
  
  private boolean a(View paramView)
  {
    boolean bool1 = a(paramView, 0, getHeight());
    boolean bool2 = false;
    if (!bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    return (paramInt1 + this.b.bottom >= getScrollY()) && (this.b.top - paramInt1 <= paramInt2 + getScrollY());
  }
  
  private static boolean a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2) {
      return true;
    }
    ViewParent localViewParent = paramView1.getParent();
    if (((localViewParent instanceof ViewGroup)) && (a((View)localViewParent, paramView2))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0)) {
      paramInt1 = 0;
    }
    while (paramInt2 + paramInt1 <= paramInt3) {
      return paramInt1;
    }
    return paramInt3 - paramInt2;
  }
  
  private void b(View paramView)
  {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    int i1 = a(this.b);
    if (i1 != 0) {
      scrollBy(0, i1);
    }
  }
  
  private boolean b()
  {
    View localView = getChildAt(0);
    boolean bool = false;
    if (localView != null)
    {
      int i1 = localView.getHeight();
      int i2 = getHeight();
      int i3 = i1 + getPaddingTop() + getPaddingBottom();
      bool = false;
      if (i2 < i3) {
        bool = true;
      }
    }
    return bool;
  }
  
  private void c()
  {
    if (this.k == null)
    {
      this.k = VelocityTracker.obtain();
      return;
    }
    this.k.clear();
  }
  
  private void d()
  {
    if (this.k == null) {
      this.k = VelocityTracker.obtain();
    }
  }
  
  private boolean d(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    boolean bool = false;
    if (i1 > 0)
    {
      int i2 = getScrollY();
      View localView = getChildAt(0);
      int i3 = localView.getTop() - i2;
      bool = false;
      if (paramInt2 >= i3)
      {
        int i4 = localView.getBottom() - i2;
        bool = false;
        if (paramInt2 < i4)
        {
          int i5 = localView.getLeft();
          bool = false;
          if (paramInt1 >= i5)
          {
            int i6 = localView.getRight();
            bool = false;
            if (paramInt1 < i6) {
              bool = true;
            }
          }
        }
      }
    }
    return bool;
  }
  
  private void e()
  {
    if (this.k != null)
    {
      this.k.recycle();
      this.k = null;
    }
  }
  
  private void f()
  {
    this.j = false;
    e();
    a(0);
    if (this.d != null)
    {
      this.d.onRelease();
      this.e.onRelease();
    }
  }
  
  private void g()
  {
    if (getOverScrollMode() != 2)
    {
      if (this.d == null)
      {
        Context localContext = getContext();
        this.d = new EdgeEffect(localContext);
        this.e = new EdgeEffect(localContext);
      }
      return;
    }
    this.d = null;
    this.e = null;
  }
  
  private void g(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.m) {
        b(0, paramInt);
      }
    }
    else {
      return;
    }
    scrollBy(0, paramInt);
  }
  
  private float getVerticalScrollFactorCompat()
  {
    if (this.A == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (!localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
      this.A = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
    }
    return this.A;
  }
  
  private void h(int paramInt)
  {
    int i1 = getScrollY();
    if (((i1 > 0) || (paramInt > 0)) && ((i1 < getScrollRange()) || (paramInt < 0))) {}
    for (boolean bool = true;; bool = false)
    {
      if (!dispatchNestedPreFling(0.0F, paramInt))
      {
        dispatchNestedFling(0.0F, paramInt, bool);
        f(paramInt);
      }
      return;
    }
  }
  
  protected int a(Rect paramRect)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int i1 = getHeight();
    int i2 = getScrollY();
    int i3 = i2 + i1;
    int i4 = getVerticalFadingEdgeLength();
    if (paramRect.top > 0) {
      i2 += i4;
    }
    if (paramRect.bottom < getChildAt(0).getHeight()) {
      i3 -= i4;
    }
    int i7;
    int i5;
    if ((paramRect.bottom > i3) && (paramRect.top > i2)) {
      if (paramRect.height() > i1)
      {
        i7 = 0 + (paramRect.top - i2);
        i5 = Math.min(i7, getChildAt(0).getBottom() - i3);
      }
    }
    for (;;)
    {
      return i5;
      i7 = 0 + (paramRect.bottom - i3);
      break;
      if ((paramRect.top < i2) && (paramRect.bottom < i3))
      {
        if (paramRect.height() > i1) {}
        for (int i6 = 0 - (i3 - paramRect.bottom);; i6 = 0 - (i2 - paramRect.top))
        {
          i5 = Math.max(i6, -getScrollY());
          break;
        }
      }
      i5 = 0;
    }
  }
  
  public void a(int paramInt)
  {
    this.z.c(paramInt);
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return this.z.a(paramInt1, paramInt2);
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    int i1 = getOverScrollMode();
    int i2;
    int i3;
    label34:
    int i4;
    label53:
    int i5;
    label72:
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    boolean bool1;
    if (computeHorizontalScrollRange() > computeHorizontalScrollExtent())
    {
      i2 = 1;
      if (computeVerticalScrollRange() <= computeVerticalScrollExtent()) {
        break label205;
      }
      i3 = 1;
      if ((i1 != 0) && ((i1 != 1) || (i2 == 0))) {
        break label211;
      }
      i4 = 1;
      if ((i1 != 0) && ((i1 != 1) || (i3 == 0))) {
        break label217;
      }
      i5 = 1;
      i6 = paramInt3 + paramInt1;
      if (i4 == 0) {
        paramInt7 = 0;
      }
      i7 = paramInt4 + paramInt2;
      if (i5 == 0) {
        paramInt8 = 0;
      }
      i8 = -paramInt7;
      i9 = paramInt7 + paramInt5;
      i10 = -paramInt8;
      i11 = paramInt8 + paramInt6;
      if (i6 <= i9) {
        break label223;
      }
      bool1 = true;
    }
    for (;;)
    {
      label133:
      boolean bool2;
      if (i7 > i11) {
        bool2 = true;
      }
      for (;;)
      {
        if ((bool2) && (!b(1))) {
          this.c.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, bool1, bool2);
        if ((bool1) || (bool2))
        {
          return true;
          i2 = 0;
          break;
          label205:
          i3 = 0;
          break label34;
          label211:
          i4 = 0;
          break label53;
          label217:
          i5 = 0;
          break label72;
          label223:
          if (i6 >= i8) {
            break label269;
          }
          bool1 = true;
          i9 = i8;
          break label133;
          if (i7 >= i10) {
            break label259;
          }
          bool2 = true;
          i11 = i10;
          continue;
        }
        return false;
        label259:
        i11 = i7;
        bool2 = false;
      }
      label269:
      i9 = i6;
      bool1 = false;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return this.z.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return this.z.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    int i1 = 33;
    this.b.setEmpty();
    boolean bool1;
    boolean bool3;
    if (!b())
    {
      boolean bool2 = isFocused();
      bool1 = false;
      if (bool2)
      {
        int i3 = paramKeyEvent.getKeyCode();
        bool1 = false;
        if (i3 != 4)
        {
          View localView1 = findFocus();
          if (localView1 == this) {
            localView1 = null;
          }
          View localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, 130);
          if ((localView2 == null) || (localView2 == this) || (!localView2.requestFocus(130))) {
            break label107;
          }
          bool3 = true;
          bool1 = bool3;
        }
      }
    }
    label107:
    int i2;
    do
    {
      return bool1;
      bool3 = false;
      break;
      i2 = paramKeyEvent.getAction();
      bool1 = false;
    } while (i2 != 0);
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    case 19: 
      if (!paramKeyEvent.isAltPressed()) {
        return e(i1);
      }
      return d(i1);
    case 20: 
      if (!paramKeyEvent.isAltPressed()) {
        return e(130);
      }
      return d(130);
    }
    if (paramKeyEvent.isShiftPressed()) {}
    for (;;)
    {
      c(i1);
      return false;
      i1 = 130;
    }
  }
  
  public void addView(View paramView)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramLayoutParams);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250L)
    {
      int i1 = getHeight() - getPaddingBottom() - getPaddingTop();
      int i2 = Math.max(0, getChildAt(0).getHeight() - i1);
      int i3 = getScrollY();
      int i4 = Math.max(0, Math.min(i3 + paramInt2, i2)) - i3;
      this.c.startScroll(getScrollX(), i3, 0, i4);
      s.c(this);
    }
    for (;;)
    {
      this.a = AnimationUtils.currentAnimationTimeMillis();
      return;
      if (!this.c.isFinished()) {
        this.c.abortAnimation();
      }
      scrollBy(paramInt1, paramInt2);
    }
  }
  
  public boolean b(int paramInt)
  {
    return this.z.a(paramInt);
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    b(paramInt1 - getScrollX(), paramInt2 - getScrollY());
  }
  
  public boolean c(int paramInt)
  {
    int i1;
    int i2;
    if (paramInt == 130)
    {
      i1 = 1;
      i2 = getHeight();
      if (i1 == 0) {
        break label124;
      }
      this.b.top = (i2 + getScrollY());
      int i3 = getChildCount();
      if (i3 > 0)
      {
        View localView = getChildAt(i3 - 1);
        if (i2 + this.b.top > localView.getBottom()) {
          this.b.top = (localView.getBottom() - i2);
        }
      }
    }
    for (;;)
    {
      this.b.bottom = (i2 + this.b.top);
      return a(paramInt, this.b.top, this.b.bottom);
      i1 = 0;
      break;
      label124:
      this.b.top = (getScrollY() - i2);
      if (this.b.top < 0) {
        this.b.top = 0;
      }
    }
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    if (this.c.computeScrollOffset())
    {
      this.c.getCurrX();
      int i1 = this.c.getCurrY();
      int i2 = i1 - this.u;
      if (a(0, i2, this.s, null, 1)) {
        i2 -= this.s[1];
      }
      int i3;
      int i4;
      int i7;
      if (i2 != 0)
      {
        i3 = getScrollRange();
        i4 = getScrollY();
        a(0, i2, getScrollX(), i4, 0, i3, 0, 0, false);
        int i5 = getScrollY() - i4;
        if (!a(0, i5, 0, i2 - i5, null, 1))
        {
          int i6 = getOverScrollMode();
          if ((i6 != 0) && ((i6 != 1) || (i3 <= 0))) {
            break label186;
          }
          i7 = 1;
          if (i7 != 0)
          {
            g();
            if ((i1 > 0) || (i4 <= 0)) {
              break label192;
            }
            this.d.onAbsorb((int)this.c.getCurrVelocity());
          }
        }
      }
      for (;;)
      {
        this.u = i1;
        s.c(this);
        return;
        label186:
        i7 = 0;
        break;
        label192:
        if ((i1 >= i3) && (i4 < i3)) {
          this.e.onAbsorb((int)this.c.getCurrVelocity());
        }
      }
    }
    if (b(1)) {
      a(1);
    }
    this.u = 0;
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange()
  {
    int i1 = getChildCount();
    int i2 = getHeight() - getPaddingBottom() - getPaddingTop();
    int i3;
    if (i1 == 0) {
      i3 = i2;
    }
    int i4;
    int i5;
    do
    {
      return i3;
      i3 = getChildAt(0).getBottom();
      i4 = getScrollY();
      i5 = Math.max(0, i3 - i2);
      if (i4 < 0) {
        return i3 - i4;
      }
    } while (i4 <= i5);
    return i3 + (i4 - i5);
  }
  
  public boolean d(int paramInt)
  {
    if (paramInt == 130) {}
    for (int i1 = 1;; i1 = 0)
    {
      int i2 = getHeight();
      this.b.top = 0;
      this.b.bottom = i2;
      if (i1 != 0)
      {
        int i3 = getChildCount();
        if (i3 > 0)
        {
          View localView = getChildAt(i3 - 1);
          this.b.bottom = (localView.getBottom() + getPaddingBottom());
          this.b.top = (this.b.bottom - i2);
        }
      }
      return a(paramInt, this.b.top, this.b.bottom);
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (a(paramKeyEvent));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.z.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.z.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.z.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.z.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    if (this.d != null)
    {
      i1 = getScrollY();
      if (!this.d.isFinished())
      {
        i7 = paramCanvas.save();
        i8 = getWidth();
        i9 = getHeight();
        i10 = Math.min(0, i1);
        if ((Build.VERSION.SDK_INT >= 21) && (!getClipToPadding())) {
          break label347;
        }
        i11 = i8 - (getPaddingLeft() + getPaddingRight());
      }
    }
    for (int i12 = 0 + getPaddingLeft();; i12 = 0)
    {
      if ((Build.VERSION.SDK_INT >= 21) && (getClipToPadding()))
      {
        i9 -= getPaddingTop() + getPaddingBottom();
        i10 += getPaddingTop();
      }
      paramCanvas.translate(i12, i10);
      this.d.setSize(i11, i9);
      if (this.d.draw(paramCanvas)) {
        s.c(this);
      }
      paramCanvas.restoreToCount(i7);
      if (!this.e.isFinished())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight();
        int i5 = i4 + Math.max(getScrollRange(), i1);
        int i6;
        if (Build.VERSION.SDK_INT >= 21)
        {
          boolean bool = getClipToPadding();
          i6 = 0;
          if (!bool) {}
        }
        else
        {
          i3 -= getPaddingLeft() + getPaddingRight();
          i6 = 0 + getPaddingLeft();
        }
        if ((Build.VERSION.SDK_INT >= 21) && (getClipToPadding()))
        {
          i4 -= getPaddingTop() + getPaddingBottom();
          i5 -= getPaddingBottom();
        }
        paramCanvas.translate(i6 - i3, i5);
        paramCanvas.rotate(180.0F, i3, 0.0F);
        this.e.setSize(i3, i4);
        if (this.e.draw(paramCanvas)) {
          s.c(this);
        }
        paramCanvas.restoreToCount(i2);
      }
      return;
      label347:
      i11 = i8;
    }
  }
  
  public boolean e(int paramInt)
  {
    View localView1 = findFocus();
    if (localView1 == this) {
      localView1 = null;
    }
    View localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, paramInt);
    int i1 = getMaxScrollAmount();
    if ((localView2 != null) && (a(localView2, i1, getHeight())))
    {
      localView2.getDrawingRect(this.b);
      offsetDescendantRectToMyCoords(localView2, this.b);
      g(a(this.b));
      localView2.requestFocus(paramInt);
      if ((localView1 != null) && (localView1.isFocused()) && (a(localView1)))
      {
        int i4 = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(i4);
      }
      return true;
    }
    if ((paramInt == 33) && (getScrollY() < i1)) {
      i1 = getScrollY();
    }
    while (i1 == 0)
    {
      return false;
      if ((paramInt == 130) && (getChildCount() > 0))
      {
        int i2 = getChildAt(0).getBottom();
        int i3 = getScrollY() + getHeight() - getPaddingBottom();
        if (i2 - i3 < i1) {
          i1 = i2 - i3;
        }
      }
    }
    if (paramInt == 130) {}
    for (;;)
    {
      g(i1);
      break;
      i1 = -i1;
    }
  }
  
  public void f(int paramInt)
  {
    if (getChildCount() > 0)
    {
      a(2, 1);
      this.c.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, -2147483648, 2147483647, 0, 0);
      this.u = getScrollY();
      s.c(this);
    }
  }
  
  protected float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getHeight() - getPaddingBottom();
    int i3 = getChildAt(0).getBottom() - getScrollY() - i2;
    if (i3 < i1) {
      return i3 / i1;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(0.5F * getHeight());
  }
  
  public int getNestedScrollAxes()
  {
    return this.y.a();
  }
  
  int getScrollRange()
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i1 > 0) {
      i2 = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
    }
    return i2;
  }
  
  protected float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getScrollY();
    if (i2 < i1) {
      return i2 / i1;
    }
    return 1.0F;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.z.b();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.z.a();
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, paramInt2 + (getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin), localMarginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin, 0));
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.h = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((0x2 & paramMotionEvent.getSource()) != 0) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return false;
      if (!this.j)
      {
        float f1 = paramMotionEvent.getAxisValue(9);
        if (f1 != 0.0F)
        {
          int i1 = (int)(f1 * getVerticalScrollFactorCompat());
          int i2 = getScrollRange();
          int i3 = getScrollY();
          int i4 = i3 - i1;
          if (i4 < 0) {
            i2 = 0;
          }
          while (i2 != i3)
          {
            super.scrollTo(getScrollX(), i2);
            return true;
            if (i4 <= i2) {
              i2 = i4;
            }
          }
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 2) && (this.j)) {
      return bool;
    }
    switch (i1 & 0xFF)
    {
    }
    for (;;)
    {
      return this.j;
      int i3 = this.q;
      if (i3 != -1)
      {
        int i4 = paramMotionEvent.findPointerIndex(i3);
        if (i4 == -1)
        {
          Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
        }
        else
        {
          int i5 = (int)paramMotionEvent.getY(i4);
          if ((Math.abs(i5 - this.f) > this.n) && ((0x2 & getNestedScrollAxes()) == 0))
          {
            this.j = bool;
            this.f = i5;
            d();
            this.k.addMovement(paramMotionEvent);
            this.t = 0;
            ViewParent localViewParent = getParent();
            if (localViewParent != null)
            {
              localViewParent.requestDisallowInterceptTouchEvent(bool);
              continue;
              int i2 = (int)paramMotionEvent.getY();
              if (!d((int)paramMotionEvent.getX(), i2))
              {
                this.j = false;
                e();
              }
              else
              {
                this.f = i2;
                this.q = paramMotionEvent.getPointerId(0);
                c();
                this.k.addMovement(paramMotionEvent);
                this.c.computeScrollOffset();
                if (!this.c.isFinished()) {}
                for (;;)
                {
                  this.j = bool;
                  a(2, 0);
                  break;
                  bool = false;
                }
                this.j = false;
                this.q = -1;
                e();
                if (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                  s.c(this);
                }
                a(0);
                continue;
                a(paramMotionEvent);
              }
            }
          }
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = false;
    if ((this.i != null) && (a(this.i, this))) {
      b(this.i);
    }
    this.i = null;
    int i1;
    if (!this.h)
    {
      if (this.v != null)
      {
        scrollTo(getScrollX(), this.v.a);
        this.v = null;
      }
      if (getChildCount() <= 0) {
        break label158;
      }
      i1 = getChildAt(0).getMeasuredHeight();
      int i2 = Math.max(0, i1 - (paramInt4 - paramInt2 - getPaddingBottom() - getPaddingTop()));
      if (getScrollY() <= i2) {
        break label164;
      }
      scrollTo(getScrollX(), i2);
    }
    for (;;)
    {
      scrollTo(getScrollX(), getScrollY());
      this.h = true;
      return;
      label158:
      i1 = 0;
      break;
      label164:
      if (getScrollY() < 0) {
        scrollTo(getScrollX(), 0);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.l) {}
    View localView;
    int i1;
    do
    {
      do
      {
        return;
      } while ((View.MeasureSpec.getMode(paramInt2) == 0) || (getChildCount() <= 0));
      localView = getChildAt(0);
      i1 = getMeasuredHeight();
    } while (localView.getMeasuredHeight() >= i1);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    localView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(i1 - getPaddingTop() - getPaddingBottom(), 1073741824));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      h((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getScrollY();
    scrollBy(0, paramInt4);
    int i2 = getScrollY() - i1;
    dispatchNestedScroll(0, i2, 0, paramInt4 - i2, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.y.a(paramView1, paramView2, paramInt);
    startNestedScroll(2);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    View localView;
    if (paramInt == 2)
    {
      paramInt = 130;
      if (paramRect != null) {
        break label40;
      }
      localView = FocusFinder.getInstance().findNextFocus(this, null, paramInt);
      label23:
      if (localView != null) {
        break label53;
      }
    }
    label40:
    label53:
    while (a(localView))
    {
      return false;
      if (paramInt != 1) {
        break;
      }
      paramInt = 33;
      break;
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, paramInt);
      break label23;
    }
    return localView.requestFocus(paramInt, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.v = localSavedState;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.a = getScrollY();
    return localSavedState;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.B != null) {
      this.B.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView == null) || (this == localView)) {}
    while (!a(localView, 0, paramInt4)) {
      return;
    }
    localView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(localView, this.b);
    g(a(this.b));
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.y.a(paramView);
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    d();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0) {
      this.t = 0;
    }
    localMotionEvent.offsetLocation(0.0F, this.t);
    switch (i1)
    {
    }
    for (;;)
    {
      if (this.k != null) {
        this.k.addMovement(localMotionEvent);
      }
      localMotionEvent.recycle();
      return true;
      if (getChildCount() == 0) {
        return false;
      }
      if (!this.c.isFinished()) {}
      for (boolean bool = true;; bool = false)
      {
        this.j = bool;
        if (bool)
        {
          ViewParent localViewParent2 = getParent();
          if (localViewParent2 != null) {
            localViewParent2.requestDisallowInterceptTouchEvent(true);
          }
        }
        if (!this.c.isFinished()) {
          this.c.abortAnimation();
        }
        this.f = ((int)paramMotionEvent.getY());
        this.q = paramMotionEvent.getPointerId(0);
        a(2, 0);
        break;
      }
      int i4 = paramMotionEvent.findPointerIndex(this.q);
      if (i4 == -1)
      {
        Log.e("NestedScrollView", "Invalid pointerId=" + this.q + " in onTouchEvent");
      }
      else
      {
        int i5 = (int)paramMotionEvent.getY(i4);
        int i6 = this.f - i5;
        if (a(0, i6, this.s, this.r, 0))
        {
          i6 -= this.s[1];
          localMotionEvent.offsetLocation(0.0F, this.r[1]);
          this.t += this.r[1];
        }
        label387:
        int i7;
        int i8;
        if ((!this.j) && (Math.abs(i6) > this.n))
        {
          ViewParent localViewParent1 = getParent();
          if (localViewParent1 != null) {
            localViewParent1.requestDisallowInterceptTouchEvent(true);
          }
          this.j = true;
          if (i6 > 0) {
            i6 -= this.n;
          }
        }
        else
        {
          if (!this.j) {
            continue;
          }
          this.f = (i5 - this.r[1]);
          i7 = getScrollY();
          i8 = getScrollRange();
          int i9 = getOverScrollMode();
          if ((i9 != 0) && ((i9 != 1) || (i8 <= 0))) {
            break label567;
          }
        }
        label567:
        for (int i10 = 1;; i10 = 0)
        {
          if ((a(0, i6, 0, getScrollY(), 0, i8, 0, 0, true)) && (!b(0))) {
            this.k.clear();
          }
          int i11 = getScrollY() - i7;
          if (!a(0, i11, 0, i6 - i11, this.r, 0)) {
            break label573;
          }
          this.f -= this.r[1];
          localMotionEvent.offsetLocation(0.0F, this.r[1]);
          this.t += this.r[1];
          break;
          i6 += this.n;
          break label387;
        }
        label573:
        if (i10 != 0)
        {
          g();
          int i12 = i7 + i6;
          if (i12 < 0)
          {
            i.a(this.d, i6 / getHeight(), paramMotionEvent.getX(i4) / getWidth());
            if (!this.e.isFinished()) {
              this.e.onRelease();
            }
          }
          while ((this.d != null) && ((!this.d.isFinished()) || (!this.e.isFinished())))
          {
            s.c(this);
            break;
            if (i12 > i8)
            {
              i.a(this.e, i6 / getHeight(), 1.0F - paramMotionEvent.getX(i4) / getWidth());
              if (!this.d.isFinished()) {
                this.d.onRelease();
              }
            }
          }
          VelocityTracker localVelocityTracker = this.k;
          localVelocityTracker.computeCurrentVelocity(1000, this.p);
          int i3 = (int)localVelocityTracker.getYVelocity(this.q);
          if (Math.abs(i3) > this.o) {
            h(-i3);
          }
          for (;;)
          {
            this.q = -1;
            f();
            break;
            if (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
              s.c(this);
            }
          }
          if ((this.j) && (getChildCount() > 0) && (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))) {
            s.c(this);
          }
          this.q = -1;
          f();
          continue;
          int i2 = paramMotionEvent.getActionIndex();
          this.f = ((int)paramMotionEvent.getY(i2));
          this.q = paramMotionEvent.getPointerId(i2);
          continue;
          a(paramMotionEvent);
          this.f = ((int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.q)));
        }
      }
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!this.g) {
      b(paramView2);
    }
    for (;;)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      this.i = paramView2;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return a(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      e();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    this.g = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      int i1 = b(paramInt1, getWidth() - getPaddingRight() - getPaddingLeft(), localView.getWidth());
      int i2 = b(paramInt2, getHeight() - getPaddingBottom() - getPaddingTop(), localView.getHeight());
      if ((i1 != getScrollX()) || (i2 != getScrollY())) {
        super.scrollTo(i1, i2);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != this.l)
    {
      this.l = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.z.a(paramBoolean);
  }
  
  public void setOnScrollChangeListener(b paramb)
  {
    this.B = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.z.b(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.z.c();
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public NestedScrollView.SavedState a(Parcel paramAnonymousParcel)
      {
        return new NestedScrollView.SavedState(paramAnonymousParcel);
      }
      
      public NestedScrollView.SavedState[] a(int paramAnonymousInt)
      {
        return new NestedScrollView.SavedState[paramAnonymousInt];
      }
    };
    public int a;
    
    SavedState(Parcel paramParcel)
    {
      super();
      this.a = paramParcel.readInt();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.a);
    }
  }
  
  static class a
    extends a
  {
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      NestedScrollView localNestedScrollView = (NestedScrollView)paramView;
      paramAccessibilityEvent.setClassName(ScrollView.class.getName());
      if (localNestedScrollView.getScrollRange() > 0) {}
      for (boolean bool = true;; bool = false)
      {
        paramAccessibilityEvent.setScrollable(bool);
        paramAccessibilityEvent.setScrollX(localNestedScrollView.getScrollX());
        paramAccessibilityEvent.setScrollY(localNestedScrollView.getScrollY());
        d.a(paramAccessibilityEvent, localNestedScrollView.getScrollX());
        d.b(paramAccessibilityEvent, localNestedScrollView.getScrollRange());
        return;
      }
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      NestedScrollView localNestedScrollView = (NestedScrollView)paramView;
      paramb.b(ScrollView.class.getName());
      if (localNestedScrollView.isEnabled())
      {
        int i = localNestedScrollView.getScrollRange();
        if (i > 0)
        {
          paramb.k(true);
          if (localNestedScrollView.getScrollY() > 0) {
            paramb.a(8192);
          }
          if (localNestedScrollView.getScrollY() < i) {
            paramb.a(4096);
          }
        }
      }
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      NestedScrollView localNestedScrollView = (NestedScrollView)paramView;
      if (!localNestedScrollView.isEnabled()) {
        return false;
      }
      switch (paramInt)
      {
      default: 
        return false;
      case 4096: 
        int k = Math.min(localNestedScrollView.getHeight() - localNestedScrollView.getPaddingBottom() - localNestedScrollView.getPaddingTop() + localNestedScrollView.getScrollY(), localNestedScrollView.getScrollRange());
        if (k != localNestedScrollView.getScrollY())
        {
          localNestedScrollView.c(0, k);
          return true;
        }
        return false;
      }
      int i = localNestedScrollView.getHeight() - localNestedScrollView.getPaddingBottom() - localNestedScrollView.getPaddingTop();
      int j = Math.max(localNestedScrollView.getScrollY() - i, 0);
      if (j != localNestedScrollView.getScrollY())
      {
        localNestedScrollView.c(0, j);
        return true;
      }
      return false;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.NestedScrollView
 * JD-Core Version:    0.7.0.1
 */