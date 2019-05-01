package com.a.a.c.d.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.a.a.c.b.a.e;
import com.a.a.c.b.a.f;
import com.a.a.c.b.u;
import java.util.concurrent.locks.Lock;

final class l
{
  private static final e a = new f()
  {
    public void a(Bitmap paramAnonymousBitmap) {}
  };
  
  static u<Bitmap> a(e parame, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    Drawable localDrawable = paramDrawable.getCurrent();
    Bitmap localBitmap;
    int i;
    if ((localDrawable instanceof BitmapDrawable))
    {
      localBitmap = ((BitmapDrawable)localDrawable).getBitmap();
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {}
      for (;;)
      {
        return d.a(localBitmap, parame);
        if ((localDrawable instanceof Animatable)) {
          break label70;
        }
        localBitmap = b(parame, localDrawable, paramInt1, paramInt2);
        i = 1;
        break;
        parame = a;
      }
      label70:
      i = 0;
      localBitmap = null;
    }
  }
  
  private static Bitmap b(e parame, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == -2147483648) && (paramDrawable.getIntrinsicWidth() <= 0)) {
      if (Log.isLoggable("DrawableToBitmap", 5)) {
        Log.w("DrawableToBitmap", "Unable to draw " + paramDrawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
      }
    }
    do
    {
      return null;
      if ((paramInt2 != -2147483648) || (paramDrawable.getIntrinsicHeight() > 0)) {
        break;
      }
    } while (!Log.isLoggable("DrawableToBitmap", 5));
    Log.w("DrawableToBitmap", "Unable to draw " + paramDrawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
    return null;
    if (paramDrawable.getIntrinsicWidth() > 0) {
      paramInt1 = paramDrawable.getIntrinsicWidth();
    }
    if (paramDrawable.getIntrinsicHeight() > 0) {
      paramInt2 = paramDrawable.getIntrinsicHeight();
    }
    Lock localLock = t.a();
    localLock.lock();
    Bitmap localBitmap = parame.a(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    try
    {
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
      paramDrawable.draw(localCanvas);
      localCanvas.setBitmap(null);
      return localBitmap;
    }
    finally
    {
      localLock.unlock();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.l
 * JD-Core Version:    0.7.0.1
 */