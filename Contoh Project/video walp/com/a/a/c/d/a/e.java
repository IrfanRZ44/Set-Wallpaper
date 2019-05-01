package com.a.a.c.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.a.a.c;
import com.a.a.c.b.u;
import com.a.a.c.m;
import com.a.a.i.i;

public abstract class e
  implements m<Bitmap>
{
  protected abstract Bitmap a(com.a.a.c.b.a.e parame, Bitmap paramBitmap, int paramInt1, int paramInt2);
  
  public final u<Bitmap> a(Context paramContext, u<Bitmap> paramu, int paramInt1, int paramInt2)
  {
    if (!i.a(paramInt1, paramInt2)) {
      throw new IllegalArgumentException("Cannot apply transformation on width: " + paramInt1 + " or height: " + paramInt2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
    com.a.a.c.b.a.e locale = c.a(paramContext).a();
    Bitmap localBitmap1 = (Bitmap)paramu.d();
    if (paramInt1 == -2147483648) {
      paramInt1 = localBitmap1.getWidth();
    }
    if (paramInt2 == -2147483648) {
      paramInt2 = localBitmap1.getHeight();
    }
    Bitmap localBitmap2 = a(locale, localBitmap1, paramInt1, paramInt2);
    if (localBitmap1.equals(localBitmap2)) {
      return paramu;
    }
    return d.a(localBitmap2, locale);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.e
 * JD-Core Version:    0.7.0.1
 */