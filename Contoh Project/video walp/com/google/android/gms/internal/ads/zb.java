package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class zb
  implements tg
{
  private final byte[] a;
  private final za b;
  private final za c;
  
  zb(byte[] paramArrayOfByte)
  {
    this.a = ((byte[])paramArrayOfByte.clone());
    this.b = a(paramArrayOfByte, 1);
    this.c = a(paramArrayOfByte, 0);
  }
  
  abstract za a(byte[] paramArrayOfByte, int paramInt);
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    this.b.a();
    if (i > 2147483619) {
      throw new GeneralSecurityException("plaintext too long");
    }
    ByteBuffer localByteBuffer1 = ByteBuffer.allocate(16 + (paramArrayOfByte1.length + this.b.a()));
    if (localByteBuffer1.remaining() < 16 + (paramArrayOfByte1.length + this.b.a())) {
      throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
    int j = localByteBuffer1.position();
    this.b.a(localByteBuffer1, paramArrayOfByte1);
    localByteBuffer1.position(j);
    byte[] arrayOfByte1 = new byte[this.b.a()];
    localByteBuffer1.get(arrayOfByte1);
    localByteBuffer1.limit(-16 + localByteBuffer1.limit());
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte2 = new byte[0];
    }
    ByteBuffer localByteBuffer2 = this.c.a(arrayOfByte1, 0);
    byte[] arrayOfByte2 = new byte[32];
    localByteBuffer2.get(arrayOfByte2);
    int k;
    int m;
    if (paramArrayOfByte2.length % 16 == 0)
    {
      k = paramArrayOfByte2.length;
      m = localByteBuffer1.remaining();
      if (m % 16 != 0) {
        break label326;
      }
    }
    label326:
    for (int n = m;; n = m + 16 - m % 16)
    {
      ByteBuffer localByteBuffer3 = ByteBuffer.allocate(16 + (k + n)).order(ByteOrder.LITTLE_ENDIAN);
      localByteBuffer3.put(paramArrayOfByte2);
      localByteBuffer3.position(k);
      localByteBuffer3.put(localByteBuffer1);
      localByteBuffer3.position(k + n);
      localByteBuffer3.putLong(paramArrayOfByte2.length);
      localByteBuffer3.putLong(m);
      byte[] arrayOfByte3 = yx.a(arrayOfByte2, localByteBuffer3.array());
      localByteBuffer1.limit(16 + localByteBuffer1.limit());
      localByteBuffer1.put(arrayOfByte3);
      return localByteBuffer1.array();
      k = 16 + paramArrayOfByte2.length - paramArrayOfByte2.length % 16;
      break;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zb
 * JD-Core Version:    0.7.0.1
 */