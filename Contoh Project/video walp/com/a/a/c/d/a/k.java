package com.a.a.c.d.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.a.a.c.b.a.e;
import com.a.a.c.b.u;
import com.a.a.c.f;
import com.a.a.c.f.a;
import com.a.a.c.g;
import com.a.a.i.h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class k
{
  public static final com.a.a.c.i<com.a.a.c.b> a = com.a.a.c.i.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.a.a.c.b.d);
  public static final com.a.a.c.i<j> b = com.a.a.c.i.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", j.g);
  public static final com.a.a.c.i<Boolean> c = com.a.a.c.i.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.valueOf(false));
  public static final com.a.a.c.i<Boolean> d = com.a.a.c.i.a("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
  private static final Set<String> e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "image/vnd.wap.wbmp", "image/x-ico" })));
  private static final a f = new a()
  {
    public void a() {}
    
    public void a(e paramAnonymouse, Bitmap paramAnonymousBitmap) {}
  };
  private static final Set<f.a> g = Collections.unmodifiableSet(EnumSet.of(f.a.b, f.a.d, f.a.e));
  private static final Queue<BitmapFactory.Options> h = com.a.a.i.i.a(0);
  private final e i;
  private final DisplayMetrics j;
  private final com.a.a.c.b.a.b k;
  private final List<f> l;
  private final o m = o.a();
  
  public k(List<f> paramList, DisplayMetrics paramDisplayMetrics, e parame, com.a.a.c.b.a.b paramb)
  {
    this.l = paramList;
    this.j = ((DisplayMetrics)h.a(paramDisplayMetrics));
    this.i = ((e)h.a(parame));
    this.k = ((com.a.a.c.b.a.b)h.a(paramb));
  }
  
  private static int a(double paramDouble)
  {
    int n = b(paramDouble);
    int i1 = c(paramDouble * n);
    return c(paramDouble / (i1 / n) * i1);
  }
  
  private Bitmap a(InputStream paramInputStream, BitmapFactory.Options paramOptions, j paramj, com.a.a.c.b paramb, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, a parama)
  {
    long l1 = com.a.a.i.d.a();
    int[] arrayOfInt = a(paramInputStream, paramOptions, parama, this.i);
    int n = arrayOfInt[0];
    int i1 = arrayOfInt[1];
    String str = paramOptions.outMimeType;
    if ((n == -1) || (i1 == -1)) {}
    for (boolean bool1 = false;; bool1 = paramBoolean1)
    {
      int i2 = g.b(this.l, paramInputStream, this.k);
      int i3 = t.a(i2);
      boolean bool2 = t.b(i2);
      int i4;
      int i5;
      label101:
      f.a locala;
      if (paramInt1 == -2147483648)
      {
        i4 = n;
        if (paramInt2 != -2147483648) {
          break label347;
        }
        i5 = i1;
        locala = g.a(this.l, paramInputStream, this.k);
        a(locala, paramInputStream, parama, this.i, paramj, i3, n, i1, i4, i5, paramOptions);
        a(paramInputStream, paramb, bool1, bool2, paramOptions, i4, i5);
        if (Build.VERSION.SDK_INT < 19) {
          break label354;
        }
      }
      label347:
      label354:
      for (int i6 = 1;; i6 = 0)
      {
        if (((paramOptions.inSampleSize == 1) || (i6 != 0)) && (a(locala)))
        {
          if ((n < 0) || (i1 < 0) || (!paramBoolean2) || (i6 == 0)) {
            break label360;
          }
          if ((i4 > 0) && (i5 > 0)) {
            a(paramOptions, this.i, i4, i5);
          }
        }
        Bitmap localBitmap1 = b(paramInputStream, paramOptions, parama, this.i);
        parama.a(this.i, localBitmap1);
        if (Log.isLoggable("Downsampler", 2)) {
          a(n, i1, str, paramOptions, localBitmap1, paramInt1, paramInt2, l1);
        }
        Bitmap localBitmap2 = null;
        if (localBitmap1 != null)
        {
          localBitmap1.setDensity(this.j.densityDpi);
          localBitmap2 = t.a(this.i, localBitmap1, i2);
          if (!localBitmap1.equals(localBitmap2)) {
            this.i.a(localBitmap1);
          }
        }
        return localBitmap2;
        i4 = paramInt1;
        break;
        i5 = paramInt2;
        break label101;
      }
      label360:
      if (a(paramOptions)) {}
      for (float f1 = paramOptions.inTargetDensity / paramOptions.inDensity;; f1 = 1.0F)
      {
        int i7 = paramOptions.inSampleSize;
        int i8 = (int)Math.ceil(n / i7);
        int i9 = (int)Math.ceil(i1 / i7);
        i4 = Math.round(f1 * i8);
        i5 = Math.round(f1 * i9);
        if (!Log.isLoggable("Downsampler", 2)) {
          break;
        }
        Log.v("Downsampler", "Calculated target [" + i4 + "x" + i5 + "] for source [" + n + "x" + i1 + "], sampleSize: " + i7 + ", targetDensity: " + paramOptions.inTargetDensity + ", density: " + paramOptions.inDensity + ", density multiplier: " + f1);
        break;
      }
    }
  }
  
  /* Error */
  private static BitmapFactory.Options a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 131	com/a/a/c/d/a/k:h	Ljava/util/Queue;
    //   6: astore_1
    //   7: aload_1
    //   8: monitorenter
    //   9: getstatic 131	com/a/a/c/d/a/k:h	Ljava/util/Queue;
    //   12: invokeinterface 316 1 0
    //   17: checkcast 175	android/graphics/BitmapFactory$Options
    //   20: astore_3
    //   21: aload_1
    //   22: monitorexit
    //   23: aload_3
    //   24: ifnonnull +15 -> 39
    //   27: new 175	android/graphics/BitmapFactory$Options
    //   30: dup
    //   31: invokespecial 317	android/graphics/BitmapFactory$Options:<init>	()V
    //   34: astore_3
    //   35: aload_3
    //   36: invokestatic 320	com/a/a/c/d/a/k:d	(Landroid/graphics/BitmapFactory$Options;)V
    //   39: ldc 2
    //   41: monitorexit
    //   42: aload_3
    //   43: areturn
    //   44: astore_2
    //   45: aload_1
    //   46: monitorexit
    //   47: aload_2
    //   48: athrow
    //   49: astore_0
    //   50: ldc 2
    //   52: monitorexit
    //   53: aload_0
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   49	5	0	localObject1	Object
    //   44	4	2	localObject2	Object
    //   20	23	3	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   9	23	44	finally
    //   45	47	44	finally
    //   3	9	49	finally
    //   27	39	49	finally
    //   47	49	49	finally
  }
  
  private static IOException a(IllegalArgumentException paramIllegalArgumentException, int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions)
  {
    return new IOException("Exception decoding bitmap, outWidth: " + paramInt1 + ", outHeight: " + paramInt2 + ", outMimeType: " + paramString + ", inBitmap: " + b(paramOptions), paramIllegalArgumentException);
  }
  
  @TargetApi(19)
  private static String a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    if (Build.VERSION.SDK_INT >= 19) {}
    for (String str = " (" + paramBitmap.getAllocationByteCount() + ")";; str = "") {
      return "[" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight() + "] " + paramBitmap.getConfig() + str;
    }
  }
  
  private static void a(int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions, Bitmap paramBitmap, int paramInt3, int paramInt4, long paramLong)
  {
    Log.v("Downsampler", "Decoded " + a(paramBitmap) + " from [" + paramInt1 + "x" + paramInt2 + "] " + paramString + " with inBitmap " + b(paramOptions) + " for [" + paramInt3 + "x" + paramInt4 + "], sample size: " + paramOptions.inSampleSize + ", density: " + paramOptions.inDensity + ", target density: " + paramOptions.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + com.a.a.i.d.a(paramLong));
  }
  
  @TargetApi(26)
  private static void a(BitmapFactory.Options paramOptions, e parame, int paramInt1, int paramInt2)
  {
    int n = Build.VERSION.SDK_INT;
    Bitmap.Config localConfig = null;
    if (n >= 26)
    {
      if (paramOptions.inPreferredConfig == Bitmap.Config.HARDWARE) {
        return;
      }
      localConfig = paramOptions.outConfig;
    }
    if (localConfig == null) {
      localConfig = paramOptions.inPreferredConfig;
    }
    paramOptions.inBitmap = parame.b(paramInt1, paramInt2, localConfig);
  }
  
  private static void a(f.a parama, InputStream paramInputStream, a parama1, e parame, j paramj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, BitmapFactory.Options paramOptions)
  {
    if ((paramInt2 <= 0) || (paramInt3 <= 0)) {
      if (Log.isLoggable("Downsampler", 3)) {
        Log.d("Downsampler", "Unable to determine dimensions for: " + parama + " with target [" + paramInt4 + "x" + paramInt5 + "]");
      }
    }
    label332:
    label854:
    label867:
    for (;;)
    {
      return;
      if ((paramInt1 == 90) || (paramInt1 == 270)) {}
      for (float f1 = paramj.a(paramInt3, paramInt2, paramInt4, paramInt5); f1 <= 0.0F; f1 = paramj.a(paramInt2, paramInt3, paramInt4, paramInt5)) {
        throw new IllegalArgumentException("Cannot scale with factor: " + f1 + " from: " + paramj + ", source: [" + paramInt2 + "x" + paramInt3 + "], target: [" + paramInt4 + "x" + paramInt5 + "]");
      }
      j.g localg = paramj.b(paramInt2, paramInt3, paramInt4, paramInt5);
      if (localg == null) {
        throw new IllegalArgumentException("Cannot round with null rounding");
      }
      int n = c(f1 * paramInt2);
      int i1 = c(f1 * paramInt3);
      int i2 = paramInt2 / n;
      int i3 = paramInt3 / i1;
      int i4;
      int i5;
      int i6;
      int i7;
      double d1;
      if (localg == j.g.a)
      {
        i4 = Math.max(i2, i3);
        if ((Build.VERSION.SDK_INT > 23) || (!e.contains(paramOptions.outMimeType))) {
          break label632;
        }
        i5 = 1;
        paramOptions.inSampleSize = i5;
        if (parama != f.a.b) {
          break label671;
        }
        int i8 = Math.min(i5, 8);
        i6 = (int)Math.ceil(paramInt2 / i8);
        i7 = (int)Math.ceil(paramInt3 / i8);
        int i9 = i5 / 8;
        if (i9 > 0)
        {
          i6 /= i9;
          i7 /= i9;
        }
        d1 = paramj.a(i6, i7, paramInt4, paramInt5);
        if (Build.VERSION.SDK_INT >= 19)
        {
          paramOptions.inTargetDensity = a(d1);
          paramOptions.inDensity = b(d1);
        }
        if (!a(paramOptions)) {
          break label854;
        }
        paramOptions.inScaled = true;
      }
      for (;;)
      {
        if (!Log.isLoggable("Downsampler", 2)) {
          break label867;
        }
        Log.v("Downsampler", "Calculate scaling, source: [" + paramInt2 + "x" + paramInt3 + "], target: [" + paramInt4 + "x" + paramInt5 + "], power of two scaled: [" + i6 + "x" + i7 + "], exact scale factor: " + f1 + ", power of 2 sample size: " + i5 + ", adjusted scale factor: " + d1 + ", target density: " + paramOptions.inTargetDensity + ", density: " + paramOptions.inDensity);
        return;
        i4 = Math.min(i2, i3);
        break;
        label632:
        i5 = Math.max(1, Integer.highestOneBit(i4));
        if ((localg != j.g.a) || (i5 >= 1.0F / f1)) {
          break label332;
        }
        i5 <<= 1;
        break label332;
        if ((parama == f.a.e) || (parama == f.a.d))
        {
          i6 = (int)Math.floor(paramInt2 / i5);
          i7 = (int)Math.floor(paramInt3 / i5);
          break label409;
        }
        if ((parama == f.a.g) || (parama == f.a.f))
        {
          if (Build.VERSION.SDK_INT >= 24)
          {
            i6 = Math.round(paramInt2 / i5);
            i7 = Math.round(paramInt3 / i5);
            break label409;
          }
          i6 = (int)Math.floor(paramInt2 / i5);
          i7 = (int)Math.floor(paramInt3 / i5);
          break label409;
        }
        if ((paramInt2 % i5 != 0) || (paramInt3 % i5 != 0))
        {
          int[] arrayOfInt = a(paramInputStream, paramOptions, parama1, parame);
          i6 = arrayOfInt[0];
          i7 = arrayOfInt[1];
          break label409;
        }
        i6 = paramInt2 / i5;
        i7 = paramInt3 / i5;
        break label409;
        paramOptions.inTargetDensity = 0;
        paramOptions.inDensity = 0;
      }
    }
  }
  
  private void a(InputStream paramInputStream, com.a.a.c.b paramb, boolean paramBoolean1, boolean paramBoolean2, BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    if (this.m.a(paramInt1, paramInt2, paramOptions, paramb, paramBoolean1, paramBoolean2)) {}
    do
    {
      return;
      if ((paramb == com.a.a.c.b.a) || (paramb == com.a.a.c.b.b) || (Build.VERSION.SDK_INT == 16))
      {
        paramOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return;
      }
      try
      {
        boolean bool2 = g.a(this.l, paramInputStream, this.k).a();
        bool1 = bool2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + paramb, localIOException);
          }
          boolean bool1 = false;
          continue;
          Bitmap.Config localConfig = Bitmap.Config.RGB_565;
        }
      }
      if (!bool1) {
        break label153;
      }
      localConfig = Bitmap.Config.ARGB_8888;
      paramOptions.inPreferredConfig = localConfig;
    } while (paramOptions.inPreferredConfig != Bitmap.Config.RGB_565);
    paramOptions.inDither = true;
  }
  
  private static boolean a(BitmapFactory.Options paramOptions)
  {
    return (paramOptions.inTargetDensity > 0) && (paramOptions.inDensity > 0) && (paramOptions.inTargetDensity != paramOptions.inDensity);
  }
  
  private boolean a(f.a parama)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return true;
    }
    return g.contains(parama);
  }
  
  private static int[] a(InputStream paramInputStream, BitmapFactory.Options paramOptions, a parama, e parame)
  {
    paramOptions.inJustDecodeBounds = true;
    b(paramInputStream, paramOptions, parama, parame);
    paramOptions.inJustDecodeBounds = false;
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = paramOptions.outWidth;
    arrayOfInt[1] = paramOptions.outHeight;
    return arrayOfInt;
  }
  
  private static int b(double paramDouble)
  {
    if (paramDouble <= 1.0D) {}
    for (;;)
    {
      return (int)Math.round(2147483647.0D * paramDouble);
      paramDouble = 1.0D / paramDouble;
    }
  }
  
  private static Bitmap b(InputStream paramInputStream, BitmapFactory.Options paramOptions, a parama, e parame)
  {
    if (paramOptions.inJustDecodeBounds) {
      paramInputStream.mark(10485760);
    }
    int n;
    int i1;
    String str;
    for (;;)
    {
      n = paramOptions.outWidth;
      i1 = paramOptions.outHeight;
      str = paramOptions.outMimeType;
      t.a().lock();
      try
      {
        Bitmap localBitmap3 = BitmapFactory.decodeStream(paramInputStream, null, paramOptions);
        t.a().unlock();
        if (paramOptions.inJustDecodeBounds) {
          paramInputStream.reset();
        }
        return localBitmap3;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localIOException1 = a(localIllegalArgumentException, n, i1, str, paramOptions);
        if (!Log.isLoggable("Downsampler", 3)) {
          break;
        }
        Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", localIOException1);
        Bitmap localBitmap1 = paramOptions.inBitmap;
        if (localBitmap1 == null) {
          break label183;
        }
        try
        {
          paramInputStream.reset();
          parame.a(paramOptions.inBitmap);
          paramOptions.inBitmap = null;
          Bitmap localBitmap2 = b(paramInputStream, paramOptions, parama, parame);
          return localBitmap2;
        }
        catch (IOException localIOException2)
        {
          throw localIOException1;
        }
      }
      finally
      {
        t.a().unlock();
      }
      parama.a();
    }
    IOException localIOException1;
    label183:
    throw localIOException1;
  }
  
  private static String b(BitmapFactory.Options paramOptions)
  {
    return a(paramOptions.inBitmap);
  }
  
  private static int c(double paramDouble)
  {
    return (int)(0.5D + paramDouble);
  }
  
  private static void c(BitmapFactory.Options paramOptions)
  {
    d(paramOptions);
    synchronized (h)
    {
      h.offer(paramOptions);
      return;
    }
  }
  
  private static void d(BitmapFactory.Options paramOptions)
  {
    paramOptions.inTempStorage = null;
    paramOptions.inDither = false;
    paramOptions.inScaled = false;
    paramOptions.inSampleSize = 1;
    paramOptions.inPreferredConfig = null;
    paramOptions.inJustDecodeBounds = false;
    paramOptions.inDensity = 0;
    paramOptions.inTargetDensity = 0;
    paramOptions.outWidth = 0;
    paramOptions.outHeight = 0;
    paramOptions.outMimeType = null;
    paramOptions.inBitmap = null;
    paramOptions.inMutable = true;
  }
  
  public u<Bitmap> a(InputStream paramInputStream, int paramInt1, int paramInt2, com.a.a.c.j paramj)
  {
    return a(paramInputStream, paramInt1, paramInt2, paramj, f);
  }
  
  public u<Bitmap> a(InputStream paramInputStream, int paramInt1, int paramInt2, com.a.a.c.j paramj, a parama)
  {
    h.a(paramInputStream.markSupported(), "You must provide an InputStream that supports mark()");
    byte[] arrayOfByte = (byte[])this.k.a(65536, [B.class);
    BitmapFactory.Options localOptions = a();
    localOptions.inTempStorage = arrayOfByte;
    com.a.a.c.b localb = (com.a.a.c.b)paramj.a(a);
    j localj = (j)paramj.a(b);
    boolean bool1 = ((Boolean)paramj.a(c)).booleanValue();
    boolean bool2;
    if ((paramj.a(d) != null) && (((Boolean)paramj.a(d)).booleanValue())) {
      bool2 = true;
    }
    for (;;)
    {
      boolean bool3;
      if (localb == com.a.a.c.b.b) {
        bool3 = false;
      }
      try
      {
        d locald = d.a(a(paramInputStream, localOptions, localj, localb, bool3, paramInt1, paramInt2, bool1, parama), this.i);
        return locald;
        bool2 = false;
      }
      finally
      {
        c(localOptions);
        this.k.a(arrayOfByte);
      }
    }
  }
  
  public boolean a(InputStream paramInputStream)
  {
    return true;
  }
  
  public boolean a(ByteBuffer paramByteBuffer)
  {
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void a(e parame, Bitmap paramBitmap);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.k
 * JD-Core Version:    0.7.0.1
 */