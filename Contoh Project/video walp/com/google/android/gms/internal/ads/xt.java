package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class xt
  implements yv
{
  private final SecretKeySpec a;
  private final int b;
  private final int c;
  
  public xt(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = new SecretKeySpec(paramArrayOfByte, "AES");
    this.c = ((Cipher)yk.a.a("AES/CTR/NoPadding")).getBlockSize();
    if ((paramInt < 12) || (paramInt > this.c)) {
      throw new GeneralSecurityException("invalid IV size");
    }
    this.b = paramInt;
  }
  
  public final byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length > 2147483647 - this.b)
    {
      int k = 2147483647 - this.b;
      throw new GeneralSecurityException(43 + "plaintext length can not exceed " + k);
    }
    byte[] arrayOfByte1 = new byte[this.b + paramArrayOfByte.length];
    byte[] arrayOfByte2 = yy.a(this.b);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, this.b);
    int i = paramArrayOfByte.length;
    int j = this.b;
    Cipher localCipher = (Cipher)yk.a.a("AES/CTR/NoPadding");
    byte[] arrayOfByte3 = new byte[this.c];
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, this.b);
    IvParameterSpec localIvParameterSpec = new IvParameterSpec(arrayOfByte3);
    localCipher.init(1, this.a, localIvParameterSpec);
    if (localCipher.doFinal(paramArrayOfByte, 0, i, arrayOfByte1, j) != i) {
      throw new GeneralSecurityException("stored output's length does not match input's length");
    }
    return arrayOfByte1;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xt
 * JD-Core Version:    0.7.0.1
 */