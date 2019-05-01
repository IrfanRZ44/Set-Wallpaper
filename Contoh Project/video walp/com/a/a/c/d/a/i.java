package com.a.a.c.d.a;

import android.util.Log;
import com.a.a.c.b.a.b;
import com.a.a.c.f;
import com.a.a.c.f.a;
import com.a.a.i.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class i
  implements f
{
  static final byte[] a = "".getBytes(Charset.forName("UTF-8"));
  private static final int[] b = { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
  
  private static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 + 2 + paramInt2 * 12;
  }
  
  private static int a(b paramb)
  {
    int i = "".length();
    int j = paramb.b(i);
    ByteOrder localByteOrder;
    int n;
    label105:
    int i1;
    int i2;
    switch (j)
    {
    default: 
      if (Log.isLoggable("DfltImageHeaderParser", 3)) {
        Log.d("DfltImageHeaderParser", "Unknown endianness = " + j);
      }
      localByteOrder = ByteOrder.BIG_ENDIAN;
      paramb.a(localByteOrder);
      int k = i + paramb.a(i + 4);
      int m = paramb.b(k);
      n = 0;
      if (n >= m) {
        break label504;
      }
      i1 = a(k, n);
      i2 = paramb.b(i1);
      if (i2 == 274) {
        break;
      }
    }
    int i6;
    for (;;)
    {
      n++;
      break label105;
      localByteOrder = ByteOrder.BIG_ENDIAN;
      break;
      localByteOrder = ByteOrder.LITTLE_ENDIAN;
      break;
      int i3 = paramb.b(i1 + 2);
      if ((i3 < 1) || (i3 > 12))
      {
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
          Log.d("DfltImageHeaderParser", "Got invalid format code = " + i3);
        }
      }
      else
      {
        int i4 = paramb.a(i1 + 4);
        if (i4 < 0)
        {
          if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Negative tiff component count");
          }
        }
        else
        {
          if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Got tagIndex=" + n + " tagType=" + i2 + " formatCode=" + i3 + " componentCount=" + i4);
          }
          int i5 = i4 + b[i3];
          if (i5 > 4)
          {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
              Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + i3);
            }
          }
          else
          {
            i6 = i1 + 8;
            if ((i6 < 0) || (i6 > paramb.a()))
            {
              if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i6 + " tagType=" + i2);
              }
            }
            else
            {
              if ((i5 >= 0) && (i6 + i5 <= paramb.a())) {
                break label497;
              }
              if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + i2);
              }
            }
          }
        }
      }
    }
    label497:
    return paramb.b(i6);
    label504:
    return -1;
  }
  
  private int a(c paramc, b paramb)
  {
    int i = paramc.a();
    if (!a(i)) {
      if (Log.isLoggable("DfltImageHeaderParser", 3)) {
        Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + i);
      }
    }
    int j;
    do
    {
      return -1;
      j = b(paramc);
      if (j != -1) {
        break;
      }
    } while (!Log.isLoggable("DfltImageHeaderParser", 3));
    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
    return -1;
    byte[] arrayOfByte = (byte[])paramb.a(j, [B.class);
    try
    {
      int k = a(paramc, arrayOfByte, j);
      return k;
    }
    finally
    {
      paramb.a(arrayOfByte);
    }
  }
  
  private int a(c paramc, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramc.a(paramArrayOfByte, paramInt);
    if (i != paramInt) {
      if (Log.isLoggable("DfltImageHeaderParser", 3)) {
        Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + paramInt + ", actually read: " + i);
      }
    }
    do
    {
      return -1;
      if (a(paramArrayOfByte, paramInt)) {
        return a(new b(paramArrayOfByte, paramInt));
      }
    } while (!Log.isLoggable("DfltImageHeaderParser", 3));
    Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
    return -1;
  }
  
  private f.a a(c paramc)
  {
    int i = paramc.a();
    if (i == 65496) {
      return f.a.b;
    }
    int j = 0xFFFF0000 & i << 16 | 0xFFFF & paramc.a();
    if (j == -1991225785)
    {
      paramc.a(21L);
      if (paramc.c() >= 3) {
        return f.a.d;
      }
      return f.a.e;
    }
    if (j >> 8 == 4671814) {
      return f.a.a;
    }
    if (j != 1380533830) {
      return f.a.h;
    }
    paramc.a(4L);
    if ((0xFFFF0000 & paramc.a() << 16 | 0xFFFF & paramc.a()) != 1464156752) {
      return f.a.h;
    }
    int k = 0xFFFF0000 & paramc.a() << 16 | 0xFFFF & paramc.a();
    if ((k & 0xFFFFFF00) != 1448097792) {
      return f.a.h;
    }
    if ((k & 0xFF) == 88)
    {
      paramc.a(4L);
      if ((0x10 & paramc.c()) != 0) {
        return f.a.f;
      }
      return f.a.g;
    }
    if ((k & 0xFF) == 76)
    {
      paramc.a(4L);
      if ((0x8 & paramc.c()) != 0) {
        return f.a.f;
      }
      return f.a.g;
    }
    return f.a.g;
  }
  
  private static boolean a(int paramInt)
  {
    return ((paramInt & 0xFFD8) == 65496) || (paramInt == 19789) || (paramInt == 18761);
  }
  
  private boolean a(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool;
    if ((paramArrayOfByte != null) && (paramInt > a.length))
    {
      bool = true;
      if (!bool) {}
    }
    else
    {
      for (int i = 0;; i++)
      {
        if (i >= a.length) {
          return bool;
        }
        if (paramArrayOfByte[i] != a[i])
        {
          return false;
          bool = false;
          break;
        }
      }
    }
    return bool;
  }
  
  private int b(c paramc)
  {
    int i = paramc.b();
    if (i != 255) {
      if (Log.isLoggable("DfltImageHeaderParser", 3)) {
        Log.d("DfltImageHeaderParser", "Unknown segmentId=" + i);
      }
    }
    int j;
    int k;
    long l;
    do
    {
      do
      {
        do
        {
          return -1;
          j = paramc.b();
        } while (j == 218);
        if (j != 217) {
          break;
        }
      } while (!Log.isLoggable("DfltImageHeaderParser", 3));
      Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
      return -1;
      k = -2 + paramc.a();
      if (j == 225) {
        break label184;
      }
      l = paramc.a(k);
      if (l == k) {
        break;
      }
    } while (!Log.isLoggable("DfltImageHeaderParser", 3));
    Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + j + ", wanted to skip: " + k + ", but actually skipped: " + l);
    return -1;
    label184:
    return k;
  }
  
  public int a(InputStream paramInputStream, b paramb)
  {
    return a(new d((InputStream)h.a(paramInputStream)), (b)h.a(paramb));
  }
  
  public f.a a(InputStream paramInputStream)
  {
    return a(new d((InputStream)h.a(paramInputStream)));
  }
  
  public f.a a(ByteBuffer paramByteBuffer)
  {
    return a(new a((ByteBuffer)h.a(paramByteBuffer)));
  }
  
  private static final class a
    implements i.c
  {
    private final ByteBuffer a;
    
    a(ByteBuffer paramByteBuffer)
    {
      this.a = paramByteBuffer;
      paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
    
    public int a()
    {
      return 0xFF00 & c() << 8 | 0xFF & c();
    }
    
    public int a(byte[] paramArrayOfByte, int paramInt)
    {
      int i = Math.min(paramInt, this.a.remaining());
      if (i == 0) {
        return -1;
      }
      this.a.get(paramArrayOfByte, 0, i);
      return i;
    }
    
    public long a(long paramLong)
    {
      int i = (int)Math.min(this.a.remaining(), paramLong);
      this.a.position(i + this.a.position());
      return i;
    }
    
    public short b()
    {
      return (short)(0xFF & c());
    }
    
    public int c()
    {
      if (this.a.remaining() < 1) {
        return -1;
      }
      return this.a.get();
    }
  }
  
  private static final class b
  {
    private final ByteBuffer a;
    
    b(byte[] paramArrayOfByte, int paramInt)
    {
      this.a = ((ByteBuffer)ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.BIG_ENDIAN).limit(paramInt));
    }
    
    private boolean a(int paramInt1, int paramInt2)
    {
      return this.a.remaining() - paramInt1 >= paramInt2;
    }
    
    int a()
    {
      return this.a.remaining();
    }
    
    int a(int paramInt)
    {
      if (a(paramInt, 4)) {
        return this.a.getInt(paramInt);
      }
      return -1;
    }
    
    void a(ByteOrder paramByteOrder)
    {
      this.a.order(paramByteOrder);
    }
    
    short b(int paramInt)
    {
      if (a(paramInt, 2)) {
        return this.a.getShort(paramInt);
      }
      return -1;
    }
  }
  
  private static abstract interface c
  {
    public abstract int a();
    
    public abstract int a(byte[] paramArrayOfByte, int paramInt);
    
    public abstract long a(long paramLong);
    
    public abstract short b();
    
    public abstract int c();
  }
  
  private static final class d
    implements i.c
  {
    private final InputStream a;
    
    d(InputStream paramInputStream)
    {
      this.a = paramInputStream;
    }
    
    public int a()
    {
      return 0xFF00 & this.a.read() << 8 | 0xFF & this.a.read();
    }
    
    public int a(byte[] paramArrayOfByte, int paramInt)
    {
      int i = paramInt;
      while (i > 0)
      {
        int j = this.a.read(paramArrayOfByte, paramInt - i, i);
        if (j == -1) {
          break;
        }
        i -= j;
      }
      return paramInt - i;
    }
    
    public long a(long paramLong)
    {
      if (paramLong < 0L) {
        return 0L;
      }
      long l1 = paramLong;
      for (;;)
      {
        if (l1 > 0L)
        {
          long l2 = this.a.skip(l1);
          if (l2 > 0L)
          {
            l1 -= l2;
            continue;
          }
          if (this.a.read() != -1) {}
        }
        else
        {
          return paramLong - l1;
        }
        l1 -= 1L;
      }
    }
    
    public short b()
    {
      return (short)(0xFF & this.a.read());
    }
    
    public int c()
    {
      return this.a.read();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.i
 * JD-Core Version:    0.7.0.1
 */