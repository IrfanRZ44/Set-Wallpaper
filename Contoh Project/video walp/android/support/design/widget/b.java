package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.a.a;
import android.support.design.a.k;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

public abstract class b<B extends b<B>>
{
  static final Handler a;
  private static final boolean d;
  final f b;
  final k.a c;
  private final ViewGroup e;
  private final c f;
  private List<a<B>> g;
  private final AccessibilityManager h;
  
  static
  {
    if ((Build.VERSION.SDK_INT >= 16) && (Build.VERSION.SDK_INT <= 19)) {}
    for (boolean bool = true;; bool = false)
    {
      d = bool;
      a = new Handler(Looper.getMainLooper(), new Handler.Callback()
      {
        public boolean handleMessage(Message paramAnonymousMessage)
        {
          switch (paramAnonymousMessage.what)
          {
          default: 
            return false;
          case 0: 
            ((b)paramAnonymousMessage.obj).b();
            return true;
          }
          ((b)paramAnonymousMessage.obj).b(paramAnonymousMessage.arg1);
          return true;
        }
      });
      return;
    }
  }
  
  private void d(final int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      ValueAnimator localValueAnimator = new ValueAnimator();
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = 0;
      arrayOfInt[1] = this.b.getHeight();
      localValueAnimator.setIntValues(arrayOfInt);
      localValueAnimator.setInterpolator(a.b);
      localValueAnimator.setDuration(250L);
      localValueAnimator.addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          b.this.c(paramInt);
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          b.a(b.this).b(0, 180);
        }
      });
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        private int b = 0;
        
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          if (b.f()) {
            s.c(b.this.b, i - this.b);
          }
          for (;;)
          {
            this.b = i;
            return;
            b.this.b.setTranslationY(i);
          }
        }
      });
      localValueAnimator.start();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.b.getContext(), a.a.design_snackbar_out);
    localAnimation.setInterpolator(a.b);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        b.this.c(paramInt);
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    this.b.startAnimation(localAnimation);
  }
  
  void a(int paramInt)
  {
    k.a().a(this.c, paramInt);
  }
  
  public boolean a()
  {
    return k.a().e(this.c);
  }
  
  final void b()
  {
    if (this.b.getParent() == null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
      if ((localLayoutParams instanceof CoordinatorLayout.d))
      {
        CoordinatorLayout.d locald = (CoordinatorLayout.d)localLayoutParams;
        b localb = new b();
        localb.a(0.1F);
        localb.b(0.6F);
        localb.a(0);
        localb.a(new SwipeDismissBehavior.a()
        {
          public void a(int paramAnonymousInt)
          {
            switch (paramAnonymousInt)
            {
            default: 
              return;
            case 1: 
            case 2: 
              k.a().c(b.this.c);
              return;
            }
            k.a().d(b.this.c);
          }
          
          public void a(View paramAnonymousView)
          {
            paramAnonymousView.setVisibility(8);
            b.this.a(0);
          }
        });
        locald.a(localb);
        locald.g = 80;
      }
      this.e.addView(this.b);
    }
    this.b.setOnAttachStateChangeListener(new d()
    {
      public void a(View paramAnonymousView) {}
      
      public void b(View paramAnonymousView)
      {
        if (b.this.a()) {
          b.a.post(new Runnable()
          {
            public void run()
            {
              b.this.c(3);
            }
          });
        }
      }
    });
    if (s.x(this.b))
    {
      if (e())
      {
        c();
        return;
      }
      d();
      return;
    }
    this.b.setOnLayoutChangeListener(new e()
    {
      public void a(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        b.this.b.setOnLayoutChangeListener(null);
        if (b.this.e())
        {
          b.this.c();
          return;
        }
        b.this.d();
      }
    });
  }
  
  final void b(int paramInt)
  {
    if ((e()) && (this.b.getVisibility() == 0))
    {
      d(paramInt);
      return;
    }
    c(paramInt);
  }
  
  void c()
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      final int i = this.b.getHeight();
      if (d) {
        s.c(this.b, i);
      }
      for (;;)
      {
        ValueAnimator localValueAnimator = new ValueAnimator();
        localValueAnimator.setIntValues(new int[] { i, 0 });
        localValueAnimator.setInterpolator(a.b);
        localValueAnimator.setDuration(250L);
        localValueAnimator.addListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            b.this.d();
          }
          
          public void onAnimationStart(Animator paramAnonymousAnimator)
          {
            b.a(b.this).a(70, 180);
          }
        });
        localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          private int c = i;
          
          public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
            if (b.f()) {
              s.c(b.this.b, i - this.c);
            }
            for (;;)
            {
              this.c = i;
              return;
              b.this.b.setTranslationY(i);
            }
          }
        });
        localValueAnimator.start();
        return;
        this.b.setTranslationY(i);
      }
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.b.getContext(), a.a.design_snackbar_in);
    localAnimation.setInterpolator(a.b);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        b.this.d();
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    this.b.startAnimation(localAnimation);
  }
  
  void c(int paramInt)
  {
    k.a().a(this.c);
    if (this.g != null) {
      for (int i = -1 + this.g.size(); i >= 0; i--) {
        ((a)this.g.get(i)).a(this, paramInt);
      }
    }
    if (Build.VERSION.SDK_INT < 11) {
      this.b.setVisibility(8);
    }
    ViewParent localViewParent = this.b.getParent();
    if ((localViewParent instanceof ViewGroup)) {
      ((ViewGroup)localViewParent).removeView(this.b);
    }
  }
  
  void d()
  {
    k.a().b(this.c);
    if (this.g != null) {
      for (int i = -1 + this.g.size(); i >= 0; i--) {
        ((a)this.g.get(i)).a(this);
      }
    }
  }
  
  boolean e()
  {
    return !this.h.isEnabled();
  }
  
  public static abstract class a<B>
  {
    public void a(B paramB) {}
    
    public void a(B paramB, int paramInt) {}
  }
  
  final class b
    extends SwipeDismissBehavior<b.f>
  {
    b() {}
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, b.f paramf, MotionEvent paramMotionEvent)
    {
      switch (paramMotionEvent.getActionMasked())
      {
      }
      for (;;)
      {
        return super.a(paramCoordinatorLayout, paramf, paramMotionEvent);
        if (paramCoordinatorLayout.a(paramf, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
        {
          k.a().c(b.this.c);
          continue;
          k.a().d(b.this.c);
        }
      }
    }
    
    public boolean a(View paramView)
    {
      return paramView instanceof b.f;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt1, int paramInt2);
    
    public abstract void b(int paramInt1, int paramInt2);
  }
  
  static abstract interface d
  {
    public abstract void a(View paramView);
    
    public abstract void b(View paramView);
  }
  
  static abstract interface e
  {
    public abstract void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
  
  static class f
    extends FrameLayout
  {
    private b.e a;
    private b.d b;
    
    f(Context paramContext)
    {
      this(paramContext, null);
    }
    
    f(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.SnackbarLayout);
      if (localTypedArray.hasValue(a.k.SnackbarLayout_elevation)) {
        s.a(this, localTypedArray.getDimensionPixelSize(a.k.SnackbarLayout_elevation, 0));
      }
      localTypedArray.recycle();
      setClickable(true);
    }
    
    protected void onAttachedToWindow()
    {
      super.onAttachedToWindow();
      if (this.b != null) {
        this.b.a(this);
      }
      s.p(this);
    }
    
    protected void onDetachedFromWindow()
    {
      super.onDetachedFromWindow();
      if (this.b != null) {
        this.b.b(this);
      }
    }
    
    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.a != null) {
        this.a.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    void setOnAttachStateChangeListener(b.d paramd)
    {
      this.b = paramd;
    }
    
    void setOnLayoutChangeListener(b.e parame)
    {
      this.a = parame;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.b
 * JD-Core Version:    0.7.0.1
 */