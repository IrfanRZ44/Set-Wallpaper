package android.support.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
class g
  extends View
  implements i
{
  final View a;
  ViewGroup b;
  View c;
  int d;
  Matrix e;
  private int f;
  private int g;
  private final Matrix h = new Matrix();
  private final ViewTreeObserver.OnPreDrawListener i = new ViewTreeObserver.OnPreDrawListener()
  {
    public boolean onPreDraw()
    {
      g.this.e = g.this.a.getMatrix();
      s.c(g.this);
      if ((g.this.b != null) && (g.this.c != null))
      {
        g.this.b.endViewTransition(g.this.c);
        s.c(g.this.b);
        g.this.b = null;
        g.this.c = null;
      }
      return true;
    }
  };
  
  g(View paramView)
  {
    super(paramView.getContext());
    this.a = paramView;
    setLayerType(2, null);
  }
  
  static g a(View paramView)
  {
    return (g)paramView.getTag(y.a.ghost_view);
  }
  
  private static void a(View paramView, g paramg)
  {
    paramView.setTag(y.a.ghost_view, paramg);
  }
  
  public void a(ViewGroup paramViewGroup, View paramView)
  {
    this.b = paramViewGroup;
    this.c = paramView;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a(this.a, this);
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    getLocationOnScreen(arrayOfInt1);
    this.a.getLocationOnScreen(arrayOfInt2);
    arrayOfInt2[0] = ((int)(arrayOfInt2[0] - this.a.getTranslationX()));
    arrayOfInt2[1] = ((int)(arrayOfInt2[1] - this.a.getTranslationY()));
    this.f = (arrayOfInt2[0] - arrayOfInt1[0]);
    this.g = (arrayOfInt2[1] - arrayOfInt1[1]);
    this.a.getViewTreeObserver().addOnPreDrawListener(this.i);
    this.a.setVisibility(4);
  }
  
  protected void onDetachedFromWindow()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this.i);
    this.a.setVisibility(0);
    a(this.a, null);
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.h.set(this.e);
    this.h.postTranslate(this.f, this.g);
    paramCanvas.setMatrix(this.h);
    this.a.draw(paramCanvas);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    View localView = this.a;
    if (paramInt == 0) {}
    for (int j = 4;; j = 0)
    {
      localView.setVisibility(j);
      return;
    }
  }
  
  static class a
    implements i.a
  {
    private static FrameLayout a(ViewGroup paramViewGroup)
    {
      ViewParent localViewParent;
      for (ViewGroup localViewGroup = paramViewGroup; !(localViewGroup instanceof FrameLayout); localViewGroup = (ViewGroup)localViewParent)
      {
        localViewParent = localViewGroup.getParent();
        if (!(localViewParent instanceof ViewGroup)) {
          return null;
        }
      }
      return (FrameLayout)localViewGroup;
    }
    
    public i a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
    {
      g localg = g.a(paramView);
      if (localg == null)
      {
        FrameLayout localFrameLayout = a(paramViewGroup);
        if (localFrameLayout == null) {
          return null;
        }
        localg = new g(paramView);
        localFrameLayout.addView(localg);
      }
      localg.d = (1 + localg.d);
      return localg;
    }
    
    public void a(View paramView)
    {
      g localg = g.a(paramView);
      if (localg != null)
      {
        localg.d = (-1 + localg.d);
        if (localg.d <= 0)
        {
          ViewParent localViewParent = localg.getParent();
          if ((localViewParent instanceof ViewGroup))
          {
            ViewGroup localViewGroup = (ViewGroup)localViewParent;
            localViewGroup.endViewTransition(localg);
            localViewGroup.removeView(localg);
          }
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.g
 * JD-Core Version:    0.7.0.1
 */