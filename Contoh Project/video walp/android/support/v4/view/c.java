package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class c
{
  private final a a;
  
  public c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, null);
  }
  
  public c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT > 17)
    {
      this.a = new c(paramContext, paramOnGestureListener, paramHandler);
      return;
    }
    this.a = new b(paramContext, paramOnGestureListener, paramHandler);
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    return this.a.a(paramMotionEvent);
  }
  
  static abstract interface a
  {
    public abstract boolean a(MotionEvent paramMotionEvent);
  }
  
  static class b
    implements c.a
  {
    private static final int j = ;
    private static final int k = ViewConfiguration.getTapTimeout();
    private static final int l = ViewConfiguration.getDoubleTapTimeout();
    final GestureDetector.OnGestureListener a;
    GestureDetector.OnDoubleTapListener b;
    boolean c;
    boolean d;
    MotionEvent e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final Handler m;
    private boolean n;
    private boolean o;
    private boolean p;
    private MotionEvent q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private VelocityTracker x;
    
    b(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      if (paramHandler != null) {}
      for (this.m = new a(paramHandler);; this.m = new a())
      {
        this.a = paramOnGestureListener;
        if ((paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener)) {
          a((GestureDetector.OnDoubleTapListener)paramOnGestureListener);
        }
        a(paramContext);
        return;
      }
    }
    
    private void a(Context paramContext)
    {
      if (paramContext == null) {
        throw new IllegalArgumentException("Context must not be null");
      }
      if (this.a == null) {
        throw new IllegalArgumentException("OnGestureListener must not be null");
      }
      this.w = true;
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
      int i1 = localViewConfiguration.getScaledTouchSlop();
      int i2 = localViewConfiguration.getScaledDoubleTapSlop();
      this.h = localViewConfiguration.getScaledMinimumFlingVelocity();
      this.i = localViewConfiguration.getScaledMaximumFlingVelocity();
      this.f = (i1 * i1);
      this.g = (i2 * i2);
    }
    
    private boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, MotionEvent paramMotionEvent3)
    {
      if (!this.p) {}
      int i1;
      int i2;
      do
      {
        do
        {
          return false;
        } while (paramMotionEvent3.getEventTime() - paramMotionEvent2.getEventTime() > l);
        i1 = (int)paramMotionEvent1.getX() - (int)paramMotionEvent3.getX();
        i2 = (int)paramMotionEvent1.getY() - (int)paramMotionEvent3.getY();
      } while (i1 * i1 + i2 * i2 >= this.g);
      return true;
    }
    
    private void b()
    {
      this.m.removeMessages(1);
      this.m.removeMessages(2);
      this.m.removeMessages(3);
      this.x.recycle();
      this.x = null;
      this.r = false;
      this.c = false;
      this.o = false;
      this.p = false;
      this.d = false;
      if (this.n) {
        this.n = false;
      }
    }
    
    private void c()
    {
      this.m.removeMessages(1);
      this.m.removeMessages(2);
      this.m.removeMessages(3);
      this.r = false;
      this.o = false;
      this.p = false;
      this.d = false;
      if (this.n) {
        this.n = false;
      }
    }
    
    void a()
    {
      this.m.removeMessages(3);
      this.d = false;
      this.n = true;
      this.a.onLongPress(this.e);
    }
    
    public void a(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
    {
      this.b = paramOnDoubleTapListener;
    }
    
    public boolean a(MotionEvent paramMotionEvent)
    {
      int i1 = paramMotionEvent.getAction();
      if (this.x == null) {
        this.x = VelocityTracker.obtain();
      }
      this.x.addMovement(paramMotionEvent);
      int i2;
      int i3;
      label49:
      int i4;
      int i5;
      float f1;
      float f2;
      if ((i1 & 0xFF) == 6)
      {
        i2 = 1;
        if (i2 == 0) {
          break label89;
        }
        i3 = paramMotionEvent.getActionIndex();
        i4 = paramMotionEvent.getPointerCount();
        i5 = 0;
        f1 = 0.0F;
        f2 = 0.0F;
        label64:
        if (i5 >= i4) {
          break label120;
        }
        if (i3 != i5) {
          break label95;
        }
      }
      for (;;)
      {
        i5++;
        break label64;
        i2 = 0;
        break;
        label89:
        i3 = -1;
        break label49;
        label95:
        f2 += paramMotionEvent.getX(i5);
        f1 += paramMotionEvent.getY(i5);
      }
      label120:
      int i6;
      float f3;
      float f4;
      if (i2 != 0)
      {
        i6 = i4 - 1;
        f3 = f2 / i6;
        f4 = f1 / i6;
      }
      float f7;
      float f8;
      int i10;
      boolean bool3;
      switch (i1 & 0xFF)
      {
      case 4: 
      default: 
      case 5: 
      case 6: 
      case 0: 
      case 2: 
        do
        {
          int i11;
          float f9;
          float f10;
          int i13;
          do
          {
            return false;
            i6 = i4;
            break;
            this.s = f3;
            this.u = f3;
            this.t = f4;
            this.v = f4;
            c();
            return false;
            this.s = f3;
            this.u = f3;
            this.t = f4;
            this.v = f4;
            this.x.computeCurrentVelocity(1000, this.i);
            i11 = paramMotionEvent.getActionIndex();
            int i12 = paramMotionEvent.getPointerId(i11);
            f9 = this.x.getXVelocity(i12);
            f10 = this.x.getYVelocity(i12);
            i13 = 0;
          } while (i13 >= i4);
          if (i13 == i11) {}
          int i14;
          do
          {
            i13++;
            break;
            i14 = paramMotionEvent.getPointerId(i13);
          } while (f9 * this.x.getXVelocity(i14) + f10 * this.x.getYVelocity(i14) >= 0.0F);
          this.x.clear();
          return false;
          if (this.b != null)
          {
            boolean bool5 = this.m.hasMessages(3);
            if (bool5) {
              this.m.removeMessages(3);
            }
            if ((this.e != null) && (this.q != null) && (bool5) && (a(this.e, this.q, paramMotionEvent))) {
              this.r = true;
            }
          }
          for (boolean bool4 = false | this.b.onDoubleTap(this.e) | this.b.onDoubleTapEvent(paramMotionEvent);; bool4 = false)
          {
            this.s = f3;
            this.u = f3;
            this.t = f4;
            this.v = f4;
            if (this.e != null) {
              this.e.recycle();
            }
            this.e = MotionEvent.obtain(paramMotionEvent);
            this.o = true;
            this.p = true;
            this.c = true;
            this.n = false;
            this.d = false;
            if (this.w)
            {
              this.m.removeMessages(2);
              this.m.sendEmptyMessageAtTime(2, this.e.getDownTime() + k + j);
            }
            this.m.sendEmptyMessageAtTime(1, this.e.getDownTime() + k);
            return bool4 | this.a.onDown(paramMotionEvent);
            this.m.sendEmptyMessageDelayed(3, l);
          }
        } while (this.n);
        f7 = this.s - f3;
        f8 = this.t - f4;
        if (this.r) {
          return false | this.b.onDoubleTapEvent(paramMotionEvent);
        }
        if (this.o)
        {
          int i8 = (int)(f3 - this.u);
          int i9 = (int)(f4 - this.v);
          i10 = i8 * i8 + i9 * i9;
          if (i10 <= this.f) {
            break label1147;
          }
          bool3 = this.a.onScroll(this.e, paramMotionEvent, f7, f8);
          this.s = f3;
          this.t = f4;
          this.o = false;
          this.m.removeMessages(3);
          this.m.removeMessages(1);
          this.m.removeMessages(2);
        }
        break;
      }
      for (;;)
      {
        if (i10 > this.f) {
          this.p = false;
        }
        return bool3;
        if ((Math.abs(f7) < 1.0F) && (Math.abs(f8) < 1.0F)) {
          break;
        }
        boolean bool2 = this.a.onScroll(this.e, paramMotionEvent, f7, f8);
        this.s = f3;
        this.t = f4;
        return bool2;
        this.c = false;
        MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        boolean bool1;
        if (this.r) {
          bool1 = false | this.b.onDoubleTapEvent(paramMotionEvent);
        }
        for (;;)
        {
          if (this.q != null) {
            this.q.recycle();
          }
          this.q = localMotionEvent;
          if (this.x != null)
          {
            this.x.recycle();
            this.x = null;
          }
          this.r = false;
          this.d = false;
          this.m.removeMessages(1);
          this.m.removeMessages(2);
          return bool1;
          if (this.n)
          {
            this.m.removeMessages(3);
            this.n = false;
            bool1 = false;
          }
          else if (this.o)
          {
            bool1 = this.a.onSingleTapUp(paramMotionEvent);
            if ((this.d) && (this.b != null)) {
              this.b.onSingleTapConfirmed(paramMotionEvent);
            }
          }
          else
          {
            VelocityTracker localVelocityTracker = this.x;
            int i7 = paramMotionEvent.getPointerId(0);
            localVelocityTracker.computeCurrentVelocity(1000, this.i);
            float f5 = localVelocityTracker.getYVelocity(i7);
            float f6 = localVelocityTracker.getXVelocity(i7);
            if ((Math.abs(f5) > this.h) || (Math.abs(f6) > this.h))
            {
              bool1 = this.a.onFling(this.e, paramMotionEvent, f6, f5);
              continue;
              b();
              return false;
            }
            else
            {
              bool1 = false;
            }
          }
        }
        label1147:
        bool3 = false;
      }
    }
    
    private class a
      extends Handler
    {
      a() {}
      
      a(Handler paramHandler)
      {
        super();
      }
      
      public void handleMessage(Message paramMessage)
      {
        switch (paramMessage.what)
        {
        default: 
          throw new RuntimeException("Unknown message " + paramMessage);
        case 1: 
          c.b.this.a.onShowPress(c.b.this.e);
        }
        do
        {
          return;
          c.b.this.a();
          return;
        } while (c.b.this.b == null);
        if (!c.b.this.c)
        {
          c.b.this.b.onSingleTapConfirmed(c.b.this.e);
          return;
        }
        c.b.this.d = true;
      }
    }
  }
  
  static class c
    implements c.a
  {
    private final GestureDetector a;
    
    c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      this.a = new GestureDetector(paramContext, paramOnGestureListener, paramHandler);
    }
    
    public boolean a(MotionEvent paramMotionEvent)
    {
      return this.a.onTouchEvent(paramMotionEvent);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.c
 * JD-Core Version:    0.7.0.1
 */