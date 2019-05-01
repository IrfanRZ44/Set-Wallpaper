package com.a.a.c.d.a;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import com.a.a.c.b.a.e;
import com.a.a.c.b.u;
import com.a.a.c.i;
import com.a.a.c.i.a;
import com.a.a.c.j;
import com.a.a.c.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class v<T>
  implements k<T, Bitmap>
{
  public static final i<Long> a = i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1L), new i.a()
  {
    private final ByteBuffer a = ByteBuffer.allocate(8);
    
    public void a(byte[] paramAnonymousArrayOfByte, Long paramAnonymousLong, MessageDigest paramAnonymousMessageDigest)
    {
      paramAnonymousMessageDigest.update(paramAnonymousArrayOfByte);
      synchronized (this.a)
      {
        this.a.position(0);
        paramAnonymousMessageDigest.update(this.a.putLong(paramAnonymousLong.longValue()).array());
        return;
      }
    }
  });
  public static final i<Integer> b = i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new i.a()
  {
    private final ByteBuffer a = ByteBuffer.allocate(4);
    
    public void a(byte[] paramAnonymousArrayOfByte, Integer paramAnonymousInteger, MessageDigest paramAnonymousMessageDigest)
    {
      if (paramAnonymousInteger == null) {
        return;
      }
      paramAnonymousMessageDigest.update(paramAnonymousArrayOfByte);
      synchronized (this.a)
      {
        this.a.position(0);
        paramAnonymousMessageDigest.update(this.a.putInt(paramAnonymousInteger.intValue()).array());
        return;
      }
    }
  });
  private static final b c = new b();
  private final c<T> d;
  private final e e;
  private final b f;
  
  v(e parame, c<T> paramc)
  {
    this(parame, paramc, c);
  }
  
  v(e parame, c<T> paramc, b paramb)
  {
    this.e = parame;
    this.d = paramc;
    this.f = paramb;
  }
  
  @TargetApi(27)
  private static Bitmap a(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((Build.VERSION.SDK_INT >= 27) && (paramInt2 != -2147483648) && (paramInt3 != -2147483648)) {
      return paramMediaMetadataRetriever.getScaledFrameAtTime(paramLong, paramInt1, paramInt2, paramInt3);
    }
    return paramMediaMetadataRetriever.getFrameAtTime(paramLong, paramInt1);
  }
  
  public static k<AssetFileDescriptor, Bitmap> a(e parame)
  {
    return new v(parame, new a(null));
  }
  
  public static k<ParcelFileDescriptor, Bitmap> b(e parame)
  {
    return new v(parame, new d());
  }
  
  public u<Bitmap> a(T paramT, int paramInt1, int paramInt2, j paramj)
  {
    long l = ((Long)paramj.a(a)).longValue();
    if ((l < 0L) && (l != -1L)) {
      throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + l);
    }
    Integer localInteger = (Integer)paramj.a(b);
    if (localInteger == null) {
      localInteger = Integer.valueOf(2);
    }
    MediaMetadataRetriever localMediaMetadataRetriever = this.f.a();
    try
    {
      this.d.a(localMediaMetadataRetriever, paramT);
      Bitmap localBitmap = a(localMediaMetadataRetriever, l, localInteger.intValue(), paramInt1, paramInt2);
      return d.a(localBitmap, this.e);
    }
    catch (RuntimeException localRuntimeException)
    {
      throw new IOException(localRuntimeException);
    }
    finally
    {
      localMediaMetadataRetriever.release();
    }
  }
  
  public boolean a(T paramT, j paramj)
  {
    return true;
  }
  
  private static final class a
    implements v.c<AssetFileDescriptor>
  {
    public void a(MediaMetadataRetriever paramMediaMetadataRetriever, AssetFileDescriptor paramAssetFileDescriptor)
    {
      paramMediaMetadataRetriever.setDataSource(paramAssetFileDescriptor.getFileDescriptor(), paramAssetFileDescriptor.getStartOffset(), paramAssetFileDescriptor.getLength());
    }
  }
  
  static class b
  {
    public MediaMetadataRetriever a()
    {
      return new MediaMetadataRetriever();
    }
  }
  
  static abstract interface c<T>
  {
    public abstract void a(MediaMetadataRetriever paramMediaMetadataRetriever, T paramT);
  }
  
  static final class d
    implements v.c<ParcelFileDescriptor>
  {
    public void a(MediaMetadataRetriever paramMediaMetadataRetriever, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      paramMediaMetadataRetriever.setDataSource(paramParcelFileDescriptor.getFileDescriptor());
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.v
 * JD-Core Version:    0.7.0.1
 */