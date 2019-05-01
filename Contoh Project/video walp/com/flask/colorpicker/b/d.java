package com.flask.colorpicker.b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.flask.colorpicker.a.d.a;
import java.util.List;

public class d
  extends a
{
  private Paint c = com.flask.colorpicker.a.d.a().a();
  private float[] d = new float[3];
  private float e = 1.2F;
  
  public void d()
  {
    int i = this.b.size();
    int j = 0;
    float f1 = this.a.g.getWidth() / 2.0F;
    int k = this.a.a;
    float f2 = this.a.d;
    float f3 = this.a.b;
    float f4 = this.a.c;
    int m = 0;
    while (m < k)
    {
      float f5 = m / (k - 1);
      float f6 = (m - k / 2.0F) / k;
      float f7 = f3 * f5;
      float f8 = 1.5F + f2;
      float f9;
      int i1;
      int i2;
      label155:
      float f11;
      float f12;
      if (m == 0)
      {
        f9 = 0.0F;
        float f10 = Math.max(f8, f9 + f4);
        int n = Math.min(a(f7, f10), k * 2);
        i1 = j;
        i2 = 0;
        if (i2 >= n) {
          break label399;
        }
        double d1 = 6.283185307179586D * i2 / n + 3.141592653589793D / n * ((m + 1) % 2);
        f11 = f1 + (float)(f7 * Math.cos(d1));
        f12 = f1 + (float)(f7 * Math.sin(d1));
        this.d[0] = ((float)(d1 * 180.0D / 3.141592653589793D));
        this.d[1] = (f7 / f3);
        this.d[2] = this.a.f;
        this.c.setColor(Color.HSVToColor(this.d));
        this.c.setAlpha(c());
        this.a.g.drawCircle(f11, f12, f10 - f2, this.c);
        if (i1 < i) {
          break label371;
        }
        List localList = this.b;
        com.flask.colorpicker.b localb = new com.flask.colorpicker.b(f11, f12, this.d);
        localList.add(localb);
      }
      for (;;)
      {
        i1++;
        i2++;
        break label155;
        f9 = f6 * (f4 * this.e);
        break;
        label371:
        ((com.flask.colorpicker.b)this.b.get(i1)).a(f11, f12, this.d);
      }
      label399:
      m++;
      j = i1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.b.d
 * JD-Core Version:    0.7.0.1
 */