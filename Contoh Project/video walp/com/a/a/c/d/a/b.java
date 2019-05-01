package com.a.a.c.d.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.a.a.c.b.a.e;
import com.a.a.c.b.u;
import com.a.a.c.c;
import com.a.a.c.j;
import com.a.a.c.l;
import java.io.File;

public class b
  implements l<BitmapDrawable>
{
  private final e a;
  private final l<Bitmap> b;
  
  public b(e parame, l<Bitmap> paraml)
  {
    this.a = parame;
    this.b = paraml;
  }
  
  public c a(j paramj)
  {
    return this.b.a(paramj);
  }
  
  public boolean a(u<BitmapDrawable> paramu, File paramFile, j paramj)
  {
    return this.b.a(new d(((BitmapDrawable)paramu.d()).getBitmap(), this.a), paramFile, paramj);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.b
 * JD-Core Version:    0.7.0.1
 */