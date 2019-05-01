package com.a.a.c.d.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.a.a.c.f;
import com.a.a.c.f.a;
import com.a.a.c.g;
import com.a.a.c.j;
import com.a.a.c.k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class a
  implements k<ByteBuffer, c>
{
  private static final a a = new a();
  private static final b b = new b();
  private final Context c;
  private final List<f> d;
  private final b e;
  private final a f;
  private final b g;
  
  public a(Context paramContext, List<f> paramList, com.a.a.c.b.a.e parame, com.a.a.c.b.a.b paramb)
  {
    this(paramContext, paramList, parame, paramb, b, a);
  }
  
  a(Context paramContext, List<f> paramList, com.a.a.c.b.a.e parame, com.a.a.c.b.a.b paramb, b paramb1, a parama)
  {
    this.c = paramContext.getApplicationContext();
    this.d = paramList;
    this.f = parama;
    this.g = new b(parame, paramb);
    this.e = paramb1;
  }
  
  private static int a(com.a.a.b.c paramc, int paramInt1, int paramInt2)
  {
    int i = Math.min(paramc.a() / paramInt2, paramc.b() / paramInt1);
    if (i == 0) {}
    for (int j = 0;; j = Integer.highestOneBit(i))
    {
      int k = Math.max(1, j);
      if ((Log.isLoggable("BufferGifDecoder", 2)) && (k > 1)) {
        Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + k + ", target dimens: [" + paramInt1 + "x" + paramInt2 + "], actual dimens: [" + paramc.b() + "x" + paramc.a() + "]");
      }
      return k;
    }
  }
  
  private e a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, com.a.a.b.d paramd, j paramj)
  {
    long l = com.a.a.i.d.a();
    try
    {
      com.a.a.b.c localc = paramd.b();
      if (localc.c() > 0)
      {
        int i = localc.d();
        if (i == 0) {}
      }
      else
      {
        return null;
      }
      if (paramj.a(i.a) == com.a.a.c.b.c) {}
      com.a.a.b.a locala;
      Bitmap localBitmap;
      for (Bitmap.Config localConfig = Bitmap.Config.RGB_565;; localConfig = Bitmap.Config.ARGB_8888)
      {
        int j = a(localc, paramInt1, paramInt2);
        locala = this.f.a(this.g, localc, paramByteBuffer, j);
        locala.a(localConfig);
        locala.b();
        localBitmap = locala.h();
        if (localBitmap != null) {
          break;
        }
        return null;
      }
      com.a.a.c.d.b localb = com.a.a.c.d.b.a();
      e locale = new e(new c(this.c, locala, localb, paramInt1, paramInt2, localBitmap));
      return locale;
    }
    finally
    {
      if (Log.isLoggable("BufferGifDecoder", 2)) {
        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.a.a.i.d.a(l));
      }
    }
  }
  
  public e a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, j paramj)
  {
    com.a.a.b.d locald = this.e.a(paramByteBuffer);
    try
    {
      e locale = a(paramByteBuffer, paramInt1, paramInt2, locald, paramj);
      return locale;
    }
    finally
    {
      this.e.a(locald);
    }
  }
  
  public boolean a(ByteBuffer paramByteBuffer, j paramj)
  {
    return (!((Boolean)paramj.a(i.b)).booleanValue()) && (g.a(this.d, paramByteBuffer) == f.a.a);
  }
  
  static class a
  {
    com.a.a.b.a a(com.a.a.b.a.a parama, com.a.a.b.c paramc, ByteBuffer paramByteBuffer, int paramInt)
    {
      return new com.a.a.b.e(parama, paramc, paramByteBuffer, paramInt);
    }
  }
  
  static class b
  {
    private final Queue<com.a.a.b.d> a = com.a.a.i.i.a(0);
    
    com.a.a.b.d a(ByteBuffer paramByteBuffer)
    {
      try
      {
        com.a.a.b.d locald1 = (com.a.a.b.d)this.a.poll();
        if (locald1 == null) {
          locald1 = new com.a.a.b.d();
        }
        com.a.a.b.d locald2 = locald1.a(paramByteBuffer);
        return locald2;
      }
      finally {}
    }
    
    void a(com.a.a.b.d paramd)
    {
      try
      {
        paramd.a();
        this.a.offer(paramd);
        return;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.e.a
 * JD-Core Version:    0.7.0.1
 */