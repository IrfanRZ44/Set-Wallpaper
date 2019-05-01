package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class ul
{
  public static final xr a = (xr)((xr.a)xr.b().a(tz.a)).a(tj.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).a(tj.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).a("TINK_HYBRID_1_0_0").c();
  private static final xr b = (xr)((xr.a)xr.b().a(a)).a("TINK_HYBRID_1_1_0").c();
  
  static
  {
    try
    {
      tw.a("TinkHybridEncrypt", new un());
      tw.a("TinkHybridDecrypt", new um());
      tz.a();
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new ExceptionInInitializerError(localGeneralSecurityException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ul
 * JD-Core Version:    0.7.0.1
 */