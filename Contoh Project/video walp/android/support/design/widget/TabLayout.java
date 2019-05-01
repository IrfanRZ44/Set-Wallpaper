package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.d;
import android.support.design.a.h;
import android.support.design.a.k;
import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import android.support.v4.f.k.c;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.a;
import android.support.v4.view.ViewPager.d;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.p;
import android.support.v4.view.q;
import android.support.v4.view.s;
import android.support.v4.widget.o;
import android.support.v7.app.ActionBar.b;
import android.support.v7.c.a.b;
import android.support.v7.widget.TooltipCompat;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.a
public class TabLayout
  extends HorizontalScrollView
{
  private static final k.a<e> n = new k.c(16);
  private DataSetObserver A;
  private f B;
  private a C;
  private boolean D;
  private final k.a<g> E = new k.b(12);
  int a;
  int b;
  int c;
  int d;
  int e;
  ColorStateList f;
  float g;
  float h;
  final int i;
  int j = 2147483647;
  int k;
  int l;
  ViewPager m;
  private final ArrayList<e> o = new ArrayList();
  private e p;
  private final d q;
  private final int r;
  private final int s;
  private final int t;
  private int u;
  private b v;
  private final ArrayList<b> w = new ArrayList();
  private b x;
  private ValueAnimator y;
  private p z;
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    m.a(paramContext);
    setHorizontalScrollBarEnabled(false);
    this.q = new d(paramContext);
    super.addView(this.q, 0, new FrameLayout.LayoutParams(-2, -1));
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.TabLayout, paramInt, android.support.design.a.j.Widget_Design_TabLayout);
    this.q.b(localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabIndicatorHeight, 0));
    this.q.a(localTypedArray1.getColor(a.k.TabLayout_tabIndicatorColor, 0));
    int i1 = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabPadding, 0);
    this.d = i1;
    this.c = i1;
    this.b = i1;
    this.a = i1;
    this.a = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabPaddingStart, this.a);
    this.b = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabPaddingTop, this.b);
    this.c = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabPaddingEnd, this.c);
    this.d = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabPaddingBottom, this.d);
    this.e = localTypedArray1.getResourceId(a.k.TabLayout_tabTextAppearance, android.support.design.a.j.TextAppearance_Design_Tab);
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(this.e, android.support.v7.a.a.j.TextAppearance);
    try
    {
      this.g = localTypedArray2.getDimensionPixelSize(android.support.v7.a.a.j.TextAppearance_android_textSize, 0);
      this.f = localTypedArray2.getColorStateList(android.support.v7.a.a.j.TextAppearance_android_textColor);
      localTypedArray2.recycle();
      if (localTypedArray1.hasValue(a.k.TabLayout_tabTextColor)) {
        this.f = localTypedArray1.getColorStateList(a.k.TabLayout_tabTextColor);
      }
      if (localTypedArray1.hasValue(a.k.TabLayout_tabSelectedTextColor))
      {
        int i2 = localTypedArray1.getColor(a.k.TabLayout_tabSelectedTextColor, 0);
        this.f = a(this.f.getDefaultColor(), i2);
      }
      this.r = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabMinWidth, -1);
      this.s = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabMaxWidth, -1);
      this.i = localTypedArray1.getResourceId(a.k.TabLayout_tabBackground, 0);
      this.u = localTypedArray1.getDimensionPixelSize(a.k.TabLayout_tabContentStart, 0);
      this.l = localTypedArray1.getInt(a.k.TabLayout_tabMode, 1);
      this.k = localTypedArray1.getInt(a.k.TabLayout_tabGravity, 0);
      localTypedArray1.recycle();
      Resources localResources = getResources();
      this.h = localResources.getDimensionPixelSize(a.d.design_tab_text_size_2line);
      this.t = localResources.getDimensionPixelSize(a.d.design_tab_scrollable_min_width);
      g();
      return;
    }
    finally
    {
      localTypedArray2.recycle();
    }
  }
  
  private int a(int paramInt, float paramFloat)
  {
    int i1 = this.l;
    int i2 = 0;
    View localView1;
    View localView2;
    if (i1 == 0)
    {
      localView1 = this.q.getChildAt(paramInt);
      if (paramInt + 1 >= this.q.getChildCount()) {
        break label125;
      }
      localView2 = this.q.getChildAt(paramInt + 1);
      if (localView1 == null) {
        break label131;
      }
    }
    int i5;
    int i6;
    label131:
    for (int i3 = localView1.getWidth();; i3 = 0)
    {
      int i4 = 0;
      if (localView2 != null) {
        i4 = localView2.getWidth();
      }
      i5 = localView1.getLeft() + i3 / 2 - getWidth() / 2;
      i6 = (int)(paramFloat * (0.5F * (i4 + i3)));
      if (s.e(this) != 0) {
        break label137;
      }
      i2 = i6 + i5;
      return i2;
      label125:
      localView2 = null;
      break;
    }
    label137:
    return i5 - i6;
  }
  
  private static ColorStateList a(int paramInt1, int paramInt2)
  {
    int[][] arrayOfInt = new int[2][];
    int[] arrayOfInt1 = new int[2];
    arrayOfInt[0] = SELECTED_STATE_SET;
    arrayOfInt1[0] = paramInt2;
    arrayOfInt[1] = EMPTY_STATE_SET;
    arrayOfInt1[1] = paramInt1;
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private void a(TabItem paramTabItem)
  {
    e locale = a();
    if (paramTabItem.a != null) {
      locale.a(paramTabItem.a);
    }
    if (paramTabItem.b != null) {
      locale.a(paramTabItem.b);
    }
    if (paramTabItem.c != 0) {
      locale.a(paramTabItem.c);
    }
    if (!TextUtils.isEmpty(paramTabItem.getContentDescription())) {
      locale.b(paramTabItem.getContentDescription());
    }
    a(locale);
  }
  
  private void a(e parame, int paramInt)
  {
    parame.b(paramInt);
    this.o.add(paramInt, parame);
    int i1 = this.o.size();
    for (int i2 = paramInt + 1; i2 < i1; i2++) {
      ((e)this.o.get(i2)).b(i2);
    }
  }
  
  private void a(ViewPager paramViewPager, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.m != null)
    {
      if (this.B != null) {
        this.m.b(this.B);
      }
      if (this.C != null) {
        this.m.b(this.C);
      }
    }
    if (this.x != null)
    {
      b(this.x);
      this.x = null;
    }
    if (paramViewPager != null)
    {
      this.m = paramViewPager;
      if (this.B == null) {
        this.B = new f(this);
      }
      this.B.a();
      paramViewPager.a(this.B);
      this.x = new h(paramViewPager);
      a(this.x);
      p localp = paramViewPager.getAdapter();
      if (localp != null) {
        a(localp, paramBoolean1);
      }
      if (this.C == null) {
        this.C = new a();
      }
      this.C.a(paramBoolean1);
      paramViewPager.a(this.C);
      a(paramViewPager.getCurrentItem(), 0.0F, true);
    }
    for (;;)
    {
      this.D = paramBoolean2;
      return;
      this.m = null;
      a(null, false);
    }
  }
  
  private void a(View paramView)
  {
    if ((paramView instanceof TabItem))
    {
      a((TabItem)paramView);
      return;
    }
    throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
  }
  
  private void a(LinearLayout.LayoutParams paramLayoutParams)
  {
    if ((this.l == 1) && (this.k == 0))
    {
      paramLayoutParams.width = 0;
      paramLayoutParams.weight = 1.0F;
      return;
    }
    paramLayoutParams.width = -2;
    paramLayoutParams.weight = 0.0F;
  }
  
  private g c(e parame)
  {
    if (this.E != null) {}
    for (g localg = (g)this.E.a();; localg = null)
    {
      if (localg == null) {
        localg = new g(getContext());
      }
      localg.a(parame);
      localg.setFocusable(true);
      localg.setMinimumWidth(getTabMinWidth());
      return localg;
    }
  }
  
  private void c(int paramInt)
  {
    g localg = (g)this.q.getChildAt(paramInt);
    this.q.removeViewAt(paramInt);
    if (localg != null)
    {
      localg.a();
      this.E.a(localg);
    }
    requestLayout();
  }
  
  private void d()
  {
    int i1 = this.o.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((e)this.o.get(i2)).h();
    }
  }
  
  private void d(int paramInt)
  {
    if (paramInt == -1) {
      return;
    }
    if ((getWindowToken() == null) || (!s.x(this)) || (this.q.a()))
    {
      a(paramInt, 0.0F, true);
      return;
    }
    int i1 = getScrollX();
    int i2 = a(paramInt, 0.0F);
    if (i1 != i2)
    {
      f();
      this.y.setIntValues(new int[] { i1, i2 });
      this.y.start();
    }
    this.q.b(paramInt, 300);
  }
  
  private void d(e parame)
  {
    g localg = parame.b;
    this.q.addView(localg, parame.c(), e());
  }
  
  private LinearLayout.LayoutParams e()
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    a(localLayoutParams);
    return localLayoutParams;
  }
  
  private void e(e parame)
  {
    for (int i1 = -1 + this.w.size(); i1 >= 0; i1--) {
      ((b)this.w.get(i1)).a(parame);
    }
  }
  
  private void f()
  {
    if (this.y == null)
    {
      this.y = new ValueAnimator();
      this.y.setInterpolator(a.b);
      this.y.setDuration(300L);
      this.y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          TabLayout.this.scrollTo(((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue(), 0);
        }
      });
    }
  }
  
  private void f(e parame)
  {
    for (int i1 = -1 + this.w.size(); i1 >= 0; i1--) {
      ((b)this.w.get(i1)).b(parame);
    }
  }
  
  private void g()
  {
    if (this.l == 0) {}
    for (int i1 = Math.max(0, this.u - this.a);; i1 = 0)
    {
      s.b(this.q, i1, 0, 0, 0);
      switch (this.l)
      {
      }
      for (;;)
      {
        a(true);
        return;
        this.q.setGravity(1);
        continue;
        this.q.setGravity(8388611);
      }
    }
  }
  
  private void g(e parame)
  {
    for (int i1 = -1 + this.w.size(); i1 >= 0; i1--) {
      ((b)this.w.get(i1)).c(parame);
    }
  }
  
  private int getDefaultHeight()
  {
    int i1 = this.o.size();
    int i2 = 0;
    if (i2 < i1)
    {
      e locale = (e)this.o.get(i2);
      if ((locale == null) || (locale.b() == null) || (TextUtils.isEmpty(locale.d()))) {}
    }
    for (int i3 = 1;; i3 = 0)
    {
      if (i3 != 0)
      {
        return 72;
        i2++;
        break;
      }
      return 48;
    }
  }
  
  private float getScrollPosition()
  {
    return this.q.b();
  }
  
  private int getTabMinWidth()
  {
    if (this.r != -1) {
      return this.r;
    }
    if (this.l == 0) {
      return this.t;
    }
    return 0;
  }
  
  private int getTabScrollRange()
  {
    return Math.max(0, this.q.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
  }
  
  private void setSelectedTabView(int paramInt)
  {
    int i1 = this.q.getChildCount();
    if (paramInt < i1)
    {
      int i2 = 0;
      if (i2 < i1)
      {
        View localView = this.q.getChildAt(i2);
        if (i2 == paramInt) {}
        for (boolean bool = true;; bool = false)
        {
          localView.setSelected(bool);
          i2++;
          break;
        }
      }
    }
  }
  
  public e a()
  {
    e locale = (e)n.a();
    if (locale == null) {
      locale = new e();
    }
    locale.a = this;
    locale.b = c(locale);
    return locale;
  }
  
  public e a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getTabCount())) {
      return null;
    }
    return (e)this.o.get(paramInt);
  }
  
  public void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    a(paramInt, paramFloat, paramBoolean, true);
  }
  
  void a(int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Math.round(paramFloat + paramInt);
    if ((i1 < 0) || (i1 >= this.q.getChildCount())) {}
    do
    {
      return;
      if (paramBoolean2) {
        this.q.a(paramInt, paramFloat);
      }
      if ((this.y != null) && (this.y.isRunning())) {
        this.y.cancel();
      }
      scrollTo(a(paramInt, paramFloat), 0);
    } while (!paramBoolean1);
    setSelectedTabView(i1);
  }
  
  public void a(b paramb)
  {
    if (!this.w.contains(paramb)) {
      this.w.add(paramb);
    }
  }
  
  public void a(e parame)
  {
    a(parame, this.o.isEmpty());
  }
  
  public void a(e parame, int paramInt, boolean paramBoolean)
  {
    if (parame.a != this) {
      throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }
    a(parame, paramInt);
    d(parame);
    if (paramBoolean) {
      parame.e();
    }
  }
  
  public void a(e parame, boolean paramBoolean)
  {
    a(parame, this.o.size(), paramBoolean);
  }
  
  public void a(ViewPager paramViewPager, boolean paramBoolean)
  {
    a(paramViewPager, paramBoolean, false);
  }
  
  void a(p paramp, boolean paramBoolean)
  {
    if ((this.z != null) && (this.A != null)) {
      this.z.unregisterDataSetObserver(this.A);
    }
    this.z = paramp;
    if ((paramBoolean) && (paramp != null))
    {
      if (this.A == null) {
        this.A = new c();
      }
      paramp.registerDataSetObserver(this.A);
    }
    c();
  }
  
  void a(boolean paramBoolean)
  {
    for (int i1 = 0; i1 < this.q.getChildCount(); i1++)
    {
      View localView = this.q.getChildAt(i1);
      localView.setMinimumWidth(getTabMinWidth());
      a((LinearLayout.LayoutParams)localView.getLayoutParams());
      if (paramBoolean) {
        localView.requestLayout();
      }
    }
  }
  
  public void addView(View paramView)
  {
    a(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    a(paramView);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    a(paramView);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a(paramView);
  }
  
  int b(int paramInt)
  {
    return Math.round(getResources().getDisplayMetrics().density * paramInt);
  }
  
  public void b()
  {
    for (int i1 = -1 + this.q.getChildCount(); i1 >= 0; i1--) {
      c(i1);
    }
    Iterator localIterator = this.o.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      localIterator.remove();
      locale.i();
      n.a(locale);
    }
    this.p = null;
  }
  
  public void b(b paramb)
  {
    this.w.remove(paramb);
  }
  
  void b(e parame)
  {
    b(parame, true);
  }
  
  void b(e parame, boolean paramBoolean)
  {
    e locale = this.p;
    if (locale == parame)
    {
      if (locale != null)
      {
        g(parame);
        d(parame.c());
      }
      return;
    }
    int i1;
    if (parame != null)
    {
      i1 = parame.c();
      label38:
      if (paramBoolean)
      {
        if (((locale != null) && (locale.c() != -1)) || (i1 == -1)) {
          break label110;
        }
        a(i1, 0.0F, true);
      }
    }
    for (;;)
    {
      if (i1 != -1) {
        setSelectedTabView(i1);
      }
      if (locale != null) {
        f(locale);
      }
      this.p = parame;
      if (parame == null) {
        break;
      }
      e(parame);
      return;
      i1 = -1;
      break label38;
      label110:
      d(i1);
    }
  }
  
  void c()
  {
    b();
    if (this.z != null)
    {
      int i1 = this.z.getCount();
      for (int i2 = 0; i2 < i1; i2++) {
        a(a().a(this.z.getPageTitle(i2)), false);
      }
      if ((this.m != null) && (i1 > 0))
      {
        int i3 = this.m.getCurrentItem();
        if ((i3 != getSelectedTabPosition()) && (i3 < getTabCount())) {
          b(a(i3));
        }
      }
    }
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return generateDefaultLayoutParams();
  }
  
  public int getSelectedTabPosition()
  {
    if (this.p != null) {
      return this.p.c();
    }
    return -1;
  }
  
  public int getTabCount()
  {
    return this.o.size();
  }
  
  public int getTabGravity()
  {
    return this.k;
  }
  
  int getTabMaxWidth()
  {
    return this.j;
  }
  
  public int getTabMode()
  {
    return this.l;
  }
  
  public ColorStateList getTabTextColors()
  {
    return this.f;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.m == null)
    {
      ViewParent localViewParent = getParent();
      if ((localViewParent instanceof ViewPager)) {
        a((ViewPager)localViewParent, true, true);
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.D)
    {
      setupWithViewPager(null);
      this.D = false;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    int i2 = b(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
    int i3;
    int i6;
    label78:
    View localView;
    int i4;
    switch (View.MeasureSpec.getMode(paramInt2))
    {
    default: 
      i3 = View.MeasureSpec.getSize(paramInt1);
      if (View.MeasureSpec.getMode(paramInt1) != 0)
      {
        if (this.s > 0)
        {
          i6 = this.s;
          this.j = i6;
        }
      }
      else
      {
        super.onMeasure(paramInt1, paramInt2);
        if (getChildCount() == i1)
        {
          localView = getChildAt(0);
          switch (this.l)
          {
          default: 
            i4 = 0;
          }
        }
      }
      break;
    }
    for (;;)
    {
      if (i4 != 0)
      {
        int i5 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom(), localView.getLayoutParams().height);
        localView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), i5);
      }
      return;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(i2, View.MeasureSpec.getSize(paramInt2)), 1073741824);
      break;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
      break;
      i6 = i3 - b(56);
      break label78;
      if (localView.getMeasuredWidth() < getMeasuredWidth()) {
        i4 = i1;
      } else {
        i4 = 0;
      }
    }
    if (localView.getMeasuredWidth() != getMeasuredWidth()) {}
    for (;;)
    {
      i4 = i1;
      break;
      i1 = 0;
    }
  }
  
  @Deprecated
  public void setOnTabSelectedListener(b paramb)
  {
    if (this.v != null) {
      b(this.v);
    }
    this.v = paramb;
    if (paramb != null) {
      a(paramb);
    }
  }
  
  void setScrollAnimatorListener(Animator.AnimatorListener paramAnimatorListener)
  {
    f();
    this.y.addListener(paramAnimatorListener);
  }
  
  public void setSelectedTabIndicatorColor(int paramInt)
  {
    this.q.a(paramInt);
  }
  
  public void setSelectedTabIndicatorHeight(int paramInt)
  {
    this.q.b(paramInt);
  }
  
  public void setTabGravity(int paramInt)
  {
    if (this.k != paramInt)
    {
      this.k = paramInt;
      g();
    }
  }
  
  public void setTabMode(int paramInt)
  {
    if (paramInt != this.l)
    {
      this.l = paramInt;
      g();
    }
  }
  
  public void setTabTextColors(ColorStateList paramColorStateList)
  {
    if (this.f != paramColorStateList)
    {
      this.f = paramColorStateList;
      d();
    }
  }
  
  @Deprecated
  public void setTabsFromPagerAdapter(p paramp)
  {
    a(paramp, false);
  }
  
  public void setupWithViewPager(ViewPager paramViewPager)
  {
    a(paramViewPager, true);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return getTabScrollRange() > 0;
  }
  
  private class a
    implements ViewPager.d
  {
    private boolean b;
    
    a() {}
    
    public void a(ViewPager paramViewPager, p paramp1, p paramp2)
    {
      if (TabLayout.this.m == paramViewPager) {
        TabLayout.this.a(paramp2, this.b);
      }
    }
    
    void a(boolean paramBoolean)
    {
      this.b = paramBoolean;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(TabLayout.e parame);
    
    public abstract void b(TabLayout.e parame);
    
    public abstract void c(TabLayout.e parame);
  }
  
  private class c
    extends DataSetObserver
  {
    c() {}
    
    public void onChanged()
    {
      TabLayout.this.c();
    }
    
    public void onInvalidated()
    {
      TabLayout.this.c();
    }
  }
  
  private class d
    extends LinearLayout
  {
    int a = -1;
    float b;
    private int d;
    private final Paint e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private ValueAnimator i;
    
    d(Context paramContext)
    {
      super();
      setWillNotDraw(false);
      this.e = new Paint();
    }
    
    private void c()
    {
      View localView1 = getChildAt(this.a);
      int k;
      int j;
      if ((localView1 != null) && (localView1.getWidth() > 0))
      {
        k = localView1.getLeft();
        j = localView1.getRight();
        if ((this.b > 0.0F) && (this.a < -1 + getChildCount()))
        {
          View localView2 = getChildAt(1 + this.a);
          k = (int)(this.b * localView2.getLeft() + (1.0F - this.b) * k);
          j = (int)(this.b * localView2.getRight() + (1.0F - this.b) * j);
        }
      }
      for (;;)
      {
        a(k, j);
        return;
        j = -1;
        k = j;
      }
    }
    
    void a(int paramInt)
    {
      if (this.e.getColor() != paramInt)
      {
        this.e.setColor(paramInt);
        s.c(this);
      }
    }
    
    void a(int paramInt, float paramFloat)
    {
      if ((this.i != null) && (this.i.isRunning())) {
        this.i.cancel();
      }
      this.a = paramInt;
      this.b = paramFloat;
      c();
    }
    
    void a(int paramInt1, int paramInt2)
    {
      if ((paramInt1 != this.g) || (paramInt2 != this.h))
      {
        this.g = paramInt1;
        this.h = paramInt2;
        s.c(this);
      }
    }
    
    boolean a()
    {
      int j = getChildCount();
      for (int k = 0;; k++)
      {
        boolean bool = false;
        if (k < j)
        {
          if (getChildAt(k).getWidth() <= 0) {
            bool = true;
          }
        }
        else {
          return bool;
        }
      }
    }
    
    float b()
    {
      return this.a + this.b;
    }
    
    void b(int paramInt)
    {
      if (this.d != paramInt)
      {
        this.d = paramInt;
        s.c(this);
      }
    }
    
    void b(final int paramInt1, int paramInt2)
    {
      if ((this.i != null) && (this.i.isRunning())) {
        this.i.cancel();
      }
      int j;
      View localView;
      if (s.e(this) == 1)
      {
        j = 1;
        localView = getChildAt(paramInt1);
        if (localView != null) {
          break label56;
        }
        c();
      }
      for (;;)
      {
        return;
        j = 0;
        break;
        label56:
        final int k = localView.getLeft();
        final int m = localView.getRight();
        final int i2;
        final int i1;
        if (Math.abs(paramInt1 - this.a) <= 1)
        {
          i2 = this.g;
          i1 = this.h;
        }
        while ((i2 != k) || (i1 != m))
        {
          ValueAnimator localValueAnimator = new ValueAnimator();
          this.i = localValueAnimator;
          localValueAnimator.setInterpolator(a.b);
          localValueAnimator.setDuration(paramInt2);
          localValueAnimator.setFloatValues(new float[] { 0.0F, 1.0F });
          localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
          {
            public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
            {
              float f = paramAnonymousValueAnimator.getAnimatedFraction();
              TabLayout.d.this.a(a.a(i2, k, f), a.a(i1, m, f));
            }
          });
          localValueAnimator.addListener(new AnimatorListenerAdapter()
          {
            public void onAnimationEnd(Animator paramAnonymousAnimator)
            {
              TabLayout.d.this.a = paramInt1;
              TabLayout.d.this.b = 0.0F;
            }
          });
          localValueAnimator.start();
          return;
          int n = TabLayout.this.b(24);
          if (paramInt1 < this.a)
          {
            if (j != 0)
            {
              i1 = k - n;
              i2 = i1;
            }
            else
            {
              i1 = m + n;
              i2 = i1;
            }
          }
          else if (j != 0)
          {
            i1 = m + n;
            i2 = i1;
          }
          else
          {
            i1 = k - n;
            i2 = i1;
          }
        }
      }
    }
    
    public void draw(Canvas paramCanvas)
    {
      super.draw(paramCanvas);
      if ((this.g >= 0) && (this.h > this.g)) {
        paramCanvas.drawRect(this.g, getHeight() - this.d, this.h, getHeight(), this.e);
      }
    }
    
    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if ((this.i != null) && (this.i.isRunning()))
      {
        this.i.cancel();
        long l = this.i.getDuration();
        b(this.a, Math.round((1.0F - this.i.getAnimatedFraction()) * (float)l));
        return;
      }
      c();
    }
    
    protected void onMeasure(int paramInt1, int paramInt2)
    {
      int j = 0;
      super.onMeasure(paramInt1, paramInt2);
      if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
        break label17;
      }
      label17:
      while ((TabLayout.this.l != 1) || (TabLayout.this.k != 1)) {
        return;
      }
      int k = getChildCount();
      int m = 0;
      int n = 0;
      label52:
      View localView;
      if (m < k)
      {
        localView = getChildAt(m);
        if (localView.getVisibility() != 0) {
          break label234;
        }
      }
      label133:
      label217:
      label228:
      label234:
      for (int i4 = Math.max(n, localView.getMeasuredWidth());; i4 = n)
      {
        m++;
        n = i4;
        break label52;
        if (n <= 0) {
          break;
        }
        int i1 = TabLayout.this.b(16);
        int i2;
        if (n * k <= getMeasuredWidth() - i1 * 2)
        {
          i2 = 0;
          if (i2 >= k) {
            break label217;
          }
          LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)getChildAt(i2).getLayoutParams();
          if ((localLayoutParams.width == n) && (localLayoutParams.weight == 0.0F)) {
            break label228;
          }
          localLayoutParams.width = n;
          localLayoutParams.weight = 0.0F;
        }
        for (int i3 = 1;; i3 = j)
        {
          i2++;
          j = i3;
          break label133;
          TabLayout.this.k = 0;
          TabLayout.this.a(false);
          j = 1;
          if (j == 0) {
            break;
          }
          super.onMeasure(paramInt1, paramInt2);
          return;
        }
      }
    }
    
    public void onRtlPropertiesChanged(int paramInt)
    {
      super.onRtlPropertiesChanged(paramInt);
      if ((Build.VERSION.SDK_INT < 23) && (this.f != paramInt))
      {
        requestLayout();
        this.f = paramInt;
      }
    }
  }
  
  public static final class e
  {
    TabLayout a;
    TabLayout.g b;
    private Object c;
    private Drawable d;
    private CharSequence e;
    private CharSequence f;
    private int g = -1;
    private View h;
    
    public e a(int paramInt)
    {
      return a(LayoutInflater.from(this.b.getContext()).inflate(paramInt, this.b, false));
    }
    
    public e a(Drawable paramDrawable)
    {
      this.d = paramDrawable;
      h();
      return this;
    }
    
    public e a(View paramView)
    {
      this.h = paramView;
      h();
      return this;
    }
    
    public e a(CharSequence paramCharSequence)
    {
      this.e = paramCharSequence;
      h();
      return this;
    }
    
    public View a()
    {
      return this.h;
    }
    
    public Drawable b()
    {
      return this.d;
    }
    
    public e b(CharSequence paramCharSequence)
    {
      this.f = paramCharSequence;
      h();
      return this;
    }
    
    void b(int paramInt)
    {
      this.g = paramInt;
    }
    
    public int c()
    {
      return this.g;
    }
    
    public CharSequence d()
    {
      return this.e;
    }
    
    public void e()
    {
      if (this.a == null) {
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
      }
      this.a.b(this);
    }
    
    public boolean f()
    {
      if (this.a == null) {
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
      }
      return this.a.getSelectedTabPosition() == this.g;
    }
    
    public CharSequence g()
    {
      return this.f;
    }
    
    void h()
    {
      if (this.b != null) {
        this.b.b();
      }
    }
    
    void i()
    {
      this.a = null;
      this.b = null;
      this.c = null;
      this.d = null;
      this.e = null;
      this.f = null;
      this.g = -1;
      this.h = null;
    }
  }
  
  public static class f
    implements ViewPager.e
  {
    private final WeakReference<TabLayout> a;
    private int b;
    private int c;
    
    public f(TabLayout paramTabLayout)
    {
      this.a = new WeakReference(paramTabLayout);
    }
    
    void a()
    {
      this.c = 0;
      this.b = 0;
    }
    
    public void a(int paramInt)
    {
      this.b = this.c;
      this.c = paramInt;
    }
    
    public void a(int paramInt1, float paramFloat, int paramInt2)
    {
      TabLayout localTabLayout = (TabLayout)this.a.get();
      if (localTabLayout != null) {
        if ((this.c == 2) && (this.b != 1)) {
          break label73;
        }
      }
      label73:
      for (boolean bool1 = true;; bool1 = false)
      {
        boolean bool2;
        if (this.c == 2)
        {
          int i = this.b;
          bool2 = false;
          if (i == 0) {}
        }
        else
        {
          bool2 = true;
        }
        localTabLayout.a(paramInt1, paramFloat, bool1, bool2);
        return;
      }
    }
    
    public void b(int paramInt)
    {
      TabLayout localTabLayout = (TabLayout)this.a.get();
      if ((localTabLayout != null) && (localTabLayout.getSelectedTabPosition() != paramInt) && (paramInt < localTabLayout.getTabCount())) {
        if ((this.c != 0) && ((this.c != 2) || (this.b != 0))) {
          break label66;
        }
      }
      label66:
      for (boolean bool = true;; bool = false)
      {
        localTabLayout.b(localTabLayout.a(paramInt), bool);
        return;
      }
    }
  }
  
  class g
    extends LinearLayout
  {
    private TabLayout.e b;
    private TextView c;
    private ImageView d;
    private View e;
    private TextView f;
    private ImageView g;
    private int h = 2;
    
    public g(Context paramContext)
    {
      super();
      if (TabLayout.this.i != 0) {
        s.a(this, b.b(paramContext, TabLayout.this.i));
      }
      s.b(this, TabLayout.this.a, TabLayout.this.b, TabLayout.this.c, TabLayout.this.d);
      setGravity(17);
      setOrientation(1);
      setClickable(true);
      s.a(this, q.a(getContext(), 1002));
    }
    
    private float a(Layout paramLayout, int paramInt, float paramFloat)
    {
      return paramLayout.getLineWidth(paramInt) * (paramFloat / paramLayout.getPaint().getTextSize());
    }
    
    private void a(TextView paramTextView, ImageView paramImageView)
    {
      Drawable localDrawable;
      CharSequence localCharSequence1;
      label31:
      CharSequence localCharSequence2;
      label47:
      label70:
      int i;
      label87:
      label112:
      ViewGroup.MarginLayoutParams localMarginLayoutParams;
      if (this.b != null)
      {
        localDrawable = this.b.b();
        if (this.b == null) {
          break label195;
        }
        localCharSequence1 = this.b.d();
        if (this.b == null) {
          break label201;
        }
        localCharSequence2 = this.b.g();
        if (paramImageView != null)
        {
          if (localDrawable == null) {
            break label207;
          }
          paramImageView.setImageDrawable(localDrawable);
          paramImageView.setVisibility(0);
          setVisibility(0);
          paramImageView.setContentDescription(localCharSequence2);
        }
        if (TextUtils.isEmpty(localCharSequence1)) {
          break label221;
        }
        i = 1;
        if (paramTextView != null)
        {
          if (i == 0) {
            break label227;
          }
          paramTextView.setText(localCharSequence1);
          paramTextView.setVisibility(0);
          setVisibility(0);
          paramTextView.setContentDescription(localCharSequence2);
        }
        if (paramImageView != null)
        {
          localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramImageView.getLayoutParams();
          if ((i == 0) || (paramImageView.getVisibility() != 0)) {
            break label248;
          }
        }
      }
      label195:
      label201:
      label207:
      label221:
      label227:
      label248:
      for (int j = TabLayout.this.b(8);; j = 0)
      {
        if (j != localMarginLayoutParams.bottomMargin)
        {
          localMarginLayoutParams.bottomMargin = j;
          paramImageView.requestLayout();
        }
        CharSequence localCharSequence3 = null;
        if (i != 0) {}
        for (;;)
        {
          TooltipCompat.setTooltipText(this, localCharSequence3);
          return;
          localDrawable = null;
          break;
          localCharSequence1 = null;
          break label31;
          localCharSequence2 = null;
          break label47;
          paramImageView.setVisibility(8);
          paramImageView.setImageDrawable(null);
          break label70;
          i = 0;
          break label87;
          paramTextView.setVisibility(8);
          paramTextView.setText(null);
          break label112;
          localCharSequence3 = localCharSequence2;
        }
      }
    }
    
    void a()
    {
      a(null);
      setSelected(false);
    }
    
    void a(TabLayout.e parame)
    {
      if (parame != this.b)
      {
        this.b = parame;
        b();
      }
    }
    
    final void b()
    {
      TabLayout.e locale = this.b;
      View localView;
      if (locale != null)
      {
        localView = locale.a();
        if (localView == null) {
          break label309;
        }
        ViewParent localViewParent = localView.getParent();
        if (localViewParent != this)
        {
          if (localViewParent != null) {
            ((ViewGroup)localViewParent).removeView(localView);
          }
          addView(localView);
        }
        this.e = localView;
        if (this.c != null) {
          this.c.setVisibility(8);
        }
        if (this.d != null)
        {
          this.d.setVisibility(8);
          this.d.setImageDrawable(null);
        }
        this.f = ((TextView)localView.findViewById(16908308));
        if (this.f != null) {
          this.h = o.a(this.f);
        }
        this.g = ((ImageView)localView.findViewById(16908294));
        label138:
        if (this.e != null) {
          break label342;
        }
        if (this.d == null)
        {
          ImageView localImageView = (ImageView)LayoutInflater.from(getContext()).inflate(a.h.design_layout_tab_icon, this, false);
          addView(localImageView, 0);
          this.d = localImageView;
        }
        if (this.c == null)
        {
          TextView localTextView = (TextView)LayoutInflater.from(getContext()).inflate(a.h.design_layout_tab_text, this, false);
          addView(localTextView);
          this.c = localTextView;
          this.h = o.a(this.c);
        }
        o.a(this.c, TabLayout.this.e);
        if (TabLayout.this.f != null) {
          this.c.setTextColor(TabLayout.this.f);
        }
        a(this.c, this.d);
        label285:
        if ((locale == null) || (!locale.f())) {
          break label371;
        }
      }
      label309:
      label342:
      label371:
      for (boolean bool = true;; bool = false)
      {
        setSelected(bool);
        return;
        localView = null;
        break;
        if (this.e != null)
        {
          removeView(this.e);
          this.e = null;
        }
        this.f = null;
        this.g = null;
        break label138;
        if ((this.f == null) && (this.g == null)) {
          break label285;
        }
        a(this.f, this.g);
        break label285;
      }
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ActionBar.b.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
    }
    
    public void onMeasure(int paramInt1, int paramInt2)
    {
      int i = 1;
      int j = View.MeasureSpec.getSize(paramInt1);
      int k = View.MeasureSpec.getMode(paramInt1);
      int m = TabLayout.this.getTabMaxWidth();
      if ((m > 0) && ((k == 0) || (j > m))) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.j, -2147483648);
      }
      super.onMeasure(paramInt1, paramInt2);
      float f1;
      int n;
      if (this.c != null)
      {
        getResources();
        f1 = TabLayout.this.g;
        n = this.h;
        if ((this.d == null) || (this.d.getVisibility() != 0)) {
          break label253;
        }
        n = i;
      }
      for (;;)
      {
        float f2 = this.c.getTextSize();
        int i1 = this.c.getLineCount();
        int i2 = o.a(this.c);
        if ((f1 != f2) || ((i2 >= 0) && (n != i2)))
        {
          if ((TabLayout.this.l == i) && (f1 > f2) && (i1 == i))
          {
            Layout localLayout = this.c.getLayout();
            if ((localLayout == null) || (a(localLayout, 0, f1) > getMeasuredWidth() - getPaddingLeft() - getPaddingRight())) {
              i = 0;
            }
          }
          if (i != 0)
          {
            this.c.setTextSize(0, f1);
            this.c.setMaxLines(n);
            super.onMeasure(paramInt1, paramInt2);
          }
        }
        return;
        label253:
        if ((this.c != null) && (this.c.getLineCount() > i)) {
          f1 = TabLayout.this.h;
        }
      }
    }
    
    public boolean performClick()
    {
      boolean bool = super.performClick();
      if (this.b != null)
      {
        if (!bool) {
          playSoundEffect(0);
        }
        this.b.e();
        bool = true;
      }
      return bool;
    }
    
    public void setSelected(boolean paramBoolean)
    {
      if (isSelected() != paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        super.setSelected(paramBoolean);
        if ((i != 0) && (paramBoolean) && (Build.VERSION.SDK_INT < 16)) {
          sendAccessibilityEvent(4);
        }
        if (this.c != null) {
          this.c.setSelected(paramBoolean);
        }
        if (this.d != null) {
          this.d.setSelected(paramBoolean);
        }
        if (this.e != null) {
          this.e.setSelected(paramBoolean);
        }
        return;
      }
    }
  }
  
  public static class h
    implements TabLayout.b
  {
    private final ViewPager a;
    
    public h(ViewPager paramViewPager)
    {
      this.a = paramViewPager;
    }
    
    public void a(TabLayout.e parame)
    {
      this.a.setCurrentItem(parame.c());
    }
    
    public void b(TabLayout.e parame) {}
    
    public void c(TabLayout.e parame) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout
 * JD-Core Version:    0.7.0.1
 */