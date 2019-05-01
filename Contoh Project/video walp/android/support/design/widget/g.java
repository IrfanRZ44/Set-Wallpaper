package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.a.c;
import android.support.v4.view.s;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

class g
{
  static final Interpolator a = a.c;
  static final int[] j = { 16842919, 16842910 };
  static final int[] k = { 16842908, 16842910 };
  static final int[] l = { 16842910 };
  static final int[] m = new int[0];
  int b = 0;
  i c;
  Drawable d;
  Drawable e;
  c f;
  Drawable g;
  float h;
  float i;
  final VisibilityAwareImageButton n;
  final j o;
  private final l p;
  private float q;
  private final Rect r = new Rect();
  private ViewTreeObserver.OnPreDrawListener s;
  
  g(VisibilityAwareImageButton paramVisibilityAwareImageButton, j paramj)
  {
    this.n = paramVisibilityAwareImageButton;
    this.o = paramj;
    this.p = new l();
    this.p.a(j, a(new b()));
    this.p.a(k, a(new b()));
    this.p.a(l, a(new d()));
    this.p.a(m, a(new a()));
    this.q = this.n.getRotation();
  }
  
  private ValueAnimator a(e parame)
  {
    ValueAnimator localValueAnimator = new ValueAnimator();
    localValueAnimator.setInterpolator(a);
    localValueAnimator.setDuration(100L);
    localValueAnimator.addListener(parame);
    localValueAnimator.addUpdateListener(parame);
    localValueAnimator.setFloatValues(new float[] { 0.0F, 1.0F });
    return localValueAnimator;
  }
  
