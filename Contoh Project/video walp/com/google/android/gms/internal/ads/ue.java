package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class ue
  implements to<tg>
{
  private static vs b()
  {
    return (vs)vs.c().a(0).a(zw.a(yy.a(32))).c();
  }
  
  private final tg d(zw paramzw)
  {
    vs localvs1;
    try
    {
      localvs1 = vs.a(paramzw);
      if (!(localvs1 instanceof vs)) {
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", localabk);
    }
    vs localvs2 = (vs)localvs1;
    zd.a(localvs2.a(), 0);
    if (localvs2.b().a() != 32) {
      throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
    tg localtg = (tg)new xy(localvs2.b().b());
    return localtg;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    return b();
  }
  
  public final acl b(zw paramzw)
  {
    return b();
  }
  
  public final wt c(zw paramzw)
  {
    vs localvs = b();
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").a(localvs.h()).a(wt.b.b).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ue
 * JD-Core Version:    0.7.0.1
 */