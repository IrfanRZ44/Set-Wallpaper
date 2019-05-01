package android.support.v7.view;

import android.support.v4.view.w;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h
{
  final ArrayList<w> a = new ArrayList();
  x b;
  private long c = -1L;
  private Interpolator d;
  private boolean e;
  private final y f = new y()
  {
    private boolean b = false;
    private int c = 0;
    
    void a()
    {
      this.c = 0;
      this.b = false;
      h.this.b();
    }
    
    public void onAnimationEnd(View paramAnonymousView)
    {
      int i = 1 + this.c;
      this.c = i;
      if (i == h.this.a.size())
      {
        if (h.this.b != null) {
          h.this.b.onAnimationEnd(null);
        }
        a();
      }
    }
    
    public void onAnimationStart(View paramAnonymousView)
    {
      if (this.b) {}
      do
      {
        return;
        this.b = true;
      } while (h.this.b == null);
      h.this.b.onAnimationStart(null);
    }
  };
  
  public h a(long paramLong)
  {
    if (!this.e) {
      this.c = paramLong;
    }
    return this;
  }
  
  public h a(w paramw)
  {
    if (!this.e) {
      this.a.add(paramw);
    }
    return this;
  }
  
  public h a(w paramw1, w paramw2)
  {
    this.a.add(paramw1);
    paramw2.b(paramw1.a());
    this.a.add(paramw2);
    return this;
  }
  
  public h a(x paramx)
  {
    if (!this.e) {
      this.b = paramx;
    }
    return this;
  }
  
  public h a(Interpolator paramInterpolator)
  {
    if (!this.e) {
      this.d = paramInterpolator;
    }
    return this;
  }
  
  public void a()
  {
    if (this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      w localw = (w)localIterator.next();
      if (this.c >= 0L) {
        localw.a(this.c);
      }
      if (this.d != null) {
        localw.a(this.d);
      }
      if (this.b != null) {
        localw.a(this.f);
      }
      localw.c();
    }
    this.e = true;
  }
  
  void b()
  {
    this.e = false;
  }
  
  public void c()
  {
    if (!this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((w)localIterator.next()).b();
    }
    this.e = false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.h
 * JD-Core Version:    0.7.0.1
 */