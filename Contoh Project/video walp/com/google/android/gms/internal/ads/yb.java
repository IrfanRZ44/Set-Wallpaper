package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

public final class yb
  implements tn
{
  private static final byte[] a = new byte[0];
  private final yd b;
  private final String c;
  private final byte[] d;
  private final yi e;
  private final xz f;
  
  public yb(ECPublicKey paramECPublicKey, byte[] paramArrayOfByte, String paramString, yi paramyi, xz paramxz)
  {
    yf.a(paramECPublicKey.getW(), paramECPublicKey.getParams().getCurve());
    this.b = new yd(paramECPublicKey);
    this.d = paramArrayOfByte;
    this.c = paramString;
    this.e = paramyi;
    this.f = paramxz;
  }
  
  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    ye localye = this.b.a(this.c, this.d, paramArrayOfByte2, this.f.a(), this.e);
    byte[] arrayOfByte1 = this.f.a(localye.b()).a(paramArrayOfByte1, a);
    byte[] arrayOfByte2 = localye.a();
    return ByteBuffer.allocate(arrayOfByte2.length + arrayOfByte1.length).put(arrayOfByte2).put(arrayOfByte1).array();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.yb
 * JD-Core Version:    0.7.0.1
 */