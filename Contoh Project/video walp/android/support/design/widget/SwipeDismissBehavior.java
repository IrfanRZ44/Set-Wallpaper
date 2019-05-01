package android.support.design.widget;

import android.support.v4.view.s;
import android.support.v4.widget.r;
import android.support.v4.widget.r.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View>
  extends CoordinatorLayout.Behavior<V>
{
  private boolean a;
  r b;
  a c;
  int d = 2;
  float e = 0.5F;
  float f = 0.0F;
  float g = 0.5F;
  private float h = 0.0F;
  private boolean i;
  private final r.a j = new r.a()
  {
    private int b;
    private int c = -1;
    
    private boolean a(View paramAnonymousView, float paramAnonymousFloat)
    {
      int k;
      if (paramAnonymousFloat != 0.0F) {
        if (s.e(paramAnonymousView) == 1)
        {
          k = 1;
          if (SwipeDismissBehavior.this.d != 2) {
            break label36;
          }
        }
      }
      label36:
      label59:
      label67:
      label91:
      int i;
      int j;
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return true;
                k = 0;
                break;
                if (SwipeDismissBehavior.this.d != 0) {
                  break label67;
                }
                if (k == 0) {
                  break label59;
                }
              } while (paramAnonymousFloat < 0.0F);
              return false;
            } while (paramAnonymousFloat > 0.0F);
            return false;
            if (SwipeDismissBehavior.this.d != 1) {
              break label138;
            }
            if (k == 0) {
              break label91;
            }
          } while (paramAnonymousFloat > 0.0F);
          return false;
        } while (paramAnonymousFloat < 0.0F);
        return false;
        i = paramAnonymousView.getLeft() - this.b;
        j = Math.round(paramAnonymousView.getWidth() * SwipeDismissBehavior.this.e);
      } while (Math.abs(i) >= j);
      return false;
      label138:
      return false;
    }
    
    public int a(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      return paramAnonymousView.getTop();
    }
    
    public void a(int paramAnonymousInt)
    {
      if (SwipeDismissBehavior.this.c != null) {
        SwipeDismissBehavior.this.c.a(paramAnonymousInt);
      }
    }
    
    public void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      this.c = -1;
      int i = paramAnonymousView.getWidth();
      int k;
      int j;
      boolean bool;
      if (a(paramAnonymousView, paramAnonymousFloat1)) {
        if (paramAnonymousView.getLeft() < this.b)
        {
          k = this.b - i;
          j = k;
          bool = true;
          label47:
          if (!SwipeDismissBehavior.this.b.a(j, paramAnonymousView.getTop())) {
            break label109;
          }
          s.a(paramAnonymousView, new SwipeDismissBehavior.b(SwipeDismissBehavior.this, paramAnonymousView, bool));
        }
      }
      label109:
      while ((!bool) || (SwipeDismissBehavior.this.c == null))
      {
        return;
        k = i + this.b;
        break;
        j = this.b;
        bool = false;
        break label47;
      }
      SwipeDismissBehavior.this.c.a(paramAnonymousView);
    }
    
    public void a(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
    {
      float f1 = this.b + paramAnonymousView.getWidth() * SwipeDismissBehavior.this.f;
      float f2 = this.b + paramAnonymousView.getWidth() * SwipeDismissBehavior.this.g;
      if (paramAnonymousInt1 <= f1)
      {
        paramAnonymousView.setAlpha(1.0F);
        return;
      }
      if (paramAnonymousInt1 >= f2)
      {
        paramAnonymousView.setAlpha(0.0F);
        return;
      }
      paramAnonymousView.setAlpha(SwipeDismissBehavior.a(0.0F, 1.0F - SwipeDismissBehavior.b(f1, f2, paramAnonymousInt1), 1.0F));
    }
    
    public boolean a(View paramAnonymousView, int paramAnonymousInt)
    {
      return (this.c == -1) && (SwipeDismissBehavior.this.a(paramAnonymousView));
    }
    
    public int b(View paramAnonymousView)
    {
      return paramAnonymousView.getWidth();
    }
    
    public int b(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      int i;
      int j;
      int k;
      if (s.e(paramAnonymousView) == 1)
      {
        i = 1;
        if (SwipeDismissBehavior.this.d != 0) {
          break label78;
        }
        if (i == 0) {
          break label58;
        }
        j = this.b - paramAnonymousView.getWidth();
        k = this.b;
      }
      for (;;)
      {
        return SwipeDismissBehavior.a(j, paramAnonymousInt1, k);
        i = 0;
        break;
        label58:
        j = this.b;
        k = this.b + paramAnonymousView.getWidth();
        continue;
        label78:
        if (SwipeDismissBehavior.this.d == 1)
        {
          if (i != 0)
          {
            j = this.b;
            k = this.b + paramAnonymousView.getWidth();
          }
          else
          {
            j = this.b - paramAnonymousView.getWidth();
            k = this.b;
          }
        }
        else
        {
          j = this.b - paramAnonymousView.getWidth();
          k = this.b + paramAnonymousView.getWidth();
        }
      }
    }
    
    public void b(View paramAnonymousView, int paramAnonymousInt)
    {
      this.c = paramAnonymousInt;
      this.b = paramAnonymousView.getLeft();
      ViewParent localViewParent = paramAnonymousView.getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
    }
  };
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.min(Math.max(paramFloat1, paramFloat2), paramFloat3);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  private void a(ViewGroup paramViewGroup)
  {
    if (this.b == null) {
      if (!this.i) {
        break label33;
      }
    }
    label33:
    for (r localr = r.a(paramViewGroup, this.h, this.j);; localr = r.a(paramViewGroup, this.j))
    {
      this.b = localr;
      return;
    }
  }
  
  static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
  }
  
  public void a(float paramFloat)
  {
    this.f = a(0.0F, paramFloat, 1.0F);
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(a parama)
  {
    this.c = parama;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.a;
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      boolean bool2 = false;
      if (bool1)
      {
        a(paramCoordinatorLayout);
        bool2 = this.b.a(paramMotionEvent);
      }
      return bool2;
      this.a = paramCoordinatorLayout.a(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      bool1 = this.a;
      continue;
      this.a = false;
    }
  }
  
  public boolean a(View paramView)
  {
    return true;
  }
  
  public void b(float paramFloat)
  {
    this.g = a(0.0F, paramFloat, 1.0F);
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.b != null)
    {
      this.b.b(paramMotionEvent);
      return true;
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
    
    public abstract void a(View paramView);
  }
  
  private class b
    implements Runnable
  {
    private final View b;
    private final boolean c;
    
    b(View paramView, boolean paramBoolean)
    {
      this.b = paramView;
      this.c = paramBoolean;
    }
    
    public void run()
    {
      if ((SwipeDismissBehavior.this.b != null) && (SwipeDismissBehavior.this.b.a(true))) {
        s.a(this.b, this);
      }
      while ((!this.c) || (SwipeDismissBehavior.this.c == null)) {
        return;
      }
      SwipeDismissBehavior.this.c.a(this.b);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.SwipeDismissBehavior
 * JD-Core Version:    0.7.0.1
 */