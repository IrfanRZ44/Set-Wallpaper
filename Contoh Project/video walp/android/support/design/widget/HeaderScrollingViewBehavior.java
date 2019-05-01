package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.c.a;
import android.support.v4.view.aa;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class HeaderScrollingViewBehavior
  extends ViewOffsetBehavior<View>
{
  final Rect a = new Rect();
  final Rect b = new Rect();
  private int c = 0;
  private int d;
  
  public HeaderScrollingViewBehavior() {}
  
  public HeaderScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private static int c(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = 8388659;
    }
    return paramInt;
  }
  
  float a(View paramView)
  {
    return 1.0F;
  }
  
  final int a()
  {
    return this.c;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramView.getLayoutParams().height;
    if ((i == -1) || (i == -2))
    {
      View localView = b(paramCoordinatorLayout.c(paramView));
      if (localView != null)
      {
        if ((s.q(localView)) && (!s.q(paramView)))
        {
          s.b(paramView, true);
          if (s.q(paramView))
          {
            paramView.requestLayout();
            return true;
          }
        }
        int j = View.MeasureSpec.getSize(paramInt3);
        if (j == 0) {
          j = paramCoordinatorLayout.getHeight();
        }
        int k = j - localView.getMeasuredHeight() + b(localView);
        if (i == -1) {}
        for (int m = 1073741824;; m = -2147483648)
        {
          paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(k, m), paramInt4);
          return true;
        }
      }
    }
    return false;
  }
  
  int b(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  abstract View b(List<View> paramList);
  
  public final void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    View localView = b(paramCoordinatorLayout.c(paramView));
    if (localView != null)
    {
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
      Rect localRect1 = this.a;
      localRect1.set(paramCoordinatorLayout.getPaddingLeft() + locald.leftMargin, localView.getBottom() + locald.topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - locald.rightMargin, paramCoordinatorLayout.getHeight() + localView.getBottom() - paramCoordinatorLayout.getPaddingBottom() - locald.bottomMargin);
      aa localaa = paramCoordinatorLayout.getLastWindowInsets();
      if ((localaa != null) && (s.q(paramCoordinatorLayout)) && (!s.q(paramView)))
      {
        localRect1.left += localaa.a();
        localRect1.right -= localaa.c();
      }
      Rect localRect2 = this.b;
      d.a(c(locald.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect1, localRect2, paramInt);
      int i = c(localView);
      paramView.layout(localRect2.left, localRect2.top - i, localRect2.right, localRect2.bottom - i);
      this.c = (localRect2.top - localView.getBottom());
      return;
    }
    super.b(paramCoordinatorLayout, paramView, paramInt);
    this.c = 0;
  }
  
  final int c(View paramView)
  {
    if (this.d == 0) {
      return 0;
    }
    return a.a((int)(a(paramView) * this.d), 0, this.d);
  }
  
  public final int d()
  {
    return this.d;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.HeaderScrollingViewBehavior
 * JD-Core Version:    0.7.0.1
 */