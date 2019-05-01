package android.support.design.widget;

import android.support.v4.view.s;
import android.view.View;

class n
{
  private final View a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public n(View paramView)
  {
    this.a = paramView;
  }
  
  private void d()
  {
    s.c(this.a, this.d - (this.a.getTop() - this.b));
    s.d(this.a, this.e - (this.a.getLeft() - this.c));
  }
  
  public void a()
  {
    this.b = this.a.getTop();
    this.c = this.a.getLeft();
    d();
  }
  
  public boolean a(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      d();
      return true;
    }
    return false;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public boolean b(int paramInt)
  {
    if (this.e != paramInt)
    {
      this.e = paramInt;
      d();
      return true;
    }
    return false;
  }
  
  public int c()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.n
 * JD-Core Version:    0.7.0.1
 */