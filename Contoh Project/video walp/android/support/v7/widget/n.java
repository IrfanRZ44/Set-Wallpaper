package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

class n
  implements p
{
  private final RectF a = new RectF();
  
  private y a(Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return new y(paramContext.getResources(), paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
  }
  
  private y j(o paramo)
  {
    return (y)paramo.c();
  }
  
  public float a(o paramo)
  {
    return j(paramo).c();
  }
  
  public void a()
  {
    y.a = new y.a()
    {
      public void a(Canvas paramAnonymousCanvas, RectF paramAnonymousRectF, float paramAnonymousFloat, Paint paramAnonymousPaint)
      {
        float f1 = 2.0F * paramAnonymousFloat;
        float f2 = paramAnonymousRectF.width() - f1 - 1.0F;
        float f3 = paramAnonymousRectF.height() - f1 - 1.0F;
        if (paramAnonymousFloat >= 1.0F)
        {
          float f4 = paramAnonymousFloat + 0.5F;
          n.a(n.this).set(-f4, -f4, f4, f4);
          int i = paramAnonymousCanvas.save();
          paramAnonymousCanvas.translate(f4 + paramAnonymousRectF.left, f4 + paramAnonymousRectF.top);
          paramAnonymousCanvas.drawArc(n.a(n.this), 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f2, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(n.a(n.this), 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f3, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(n.a(n.this), 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f2, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(n.a(n.this), 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.restoreToCount(i);
          paramAnonymousCanvas.drawRect(f4 + paramAnonymousRectF.left - 1.0F, paramAnonymousRectF.top, 1.0F + (paramAnonymousRectF.right - f4), f4 + paramAnonymousRectF.top, paramAnonymousPaint);
          paramAnonymousCanvas.drawRect(f4 + paramAnonymousRectF.left - 1.0F, paramAnonymousRectF.bottom - f4, 1.0F + (paramAnonymousRectF.right - f4), paramAnonymousRectF.bottom, paramAnonymousPaint);
        }
        paramAnonymousCanvas.drawRect(paramAnonymousRectF.left, paramAnonymousFloat + paramAnonymousRectF.top, paramAnonymousRectF.right, paramAnonymousRectF.bottom - paramAnonymousFloat, paramAnonymousPaint);
      }
    };
  }
  
  public void a(o paramo, float paramFloat)
  {
    j(paramo).a(paramFloat);
    f(paramo);
  }
  
  public void a(o paramo, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    y localy = a(paramContext, paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
    localy.a(paramo.b());
    paramo.a(localy);
    f(paramo);
  }
  
  public void a(o paramo, ColorStateList paramColorStateList)
  {
    j(paramo).a(paramColorStateList);
  }
  
  public float b(o paramo)
  {
    return j(paramo).d();
  }
  
  public void b(o paramo, float paramFloat)
  {
    j(paramo).c(paramFloat);
    f(paramo);
  }
  
  public float c(o paramo)
  {
    return j(paramo).e();
  }
  
  public void c(o paramo, float paramFloat)
  {
    j(paramo).b(paramFloat);
  }
  
  public float d(o paramo)
  {
    return j(paramo).a();
  }
  
  public float e(o paramo)
  {
    return j(paramo).b();
  }
  
  public void f(o paramo)
  {
    Rect localRect = new Rect();
    j(paramo).a(localRect);
    paramo.a((int)Math.ceil(b(paramo)), (int)Math.ceil(c(paramo)));
    paramo.a(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  public void g(o paramo) {}
  
  public void h(o paramo)
  {
    j(paramo).a(paramo.b());
    f(paramo);
  }
  
  public ColorStateList i(o paramo)
  {
    return j(paramo).f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.n
 * JD-Core Version:    0.7.0.1
 */