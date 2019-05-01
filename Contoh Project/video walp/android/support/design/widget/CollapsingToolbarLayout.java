package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.a.f;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.v4.f.i;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v7.a.a.i;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class CollapsingToolbarLayout
  extends FrameLayout
{
  final e a;
  Drawable b;
  int c;
  aa d;
  private boolean e = true;
  private int f;
  private Toolbar g;
  private View h;
  private View i;
  private int j;
  private int k;
  private int l;
  private int m;
  private final Rect n = new Rect();
  private boolean o;
  private boolean p;
  private Drawable q;
  private int r;
  private boolean s;
  private ValueAnimator t;
  private long u;
  private int v = -1;
  private AppBarLayout.a w;
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    m.a(paramContext);
    this.a = new e(this);
    this.a.a(a.e);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.CollapsingToolbarLayout, paramInt, a.j.Widget_Design_CollapsingToolbar);
    this.a.a(localTypedArray.getInt(a.k.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
    this.a.b(localTypedArray.getInt(a.k.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
    int i1 = localTypedArray.getDimensionPixelSize(a.k.CollapsingToolbarLayout_expandedTitleMargin, 0);
    this.m = i1;
    this.l = i1;
    this.k = i1;
    this.j = i1;
    if (localTypedArray.hasValue(a.k.CollapsingToolbarLayout_expandedTitleMarginStart)) {
      this.j = localTypedArray.getDimensionPixelSize(a.k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
    }
    if (localTypedArray.hasValue(a.k.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
      this.l = localTypedArray.getDimensionPixelSize(a.k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
    }
    if (localTypedArray.hasValue(a.k.CollapsingToolbarLayout_expandedTitleMarginTop)) {
      this.k = localTypedArray.getDimensionPixelSize(a.k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
    }
    if (localTypedArray.hasValue(a.k.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
      this.m = localTypedArray.getDimensionPixelSize(a.k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
    }
    this.o = localTypedArray.getBoolean(a.k.CollapsingToolbarLayout_titleEnabled, true);
    setTitle(localTypedArray.getText(a.k.CollapsingToolbarLayout_title));
    this.a.d(a.j.TextAppearance_Design_CollapsingToolbar_Expanded);
    this.a.c(a.i.TextAppearance_AppCompat_Widget_ActionBar_Title);
    if (localTypedArray.hasValue(a.k.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
      this.a.d(localTypedArray.getResourceId(a.k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
    }
    if (localTypedArray.hasValue(a.k.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
      this.a.c(localTypedArray.getResourceId(a.k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
    }
    this.v = localTypedArray.getDimensionPixelSize(a.k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
    this.u = localTypedArray.getInt(a.k.CollapsingToolbarLayout_scrimAnimationDuration, 600);
    setContentScrim(localTypedArray.getDrawable(a.k.CollapsingToolbarLayout_contentScrim));
    setStatusBarScrim(localTypedArray.getDrawable(a.k.CollapsingToolbarLayout_statusBarScrim));
    this.f = localTypedArray.getResourceId(a.k.CollapsingToolbarLayout_toolbarId, -1);
    localTypedArray.recycle();
    setWillNotDraw(false);
    android.support.v4.view.s.a(this, new o()
    {
      public aa a(View paramAnonymousView, aa paramAnonymousaa)
      {
        return CollapsingToolbarLayout.this.a(paramAnonymousaa);
      }
    });
  }
  
  static n a(View paramView)
  {
    n localn = (n)paramView.getTag(a.f.view_offset_helper);
    if (localn == null)
    {
      localn = new n(paramView);
      paramView.setTag(a.f.view_offset_helper, localn);
    }
    return localn;
  }
  
  private void a(int paramInt)
  {
    c();
    Interpolator localInterpolator;
    if (this.t == null)
    {
      this.t = new ValueAnimator();
      this.t.setDuration(this.u);
      ValueAnimator localValueAnimator2 = this.t;
      if (paramInt > this.r)
      {
        localInterpolator = a.c;
        localValueAnimator2.setInterpolator(localInterpolator);
        this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue());
          }
        });
      }
    }
    for (;;)
    {
      ValueAnimator localValueAnimator1 = this.t;
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = this.r;
      arrayOfInt[1] = paramInt;
      localValueAnimator1.setIntValues(arrayOfInt);
      this.t.start();
      return;
      localInterpolator = a.d;
      break;
      if (this.t.isRunning()) {
        this.t.cancel();
      }
    }
  }
  
  private void c()
  {
    if (!this.e) {
      return;
    }
    this.g = null;
    this.h = null;
    if (this.f != -1)
    {
      this.g = ((Toolbar)findViewById(this.f));
      if (this.g != null) {
        this.h = d(this.g);
      }
    }
    int i2;
    View localView;
    if (this.g == null)
    {
      int i1 = getChildCount();
      i2 = 0;
      if (i2 >= i1) {
        break label121;
      }
      localView = getChildAt(i2);
      if (!(localView instanceof Toolbar)) {
        break label115;
      }
    }
    label115:
    label121:
    for (Toolbar localToolbar = (Toolbar)localView;; localToolbar = null)
    {
      this.g = localToolbar;
      d();
      this.e = false;
      return;
      i2++;
      break;
    }
  }
  
  private boolean c(View paramView)
  {
    if ((this.h == null) || (this.h == this)) {
      if (paramView != this.g) {}
    }
    while (paramView == this.h)
    {
      return true;
      return false;
    }
    return false;
  }
  
  private View d(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    View localView = paramView;
    while ((localViewParent != this) && (localViewParent != null))
    {
      if ((localViewParent instanceof View)) {
        localView = (View)localViewParent;
      }
      localViewParent = localViewParent.getParent();
    }
    return localView;
  }
  
  private void d()
  {
    if ((!this.o) && (this.i != null))
    {
      ViewParent localViewParent = this.i.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(this.i);
      }
    }
    if ((this.o) && (this.g != null))
    {
      if (this.i == null) {
        this.i = new View(getContext());
      }
      if (this.i.getParent() == null) {
        this.g.addView(this.i, -1, -1);
      }
    }
  }
  
  private static int e(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localLayoutParams;
      return paramView.getHeight() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin;
    }
    return paramView.getHeight();
  }
  
  protected LayoutParams a()
  {
    return new LayoutParams(-1, -1);
  }
  
  aa a(aa paramaa)
  {
    boolean bool = android.support.v4.view.s.q(this);
    aa localaa = null;
    if (bool) {
      localaa = paramaa;
    }
    if (!i.a(this.d, localaa))
    {
      this.d = localaa;
      requestLayout();
    }
    return paramaa.g();
  }
  
  protected FrameLayout.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = 255;
    if (this.s != paramBoolean1)
    {
      if (!paramBoolean2) {
        break label36;
      }
      if (!paramBoolean1) {
        break label31;
      }
    }
    for (;;)
    {
      a(i1);
      this.s = paramBoolean1;
      return;
      label31:
      i1 = 0;
    }
    label36:
    if (paramBoolean1) {}
    for (;;)
    {
      setScrimAlpha(i1);
      break;
      i1 = 0;
    }
  }
  
  final int b(View paramView)
  {
    n localn = a(paramView);
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    return getHeight() - localn.c() - paramView.getHeight() - localLayoutParams.bottomMargin;
  }
  
  final void b()
  {
    if ((this.q != null) || (this.b != null)) {
      if (getHeight() + this.c >= getScrimVisibleHeightTrigger()) {
        break label38;
      }
    }
    label38:
    for (boolean bool = true;; bool = false)
    {
      setScrimsShown(bool);
      return;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    c();
    if ((this.g == null) && (this.q != null) && (this.r > 0))
    {
      this.q.mutate().setAlpha(this.r);
      this.q.draw(paramCanvas);
    }
    if ((this.o) && (this.p)) {
      this.a.a(paramCanvas);
    }
    if ((this.b != null) && (this.r > 0)) {
      if (this.d == null) {
        break label153;
      }
    }
    label153:
    for (int i1 = this.d.b();; i1 = 0)
    {
      if (i1 > 0)
      {
        this.b.setBounds(0, -this.c, getWidth(), i1 - this.c);
        this.b.mutate().setAlpha(this.r);
        this.b.draw(paramCanvas);
      }
      return;
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    if ((this.q != null) && (this.r > 0) && (c(paramView)))
    {
      this.q.mutate().setAlpha(this.r);
      this.q.draw(paramCanvas);
    }
    for (int i1 = 1;; i1 = 0)
    {
      boolean bool;
      if (!super.drawChild(paramCanvas, paramView, paramLong))
      {
        bool = false;
        if (i1 == 0) {}
      }
      else
      {
        bool = true;
      }
      return bool;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable localDrawable1 = this.b;
    boolean bool1 = false;
    if (localDrawable1 != null)
    {
      boolean bool2 = localDrawable1.isStateful();
      bool1 = false;
      if (bool2) {
        bool1 = false | localDrawable1.setState(arrayOfInt);
      }
    }
    Drawable localDrawable2 = this.q;
    if ((localDrawable2 != null) && (localDrawable2.isStateful())) {
      bool1 |= localDrawable2.setState(arrayOfInt);
    }
    if (this.a != null) {
      bool1 |= this.a.a(arrayOfInt);
    }
    if (bool1) {
      invalidate();
    }
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public int getCollapsedTitleGravity()
  {
    return this.a.c();
  }
  
  public Typeface getCollapsedTitleTypeface()
  {
    return this.a.d();
  }
  
  public Drawable getContentScrim()
  {
    return this.q;
  }
  
  public int getExpandedTitleGravity()
  {
    return this.a.b();
  }
  
  public int getExpandedTitleMarginBottom()
  {
    return this.m;
  }
  
  public int getExpandedTitleMarginEnd()
  {
    return this.l;
  }
  
  public int getExpandedTitleMarginStart()
  {
    return this.j;
  }
  
  public int getExpandedTitleMarginTop()
  {
    return this.k;
  }
  
  public Typeface getExpandedTitleTypeface()
  {
    return this.a.e();
  }
  
  int getScrimAlpha()
  {
    return this.r;
  }
  
  public long getScrimAnimationDuration()
  {
    return this.u;
  }
  
  public int getScrimVisibleHeightTrigger()
  {
    if (this.v >= 0) {
      return this.v;
    }
    if (this.d != null) {}
    for (int i1 = this.d.b();; i1 = 0)
    {
      int i2 = android.support.v4.view.s.j(this);
      if (i2 <= 0) {
        break;
      }
      return Math.min(i1 + i2 * 2, getHeight());
    }
    return getHeight() / 3;
  }
  
  public Drawable getStatusBarScrim()
  {
    return this.b;
  }
  
  public CharSequence getTitle()
  {
    if (this.o) {
      return this.a.j();
    }
    return null;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    if ((localViewParent instanceof AppBarLayout))
    {
      android.support.v4.view.s.b(this, android.support.v4.view.s.q((View)localViewParent));
      if (this.w == null) {
        this.w = new a();
      }
      ((AppBarLayout)localViewParent).a(this.w);
      android.support.v4.view.s.p(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    ViewParent localViewParent = getParent();
    if ((this.w != null) && ((localViewParent instanceof AppBarLayout))) {
      ((AppBarLayout)localViewParent).b(this.w);
    }
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 1;
    int i2 = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.d != null)
    {
      int i16 = this.d.b();
      int i17 = getChildCount();
      for (int i18 = 0; i18 < i17; i18++)
      {
        View localView = getChildAt(i18);
        if ((!android.support.v4.view.s.q(localView)) && (localView.getTop() < i16)) {
          android.support.v4.view.s.c(localView, i16);
        }
      }
    }
    int i4;
    label148:
    Object localObject;
    label161:
    int i7;
    label210:
    int i11;
    label260:
    e locale2;
    int i12;
    label309:
    int i13;
    int i14;
    if ((this.o) && (this.i != null))
    {
      if ((!android.support.v4.view.s.A(this.i)) || (this.i.getVisibility() != 0)) {
        break label401;
      }
      i4 = i1;
      this.p = i4;
      if (this.p)
      {
        if (android.support.v4.view.s.e(this) != i1) {
          break label407;
        }
        if (this.h == null) {
          break label413;
        }
        localObject = this.h;
        int i5 = b((View)localObject);
        android.support.v4.widget.s.b(this, this.i, this.n);
        e locale1 = this.a;
        int i6 = this.n.left;
        if (i1 == 0) {
          break label422;
        }
        i7 = this.g.getTitleMarginEnd();
        int i8 = i6 + i7;
        int i9 = i5 + this.n.top + this.g.getTitleMarginTop();
        int i10 = this.n.right;
        if (i1 == 0) {
          break label434;
        }
        i11 = this.g.getTitleMarginStart();
        locale1.b(i8, i9, i11 + i10, i5 + this.n.bottom - this.g.getTitleMarginBottom());
        locale2 = this.a;
        if (i1 == 0) {
          break label446;
        }
        i12 = this.l;
        i13 = this.n.top + this.k;
        i14 = paramInt3 - paramInt1;
        if (i1 == 0) {
          break label455;
        }
      }
    }
    label401:
    label407:
    label413:
    label422:
    label434:
    label446:
    label455:
    for (int i15 = this.j;; i15 = this.l)
    {
      locale2.a(i12, i13, i14 - i15, paramInt4 - paramInt2 - this.m);
      this.a.i();
      int i3 = getChildCount();
      while (i2 < i3)
      {
        a(getChildAt(i2)).a();
        i2++;
      }
      i4 = 0;
      break;
      i1 = 0;
      break label148;
      localObject = this.g;
      break label161;
      i7 = this.g.getTitleMarginStart();
      break label210;
      i11 = this.g.getTitleMarginEnd();
      break label260;
      i12 = this.j;
      break label309;
    }
    if (this.g != null)
    {
      if ((this.o) && (TextUtils.isEmpty(this.a.j()))) {
        this.a.a(this.g.getTitle());
      }
      if ((this.h != null) && (this.h != this)) {
        break label536;
      }
      setMinimumHeight(e(this.g));
    }
    for (;;)
    {
      b();
      return;
      label536:
      setMinimumHeight(e(this.h));
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    c();
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    if (this.d != null) {}
    for (int i2 = this.d.b();; i2 = 0)
    {
      if ((i1 == 0) && (i2 > 0)) {
        super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(i2 + getMeasuredHeight(), 1073741824));
      }
      return;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.q != null) {
      this.q.setBounds(0, 0, paramInt1, paramInt2);
    }
  }
  
  public void setCollapsedTitleGravity(int paramInt)
  {
    this.a.b(paramInt);
  }
  
  public void setCollapsedTitleTextAppearance(int paramInt)
  {
    this.a.c(paramInt);
  }
  
  public void setCollapsedTitleTextColor(int paramInt)
  {
    setCollapsedTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setCollapsedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.a.a(paramColorStateList);
  }
  
  public void setCollapsedTitleTypeface(Typeface paramTypeface)
  {
    this.a.a(paramTypeface);
  }
  
  public void setContentScrim(Drawable paramDrawable)
  {
    if (this.q != paramDrawable)
    {
      if (this.q != null) {
        this.q.setCallback(null);
      }
      Drawable localDrawable = null;
      if (paramDrawable != null) {
        localDrawable = paramDrawable.mutate();
      }
      this.q = localDrawable;
      if (this.q != null)
      {
        this.q.setBounds(0, 0, getWidth(), getHeight());
        this.q.setCallback(this);
        this.q.setAlpha(this.r);
      }
      android.support.v4.view.s.c(this);
    }
  }
  
  public void setContentScrimColor(int paramInt)
  {
    setContentScrim(new ColorDrawable(paramInt));
  }
  
  public void setContentScrimResource(int paramInt)
  {
    setContentScrim(android.support.v4.content.a.getDrawable(getContext(), paramInt));
  }
  
  public void setExpandedTitleColor(int paramInt)
  {
    setExpandedTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setExpandedTitleGravity(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void setExpandedTitleMarginBottom(int paramInt)
  {
    this.m = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginEnd(int paramInt)
  {
    this.l = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginStart(int paramInt)
  {
    this.j = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginTop(int paramInt)
  {
    this.k = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleTextAppearance(int paramInt)
  {
    this.a.d(paramInt);
  }
  
  public void setExpandedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.a.b(paramColorStateList);
  }
  
  public void setExpandedTitleTypeface(Typeface paramTypeface)
  {
    this.a.b(paramTypeface);
  }
  
  void setScrimAlpha(int paramInt)
  {
    if (paramInt != this.r)
    {
      if ((this.q != null) && (this.g != null)) {
        android.support.v4.view.s.c(this.g);
      }
      this.r = paramInt;
      android.support.v4.view.s.c(this);
    }
  }
  
  public void setScrimAnimationDuration(long paramLong)
  {
    this.u = paramLong;
  }
  
  public void setScrimVisibleHeightTrigger(int paramInt)
  {
    if (this.v != paramInt)
    {
      this.v = paramInt;
      b();
    }
  }
  
  public void setScrimsShown(boolean paramBoolean)
  {
    if ((android.support.v4.view.s.x(this)) && (!isInEditMode())) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramBoolean, bool);
      return;
    }
  }
  
  public void setStatusBarScrim(Drawable paramDrawable)
  {
    Drawable localDrawable2;
    if (this.b != paramDrawable)
    {
      if (this.b != null) {
        this.b.setCallback(null);
      }
      Drawable localDrawable1 = null;
      if (paramDrawable != null) {
        localDrawable1 = paramDrawable.mutate();
      }
      this.b = localDrawable1;
      if (this.b != null)
      {
        if (this.b.isStateful()) {
          this.b.setState(getDrawableState());
        }
        android.support.v4.a.a.a.b(this.b, android.support.v4.view.s.e(this));
        localDrawable2 = this.b;
        if (getVisibility() != 0) {
          break label129;
        }
      }
    }
    label129:
    for (boolean bool = true;; bool = false)
    {
      localDrawable2.setVisible(bool, false);
      this.b.setCallback(this);
      this.b.setAlpha(this.r);
      android.support.v4.view.s.c(this);
      return;
    }
  }
  
  public void setStatusBarScrimColor(int paramInt)
  {
    setStatusBarScrim(new ColorDrawable(paramInt));
  }
  
  public void setStatusBarScrimResource(int paramInt)
  {
    setStatusBarScrim(android.support.v4.content.a.getDrawable(getContext(), paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.a.a(paramCharSequence);
  }
  
  public void setTitleEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.o)
    {
      this.o = paramBoolean;
      d();
      requestLayout();
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if ((this.b != null) && (this.b.isVisible() != bool)) {
        this.b.setVisible(bool, false);
      }
      if ((this.q != null) && (this.q.isVisible() != bool)) {
        this.q.setVisible(bool, false);
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.q) || (paramDrawable == this.b);
  }
  
  public static class LayoutParams
    extends FrameLayout.LayoutParams
  {
    int a = 0;
    float b = 0.5F;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.CollapsingToolbarLayout_Layout);
      this.a = localTypedArray.getInt(a.k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
      a(localTypedArray.getFloat(a.k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
      localTypedArray.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public void a(float paramFloat)
    {
      this.b = paramFloat;
    }
  }
  
  private class a
    implements AppBarLayout.a
  {
    a() {}
    
    public void a(AppBarLayout paramAppBarLayout, int paramInt)
    {
      CollapsingToolbarLayout.this.c = paramInt;
      int i;
      int k;
      label41:
      View localView;
      CollapsingToolbarLayout.LayoutParams localLayoutParams;
      n localn;
      if (CollapsingToolbarLayout.this.d != null)
      {
        i = CollapsingToolbarLayout.this.d.b();
        int j = CollapsingToolbarLayout.this.getChildCount();
        k = 0;
        if (k >= j) {
          break label160;
        }
        localView = CollapsingToolbarLayout.this.getChildAt(k);
        localLayoutParams = (CollapsingToolbarLayout.LayoutParams)localView.getLayoutParams();
        localn = CollapsingToolbarLayout.a(localView);
        switch (localLayoutParams.a)
        {
        }
      }
      for (;;)
      {
        k++;
        break label41;
        i = 0;
        break;
        localn.a(android.support.v4.c.a.a(-paramInt, 0, CollapsingToolbarLayout.this.b(localView)));
        continue;
        localn.a(Math.round(-paramInt * localLayoutParams.b));
      }
      label160:
      CollapsingToolbarLayout.this.b();
      if ((CollapsingToolbarLayout.this.b != null) && (i > 0)) {
        android.support.v4.view.s.c(CollapsingToolbarLayout.this);
      }
      int m = CollapsingToolbarLayout.this.getHeight() - android.support.v4.view.s.j(CollapsingToolbarLayout.this) - i;
      CollapsingToolbarLayout.this.a.b(Math.abs(paramInt) / m);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.CollapsingToolbarLayout
 * JD-Core Version:    0.7.0.1
 */