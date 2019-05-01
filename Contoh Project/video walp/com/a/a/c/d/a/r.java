package com.a.a.c.d.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.a.a.c.b.a.e;
import com.a.a.c.b.u;
import com.a.a.c.d.c.d;
import com.a.a.c.j;
import com.a.a.c.k;

public class r
  implements k<Uri, Bitmap>
{
  private final d a;
  private final e b;
  
  public r(d paramd, e parame)
  {
    this.a = paramd;
    this.b = parame;
  }
  
  public u<Bitmap> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    u localu = this.a.a(paramUri, paramInt1, paramInt2, paramj);
    if (localu == null) {
      return null;
    }
    Drawable localDrawable = (Drawable)localu.d();
    return l.a(this.b, localDrawable, paramInt1, paramInt2);
  }
  
  public boolean a(Uri paramUri, j paramj)
  {
    return "android.resource".equals(paramUri.getScheme());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.r
 * JD-Core Version:    0.7.0.1
 */