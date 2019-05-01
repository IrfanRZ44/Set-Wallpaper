package com.a.a.c.d.f;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.a.a.c.b.u;
import com.a.a.c.d.b.b;
import com.a.a.c.j;
import java.io.ByteArrayOutputStream;

public class a
  implements e<Bitmap, byte[]>
{
  private final Bitmap.CompressFormat a;
  private final int b;
  
  public a()
  {
    this(Bitmap.CompressFormat.JPEG, 100);
  }
  
  public a(Bitmap.CompressFormat paramCompressFormat, int paramInt)
  {
    this.a = paramCompressFormat;
    this.b = paramInt;
  }
  
  public u<byte[]> a(u<Bitmap> paramu, j paramj)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    ((Bitmap)paramu.d()).compress(this.a, this.b, localByteArrayOutputStream);
    paramu.f();
    return new b(localByteArrayOutputStream.toByteArray());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.f.a
 * JD-Core Version:    0.7.0.1
 */