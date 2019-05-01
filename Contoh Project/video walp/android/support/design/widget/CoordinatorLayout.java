package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.b.a.a;
import android.support.b.a.b;
import android.support.b.a.c;
import android.support.v4.f.i;
import android.support.v4.f.k.a;
import android.support.v4.f.k.c;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.d;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v4.widget.h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout
  extends ViewGroup
  implements m
{
  static final String a;
  static final Class<?>[] b;
  static final ThreadLocal<Map<String, Constructor<Behavior>>> c;
  static final Comparator<View> d;
  private static final k.a<Rect> f;
  ViewGroup.OnHierarchyChangeListener e;
  private final List<View> g = new ArrayList();
  private final h<View> h = new h();
  private final List<View> i = new ArrayList();
  private final List<View> j = new ArrayList();
  private final int[] k = new int[2];
  private Paint l;
  private boolean m;
  private boolean n;
  private int[] o;
  private View p;
  private View q;
  private e r;
  private boolean s;
  private aa t;
  private boolean u;
  private Drawable v;
  private o w;
  private final n x = new n(this);
  
  static
  {
    Package localPackage = CoordinatorLayout.class.getPackage();
    String str;
    if (localPackage != null)
    {
      str = localPackage.getName();
      a = str;
      if (Build.VERSION.SDK_INT < 21) {
        break label82;
      }
    }
    label82:
    for (d = new f();; d = null)
    {
      b = new Class[] { Context.class, AttributeSet.class };
      c = new ThreadLocal();
      f = new k.c(12);
      return;
      str = null;
      break;
    }
  }
  
  public CoordinatorLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.coordinatorLayoutStyle);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (paramInt == 0) {}
    for (TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.c.CoordinatorLayout, 0, a.b.Widget_Support_CoordinatorLayout);; localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.c.CoordinatorLayout, paramInt, 0))
    {
      int i2 = localTypedArray.getResourceId(a.c.CoordinatorLayout_keylines, 0);
      if (i2 == 0) {
        break;
      }
      Resources localResources = paramContext.getResources();
      this.o = localResources.getIntArray(i2);
      float f1 = localResources.getDisplayMetrics().density;
      int i3 = this.o.length;
      while (i1 < i3)
      {
        this.o[i1] = ((int)(f1 * this.o[i1]));
        i1++;
      }
    }
    this.v = localTypedArray.getDrawable(a.c.CoordinatorLayout_statusBarBackground);
    localTypedArray.recycle();
    g();
    super.setOnHierarchyChangeListener(new c());
  }
  
  static Behavior a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (paramString.startsWith(".")) {
      paramString = paramContext.getPackageName() + paramString;
    }
    for (;;)
    {
      Map localMap;
      Object localObject;
      try
      {
        localMap = (Map)c.get();
        if (localMap != null) {
          break label230;
        }
        HashMap localHashMap = new HashMap();
        c.set(localHashMap);
        localObject = localHashMap;
        Constructor localConstructor = (Constructor)((Map)localObject).get(paramString);
        if (localConstructor == null)
        {
          localConstructor = paramContext.getClassLoader().loadClass(paramString).getConstructor(b);
          localConstructor.setAccessible(true);
          ((Map)localObject).put(paramString, localConstructor);
        }
        Behavior localBehavior = (Behavior)localConstructor.newInstance(new Object[] { paramContext, paramAttributeSet });
        return localBehavior;
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Could not inflate Behavior subclass " + paramString, localException);
      }
      if ((paramString.indexOf('.') < 0) && (!TextUtils.isEmpty(a)))
      {
        paramString = a + '.' + paramString;
        continue;
        label230:
        localObject = localMap;
      }
    }
  }
  
  private static void a(Rect paramRect)
  {
    paramRect.setEmpty();
    f.a(paramRect);
  }
  
  private void a(d paramd, Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = Math.max(getPaddingLeft() + paramd.leftMargin, Math.min(paramRect.left, i1 - getPaddingRight() - paramInt1 - paramd.rightMargin));
    int i4 = Math.max(getPaddingTop() + paramd.topMargin, Math.min(paramRect.top, i2 - getPaddingBottom() - paramInt2 - paramd.bottomMargin));
    paramRect.set(i3, i4, i3 + paramInt1, i4 + paramInt2);
  }
  
  private void a(View paramView, int paramInt1, Rect paramRect1, Rect paramRect2, d paramd, int paramInt2, int paramInt3)
  {
    int i1 = d.a(e(paramd.c), paramInt1);
    int i2 = d.a(c(paramd.d), paramInt1);
    int i3 = i1 & 0x7;
    int i4 = i1 & 0x70;
    int i5 = i2 & 0x7;
    int i6 = i2 & 0x70;
    int i7;
    int i8;
    switch (i5)
    {
    default: 
      i7 = paramRect1.left;
      switch (i6)
      {
      default: 
        i8 = paramRect1.top;
        switch (i3)
        {
        default: 
          i7 -= paramInt2;
        case 5: 
          label126:
          switch (i4)
          {
          default: 
            i8 -= paramInt3;
          }
          label163:
          break;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      paramRect2.set(i7, i8, i7 + paramInt2, i8 + paramInt3);
      return;
      i7 = paramRect1.right;
      break;
      i7 = paramRect1.left + paramRect1.width() / 2;
      break;
      i8 = paramRect1.bottom;
      break label126;
      i8 = paramRect1.top + paramRect1.height() / 2;
      break label126;
      i7 -= paramInt2 / 2;
      break label163;
      i8 -= paramInt3 / 2;
    }
  }
  
  private void a(View paramView, Rect paramRect, int paramInt)
  {
    if (!android.support.v4.view.s.x(paramView)) {}
    while ((paramView.getWidth() <= 0) || (paramView.getHeight() <= 0)) {
      return;
    }
    d locald = (d)paramView.getLayoutParams();
    Behavior localBehavior = locald.b();
    Rect localRect1 = e();
    Rect localRect2 = e();
    localRect2.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    if ((localBehavior != null) && (localBehavior.a(this, paramView, localRect1)))
    {
      if (!localRect2.contains(localRect1)) {
        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + localRect1.toShortString() + " | Bounds:" + localRect2.toShortString());
      }
    }
    else {
      localRect1.set(localRect2);
    }
    a(localRect2);
    if (localRect1.isEmpty())
    {
      a(localRect1);
      return;
    }
    int i1 = d.a(locald.h, paramInt);
    if ((i1 & 0x30) == 48)
    {
      int i8 = localRect1.top - locald.topMargin - locald.j;
      if (i8 < paramRect.top) {
        f(paramView, paramRect.top - i8);
      }
    }
    for (int i2 = 1;; i2 = 0)
    {
      if ((i1 & 0x50) == 80)
      {
        int i7 = getHeight() - localRect1.bottom - locald.bottomMargin + locald.j;
        if (i7 < paramRect.bottom)
        {
          f(paramView, i7 - paramRect.bottom);
          i2 = 1;
        }
      }
      if (i2 == 0) {
        f(paramView, 0);
      }
      if ((i1 & 0x3) == 3)
      {
        int i6 = localRect1.left - locald.leftMargin - locald.i;
        if (i6 < paramRect.left) {
          e(paramView, paramRect.left - i6);
        }
      }
      for (int i3 = 1;; i3 = 0)
      {
        if ((i1 & 0x5) == 5)
        {
          int i5 = getWidth() - localRect1.right - locald.rightMargin + locald.i;
          if (i5 < paramRect.right) {
            e(paramView, i5 - paramRect.right);
          }
        }
        for (int i4 = 1;; i4 = i3)
        {
          if (i4 == 0) {
            e(paramView, 0);
          }
          a(localRect1);
          return;
        }
      }
    }
  }
  
  private void a(View paramView1, View paramView2, int paramInt)
  {
    ((d)paramView1.getLayoutParams());
    Rect localRect1 = e();
    Rect localRect2 = e();
    try
    {
      a(paramView2, localRect1);
      a(paramView1, paramInt, localRect1, localRect2);
      paramView1.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
      return;
    }
    finally
    {
      a(localRect1);
      a(localRect2);
    }
  }
  
  private void a(List<View> paramList)
  {
    paramList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int i1 = getChildCount();
    int i2 = i1 - 1;
    if (i2 >= 0)
    {
      if (bool) {}
      for (int i3 = getChildDrawingOrder(i1, i2);; i3 = i2)
      {
        paramList.add(getChildAt(i3));
        i2--;
        break;
      }
    }
    if (d != null) {
      Collections.sort(paramList, d);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      Behavior localBehavior = ((d)localView.getLayoutParams()).b();
      MotionEvent localMotionEvent;
      if (localBehavior != null)
      {
        long l1 = SystemClock.uptimeMillis();
        localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        if (!paramBoolean) {
          break label81;
        }
        localBehavior.a(this, localView, localMotionEvent);
      }
      for (;;)
      {
        localMotionEvent.recycle();
        i2++;
        break;
        label81:
        localBehavior.b(this, localView, localMotionEvent);
      }
    }
    for (int i3 = 0; i3 < i1; i3++) {
      ((d)getChildAt(i3).getLayoutParams()).f();
    }
    this.p = null;
    this.m = false;
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = false;
    int i1 = 0;
    Object localObject1 = null;
    int i2 = paramMotionEvent.getActionMasked();
    List localList = this.i;
    a(localList);
    int i3 = localList.size();
    int i4 = 0;
    View localView;
    Behavior localBehavior;
    Object localObject3;
    int i6;
    boolean bool2;
    label147:
    label224:
    int i5;
    if (i4 < i3)
    {
      localView = (View)localList.get(i4);
      d locald = (d)localView.getLayoutParams();
      localBehavior = locald.b();
      if (((bool1) || (i1 != 0)) && (i2 != 0))
      {
        if (localBehavior == null) {
          break label341;
        }
        if (localObject1 == null)
        {
          long l1 = SystemClock.uptimeMillis();
          localObject3 = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
          switch (paramInt)
          {
          }
          for (;;)
          {
            i6 = i1;
            bool2 = bool1;
            i4++;
            i1 = i6;
            bool1 = bool2;
            localObject1 = localObject3;
            break;
            localBehavior.a(this, localView, (MotionEvent)localObject3);
            continue;
            localBehavior.b(this, localView, (MotionEvent)localObject3);
          }
        }
      }
      else
      {
        if ((!bool1) && (localBehavior != null)) {}
        switch (paramInt)
        {
        default: 
          if (bool1) {
            this.p = localView;
          }
          bool2 = bool1;
          boolean bool3 = locald.e();
          boolean bool4 = locald.a(this, localView);
          if ((bool4) && (!bool3))
          {
            i5 = 1;
            label267:
            if ((!bool4) || (i5 != 0)) {
              break label319;
            }
          }
          break;
        }
      }
    }
    for (;;)
    {
      localList.clear();
      return bool2;
      bool1 = localBehavior.a(this, localView, paramMotionEvent);
      break label224;
      bool1 = localBehavior.b(this, localView, paramMotionEvent);
      break label224;
      i5 = 0;
      break label267;
      label319:
      Object localObject2 = localObject1;
      i6 = i5;
      localObject3 = localObject2;
      break label147;
      localObject3 = localObject1;
      break;
      label341:
      localObject3 = localObject1;
      bool2 = bool1;
      i6 = i1;
      break label147;
      bool2 = bool1;
    }
  }
  
  private int b(int paramInt)
  {
    if (this.o == null)
    {
      Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + paramInt);
      return 0;
    }
    if ((paramInt < 0) || (paramInt >= this.o.length))
    {
      Log.e("CoordinatorLayout", "Keyline index " + paramInt + " out of range for " + this);
      return 0;
    }
    return this.o[paramInt];
  }
  
  private aa b(aa paramaa)
  {
    if (paramaa.f()) {
      return paramaa;
    }
    int i1 = getChildCount();
    int i2 = 0;
    Object localObject1 = paramaa;
    Object localObject2;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (android.support.v4.view.s.q(localView))
      {
        Behavior localBehavior = ((d)localView.getLayoutParams()).b();
        if (localBehavior != null)
        {
          localObject2 = localBehavior.a(this, localView, (aa)localObject1);
          if (!((aa)localObject2).f()) {
            break label84;
          }
        }
      }
    }
    for (;;)
    {
      return localObject2;
      localObject2 = localObject1;
      label84:
      i2++;
      localObject1 = localObject2;
      break;
      localObject2 = localObject1;
    }
  }
  
  private void b(View paramView, int paramInt1, int paramInt2)
  {
    d locald = (d)paramView.getLayoutParams();
    int i1 = d.a(d(locald.c), paramInt2);
    int i2 = i1 & 0x7;
    int i3 = i1 & 0x70;
    int i4 = getWidth();
    int i5 = getHeight();
    int i6 = paramView.getMeasuredWidth();
    int i7 = paramView.getMeasuredHeight();
    if (paramInt2 == 1) {
      paramInt1 = i4 - paramInt1;
    }
    int i8 = b(paramInt1) - i6;
    int i9;
    switch (i2)
    {
    default: 
      i9 = 0;
      switch (i3)
      {
      }
      break;
    }
    for (;;)
    {
      int i10 = Math.max(getPaddingLeft() + locald.leftMargin, Math.min(i8, i4 - getPaddingRight() - i6 - locald.rightMargin));
      int i11 = Math.max(getPaddingTop() + locald.topMargin, Math.min(i9, i5 - getPaddingBottom() - i7 - locald.bottomMargin));
      paramView.layout(i10, i11, i10 + i6, i11 + i7);
      return;
      i8 += i6;
      break;
      i8 += i6 / 2;
      break;
      i9 = 0 + i7;
      continue;
      i9 = 0 + i7 / 2;
    }
  }
  
  private static int c(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {}
    for (int i1 = 0x800003 | paramInt;; i1 = paramInt)
    {
      if ((i1 & 0x70) == 0) {
        i1 |= 0x30;
      }
      return i1;
    }
  }
  
  private static int d(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = 8388661;
    }
    return paramInt;
  }
  
  private void d(View paramView, int paramInt)
  {
    d locald = (d)paramView.getLayoutParams();
    Rect localRect1 = e();
    localRect1.set(getPaddingLeft() + locald.leftMargin, getPaddingTop() + locald.topMargin, getWidth() - getPaddingRight() - locald.rightMargin, getHeight() - getPaddingBottom() - locald.bottomMargin);
    if ((this.t != null) && (android.support.v4.view.s.q(this)) && (!android.support.v4.view.s.q(paramView)))
    {
      localRect1.left += this.t.a();
      localRect1.top += this.t.b();
      localRect1.right -= this.t.c();
      localRect1.bottom -= this.t.d();
    }
    Rect localRect2 = e();
    d.a(c(locald.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect1, localRect2, paramInt);
    paramView.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
    a(localRect1);
    a(localRect2);
  }
  
  private static int e(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = 17;
    }
    return paramInt;
  }
  
  private static Rect e()
  {
    Rect localRect = (Rect)f.a();
    if (localRect == null) {
      localRect = new Rect();
    }
    return localRect;
  }
  
  private void e(View paramView, int paramInt)
  {
    d locald = (d)paramView.getLayoutParams();
    if (locald.i != paramInt)
    {
      android.support.v4.view.s.d(paramView, paramInt - locald.i);
      locald.i = paramInt;
    }
  }
  
  private boolean e(View paramView)
  {
    return this.h.e(paramView);
  }
  
  private void f()
  {
    this.g.clear();
    this.h.a();
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView1 = getChildAt(i2);
      d locald = a(localView1);
      locald.b(this, localView1);
      this.h.a(localView1);
      int i3 = 0;
      if (i3 < i1)
      {
        if (i3 == i2) {}
        for (;;)
        {
          i3++;
          break;
          View localView2 = getChildAt(i3);
          if (locald.a(this, localView1, localView2))
          {
            if (!this.h.b(localView2)) {
              this.h.a(localView2);
            }
            this.h.a(localView2, localView1);
          }
        }
      }
    }
    this.g.addAll(this.h.b());
    Collections.reverse(this.g);
  }
  
  private void f(View paramView, int paramInt)
  {
    d locald = (d)paramView.getLayoutParams();
    if (locald.j != paramInt)
    {
      android.support.v4.view.s.c(paramView, paramInt - locald.j);
      locald.j = paramInt;
    }
  }
  
  private void g()
  {
    if (Build.VERSION.SDK_INT < 21) {
      return;
    }
    if (android.support.v4.view.s.q(this))
    {
      if (this.w == null) {
        this.w = new o()
        {
          public aa a(View paramAnonymousView, aa paramAnonymousaa)
          {
            return CoordinatorLayout.this.a(paramAnonymousaa);
          }
        };
      }
      android.support.v4.view.s.a(this, this.w);
      setSystemUiVisibility(1280);
      return;
    }
    android.support.v4.view.s.a(this, null);
  }
  
  public d a(AttributeSet paramAttributeSet)
  {
    return new d(getContext(), paramAttributeSet);
  }
  
  d a(View paramView)
  {
    d locald = (d)paramView.getLayoutParams();
    if (!locald.b)
    {
      if ((paramView instanceof a))
      {
        Behavior localBehavior = ((a)paramView).a();
        if (localBehavior == null) {
          Log.e("CoordinatorLayout", "Attached behavior class is null");
        }
        locald.a(localBehavior);
        locald.b = true;
      }
    }
    else {
      return locald;
    }
    Class localClass = paramView.getClass();
    b localb1 = null;
    while (localClass != null)
    {
      localb1 = (b)localClass.getAnnotation(b.class);
      if (localb1 != null) {
        break;
      }
      localClass = localClass.getSuperclass();
    }
    b localb2 = localb1;
    if (localb2 != null) {}
    try
    {
      locald.a((Behavior)localb2.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      locald.b = true;
      return locald;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("CoordinatorLayout", "Default behavior class " + localb2.a().getName() + " could not be instantiated. Did you forget" + " a default constructor?", localException);
      }
    }
  }
  
  protected d a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof d)) {
      return new d((d)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new d((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new d(paramLayoutParams);
  }
  
  final aa a(aa paramaa)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!i.a(this.t, paramaa))
    {
      this.t = paramaa;
      if ((paramaa == null) || (paramaa.b() <= 0)) {
        break label67;
      }
      bool2 = bool1;
      this.u = bool2;
      if ((this.u) || (getBackground() != null)) {
        break label72;
      }
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      paramaa = b(paramaa);
      requestLayout();
      return paramaa;
      label67:
      bool2 = false;
      break;
      label72:
      bool1 = false;
    }
  }
  
  void a()
  {
    int i1 = getChildCount();
    for (int i2 = 0;; i2++)
    {
      int i3 = 0;
      if (i2 < i1)
      {
        if (e(getChildAt(i2))) {
          i3 = 1;
        }
      }
      else
      {
        if (i3 != this.s)
        {
          if (i3 == 0) {
            break;
          }
          b();
        }
        return;
      }
    }
    c();
  }
  
  final void a(int paramInt)
  {
    int i1 = android.support.v4.view.s.e(this);
    int i2 = this.g.size();
    Rect localRect1 = e();
    Rect localRect2 = e();
    Rect localRect3 = e();
    int i3 = 0;
    while (i3 < i2)
    {
      View localView1 = (View)this.g.get(i3);
      d locald1 = (d)localView1.getLayoutParams();
      if ((paramInt == 0) && (localView1.getVisibility() == 8))
      {
        i3++;
      }
      else
      {
        for (int i4 = 0; i4 < i3; i4++)
        {
          View localView3 = (View)this.g.get(i4);
          if (locald1.l == localView3) {
            b(localView1, i1);
          }
        }
        a(localView1, true, localRect2);
        if ((locald1.g != 0) && (!localRect2.isEmpty()))
        {
          int i6 = d.a(locald1.g, i1);
          switch (i6 & 0x70)
          {
          default: 
            label200:
            switch (i6 & 0x7)
            {
            }
            break;
          }
        }
        View localView2;
        d locald2;
        Behavior localBehavior;
        for (;;)
        {
          if ((locald1.h != 0) && (localView1.getVisibility() == 0)) {
            a(localView1, localRect1, i1);
          }
          if (paramInt != 2)
          {
            c(localView1, localRect3);
            if (localRect3.equals(localRect2)) {
              break;
            }
            b(localView1, localRect2);
          }
          for (int i5 = i3 + 1; i5 < i2; i5++)
          {
            localView2 = (View)this.g.get(i5);
            locald2 = (d)localView2.getLayoutParams();
            localBehavior = locald2.b();
            if ((localBehavior != null) && (localBehavior.a(this, localView2, localView1)))
            {
              if ((paramInt != 0) || (!locald2.g())) {
                break label468;
              }
              locald2.h();
            }
          }
          localRect1.top = Math.max(localRect1.top, localRect2.bottom);
          break label200;
          localRect1.bottom = Math.max(localRect1.bottom, getHeight() - localRect2.top);
          break label200;
          localRect1.left = Math.max(localRect1.left, localRect2.right);
          continue;
          localRect1.right = Math.max(localRect1.right, getWidth() - localRect2.left);
        }
        label468:
        switch (paramInt)
        {
        }
        for (boolean bool = localBehavior.b(this, localView2, localView1); paramInt == 1; bool = true)
        {
          locald2.a(bool);
          break;
          localBehavior.d(this, localView2, localView1);
        }
      }
    }
    a(localRect1);
    a(localRect2);
    a(localRect3);
  }
  
  public void a(View paramView, int paramInt)
  {
    d locald = (d)paramView.getLayoutParams();
    if (locald.d()) {
      throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }
    if (locald.k != null)
    {
      a(paramView, locald.k, paramInt);
      return;
    }
    if (locald.e >= 0)
    {
      b(paramView, locald.e, paramInt);
      return;
    }
    d(paramView, paramInt);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i3 = 0;
    View localView;
    int i4;
    if (i3 < i1)
    {
      localView = getChildAt(i3);
      if (localView.getVisibility() == 8) {
        i4 = i2;
      }
    }
    for (;;)
    {
      i3++;
      i2 = i4;
      break;
      d locald = (d)localView.getLayoutParams();
      if (!locald.b(paramInt5))
      {
        i4 = i2;
      }
      else
      {
        Behavior localBehavior = locald.b();
        if (localBehavior != null)
        {
          localBehavior.a(this, localView, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
          i4 = 1;
          continue;
          if (i2 != 0) {
            a(1);
          }
        }
        else
        {
          i4 = i2;
        }
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = getChildCount();
    int i5 = 0;
    View localView;
    int i6;
    int i7;
    int i8;
    if (i5 < i4)
    {
      localView = getChildAt(i5);
      if (localView.getVisibility() == 8)
      {
        i6 = i3;
        i7 = i1;
        i8 = i2;
      }
    }
    for (;;)
    {
      i5++;
      i2 = i8;
      i1 = i7;
      i3 = i6;
      break;
      d locald = (d)localView.getLayoutParams();
      if (!locald.b(paramInt3))
      {
        i6 = i3;
        i7 = i1;
        i8 = i2;
      }
      else
      {
        Behavior localBehavior = locald.b();
        if (localBehavior != null)
        {
          int[] arrayOfInt = this.k;
          this.k[1] = 0;
          arrayOfInt[0] = 0;
          localBehavior.a(this, localView, paramView, paramInt1, paramInt2, this.k, paramInt3);
          if (paramInt1 > 0)
          {
            i7 = Math.max(i1, this.k[0]);
            label172:
            if (paramInt2 <= 0) {
              break label215;
            }
          }
          label215:
          for (int i9 = Math.max(i2, this.k[1]);; i9 = Math.min(i2, this.k[1]))
          {
            i8 = i9;
            i6 = 1;
            break;
            i7 = Math.min(i1, this.k[0]);
            break label172;
          }
          paramArrayOfInt[0] = i1;
          paramArrayOfInt[1] = i2;
          if (i3 != 0) {
            a(1);
          }
          return;
        }
        i6 = i3;
        i7 = i1;
        i8 = i2;
      }
    }
  }
  
  void a(View paramView, int paramInt, Rect paramRect1, Rect paramRect2)
  {
    d locald = (d)paramView.getLayoutParams();
    int i1 = paramView.getMeasuredWidth();
    int i2 = paramView.getMeasuredHeight();
    a(paramView, paramInt, paramRect1, paramRect2, locald, i1, i2);
    a(locald, paramRect2, i1, i2);
  }
  
  void a(View paramView, Rect paramRect)
  {
    android.support.v4.widget.s.b(this, paramView, paramRect);
  }
  
  void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    if ((paramView.isLayoutRequested()) || (paramView.getVisibility() == 8))
    {
      paramRect.setEmpty();
      return;
    }
    if (paramBoolean)
    {
      a(paramView, paramRect);
      return;
    }
    paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  public boolean a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = e();
    a(paramView, localRect);
    try
    {
      boolean bool = localRect.contains(paramInt1, paramInt2);
      return bool;
    }
    finally
    {
      a(localRect);
    }
  }
  
  public boolean a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      boolean bool2;
      if (localView.getVisibility() == 8) {
        bool2 = bool1;
      }
      for (;;)
      {
        i2++;
        bool1 = bool2;
        break;
        d locald = (d)localView.getLayoutParams();
        Behavior localBehavior = locald.b();
        if (localBehavior != null)
        {
          boolean bool3 = localBehavior.a(this, localView, paramView1, paramView2, paramInt1, paramInt2);
          bool2 = bool1 | bool3;
          locald.a(paramInt2, bool3);
        }
        else
        {
          locald.a(paramInt2, false);
          bool2 = bool1;
        }
      }
    }
    return bool1;
  }
  
  void b()
  {
    if (this.n)
    {
      if (this.r == null) {
        this.r = new e();
      }
      getViewTreeObserver().addOnPreDrawListener(this.r);
    }
    this.s = true;
  }
  
  public void b(View paramView)
  {
    List localList = this.h.c(paramView);
    if ((localList != null) && (!localList.isEmpty())) {
      for (int i1 = 0; i1 < localList.size(); i1++)
      {
        View localView = (View)localList.get(i1);
        Behavior localBehavior = ((d)localView.getLayoutParams()).b();
        if (localBehavior != null) {
          localBehavior.b(this, localView, paramView);
        }
      }
    }
  }
  
  void b(View paramView, int paramInt)
  {
    d locald = (d)paramView.getLayoutParams();
    Rect localRect1;
    Rect localRect2;
    Rect localRect3;
    int i1;
    int i2;
    if (locald.k != null)
    {
      localRect1 = e();
      localRect2 = e();
      localRect3 = e();
      a(locald.k, localRect1);
      a(paramView, false, localRect2);
      i1 = paramView.getMeasuredWidth();
      i2 = paramView.getMeasuredHeight();
      a(paramView, paramInt, localRect1, localRect3, locald, i1, i2);
      if ((localRect3.left == localRect2.left) && (localRect3.top == localRect2.top)) {
        break label207;
      }
    }
    label207:
    for (int i3 = 1;; i3 = 0)
    {
      a(locald, localRect3, i1, i2);
      int i4 = localRect3.left - localRect2.left;
      int i5 = localRect3.top - localRect2.top;
      if (i4 != 0) {
        android.support.v4.view.s.d(paramView, i4);
      }
      if (i5 != 0) {
        android.support.v4.view.s.c(paramView, i5);
      }
      if (i3 != 0)
      {
        Behavior localBehavior = locald.b();
        if (localBehavior != null) {
          localBehavior.b(this, paramView, locald.k);
        }
      }
      a(localRect1);
      a(localRect2);
      a(localRect3);
      return;
    }
  }
  
  void b(View paramView, Rect paramRect)
  {
    ((d)paramView.getLayoutParams()).a(paramRect);
  }
  
  public void b(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    this.x.a(paramView1, paramView2, paramInt1, paramInt2);
    this.q = paramView2;
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      d locald = (d)localView.getLayoutParams();
      if (!locald.b(paramInt2)) {}
      for (;;)
      {
        i2++;
        break;
        Behavior localBehavior = locald.b();
        if (localBehavior != null) {
          localBehavior.b(this, localView, paramView1, paramView2, paramInt1, paramInt2);
        }
      }
    }
  }
  
  public List<View> c(View paramView)
  {
    List localList = this.h.d(paramView);
    this.j.clear();
    if (localList != null) {
      this.j.addAll(localList);
    }
    return this.j;
  }
  
  void c()
  {
    if ((this.n) && (this.r != null)) {
      getViewTreeObserver().removeOnPreDrawListener(this.r);
    }
    this.s = false;
  }
  
  public void c(View paramView, int paramInt)
  {
    this.x.a(paramView, paramInt);
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      d locald = (d)localView.getLayoutParams();
      if (!locald.b(paramInt)) {}
      for (;;)
      {
        i2++;
        break;
        Behavior localBehavior = locald.b();
        if (localBehavior != null) {
          localBehavior.a(this, localView, paramView, paramInt);
        }
        locald.a(paramInt);
        locald.h();
      }
    }
    this.q = null;
  }
  
  void c(View paramView, Rect paramRect)
  {
    paramRect.set(((d)paramView.getLayoutParams()).c());
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof d)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  protected d d()
  {
    return new d(-2, -2);
  }
  
  public List<View> d(View paramView)
  {
    List localList = this.h.c(paramView);
    this.j.clear();
    if (localList != null) {
      this.j.addAll(localList);
    }
    return this.j;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    d locald = (d)paramView.getLayoutParams();
    if (locald.a != null)
    {
      float f1 = locald.a.d(this, paramView);
      if (f1 > 0.0F)
      {
        if (this.l == null) {
          this.l = new Paint();
        }
        this.l.setColor(locald.a.c(this, paramView));
        this.l.setAlpha(android.support.v4.c.a.a(Math.round(f1 * 255.0F), 0, 255));
        int i1 = paramCanvas.save();
        if (paramView.isOpaque()) {
          paramCanvas.clipRect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom(), Region.Op.DIFFERENCE);
        }
        paramCanvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.l);
        paramCanvas.restoreToCount(i1);
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable localDrawable = this.v;
    boolean bool1 = false;
    if (localDrawable != null)
    {
      boolean bool2 = localDrawable.isStateful();
      bool1 = false;
      if (bool2) {
        bool1 = false | localDrawable.setState(arrayOfInt);
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  final List<View> getDependencySortedChildren()
  {
    f();
    return Collections.unmodifiableList(this.g);
  }
  
  public final aa getLastWindowInsets()
  {
    return this.t;
  }
  
  public int getNestedScrollAxes()
  {
    return this.x.a();
  }
  
  public Drawable getStatusBarBackground()
  {
    return this.v;
  }
  
  protected int getSuggestedMinimumHeight()
  {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }
  
  protected int getSuggestedMinimumWidth()
  {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a(false);
    if (this.s)
    {
      if (this.r == null) {
        this.r = new e();
      }
      getViewTreeObserver().addOnPreDrawListener(this.r);
    }
    if ((this.t == null) && (android.support.v4.view.s.q(this))) {
      android.support.v4.view.s.p(this);
    }
    this.n = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a(false);
    if ((this.s) && (this.r != null)) {
      getViewTreeObserver().removeOnPreDrawListener(this.r);
    }
    if (this.q != null) {
      onStopNestedScroll(this.q);
    }
    this.n = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.u) && (this.v != null)) {
      if (this.t == null) {
        break label61;
      }
    }
    label61:
    for (int i1 = this.t.b();; i1 = 0)
    {
      if (i1 > 0)
      {
        this.v.setBounds(0, 0, getWidth(), i1);
        this.v.draw(paramCanvas);
      }
      return;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0) {
      a(true);
    }
    boolean bool = a(paramMotionEvent, 0);
    if (0 != 0) {
      null.recycle();
    }
    if ((i1 == 1) || (i1 == 3)) {
      a(true);
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = android.support.v4.view.s.e(this);
    int i2 = this.g.size();
    int i3 = 0;
    if (i3 < i2)
    {
      View localView = (View)this.g.get(i3);
      if (localView.getVisibility() == 8) {}
      for (;;)
      {
        i3++;
        break;
        Behavior localBehavior = ((d)localView.getLayoutParams()).b();
        if ((localBehavior == null) || (!localBehavior.a(this, localView, i1))) {
          a(localView, i1);
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    f();
    a();
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    int i3 = getPaddingRight();
    int i4 = getPaddingBottom();
    int i5 = android.support.v4.view.s.e(this);
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    if (i5 == 1)
    {
      i6 = 1;
      i7 = View.MeasureSpec.getMode(paramInt1);
      i8 = View.MeasureSpec.getSize(paramInt1);
      i9 = View.MeasureSpec.getMode(paramInt2);
      i10 = View.MeasureSpec.getSize(paramInt2);
      i11 = i1 + i3;
      i12 = i2 + i4;
      i13 = getSuggestedMinimumWidth();
      i14 = getSuggestedMinimumHeight();
      i15 = 0;
      if ((this.t == null) || (!android.support.v4.view.s.q(this))) {
        break label198;
      }
    }
    View localView;
    int i25;
    int i24;
    int i26;
    label198:
    for (int i16 = 1;; i16 = 0)
    {
      int i17 = this.g.size();
      int i18 = 0;
      for (;;)
      {
        if (i18 >= i17) {
          break label530;
        }
        localView = (View)this.g.get(i18);
        if (localView.getVisibility() != 8) {
          break;
        }
        i25 = i15;
        i24 = i14;
        i26 = i13;
        i18++;
        i15 = i25;
        i14 = i24;
        i13 = i26;
      }
      i6 = 0;
      break;
    }
    d locald = (d)localView.getLayoutParams();
    int i19 = locald.e;
    int i20 = 0;
    int i29;
    int i30;
    if (i19 >= 0)
    {
      i20 = 0;
      if (i7 != 0)
      {
        i29 = b(locald.e);
        i30 = 0x7 & d.a(d(locald.c), i5);
        if (((i30 != 3) || (i6 != 0)) && ((i30 != 5) || (i6 == 0))) {
          break label489;
        }
        i20 = Math.max(0, i8 - i3 - i29);
      }
    }
    label302:
    int i22;
    int i21;
    if ((i16 != 0) && (!android.support.v4.view.s.q(localView)))
    {
      int i27 = this.t.a() + this.t.c();
      int i28 = this.t.b() + this.t.d();
      i22 = View.MeasureSpec.makeMeasureSpec(i8 - i27, i7);
      i21 = View.MeasureSpec.makeMeasureSpec(i10 - i28, i9);
    }
    for (;;)
    {
      Behavior localBehavior = locald.b();
      if ((localBehavior == null) || (!localBehavior.a(this, localView, i22, i20, i21, 0))) {
        a(localView, i22, i20, i21, 0);
      }
      int i23 = Math.max(i13, i11 + localView.getMeasuredWidth() + locald.leftMargin + locald.rightMargin);
      i24 = Math.max(i14, i12 + localView.getMeasuredHeight() + locald.topMargin + locald.bottomMargin);
      i25 = View.combineMeasuredStates(i15, localView.getMeasuredState());
      i26 = i23;
      break;
      label489:
      if ((i30 != 5) || (i6 != 0))
      {
        i20 = 0;
        if (i30 != 3) {
          break label302;
        }
        i20 = 0;
        if (i6 == 0) {
          break label302;
        }
      }
      i20 = Math.max(0, i29 - i1);
      break label302;
      label530:
      setMeasuredDimension(View.resolveSizeAndState(i13, paramInt1, 0xFF000000 & i15), View.resolveSizeAndState(i14, paramInt2, i15 << 16));
      return;
      i21 = paramInt2;
      i22 = paramInt1;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool1 = false;
    View localView;
    boolean bool2;
    if (i2 < i1)
    {
      localView = getChildAt(i2);
      if (localView.getVisibility() == 8) {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      i2++;
      bool1 = bool2;
      break;
      d locald = (d)localView.getLayoutParams();
      if (!locald.b(0))
      {
        bool2 = bool1;
      }
      else
      {
        Behavior localBehavior = locald.b();
        if (localBehavior != null)
        {
          bool2 = bool1 | localBehavior.a(this, localView, paramView, paramFloat1, paramFloat2, paramBoolean);
          continue;
          if (bool1) {
            a(1);
          }
          return bool1;
        }
        else
        {
          bool2 = bool1;
        }
      }
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool1 = false;
    View localView;
    boolean bool2;
    if (i2 < i1)
    {
      localView = getChildAt(i2);
      if (localView.getVisibility() == 8) {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      i2++;
      bool1 = bool2;
      break;
      d locald = (d)localView.getLayoutParams();
      if (!locald.b(0))
      {
        bool2 = bool1;
      }
      else
      {
        Behavior localBehavior = locald.b();
        if (localBehavior != null)
        {
          bool2 = bool1 | localBehavior.a(this, localView, paramView, paramFloat1, paramFloat2);
          continue;
          return bool1;
        }
        else
        {
          bool2 = bool1;
        }
      }
    }
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    b(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      SavedState localSavedState = (SavedState)paramParcelable;
      super.onRestoreInstanceState(localSavedState.getSuperState());
      SparseArray localSparseArray = localSavedState.a;
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        View localView = getChildAt(i2);
        int i3 = localView.getId();
        Behavior localBehavior = a(localView).b();
        if ((i3 != -1) && (localBehavior != null))
        {
          Parcelable localParcelable = (Parcelable)localSparseArray.get(i3);
          if (localParcelable != null) {
            localBehavior.a(this, localView, localParcelable);
          }
        }
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    SparseArray localSparseArray = new SparseArray();
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      int i3 = localView.getId();
      Behavior localBehavior = ((d)localView.getLayoutParams()).b();
      if ((i3 != -1) && (localBehavior != null))
      {
        Parcelable localParcelable = localBehavior.b(this, localView);
        if (localParcelable != null) {
          localSparseArray.append(i3, localParcelable);
        }
      }
    }
    localSavedState.a = localSparseArray;
    return localSavedState;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return a(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView)
  {
    c(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject = null;
    int i1 = paramMotionEvent.getActionMasked();
    boolean bool3;
    if (this.p == null)
    {
      bool3 = a(paramMotionEvent, 1);
      if (!bool3) {}
    }
    for (boolean bool1 = bool3;; bool1 = false)
    {
      Behavior localBehavior = ((d)this.p.getLayoutParams()).b();
      boolean bool2;
      if (localBehavior != null) {
        bool2 = localBehavior.b(this, this.p, paramMotionEvent);
      }
      for (;;)
      {
        if (this.p == null) {
          bool2 |= super.onTouchEvent(paramMotionEvent);
        }
        do
        {
          if (((bool2) || (i1 != 0)) || (localObject != null)) {
            localObject.recycle();
          }
          if ((i1 == 1) || (i1 == 3)) {
            a(false);
          }
          return bool2;
          localObject = null;
        } while (!bool1);
        long l1;
        if (0 == 0) {
          l1 = SystemClock.uptimeMillis();
        }
        for (MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);; localMotionEvent = null)
        {
          super.onTouchEvent(localMotionEvent);
          localObject = localMotionEvent;
          break;
        }
        bool2 = false;
        continue;
        bool1 = bool3;
        bool2 = false;
      }
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    Behavior localBehavior = ((d)paramView.getLayoutParams()).b();
    if ((localBehavior != null) && (localBehavior.a(this, paramView, paramRect, paramBoolean))) {
      return true;
    }
    return super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if ((paramBoolean) && (!this.m))
    {
      a(false);
      this.m = true;
    }
  }
  
  public void setFitsSystemWindows(boolean paramBoolean)
  {
    super.setFitsSystemWindows(paramBoolean);
    g();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    this.e = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    Drawable localDrawable2;
    if (this.v != paramDrawable)
    {
      if (this.v != null) {
        this.v.setCallback(null);
      }
      Drawable localDrawable1 = null;
      if (paramDrawable != null) {
        localDrawable1 = paramDrawable.mutate();
      }
      this.v = localDrawable1;
      if (this.v != null)
      {
        if (this.v.isStateful()) {
          this.v.setState(getDrawableState());
        }
        android.support.v4.a.a.a.b(this.v, android.support.v4.view.s.e(this));
        localDrawable2 = this.v;
        if (getVisibility() != 0) {
          break label118;
        }
      }
    }
    label118:
    for (boolean bool = true;; bool = false)
    {
      localDrawable2.setVisible(bool, false);
      this.v.setCallback(this);
      android.support.v4.view.s.c(this);
      return;
    }
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    setStatusBarBackground(new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v4.content.a.getDrawable(getContext(), paramInt);; localDrawable = null)
    {
      setStatusBarBackground(localDrawable);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if ((this.v != null) && (this.v.isVisible() != bool)) {
        this.v.setVisible(bool, false);
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.v);
  }
  
  public static abstract class Behavior<V extends View>
  {
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet) {}
    
    public aa a(CoordinatorLayout paramCoordinatorLayout, V paramV, aa paramaa)
    {
      return paramaa;
    }
    
    public void a(CoordinatorLayout.d paramd) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt)
    {
      if (paramInt == 0) {
        c(paramCoordinatorLayout, paramV, paramView);
      }
    }
    
    @Deprecated
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      if (paramInt5 == 0) {
        a(paramCoordinatorLayout, paramV, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    @Deprecated
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
    {
      if (paramInt3 == 0) {
        a(paramCoordinatorLayout, paramV, paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, Rect paramRect)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, Rect paramRect, boolean paramBoolean)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return false;
    }
    
    @Deprecated
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        return a(paramCoordinatorLayout, paramV, paramView1, paramView2, paramInt1);
      }
      return false;
    }
    
    public Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return View.BaseSavedState.EMPTY_STATE;
    }
    
    @Deprecated
    public void b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt) {}
    
    public void b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        b(paramCoordinatorLayout, paramV, paramView1, paramView2, paramInt1);
      }
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
    {
      return false;
    }
    
    public int c(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return -16777216;
    }
    
    public void c() {}
    
    @Deprecated
    public void c(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
    
    public float d(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return 0.0F;
    }
    
    public void d(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
    
    public boolean e(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return d(paramCoordinatorLayout, paramV) > 0.0F;
    }
  }
  
  protected static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public CoordinatorLayout.SavedState a(Parcel paramAnonymousParcel)
      {
        return new CoordinatorLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public CoordinatorLayout.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new CoordinatorLayout.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public CoordinatorLayout.SavedState[] a(int paramAnonymousInt)
      {
        return new CoordinatorLayout.SavedState[paramAnonymousInt];
      }
    };
    SparseArray<Parcelable> a;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      int i = paramParcel.readInt();
      int[] arrayOfInt = new int[i];
      paramParcel.readIntArray(arrayOfInt);
      Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(paramClassLoader);
      this.a = new SparseArray(i);
      for (int j = 0; j < i; j++) {
        this.a.append(arrayOfInt[j], arrayOfParcelable[j]);
      }
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 0;
      super.writeToParcel(paramParcel, paramInt);
      if (this.a != null) {}
      int[] arrayOfInt;
      Parcelable[] arrayOfParcelable;
      for (int j = this.a.size();; j = 0)
      {
        paramParcel.writeInt(j);
        arrayOfInt = new int[j];
        arrayOfParcelable = new Parcelable[j];
        while (i < j)
        {
          arrayOfInt[i] = this.a.keyAt(i);
          arrayOfParcelable[i] = ((Parcelable)this.a.valueAt(i));
          i++;
        }
      }
      paramParcel.writeIntArray(arrayOfInt);
      paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
    }
  }
  
  public static abstract interface a
  {
    public abstract CoordinatorLayout.Behavior a();
  }
  
  @Deprecated
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface b
  {
    Class<? extends CoordinatorLayout.Behavior> a();
  }
  
  private class c
    implements ViewGroup.OnHierarchyChangeListener
  {
    c() {}
    
    public void onChildViewAdded(View paramView1, View paramView2)
    {
      if (CoordinatorLayout.this.e != null) {
        CoordinatorLayout.this.e.onChildViewAdded(paramView1, paramView2);
      }
    }
    
    public void onChildViewRemoved(View paramView1, View paramView2)
    {
      CoordinatorLayout.this.a(2);
      if (CoordinatorLayout.this.e != null) {
        CoordinatorLayout.this.e.onChildViewRemoved(paramView1, paramView2);
      }
    }
  }
  
  public static class d
    extends ViewGroup.MarginLayoutParams
  {
    CoordinatorLayout.Behavior a;
    boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    int f = -1;
    public int g = 0;
    public int h = 0;
    int i;
    int j;
    View k;
    View l;
    final Rect m = new Rect();
    Object n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    
    public d(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    d(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.c.CoordinatorLayout_Layout);
      this.c = localTypedArray.getInteger(a.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
      this.f = localTypedArray.getResourceId(a.c.CoordinatorLayout_Layout_layout_anchor, -1);
      this.d = localTypedArray.getInteger(a.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
      this.e = localTypedArray.getInteger(a.c.CoordinatorLayout_Layout_layout_keyline, -1);
      this.g = localTypedArray.getInt(a.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
      this.h = localTypedArray.getInt(a.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
      this.b = localTypedArray.hasValue(a.c.CoordinatorLayout_Layout_layout_behavior);
      if (this.b) {
        this.a = CoordinatorLayout.a(paramContext, paramAttributeSet, localTypedArray.getString(a.c.CoordinatorLayout_Layout_layout_behavior));
      }
      localTypedArray.recycle();
      if (this.a != null) {
        this.a.a(this);
      }
    }
    
    public d(d paramd)
    {
      super();
    }
    
    public d(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public d(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    private void a(View paramView, CoordinatorLayout paramCoordinatorLayout)
    {
      this.k = paramCoordinatorLayout.findViewById(this.f);
      if (this.k != null)
      {
        if (this.k == paramCoordinatorLayout)
        {
          if (paramCoordinatorLayout.isInEditMode())
          {
            this.l = null;
            this.k = null;
            return;
          }
          throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
        }
        View localView = this.k;
        for (ViewParent localViewParent = this.k.getParent(); (localViewParent != paramCoordinatorLayout) && (localViewParent != null); localViewParent = localViewParent.getParent())
        {
          if (localViewParent == paramView)
          {
            if (paramCoordinatorLayout.isInEditMode())
            {
              this.l = null;
              this.k = null;
              return;
            }
            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
          }
          if ((localViewParent instanceof View)) {
            localView = (View)localViewParent;
          }
        }
        this.l = localView;
        return;
      }
      if (paramCoordinatorLayout.isInEditMode())
      {
        this.l = null;
        this.k = null;
        return;
      }
      throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + paramCoordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + paramView);
    }
    
    private boolean a(View paramView, int paramInt)
    {
      int i1 = d.a(((d)paramView.getLayoutParams()).g, paramInt);
      return (i1 != 0) && ((i1 & d.a(this.h, paramInt)) == i1);
    }
    
    private boolean b(View paramView, CoordinatorLayout paramCoordinatorLayout)
    {
      if (this.k.getId() != this.f) {
        return false;
      }
      View localView = this.k;
      for (ViewParent localViewParent = this.k.getParent(); localViewParent != paramCoordinatorLayout; localViewParent = localViewParent.getParent())
      {
        if ((localViewParent == null) || (localViewParent == paramView))
        {
          this.l = null;
          this.k = null;
          return false;
        }
        if ((localViewParent instanceof View)) {
          localView = (View)localViewParent;
        }
      }
      this.l = localView;
      return true;
    }
    
    public int a()
    {
      return this.f;
    }
    
    void a(int paramInt)
    {
      a(paramInt, false);
    }
    
    void a(int paramInt, boolean paramBoolean)
    {
      switch (paramInt)
      {
      default: 
        return;
      case 0: 
        this.p = paramBoolean;
        return;
      }
      this.q = paramBoolean;
    }
    
    void a(Rect paramRect)
    {
      this.m.set(paramRect);
    }
    
    public void a(CoordinatorLayout.Behavior paramBehavior)
    {
      if (this.a != paramBehavior)
      {
        if (this.a != null) {
          this.a.c();
        }
        this.a = paramBehavior;
        this.n = null;
        this.b = true;
        if (paramBehavior != null) {
          paramBehavior.a(this);
        }
      }
    }
    
    void a(boolean paramBoolean)
    {
      this.r = paramBoolean;
    }
    
    boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView)
    {
      if (this.o) {
        return true;
      }
      boolean bool1 = this.o;
      if (this.a != null) {}
      for (boolean bool2 = this.a.e(paramCoordinatorLayout, paramView);; bool2 = false)
      {
        boolean bool3 = bool2 | bool1;
        this.o = bool3;
        return bool3;
      }
    }
    
    boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      return (paramView2 == this.l) || (a(paramView2, android.support.v4.view.s.e(paramCoordinatorLayout))) || ((this.a != null) && (this.a.a(paramCoordinatorLayout, paramView1, paramView2)));
    }
    
    public CoordinatorLayout.Behavior b()
    {
      return this.a;
    }
    
    View b(CoordinatorLayout paramCoordinatorLayout, View paramView)
    {
      if (this.f == -1)
      {
        this.l = null;
        this.k = null;
        return null;
      }
      if ((this.k == null) || (!b(paramView, paramCoordinatorLayout))) {
        a(paramView, paramCoordinatorLayout);
      }
      return this.k;
    }
    
    boolean b(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return false;
      case 0: 
        return this.p;
      }
      return this.q;
    }
    
    Rect c()
    {
      return this.m;
    }
    
    boolean d()
    {
      return (this.k == null) && (this.f != -1);
    }
    
    boolean e()
    {
      if (this.a == null) {
        this.o = false;
      }
      return this.o;
    }
    
    void f()
    {
      this.o = false;
    }
    
    boolean g()
    {
      return this.r;
    }
    
    void h()
    {
      this.r = false;
    }
  }
  
  class e
    implements ViewTreeObserver.OnPreDrawListener
  {
    e() {}
    
    public boolean onPreDraw()
    {
      CoordinatorLayout.this.a(0);
      return true;
    }
  }
  
  static class f
    implements Comparator<View>
  {
    public int a(View paramView1, View paramView2)
    {
      float f1 = android.support.v4.view.s.y(paramView1);
      float f2 = android.support.v4.view.s.y(paramView2);
      if (f1 > f2) {
        return -1;
      }
      if (f1 < f2) {
        return 1;
      }
      return 0;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.CoordinatorLayout
 * JD-Core Version:    0.7.0.1
 */