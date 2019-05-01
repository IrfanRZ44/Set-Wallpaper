package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class yj
  implements tg
{
  private final yv a;
  private final ts b;
  private final int c;
  
  public yj(yv paramyv, ts paramts, int paramInt)
  {
    this.a = paramyv;
    this.b = paramts;
    this.c = paramInt;
  }
  
  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte1 = this.a.a(paramArrayOfByte1);
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte2 = new byte[0];
    }
    byte[] arrayOfByte2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(8L * paramArrayOfByte2.length).array(), 8);
    return xw.a(new byte[][] { arrayOfByte1, this.b.a(xw.a(new byte[][] { paramArrayOfByte2, arrayOfByte1, arrayOfByte2 })) });
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.yj
 * JD-Core Version:    0.7.0.1
 */