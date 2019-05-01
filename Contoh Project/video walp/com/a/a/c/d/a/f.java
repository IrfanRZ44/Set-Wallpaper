package com.a.a.c.d.a;

import android.graphics.Bitmap;
import com.a.a.c.b.u;
import com.a.a.c.j;
import com.a.a.i.a;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class f
  implements com.a.a.c.k<ByteBuffer, Bitmap>
{
  private final k a;
  
  public f(k paramk)
  {
    this.a = paramk;
  }
  
  public u<Bitmap> a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, j paramj)
  {
    InputStream localInputStream = a.b(paramByteBuffer);
    return this.a.a(localInputStream, paramInt1, paramInt2, paramj);
  }
  
  public boolean a(ByteBuffer paramByteBuffer, j paramj)
  {
    return this.a.a(paramByteBuffer);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.f
 * JD-Core Version:    0.7.0.1
 */