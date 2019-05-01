package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

final class hn
  implements Runnable
{
  hn(hk paramhk, Bitmap paramBitmap) {}
  
  public final void run()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    this.a.compress(Bitmap.CompressFormat.PNG, 0, localByteArrayOutputStream);
    synchronized (hk.a(this.b))
    {
      hk.b(this.b).g = new afn();
      hk.b(this.b).g.c = localByteArrayOutputStream.toByteArray();
      hk.b(this.b).g.b = "image/png";
      hk.b(this.b).g.a = Integer.valueOf(1);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hn
 * JD-Core Version:    0.7.0.1
 */