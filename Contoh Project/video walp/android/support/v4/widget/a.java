package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.s;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int r = ;
  final a a = new a();
  final View b;
  boolean c;
  boolean d;
  boolean e;
  private final Interpolator f = new AccelerateInterpolator();
  private Runnable g;
  private float[] h = { 0.0F, 0.0F };
  private float[] i = { 3.4028235E+38F, 3.4028235E+38F };
  private int j;
  private int k;
  private float[] l = { 0.0F, 0.0F };
  private float[] m = { 0.0F, 0.0F };
  private float[] n = { 3.4028235E+38F, 3.4028235E+38F };
  private boolean o;
  private boolean p;
  private boolean q;
  
  public a(View paramView)
  {
    this.b = paramView;
    DisplayMetrics localDisplayMetrics = Resources.getSystem().getDisplayMetrics();
    int i1 = (int)(0.5F + 1575.0F * localDisplayMetrics.density);
    int i2 = (int)(0.5F + 315.0F * localDisplayMetrics.density);
    a(i1, i1);
    b(i2, i2);
    a(1);
    e(3.4028235E+38F, 3.4028235E+38F);
    d(0.2F, 0.2F);
    c(1.0F, 1.0F);
    b(r);
    c(500);
    d(500);
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = a(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    float f2 = f(paramFloat4, f1);
    float f3 = f(paramFloat2 - paramFloat4, f1) - f2;
    if (f3 < 0.0F) {}
    for (float f5 = -this.f.getInterpolation(-f3);; f5 = this.f.getInterpolation(f3))
    {
      float f4 = a(f5, -1.0F, 1.0F);
      boolean bool;
      do
      {
        return f4;
        bool = f3 < 0.0F;
        f4 = 0.0F;
      } while (!bool);
    }
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = a(this.h[paramInt], paramFloat2, this.i[paramInt], paramFloat1);
    if (f1 == 0.0F) {
      return 0.0F;
    }
    float f2 = this.l[paramInt];
    float f3 = this.m[paramInt];
    float f4 = this.n[paramInt];
    float f5 = f2 * paramFloat3;
    if (f1 > 0.0F) {
      return a(f1 * f5, f3, f4);
    }
    return -a(f5 * -f1, f3, f4);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  private void c()
  {
    if (this.g == null) {
      this.g = new b();
    }
    this.e = true;
    this.c = true;
    if ((!this.o) && (this.k > 0)) {
      s.a(this.b, this.g, this.k);
    }
    for (;;)
    {
      this.o = true;
      return;
      this.g.run();
    }
  }
  
  private void d()
  {
    if (this.c)
    {
      this.e = false;
      return;
    }
    this.a.b();
  }
  
  private float f(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {}
    do
    {
      do
      {
        do
        {
          return 0.0F;
          switch (this.j)
          {
          default: 
            return 0.0F;
          }
        } while (paramFloat1 >= paramFloat2);
        if (paramFloat1 >= 0.0F) {
          return 1.0F - paramFloat1 / paramFloat2;
        }
      } while ((!this.e) || (this.j != 1));
      return 1.0F;
    } while (paramFloat1 >= 0.0F);
    return paramFloat1 / -paramFloat2;
  }
  
  public a a(float paramFloat1, float paramFloat2)
  {
    this.n[0] = (paramFloat1 / 1000.0F);
    this.n[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public a a(int paramInt)
  {
    this.j = paramInt;
    return this;
  }
  
  public a a(boolean paramBoolean)
  {
    if ((this.p) && (!paramBoolean)) {
      d();
    }
    this.p = paramBoolean;
    return this;
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  boolean a()
  {
    a locala = this.a;
    int i1 = locala.f();
    int i2 = locala.e();
    return ((i1 != 0) && (f(i1))) || ((i2 != 0) && (e(i2)));
  }
  
  public a b(float paramFloat1, float paramFloat2)
  {
    this.m[0] = (paramFloat1 / 1000.0F);
    this.m[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public a b(int paramInt)
  {
    this.k = paramInt;
    return this;
  }
  
  void b()
  {
    long l1 = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
    this.b.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  public a c(float paramFloat1, float paramFloat2)
  {
    this.l[0] = (paramFloat1 / 1000.0F);
    this.l[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public a c(int paramInt)
  {
    this.a.a(paramInt);
    return this;
  }
  
  public a d(float paramFloat1, float paramFloat2)
  {
    this.h[0] = paramFloat1;
    this.h[1] = paramFloat2;
    return this;
  }
  
  public a d(int paramInt)
  {
    this.a.b(paramInt);
    return this;
  }
  
  public a e(float paramFloat1, float paramFloat2)
  {
    this.i[0] = paramFloat1;
    this.i[1] = paramFloat2;
    return this;
  }
  
  public abstract boolean e(int paramInt);
  
  public abstract boolean f(int paramInt);
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    if (!this.p) {
      return false;
    }
    switch (paramMotionEvent.getActionMasked())
    {
    default: 
      if ((!this.q) || (!this.e)) {
        break;
      }
    }
    for (;;)
    {
      return i1;
      this.d = i1;
      this.o = false;
      float f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.b.getWidth());
      float f2 = a(i1, paramMotionEvent.getY(), paramView.getHeight(), this.b.getHeight());
      this.a.a(f1, f2);
      if ((this.e) || (!a())) {
        break;
      }
      c();
      break;
      d();
      break;
      int i2 = 0;
    }
  }
  
  private static class a
  {
    private int a;
    private int b;
    private float c;
    private float d;
    private long e = -9223372036854775808L;
    private long f = 0L;
    private int g = 0;
    private int h = 0;
    private long i = -1L;
    private float j;
    private int k;
    
    private float a(float paramFloat)
    {
      return paramFloat * (-4.0F * paramFloat) + 4.0F * paramFloat;
    }
    
    private float a(long paramLong)
    {
      if (paramLong < this.e) {
        return 0.0F;
      }
      if ((this.i < 0L) || (paramLong < this.i)) {
        return 0.5F * a.a((float)(paramLong - this.e) / this.a, 0.0F, 1.0F);
      }
      long l = paramLong - this.i;
      return 1.0F - this.j + this.j * a.a((float)l / this.k, 0.0F, 1.0F);
    }
    
    public void a()
    {
      this.e = AnimationUtils.currentAnimationTimeMillis();
      this.i = -1L;
      this.f = this.e;
      this.j = 0.5F;
      this.g = 0;
      this.h = 0;
    }
    
    public void a(float paramFloat1, float paramFloat2)
    {
      this.c = paramFloat1;
      this.d = paramFloat2;
    }
    
    public void a(int paramInt)
    {
      this.a = paramInt;
    }
    
    public void b()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.k = a.a((int)(l - this.e), 0, this.b);
      this.j = a(l);
      this.i = l;
    }
    
    public void b(int paramInt)
    {
      this.b = paramInt;
    }
    
    public boolean c()
    {
      return (this.i > 0L) && (AnimationUtils.currentAnimationTimeMillis() > this.i + this.k);
    }
    
    public void d()
    {
      if (this.f == 0L) {
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
      }
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      float f1 = a(a(l1));
      long l2 = l1 - this.f;
      this.f = l1;
      this.g = ((int)(f1 * (float)l2 * this.c));
      this.h = ((int)(f1 * (float)l2 * this.d));
    }
    
    public int e()
    {
      return (int)(this.c / Math.abs(this.c));
    }
    
    public int f()
    {
      return (int)(this.d / Math.abs(this.d));
    }
    
    public int g()
    {
      return this.g;
    }
    
    public int h()
    {
      return this.h;
    }
  }
  
  private class b
    implements Runnable
  {
    b() {}
    
    public void run()
    {
      if (!a.this.e) {
        return;
      }
      if (a.this.c)
      {
        a.this.c = false;
        a.this.a.a();
      }
      a.a locala = a.this.a;
      if ((locala.c()) || (!a.this.a()))
      {
        a.this.e = false;
        return;
      }
      if (a.this.d)
      {
        a.this.d = false;
        a.this.b();
      }
      locala.d();
      int i = locala.g();
      int j = locala.h();
      a.this.a(i, j);
      s.a(a.this.b, this);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.a
 * JD-Core Version:    0.7.0.1
 */