package com.flask.colorpicker.b;

import java.util.ArrayList;
import java.util.List;

public abstract class a
  implements c
{
  protected b a;
  protected List<com.flask.colorpicker.b> b = new ArrayList();
  
  protected int a(float paramFloat1, float paramFloat2)
  {
    return Math.max(1, (int)(0.5D + 3.063052912151454D / Math.asin(paramFloat2 / paramFloat1)));
  }
  
  public b a()
  {
    if (this.a == null) {
      this.a = new b();
    }
    return this.a;
  }
  
  public void a(b paramb)
  {
    this.a = paramb;
    this.b.clear();
  }
  
  public List<com.flask.colorpicker.b> b()
  {
    return this.b;
  }
  
  protected int c()
  {
    return Math.round(255.0F * this.a.e);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.b.a
 * JD-Core Version:    0.7.0.1
 */