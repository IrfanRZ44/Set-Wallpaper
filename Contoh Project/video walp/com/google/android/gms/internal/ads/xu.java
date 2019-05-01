package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class xu
  implements tg
{
  private final byte[] a;
  private final byte[] b;
  private final SecretKeySpec c;
  private final int d;
  
  public xu(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramInt != 12) && (paramInt != 16)) {
      throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }
    this.d = paramInt;
    this.c = new SecretKeySpec(paramArrayOfByte, "AES");
    Cipher localCipher = Cipher.getInstance("AES/ECB/NOPADDING");
    localCipher.init(1, this.c);
    this.a = a(localCipher.doFinal(new byte[16]));
    this.b = a(this.a);
  }
  
  private final byte[] a(Cipher paramCipher, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = 0;
    byte[] arrayOfByte1 = new byte[16];
    arrayOfByte1[15] = ((byte)paramInt1);
    if (paramInt3 == 0) {
      return paramCipher.doFinal(b(arrayOfByte1, this.a));
    }
    byte[] arrayOfByte2 = paramCipher.doFinal(arrayOfByte1);
    int j = 0;
    byte[] arrayOfByte3 = arrayOfByte2;
    while (paramInt3 - j > 16)
    {
      for (int k = 0; k < 16; k++) {
        arrayOfByte3[k] = ((byte)(arrayOfByte3[k] ^ paramArrayOfByte[(k + (paramInt2 + j))]));
      }
      arrayOfByte3 = paramCipher.doFinal(arrayOfByte3);
      j += 16;
    }
    byte[] arrayOfByte4 = Arrays.copyOfRange(paramArrayOfByte, paramInt2 + j, paramInt2 + paramInt3);
    if (arrayOfByte4.length == 16) {}
    byte[] arrayOfByte5;
    for (Object localObject = b(arrayOfByte4, this.a);; localObject = arrayOfByte5)
    {
      return paramCipher.doFinal(b(arrayOfByte3, (byte[])localObject));
      arrayOfByte5 = Arrays.copyOf(this.b, 16);
      while (i < arrayOfByte4.length)
      {
        arrayOfByte5[i] = ((byte)(arrayOfByte5[i] ^ arrayOfByte4[i]));
        i++;
      }
      arrayOfByte5[arrayOfByte4.length] = ((byte)(0x80 ^ arrayOfByte5[arrayOfByte4.length]));
    }
  }
  
  private static byte[] a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[16];
    for (int i = 0; i < 15; i++) {
      arrayOfByte[i] = ((byte)(paramArrayOfByte[i] << 1 ^ (0xFF & paramArrayOfByte[(i + 1)]) >>> 7));
    }
    int j = paramArrayOfByte[15] << 1;
    int k = 0x80 & paramArrayOfByte[0];
    int m = 0;
    if (k == 0) {}
    for (;;)
    {
      arrayOfByte[15] = ((byte)(m ^ j));
      return arrayOfByte;
      m = 135;
    }
  }
  
  private static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++) {
      arrayOfByte[j] = ((byte)(paramArrayOfByte1[j] ^ paramArrayOfByte2[j]));
    }
    return arrayOfByte;
  }
  
  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    if (paramArrayOfByte1.length > -16 + (2147483647 - this.d)) {
      throw new GeneralSecurityException("plaintext too long");
    }
    byte[] arrayOfByte1 = new byte[16 + (this.d + paramArrayOfByte1.length)];
    byte[] arrayOfByte2 = yy.a(this.d);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, this.d);
    Cipher localCipher1 = Cipher.getInstance("AES/ECB/NOPADDING");
    localCipher1.init(1, this.c);
    byte[] arrayOfByte3 = a(localCipher1, 0, arrayOfByte2, 0, arrayOfByte2.length);
    if (paramArrayOfByte2 == null) {}
    for (byte[] arrayOfByte4 = new byte[0];; arrayOfByte4 = paramArrayOfByte2)
    {
      byte[] arrayOfByte5 = a(localCipher1, 1, arrayOfByte4, 0, arrayOfByte4.length);
      Cipher localCipher2 = Cipher.getInstance("AES/CTR/NOPADDING");
      localCipher2.init(1, this.c, new IvParameterSpec(arrayOfByte3));
      localCipher2.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte1, this.d);
      byte[] arrayOfByte6 = a(localCipher1, 2, arrayOfByte1, this.d, paramArrayOfByte1.length);
      int j = paramArrayOfByte1.length + this.d;
      while (i < 16)
      {
        arrayOfByte1[(j + i)] = ((byte)(arrayOfByte5[i] ^ arrayOfByte3[i] ^ arrayOfByte6[i]));
        i++;
      }
      return arrayOfByte1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xu
 * JD-Core Version:    0.7.0.1
 */