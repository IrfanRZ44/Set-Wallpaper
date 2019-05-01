package android.support.v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class s
{
  private static final ThreadLocal<Matrix> a = new ThreadLocal();
  private static final ThreadLocal<RectF> b = new ThreadLocal();
  
  static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    Matrix localMatrix1 = (Matrix)a.get();
    Matrix localMatrix2;
    if (localMatrix1 == null)
    {
      localMatrix2 = new Matrix();
      a.set(localMatrix2);
    }
    for (Matrix localMatrix3 = localMatrix2;; localMatrix3 = localMatrix1)
    {
      a(paramViewGroup, paramView, localMatrix3);
      RectF localRectF = (RectF)b.get();
      if (localRectF == null)
      {
        localRectF = new RectF();
        b.set(localRectF);
      }
      localRectF.set(paramRect);
      localMatrix3.mapRect(localRectF);
      paramRect.set((int)(0.5F + localRectF.left), (int)(0.5F + localRectF.top), (int)(0.5F + localRectF.right), (int)(0.5F + localRectF.bottom));
      return;
      localMatrix1.reset();
    }
  }
  
  private static void a(ViewParent paramViewParent, View paramView, Matrix paramMatrix)
  {
    ViewParent localViewParent = paramView.getParent();
    if (((localViewParent instanceof View)) && (localViewParent != paramViewParent))
    {
      View localView = (View)localViewParent;
      a(paramViewParent, localView, paramMatrix);
      paramMatrix.preTranslate(-localView.getScrollX(), -localView.getScrollY());
    }
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    if (!paramView.getMatrix().isIdentity()) {
      paramMatrix.preConcat(paramView.getMatrix());
    }
  }
  
  public static void b(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    a(paramViewGroup, paramView, paramRect);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.s
 * JD-Core Version:    0.7.0.1
 */