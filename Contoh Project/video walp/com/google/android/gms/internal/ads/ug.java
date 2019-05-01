package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class ug
  implements tg
{
  private static final byte[] a = new byte[0];
  private final wy b;
  private final tg c;
  
  public ug(wy paramwy, tg paramtg)
  {
    this.b = paramwy;
    this.c = paramtg;
  }
  
  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte1 = tw.b(this.b).i();
    byte[] arrayOfByte2 = this.c.a(arrayOfByte1, a);
    byte[] arrayOfByte3 = ((tg)tw.a(this.b.a(), arrayOfByte1)).a(paramArrayOfByte1, paramArrayOfByte2);
    return ByteBuffer.allocate(4 + arrayOfByte2.length + arrayOfByte3.length).putInt(arrayOfByte2.length).put(arrayOfByte2).put(arrayOfByte3).array();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ug
 * JD-Core Version:    0.7.0.1
 */