package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class uj
  implements to<tm>
{
  private final tm d(zw paramzw)
  {
    wc localwc1;
    try
    {
      localwc1 = wc.a(paramzw);
      if (!(localwc1 instanceof wc)) {
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", localabk);
    }
    wc localwc2 = (wc)localwc1;
    zd.a(localwc2.a(), 0);
    uq.a(localwc2.b().b());
    wa localwa = localwc2.b().b();
    wg localwg = localwa.a();
    yh localyh = uq.a(localwg.a());
    byte[] arrayOfByte = localwc2.c().b();
    ECParameterSpec localECParameterSpec = yf.a(localyh);
    ECPrivateKeySpec localECPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, arrayOfByte), localECParameterSpec);
    ECPrivateKey localECPrivateKey = (ECPrivateKey)((KeyFactory)yk.e.a("EC")).generatePrivate(localECPrivateKeySpec);
    us localus = new us(localwa.b().a());
    tm localtm = (tm)new ya(localECPrivateKey, localwg.c().b(), uq.a(localwg.b()), uq.a(localwa.c()), localus);
    return localtm;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof vy)) {
      throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }
    vy localvy = (vy)paramacl;
    uq.a(localvy.a());
    KeyPair localKeyPair = yf.a(yf.a(uq.a(localvy.a().a().a())));
    ECPublicKey localECPublicKey = (ECPublicKey)localKeyPair.getPublic();
    ECPrivateKey localECPrivateKey = (ECPrivateKey)localKeyPair.getPrivate();
    ECPoint localECPoint = localECPublicKey.getW();
    we localwe = (we)we.e().a(0).a(localvy.a()).a(zw.a(localECPoint.getAffineX().toByteArray())).b(zw.a(localECPoint.getAffineY().toByteArray())).c();
    return (abe)wc.d().a(0).a(localwe).a(zw.a(localECPrivateKey.getS().toByteArray())).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(vy.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("invalid EciesAeadHkdf key format", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    wc localwc = (wc)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").a(localwc.h()).a(wt.b.c).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uj
 * JD-Core Version:    0.7.0.1
 */