  private static ColorStateList b(int paramInt)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    arrayOfInt[0] = k;
    arrayOfInt1[0] = paramInt;
    arrayOfInt[1] = j;
    arrayOfInt1[1] = paramInt;
    arrayOfInt[2] = new int[0];
    arrayOfInt1[2] = 0;
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private void o()
  {
    if (this.s == null) {
      this.s = new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          g.this.j();
          return true;
        }
      };
    }
  }
  
  private boolean p()
  {
    return (s.x(this.n)) && (!this.n.isInEditMode());
  }
  
  private void q()
  {
    if (Build.VERSION.SDK_INT == 19)
    {
      if (this.q % 90.0F == 0.0F) {
        break label79;
      }
      if (this.n.getLayerType() != 1) {
        this.n.setLayerType(1, null);
      }
    }
    for (;;)
    {
      if (this.c != null) {
        this.c.a(-this.q);
      }
      if (this.f != null) {
        this.f.b(-this.q);
      }
      return;
      label79:
      if (this.n.getLayerType() != 0) {
        this.n.setLayerType(0, null);
      }
    }
  }
  
  float a()
  {
    return this.h;
  }
  
  c a(int paramInt, ColorStateList paramColorStateList)
  {
    Context localContext = this.n.getContext();
    c localc = i();
    localc.a(android.support.v4.content.a.getColor(localContext, a.c.design_fab_stroke_top_outer_color), android.support.v4.content.a.getColor(localContext, a.c.design_fab_stroke_top_inner_color), android.support.v4.content.a.getColor(localContext, a.c.design_fab_stroke_end_inner_color), android.support.v4.content.a.getColor(localContext, a.c.design_fab_stroke_end_outer_color));
    localc.a(paramInt);
    localc.a(paramColorStateList);
    return localc;
  }
  
  final void a(float paramFloat)
  {
    if (this.h != paramFloat)
    {
      this.h = paramFloat;
      a(paramFloat, this.i);
    }
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    if (this.c != null)
    {
      this.c.a(paramFloat1, paramFloat1 + this.i);
      e();
    }
  }
  
  void a(int paramInt)
  {
    if (this.e != null) {
      android.support.v4.a.a.a.a(this.e, b(paramInt));
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.d != null) {
      android.support.v4.a.a.a.a(this.d, paramColorStateList);
    }
    if (this.f != null) {
      this.f.a(paramColorStateList);
    }
  }
  
  void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.d = android.support.v4.a.a.a.g(k());
    android.support.v4.a.a.a.a(this.d, paramColorStateList);
    if (paramMode != null) {
      android.support.v4.a.a.a.a(this.d, paramMode);
    }
    this.e = android.support.v4.a.a.a.g(k());
    android.support.v4.a.a.a.a(this.e, b(paramInt1));
    Drawable[] arrayOfDrawable;
    if (paramInt2 > 0)
    {
      this.f = a(paramInt2, paramColorStateList);
      arrayOfDrawable = new Drawable[3];
      arrayOfDrawable[0] = this.f;
      arrayOfDrawable[1] = this.d;
      arrayOfDrawable[2] = this.e;
    }
    for (;;)
    {
      this.g = new LayerDrawable(arrayOfDrawable);
      this.c = new i(this.n.getContext(), this.g, this.o.a(), this.h, this.h + this.i);
      this.c.a(false);
      this.o.a(this.c);
      return;
      this.f = null;
      arrayOfDrawable = new Drawable[2];
      arrayOfDrawable[0] = this.d;
      arrayOfDrawable[1] = this.e;
    }
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.d != null) {
      android.support.v4.a.a.a.a(this.d, paramMode);
    }
  }
  
  void a(Rect paramRect)
  {
    this.c.getPadding(paramRect);
  }
  
  void a(final c paramc, final boolean paramBoolean)
  {
    if (n()) {
      return;
    }
    this.n.animate().cancel();
    if (p())
    {
      this.b = 1;
      this.n.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.c).setListener(new AnimatorListenerAdapter()
      {
        private boolean d;
        
        public void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          this.d = true;
        }
        
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          g.this.b = 0;
          VisibilityAwareImageButton localVisibilityAwareImageButton;
          if (!this.d)
          {
            localVisibilityAwareImageButton = g.this.n;
            if (!paramBoolean) {
              break label59;
            }
          }
          label59:
          for (int i = 8;; i = 4)
          {
            localVisibilityAwareImageButton.a(i, paramBoolean);
            if (paramc != null) {
              paramc.b();
            }
            return;
          }
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          g.this.n.a(0, paramBoolean);
          this.d = false;
        }
      });
      return;
    }
    VisibilityAwareImageButton localVisibilityAwareImageButton = this.n;
    if (paramBoolean) {}
    for (int i1 = 8;; i1 = 4)
    {
      localVisibilityAwareImageButton.a(i1, paramBoolean);
      if (paramc == null) {
        break;
      }
      paramc.b();
      return;
    }
  }
  
  void a(int[] paramArrayOfInt)
  {
    this.p.a(paramArrayOfInt);
  }
  
  void b()
  {
    this.p.a();
  }
  
  final void b(float paramFloat)
  {
    if (this.i != paramFloat)
    {
      this.i = paramFloat;
      a(this.h, paramFloat);
    }
  }
  
  void b(Rect paramRect) {}
  
  void b(final c paramc, final boolean paramBoolean)
  {
    if (m()) {}
    do
    {
      return;
      this.n.animate().cancel();
      if (p())
      {
        this.b = 2;
        if (this.n.getVisibility() != 0)
        {
          this.n.setAlpha(0.0F);
          this.n.setScaleY(0.0F);
          this.n.setScaleX(0.0F);
        }
        this.n.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.d).setListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            g.this.b = 0;
            if (paramc != null) {
              paramc.a();
            }
          }
          
          public void onAnimationStart(Animator paramAnonymousAnimator)
          {
            g.this.n.a(0, paramBoolean);
          }
        });
        return;
      }
      this.n.a(0, paramBoolean);
      this.n.setAlpha(1.0F);
      this.n.setScaleY(1.0F);
      this.n.setScaleX(1.0F);
    } while (paramc == null);
    paramc.a();
  }
  
  final Drawable c()
  {
    return this.g;
  }
  
  void d() {}
  
  final void e()
  {
    Rect localRect = this.r;
    a(localRect);
    b(localRect);
    this.o.a(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  void f()
  {
    if (h())
    {
      o();
      this.n.getViewTreeObserver().addOnPreDrawListener(this.s);
    }
  }
  
  void g()
  {
    if (this.s != null)
    {
      this.n.getViewTreeObserver().removeOnPreDrawListener(this.s);
      this.s = null;
    }
  }
  
  boolean h()
  {
    return true;
  }
  
  c i()
  {
    return new c();
  }
  
  void j()
  {
    float f1 = this.n.getRotation();
    if (this.q != f1)
    {
      this.q = f1;
      q();
    }
  }
  
  GradientDrawable k()
  {
    GradientDrawable localGradientDrawable = l();
    localGradientDrawable.setShape(1);
    localGradientDrawable.setColor(-1);
    return localGradientDrawable;
  }
  
  GradientDrawable l()
  {
    return new GradientDrawable();
  }
  
  boolean m()
  {
    if (this.n.getVisibility() != 0) {
      if (this.b != 2) {}
    }
    while (this.b != 1)
    {
      return true;
      return false;
    }
    return false;
  }
  
  boolean n()
  {
    if (this.n.getVisibility() == 0) {
      if (this.b != 1) {}
    }
    while (this.b != 2)
    {
      return true;
      return false;
    }
    return false;
  }
  
  private class a
    extends g.e
  {
    a()
    {
      super(null);
    }
    
    protected float a()
    {
      return 0.0F;
    }
  }
  
  private class b
    extends g.e
  {
    b()
    {
      super(null);
    }
    
    protected float a()
    {
      return g.this.h + g.this.i;
    }
  }
  
  static abstract interface c
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  private class d
    extends g.e
  {
    d()
    {
      super(null);
    }
    
    protected float a()
    {
      return g.this.h;
    }
  }
  
  private abstract class e
    extends AnimatorListenerAdapter
    implements ValueAnimator.AnimatorUpdateListener
  {
    private boolean a;
    private float c;
    private float d;
    
    private e() {}
    
    protected abstract float a();
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      g.this.c.b(this.d);
      this.a = false;
    }
    
    public void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      if (!this.a)
      {
        this.c = g.this.c.a();
        this.d = a();
        this.a = true;
      }
      g.this.c.b(this.c + (this.d - this.c) * paramValueAnimator.getAnimatedFraction());
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.g
 * JD-Core Version:    0.7.0.1
 */