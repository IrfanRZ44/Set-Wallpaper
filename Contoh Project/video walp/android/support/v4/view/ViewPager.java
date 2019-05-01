package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.b;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
  extends ViewGroup
{
  static final int[] a = { 16842931 };
  private static final h ai = new h();
  private static final Comparator<b> e = new Comparator()
  {
    public int a(ViewPager.b paramAnonymousb1, ViewPager.b paramAnonymousb2)
    {
      return paramAnonymousb1.b - paramAnonymousb2.b;
    }
  };
  private static final Interpolator f = new Interpolator()
  {
    public float getInterpolation(float paramAnonymousFloat)
    {
      float f = paramAnonymousFloat - 1.0F;
      return 1.0F + f * (f * (f * (f * f)));
    }
  };
  private int A = 1;
  private boolean B;
  private boolean C;
  private int D;
  private int E;
  private int F;
  private float G;
  private float H;
  private float I;
  private float J;
  private int K = -1;
  private VelocityTracker L;
  private int M;
  private int N;
  private int O;
  private int P;
  private boolean Q;
  private EdgeEffect R;
  private EdgeEffect S;
  private boolean T = true;
  private boolean U = false;
  private boolean V;
  private int W;
  private List<e> aa;
  private e ab;
  private e ac;
  private List<d> ad;
  private f ae;
  private int af;
  private int ag;
  private ArrayList<View> ah;
  private final Runnable aj = new Runnable()
  {
    public void run()
    {
      ViewPager.this.setScrollState(0);
      ViewPager.this.c();
    }
  };
  private int ak = 0;
  p b;
  int c;
  private int d;
  private final ArrayList<b> g = new ArrayList();
  private final b h = new b();
  private final Rect i = new Rect();
  private int j = -1;
  private Parcelable k = null;
  private ClassLoader l = null;
  private Scroller m;
  private boolean n;
  private g o;
  private int p;
  private Drawable q;
  private int r;
  private int s;
  private float t = -3.402824E+038F;
  private float u = 3.4028235E+38F;
  private int v;
  private int w;
  private boolean x;
  private boolean y;
  private boolean z;
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.O) && (Math.abs(paramInt2) > this.M))
    {
      if (paramInt2 > 0) {}
      for (;;)
      {
        if (this.g.size() > 0)
        {
          b localb1 = (b)this.g.get(0);
          b localb2 = (b)this.g.get(-1 + this.g.size());
          paramInt1 = Math.max(localb1.b, Math.min(paramInt1, localb2.b));
        }
        return paramInt1;
        paramInt1++;
      }
    }
    if (paramInt1 >= this.c) {}
    for (float f1 = 0.4F;; f1 = 0.6F)
    {
      paramInt1 += (int)(f1 + paramFloat);
      break;
    }
  }
  
  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null) {}
    for (Rect localRect = new Rect();; localRect = paramRect)
    {
      if (paramView == null)
      {
        localRect.set(0, 0, 0, 0);
        return localRect;
      }
      localRect.left = paramView.getLeft();
      localRect.right = paramView.getRight();
      localRect.top = paramView.getTop();
      localRect.bottom = paramView.getBottom();
      ViewGroup localViewGroup;
      for (ViewParent localViewParent = paramView.getParent(); ((localViewParent instanceof ViewGroup)) && (localViewParent != this); localViewParent = localViewGroup.getParent())
      {
        localViewGroup = (ViewGroup)localViewParent;
        localRect.left += localViewGroup.getLeft();
        localRect.right += localViewGroup.getRight();
        localRect.top += localViewGroup.getTop();
        localRect.bottom += localViewGroup.getBottom();
      }
      return localRect;
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.g.isEmpty()))
    {
      if (!this.m.isFinished())
      {
        this.m.setFinalX(getCurrentItem() * getClientWidth());
        return;
      }
      int i2 = paramInt3 + (paramInt1 - getPaddingLeft() - getPaddingRight());
      int i3 = paramInt4 + (paramInt2 - getPaddingLeft() - getPaddingRight());
      scrollTo((int)(getScrollX() / i3 * i2), getScrollY());
      return;
    }
    b localb = b(this.c);
    if (localb != null) {}
    for (float f1 = Math.min(localb.e, this.u);; f1 = 0.0F)
    {
      int i1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (i1 == getScrollX()) {
        break;
      }
      a(false);
      scrollTo(i1, getScrollY());
      return;
    }
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    b localb = b(paramInt1);
    if (localb != null) {}
    for (int i1 = (int)(getClientWidth() * Math.max(this.t, Math.min(localb.e, this.u)));; i1 = 0)
    {
      if (paramBoolean1)
      {
        a(i1, 0, paramInt2);
        if (paramBoolean2) {
          e(paramInt1);
        }
        return;
      }
      if (paramBoolean2) {
        e(paramInt1);
      }
      a(false);
      scrollTo(i1, 0);
      d(i1);
      return;
    }
  }
  
  private void a(b paramb1, int paramInt, b paramb2)
  {
    int i1 = this.b.getCount();
    int i2 = getClientWidth();
    float f1;
    int i12;
    float f9;
    int i15;
    int i16;
    if (i2 > 0)
    {
      f1 = this.p / i2;
      if (paramb2 == null) {
        break label371;
      }
      i12 = paramb2.b;
      if (i12 < paramb1.b)
      {
        f9 = f1 + (paramb2.e + paramb2.d);
        i15 = i12 + 1;
        i16 = 0;
      }
    }
    else
    {
      for (;;)
      {
        if ((i15 > paramb1.b) || (i16 >= this.g.size())) {
          break label371;
        }
        b localb4 = (b)this.g.get(i16);
        for (;;)
        {
          if ((i15 > localb4.b) && (i16 < -1 + this.g.size()))
          {
            i16++;
            localb4 = (b)this.g.get(i16);
            continue;
            f1 = 0.0F;
            break;
          }
        }
        while (i15 < localb4.b)
        {
          f9 += f1 + this.b.getPageWidth(i15);
          i15++;
        }
        localb4.e = f9;
        f9 += f1 + localb4.d;
        i15++;
      }
    }
    if (i12 > paramb1.b)
    {
      int i13 = -1 + this.g.size();
      float f8 = paramb2.e;
      for (int i14 = i12 - 1; (i14 >= paramb1.b) && (i13 >= 0); i14--)
      {
        for (b localb3 = (b)this.g.get(i13); (i14 < localb3.b) && (i13 > 0); localb3 = (b)this.g.get(i13)) {
          i13--;
        }
        while (i14 > localb3.b)
        {
          f8 -= f1 + this.b.getPageWidth(i14);
          i14--;
        }
        f8 -= f1 + localb3.d;
        localb3.e = f8;
      }
    }
    label371:
    int i3 = this.g.size();
    float f2 = paramb1.e;
    int i4 = -1 + paramb1.b;
    float f3;
    float f4;
    if (paramb1.b == 0)
    {
      f3 = paramb1.e;
      this.t = f3;
      if (paramb1.b != i1 - 1) {
        break label522;
      }
      f4 = paramb1.e + paramb1.d - 1.0F;
      label437:
      this.u = f4;
    }
    label522:
    int i10;
    for (int i5 = paramInt - 1;; i5 = i10)
    {
      if (i5 < 0) {
        break label579;
      }
      b localb2 = (b)this.g.get(i5);
      float f7 = f2;
      for (;;)
      {
        if (i4 > localb2.b)
        {
          p localp2 = this.b;
          int i11 = i4 - 1;
          f7 -= f1 + localp2.getPageWidth(i4);
          i4 = i11;
          continue;
          f3 = -3.402824E+038F;
          break;
          f4 = 3.4028235E+38F;
          break label437;
        }
      }
      f2 = f7 - (f1 + localb2.d);
      localb2.e = f2;
      if (localb2.b == 0) {
        this.t = f2;
      }
      i10 = i5 - 1;
      i4--;
    }
    label579:
    float f5 = f1 + (paramb1.e + paramb1.d);
    int i6 = 1 + paramb1.b;
    int i8;
    for (int i7 = paramInt + 1; i7 < i3; i7 = i8)
    {
      b localb1 = (b)this.g.get(i7);
      float f6 = f5;
      while (i6 < localb1.b)
      {
        p localp1 = this.b;
        int i9 = i6 + 1;
        f6 += f1 + localp1.getPageWidth(i6);
        i6 = i9;
      }
      if (localb1.b == i1 - 1) {
        this.u = (f6 + localb1.d - 1.0F);
      }
      localb1.e = f6;
      f5 = f6 + (f1 + localb1.d);
      i8 = i7 + 1;
      i6++;
    }
    this.U = false;
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i1) == this.K) {
      if (i1 != 0) {
        break label56;
      }
    }
    label56:
    for (int i2 = 1;; i2 = 0)
    {
      this.G = paramMotionEvent.getX(i2);
      this.K = paramMotionEvent.getPointerId(i2);
      if (this.L != null) {
        this.L.clear();
      }
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i1;
    if (this.ak == 2)
    {
      i1 = 1;
      if (i1 != 0)
      {
        setScrollingCacheEnabled(false);
        if (this.m.isFinished()) {
          break label172;
        }
      }
    }
    int i3;
    label172:
    for (int i4 = 1;; i4 = 0)
    {
      if (i4 != 0)
      {
        this.m.abortAnimation();
        int i5 = getScrollX();
        int i6 = getScrollY();
        int i7 = this.m.getCurrX();
        int i8 = this.m.getCurrY();
        if ((i5 != i7) || (i6 != i8))
        {
          scrollTo(i7, i8);
          if (i7 != i5) {
            d(i7);
          }
        }
      }
      this.z = false;
      int i2 = 0;
      i3 = i1;
      while (i2 < this.g.size())
      {
        b localb = (b)this.g.get(i2);
        if (localb.c)
        {
          localb.c = false;
          i3 = 1;
        }
        i2++;
      }
      i1 = 0;
      break;
    }
    if (i3 != 0)
    {
      if (paramBoolean) {
        s.a(this, this.aj);
      }
    }
    else {
      return;
    }
    this.aj.run();
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    return ((paramFloat1 < this.E) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.E) && (paramFloat2 < 0.0F));
  }
  
  private void b(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.ab != null) {
      this.ab.a(paramInt1, paramFloat, paramInt2);
    }
    if (this.aa != null)
    {
      int i1 = this.aa.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        e locale = (e)this.aa.get(i2);
        if (locale != null) {
          locale.a(paramInt1, paramFloat, paramInt2);
        }
      }
    }
    if (this.ac != null) {
      this.ac.a(paramInt1, paramFloat, paramInt2);
    }
  }
  
  private void b(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      if (paramBoolean) {}
      for (int i3 = this.af;; i3 = 0)
      {
        getChildAt(i2).setLayerType(i3, null);
        i2++;
        break;
      }
    }
  }
  
  private boolean b(float paramFloat)
  {
    boolean bool = true;
    float f1 = this.G - paramFloat;
    this.G = paramFloat;
    float f2 = f1 + getScrollX();
    int i1 = getClientWidth();
    float f3 = i1 * this.t;
    float f4 = i1 * this.u;
    b localb1 = (b)this.g.get(0);
    b localb2 = (b)this.g.get(-1 + this.g.size());
    if (localb1.b != 0) {
      f3 = localb1.e * i1;
    }
    for (int i2 = 0;; i2 = bool)
    {
      float f5;
      if (localb2.b != -1 + this.b.getCount()) {
        f5 = localb2.e * i1;
      }
      for (int i3 = 0;; i3 = bool)
      {
        if (f2 < f3)
        {
          if (i2 == 0) {
            break label266;
          }
          float f7 = f3 - f2;
          this.R.onPull(Math.abs(f7) / i1);
        }
        for (;;)
        {
          this.G += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          d((int)f3);
          return bool;
          if (f2 > f5)
          {
            if (i3 != 0)
            {
              float f6 = f2 - f5;
              this.S.onPull(Math.abs(f6) / i1);
            }
            for (;;)
            {
              f3 = f5;
              break;
              bool = false;
            }
          }
          f3 = f2;
          bool = false;
          continue;
          label266:
          bool = false;
        }
        f5 = f4;
      }
    }
  }
  
  private void c(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private static boolean c(View paramView)
  {
    return paramView.getClass().getAnnotation(a.class) != null;
  }
  
  private boolean d(int paramInt)
  {
    if (this.g.size() == 0)
    {
      if (this.T) {}
      do
      {
        return false;
        this.V = false;
        a(0, 0.0F, 0);
      } while (this.V);
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    b localb = i();
    int i1 = getClientWidth();
    int i2 = i1 + this.p;
    float f1 = this.p / i1;
    int i3 = localb.b;
    float f2 = (paramInt / i1 - localb.e) / (f1 + localb.d);
    int i4 = (int)(f2 * i2);
    this.V = false;
    a(i3, f2, i4);
    if (!this.V) {
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    return true;
  }
  
  private void e(int paramInt)
  {
    if (this.ab != null) {
      this.ab.b(paramInt);
    }
    if (this.aa != null)
    {
      int i1 = this.aa.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        e locale = (e)this.aa.get(i2);
        if (locale != null) {
          locale.b(paramInt);
        }
      }
    }
    if (this.ac != null) {
      this.ac.b(paramInt);
    }
  }
  
  private void f()
  {
    for (int i1 = 0; i1 < getChildCount(); i1++) {
      if (!((LayoutParams)getChildAt(i1).getLayoutParams()).a)
      {
        removeViewAt(i1);
        i1--;
      }
    }
  }
  
  private void f(int paramInt)
  {
    if (this.ab != null) {
      this.ab.a(paramInt);
    }
    if (this.aa != null)
    {
      int i1 = this.aa.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        e locale = (e)this.aa.get(i2);
        if (locale != null) {
          locale.a(paramInt);
        }
      }
    }
    if (this.ac != null) {
      this.ac.a(paramInt);
    }
  }
  
  private void g()
  {
    if (this.ag != 0)
    {
      if (this.ah == null) {
        this.ah = new ArrayList();
      }
      for (;;)
      {
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView = getChildAt(i2);
          this.ah.add(localView);
        }
        this.ah.clear();
      }
      Collections.sort(this.ah, ai);
    }
  }
  
  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private boolean h()
  {
    this.K = -1;
    j();
    this.R.onRelease();
    this.S.onRelease();
    return (this.R.isFinished()) || (this.S.isFinished());
  }
  
  private b i()
  {
    int i1 = getClientWidth();
    float f1;
    float f2;
    label31:
    float f3;
    float f4;
    int i2;
    int i3;
    int i4;
    Object localObject;
    label49:
    b localb1;
    b localb3;
    int i5;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0) {
        break label210;
      }
      f2 = this.p / i1;
      f3 = 0.0F;
      f4 = 0.0F;
      i2 = -1;
      i3 = 0;
      i4 = 1;
      localObject = null;
      if (i3 < this.g.size())
      {
        localb1 = (b)this.g.get(i3);
        if ((i4 != 0) || (localb1.b == i2 + 1)) {
          break label261;
        }
        localb3 = this.h;
        localb3.e = (f2 + (f3 + f4));
        localb3.b = (i2 + 1);
        localb3.d = this.b.getPageWidth(localb3.b);
        i5 = i3 - 1;
      }
    }
    for (b localb2 = localb3;; localb2 = localb1)
    {
      float f5 = localb2.e;
      float f6 = f2 + (f5 + localb2.d);
      if ((i4 != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (i5 == -1 + this.g.size())) {
          localObject = localb2;
        }
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label210:
        f2 = 0.0F;
        break label31;
      }
      int i6 = localb2.b;
      float f7 = localb2.d;
      int i7 = i5 + 1;
      f4 = f5;
      i2 = i6;
      f3 = f7;
      localObject = localb2;
      i3 = i7;
      i4 = 0;
      break label49;
      label261:
      i5 = i3;
    }
  }
  
  private void j()
  {
    this.B = false;
    this.C = false;
    if (this.L != null)
    {
      this.L.recycle();
      this.L = null;
    }
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.y != paramBoolean) {
      this.y = paramBoolean;
    }
  }
  
  float a(float paramFloat)
  {
    return (float)Math.sin(0.4712389F * (paramFloat - 0.5F));
  }
  
  b a(int paramInt1, int paramInt2)
  {
    b localb = new b();
    localb.b = paramInt1;
    localb.a = this.b.instantiateItem(this, paramInt1);
    localb.d = this.b.getPageWidth(paramInt1);
    if ((paramInt2 < 0) || (paramInt2 >= this.g.size()))
    {
      this.g.add(localb);
      return localb;
    }
    this.g.add(paramInt2, localb);
    return localb;
  }
  
  b a(View paramView)
  {
    for (int i1 = 0; i1 < this.g.size(); i1++)
    {
      b localb = (b)this.g.get(i1);
      if (this.b.isViewFromObject(paramView, localb.a)) {
        return localb;
      }
    }
    return null;
  }
  
  void a()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.m = new Scroller(localContext, f);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.F = localViewConfiguration.getScaledPagingTouchSlop();
    this.M = ((int)(400.0F * f1));
    this.N = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.R = new EdgeEffect(localContext);
    this.S = new EdgeEffect(localContext);
    this.O = ((int)(25.0F * f1));
    this.P = ((int)(2.0F * f1));
    this.D = ((int)(16.0F * f1));
    s.a(this, new c());
    if (s.d(this) == 0) {
      s.a(this, 1);
    }
    s.a(this, new o()
    {
      private final Rect b = new Rect();
      
      public aa a(View paramAnonymousView, aa paramAnonymousaa)
      {
        aa localaa1 = s.a(paramAnonymousView, paramAnonymousaa);
        if (localaa1.f()) {
          return localaa1;
        }
        Rect localRect = this.b;
        localRect.left = localaa1.a();
        localRect.top = localaa1.b();
        localRect.right = localaa1.c();
        localRect.bottom = localaa1.d();
        int i = 0;
        int j = ViewPager.this.getChildCount();
        while (i < j)
        {
          aa localaa2 = s.b(ViewPager.this.getChildAt(i), localaa1);
          localRect.left = Math.min(localaa2.a(), localRect.left);
          localRect.top = Math.min(localaa2.b(), localRect.top);
          localRect.right = Math.min(localaa2.c(), localRect.right);
          localRect.bottom = Math.min(localaa2.d(), localRect.bottom);
          i++;
        }
        return localaa1.a(localRect.left, localRect.top, localRect.right, localRect.bottom);
      }
    });
  }
  
  void a(int paramInt)
  {
    b localb13;
    if (this.c != paramInt)
    {
      localb13 = b(this.c);
      this.c = paramInt;
    }
    for (b localb1 = localb13;; localb1 = null)
    {
      if (this.b == null) {
        g();
      }
      do
      {
        return;
        if (this.z)
        {
          g();
          return;
        }
      } while (getWindowToken() == null);
      this.b.startUpdate(this);
      int i1 = this.A;
      int i2 = Math.max(0, this.c - i1);
      int i3 = this.b.getCount();
      int i4 = Math.min(i3 - 1, i1 + this.c);
      if (i3 != this.d)
      {
        try
        {
          String str2 = getResources().getResourceName(getId());
          str1 = str2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;)
          {
            String str1 = Integer.toHexString(getId());
          }
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.d + ", found: " + i3 + " Pager id: " + str1 + " Pager class: " + getClass() + " Problematic adapter: " + this.b.getClass());
      }
      int i5 = 0;
      b localb2;
      if (i5 < this.g.size())
      {
        localb2 = (b)this.g.get(i5);
        if (localb2.b >= this.c) {
          if (localb2.b != this.c) {
            break label1246;
          }
        }
      }
      for (;;)
      {
        if ((localb2 == null) && (i3 > 0)) {}
        for (b localb3 = a(this.c, i5);; localb3 = localb2)
        {
          b localb7;
          label333:
          int i10;
          float f1;
          label347:
          float f2;
          int i12;
          int i13;
          int i14;
          float f3;
          int i15;
          b localb8;
          if (localb3 != null)
          {
            int i9 = i5 - 1;
            if (i9 < 0) {
              break label634;
            }
            localb7 = (b)this.g.get(i9);
            i10 = getClientWidth();
            if (i10 > 0) {
              break label640;
            }
            f1 = 0.0F;
            int i11 = -1 + this.c;
            f2 = 0.0F;
            i12 = i11;
            i13 = i5;
            i14 = i9;
            if (i12 >= 0)
            {
              if ((f2 < f1) || (i12 >= i2)) {
                break label742;
              }
              if (localb7 != null) {
                break label662;
              }
            }
            f3 = localb3.d;
            i15 = i13 + 1;
            if (f3 < 2.0F)
            {
              if (i15 >= this.g.size()) {
                break label847;
              }
              localb8 = (b)this.g.get(i15);
              label441:
              if (i10 > 0) {
                break label853;
              }
            }
          }
          Object localObject1;
          int i17;
          int i18;
          label640:
          label662:
          label847:
          label853:
          for (float f4 = 0.0F;; f4 = 2.0F + getPaddingRight() / i10)
          {
            int i16 = 1 + this.c;
            localObject1 = localb8;
            i17 = i15;
            i18 = i16;
            label469:
            if (i18 < i3)
            {
              if ((f3 < f4) || (i18 <= i4)) {
                break label974;
              }
              if (localObject1 != null) {
                break label869;
              }
            }
            a(localb3, i13, localb1);
            this.b.setPrimaryItem(this, this.c, localb3.a);
            this.b.finishUpdate(this);
            int i6 = getChildCount();
            for (int i7 = 0; i7 < i6; i7++)
            {
              View localView3 = getChildAt(i7);
              LayoutParams localLayoutParams = (LayoutParams)localView3.getLayoutParams();
              localLayoutParams.f = i7;
              if ((!localLayoutParams.a) && (localLayoutParams.c == 0.0F))
              {
                b localb6 = a(localView3);
                if (localb6 != null)
                {
                  localLayoutParams.c = localb6.d;
                  localLayoutParams.e = localb6.b;
                }
              }
            }
            i5++;
            break;
            label634:
            localb7 = null;
            break label333;
            f1 = 2.0F - localb3.d + getPaddingLeft() / i10;
            break label347;
            if ((i12 == localb7.b) && (!localb7.c))
            {
              this.g.remove(i14);
              this.b.destroyItem(this, i12, localb7.a);
              i14--;
              i13--;
              if (i14 < 0) {
                break label736;
              }
              localb7 = (b)this.g.get(i14);
            }
            for (;;)
            {
              i12--;
              break;
              label736:
              localb7 = null;
              continue;
              label742:
              if ((localb7 != null) && (i12 == localb7.b))
              {
                f2 += localb7.d;
                i14--;
                if (i14 >= 0) {
                  localb7 = (b)this.g.get(i14);
                } else {
                  localb7 = null;
                }
              }
              else
              {
                f2 += a(i12, i14 + 1).d;
                i13++;
                if (i14 >= 0) {
                  localb7 = (b)this.g.get(i14);
                } else {
                  localb7 = null;
                }
              }
            }
            localb8 = null;
            break label441;
          }
          label869:
          b localb12;
          label938:
          Object localObject2;
          float f6;
          if ((i18 == ((b)localObject1).b) && (!((b)localObject1).c))
          {
            this.g.remove(i17);
            this.b.destroyItem(this, i18, ((b)localObject1).a);
            if (i17 < this.g.size())
            {
              localb12 = (b)this.g.get(i17);
              float f10 = f3;
              localObject2 = localb12;
              f6 = f10;
            }
          }
          for (;;)
          {
            i18++;
            float f7 = f6;
            localObject1 = localObject2;
            f3 = f7;
            break label469;
            localb12 = null;
            break label938;
            label974:
            if ((localObject1 != null) && (i18 == ((b)localObject1).b))
            {
              float f8 = f3 + ((b)localObject1).d;
              i17++;
              if (i17 < this.g.size()) {}
              for (b localb11 = (b)this.g.get(i17);; localb11 = null)
              {
                localObject2 = localb11;
                f6 = f8;
                break;
              }
            }
            b localb9 = a(i18, i17);
            i17++;
            float f5 = f3 + localb9.d;
            if (i17 < this.g.size()) {}
            for (b localb10 = (b)this.g.get(i17);; localb10 = null)
            {
              localObject2 = localb10;
              f6 = f5;
              break;
            }
            g();
            if (!hasFocus()) {
              break;
            }
            View localView1 = findFocus();
            if (localView1 != null) {}
            for (b localb4 = b(localView1);; localb4 = null)
            {
              if ((localb4 != null) && (localb4.b == this.c)) {
                break label1222;
              }
              for (int i8 = 0;; i8++)
              {
                if (i8 >= getChildCount()) {
                  break label1216;
                }
                View localView2 = getChildAt(i8);
                b localb5 = a(localView2);
                if ((localb5 != null) && (localb5.b == this.c) && (localView2.requestFocus(2))) {
                  break;
                }
              }
              label1216:
              break;
            }
            label1222:
            break;
            float f9 = f3;
            localObject2 = localObject1;
            f6 = f9;
          }
        }
        label1246:
        localb2 = null;
      }
    }
  }
  
  protected void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.W > 0)
    {
      int i4 = getScrollX();
      int i5 = getPaddingLeft();
      int i6 = getPaddingRight();
      int i7 = getWidth();
      int i8 = getChildCount();
      int i9 = 0;
      while (i9 < i8)
      {
        View localView2 = getChildAt(i9);
        LayoutParams localLayoutParams = (LayoutParams)localView2.getLayoutParams();
        int i12;
        int i13;
        if (!localLayoutParams.a)
        {
          int i20 = i6;
          i12 = i5;
          i13 = i20;
          i9++;
          int i15 = i13;
          i5 = i12;
          i6 = i15;
        }
        else
        {
          int i10;
          switch (0x7 & localLayoutParams.b)
          {
          case 2: 
          case 4: 
          default: 
            i10 = i5;
            int i19 = i6;
            i12 = i5;
            i13 = i19;
          }
          for (;;)
          {
            int i14 = i10 + i4 - localView2.getLeft();
            if (i14 == 0) {
              break;
            }
            localView2.offsetLeftAndRight(i14);
            break;
            int i17 = i5 + localView2.getWidth();
            int i18 = i5;
            i13 = i6;
            i12 = i17;
            i10 = i18;
            continue;
            i10 = Math.max((i7 - localView2.getMeasuredWidth()) / 2, i5);
            int i16 = i6;
            i12 = i5;
            i13 = i16;
            continue;
            i10 = i7 - i6 - localView2.getMeasuredWidth();
            int i11 = i6 + localView2.getMeasuredWidth();
            i12 = i5;
            i13 = i11;
          }
        }
      }
    }
    b(paramInt1, paramFloat, paramInt2);
    if (this.ae != null)
    {
      int i1 = getScrollX();
      int i2 = getChildCount();
      int i3 = 0;
      if (i3 < i2)
      {
        View localView1 = getChildAt(i3);
        if (((LayoutParams)localView1.getLayoutParams()).a) {}
        for (;;)
        {
          i3++;
          break;
          float f1 = (localView1.getLeft() - i1) / getClientWidth();
          this.ae.a(localView1, f1);
        }
      }
    }
    this.V = true;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    int i1;
    int i11;
    if ((this.m != null) && (!this.m.isFinished()))
    {
      i1 = 1;
      if (i1 == 0) {
        break label131;
      }
      if (!this.n) {
        break label119;
      }
      i11 = this.m.getCurrX();
      label54:
      this.m.abortAnimation();
      setScrollingCacheEnabled(false);
    }
    int i3;
    int i4;
    int i5;
    label131:
    for (int i2 = i11;; i2 = getScrollX())
    {
      i3 = getScrollY();
      i4 = paramInt1 - i2;
      i5 = paramInt2 - i3;
      if ((i4 != 0) || (i5 != 0)) {
        break label140;
      }
      a(false);
      c();
      setScrollState(0);
      return;
      i1 = 0;
      break;
      label119:
      i11 = this.m.getStartX();
      break label54;
    }
    label140:
    setScrollingCacheEnabled(true);
    setScrollState(2);
    int i6 = getClientWidth();
    int i7 = i6 / 2;
    float f1 = Math.min(1.0F, 1.0F * Math.abs(i4) / i6);
    float f2 = i7 + i7 * a(f1);
    int i8 = Math.abs(paramInt3);
    if (i8 > 0) {}
    float f3;
    for (int i9 = 4 * Math.round(1000.0F * Math.abs(f2 / i8));; i9 = (int)(100.0F * (1.0F + Math.abs(i4) / (f3 + this.p))))
    {
      int i10 = Math.min(i9, 600);
      this.n = false;
      this.m.startScroll(i2, i3, i4, i5, i10);
      s.c(this);
      return;
      f3 = i6 * this.b.getPageWidth(this.c);
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    this.z = false;
    a(paramInt, paramBoolean, false);
  }
  
  void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.b == null) || (this.b.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.c == paramInt1) && (this.g.size() != 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      int i1 = this.A;
      if ((paramInt1 <= i1 + this.c) && (paramInt1 >= this.c - i1)) {
        break;
      }
      for (int i2 = 0; i2 < this.g.size(); i2++) {
        ((b)this.g.get(i2)).c = true;
      }
      if (paramInt1 >= this.b.getCount()) {
        paramInt1 = -1 + this.b.getCount();
      }
    }
    int i3 = this.c;
    boolean bool = false;
    if (i3 != paramInt1) {
      bool = true;
    }
    if (this.T)
    {
      this.c = paramInt1;
      if (bool) {
        e(paramInt1);
      }
      requestLayout();
      return;
    }
    a(paramInt1);
    a(paramInt1, paramBoolean1, paramInt2, bool);
  }
  
  public void a(d paramd)
  {
    if (this.ad == null) {
      this.ad = new ArrayList();
    }
    this.ad.add(paramd);
  }
  
  public void a(e parame)
  {
    if (this.aa == null) {
      this.aa = new ArrayList();
    }
    this.aa.add(parame);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0) {
      switch (paramKeyEvent.getKeyCode())
      {
      }
    }
    do
    {
      return false;
      if (paramKeyEvent.hasModifiers(2)) {
        return d();
      }
      return c(17);
      if (paramKeyEvent.hasModifiers(2)) {
        return e();
      }
      return c(66);
      if (paramKeyEvent.hasNoModifiers()) {
        return c(2);
      }
    } while (!paramKeyEvent.hasModifiers(1));
    return c(1);
  }
  
  protected boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = paramView.getScrollX();
      int i2 = paramView.getScrollY();
      i3 = -1 + localViewGroup.getChildCount();
      if (i3 >= 0)
      {
        localView = localViewGroup.getChildAt(i3);
        if ((paramInt2 + i1 < localView.getLeft()) || (paramInt2 + i1 >= localView.getRight()) || (paramInt3 + i2 < localView.getTop()) || (paramInt3 + i2 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i1 - localView.getLeft(), paramInt3 + i2 - localView.getTop()))) {}
      }
    }
    while ((paramBoolean) && (paramView.canScrollHorizontally(-paramInt1)))
    {
      View localView;
      return true;
      i3--;
      break;
    }
    return false;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayList.size();
    int i2 = getDescendantFocusability();
    if (i2 != 393216) {
      for (int i3 = 0; i3 < getChildCount(); i3++)
      {
        View localView = getChildAt(i3);
        if (localView.getVisibility() == 0)
        {
          b localb = a(localView);
          if ((localb != null) && (localb.b == this.c)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if (((i2 == 262144) && (i1 != paramArrayList.size())) || (!isFocusable())) {}
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null)) {
      return;
    }
    paramArrayList.add(this);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        b localb = a(localView);
        if ((localb != null) && (localb.b == this.c)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams)) {}
    for (ViewGroup.LayoutParams localLayoutParams = generateLayoutParams(paramLayoutParams);; localLayoutParams = paramLayoutParams)
    {
      LayoutParams localLayoutParams1 = (LayoutParams)localLayoutParams;
      localLayoutParams1.a |= c(paramView);
      if (this.x)
      {
        if ((localLayoutParams1 != null) && (localLayoutParams1.a)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localLayoutParams1.d = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }
  
  b b(int paramInt)
  {
    for (int i1 = 0; i1 < this.g.size(); i1++)
    {
      b localb = (b)this.g.get(i1);
      if (localb.b == paramInt) {
        return localb;
      }
    }
    return null;
  }
  
  b b(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        return null;
      }
      paramView = (View)localViewParent;
    }
    return a(paramView);
  }
  
  void b()
  {
    int i1 = this.b.getCount();
    this.d = i1;
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    label61:
    b localb;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    if ((this.g.size() < 1 + 2 * this.A) && (this.g.size() < i1))
    {
      i2 = 1;
      int i3 = this.c;
      i4 = 0;
      i5 = i3;
      i6 = i2;
      i7 = 0;
      if (i7 >= this.g.size()) {
        break label307;
      }
      localb = (b)this.g.get(i7);
      i10 = this.b.getItemPosition(localb.a);
      if (i10 != -1) {
        break label153;
      }
      i11 = i7;
      i12 = i4;
      i13 = i5;
      i14 = i6;
    }
    for (;;)
    {
      int i15 = i11 + 1;
      i6 = i14;
      i5 = i13;
      i4 = i12;
      i7 = i15;
      break label61;
      i2 = 0;
      break;
      label153:
      int i16;
      if (i10 == -2)
      {
        this.g.remove(i7);
        i16 = i7 - 1;
        if (i4 == 0)
        {
          this.b.startUpdate(this);
          i4 = 1;
        }
        this.b.destroyItem(this, localb.b, localb.a);
        if (this.c == localb.b)
        {
          int i17 = Math.max(0, Math.min(this.c, i1 - 1));
          i11 = i16;
          i12 = i4;
          i13 = i17;
          i14 = 1;
        }
      }
      else
      {
        if (localb.b != i10)
        {
          if (localb.b == this.c) {
            i5 = i10;
          }
          localb.b = i10;
          i11 = i7;
          i12 = i4;
          i13 = i5;
          i14 = 1;
          continue;
          label307:
          if (i4 != 0) {
            this.b.finishUpdate(this);
          }
          Collections.sort(this.g, e);
          if (i6 != 0)
          {
            int i8 = getChildCount();
            for (int i9 = 0; i9 < i8; i9++)
            {
              LayoutParams localLayoutParams = (LayoutParams)getChildAt(i9).getLayoutParams();
              if (!localLayoutParams.a) {
                localLayoutParams.c = 0.0F;
              }
            }
            a(i5, false, true);
            requestLayout();
          }
          return;
        }
        i11 = i7;
        i12 = i4;
        i13 = i5;
        i14 = i6;
        continue;
      }
      i11 = i16;
      i12 = i4;
      i13 = i5;
      i14 = 1;
    }
  }
  
  public void b(d paramd)
  {
    if (this.ad != null) {
      this.ad.remove(paramd);
    }
  }
  
  public void b(e parame)
  {
    if (this.aa != null) {
      this.aa.remove(parame);
    }
  }
  
  e c(e parame)
  {
    e locale = this.ac;
    this.ac = parame;
    return locale;
  }
  
  void c()
  {
    a(this.c);
  }
  
  public boolean c(int paramInt)
  {
    View localView1 = findFocus();
    View localView2;
    View localView3;
    boolean bool;
    label86:
    ViewParent localViewParent1;
    if (localView1 == this)
    {
      localView2 = null;
      localView3 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
      if ((localView3 == null) || (localView3 == localView2)) {
        break label325;
      }
      if (paramInt != 17) {
        break label260;
      }
      int i3 = a(this.i, localView3).left;
      int i4 = a(this.i, localView2).left;
      if ((localView2 != null) && (i3 >= i4))
      {
        bool = d();
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        return bool;
      }
    }
    else
    {
      if (localView1 == null) {
        break label371;
      }
      localViewParent1 = localView1.getParent();
      if (!(localViewParent1 instanceof ViewGroup)) {
        break label376;
      }
      if (localViewParent1 != this) {}
    }
    label260:
    label325:
    label371:
    label376:
    for (int i5 = 1;; i5 = 0)
    {
      if (i5 == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView1.getClass().getSimpleName());
        ViewParent localViewParent2 = localView1.getParent();
        for (;;)
        {
          if ((localViewParent2 instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localViewParent2.getClass().getSimpleName());
            localViewParent2 = localViewParent2.getParent();
            continue;
            localViewParent1 = localViewParent1.getParent();
            break;
          }
        }
        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + localStringBuilder.toString());
        localView2 = null;
        break;
        bool = localView3.requestFocus();
        break label86;
        if (paramInt == 66)
        {
          int i1 = a(this.i, localView3).left;
          int i2 = a(this.i, localView2).left;
          if ((localView2 != null) && (i1 <= i2))
          {
            bool = e();
            break label86;
          }
          bool = localView3.requestFocus();
          break label86;
          if ((paramInt == 17) || (paramInt == 1))
          {
            bool = d();
            break label86;
          }
          if ((paramInt == 66) || (paramInt == 2))
          {
            bool = e();
            break label86;
          }
        }
        bool = false;
        break label86;
      }
      localView2 = localView1;
      break;
    }
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    boolean bool = true;
    if (this.b == null) {}
    int i1;
    int i2;
    do
    {
      return false;
      i1 = getClientWidth();
      i2 = getScrollX();
      if (paramInt < 0)
      {
        if (i2 > (int)(i1 * this.t)) {}
        for (;;)
        {
          return bool;
          bool = false;
        }
      }
    } while (paramInt <= 0);
    if (i2 < (int)(i1 * this.u)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    this.n = true;
    if ((!this.m.isFinished()) && (this.m.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.m.getCurrX();
      int i4 = this.m.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!d(i3))
        {
          this.m.abortAnimation();
          scrollTo(0, i4);
        }
      }
      s.c(this);
      return;
    }
    a(true);
  }
  
  boolean d()
  {
    if (this.c > 0)
    {
      a(-1 + this.c, true);
      return true;
    }
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (a(paramKeyEvent));
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool;
    }
    int i1 = getChildCount();
    for (int i2 = 0;; i2++)
    {
      bool = false;
      if (i2 >= i1) {
        break;
      }
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 0)
      {
        b localb = a(localView);
        if ((localb != null) && (localb.b == this.c) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = getOverScrollMode();
    boolean bool2;
    if ((i1 == 0) || ((i1 == 1) && (this.b != null) && (this.b.getCount() > 1)))
    {
      boolean bool1 = this.R.isFinished();
      bool2 = false;
      if (!bool1)
      {
        int i5 = paramCanvas.save();
        int i6 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i7 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i6 + getPaddingTop(), this.t * i7);
        this.R.setSize(i6, i7);
        bool2 = false | this.R.draw(paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      if (!this.S.isFinished())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.u) * i3);
        this.S.setSize(i4, i3);
        bool2 |= this.S.draw(paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
    }
    for (;;)
    {
      if (bool2) {
        s.c(this);
      }
      return;
      this.R.finish();
      this.S.finish();
      bool2 = false;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.q;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  boolean e()
  {
    if ((this.b != null) && (this.c < -1 + this.b.getCount()))
    {
      a(1 + this.c, true);
      return true;
    }
    return false;
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
    return generateDefaultLayoutParams();
  }
  
  public p getAdapter()
  {
    return this.b;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ag == 2) {
      paramInt2 = paramInt1 - 1 - paramInt2;
    }
    return ((LayoutParams)((View)this.ah.get(paramInt2)).getLayoutParams()).f;
  }
  
  public int getCurrentItem()
  {
    return this.c;
  }
  
  public int getOffscreenPageLimit()
  {
    return this.A;
  }
  
  public int getPageMargin()
  {
    return this.p;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.T = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.aj);
    if ((this.m != null) && (!this.m.isFinished())) {
      this.m.abortAnimation();
    }
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1;
    int i2;
    float f1;
    b localb;
    float f2;
    int i3;
    int i4;
    int i5;
    int i6;
    if ((this.p > 0) && (this.q != null) && (this.g.size() > 0) && (this.b != null))
    {
      i1 = getScrollX();
      i2 = getWidth();
      f1 = this.p / i2;
      localb = (b)this.g.get(0);
      f2 = localb.e;
      i3 = this.g.size();
      i4 = localb.b;
      i5 = ((b)this.g.get(i3 - 1)).b;
      i6 = 0;
    }
    for (int i7 = i4;; i7++)
    {
      float f4;
      if (i7 < i5)
      {
        while ((i7 > localb.b) && (i6 < i3))
        {
          ArrayList localArrayList = this.g;
          i6++;
          localb = (b)localArrayList.get(i6);
        }
        if (i7 != localb.b) {
          break label272;
        }
        f4 = (localb.e + localb.d) * i2;
      }
      label272:
      float f3;
      for (f2 = f1 + (localb.e + localb.d);; f2 += f3 + f1)
      {
        if (f4 + this.p > i1)
        {
          this.q.setBounds(Math.round(f4), this.r, Math.round(f4 + this.p), this.s);
          this.q.draw(paramCanvas);
        }
        if (f4 <= i1 + i2) {
          break;
        }
        return;
        f3 = this.b.getPageWidth(i7);
        f4 = (f2 + f3) * i2;
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0xFF & paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1)) {
      h();
    }
    do
    {
      return false;
      if (i1 == 0) {
        break;
      }
      if (this.B) {
        return true;
      }
    } while (this.C);
    switch (i1)
    {
    }
    for (;;)
    {
      if (this.L == null) {
        this.L = VelocityTracker.obtain();
      }
      this.L.addMovement(paramMotionEvent);
      return this.B;
      int i2 = this.K;
      if (i2 != -1)
      {
        int i3 = paramMotionEvent.findPointerIndex(i2);
        float f3 = paramMotionEvent.getX(i3);
        float f4 = f3 - this.G;
        float f5 = Math.abs(f4);
        float f6 = paramMotionEvent.getY(i3);
        float f7 = Math.abs(f6 - this.J);
        if ((f4 != 0.0F) && (!a(this.G, f4)) && (a(this, false, (int)f4, (int)f3, (int)f6)))
        {
          this.G = f3;
          this.H = f6;
          this.C = true;
          return false;
        }
        float f8;
        if ((f5 > this.F) && (0.5F * f5 > f7))
        {
          this.B = true;
          c(true);
          setScrollState(1);
          if (f4 > 0.0F)
          {
            f8 = this.I + this.F;
            label285:
            this.G = f8;
            this.H = f6;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.B) && (b(f3)))
        {
          s.c(this);
          break;
          f8 = this.I - this.F;
          break label285;
          if (f7 > this.F) {
            this.C = true;
          }
        }
        float f1 = paramMotionEvent.getX();
        this.I = f1;
        this.G = f1;
        float f2 = paramMotionEvent.getY();
        this.J = f2;
        this.H = f2;
        this.K = paramMotionEvent.getPointerId(0);
        this.C = false;
        this.n = true;
        this.m.computeScrollOffset();
        if ((this.ak == 2) && (Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.P))
        {
          this.m.abortAnimation();
          this.z = false;
          c();
          this.B = true;
          c(true);
          setScrollState(1);
        }
        else
        {
          a(false);
          this.B = false;
          continue;
          a(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i6 = getPaddingRight();
    int i7 = getPaddingBottom();
    int i8 = getScrollX();
    int i9 = 0;
    int i10 = 0;
    View localView2;
    int i21;
    label156:
    int i22;
    int i24;
    int i25;
    label208:
    int i14;
    int i15;
    int i16;
    if (i10 < i1)
    {
      localView2 = getChildAt(i10);
      if (localView2.getVisibility() == 8) {
        break label659;
      }
      LayoutParams localLayoutParams2 = (LayoutParams)localView2.getLayoutParams();
      if (!localLayoutParams2.a) {
        break label659;
      }
      int i18 = 0x7 & localLayoutParams2.b;
      int i19 = 0x70 & localLayoutParams2.b;
      switch (i18)
      {
      case 2: 
      case 4: 
      default: 
        i21 = i4;
        switch (i19)
        {
        default: 
          i22 = i5;
          int i30 = i7;
          i24 = i5;
          i25 = i30;
          int i26 = i21 + i8;
          localView2.layout(i26, i22, i26 + localView2.getMeasuredWidth(), i22 + localView2.getMeasuredHeight());
          i14 = i9 + 1;
          i15 = i24;
          i7 = i25;
          i16 = i6;
        }
        break;
      }
    }
    for (int i17 = i4;; i17 = i4)
    {
      i10++;
      i4 = i17;
      i6 = i16;
      i5 = i15;
      i9 = i14;
      break;
      int i31 = i4 + localView2.getMeasuredWidth();
      i21 = i4;
      i4 = i31;
      break label156;
      i21 = Math.max((i2 - localView2.getMeasuredWidth()) / 2, i4);
      break label156;
      int i20 = i2 - i6 - localView2.getMeasuredWidth();
      i6 += localView2.getMeasuredWidth();
      i21 = i20;
      break label156;
      int i28 = i5 + localView2.getMeasuredHeight();
      int i29 = i5;
      i25 = i7;
      i24 = i28;
      i22 = i29;
      break label208;
      i22 = Math.max((i3 - localView2.getMeasuredHeight()) / 2, i5);
      int i27 = i7;
      i24 = i5;
      i25 = i27;
      break label208;
      i22 = i3 - i7 - localView2.getMeasuredHeight();
      int i23 = i7 + localView2.getMeasuredHeight();
      i24 = i5;
      i25 = i23;
      break label208;
      int i11 = i2 - i4 - i6;
      for (int i12 = 0; i12 < i1; i12++)
      {
        View localView1 = getChildAt(i12);
        if (localView1.getVisibility() != 8)
        {
          LayoutParams localLayoutParams1 = (LayoutParams)localView1.getLayoutParams();
          if (!localLayoutParams1.a)
          {
            b localb = a(localView1);
            if (localb != null)
            {
              int i13 = i4 + (int)(i11 * localb.e);
              if (localLayoutParams1.d)
              {
                localLayoutParams1.d = false;
                localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i11 * localLayoutParams1.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - i5 - i7, 1073741824));
              }
              localView1.layout(i13, i5, i13 + localView1.getMeasuredWidth(), i5 + localView1.getMeasuredHeight());
            }
          }
        }
      }
      this.r = i5;
      this.s = (i3 - i7);
      this.W = i9;
      if (this.T) {
        a(this.c, false, 0, false);
      }
      this.T = false;
      return;
      label659:
      i14 = i9;
      i15 = i5;
      i16 = i6;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i1 = getMeasuredWidth();
    this.E = Math.min(i1 / 10, this.D);
    int i2 = i1 - getPaddingLeft() - getPaddingRight();
    int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int i5 = 0;
    View localView2;
    LayoutParams localLayoutParams2;
    int i10;
    int i11;
    int i12;
    label167:
    int i13;
    label182:
    label192:
    int i14;
    int i15;
    if (i5 < i4)
    {
      localView2 = getChildAt(i5);
      if (localView2.getVisibility() != 8)
      {
        localLayoutParams2 = (LayoutParams)localView2.getLayoutParams();
        if ((localLayoutParams2 != null) && (localLayoutParams2.a))
        {
          int i8 = 0x7 & localLayoutParams2.b;
          int i9 = 0x70 & localLayoutParams2.b;
          i10 = -2147483648;
          i11 = -2147483648;
          if ((i9 != 48) && (i9 != 80)) {
            break label294;
          }
          i12 = 1;
          if ((i8 != 3) && (i8 != 5)) {
            break label300;
          }
          i13 = 1;
          if (i12 == 0) {
            break label306;
          }
          i10 = 1073741824;
          if (localLayoutParams2.width == -2) {
            break label478;
          }
          i14 = 1073741824;
          if (localLayoutParams2.width == -1) {
            break label471;
          }
          i15 = localLayoutParams2.width;
        }
      }
    }
    for (;;)
    {
      if (localLayoutParams2.height != -2)
      {
        i11 = 1073741824;
        if (localLayoutParams2.height == -1) {}
      }
      for (int i16 = localLayoutParams2.height;; i16 = i3)
      {
        localView2.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i11));
        if (i12 != 0) {
          i3 -= localView2.getMeasuredHeight();
        }
        for (;;)
        {
          i5++;
          break;
          label294:
          i12 = 0;
          break label167;
          label300:
          i13 = 0;
          break label182;
          label306:
          if (i13 == 0) {
            break label192;
          }
          i11 = 1073741824;
          break label192;
          if (i13 != 0) {
            i2 -= localView2.getMeasuredWidth();
          }
        }
        this.v = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.w = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.x = true;
        c();
        this.x = false;
        int i6 = getChildCount();
        for (int i7 = 0; i7 < i6; i7++)
        {
          View localView1 = getChildAt(i7);
          if (localView1.getVisibility() != 8)
          {
            LayoutParams localLayoutParams1 = (LayoutParams)localView1.getLayoutParams();
            if ((localLayoutParams1 == null) || (!localLayoutParams1.a)) {
              localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i2 * localLayoutParams1.c), 1073741824), this.w);
            }
          }
        }
        return;
      }
      label471:
      i15 = i2;
      continue;
      label478:
      i14 = i10;
      i15 = i2;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1 = -1;
    int i2 = getChildCount();
    int i3;
    if ((paramInt & 0x2) != 0)
    {
      i1 = 1;
      i3 = 0;
    }
    while (i3 != i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 0)
      {
        b localb = a(localView);
        if ((localb != null) && (localb.b == this.c) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i3 = i2 - 1;
          i2 = i1;
          continue;
        }
      }
      i3 += i1;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.b != null)
    {
      this.b.restoreState(localSavedState.b, localSavedState.c);
      a(localSavedState.a, false, true);
      return;
    }
    this.j = localSavedState.a;
    this.k = localSavedState.b;
    this.l = localSavedState.c;
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.a = this.c;
    if (this.b != null) {
      localSavedState.b = this.b.saveState();
    }
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      a(paramInt1, paramInt3, this.p, this.p);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.Q) {
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    if ((this.b == null) || (this.b.getCount() == 0)) {
      return false;
    }
    if (this.L == null) {
      this.L = VelocityTracker.obtain();
    }
    this.L.addMovement(paramMotionEvent);
    int i1 = 0xFF & paramMotionEvent.getAction();
    boolean bool1 = false;
    switch (i1)
    {
    }
    for (;;)
    {
      if (bool1) {
        s.c(this);
      }
      return true;
      this.m.abortAnimation();
      this.z = false;
      c();
      float f7 = paramMotionEvent.getX();
      this.I = f7;
      this.G = f7;
      float f8 = paramMotionEvent.getY();
      this.J = f8;
      this.H = f8;
      this.K = paramMotionEvent.getPointerId(0);
      bool1 = false;
      continue;
      float f4;
      if (!this.B)
      {
        int i6 = paramMotionEvent.findPointerIndex(this.K);
        if (i6 == -1)
        {
          bool1 = h();
          continue;
        }
        float f2 = paramMotionEvent.getX(i6);
        float f3 = Math.abs(f2 - this.G);
        f4 = paramMotionEvent.getY(i6);
        float f5 = Math.abs(f4 - this.H);
        if ((f3 > this.F) && (f3 > f5))
        {
          this.B = true;
          c(true);
          if (f2 - this.I <= 0.0F) {
            break label396;
          }
        }
      }
      label396:
      for (float f6 = this.I + this.F;; f6 = this.I - this.F)
      {
        this.G = f6;
        this.H = f4;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        ViewParent localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        boolean bool4 = this.B;
        bool1 = false;
        if (!bool4) {
          break;
        }
        bool1 = false | b(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.K)));
        break;
      }
      boolean bool3 = this.B;
      bool1 = false;
      if (bool3)
      {
        VelocityTracker localVelocityTracker = this.L;
        localVelocityTracker.computeCurrentVelocity(1000, this.N);
        int i3 = (int)localVelocityTracker.getXVelocity(this.K);
        this.z = true;
        int i4 = getClientWidth();
        int i5 = getScrollX();
        b localb = i();
        float f1 = this.p / i4;
        a(a(localb.b, (i5 / i4 - localb.e) / (f1 + localb.d), i3, (int)(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.K)) - this.I)), true, true, i3);
        bool1 = h();
        continue;
        boolean bool2 = this.B;
        bool1 = false;
        if (bool2)
        {
          a(this.c, true, 0, false);
          bool1 = h();
          continue;
          int i2 = paramMotionEvent.getActionIndex();
          this.G = paramMotionEvent.getX(i2);
          this.K = paramMotionEvent.getPointerId(i2);
          bool1 = false;
          continue;
          a(paramMotionEvent);
          this.G = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.K));
          bool1 = false;
        }
      }
    }
  }
  
  public void removeView(View paramView)
  {
    if (this.x)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }
  
  public void setAdapter(p paramp)
  {
    int i1 = 0;
    if (this.b != null)
    {
      this.b.setViewPagerObserver(null);
      this.b.startUpdate(this);
      for (int i3 = 0; i3 < this.g.size(); i3++)
      {
        b localb = (b)this.g.get(i3);
        this.b.destroyItem(this, localb.b, localb.a);
      }
      this.b.finishUpdate(this);
      this.g.clear();
      f();
      this.c = 0;
      scrollTo(0, 0);
    }
    p localp = this.b;
    this.b = paramp;
    this.d = 0;
    boolean bool;
    if (this.b != null)
    {
      if (this.o == null) {
        this.o = new g();
      }
      this.b.setViewPagerObserver(this.o);
      this.z = false;
      bool = this.T;
      this.T = true;
      this.d = this.b.getCount();
      if (this.j < 0) {
        break label297;
      }
      this.b.restoreState(this.k, this.l);
      a(this.j, false, true);
      this.j = -1;
      this.k = null;
      this.l = null;
    }
    while ((this.ad != null) && (!this.ad.isEmpty()))
    {
      int i2 = this.ad.size();
      while (i1 < i2)
      {
        ((d)this.ad.get(i1)).a(this, localp, paramp);
        i1++;
      }
      label297:
      if (!bool) {
        c();
      } else {
        requestLayout();
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    this.z = false;
    if (!this.T) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    if (paramInt < 1)
    {
      Log.w("ViewPager", "Requested offscreen page limit " + paramInt + " too small; defaulting to " + 1);
      paramInt = 1;
    }
    if (paramInt != this.A)
    {
      this.A = paramInt;
      c();
    }
  }
  
  @Deprecated
  public void setOnPageChangeListener(e parame)
  {
    this.ab = parame;
  }
  
  public void setPageMargin(int paramInt)
  {
    int i1 = this.p;
    this.p = paramInt;
    int i2 = getWidth();
    a(i2, i2, paramInt, i1);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(android.support.v4.content.a.getDrawable(getContext(), paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.q = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    if (paramDrawable == null) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }
  
  void setScrollState(int paramInt)
  {
    if (this.ak == paramInt) {
      return;
    }
    this.ak = paramInt;
    if (this.ae != null) {
      if (paramInt == 0) {
        break label38;
      }
    }
    label38:
    for (boolean bool = true;; bool = false)
    {
      b(bool);
      f(paramInt);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.q);
  }
  
  public static class LayoutParams
    extends ViewGroup.LayoutParams
  {
    public boolean a;
    public int b;
    float c = 0.0F;
    boolean d;
    int e;
    int f;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.a);
      this.b = localTypedArray.getInteger(0, 48);
      localTypedArray.recycle();
    }
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public ViewPager.SavedState a(Parcel paramAnonymousParcel)
      {
        return new ViewPager.SavedState(paramAnonymousParcel, null);
      }
      
      public ViewPager.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new ViewPager.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public ViewPager.SavedState[] a(int paramAnonymousInt)
      {
        return new ViewPager.SavedState[paramAnonymousInt];
      }
    };
    int a;
    Parcelable b;
    ClassLoader c;
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      if (paramClassLoader == null) {
        paramClassLoader = getClass().getClassLoader();
      }
      this.a = paramParcel.readInt();
      this.b = paramParcel.readParcelable(paramClassLoader);
      this.c = paramClassLoader;
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.a);
      paramParcel.writeParcelable(this.b, paramInt);
    }
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface a {}
  
  static class b
  {
    Object a;
    int b;
    boolean c;
    float d;
    float e;
  }
  
  class c
    extends a
  {
    c() {}
    
    private boolean a()
    {
      return (ViewPager.this.b != null) && (ViewPager.this.b.getCount() > 1);
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ViewPager.class.getName());
      paramAccessibilityEvent.setScrollable(a());
      if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.this.b != null))
      {
        paramAccessibilityEvent.setItemCount(ViewPager.this.b.getCount());
        paramAccessibilityEvent.setFromIndex(ViewPager.this.c);
        paramAccessibilityEvent.setToIndex(ViewPager.this.c);
      }
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      paramb.b(ViewPager.class.getName());
      paramb.k(a());
      if (ViewPager.this.canScrollHorizontally(1)) {
        paramb.a(4096);
      }
      if (ViewPager.this.canScrollHorizontally(-1)) {
        paramb.a(8192);
      }
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      switch (paramInt)
      {
      default: 
        return false;
      case 4096: 
        if (ViewPager.this.canScrollHorizontally(1))
        {
          ViewPager.this.setCurrentItem(1 + ViewPager.this.c);
          return true;
        }
        return false;
      }
      if (ViewPager.this.canScrollHorizontally(-1))
      {
        ViewPager.this.setCurrentItem(-1 + ViewPager.this.c);
        return true;
      }
      return false;
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(ViewPager paramViewPager, p paramp1, p paramp2);
  }
  
  public static abstract interface e
  {
    public abstract void a(int paramInt);
    
    public abstract void a(int paramInt1, float paramFloat, int paramInt2);
    
    public abstract void b(int paramInt);
  }
  
  public static abstract interface f
  {
    public abstract void a(View paramView, float paramFloat);
  }
  
  private class g
    extends DataSetObserver
  {
    g() {}
    
    public void onChanged()
    {
      ViewPager.this.b();
    }
    
    public void onInvalidated()
    {
      ViewPager.this.b();
    }
  }
  
  static class h
    implements Comparator<View>
  {
    public int a(View paramView1, View paramView2)
    {
      ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)paramView1.getLayoutParams();
      ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)paramView2.getLayoutParams();
      if (localLayoutParams1.a != localLayoutParams2.a)
      {
        if (localLayoutParams1.a) {
          return 1;
        }
        return -1;
      }
      return localLayoutParams1.e - localLayoutParams2.e;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.7.0.1
 */