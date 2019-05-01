package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class w
{
  Runnable a = null;
  Runnable b = null;
  int c = -1;
  private WeakReference<View> d;
  
  w(View paramView)
  {
    this.d = new WeakReference(paramView);
  }
  
  private void a(final View paramView, final x paramx)
  {
    if (paramx != null)
    {
      paramView.animate().setListener(new AnimatorListenerAdapter()
      {
        public void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          paramx.onAnimationCancel(paramView);
        }
        
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          paramx.onAnimationEnd(paramView);
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          paramx.onAnimationStart(paramView);
        }
      });
      return;
    }
    paramView.animate().setListener(null);
  }
  
  public long a()
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      return localView.animate().getDuration();
    }
    return 0L;
  }
  
  public w a(float paramFloat)
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      localView.animate().alpha(paramFloat);
    }
    return this;
  }
  
  public w a(long paramLong)
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      localView.animate().setDuration(paramLong);
    }
    return this;
  }
  
  public w a(x paramx)
  {
    View localView = (View)this.d.get();
    if (localView != null)
    {
      if (Build.VERSION.SDK_INT >= 16) {
        a(localView, paramx);
      }
    }
    else {
      return this;
    }
    localView.setTag(2113929216, paramx);
    a(localView, new a(this));
    return this;
  }
  
  public w a(final z paramz)
  {
    final View localView = (View)this.d.get();
    if ((localView != null) && (Build.VERSION.SDK_INT >= 19))
    {
      ValueAnimator.AnimatorUpdateListener local2 = null;
      if (paramz != null) {
        local2 = new ValueAnimator.AnimatorUpdateListener()
        {
          public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            paramz.a(localView);
          }
        };
      }
      localView.animate().setUpdateListener(local2);
    }
    return this;
  }
  
  public w a(Interpolator paramInterpolator)
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      localView.animate().setInterpolator(paramInterpolator);
    }
    return this;
  }
  
  public w b(float paramFloat)
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      localView.animate().translationY(paramFloat);
    }
    return this;
  }
  
  public w b(long paramLong)
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      localView.animate().setStartDelay(paramLong);
    }
    return this;
  }
  
  public void b()
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      localView.animate().cancel();
    }
  }
  
  public void c()
  {
    View localView = (View)this.d.get();
    if (localView != null) {
      localView.animate().start();
    }
  }
  
  static class a
    implements x
  {
    w a;
    boolean b;
    
    a(w paramw)
    {
      this.a = paramw;
    }
    
    public void onAnimationCancel(View paramView)
    {
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof x)) {}
      for (x localx = (x)localObject;; localx = null)
      {
        if (localx != null) {
          localx.onAnimationCancel(paramView);
        }
        return;
      }
    }
    
    public void onAnimationEnd(View paramView)
    {
      if (this.a.c > -1)
      {
        paramView.setLayerType(this.a.c, null);
        this.a.c = -1;
      }
      Object localObject;
      if ((Build.VERSION.SDK_INT >= 16) || (!this.b))
      {
        if (this.a.b != null)
        {
          Runnable localRunnable = this.a.b;
          this.a.b = null;
          localRunnable.run();
        }
        localObject = paramView.getTag(2113929216);
        if (!(localObject instanceof x)) {
          break label116;
        }
      }
      label116:
      for (x localx = (x)localObject;; localx = null)
      {
        if (localx != null) {
          localx.onAnimationEnd(paramView);
        }
        this.b = true;
        return;
      }
    }
    
    public void onAnimationStart(View paramView)
    {
      this.b = false;
      if (this.a.c > -1) {
        paramView.setLayerType(2, null);
      }
      if (this.a.a != null)
      {
        Runnable localRunnable = this.a.a;
        this.a.a = null;
        localRunnable.run();
      }
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof x)) {}
      for (x localx = (x)localObject;; localx = null)
      {
        if (localx != null) {
          localx.onAnimationStart(paramView);
        }
        return;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.w
 * JD-Core Version:    0.7.0.1
 */