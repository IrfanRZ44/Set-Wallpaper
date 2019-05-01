package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class m
  implements p
{
  private x j(o paramo)
  {
    return (x)paramo.c();
  }
  
  public float a(o paramo)
  {
    return j(paramo).a();
  }
  
  public void a() {}
  
  public void a(o paramo, float paramFloat)
  {
    j(paramo).a(paramFloat);
  }
  
  public void a(o paramo, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramo.a(new x(paramColorStateList, paramFloat1));
    View localView = paramo.d();
    localView.setClipToOutline(true);
    localView.setElevation(paramFloat2);
    b(paramo, paramFloat3);
  }
  
  public void a(o paramo, ColorStateList paramColorStateList)
  {
    j(paramo).a(paramColorStateList);
  }
  
  public float b(o paramo)
  {
    return 2.0F * d(paramo);
  }
  
  public void b(o paramo, float paramFloat)
  {
    j(paramo).a(paramFloat, paramo.a(), paramo.b());
    f(paramo);
  }
  
  public float c(o paramo)
  {
    return 2.0F * d(paramo);
  }
  
  public void c(o paramo, float paramFloat)
  {
    paramo.d().setElevation(paramFloat);
  }
  
  public float d(o paramo)
  {
    return j(paramo).b();
  }
  
  public float e(o paramo)
  {
    return paramo.d().getElevation();
  }
  
  public void f(o paramo)
  {
    if (!paramo.a())
    {
      paramo.a(0, 0, 0, 0);
      return;
    }
    float f1 = a(paramo);
    float f2 = d(paramo);
    int i = (int)Math.ceil(y.b(f1, f2, paramo.b()));
    int j = (int)Math.ceil(y.a(f1, f2, paramo.b()));
    paramo.a(i, j, i, j);
  }
  
  public void g(o paramo)
  {
    b(paramo, a(paramo));
  }
  
  public void h(o paramo)
  {
    b(paramo, a(paramo));
  }
  
  public ColorStateList i(o paramo)
  {
    return j(paramo).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.m
 * JD-Core Version:    0.7.0.1
 */