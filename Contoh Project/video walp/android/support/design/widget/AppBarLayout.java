package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.a.b;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.v4.f.i;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.b(a="Landroid/support/design/widget/AppBarLayout$Behavior;")
public class AppBarLayout
  extends LinearLayout
{
  private int a = -1;
  private int b = -1;
  private int c = -1;
  private boolean d;
  private int e = 0;
  private aa f;
  private List<a> g;
  private boolean h;
  private boolean i;
  private int[] j;
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    m.a(paramContext);
    if (Build.VERSION.SDK_INT >= 21)
    {
      p.a(this);
      p.a(this, paramAttributeSet, 0, a.j.Widget_Design_AppBarLayout);
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.AppBarLayout, 0, a.j.Widget_Design_AppBarLayout);
    s.a(this, localTypedArray.getDrawable(a.k.AppBarLayout_android_background));
    if (localTypedArray.hasValue(a.k.AppBarLayout_expanded)) {
      a(localTypedArray.getBoolean(a.k.AppBarLayout_expanded, false), false, false);
    }
    if ((Build.VERSION.SDK_INT >= 21) && (localTypedArray.hasValue(a.k.AppBarLayout_elevation))) {
      p.a(this, localTypedArray.getDimensionPixelSize(a.k.AppBarLayout_elevation, 0));
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      if (localTypedArray.hasValue(a.k.AppBarLayout_android_keyboardNavigationCluster)) {
        setKeyboardNavigationCluster(localTypedArray.getBoolean(a.k.AppBarLayout_android_keyboardNavigationCluster, false));
      }
      if (localTypedArray.hasValue(a.k.AppBarLayout_android_touchscreenBlocksFocus)) {
        setTouchscreenBlocksFocus(localTypedArray.getBoolean(a.k.AppBarLayout_android_touchscreenBlocksFocus, false));
      }
    }
    localTypedArray.recycle();
    s.a(this, new o()
    {
      public aa a(View paramAnonymousView, aa paramAnonymousaa)
      {
        return AppBarLayout.this.a(paramAnonymousaa);
      }
    });
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int k;
    if (paramBoolean1)
    {
      k = 1;
      if (!paramBoolean2) {
        break label52;
      }
    }
    label52:
    for (int m = 4;; m = 0)
    {
      int n = m | k;
      int i1 = 0;
      if (paramBoolean3) {
        i1 = 8;
      }
      this.e = (i1 | n);
      requestLayout();
      return;
      k = 2;
      break;
    }
  }
  
  private boolean b(boolean paramBoolean)
  {
    if (this.h != paramBoolean)
    {
      this.h = paramBoolean;
      refreshDrawableState();
      return true;
    }
    return false;
  }
  
  private void e()
  {
    int k = getChildCount();
    int m = 0;
    if (m < k) {
      if (!((LayoutParams)getChildAt(m).getLayoutParams()).c()) {}
    }
    for (boolean bool = true;; bool = false)
    {
      b(bool);
      return;
      m++;
      break;
    }
  }
  
  private void f()
  {
    this.a = -1;
    this.b = -1;
    this.c = -1;
  }
  
  protected LayoutParams a()
  {
    return new LayoutParams(-1, -2);
  }
  
  public LayoutParams a(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((Build.VERSION.SDK_INT >= 19) && ((paramLayoutParams instanceof LinearLayout.LayoutParams))) {
      return new LayoutParams((LinearLayout.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  aa a(aa paramaa)
  {
    boolean bool = s.q(this);
    aa localaa = null;
    if (bool) {
      localaa = paramaa;
    }
    if (!i.a(this.f, localaa))
    {
      this.f = localaa;
      f();
    }
    return paramaa;
  }
  
  void a(int paramInt)
  {
    if (this.g != null)
    {
      int k = this.g.size();
      for (int m = 0; m < k; m++)
      {
        a locala = (a)this.g.get(m);
        if (locala != null) {
          locala.a(this, paramInt);
        }
      }
    }
  }
  
  public void a(a parama)
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    if ((parama != null) && (!this.g.contains(parama))) {
      this.g.add(parama);
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramBoolean1, paramBoolean2, true);
  }
  
  boolean a(boolean paramBoolean)
  {
    if (this.i != paramBoolean)
    {
      this.i = paramBoolean;
      refreshDrawableState();
      return true;
    }
    return false;
  }
  
  public void b(a parama)
  {
    if ((this.g != null) && (parama != null)) {
      this.g.remove(parama);
    }
  }
  
  boolean b()
  {
    return this.d;
  }
  
  boolean c()
  {
    return getTotalScrollRange() != 0;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  void d()
  {
    this.e = 0;
  }
  
  int getDownNestedPreScrollRange()
  {
    if (this.b != -1) {
      return this.b;
    }
    int k = -1 + getChildCount();
    int m = 0;
    View localView;
    int i1;
    int i2;
    int i4;
    int i3;
    if (k >= 0)
    {
      localView = getChildAt(k);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      i1 = localView.getMeasuredHeight();
      i2 = localLayoutParams.a;
      if ((i2 & 0x5) == 5)
      {
        i4 = m + (localLayoutParams.topMargin + localLayoutParams.bottomMargin);
        if ((i2 & 0x8) != 0) {
          i3 = i4 + s.j(localView);
        }
      }
    }
    for (;;)
    {
      k--;
      m = i3;
      break;
      if ((i2 & 0x2) != 0)
      {
        i3 = i4 + (i1 - s.j(localView));
      }
      else
      {
        i3 = i4 + (i1 - getTopInset());
        continue;
        if (m > 0)
        {
          int n = Math.max(0, m);
          this.b = n;
          return n;
        }
        i3 = m;
      }
    }
  }
  
  int getDownNestedScrollRange()
  {
    if (this.c != -1) {
      return this.c;
    }
    int k = getChildCount();
    int m = 0;
    int n = 0;
    View localView;
    if (m < k)
    {
      localView = getChildAt(m);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      int i3 = localView.getMeasuredHeight() + (localLayoutParams.topMargin + localLayoutParams.bottomMargin);
      int i4 = localLayoutParams.a;
      if ((i4 & 0x1) != 0)
      {
        n += i3;
        if ((i4 & 0x2) == 0) {}
      }
    }
    for (int i1 = n - (s.j(localView) + getTopInset());; i1 = n)
    {
      int i2 = Math.max(0, i1);
      this.c = i2;
      return i2;
      m++;
      break;
    }
  }
  
  final int getMinimumHeightForVisibleOverlappingContent()
  {
    int k = getTopInset();
    int m = s.j(this);
    if (m != 0) {
      return k + m * 2;
    }
    int n = getChildCount();
    if (n >= 1) {}
    for (int i1 = s.j(getChildAt(n - 1)); i1 != 0; i1 = 0) {
      return k + i1 * 2;
    }
    return getHeight() / 3;
  }
  
  int getPendingAction()
  {
    return this.e;
  }
  
  @Deprecated
  public float getTargetElevation()
  {
    return 0.0F;
  }
  
  final int getTopInset()
  {
    if (this.f != null) {
      return this.f.b();
    }
    return 0;
  }
  
  public final int getTotalScrollRange()
  {
    if (this.a != -1) {
      return this.a;
    }
    int k = getChildCount();
    int m = 0;
    int n = 0;
    View localView;
    if (m < k)
    {
      localView = getChildAt(m);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      int i3 = localView.getMeasuredHeight();
      int i4 = localLayoutParams.a;
      if ((i4 & 0x1) != 0)
      {
        n += i3 + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
        if ((i4 & 0x2) == 0) {}
      }
    }
    for (int i1 = n - s.j(localView);; i1 = n)
    {
      int i2 = Math.max(0, i1 - getTopInset());
      this.a = i2;
      return i2;
      m++;
      break;
    }
  }
  
  int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    if (this.j == null) {
      this.j = new int[2];
    }
    int[] arrayOfInt1 = this.j;
    int[] arrayOfInt2 = super.onCreateDrawableState(paramInt + arrayOfInt1.length);
    int k;
    if (this.h)
    {
      k = a.b.state_collapsible;
      arrayOfInt1[0] = k;
      if ((!this.h) || (!this.i)) {
        break label84;
      }
    }
    label84:
    for (int m = a.b.state_collapsed;; m = -a.b.state_collapsed)
    {
      arrayOfInt1[1] = m;
      return mergeDrawableStates(arrayOfInt2, arrayOfInt1);
      k = -a.b.state_collapsible;
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    f();
    this.d = false;
    int k = getChildCount();
    for (int m = 0;; m++) {
      if (m < k)
      {
        if (((LayoutParams)getChildAt(m).getLayoutParams()).b() != null) {
          this.d = true;
        }
      }
      else
      {
        e();
        return;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    f();
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    a(paramBoolean, s.x(this));
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt != 1) {
      throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    super.setOrientation(paramInt);
  }
  
  @Deprecated
  public void setTargetElevation(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      p.a(this, paramFloat);
    }
  }
  
  public static class Behavior
    extends HeaderBehavior<AppBarLayout>
  {
    private int b;
    private ValueAnimator c;
    private int d = -1;
    private boolean e;
    private float f;
    private WeakReference<View> g;
    private a h;
    
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    private int a(AppBarLayout paramAppBarLayout, int paramInt)
    {
      int i = 0;
      int j = paramAppBarLayout.getChildCount();
      while (i < j)
      {
        View localView = paramAppBarLayout.getChildAt(i);
        if ((localView.getTop() <= -paramInt) && (localView.getBottom() >= -paramInt)) {
          return i;
        }
        i++;
      }
      return -1;
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt, float paramFloat)
    {
      int i = Math.abs(a() - paramInt);
      float f1 = Math.abs(paramFloat);
      if (f1 > 0.0F) {}
      for (int j = 3 * Math.round(1000.0F * (i / f1));; j = (int)(150.0F * (1.0F + i / paramAppBarLayout.getHeight())))
      {
        a(paramCoordinatorLayout, paramAppBarLayout, paramInt, j);
        return;
      }
    }
    
    private void a(final CoordinatorLayout paramCoordinatorLayout, final AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2)
    {
      int i = a();
      if (i == paramInt1)
      {
        if ((this.c != null) && (this.c.isRunning())) {
          this.c.cancel();
        }
        return;
      }
      if (this.c == null)
      {
        this.c = new ValueAnimator();
        this.c.setInterpolator(a.e);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            AppBarLayout.Behavior.this.a_(paramCoordinatorLayout, paramAppBarLayout, ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue());
          }
        });
      }
      for (;;)
      {
        this.c.setDuration(Math.min(paramInt2, 600));
        this.c.setIntValues(new int[] { i, paramInt1 });
        this.c.start();
        return;
        this.c.cancel();
      }
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      boolean bool1 = true;
      View localView = c(paramAppBarLayout, paramInt1);
      int i;
      boolean bool2;
      int k;
      boolean bool4;
      if (localView != null)
      {
        i = ((AppBarLayout.LayoutParams)localView.getLayoutParams()).a();
        int j = i & 0x1;
        bool2 = false;
        if (j != 0)
        {
          k = s.j(localView);
          if ((paramInt2 <= 0) || ((i & 0xC) == 0)) {
            break label134;
          }
          if (-paramInt1 < localView.getBottom() - k - paramAppBarLayout.getTopInset()) {
            break label128;
          }
          bool4 = bool1;
          bool2 = bool4;
        }
      }
      label128:
      label134:
      int m;
      do
      {
        boolean bool3 = paramAppBarLayout.a(bool2);
        if ((Build.VERSION.SDK_INT >= 11) && ((paramBoolean) || ((bool3) && (d(paramCoordinatorLayout, paramAppBarLayout))))) {
          paramAppBarLayout.jumpDrawablesToCurrentState();
        }
        return;
        bool4 = false;
        break;
        m = i & 0x2;
        bool2 = false;
      } while (m == 0);
      if (-paramInt1 >= localView.getBottom() - k - paramAppBarLayout.getTopInset()) {}
      for (;;)
      {
        bool2 = bool1;
        break;
        bool1 = false;
      }
    }
    
    private static boolean a(int paramInt1, int paramInt2)
    {
      return (paramInt1 & paramInt2) == paramInt2;
    }
    
    private int b(AppBarLayout paramAppBarLayout, int paramInt)
    {
      int i = Math.abs(paramInt);
      int j = paramAppBarLayout.getChildCount();
      int k = 0;
      View localView;
      Interpolator localInterpolator;
      int n;
      if (k < j)
      {
        localView = paramAppBarLayout.getChildAt(k);
        AppBarLayout.LayoutParams localLayoutParams = (AppBarLayout.LayoutParams)localView.getLayoutParams();
        localInterpolator = localLayoutParams.b();
        if ((i < localView.getTop()) || (i > localView.getBottom())) {
          break label191;
        }
        if (localInterpolator != null)
        {
          int m = localLayoutParams.a();
          if ((m & 0x1) == 0) {
            break label197;
          }
          n = 0 + (localView.getHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin);
          if ((m & 0x2) != 0) {
            n -= s.j(localView);
          }
        }
      }
      for (;;)
      {
        if (s.q(localView)) {
          n -= paramAppBarLayout.getTopInset();
        }
        if (n > 0)
        {
          int i1 = i - localView.getTop();
          int i2 = Math.round(n * localInterpolator.getInterpolation(i1 / n));
          paramInt = Integer.signum(paramInt) * (i2 + localView.getTop());
        }
        return paramInt;
        label191:
        k++;
        break;
        label197:
        n = 0;
      }
    }
    
    private static View c(AppBarLayout paramAppBarLayout, int paramInt)
    {
      int i = Math.abs(paramInt);
      int j = paramAppBarLayout.getChildCount();
      for (int k = 0; k < j; k++)
      {
        View localView = paramAppBarLayout.getChildAt(k);
        if ((i >= localView.getTop()) && (i <= localView.getBottom())) {
          return localView;
        }
      }
      return null;
    }
    
    private void c(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
    {
      int i = a();
      int j = a(paramAppBarLayout, i);
      View localView;
      int k;
      int m;
      int n;
      int i1;
      if (j >= 0)
      {
        localView = paramAppBarLayout.getChildAt(j);
        k = ((AppBarLayout.LayoutParams)localView.getLayoutParams()).a();
        if ((k & 0x11) == 17)
        {
          m = -localView.getTop();
          n = -localView.getBottom();
          if (j == -1 + paramAppBarLayout.getChildCount()) {
            n += paramAppBarLayout.getTopInset();
          }
          if (!a(k, 2)) {
            break label138;
          }
          n += s.j(localView);
          i1 = m;
        }
      }
      for (;;)
      {
        if (i < (n + i1) / 2) {}
        for (;;)
        {
          a(paramCoordinatorLayout, paramAppBarLayout, android.support.v4.c.a.a(n, -paramAppBarLayout.getTotalScrollRange(), 0), 0.0F);
          return;
          label138:
          if (!a(k, 5)) {
            break label181;
          }
          i1 = n + s.j(localView);
          if (i < i1) {
            break;
          }
          n = i1;
          i1 = m;
          break;
          n = i1;
        }
        label181:
        i1 = m;
      }
    }
    
    private boolean d(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
    {
      List localList = paramCoordinatorLayout.d(paramAppBarLayout);
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        CoordinatorLayout.Behavior localBehavior = ((CoordinatorLayout.d)((View)localList.get(j)).getLayoutParams()).b();
        if ((localBehavior instanceof AppBarLayout.ScrollingViewBehavior)) {
          return ((AppBarLayout.ScrollingViewBehavior)localBehavior).d() != 0;
        }
      }
      return false;
    }
    
    int a()
    {
      return b() + this.b;
    }
    
    int a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = a();
      if ((paramInt2 != 0) && (i >= paramInt2) && (i <= paramInt3))
      {
        int j = android.support.v4.c.a.a(paramInt1, paramInt2, paramInt3);
        int k = 0;
        int m;
        int n;
        if (i != j)
        {
          if (!paramAppBarLayout.b()) {
            break label138;
          }
          m = b(paramAppBarLayout, j);
          boolean bool = a(m);
          n = i - j;
          this.b = (j - m);
          if ((!bool) && (paramAppBarLayout.b())) {
            paramCoordinatorLayout.b(paramAppBarLayout);
          }
          paramAppBarLayout.a(b());
          if (j >= i) {
            break label145;
          }
        }
        label138:
        label145:
        for (int i1 = -1;; i1 = 1)
        {
          a(paramCoordinatorLayout, paramAppBarLayout, j, i1, false);
          k = n;
          return k;
          m = j;
          break;
        }
      }
      this.b = 0;
      return 0;
    }
    
    void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
    {
      c(paramCoordinatorLayout, paramAppBarLayout);
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, Parcelable paramParcelable)
    {
      if ((paramParcelable instanceof SavedState))
      {
        SavedState localSavedState = (SavedState)paramParcelable;
        super.a(paramCoordinatorLayout, paramAppBarLayout, localSavedState.getSuperState());
        this.d = localSavedState.a;
        this.f = localSavedState.b;
        this.e = localSavedState.c;
        return;
      }
      super.a(paramCoordinatorLayout, paramAppBarLayout, paramParcelable);
      this.d = -1;
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt)
    {
      if (paramInt == 0) {
        c(paramCoordinatorLayout, paramAppBarLayout);
      }
      this.g = new WeakReference(paramView);
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      if (paramInt4 < 0) {
        b(paramCoordinatorLayout, paramAppBarLayout, paramInt4, -paramAppBarLayout.getDownNestedScrollRange(), 0);
      }
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
    {
      int i;
      if (paramInt2 != 0)
      {
        if (paramInt2 >= 0) {
          break label50;
        }
        i = -paramAppBarLayout.getTotalScrollRange();
      }
      for (int j = i + paramAppBarLayout.getDownNestedPreScrollRange();; j = 0)
      {
        if (i != j) {
          paramArrayOfInt[1] = b(paramCoordinatorLayout, paramAppBarLayout, paramInt2, i, j);
        }
        return;
        label50:
        i = -paramAppBarLayout.getUpNestedPreScrollRange();
      }
    }
    
    boolean a(AppBarLayout paramAppBarLayout)
    {
      if (this.h != null) {
        return this.h.a(paramAppBarLayout);
      }
      if (this.g != null)
      {
        View localView = (View)this.g.get();
        return (localView != null) && (localView.isShown()) && (!localView.canScrollVertically(-1));
      }
      return true;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt)
    {
      boolean bool = super.a(paramCoordinatorLayout, paramAppBarLayout, paramInt);
      int i = paramAppBarLayout.getPendingAction();
      View localView;
      int m;
      int n;
      if ((this.d >= 0) && ((i & 0x8) == 0))
      {
        localView = paramAppBarLayout.getChildAt(this.d);
        m = -localView.getBottom();
        if (this.e)
        {
          n = m + (s.j(localView) + paramAppBarLayout.getTopInset());
          a_(paramCoordinatorLayout, paramAppBarLayout, n);
        }
      }
      for (;;)
      {
        paramAppBarLayout.d();
        this.d = -1;
        a(android.support.v4.c.a.a(b(), -paramAppBarLayout.getTotalScrollRange(), 0));
        a(paramCoordinatorLayout, paramAppBarLayout, b(), 0, true);
        paramAppBarLayout.a(b());
        return bool;
        n = m + Math.round(localView.getHeight() * this.f);
        break;
        if (i != 0)
        {
          int j;
          if ((i & 0x4) != 0) {
            j = 1;
          }
          for (;;)
          {
            if ((i & 0x2) != 0)
            {
              int k = -paramAppBarLayout.getUpNestedPreScrollRange();
              if (j != 0)
              {
                a(paramCoordinatorLayout, paramAppBarLayout, k, 0.0F);
                break;
                j = 0;
                continue;
              }
              a_(paramCoordinatorLayout, paramAppBarLayout, k);
              break;
            }
          }
          if ((i & 0x1) != 0) {
            if (j != 0) {
              a(paramCoordinatorLayout, paramAppBarLayout, 0, 0.0F);
            } else {
              a_(paramCoordinatorLayout, paramAppBarLayout, 0);
            }
          }
        }
      }
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (((CoordinatorLayout.d)paramAppBarLayout.getLayoutParams()).height == -2)
      {
        paramCoordinatorLayout.a(paramAppBarLayout, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(0, 0), paramInt4);
        return true;
      }
      return super.a(paramCoordinatorLayout, paramAppBarLayout, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView1, View paramView2, int paramInt1, int paramInt2)
    {
      if (((paramInt1 & 0x2) != 0) && (paramAppBarLayout.c()) && (paramCoordinatorLayout.getHeight() - paramView1.getHeight() <= paramAppBarLayout.getHeight())) {}
      for (boolean bool = true;; bool = false)
      {
        if ((bool) && (this.c != null)) {
          this.c.cancel();
        }
        this.g = null;
        return bool;
      }
    }
    
    int b(AppBarLayout paramAppBarLayout)
    {
      return -paramAppBarLayout.getDownNestedScrollRange();
    }
    
    public Parcelable b(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
    {
      Parcelable localParcelable = super.b(paramCoordinatorLayout, paramAppBarLayout);
      int i = b();
      int j = paramAppBarLayout.getChildCount();
      for (int k = 0; k < j; k++)
      {
        View localView = paramAppBarLayout.getChildAt(k);
        int m = i + localView.getBottom();
        if ((i + localView.getTop() <= 0) && (m >= 0))
        {
          SavedState localSavedState = new SavedState(localParcelable);
          localSavedState.a = k;
          int n = s.j(localView) + paramAppBarLayout.getTopInset();
          boolean bool = false;
          if (m == n) {
            bool = true;
          }
          localSavedState.c = bool;
          localSavedState.b = (m / localView.getHeight());
          return localSavedState;
        }
      }
      return localParcelable;
    }
    
    int c(AppBarLayout paramAppBarLayout)
    {
      return paramAppBarLayout.getTotalScrollRange();
    }
    
    protected static class SavedState
      extends AbsSavedState
    {
      public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
      {
        public AppBarLayout.Behavior.SavedState a(Parcel paramAnonymousParcel)
        {
          return new AppBarLayout.Behavior.SavedState(paramAnonymousParcel, null);
        }
        
        public AppBarLayout.Behavior.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
        {
          return new AppBarLayout.Behavior.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
        }
        
        public AppBarLayout.Behavior.SavedState[] a(int paramAnonymousInt)
        {
          return new AppBarLayout.Behavior.SavedState[paramAnonymousInt];
        }
      };
      int a;
      float b;
      boolean c;
      
      public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        super(paramClassLoader);
        this.a = paramParcel.readInt();
        this.b = paramParcel.readFloat();
        if (paramParcel.readByte() != 0) {}
        for (boolean bool = true;; bool = false)
        {
          this.c = bool;
          return;
        }
      }
      
      public SavedState(Parcelable paramParcelable)
      {
        super();
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        super.writeToParcel(paramParcel, paramInt);
        paramParcel.writeInt(this.a);
        paramParcel.writeFloat(this.b);
        if (this.c) {}
        for (int i = 1;; i = 0)
        {
          paramParcel.writeByte((byte)i);
          return;
        }
      }
    }
    
    public static abstract class a
    {
      public abstract boolean a(AppBarLayout paramAppBarLayout);
    }
  }
  
  public static class LayoutParams
    extends LinearLayout.LayoutParams
  {
    int a = 1;
    Interpolator b;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.AppBarLayout_Layout);
      this.a = localTypedArray.getInt(a.k.AppBarLayout_Layout_layout_scrollFlags, 0);
      if (localTypedArray.hasValue(a.k.AppBarLayout_Layout_layout_scrollInterpolator)) {
        this.b = AnimationUtils.loadInterpolator(paramContext, localTypedArray.getResourceId(a.k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
      }
      localTypedArray.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LinearLayout.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public int a()
    {
      return this.a;
    }
    
    public Interpolator b()
    {
      return this.b;
    }
    
    boolean c()
    {
      return ((0x1 & this.a) == 1) && ((0xA & this.a) != 0);
    }
  }
  
  public static class ScrollingViewBehavior
    extends HeaderScrollingViewBehavior
  {
    public ScrollingViewBehavior() {}
    
    public ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ScrollingViewBehavior_Layout);
      b(localTypedArray.getDimensionPixelSize(a.k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
      localTypedArray.recycle();
    }
    
    private static int a(AppBarLayout paramAppBarLayout)
    {
      CoordinatorLayout.Behavior localBehavior = ((CoordinatorLayout.d)paramAppBarLayout.getLayoutParams()).b();
      if ((localBehavior instanceof AppBarLayout.Behavior)) {
        return ((AppBarLayout.Behavior)localBehavior).a();
      }
      return 0;
    }
    
    private void e(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      CoordinatorLayout.Behavior localBehavior = ((CoordinatorLayout.d)paramView2.getLayoutParams()).b();
      if ((localBehavior instanceof AppBarLayout.Behavior))
      {
        AppBarLayout.Behavior localBehavior1 = (AppBarLayout.Behavior)localBehavior;
        s.c(paramView1, paramView2.getBottom() - paramView1.getTop() + AppBarLayout.Behavior.a(localBehavior1) + a() - c(paramView2));
      }
    }
    
    float a(View paramView)
    {
      int i;
      int j;
      int k;
      if ((paramView instanceof AppBarLayout))
      {
        AppBarLayout localAppBarLayout = (AppBarLayout)paramView;
        i = localAppBarLayout.getTotalScrollRange();
        j = localAppBarLayout.getDownNestedPreScrollRange();
        k = a(localAppBarLayout);
        if ((j == 0) || (i + k > j)) {
          break label45;
        }
      }
      label45:
      int m;
      do
      {
        return 0.0F;
        m = i - j;
      } while (m == 0);
      return 1.0F + k / m;
    }
    
    AppBarLayout a(List<View> paramList)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        View localView = (View)paramList.get(j);
        if ((localView instanceof AppBarLayout)) {
          return (AppBarLayout)localView;
        }
      }
      return null;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
    {
      AppBarLayout localAppBarLayout = a(paramCoordinatorLayout.c(paramView));
      if (localAppBarLayout != null)
      {
        paramRect.offset(paramView.getLeft(), paramView.getTop());
        Rect localRect = this.a;
        localRect.set(0, 0, paramCoordinatorLayout.getWidth(), paramCoordinatorLayout.getHeight());
        if (!localRect.contains(paramRect))
        {
          if (!paramBoolean) {}
          for (boolean bool = true;; bool = false)
          {
            localAppBarLayout.a(false, bool);
            return true;
          }
        }
      }
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      return paramView2 instanceof AppBarLayout;
    }
    
    int b(View paramView)
    {
      if ((paramView instanceof AppBarLayout)) {
        return ((AppBarLayout)paramView).getTotalScrollRange();
      }
      return super.b(paramView);
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      e(paramCoordinatorLayout, paramView1, paramView2);
      return false;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(AppBarLayout paramAppBarLayout, int paramInt);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.AppBarLayout
 * JD-Core Version:    0.7.0.1
 */