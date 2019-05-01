package com.a.a.c.d.e;

import android.util.Log;
import com.a.a.c.b.a.b;
import com.a.a.c.b.u;
import com.a.a.c.f;
import com.a.a.c.f.a;
import com.a.a.c.g;
import com.a.a.c.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j
  implements k<InputStream, c>
{
  private final List<f> a;
  private final k<ByteBuffer, c> b;
  private final b c;
  
  public j(List<f> paramList, k<ByteBuffer, c> paramk, b paramb)
  {
    this.a = paramList;
    this.b = paramk;
    this.c = paramb;
  }
  
  private static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(16384);
    try
    {
      byte[] arrayOfByte = new byte[16384];
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localByteArrayOutputStream.flush();
    }
    catch (IOException localIOException)
    {
      if (Log.isLoggable("StreamGifDecoder", 5)) {
        Log.w("StreamGifDecoder", "Error reading data from stream", localIOException);
      }
      return null;
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public u<c> a(InputStream paramInputStream, int paramInt1, int paramInt2, com.a.a.c.j paramj)
  {
    byte[] arrayOfByte = a(paramInputStream);
    if (arrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    return this.b.a(localByteBuffer, paramInt1, paramInt2, paramj);
  }
  
  public boolean a(InputStream paramInputStream, com.a.a.c.j paramj)
  {
    return (!((Boolean)paramj.a(i.b)).booleanValue()) && (g.a(this.a, paramInputStream, this.c) == f.a.a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.e.j
 * JD-Core Version:    0.7.0.1
 */