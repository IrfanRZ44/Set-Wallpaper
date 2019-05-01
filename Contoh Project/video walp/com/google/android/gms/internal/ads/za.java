package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class za
  implements yv
{
  static final int[] a = a(ByteBuffer.wrap(new byte[] { 101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107 }));
  final yu b;
  private final int c;
  
  za(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte.length != 32) {
      throw new InvalidKeyException("The key length in bytes must be 32.");
    }
    this.b = yu.a(paramArrayOfByte);
    this.c = paramInt;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 << paramInt2 | paramInt1 >>> -paramInt2;
  }
  
  static int[] a(ByteBuffer paramByteBuffer)
  {
    IntBuffer localIntBuffer = paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
    int[] arrayOfInt = new int[localIntBuffer.remaining()];
    localIntBuffer.get(arrayOfInt);
    return arrayOfInt;
  }
  
  abstract int a();
  
  abstract ByteBuffer a(byte[] paramArrayOfByte, int paramInt);
  
  final void a(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte)
  {
    if (paramByteBuffer.remaining() - a() < paramArrayOfByte.length) {
      throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
    byte[] arrayOfByte = yy.a(a());
    paramByteBuffer.put(arrayOfByte);
    ByteBuffer localByteBuffer1 = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer1.remaining();
    int j = 1 + i / 64;
    int k = 0;
    if (k < j)
    {
      ByteBuffer localByteBuffer2 = a(arrayOfByte, k + this.c);
      if (k == j - 1) {
        xw.a(paramByteBuffer, localByteBuffer1, localByteBuffer2, i % 64);
      }
      for (;;)
      {
        k++;
        break;
        xw.a(paramByteBuffer, localByteBuffer1, localByteBuffer2, 64);
      }
    }
  }
  
  public final byte[] a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    a();
    if (i > 2147483635) {
      throw new GeneralSecurityException("plaintext too long");
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(a() + paramArrayOfByte.length);
    a(localByteBuffer, paramArrayOfByte);
    return localByteBuffer.array();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.za
 * JD-Core Version:    0.7.0.1
 */