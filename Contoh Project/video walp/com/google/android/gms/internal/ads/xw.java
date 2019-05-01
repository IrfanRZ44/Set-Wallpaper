package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class xw
{
  public static final void a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, ByteBuffer paramByteBuffer3, int paramInt)
  {
    if ((paramInt < 0) || (paramByteBuffer2.remaining() < paramInt) || (paramByteBuffer3.remaining() < paramInt) || (paramByteBuffer1.remaining() < paramInt)) {
      throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
    for (int i = 0; i < paramInt; i++) {
      paramByteBuffer1.put((byte)(paramByteBuffer2.get() ^ paramByteBuffer3.get()));
    }
  }
  
  public static byte[] a(byte[]... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      byte[] arrayOfByte3 = paramVarArgs[j];
      if (k > 2147483647 - arrayOfByte3.length) {
        throw new GeneralSecurityException("exceeded size limit");
      }
      k += arrayOfByte3.length;
      j++;
    }
    byte[] arrayOfByte1 = new byte[k];
    int m = paramVarArgs.length;
    int n = 0;
    int i1 = 0;
    while (n < m)
    {
      byte[] arrayOfByte2 = paramVarArgs[n];
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i1, arrayOfByte2.length);
      i1 += arrayOfByte2.length;
      n++;
    }
    return arrayOfByte1;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xw
 * JD-Core Version:    0.7.0.1
 */