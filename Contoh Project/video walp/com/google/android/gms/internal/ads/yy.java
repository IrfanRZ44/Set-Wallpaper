package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class yy
{
  private static final ThreadLocal<SecureRandom> a = new yz();
  
  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    ((SecureRandom)a.get()).nextBytes(arrayOfByte);
    return arrayOfByte;
  }
  
  private static SecureRandom b()
  {
    SecureRandom localSecureRandom = new SecureRandom();
    localSecureRandom.nextLong();
    return localSecureRandom;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.yy
 * JD-Core Version:    0.7.0.1
 */