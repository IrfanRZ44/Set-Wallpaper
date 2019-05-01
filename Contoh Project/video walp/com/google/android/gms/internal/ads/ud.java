package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class ud
  implements to<tg>
{
  private final tg d(zw paramzw)
  {
    vo localvo1;
    try
    {
      localvo1 = vo.a(paramzw);
      if (!(localvo1 instanceof vo)) {
        throw new GeneralSecurityException("expected AesGcmKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected AesGcmKey proto");
    }
    vo localvo2 = (vo)localvo1;
    zd.a(localvo2.a(), 0);
    zd.a(localvo2.b().a());
    tg localtg = (tg)new xv(localvo2.b().b());
    return localtg;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof vq)) {
      throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }
    vq localvq = (vq)paramacl;
    zd.a(localvq.a());
    return (abe)vo.c().a(zw.a(yy.a(localvq.a()))).a(0).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(vq.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    vo localvo = (vo)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.AesGcmKey").a(localvo.h()).a(wt.b.b).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ud
 * JD-Core Version:    0.7.0.1
 */