package com.a.a.c.d.a;

import android.graphics.Bitmap;
import java.security.MessageDigest;

public class h
  extends e
{
  private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);
  
  protected Bitmap a(com.a.a.c.b.a.e parame, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return t.c(parame, paramBitmap, paramInt1, paramInt2);
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(b);
  }
  
  public boolean equals(Object paramObject)
  {
    return paramObject instanceof h;
  }
  
  public int hashCode()
  {
    return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.h
 * JD-Core Version:    0.7.0.1
 */