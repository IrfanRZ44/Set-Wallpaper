package com.flask.colorpicker.b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.flask.colorpicker.a.d;
import com.flask.colorpicker.a.d.a;
import java.util.List;

public class e
  extends a
{
  private Paint c = d.a().a();
  private float[] d = new float[3];
  
  public void d()
  {
    int i = this.b.size();
    int j = 0;
    float f1 = this.a.g.getWidth() / 2.0F;
    int k = this.a.a;
    float f2 = this.a.b;
    int m = 0;
    while (m < k)
    {
      float f3 = f2 * (m / (k - 1));
      float f4 = this.a.c;
      int n = a(f3, f4);
      int i1 = j;
      int i2 = 0;
      if (i2 < n)
      {
        double d1 = 6.283185307179586D * i2 / n + 3.141592653589793D / n * ((m + 1) % 2);
        float f5 = f1 + (float)(f3 * Math.cos(d1));
        float f6 = f1 + (float)(f3 * Math.sin(d1));
        this.d[0] = ((float)(d1 * 180.0D / 3.141592653589793D));
        this.d[1] = (f3 / f2);
        this.d[2] = this.a.f;
        this.c.setColor(Color.HSVToColor(this.d));
        this.c.setAlpha(c());
        this.a.g.drawCircle(f5, f6, f4 - this.a.d, this.c);
        if (i1 >= i) {
          this.b.add(new com.flask.colorpicker.b(f5, f6, this.d));
        }
        for (;;)
        {
          i1++;
          i2++;
          break;
          ((com.flask.colorpicker.b)this.b.get(i1)).a(f5, f6, this.d);
        }
      }
      m++;
      j = i1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.b.e
 * JD-Core Version:    0.7.0.1
 */