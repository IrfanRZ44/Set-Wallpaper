package com.flask.colorpicker.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

public class d
{
  public static Shader a(int paramInt)
  {
    return new BitmapShader(b(Math.max(8, 2 * (paramInt / 2))), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
  }
  
  public static a a()
  {
    return new a(null);
  }
  
  private static Bitmap b(int paramInt)
  {
    Paint localPaint = a().a();
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    int i = Math.round(paramInt / 2.0F);
    for (int j = 0; j < 2; j++)
    {
      int k = 0;
      if (k < 2)
      {
        if ((j + k) % 2 == 0) {
          localPaint.setColor(-1);
        }
        for (;;)
        {
          localCanvas.drawRect(j * i, k * i, i * (j + 1), i * (k + 1), localPaint);
          k++;
          break;
          localPaint.setColor(-3092272);
        }
      }
    }
    return localBitmap;
  }
  
  public static class a
  {
    private Paint a = new Paint(1);
    
    public Paint a()
    {
      return this.a;
    }
    
    public a a(float paramFloat)
    {
      this.a.setStrokeWidth(paramFloat);
      return this;
    }
    
    public a a(int paramInt)
    {
      this.a.setColor(paramInt);
      return this;
    }
    
    public a a(Paint.Style paramStyle)
    {
      this.a.setStyle(paramStyle);
      return this;
    }
    
    public a a(PorterDuff.Mode paramMode)
    {
      this.a.setXfermode(new PorterDuffXfermode(paramMode));
      return this;
    }
    
    public a a(Shader paramShader)
    {
      this.a.setShader(paramShader);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.a.d
 * JD-Core Version:    0.7.0.1
 */