package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

final class xx
  extends za
{
  private static final byte[] c = new byte[16];
  
  xx(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramArrayOfByte, paramInt);
  }
  
  private static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramArrayOfInt[paramInt1] += paramArrayOfInt[paramInt2];
    paramArrayOfInt[paramInt4] = a(paramArrayOfInt[paramInt4] ^ paramArrayOfInt[paramInt1], 16);
    paramArrayOfInt[paramInt3] += paramArrayOfInt[paramInt4];
    paramArrayOfInt[paramInt2] = a(paramArrayOfInt[paramInt2] ^ paramArrayOfInt[paramInt3], 12);
    paramArrayOfInt[paramInt1] += paramArrayOfInt[paramInt2];
    paramArrayOfInt[paramInt4] = a(paramArrayOfInt[paramInt4] ^ paramArrayOfInt[paramInt1], 8);
    paramArrayOfInt[paramInt3] += paramArrayOfInt[paramInt4];
    paramArrayOfInt[paramInt2] = a(paramArrayOfInt[paramInt2] ^ paramArrayOfInt[paramInt3], 7);
  }
  
  final int a()
  {
    return 12;
  }
  
  final ByteBuffer a(byte[] paramArrayOfByte, int paramInt)
  {
    int[] arrayOfInt1 = new int[16];
    System.arraycopy(za.a, 0, arrayOfInt1, 0, a.length);
    int[] arrayOfInt2 = a(ByteBuffer.wrap(this.b.a()));
    System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 4, arrayOfInt2.length);
    arrayOfInt1[12] = paramInt;
    System.arraycopy(a(ByteBuffer.wrap(paramArrayOfByte)), 0, arrayOfInt1, 13, 3);
    int[] arrayOfInt3 = (int[])arrayOfInt1.clone();
    for (int i = 0; i < 10; i++)
    {
      a(arrayOfInt3, 0, 4, 8, 12);
      a(arrayOfInt3, 1, 5, 9, 13);
      a(arrayOfInt3, 2, 6, 10, 14);
      a(arrayOfInt3, 3, 7, 11, 15);
      a(arrayOfInt3, 0, 5, 10, 15);
      a(arrayOfInt3, 1, 6, 11, 12);
      a(arrayOfInt3, 2, 7, 8, 13);
      a(arrayOfInt3, 3, 4, 9, 14);
    }
    for (int j = 0; j < 16; j++) {
      arrayOfInt1[j] += arrayOfInt3[j];
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.asIntBuffer().put(arrayOfInt1, 0, 16);
    return localByteBuffer;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xx
 * JD-Core Version:    0.7.0.1
 */