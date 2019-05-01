package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class yd
{
  private ECPublicKey a;
  
  public yd(ECPublicKey paramECPublicKey)
  {
    this.a = paramECPublicKey;
  }
  
  public final ye a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, yi paramyi)
  {
    KeyPair localKeyPair = yf.a(this.a.getParams());
    ECPublicKey localECPublicKey1 = (ECPublicKey)localKeyPair.getPublic();
    ECPrivateKey localECPrivateKey = (ECPrivateKey)localKeyPair.getPrivate();
    ECPublicKey localECPublicKey2 = this.a;
    ECParameterSpec localECParameterSpec1 = localECPublicKey2.getParams();
    ECParameterSpec localECParameterSpec2 = localECPrivateKey.getParams();
    if ((!localECParameterSpec1.getCurve().equals(localECParameterSpec2.getCurve())) || (!localECParameterSpec1.getGenerator().equals(localECParameterSpec2.getGenerator())) || (!localECParameterSpec1.getOrder().equals(localECParameterSpec2.getOrder())) || (localECParameterSpec1.getCofactor() != localECParameterSpec2.getCofactor())) {
      throw new GeneralSecurityException("invalid public key spec");
    }
    byte[] arrayOfByte1 = yf.a(localECPrivateKey, localECPublicKey2.getW());
    EllipticCurve localEllipticCurve = localECPublicKey1.getParams().getCurve();
    ECPoint localECPoint = localECPublicKey1.getW();
    yf.a(localECPoint, localEllipticCurve);
    int i = yf.a(localEllipticCurve);
    byte[] arrayOfByte2;
    byte[] arrayOfByte4;
    Mac localMac;
    switch (yg.a[paramyi.ordinal()])
    {
    default: 
      String str = String.valueOf(paramyi);
      throw new GeneralSecurityException(15 + String.valueOf(str).length() + "invalid format:" + str);
    case 1: 
      byte[] arrayOfByte8 = new byte[1 + i * 2];
      byte[] arrayOfByte9 = localECPoint.getAffineX().toByteArray();
      byte[] arrayOfByte10 = localECPoint.getAffineY().toByteArray();
      System.arraycopy(arrayOfByte10, 0, arrayOfByte8, 1 + i * 2 - arrayOfByte10.length, arrayOfByte10.length);
      System.arraycopy(arrayOfByte9, 0, arrayOfByte8, i + 1 - arrayOfByte9.length, arrayOfByte9.length);
      arrayOfByte8[0] = 4;
      arrayOfByte2 = arrayOfByte8;
      arrayOfByte4 = xw.a(new byte[][] { arrayOfByte2, arrayOfByte1 });
      localMac = (Mac)yk.b.a(paramString);
      if (paramInt > 255 * localMac.getMacLength()) {
        throw new GeneralSecurityException("size too large");
      }
      break;
    case 2: 
      arrayOfByte2 = new byte[i + 1];
      byte[] arrayOfByte3 = localECPoint.getAffineX().toByteArray();
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, i + 1 - arrayOfByte3.length, arrayOfByte3.length);
      if (localECPoint.getAffineY().testBit(0)) {}
      for (int j = 3;; j = 2)
      {
        arrayOfByte2[0] = j;
        break;
      }
    }
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0)) {
      localMac.init(new SecretKeySpec(new byte[localMac.getMacLength()], paramString));
    }
    byte[] arrayOfByte6;
    byte[] arrayOfByte7;
    int m;
    for (;;)
    {
      byte[] arrayOfByte5 = localMac.doFinal(arrayOfByte4);
      arrayOfByte6 = new byte[paramInt];
      localMac.init(new SecretKeySpec(arrayOfByte5, paramString));
      arrayOfByte7 = new byte[0];
      int k = 1;
      m = 0;
      for (;;)
      {
        localMac.update(arrayOfByte7);
        localMac.update(paramArrayOfByte2);
        localMac.update((byte)k);
        arrayOfByte7 = localMac.doFinal();
        if (m + arrayOfByte7.length >= paramInt) {
          break;
        }
        System.arraycopy(arrayOfByte7, 0, arrayOfByte6, m, arrayOfByte7.length);
        m += arrayOfByte7.length;
        k++;
      }
      localMac.init(new SecretKeySpec(paramArrayOfByte1, paramString));
    }
    System.arraycopy(arrayOfByte7, 0, arrayOfByte6, m, paramInt - m);
    return new ye(arrayOfByte2, arrayOfByte6);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.yd
 * JD-Core Version:    0.7.0.1
 */