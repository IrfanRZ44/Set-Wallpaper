package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

public final class ya
  implements tm
{
  private static final byte[] a = new byte[0];
  private final ECPrivateKey b;
  private final yc c;
  private final String d;
  private final byte[] e;
  private final yi f;
  private final xz g;
  
  public ya(ECPrivateKey paramECPrivateKey, byte[] paramArrayOfByte, String paramString, yi paramyi, xz paramxz)
  {
    this.b = paramECPrivateKey;
    this.c = new yc(paramECPrivateKey);
    this.e = paramArrayOfByte;
    this.d = paramString;
    this.f = paramyi;
    this.g = paramxz;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ya
 * JD-Core Version:    0.7.0.1
 */