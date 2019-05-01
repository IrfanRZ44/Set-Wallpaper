package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

class ua
  implements to<tg>
{
  private static final Logger a = Logger.getLogger(ua.class.getName());
  
  ua()
  {
    tw.a("type.googleapis.com/google.crypto.tink.AesCtrKey", new ub());
  }
  
  private final tg d(zw paramzw)
  {
    ux localux1;
    try
    {
      localux1 = ux.a(paramzw);
      if (!(localux1 instanceof ux)) {
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", localabk);
    }
    ux localux2 = (ux)localux1;
    zd.a(localux2.a(), 0);
    tg localtg = (tg)new yj((yv)tw.b("type.googleapis.com/google.crypto.tink.AesCtrKey", localux2.b()), (ts)tw.b("type.googleapis.com/google.crypto.tink.HmacKey", localux2.c()), localux2.c().b().b());
    return localtg;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof uz)) {
      throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }
    uz localuz = (uz)paramacl;
    vb localvb = (vb)tw.a("type.googleapis.com/google.crypto.tink.AesCtrKey", localuz.a());
    wn localwn = (wn)tw.a("type.googleapis.com/google.crypto.tink.HmacKey", localuz.b());
    return (abe)ux.d().a(localvb).a(localwn).a(0).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(uz.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    ux localux = (ux)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").a(localux.h()).a(wt.b.b).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ua
 * JD-Core Version:    0.7.0.1
 */