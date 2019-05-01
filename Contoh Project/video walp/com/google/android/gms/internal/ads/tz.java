package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class tz
{
  public static final xr a = (xr)((xr.a)xr.b().a(uw.a)).a(tj.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).a(tj.a("TinkAead", "Aead", "AesEaxKey", 0, true)).a(tj.a("TinkAead", "Aead", "AesGcmKey", 0, true)).a(tj.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).a(tj.a("TinkAead", "Aead", "KmsAeadKey", 0, true)).a(tj.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).a("TINK_AEAD_1_0_0").c();
  private static final xr b = (xr)((xr.a)xr.b().a(a)).a("TINK_AEAD_1_1_0").c();
  
  static
  {
    try
    {
      a();
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new ExceptionInInitializerError(localGeneralSecurityException);
    }
  }
  
  public static void a()
  {
    tw.a("TinkAead", new ty());
    uw.a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tz
 * JD-Core Version:    0.7.0.1
 */