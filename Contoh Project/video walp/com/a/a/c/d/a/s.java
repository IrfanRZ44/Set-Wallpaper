package com.a.a.c.d.a;

import android.graphics.Bitmap;
import com.a.a.c.b.a.b;
import com.a.a.c.b.a.e;
import com.a.a.c.b.u;
import com.a.a.c.j;
import com.a.a.i.c;
import com.a.a.i.f;
import java.io.IOException;
import java.io.InputStream;

public class s
  implements com.a.a.c.k<InputStream, Bitmap>
{
  private final k a;
  private final b b;
  
  public s(k paramk, b paramb)
  {
    this.a = paramk;
    this.b = paramb;
  }
  
  public u<Bitmap> a(InputStream paramInputStream, int paramInt1, int paramInt2, j paramj)
  {
    if ((paramInputStream instanceof q))
    {
      localObject1 = (q)paramInputStream;
      i = 0;
    }
    for (;;)
    {
      localc = c.a((InputStream)localObject1);
      f localf = new f(localc);
      a locala = new a((q)localObject1, localc);
      try
      {
        u localu = this.a.a(localf, paramInt1, paramInt2, paramj, locala);
        return localu;
      }
      finally
      {
        q localq;
        localc.b();
        if (i == 0) {
          break;
        }
        ((q)localObject1).b();
      }
      localq = new q(paramInputStream, this.b);
      i = 1;
      localObject1 = localq;
    }
  }
  
  public boolean a(InputStream paramInputStream, j paramj)
  {
    return this.a.a(paramInputStream);
  }
  
  static class a
    implements k.a
  {
    private final q a;
    private final c b;
    
    a(q paramq, c paramc)
    {
      this.a = paramq;
      this.b = paramc;
    }
    
    public void a()
    {
      this.a.a();
    }
    
    public void a(e parame, Bitmap paramBitmap)
    {
      IOException localIOException = this.b.a();
      if (localIOException != null)
      {
        if (paramBitmap != null) {
          parame.a(paramBitmap);
        }
        throw localIOException;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.s
 * JD-Core Version:    0.7.0.1
 */