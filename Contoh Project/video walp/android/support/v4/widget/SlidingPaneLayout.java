package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.a.b;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout
  extends ViewGroup
{
  static final e h = new f();
  View a;
  float b;
  int c;
  boolean d;
  final r e;
  boolean f;
  final ArrayList<b> g = new ArrayList();
  private int i = -858993460;
  private int j;
  private Drawable k;
  private Drawable l;
  private final int m;
  private boolean n;
  private float o;
  private int p;
  private float q;
  private float r;
  private d s;
  private boolean t = true;
  private final Rect u = new Rect();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      h = new h();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      h = new g();
      return;
    }
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.m = ((int)(0.5F + 32.0F * f1));
    setWillNotDraw(false);
    s.a(this, new a());
    s.a(this, 1);
    this.e = r.a(this, 0.5F, new c());
    this.e.a(f1 * 400.0F);
  }
  
  private void a(float paramFloat)
  {
    boolean bool = f();
    LayoutParams localLayoutParams = (LayoutParams)this.a.getLayoutParams();
    int i6;
    int i1;
    label41:
    int i3;
    label50:
    View localView;
    if (localLayoutParams.c) {
      if (bool)
      {
        i6 = localLayoutParams.rightMargin;
        if (i6 > 0) {
          break label89;
        }
        i1 = 1;
        int i2 = getChildCount();
        i3 = 0;
        if (i3 >= i2) {
          return;
        }
        localView = getChildAt(i3);
        if (localView != this.a) {
          break label95;
        }
      }
    }
    label89:
    label95:
    do
    {
      i3++;
      break label50;
      i6 = localLayoutParams.leftMargin;
      break;
      i1 = 0;
      break label41;
      int i4 = (int)((1.0F - this.o) * this.p);
      this.o = paramFloat;
      int i5 = i4 - (int)((1.0F - paramFloat) * this.p);
      if (bool) {
        i5 = -i5;
      }
      localView.offsetLeftAndRight(i5);
    } while (i1 == 0);
    if (bool) {}
    for (float f1 = this.o - 1.0F;; f1 = 1.0F - this.o)
    {
      a(localView, f1, this.j);
      break;
    }
  }
  
  private void a(View paramView, float paramFloat, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i1 = (int)(paramFloat * ((0xFF000000 & paramInt) >>> 24)) << 24 | 0xFFFFFF & paramInt;
      if (localLayoutParams.d == null) {
        localLayoutParams.d = new Paint();
      }
      localLayoutParams.d.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.SRC_OVER));
      if (paramView.getLayerType() != 2) {
        paramView.setLayerType(2, localLayoutParams.d);
      }
      e(paramView);
    }
    while (paramView.getLayerType() == 0)
    {
      int i1;
      return;
    }
    if (localLayoutParams.d != null) {
      localLayoutParams.d.setColorFilter(null);
    }
    b localb = new b(paramView);
    this.g.add(localb);
    s.a(this, localb);
  }
  
  private boolean a(View paramView, int paramInt)
  {
    boolean bool1;
    if (!this.t)
    {
      boolean bool2 = a(0.0F, paramInt);
      bool1 = false;
      if (!bool2) {}
    }
    else
    {
      this.f = false;
      bool1 = true;
    }
    return bool1;
  }
  
  private boolean b(View paramView, int paramInt)
  {
    if ((this.t) || (a(1.0F, paramInt)))
    {
      this.f = true;
      return true;
    }
    return false;
  }
  
  private static boolean g(View paramView)
  {
    if (paramView.isOpaque()) {}
    Drawable localDrawable;
    do
    {
      return true;
      if (Build.VERSION.SDK_INT >= 18) {
        return false;
      }
      localDrawable = paramView.getBackground();
      if (localDrawable == null) {
        break;
      }
    } while (localDrawable.getOpacity() == -1);
    return false;
    return false;
  }
  
  void a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 4) {
        localView.setVisibility(0);
      }
    }
  }
  
  void a(int paramInt)
  {
    if (this.a == null)
    {
      this.b = 0.0F;
      return;
    }
    boolean bool = f();
    LayoutParams localLayoutParams = (LayoutParams)this.a.getLayoutParams();
    int i1 = this.a.getWidth();
    if (bool) {
      paramInt = getWidth() - paramInt - i1;
    }
    int i2;
    if (bool)
    {
      i2 = getPaddingRight();
      if (!bool) {
        break label146;
      }
    }
    label146:
    for (int i3 = localLayoutParams.rightMargin;; i3 = localLayoutParams.leftMargin)
    {
      this.b = ((paramInt - (i3 + i2)) / this.c);
      if (this.p != 0) {
        a(this.b);
      }
      if (localLayoutParams.c) {
        a(this.a, this.b, this.i);
      }
      a(this.a);
      return;
      i2 = getPaddingLeft();
      break;
    }
  }
  
  void a(View paramView)
  {
    if (this.s != null) {
      this.s.a(paramView, this.b);
    }
  }
  
  boolean a(float paramFloat, int paramInt)
  {
    if (!this.n) {
      return false;
    }
    boolean bool = f();
    LayoutParams localLayoutParams = (LayoutParams)this.a.getLayoutParams();
    int i2;
    int i3;
    if (bool)
    {
      i2 = getPaddingRight() + localLayoutParams.rightMargin;
      i3 = this.a.getWidth();
    }
    for (int i1 = (int)(getWidth() - (i2 + paramFloat * this.c + i3)); this.e.a(this.a, i1, this.a.getTop()); i1 = (int)(getPaddingLeft() + localLayoutParams.leftMargin + paramFloat * this.c))
    {
      a();
      s.c(this);
      return true;
    }
    return false;
  }
  
  void b(View paramView)
  {
    if (this.s != null) {
      this.s.a(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  public boolean b()
  {
    return b(this.a, 0);
  }
  
  void c(View paramView)
  {
    if (this.s != null) {
      this.s.b(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  public boolean c()
  {
    return a(this.a, 0);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    if (this.e.a(true))
    {
      if (!this.n) {
        this.e.f();
      }
    }
    else {
      return;
    }
    s.c(this);
  }
  
  void d(View paramView)
  {
    boolean bool = f();
    int i1;
    int i2;
    label29:
    int i3;
    int i4;
    int i8;
    int i7;
    int i6;
    int i5;
    label81:
    int i9;
    if (bool)
    {
      i1 = getWidth() - getPaddingRight();
      if (!bool) {
        break label120;
      }
      i2 = getPaddingLeft();
      i3 = getPaddingTop();
      i4 = getHeight() - getPaddingBottom();
      if ((paramView == null) || (!g(paramView))) {
        break label134;
      }
      i8 = paramView.getLeft();
      i7 = paramView.getRight();
      i6 = paramView.getTop();
      i5 = paramView.getBottom();
      i9 = getChildCount();
    }
    View localView;
    for (int i10 = 0;; i10++)
    {
      if (i10 < i9)
      {
        localView = getChildAt(i10);
        if (localView != paramView) {}
      }
      else
      {
        return;
        i1 = getPaddingLeft();
        break;
        label120:
        i2 = getWidth() - getPaddingRight();
        break label29;
        label134:
        i5 = 0;
        i6 = 0;
        i7 = 0;
        i8 = 0;
        break label81;
      }
      if (localView.getVisibility() != 8) {
        break label165;
      }
    }
    label165:
    int i11;
    label173:
    int i14;
    if (bool)
    {
      i11 = i2;
      int i12 = Math.max(i11, localView.getLeft());
      int i13 = Math.max(i3, localView.getTop());
      if (!bool) {
        break label275;
      }
      i14 = i1;
      label204:
      int i15 = Math.min(i14, localView.getRight());
      int i16 = Math.min(i4, localView.getBottom());
      if ((i12 < i8) || (i13 < i6) || (i15 > i7) || (i16 > i5)) {
        break label282;
      }
    }
    label275:
    label282:
    for (int i17 = 4;; i17 = 0)
    {
      localView.setVisibility(i17);
      break;
      i11 = i1;
      break label173;
      i14 = i2;
      break label204;
    }
  }
  
  public boolean d()
  {
    return (!this.n) || (this.b == 1.0F);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (f())
    {
      localDrawable = this.l;
      if (getChildCount() <= 1) {
        break label48;
      }
    }
    label48:
    for (View localView = getChildAt(1);; localView = null)
    {
      if ((localView != null) && (localDrawable != null)) {
        break label53;
      }
      return;
      localDrawable = this.k;
      break;
    }
    label53:
    int i1 = localView.getTop();
    int i2 = localView.getBottom();
    int i3 = localDrawable.getIntrinsicWidth();
    int i5;
    int i4;
    if (f())
    {
      i5 = localView.getRight();
      i4 = i5 + i3;
    }
    for (;;)
    {
      localDrawable.setBounds(i5, i1, i4, i2);
      localDrawable.draw(paramCanvas);
      return;
      i4 = localView.getLeft();
      i5 = i4 - i3;
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i1 = paramCanvas.save();
    if ((this.n) && (!localLayoutParams.b) && (this.a != null))
    {
      paramCanvas.getClipBounds(this.u);
      if (!f()) {
        break label104;
      }
      this.u.left = Math.max(this.u.left, this.a.getRight());
    }
    for (;;)
    {
      paramCanvas.clipRect(this.u);
      boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i1);
      return bool;
      label104:
      this.u.right = Math.min(this.u.right, this.a.getLeft());
    }
  }
  
  void e(View paramView)
  {
    h.a(this, paramView);
  }
  
  public boolean e()
  {
    return this.n;
  }
  
  boolean f()
  {
    return s.e(this) == 1;
  }
  
  boolean f(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((this.n) && (localLayoutParams.c) && (this.b > 0.0F)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public int getCoveredFadeColor()
  {
    return this.j;
  }
  
  public int getParallaxDistance()
  {
    return this.p;
  }
  
  public int getSliderFadeColor()
  {
    return this.i;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.t = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.t = true;
    int i1 = this.g.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((b)this.g.get(i2)).run();
    }
    this.g.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if ((!this.n) && (i1 == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null) {
        if (this.e.b(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
          break label100;
        }
      }
    }
    boolean bool1;
    label100:
    for (boolean bool2 = true;; bool2 = false)
    {
      this.f = bool2;
      if ((this.n) && ((!this.d) || (i1 == 0))) {
        break;
      }
      this.e.e();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i1 == 3) || (i1 == 1))
    {
      this.e.e();
      return false;
    }
    switch (i1)
    {
    }
    label152:
    float f3;
    float f4;
    do
    {
      for (int i2 = 0;; i2 = 1)
      {
        if (!this.e.a(paramMotionEvent))
        {
          bool1 = false;
          if (i2 == 0) {
            break;
          }
        }
        return true;
        this.d = false;
        float f5 = paramMotionEvent.getX();
        float f6 = paramMotionEvent.getY();
        this.q = f5;
        this.r = f6;
        if ((!this.e.b(this.a, (int)f5, (int)f6)) || (!f(this.a))) {
          break label152;
        }
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      f3 = Math.abs(f1 - this.q);
      f4 = Math.abs(f2 - this.r);
    } while ((f3 <= this.e.d()) || (f4 <= f3));
    this.e.e();
    this.d = true;
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = f();
    int i1;
    int i2;
    label36:
    int i3;
    label47:
    int i4;
    int i5;
    if (bool1)
    {
      this.e.a(2);
      i1 = paramInt3 - paramInt1;
      if (!bool1) {
        break label154;
      }
      i2 = getPaddingRight();
      if (!bool1) {
        break label163;
      }
      i3 = getPaddingLeft();
      i4 = getPaddingTop();
      i5 = getChildCount();
      if (this.t) {
        if ((!this.n) || (!this.f)) {
          break label172;
        }
      }
    }
    int i7;
    View localView;
    int i14;
    int i15;
    label154:
    label163:
    label172:
    for (float f1 = 1.0F;; f1 = 0.0F)
    {
      this.b = f1;
      int i6 = 0;
      for (i7 = i2;; i7 = i15)
      {
        if (i6 >= i5) {
          break label462;
        }
        localView = getChildAt(i6);
        if (localView.getVisibility() != 8) {
          break;
        }
        i14 = i2;
        i15 = i7;
        i6++;
        i2 = i14;
      }
      this.e.a(1);
      break;
      i2 = getPaddingLeft();
      break label36;
      i3 = getPaddingRight();
      break label47;
    }
    LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
    int i9 = localView.getMeasuredWidth();
    int i18;
    label257:
    boolean bool2;
    label281:
    int i10;
    int i11;
    label325:
    int i13;
    int i12;
    if (localLayoutParams.b)
    {
      int i16 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      int i17 = Math.min(i2, i1 - i3 - this.m) - i7 - i16;
      this.c = i17;
      if (bool1)
      {
        i18 = localLayoutParams.rightMargin;
        if (i17 + (i7 + i18) + i9 / 2 <= i1 - i3) {
          break label393;
        }
        bool2 = true;
        localLayoutParams.c = bool2;
        int i19 = (int)(i17 * this.b);
        i10 = i7 + (i18 + i19);
        this.b = (i19 / this.c);
        i11 = 0;
        if (!bool1) {
          break label445;
        }
        i13 = i11 + (i1 - i10);
        i12 = i13 - i9;
      }
    }
    for (;;)
    {
      localView.layout(i12, i4, i13, i4 + localView.getMeasuredHeight());
      i14 = i2 + localView.getWidth();
      i15 = i10;
      break;
      i18 = localLayoutParams.leftMargin;
      break label257;
      label393:
      bool2 = false;
      break label281;
      if ((this.n) && (this.p != 0))
      {
        i11 = (int)((1.0F - this.b) * this.p);
        i10 = i2;
        break label325;
      }
      i10 = i2;
      i11 = 0;
      break label325;
      label445:
      i12 = i10 - i11;
      i13 = i12 + i9;
    }
    label462:
    if (this.t)
    {
      if (!this.n) {
        break label537;
      }
      if (this.p != 0) {
        a(this.b);
      }
      if (((LayoutParams)this.a.getLayoutParams()).c) {
        a(this.a, this.b, this.i);
      }
    }
    for (;;)
    {
      d(this.a);
      this.t = false;
      return;
      label537:
      for (int i8 = 0; i8 < i5; i8++) {
        a(getChildAt(i8), 0.0F, this.i);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    int i7;
    if (i1 != 1073741824) {
      if (isInEditMode()) {
        if (i1 == -2147483648)
        {
          i5 = i3;
          i6 = i2;
          i7 = i4;
        }
      }
    }
    for (;;)
    {
      int i9;
      int i8;
      label90:
      boolean bool1;
      int i10;
      int i11;
      int i12;
      int i13;
      int i14;
      float f1;
      label148:
      View localView2;
      LayoutParams localLayoutParams2;
      int i30;
      float f3;
      int i31;
      switch (i5)
      {
      default: 
        i9 = 0;
        i8 = 0;
        bool1 = false;
        i10 = i6 - getPaddingLeft() - getPaddingRight();
        i11 = getChildCount();
        if (i11 > 2) {
          Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.a = null;
        i12 = 0;
        i13 = i10;
        i14 = i9;
        f1 = 0.0F;
        if (i12 >= i11) {
          break label645;
        }
        localView2 = getChildAt(i12);
        localLayoutParams2 = (LayoutParams)localView2.getLayoutParams();
        if (localView2.getVisibility() == 8)
        {
          localLayoutParams2.c = false;
          i30 = i13;
          f3 = f1;
          i31 = i14;
        }
        break;
      }
      for (boolean bool4 = bool1;; bool4 = bool1)
      {
        i12++;
        bool1 = bool4;
        i14 = i31;
        f1 = f3;
        i13 = i30;
        break label148;
        if (i1 != 0) {
          break label1130;
        }
        i5 = i3;
        i6 = 300;
        i7 = i4;
        break;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (i3 != 0) {
          break label1130;
        }
        if (isInEditMode())
        {
          if (i3 != 0) {
            break label1130;
          }
          i5 = -2147483648;
          i6 = i2;
          i7 = 300;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        i9 = i7 - getPaddingTop() - getPaddingBottom();
        i8 = i9;
        break label90;
        i8 = i7 - getPaddingTop() - getPaddingBottom();
        i9 = 0;
        break label90;
        if (localLayoutParams2.a <= 0.0F) {
          break label391;
        }
        f1 += localLayoutParams2.a;
        if (localLayoutParams2.width != 0) {
          break label391;
        }
        i30 = i13;
        f3 = f1;
        i31 = i14;
      }
      label391:
      int i24 = localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
      int i25;
      label427:
      int i26;
      label447:
      int i29;
      if (localLayoutParams2.width == -2)
      {
        i25 = View.MeasureSpec.makeMeasureSpec(i10 - i24, -2147483648);
        if (localLayoutParams2.height != -2) {
          break label601;
        }
        i26 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
        localView2.measure(i25, i26);
        int i27 = localView2.getMeasuredWidth();
        int i28 = localView2.getMeasuredHeight();
        if ((i5 == -2147483648) && (i28 > i14)) {
          i14 = Math.min(i28, i8);
        }
        i29 = i13 - i27;
        if (i29 >= 0) {
          break label639;
        }
      }
      label601:
      label639:
      for (boolean bool2 = true;; bool2 = false)
      {
        localLayoutParams2.b = bool2;
        boolean bool3 = bool2 | bool1;
        if (localLayoutParams2.b) {
          this.a = localView2;
        }
        i30 = i29;
        i31 = i14;
        float f2 = f1;
        bool4 = bool3;
        f3 = f2;
        break;
        if (localLayoutParams2.width == -1)
        {
          i25 = View.MeasureSpec.makeMeasureSpec(i10 - i24, 1073741824);
          break label427;
        }
        i25 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
        break label427;
        if (localLayoutParams2.height == -1)
        {
          i26 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
          break label447;
        }
        i26 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.height, 1073741824);
        break label447;
      }
      label645:
      if ((bool1) || (f1 > 0.0F))
      {
        int i15 = i10 - this.m;
        int i16 = 0;
        if (i16 < i11)
        {
          View localView1 = getChildAt(i16);
          if (localView1.getVisibility() == 8) {}
          for (;;)
          {
            i16++;
            break;
            LayoutParams localLayoutParams1 = (LayoutParams)localView1.getLayoutParams();
            if (localView1.getVisibility() != 8)
            {
              int i17;
              label741:
              int i18;
              label749:
              int i23;
              if ((localLayoutParams1.width == 0) && (localLayoutParams1.a > 0.0F))
              {
                i17 = 1;
                if (i17 == 0) {
                  break label837;
                }
                i18 = 0;
                if ((!bool1) || (localView1 == this.a)) {
                  break label901;
                }
                if ((localLayoutParams1.width >= 0) || ((i18 <= i15) && (localLayoutParams1.a <= 0.0F))) {
                  continue;
                }
                if (i17 == 0) {
                  break label885;
                }
                if (localLayoutParams1.height != -2) {
                  break label847;
                }
                i23 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
              }
              for (;;)
              {
                localView1.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), i23);
                break;
                i17 = 0;
                break label741;
                label837:
                i18 = localView1.getMeasuredWidth();
                break label749;
                label847:
                if (localLayoutParams1.height == -1)
                {
                  i23 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                }
                else
                {
                  i23 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                  continue;
                  label885:
                  i23 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                }
              }
              label901:
              if (localLayoutParams1.a > 0.0F)
              {
                int i19;
                if (localLayoutParams1.width == 0) {
                  if (localLayoutParams1.height == -2) {
                    i19 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                  }
                }
                for (;;)
                {
                  if (!bool1) {
                    break label1043;
                  }
                  int i21 = i10 - (localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
                  int i22 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                  if (i18 == i21) {
                    break;
                  }
                  localView1.measure(i22, i19);
                  break;
                  if (localLayoutParams1.height == -1)
                  {
                    i19 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                  }
                  else
                  {
                    i19 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                    continue;
                    i19 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                  }
                }
                label1043:
                int i20 = Math.max(0, i13);
                localView1.measure(View.MeasureSpec.makeMeasureSpec(i18 + (int)(localLayoutParams1.a * i20 / f1), 1073741824), i19);
              }
            }
          }
        }
      }
      setMeasuredDimension(i6, i14 + getPaddingTop() + getPaddingBottom());
      this.n = bool1;
      if ((this.e.a() != 0) && (!bool1)) {
        this.e.f();
      }
      return;
      label1130:
      i5 = i3;
      i6 = i2;
      i7 = i4;
    }
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
    if (localSavedState.a) {
      b();
    }
    for (;;)
    {
      this.f = localSavedState.a;
      return;
      c();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if (e()) {}
    for (boolean bool = d();; bool = this.f)
    {
      localSavedState.a = bool;
      return localSavedState;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      this.t = true;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (!this.n) {
      bool = super.onTouchEvent(paramMotionEvent);
    }
    float f1;
    float f2;
    float f3;
    float f4;
    int i1;
    do
    {
      do
      {
        return bool;
        this.e.b(paramMotionEvent);
        bool = true;
        switch (paramMotionEvent.getActionMasked())
        {
        default: 
          return bool;
        case 0: 
          float f5 = paramMotionEvent.getX();
          float f6 = paramMotionEvent.getY();
          this.q = f5;
          this.r = f6;
          return bool;
        }
      } while (!f(this.a));
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      f3 = f1 - this.q;
      f4 = f2 - this.r;
      i1 = this.e.d();
    } while ((f3 * f3 + f4 * f4 >= i1 * i1) || (!this.e.b(this.a, (int)f1, (int)f2)));
    a(this.a, 0);
    return bool;
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.n)) {
      if (paramView1 != this.a) {
        break label36;
      }
    }
    label36:
    for (boolean bool = true;; bool = false)
    {
      this.f = bool;
      return;
    }
  }
  
  public void setCoveredFadeColor(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void setPanelSlideListener(d paramd)
  {
    this.s = paramd;
  }
  
  public void setParallaxDistance(int paramInt)
  {
    this.p = paramInt;
    requestLayout();
  }
  
  @Deprecated
  public void setShadowDrawable(Drawable paramDrawable)
  {
    setShadowDrawableLeft(paramDrawable);
  }
  
  public void setShadowDrawableLeft(Drawable paramDrawable)
  {
    this.k = paramDrawable;
  }
  
  public void setShadowDrawableRight(Drawable paramDrawable)
  {
    this.l = paramDrawable;
  }
  
  @Deprecated
  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setShadowResourceLeft(int paramInt)
  {
    setShadowDrawableLeft(android.support.v4.content.a.getDrawable(getContext(), paramInt));
  }
  
  public void setShadowResourceRight(int paramInt)
  {
    setShadowDrawableRight(android.support.v4.content.a.getDrawable(getContext(), paramInt));
  }
  
  public void setSliderFadeColor(int paramInt)
  {
    this.i = paramInt;
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    private static final int[] e = { 16843137 };
    public float a = 0.0F;
    boolean b;
    boolean c;
    Paint d;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e);
      this.a = localTypedArray.getFloat(0, 0.0F);
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
  }
  
  static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public SlidingPaneLayout.SavedState a(Parcel paramAnonymousParcel)
      {
        return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public SlidingPaneLayout.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public SlidingPaneLayout.SavedState[] a(int paramAnonymousInt)
      {
        return new SlidingPaneLayout.SavedState[paramAnonymousInt];
      }
    };
    boolean a;
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      if (paramParcel.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.a = bool;
        return;
      }
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      if (this.a) {}
      for (int i = 1;; i = 0)
      {
        paramParcel.writeInt(i);
        return;
      }
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
      paramb1.b(paramb2.c());
    }
    
    public boolean a(View paramView)
    {
      return SlidingPaneLayout.this.f(paramView);
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
    {
      b localb = b.a(paramb);
      super.onInitializeAccessibilityNodeInfo(paramView, localb);
      a(paramb, localb);
      localb.t();
      paramb.b(SlidingPaneLayout.class.getName());
      paramb.a(paramView);
      ViewParent localViewParent = s.f(paramView);
      if ((localViewParent instanceof View)) {
        paramb.c((View)localViewParent);
      }
      int i = SlidingPaneLayout.this.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = SlidingPaneLayout.this.getChildAt(j);
        if ((!a(localView)) && (localView.getVisibility() == 0))
        {
          s.a(localView, 1);
          paramb.b(localView);
        }
      }
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (!a(paramView)) {
        return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
  }
  
  private class b
    implements Runnable
  {
    final View a;
    
    b(View paramView)
    {
      this.a = paramView;
    }
    
    public void run()
    {
      if (this.a.getParent() == SlidingPaneLayout.this)
      {
        this.a.setLayerType(0, null);
        SlidingPaneLayout.this.e(this.a);
      }
      SlidingPaneLayout.this.g.remove(this);
    }
  }
  
  private class c
    extends r.a
  {
    c() {}
    
    public int a(View paramView, int paramInt1, int paramInt2)
    {
      return paramView.getTop();
    }
    
    public void a(int paramInt)
    {
      if (SlidingPaneLayout.this.e.a() == 0)
      {
        if (SlidingPaneLayout.this.b == 0.0F)
        {
          SlidingPaneLayout.this.d(SlidingPaneLayout.this.a);
          SlidingPaneLayout.this.c(SlidingPaneLayout.this.a);
          SlidingPaneLayout.this.f = false;
        }
      }
      else {
        return;
      }
      SlidingPaneLayout.this.b(SlidingPaneLayout.this.a);
      SlidingPaneLayout.this.f = true;
    }
    
    public void a(View paramView, float paramFloat1, float paramFloat2)
    {
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
      int i;
      if (SlidingPaneLayout.this.f())
      {
        int j = SlidingPaneLayout.this.getPaddingRight() + localLayoutParams.rightMargin;
        if ((paramFloat1 < 0.0F) || ((paramFloat1 == 0.0F) && (SlidingPaneLayout.this.b > 0.5F))) {
          j += SlidingPaneLayout.this.c;
        }
        int k = SlidingPaneLayout.this.a.getWidth();
        i = SlidingPaneLayout.this.getWidth() - j - k;
      }
      for (;;)
      {
        SlidingPaneLayout.this.e.a(i, paramView.getTop());
        SlidingPaneLayout.this.invalidate();
        return;
        i = SlidingPaneLayout.this.getPaddingLeft() + localLayoutParams.leftMargin;
        if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (SlidingPaneLayout.this.b > 0.5F))) {
          i += SlidingPaneLayout.this.c;
        }
      }
    }
    
    public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      SlidingPaneLayout.this.a(paramInt1);
      SlidingPaneLayout.this.invalidate();
    }
    
    public boolean a(View paramView, int paramInt)
    {
      if (SlidingPaneLayout.this.d) {
        return false;
      }
      return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).b;
    }
    
    public int b(View paramView)
    {
      return SlidingPaneLayout.this.c;
    }
    
    public int b(View paramView, int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.this.a.getLayoutParams();
      if (SlidingPaneLayout.this.f())
      {
        int k = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.getPaddingRight() + localLayoutParams.rightMargin + SlidingPaneLayout.this.a.getWidth());
        int m = k - SlidingPaneLayout.this.c;
        return Math.max(Math.min(paramInt1, k), m);
      }
      int i = SlidingPaneLayout.this.getPaddingLeft() + localLayoutParams.leftMargin;
      int j = i + SlidingPaneLayout.this.c;
      return Math.min(Math.max(paramInt1, i), j);
    }
    
    public void b(int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.this.e.a(SlidingPaneLayout.this.a, paramInt2);
    }
    
    public void b(View paramView, int paramInt)
    {
      SlidingPaneLayout.this.a();
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(View paramView);
    
    public abstract void a(View paramView, float paramFloat);
    
    public abstract void b(View paramView);
  }
  
  static abstract interface e
  {
    public abstract void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView);
  }
  
  static class f
    implements SlidingPaneLayout.e
  {
    public void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      s.a(paramSlidingPaneLayout, paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    }
  }
  
  static class g
    extends SlidingPaneLayout.f
  {
    private Method a;
    private Field b;
    
    g()
    {
      try
      {
        this.a = View.class.getDeclaredMethod("getDisplayList", (Class[])null);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;)
        {
          try
          {
            this.b = View.class.getDeclaredField("mRecreateDisplayList");
            this.b.setAccessible(true);
            return;
          }
          catch (NoSuchFieldException localNoSuchFieldException)
          {
            Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", localNoSuchFieldException);
          }
          localNoSuchMethodException = localNoSuchMethodException;
          Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", localNoSuchMethodException);
        }
      }
    }
    
    public void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      if ((this.a != null) && (this.b != null)) {
        try
        {
          this.b.setBoolean(paramView, true);
          this.a.invoke(paramView, (Object[])null);
          super.a(paramSlidingPaneLayout, paramView);
          return;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            Log.e("SlidingPaneLayout", "Error refreshing display list state", localException);
          }
        }
      }
      paramView.invalidate();
    }
  }
  
  static class h
    extends SlidingPaneLayout.f
  {
    public void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      s.a(paramView, ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).d);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * JD-Core Version:    0.7.0.1
 */