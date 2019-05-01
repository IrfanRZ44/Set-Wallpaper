package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

final class us
  implements xz
{
  private final String a;
  private final int b;
  private vo c;
  private ux d;
  private int e;
  
  us(wy paramwy)
  {
    this.a = paramwy.a();
    if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
      try
      {
        vq localvq = vq.a(paramwy.b());
        this.c = ((vo)tw.b(paramwy));
        this.b = localvq.a();
        return;
      }
      catch (abk localabk2)
      {
        throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", localabk2);
      }
    }
    if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
      try
      {
        uz localuz = uz.a(paramwy.b());
        this.d = ((ux)tw.b(paramwy));
        this.e = localuz.a().b();
        this.b = (localuz.b().b() + this.e);
        return;
      }
      catch (abk localabk1)
      {
        throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", localabk1);
      }
    }
    String str1 = String.valueOf(this.a);
    if (str1.length() != 0) {}
    for (String str2 = "unsupported AEAD DEM key type: ".concat(str1);; str2 = new String("unsupported AEAD DEM key type: ")) {
      throw new GeneralSecurityException(str2);
    }
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final tg a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length != this.b) {
      throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
    if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
    {
      vo localvo = (vo)((vo.a)vo.c().a(this.c)).a(zw.a(paramArrayOfByte, 0, this.b)).c();
      return (tg)tw.b(this.a, localvo);
    }
    if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
    {
      byte[] arrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte, 0, this.e);
      byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte, this.e, this.b);
      vb localvb = (vb)((vb.a)vb.d().a(this.d.b())).a(zw.a(arrayOfByte1)).c();
      wn localwn = (wn)((wn.a)wn.d().a(this.d.c())).a(zw.a(arrayOfByte2)).c();
      ux localux = (ux)ux.d().a(this.d.a()).a(localvb).a(localwn).c();
      return (tg)tw.b(this.a, localux);
    }
    throw new GeneralSecurityException("unknown DEM key type");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.us
 * JD-Core Version:    0.7.0.1
 */