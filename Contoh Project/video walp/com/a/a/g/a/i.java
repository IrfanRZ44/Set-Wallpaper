package com.a.a.g.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.a.a.g.b;
import com.a.a.i.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class i<T extends View, Z>
  extends a<Z>
{
  private static boolean b;
  private static Integer c;
  protected final T a;
  private final a d;
  private View.OnAttachStateChangeListener e;
  private boolean f;
  private boolean g;
  
  public i(T paramT)
  {
    this.a = ((View)h.a(paramT));
    this.d = new a(paramT);
  }
  
  private void a()
  {
    if ((this.e == null) || (this.g)) {
      return;
    }
    this.a.addOnAttachStateChangeListener(this.e);
    this.g = true;
  }
  
  private void a(Object paramObject)
  {
    if (c == null)
    {
      b = true;
      this.a.setTag(paramObject);
      return;
    }
    this.a.setTag(c.intValue(), paramObject);
  }
  
  private void f()
  {
    if ((this.e == null) || (!this.g)) {
      return;
    }
    this.a.removeOnAttachStateChangeListener(this.e);
    this.g = false;
  }
  
  private Object g()
  {
    if (c == null) {
      return this.a.getTag();
    }
    return this.a.getTag(c.intValue());
  }
  
  public void a(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    this.d.b();
    if (!this.f) {
      f();
    }
  }
  
  public void a(g paramg)
  {
    this.d.a(paramg);
  }
  
  public void a(b paramb)
  {
    a(paramb);
  }
  
  public b b()
  {
    Object localObject = g();
    if (localObject != null)
    {
      if ((localObject instanceof b)) {
        return (b)localObject;
      }
      throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }
    return null;
  }
  
  public void b(Drawable paramDrawable)
  {
    super.b(paramDrawable);
    a();
  }
  
  public void b(g paramg)
  {
    this.d.b(paramg);
  }
  
  public String toString()
  {
    return "Target for: " + this.a;
  }
  
  static final class a
  {
    static Integer a;
    boolean b;
    private final View c;
    private final List<g> d = new ArrayList();
    private a e;
    
    a(View paramView)
    {
      this.c = paramView;
    }
    
    private int a(int paramInt1, int paramInt2, int paramInt3)
    {
      int i = paramInt2 - paramInt3;
      if (i > 0) {}
      do
      {
        return i;
        if ((this.b) && (this.c.isLayoutRequested())) {
          return 0;
        }
        i = paramInt1 - paramInt3;
      } while (i > 0);
      if ((!this.c.isLayoutRequested()) && (paramInt2 == -2))
      {
        if (Log.isLoggable("ViewTarget", 4)) {
          Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        return a(this.c.getContext());
      }
      return 0;
    }
    
    private static int a(Context paramContext)
    {
      if (a == null)
      {
        Display localDisplay = ((WindowManager)h.a((WindowManager)paramContext.getSystemService("window"))).getDefaultDisplay();
        Point localPoint = new Point();
        localDisplay.getSize(localPoint);
        a = Integer.valueOf(Math.max(localPoint.x, localPoint.y));
      }
      return a.intValue();
    }
    
    private void a(int paramInt1, int paramInt2)
    {
      Iterator localIterator = new ArrayList(this.d).iterator();
      while (localIterator.hasNext()) {
        ((g)localIterator.next()).a(paramInt1, paramInt2);
      }
    }
    
    private boolean a(int paramInt)
    {
      return (paramInt > 0) || (paramInt == -2147483648);
    }
    
    private boolean b(int paramInt1, int paramInt2)
    {
      return (a(paramInt1)) && (a(paramInt2));
    }
    
    private int c()
    {
      int i = this.c.getPaddingTop() + this.c.getPaddingBottom();
      ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
      if (localLayoutParams != null) {}
      for (int j = localLayoutParams.height;; j = 0) {
        return a(this.c.getHeight(), j, i);
      }
    }
    
    private int d()
    {
      int i = this.c.getPaddingLeft() + this.c.getPaddingRight();
      ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
      if (localLayoutParams != null) {}
      for (int j = localLayoutParams.width;; j = 0) {
        return a(this.c.getWidth(), j, i);
      }
    }
    
    void a()
    {
      if (this.d.isEmpty()) {}
      int i;
      int j;
      do
      {
        return;
        i = d();
        j = c();
      } while (!b(i, j));
      a(i, j);
      b();
    }
    
    void a(g paramg)
    {
      int i = d();
      int j = c();
      if (b(i, j)) {
        paramg.a(i, j);
      }
      do
      {
        return;
        if (!this.d.contains(paramg)) {
          this.d.add(paramg);
        }
      } while (this.e != null);
      ViewTreeObserver localViewTreeObserver = this.c.getViewTreeObserver();
      this.e = new a(this);
      localViewTreeObserver.addOnPreDrawListener(this.e);
    }
    
    void b()
    {
      ViewTreeObserver localViewTreeObserver = this.c.getViewTreeObserver();
      if (localViewTreeObserver.isAlive()) {
        localViewTreeObserver.removeOnPreDrawListener(this.e);
      }
      this.e = null;
      this.d.clear();
    }
    
    void b(g paramg)
    {
      this.d.remove(paramg);
    }
    
    private static final class a
      implements ViewTreeObserver.OnPreDrawListener
    {
      private final WeakReference<i.a> a;
      
      a(i.a parama)
      {
        this.a = new WeakReference(parama);
      }
      
      public boolean onPreDraw()
      {
        if (Log.isLoggable("ViewTarget", 2)) {
          Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
        }
        i.a locala = (i.a)this.a.get();
        if (locala != null) {
          locala.a();
        }
        return true;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.g.a.i
 * JD-Core Version:    0.7.0.1
 */