package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.k;
import java.io.InputStream;

final class bf
  implements ld<ate>
{
  bf(ay paramay, boolean paramBoolean1, double paramDouble, boolean paramBoolean2, String paramString) {}
  
  @TargetApi(19)
  private final ate b(InputStream paramInputStream)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inDensity = ((int)(160.0D * this.b));
    if (!this.c) {
      localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    }
    long l1 = SystemClock.uptimeMillis();
    Bitmap localBitmap1;
    try
    {
      Bitmap localBitmap2 = BitmapFactory.decodeStream(paramInputStream, null, localOptions);
      localBitmap1 = localBitmap2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        je.b("Error grabbing image.", localException);
        localBitmap1 = null;
      }
      l2 = SystemClock.uptimeMillis();
      if (!k.g()) {
        break label209;
      }
    }
    if (localBitmap1 == null)
    {
      this.e.a(2, this.a);
      return null;
    }
    long l2;
    int i;
    int j;
    int k;
    long l3;
    if (je.a())
    {
      i = localBitmap1.getWidth();
      j = localBitmap1.getHeight();
      k = localBitmap1.getAllocationByteCount();
      l3 = l2 - l1;
      if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
        break label240;
      }
    }
    label209:
    label240:
    for (boolean bool = true;; bool = false)
    {
      je.a(108 + "Decoded image w: " + i + " h:" + j + " bytes: " + k + " time: " + l3 + " on ui thread: " + bool);
      return new ate(new BitmapDrawable(Resources.getSystem(), localBitmap1), Uri.parse(this.d), this.b);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bf
 * JD-Core Version:    0.7.0.1
 */