package android.support.design.widget;

import android.content.Context;
import android.support.v4.c.a;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

abstract class HeaderBehavior<V extends View>
  extends ViewOffsetBehavior<V>
{
  OverScroller a;
  private Runnable b;
  private boolean c;
  private int d = -1;
  private int e;
  private int f = -1;
  private VelocityTracker g;
  
  public HeaderBehavior() {}
  
  public HeaderBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void d()
  {
    if (this.g == null) {
      this.g = VelocityTracker.obtain();
    }
  }
  
  int a()
  {
    return b();
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = b();
    int j = 0;
    if (paramInt2 != 0)
    {
      j = 0;
      if (i >= paramInt2)
      {
        j = 0;
        if (i <= paramInt3)
        {
          int k = a.a(paramInt1, paramInt2, paramInt3);
          j = 0;
          if (i != k)
          {
            a(k);
            j = i - k;
          }
        }
      }
    }
    return j;
  }
  
  int a(V paramV)
  {
    return paramV.getHeight();
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, V paramV) {}
  
  final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, float paramFloat)
  {
    if (this.b != null)
    {
      paramV.removeCallbacks(this.b);
      this.b = null;
    }
    if (this.a == null) {
      this.a = new OverScroller(paramV.getContext());
    }
    this.a.fling(0, b(), 0, Math.round(paramFloat), 0, 0, paramInt1, paramInt2);
    if (this.a.computeScrollOffset())
    {
      this.b = new a(paramCoordinatorLayout, paramV);
      s.a(paramV, this.b);
      return true;
    }
    a(paramCoordinatorLayout, paramV);
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.f < 0) {
      this.f = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    if ((paramMotionEvent.getAction() == 2) && (this.c)) {
      return true;
    }
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      if (this.g != null) {
        this.g.addMovement(paramMotionEvent);
      }
      return this.c;
      this.c = false;
      int m = (int)paramMotionEvent.getX();
      int n = (int)paramMotionEvent.getY();
      if ((c(paramV)) && (paramCoordinatorLayout.a(paramV, m, n)))
      {
        this.e = n;
        this.d = paramMotionEvent.getPointerId(0);
        d();
        continue;
        int i = this.d;
        if (i != -1)
        {
          int j = paramMotionEvent.findPointerIndex(i);
          if (j != -1)
          {
            int k = (int)paramMotionEvent.getY(j);
            if (Math.abs(k - this.e) > this.f)
            {
              this.c = true;
              this.e = k;
              continue;
              this.c = false;
              this.d = -1;
              if (this.g != null)
              {
                this.g.recycle();
                this.g = null;
              }
            }
          }
        }
      }
    }
  }
  
  int a_(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    return a(paramCoordinatorLayout, paramV, paramInt, -2147483648, 2147483647);
  }
  
  final int b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramCoordinatorLayout, paramV, a() - paramInt1, paramInt2, paramInt3);
  }
  
  int b(V paramV)
  {
    return -paramV.getHeight();
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.f < 0) {
      this.f = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      if (this.g != null) {
        this.g.addMovement(paramMotionEvent);
      }
      boolean bool1 = true;
      int i;
      do
      {
        int n;
        boolean bool3;
        do
        {
          boolean bool2;
          do
          {
            return bool1;
            int m = (int)paramMotionEvent.getX();
            n = (int)paramMotionEvent.getY();
            bool2 = paramCoordinatorLayout.a(paramV, m, n);
            bool1 = false;
          } while (!bool2);
          bool3 = c(paramV);
          bool1 = false;
        } while (!bool3);
        this.e = n;
        this.d = paramMotionEvent.getPointerId(0);
        d();
        break;
        i = paramMotionEvent.findPointerIndex(this.d);
        bool1 = false;
      } while (i == -1);
      int j = (int)paramMotionEvent.getY(i);
      int k = this.e - j;
      if ((!this.c) && (Math.abs(k) > this.f))
      {
        this.c = true;
        if (k <= 0) {
          break label253;
        }
        k -= this.f;
      }
      while (this.c)
      {
        this.e = j;
        b(paramCoordinatorLayout, paramV, k, b(paramV), 0);
        break;
        label253:
        k += this.f;
      }
      if (this.g != null)
      {
        this.g.addMovement(paramMotionEvent);
        this.g.computeCurrentVelocity(1000);
        float f1 = this.g.getYVelocity(this.d);
        a(paramCoordinatorLayout, paramV, -a(paramV), 0, f1);
      }
      this.c = false;
      this.d = -1;
      if (this.g != null)
      {
        this.g.recycle();
        this.g = null;
      }
    }
  }
  
  boolean c(V paramV)
  {
    return false;
  }
  
  private class a
    implements Runnable
  {
    private final CoordinatorLayout b;
    private final V c;
    
    a(V paramV)
    {
      this.b = paramV;
      Object localObject;
      this.c = localObject;
    }
    
    public void run()
    {
      if ((this.c != null) && (HeaderBehavior.this.a != null))
      {
        if (HeaderBehavior.this.a.computeScrollOffset())
        {
          HeaderBehavior.this.a_(this.b, this.c, HeaderBehavior.this.a.getCurrY());
          s.a(this.c, this);
        }
      }
      else {
        return;
      }
      HeaderBehavior.this.a(this.b, this.c);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.HeaderBehavior
 * JD-Core Version:    0.7.0.1
 */