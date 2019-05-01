package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ar
  implements at
{
  protected a a = new a(paramContext, paramViewGroup, paramView, this);
  
  ar(Context paramContext, ViewGroup paramViewGroup, View paramView) {}
  
  static ViewGroup c(View paramView)
  {
    Object localObject = paramView;
    while (localObject != null)
    {
      if ((((View)localObject).getId() == 16908290) && ((localObject instanceof ViewGroup))) {
        return (ViewGroup)localObject;
      }
      if ((((View)localObject).getParent() instanceof ViewGroup)) {
        localObject = (ViewGroup)((View)localObject).getParent();
      }
    }
    return null;
  }
  
  static ar d(View paramView)
  {
    ViewGroup localViewGroup = c(paramView);
    if (localViewGroup != null)
    {
      int i = localViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = localViewGroup.getChildAt(j);
        if ((localView instanceof a)) {
          return ((a)localView).e;
        }
      }
      return new ak(localViewGroup.getContext(), localViewGroup, paramView);
    }
    return null;
  }
  
  public void a(Drawable paramDrawable)
  {
    this.a.a(paramDrawable);
  }
  
  public void b(Drawable paramDrawable)
  {
    this.a.b(paramDrawable);
  }
  
  static class a
    extends ViewGroup
  {
    static Method a;
    ViewGroup b;
    View c;
    ArrayList<Drawable> d = null;
    ar e;
    
    static
    {
      try
      {
        Class[] arrayOfClass = new Class[3];
        arrayOfClass[0] = Integer.TYPE;
        arrayOfClass[1] = Integer.TYPE;
        arrayOfClass[2] = Rect.class;
        a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", arrayOfClass);
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException) {}
    }
    
    a(Context paramContext, ViewGroup paramViewGroup, View paramView, ar paramar)
    {
      super();
      this.b = paramViewGroup;
      this.c = paramView;
      setRight(paramViewGroup.getWidth());
      setBottom(paramViewGroup.getHeight());
      paramViewGroup.addView(this);
      this.e = paramar;
    }
    
    private void a(int[] paramArrayOfInt)
    {
      int[] arrayOfInt1 = new int[2];
      int[] arrayOfInt2 = new int[2];
      this.b.getLocationOnScreen(arrayOfInt1);
      this.c.getLocationOnScreen(arrayOfInt2);
      arrayOfInt2[0] -= arrayOfInt1[0];
      arrayOfInt2[1] -= arrayOfInt1[1];
    }
    
    public void a(Drawable paramDrawable)
    {
      if (this.d == null) {
        this.d = new ArrayList();
      }
      if (!this.d.contains(paramDrawable))
      {
        this.d.add(paramDrawable);
        invalidate(paramDrawable.getBounds());
        paramDrawable.setCallback(this);
      }
    }
    
    public void a(View paramView)
    {
      if ((paramView.getParent() instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
        if ((localViewGroup != this.b) && (localViewGroup.getParent() != null) && (s.A(localViewGroup)))
        {
          int[] arrayOfInt1 = new int[2];
          int[] arrayOfInt2 = new int[2];
          localViewGroup.getLocationOnScreen(arrayOfInt1);
          this.b.getLocationOnScreen(arrayOfInt2);
          s.d(paramView, arrayOfInt1[0] - arrayOfInt2[0]);
          s.c(paramView, arrayOfInt1[1] - arrayOfInt2[1]);
        }
        localViewGroup.removeView(paramView);
        if (paramView.getParent() != null) {
          localViewGroup.removeView(paramView);
        }
      }
      super.addView(paramView, -1 + getChildCount());
    }
    
    boolean a()
    {
      return (getChildCount() == 0) && ((this.d == null) || (this.d.size() == 0));
    }
    
    public void b(Drawable paramDrawable)
    {
      if (this.d != null)
      {
        this.d.remove(paramDrawable);
        invalidate(paramDrawable.getBounds());
        paramDrawable.setCallback(null);
      }
    }
    
    public void b(View paramView)
    {
      super.removeView(paramView);
      if (a()) {
        this.b.removeView(this);
      }
    }
    
    protected void dispatchDraw(Canvas paramCanvas)
    {
      int[] arrayOfInt1 = new int[2];
      int[] arrayOfInt2 = new int[2];
      this.b.getLocationOnScreen(arrayOfInt1);
      this.c.getLocationOnScreen(arrayOfInt2);
      paramCanvas.translate(arrayOfInt2[0] - arrayOfInt1[0], arrayOfInt2[1] - arrayOfInt1[1]);
      paramCanvas.clipRect(new Rect(0, 0, this.c.getWidth(), this.c.getHeight()));
      super.dispatchDraw(paramCanvas);
      if (this.d == null) {}
      for (int i = 0;; i = this.d.size()) {
        for (int j = 0; j < i; j++) {
          ((Drawable)this.d.get(j)).draw(paramCanvas);
        }
      }
    }
    
    public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect)
    {
      if (this.b != null)
      {
        paramRect.offset(paramArrayOfInt[0], paramArrayOfInt[1]);
        if ((this.b instanceof ViewGroup))
        {
          paramArrayOfInt[0] = 0;
          paramArrayOfInt[1] = 0;
          int[] arrayOfInt = new int[2];
          a(arrayOfInt);
          paramRect.offset(arrayOfInt[0], arrayOfInt[1]);
          return super.invalidateChildInParent(paramArrayOfInt, paramRect);
        }
        invalidate(paramRect);
      }
      return null;
    }
    
    public void invalidateDrawable(Drawable paramDrawable)
    {
      invalidate(paramDrawable.getBounds());
    }
    
    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    protected boolean verifyDrawable(Drawable paramDrawable)
    {
      return (super.verifyDrawable(paramDrawable)) || ((this.d != null) && (this.d.contains(paramDrawable)));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ar
 * JD-Core Version:    0.7.0.1
 */