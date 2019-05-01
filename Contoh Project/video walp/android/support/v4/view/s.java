package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class s
{
  static final j a = new j();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      a = new i();
      return;
    }
    if (Build.VERSION.SDK_INT >= 24)
    {
      a = new h();
      return;
    }
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new g();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new f();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new e();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      a = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new a();
      return;
    }
  }
  
  public static boolean A(View paramView)
  {
    return a.s(paramView);
  }
  
  public static boolean B(View paramView)
  {
    return a.a(paramView);
  }
  
  public static Display C(View paramView)
  {
    return a.p(paramView);
  }
  
  public static aa a(View paramView, aa paramaa)
  {
    return a.a(paramView, paramaa);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt)
  {
    a.a(paramView, paramInt);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2)
  {
    a.a(paramView, paramInt1, paramInt2);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    a.a(paramView, paramColorStateList);
  }
  
  public static void a(View paramView, Paint paramPaint)
  {
    a.a(paramView, paramPaint);
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    a.a(paramView, paramMode);
  }
  
  public static void a(View paramView, Rect paramRect)
  {
    a.a(paramView, paramRect);
  }
  
  public static void a(View paramView, Drawable paramDrawable)
  {
    a.a(paramView, paramDrawable);
  }
  
  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }
  
  public static void a(View paramView, o paramo)
  {
    a.a(paramView, paramo);
  }
  
  public static void a(View paramView, q paramq)
  {
    a.a(paramView, paramq);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, String paramString)
  {
    a.a(paramView, paramString);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }
  
  public static boolean a(View paramView)
  {
    return a.B(paramView);
  }
  
  public static aa b(View paramView, aa paramaa)
  {
    return a.b(paramView, paramaa);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }
  
  public static void b(View paramView, int paramInt)
  {
    a.b(paramView, paramInt);
  }
  
  public static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.b(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @Deprecated
  public static void b(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static void c(View paramView)
  {
    a.c(paramView);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.d(paramView, paramInt);
  }
  
  public static int d(View paramView)
  {
    return a.d(paramView);
  }
  
  public static void d(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static int e(View paramView)
  {
    return a.k(paramView);
  }
  
  public static ViewParent f(View paramView)
  {
    return a.e(paramView);
  }
  
  public static int g(View paramView)
  {
    return a.l(paramView);
  }
  
  public static int h(View paramView)
  {
    return a.m(paramView);
  }
  
  public static int i(View paramView)
  {
    return a.f(paramView);
  }
  
  public static int j(View paramView)
  {
    return a.g(paramView);
  }
  
  public static w k(View paramView)
  {
    return a.C(paramView);
  }
  
  public static float l(View paramView)
  {
    return a.u(paramView);
  }
  
  public static float m(View paramView)
  {
    return a.v(paramView);
  }
  
  public static String n(View paramView)
  {
    return a.t(paramView);
  }
  
  public static int o(View paramView)
  {
    return a.n(paramView);
  }
  
  public static void p(View paramView)
  {
    a.h(paramView);
  }
  
  public static boolean q(View paramView)
  {
    return a.i(paramView);
  }
  
  public static boolean r(View paramView)
  {
    return a.j(paramView);
  }
  
  public static boolean s(View paramView)
  {
    return a.o(paramView);
  }
  
  public static ColorStateList t(View paramView)
  {
    return a.y(paramView);
  }
  
  public static PorterDuff.Mode u(View paramView)
  {
    return a.z(paramView);
  }
  
  public static boolean v(View paramView)
  {
    return a.w(paramView);
  }
  
  public static void w(View paramView)
  {
    a.x(paramView);
  }
  
  public static boolean x(View paramView)
  {
    return a.r(paramView);
  }
  
  public static float y(View paramView)
  {
    return a.A(paramView);
  }
  
  public static Rect z(View paramView)
  {
    return a.q(paramView);
  }
  
  static class a
    extends s.j
  {
    public boolean a(View paramView)
    {
      return paramView.hasOnClickListeners();
    }
  }
  
  static class b
    extends s.a
  {
    public void a(View paramView, int paramInt)
    {
      if (paramInt == 4) {
        paramInt = 2;
      }
      paramView.setImportantForAccessibility(paramInt);
    }
    
    public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public void a(View paramView, Drawable paramDrawable)
    {
      paramView.setBackground(paramDrawable);
    }
    
    public void a(View paramView, Runnable paramRunnable)
    {
      paramView.postOnAnimation(paramRunnable);
    }
    
    public void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    }
    
    public void a(View paramView, boolean paramBoolean)
    {
      paramView.setHasTransientState(paramBoolean);
    }
    
    public boolean b(View paramView)
    {
      return paramView.hasTransientState();
    }
    
    public void c(View paramView)
    {
      paramView.postInvalidateOnAnimation();
    }
    
    public int d(View paramView)
    {
      return paramView.getImportantForAccessibility();
    }
    
    public ViewParent e(View paramView)
    {
      return paramView.getParentForAccessibility();
    }
    
    public int f(View paramView)
    {
      return paramView.getMinimumWidth();
    }
    
    public int g(View paramView)
    {
      return paramView.getMinimumHeight();
    }
    
    public void h(View paramView)
    {
      paramView.requestFitSystemWindows();
    }
    
    public boolean i(View paramView)
    {
      return paramView.getFitsSystemWindows();
    }
    
    public boolean j(View paramView)
    {
      return paramView.hasOverlappingRendering();
    }
  }
  
  static class c
    extends s.b
  {
    public void a(View paramView, Paint paramPaint)
    {
      paramView.setLayerPaint(paramPaint);
    }
    
    public void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public int k(View paramView)
    {
      return paramView.getLayoutDirection();
    }
    
    public int l(View paramView)
    {
      return paramView.getPaddingStart();
    }
    
    public int m(View paramView)
    {
      return paramView.getPaddingEnd();
    }
    
    public int n(View paramView)
    {
      return paramView.getWindowSystemUiVisibility();
    }
    
    public boolean o(View paramView)
    {
      return paramView.isPaddingRelative();
    }
    
    public Display p(View paramView)
    {
      return paramView.getDisplay();
    }
  }
  
  static class d
    extends s.c
  {
    public void a(View paramView, Rect paramRect)
    {
      paramView.setClipBounds(paramRect);
    }
    
    public Rect q(View paramView)
    {
      return paramView.getClipBounds();
    }
  }
  
  static class e
    extends s.d
  {
    public void a(View paramView, int paramInt)
    {
      paramView.setImportantForAccessibility(paramInt);
    }
    
    public void b(View paramView, int paramInt)
    {
      paramView.setAccessibilityLiveRegion(paramInt);
    }
    
    public boolean r(View paramView)
    {
      return paramView.isLaidOut();
    }
    
    public boolean s(View paramView)
    {
      return paramView.isAttachedToWindow();
    }
  }
  
  static class f
    extends s.e
  {
    private static ThreadLocal<Rect> d;
    
    private static Rect b()
    {
      if (d == null) {
        d = new ThreadLocal();
      }
      Rect localRect = (Rect)d.get();
      if (localRect == null)
      {
        localRect = new Rect();
        d.set(localRect);
      }
      localRect.setEmpty();
      return localRect;
    }
    
    public float A(View paramView)
    {
      return paramView.getZ();
    }
    
    public aa a(View paramView, aa paramaa)
    {
      WindowInsets localWindowInsets1 = (WindowInsets)aa.a(paramaa);
      WindowInsets localWindowInsets2 = paramView.onApplyWindowInsets(localWindowInsets1);
      if (localWindowInsets2 != localWindowInsets1) {
        localWindowInsets1 = new WindowInsets(localWindowInsets2);
      }
      return aa.a(localWindowInsets1);
    }
    
    public void a(View paramView, float paramFloat)
    {
      paramView.setElevation(paramFloat);
    }
    
    public void a(View paramView, ColorStateList paramColorStateList)
    {
      paramView.setBackgroundTintList(paramColorStateList);
      Drawable localDrawable;
      if (Build.VERSION.SDK_INT == 21)
      {
        localDrawable = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) && (paramView.getBackgroundTintMode() == null)) {
          break label66;
        }
      }
      label66:
      for (int i = 1;; i = 0)
      {
        if ((localDrawable != null) && (i != 0))
        {
          if (localDrawable.isStateful()) {
            localDrawable.setState(paramView.getDrawableState());
          }
          paramView.setBackground(localDrawable);
        }
        return;
      }
    }
    
    public void a(View paramView, PorterDuff.Mode paramMode)
    {
      paramView.setBackgroundTintMode(paramMode);
      Drawable localDrawable;
      if (Build.VERSION.SDK_INT == 21)
      {
        localDrawable = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) && (paramView.getBackgroundTintMode() == null)) {
          break label66;
        }
      }
      label66:
      for (int i = 1;; i = 0)
      {
        if ((localDrawable != null) && (i != 0))
        {
          if (localDrawable.isStateful()) {
            localDrawable.setState(paramView.getDrawableState());
          }
          paramView.setBackground(localDrawable);
        }
        return;
      }
    }
    
    public void a(View paramView, final o paramo)
    {
      if (paramo == null)
      {
        paramView.setOnApplyWindowInsetsListener(null);
        return;
      }
      paramView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        public WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
        {
          aa localaa = aa.a(paramAnonymousWindowInsets);
          return (WindowInsets)aa.a(paramo.a(paramAnonymousView, localaa));
        }
      });
    }
    
    public void a(View paramView, String paramString)
    {
      paramView.setTransitionName(paramString);
    }
    
    public aa b(View paramView, aa paramaa)
    {
      WindowInsets localWindowInsets1 = (WindowInsets)aa.a(paramaa);
      WindowInsets localWindowInsets2 = paramView.dispatchApplyWindowInsets(localWindowInsets1);
      if (localWindowInsets2 != localWindowInsets1) {
        localWindowInsets1 = new WindowInsets(localWindowInsets2);
      }
      return aa.a(localWindowInsets1);
    }
    
    public void b(View paramView, float paramFloat)
    {
      paramView.setTranslationZ(paramFloat);
    }
    
    public void c(View paramView, int paramInt)
    {
      Rect localRect = b();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
          i = 1;
        }
      }
      for (;;)
      {
        super.c(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
          ((View)localViewParent).invalidate(localRect);
        }
        return;
        i = 0;
        continue;
        i = 0;
      }
    }
    
    public void d(View paramView, int paramInt)
    {
      Rect localRect = b();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
          i = 1;
        }
      }
      for (;;)
      {
        super.d(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
          ((View)localViewParent).invalidate(localRect);
        }
        return;
        i = 0;
        continue;
        i = 0;
      }
    }
    
    public void h(View paramView)
    {
      paramView.requestApplyInsets();
    }
    
    public String t(View paramView)
    {
      return paramView.getTransitionName();
    }
    
    public float u(View paramView)
    {
      return paramView.getElevation();
    }
    
    public float v(View paramView)
    {
      return paramView.getTranslationZ();
    }
    
    public boolean w(View paramView)
    {
      return paramView.isNestedScrollingEnabled();
    }
    
    public void x(View paramView)
    {
      paramView.stopNestedScroll();
    }
    
    public ColorStateList y(View paramView)
    {
      return paramView.getBackgroundTintList();
    }
    
    public PorterDuff.Mode z(View paramView)
    {
      return paramView.getBackgroundTintMode();
    }
  }
  
  static class g
    extends s.f
  {
    public void a(View paramView, int paramInt1, int paramInt2)
    {
      paramView.setScrollIndicators(paramInt1, paramInt2);
    }
    
    public void c(View paramView, int paramInt)
    {
      paramView.offsetLeftAndRight(paramInt);
    }
    
    public void d(View paramView, int paramInt)
    {
      paramView.offsetTopAndBottom(paramInt);
    }
  }
  
  static class h
    extends s.g
  {
    public void a(View paramView, q paramq)
    {
      if (paramq != null) {}
      for (Object localObject = paramq.a();; localObject = null)
      {
        paramView.setPointerIcon((PointerIcon)localObject);
        return;
      }
    }
  }
  
  static class i
    extends s.h
  {}
  
  static class j
  {
    static Field b;
    static boolean c = false;
    private static Field d;
    private static boolean e;
    private static Field f;
    private static boolean g;
    private static WeakHashMap<View, String> h;
    private static final AtomicInteger i = new AtomicInteger(1);
    WeakHashMap<View, w> a = null;
    
    private static void D(View paramView)
    {
      float f1 = paramView.getTranslationY();
      paramView.setTranslationY(1.0F + f1);
      paramView.setTranslationY(f1);
    }
    
    public float A(View paramView)
    {
      return v(paramView) + u(paramView);
    }
    
    /* Error */
    public boolean B(View paramView)
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore_2
      //   2: getstatic 31	android/support/v4/view/s$j:c	Z
      //   5: ifeq +5 -> 10
      //   8: iconst_0
      //   9: ireturn
      //   10: getstatic 61	android/support/v4/view/s$j:b	Ljava/lang/reflect/Field;
      //   13: ifnonnull +20 -> 33
      //   16: ldc 39
      //   18: ldc 63
      //   20: invokevirtual 69	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   23: putstatic 61	android/support/v4/view/s$j:b	Ljava/lang/reflect/Field;
      //   26: getstatic 61	android/support/v4/view/s$j:b	Ljava/lang/reflect/Field;
      //   29: iconst_1
      //   30: invokevirtual 75	java/lang/reflect/Field:setAccessible	(Z)V
      //   33: getstatic 61	android/support/v4/view/s$j:b	Ljava/lang/reflect/Field;
      //   36: aload_1
      //   37: invokevirtual 79	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   40: astore 4
      //   42: aload 4
      //   44: ifnull +13 -> 57
      //   47: iload_2
      //   48: ireturn
      //   49: astore 5
      //   51: iload_2
      //   52: putstatic 31	android/support/v4/view/s$j:c	Z
      //   55: iconst_0
      //   56: ireturn
      //   57: iconst_0
      //   58: istore_2
      //   59: goto -12 -> 47
      //   62: astore_3
      //   63: iload_2
      //   64: putstatic 31	android/support/v4/view/s$j:c	Z
      //   67: iconst_0
      //   68: ireturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	69	0	this	j
      //   0	69	1	paramView	View
      //   1	63	2	bool	boolean
      //   62	1	3	localThrowable1	java.lang.Throwable
      //   40	3	4	localObject	Object
      //   49	1	5	localThrowable2	java.lang.Throwable
      // Exception table:
      //   from	to	target	type
      //   16	33	49	java/lang/Throwable
      //   33	42	62	java/lang/Throwable
    }
    
    public w C(View paramView)
    {
      if (this.a == null) {
        this.a = new WeakHashMap();
      }
      w localw = (w)this.a.get(paramView);
      if (localw == null)
      {
        localw = new w(paramView);
        this.a.put(paramView, localw);
      }
      return localw;
    }
    
    long a()
    {
      return ValueAnimator.getFrameDelay();
    }
    
    public aa a(View paramView, aa paramaa)
    {
      return paramaa;
    }
    
    public void a(View paramView, float paramFloat) {}
    
    public void a(View paramView, int paramInt) {}
    
    public void a(View paramView, int paramInt1, int paramInt2) {}
    
    public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public void a(View paramView, ColorStateList paramColorStateList)
    {
      if ((paramView instanceof r)) {
        ((r)paramView).setSupportBackgroundTintList(paramColorStateList);
      }
    }
    
    public void a(View paramView, Paint paramPaint)
    {
      paramView.setLayerType(paramView.getLayerType(), paramPaint);
      paramView.invalidate();
    }
    
    public void a(View paramView, PorterDuff.Mode paramMode)
    {
      if ((paramView instanceof r)) {
        ((r)paramView).setSupportBackgroundTintMode(paramMode);
      }
    }
    
    public void a(View paramView, Rect paramRect) {}
    
    public void a(View paramView, Drawable paramDrawable)
    {
      paramView.setBackgroundDrawable(paramDrawable);
    }
    
    public void a(View paramView, a parama)
    {
      if (parama == null) {}
      for (View.AccessibilityDelegate localAccessibilityDelegate = null;; localAccessibilityDelegate = parama.getBridge())
      {
        paramView.setAccessibilityDelegate(localAccessibilityDelegate);
        return;
      }
    }
    
    public void a(View paramView, o paramo) {}
    
    public void a(View paramView, q paramq) {}
    
    public void a(View paramView, Runnable paramRunnable)
    {
      paramView.postDelayed(paramRunnable, a());
    }
    
    public void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postDelayed(paramRunnable, paramLong + a());
    }
    
    public void a(View paramView, String paramString)
    {
      if (h == null) {
        h = new WeakHashMap();
      }
      h.put(paramView, paramString);
    }
    
    public void a(View paramView, boolean paramBoolean) {}
    
    public boolean a(View paramView)
    {
      return false;
    }
    
    public aa b(View paramView, aa paramaa)
    {
      return paramaa;
    }
    
    public void b(View paramView, float paramFloat) {}
    
    public void b(View paramView, int paramInt) {}
    
    public void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public boolean b(View paramView)
    {
      return false;
    }
    
    public void c(View paramView)
    {
      paramView.postInvalidate();
    }
    
    public void c(View paramView, int paramInt)
    {
      paramView.offsetLeftAndRight(paramInt);
      if (paramView.getVisibility() == 0)
      {
        D(paramView);
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent instanceof View)) {
          D((View)localViewParent);
        }
      }
    }
    
    public int d(View paramView)
    {
      return 0;
    }
    
    public void d(View paramView, int paramInt)
    {
      paramView.offsetTopAndBottom(paramInt);
      if (paramView.getVisibility() == 0)
      {
        D(paramView);
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent instanceof View)) {
          D((View)localViewParent);
        }
      }
    }
    
    public ViewParent e(View paramView)
    {
      return paramView.getParent();
    }
    
    public int f(View paramView)
    {
      if (!e) {}
      try
      {
        d = View.class.getDeclaredField("mMinWidth");
        d.setAccessible(true);
        label23:
        e = true;
        if (d != null) {
          try
          {
            int j = ((Integer)d.get(paramView)).intValue();
            return j;
          }
          catch (Exception localException) {}
        }
        return 0;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label23;
      }
    }
    
    public int g(View paramView)
    {
      if (!g) {}
      try
      {
        f = View.class.getDeclaredField("mMinHeight");
        f.setAccessible(true);
        label23:
        g = true;
        if (f != null) {
          try
          {
            int j = ((Integer)f.get(paramView)).intValue();
            return j;
          }
          catch (Exception localException) {}
        }
        return 0;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label23;
      }
    }
    
    public void h(View paramView) {}
    
    public boolean i(View paramView)
    {
      return false;
    }
    
    public boolean j(View paramView)
    {
      return true;
    }
    
    public int k(View paramView)
    {
      return 0;
    }
    
    public int l(View paramView)
    {
      return paramView.getPaddingLeft();
    }
    
    public int m(View paramView)
    {
      return paramView.getPaddingRight();
    }
    
    public int n(View paramView)
    {
      return 0;
    }
    
    public boolean o(View paramView)
    {
      return false;
    }
    
    public Display p(View paramView)
    {
      if (s(paramView)) {
        return ((WindowManager)paramView.getContext().getSystemService("window")).getDefaultDisplay();
      }
      return null;
    }
    
    public Rect q(View paramView)
    {
      return null;
    }
    
    public boolean r(View paramView)
    {
      return (paramView.getWidth() > 0) && (paramView.getHeight() > 0);
    }
    
    public boolean s(View paramView)
    {
      return paramView.getWindowToken() != null;
    }
    
    public String t(View paramView)
    {
      if (h == null) {
        return null;
      }
      return (String)h.get(paramView);
    }
    
    public float u(View paramView)
    {
      return 0.0F;
    }
    
    public float v(View paramView)
    {
      return 0.0F;
    }
    
    public boolean w(View paramView)
    {
      if ((paramView instanceof i)) {
        return ((i)paramView).isNestedScrollingEnabled();
      }
      return false;
    }
    
    public void x(View paramView)
    {
      if ((paramView instanceof i)) {
        ((i)paramView).stopNestedScroll();
      }
    }
    
    public ColorStateList y(View paramView)
    {
      if ((paramView instanceof r)) {
        return ((r)paramView).getSupportBackgroundTintList();
      }
      return null;
    }
    
    public PorterDuff.Mode z(View paramView)
    {
      if ((paramView instanceof r)) {
        return ((r)paramView).getSupportBackgroundTintMode();
      }
      return null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.s
 * JD-Core Version:    0.7.0.1
 */