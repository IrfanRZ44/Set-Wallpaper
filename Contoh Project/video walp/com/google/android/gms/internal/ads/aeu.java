package com.google.android.gms.internal.ads;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class aeu
{
  private final ByteBuffer a;
  
  private aeu(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    this.a.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private aeu(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static int a(int paramInt)
  {
    if (paramInt >= 0) {
      return d(paramInt);
    }
    return 10;
  }
  
  public static int a(long paramLong)
  {
    if ((0xFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0x0 & paramLong) == 0L) {
      return 5;
    }
    if ((0x0 & paramLong) == 0L) {
      return 6;
    }
    if ((0x0 & paramLong) == 0L) {
      return 7;
    }
    if ((0x0 & paramLong) == 0L) {
      return 8;
    }
    if ((0x0 & paramLong) == 0L) {
      return 9;
    }
    return 10;
  }
  
  private static int a(CharSequence paramCharSequence)
  {
    int i = 0;
    int j = paramCharSequence.length();
    for (int k = 0; (k < j) && (paramCharSequence.charAt(k) < ''); k++) {}
    for (;;)
    {
      if (k < j)
      {
        int i1 = paramCharSequence.charAt(k);
        if (i1 < 2048)
        {
          m += (127 - i1 >>> 31);
          k++;
          continue;
        }
        int i2 = paramCharSequence.length();
        if (k < i2)
        {
          int i3 = paramCharSequence.charAt(k);
          if (i3 < 2048) {
            i += (127 - i3 >>> 31);
          }
          for (;;)
          {
            k++;
            break;
            i += 2;
            if ((55296 <= i3) && (i3 <= 57343))
            {
              if (Character.codePointAt(paramCharSequence, k) < 65536) {
                throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + k);
              }
              k++;
            }
          }
        }
      }
      for (int n = m + i;; n = m)
      {
        if (n < j)
        {
          long l = 4294967296L + n;
          throw new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + l);
        }
        return n;
      }
      int m = j;
    }
  }
  
  public static int a(String paramString)
  {
    int i = a(paramString);
    return i + d(i);
  }
  
  public static aeu a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static aeu a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new aeu(paramArrayOfByte, 0, paramInt2);
  }
  
  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    if (paramByteBuffer.isReadOnly()) {
      throw new ReadOnlyBufferException();
    }
    if (paramByteBuffer.hasArray()) {}
    for (;;)
    {
      byte[] arrayOfByte;
      int i1;
      int i3;
      int i4;
      int i17;
      int i12;
      try
      {
        arrayOfByte = paramByteBuffer.array();
        i1 = paramByteBuffer.arrayOffset() + paramByteBuffer.position();
        int i2 = paramByteBuffer.remaining();
        i3 = paramCharSequence.length();
        i4 = i1 + i2;
        if ((i >= i3) || (i + i1 >= i4)) {
          break label873;
        }
        int i18 = paramCharSequence.charAt(i);
        if (i18 >= 128) {
          break label873;
        }
        arrayOfByte[(i1 + i)] = ((byte)i18);
        i++;
        continue;
        paramByteBuffer.position(i17 - paramByteBuffer.arrayOffset());
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        int i16;
        BufferOverflowException localBufferOverflowException = new BufferOverflowException();
        localBufferOverflowException.initCause(localArrayIndexOutOfBoundsException);
        throw localBufferOverflowException;
      }
      if (i < i3)
      {
        int i6 = paramCharSequence.charAt(i);
        if ((i6 < 128) && (i5 < i4))
        {
          i12 = i5 + 1;
          arrayOfByte[i5] = ((byte)i6);
        }
        else if ((i6 < 2048) && (i5 <= i4 - 2))
        {
          i16 = i5 + 1;
          arrayOfByte[i5] = ((byte)(0x3C0 | i6 >>> 6));
          i12 = i16 + 1;
          arrayOfByte[i16] = ((byte)(0x80 | i6 & 0x3F));
        }
        else if (((i6 < 55296) || (57343 < i6)) && (i5 <= i4 - 3))
        {
          int i13 = i5 + 1;
          int i14 = (byte)(0x1E0 | i6 >>> 12);
          arrayOfByte[i5] = i14;
          int i15 = i13 + 1;
          arrayOfByte[i13] = ((byte)(0x80 | 0x3F & i6 >>> 6));
          i12 = i15 + 1;
          arrayOfByte[i15] = ((byte)(0x80 | i6 & 0x3F));
        }
        else if (i5 <= i4 - 4)
        {
          char c2;
          if (i + 1 != paramCharSequence.length())
          {
            i++;
            c2 = paramCharSequence.charAt(i);
            if (Character.isSurrogatePair(i6, c2)) {}
          }
          else
          {
            int i7 = i - 1;
            throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + i7);
          }
          int i8 = Character.toCodePoint(i6, c2);
          int i9 = i5 + 1;
          arrayOfByte[i5] = ((byte)(0xF0 | i8 >>> 18));
          int i10 = i9 + 1;
          arrayOfByte[i9] = ((byte)(0x80 | 0x3F & i8 >>> 12));
          int i11 = i10 + 1;
          arrayOfByte[i10] = ((byte)(0x80 | 0x3F & i8 >>> 6));
          i12 = i11 + 1;
          arrayOfByte[i11] = ((byte)(0x80 | i8 & 0x3F));
        }
        else
        {
          throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + i6 + " at index " + i5);
        }
      }
      else
      {
        i17 = i5;
        continue;
        int j = paramCharSequence.length();
        if (i < j)
        {
          int k = paramCharSequence.charAt(i);
          if (k < 128) {
            paramByteBuffer.put((byte)k);
          }
          for (;;)
          {
            i++;
            break;
            if (k < 2048)
            {
              paramByteBuffer.put((byte)(0x3C0 | k >>> 6));
              paramByteBuffer.put((byte)(0x80 | k & 0x3F));
            }
            else if ((k < 55296) || (57343 < k))
            {
              paramByteBuffer.put((byte)(0x1E0 | k >>> 12));
              paramByteBuffer.put((byte)(0x80 | 0x3F & k >>> 6));
              paramByteBuffer.put((byte)(0x80 | k & 0x3F));
            }
            else
            {
              char c1;
              if (i + 1 != paramCharSequence.length())
              {
                i++;
                c1 = paramCharSequence.charAt(i);
                if (Character.isSurrogatePair(k, c1)) {}
              }
              else
              {
                int m = i - 1;
                throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + m);
              }
              int n = Character.toCodePoint(k, c1);
              paramByteBuffer.put((byte)(0xF0 | n >>> 18));
              paramByteBuffer.put((byte)(0x80 | 0x3F & n >>> 12));
              paramByteBuffer.put((byte)(0x80 | 0x3F & n >>> 6));
              paramByteBuffer.put((byte)(0x80 | n & 0x3F));
            }
          }
          label873:
          if (i == i3) {
            i17 = i1 + i3;
          }
        }
        else
        {
          return;
        }
        i5 = i1 + i;
        continue;
      }
      i++;
      int i5 = i12;
    }
  }
  
  public static int b(int paramInt)
  {
    return d(paramInt << 3);
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return b(paramInt1) + a(paramInt2);
  }
  
  public static int b(int paramInt, afc paramafc)
  {
    int i = b(paramInt);
    int j = paramafc.d();
    return i + (j + d(j));
  }
  
  public static int b(int paramInt, String paramString)
  {
    return b(paramInt) + a(paramString);
  }
  
  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return b(paramInt) + b(paramArrayOfByte);
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    return d(paramArrayOfByte.length) + paramArrayOfByte.length;
  }
  
  private final void b(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        e((int)paramLong);
        return;
      }
      e(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }
  
  public static int c(int paramInt, long paramLong)
  {
    return b(paramInt) + a(paramLong);
  }
  
  public static int d(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xFFFFC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int d(int paramInt, long paramLong)
  {
    return b(paramInt) + a(paramLong);
  }
  
  private final void e(int paramInt)
  {
    byte b = (byte)paramInt;
    if (!this.a.hasRemaining()) {
      throw new aev(this.a.position(), this.a.limit());
    }
    this.a.put(b);
  }
  
  public final void a()
  {
    if (this.a.remaining() != 0)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.a.remaining());
      throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", arrayOfObject));
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    c(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      c(paramInt2);
      return;
    }
    b(paramInt2);
  }
  
  public final void a(int paramInt, long paramLong)
  {
    c(paramInt, 0);
    b(paramLong);
  }
  
  public final void a(int paramInt, afc paramafc)
  {
    c(paramInt, 2);
    if (paramafc.Z < 0) {
      paramafc.d();
    }
    c(paramafc.Z);
    paramafc.a(this);
  }
  
  public final void a(int paramInt, String paramString)
  {
    c(paramInt, 2);
    int i;
    int j;
    try
    {
      i = d(paramString.length());
      if (i != d(3 * paramString.length())) {
        break label167;
      }
      j = this.a.position();
      if (this.a.remaining() < i) {
        throw new aev(i + j, this.a.limit());
      }
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      aev localaev = new aev(this.a.position(), this.a.limit());
      localaev.initCause(localBufferOverflowException);
      throw localaev;
    }
    this.a.position(j + i);
    a(paramString, this.a);
    int k = this.a.position();
    this.a.position(j);
    c(k - j - i);
    this.a.position(k);
    return;
    label167:
    c(a(paramString));
    a(paramString, this.a);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    c(paramInt, 0);
    int i = 0;
    if (paramBoolean) {
      i = 1;
    }
    byte b = (byte)i;
    if (!this.a.hasRemaining()) {
      throw new aev(this.a.position(), this.a.limit());
    }
    this.a.put(b);
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    c(paramInt, 2);
    c(paramArrayOfByte.length);
    c(paramArrayOfByte);
  }
  
  public final void b(int paramInt, long paramLong)
  {
    c(paramInt, 0);
    b(paramLong);
  }
  
  public final void c(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        e(paramInt);
        return;
      }
      e(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    c(paramInt2 | paramInt1 << 3);
  }
  
  public final void c(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.a.remaining() >= i)
    {
      this.a.put(paramArrayOfByte, 0, i);
      return;
    }
    throw new aev(this.a.position(), this.a.limit());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aeu
 * JD-Core Version:    0.7.0.1
 */