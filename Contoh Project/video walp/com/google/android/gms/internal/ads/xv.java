package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class xv
  implements tg
{
  private final SecretKey a;
  
  public xv(byte[] paramArrayOfByte)
  {
    this.a = new SecretKeySpec(paramArrayOfByte, "AES");
  }
  
  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length > 2147483619) {
      throw new GeneralSecurityException("plaintext too long");
    }
    byte[] arrayOfByte1 = new byte[16 + (12 + paramArrayOfByte1.length)];
    byte[] arrayOfByte2 = yy.a(12);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, 12);
    Cipher localCipher = (Cipher)yk.a.a("AES/GCM/NoPadding");
    GCMParameterSpec localGCMParameterSpec = new GCMParameterSpec(128, arrayOfByte2);
    localCipher.init(1, this.a, localGCMParameterSpec);
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte2 = new byte[0];
    }
    localCipher.updateAAD(paramArrayOfByte2);
    localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte1, 12);
    return arrayOfByte1;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xv
 * JD-Core Version:    0.7.0.1
 */