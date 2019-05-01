package com.a.a.c.d.e;

import android.content.Context;
import android.graphics.Bitmap;
import com.a.a.c.b.a.e;
import com.a.a.c.b.u;
import com.a.a.c.d.a.d;
import com.a.a.c.m;
import com.a.a.i.h;
import java.security.MessageDigest;

public class f
  implements m<c>
{
  private final m<Bitmap> b;
  
  public f(m<Bitmap> paramm)
  {
    this.b = ((m)h.a(paramm));
  }
  
  public u<c> a(Context paramContext, u<c> paramu, int paramInt1, int paramInt2)
  {
    c localc = (c)paramu.d();
    e locale = com.a.a.c.a(paramContext).a();
    d locald = new d(localc.b(), locale);
    u localu = this.b.a(paramContext, locald, paramInt1, paramInt2);
    if (!locald.equals(localu)) {
      locald.f();
    }
    Bitmap localBitmap = (Bitmap)localu.d();
    localc.a(this.b, localBitmap);
    return paramu;
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    this.b.a(paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof f))
    {
      f localf = (f)paramObject;
      return this.b.equals(localf.b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.e.f
 * JD-Core Version:    0.7.0.1
 */