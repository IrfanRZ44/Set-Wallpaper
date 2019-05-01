package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class ut
  implements to<ts>
{
  private static void a(wr paramwr)
  {
    if (paramwr.b() < 10) {
      throw new GeneralSecurityException("tag size too small");
    }
    switch (uu.a[paramwr.a().ordinal()])
    {
    default: 
      throw new GeneralSecurityException("unknown hash type");
    case 1: 
      if (paramwr.b() > 20) {
        throw new GeneralSecurityException("tag size too big");
      }
      break;
    case 2: 
      if (paramwr.b() > 32) {
        throw new GeneralSecurityException("tag size too big");
      }
      break;
    case 3: 
      if (paramwr.b() > 64) {
        throw new GeneralSecurityException("tag size too big");
      }
      break;
    }
  }
  
  private final ts d(zw paramzw)
  {
    wn localwn1;
    try
    {
      localwn1 = wn.a(paramzw);
      if (!(localwn1 instanceof wn)) {
        throw new GeneralSecurityException("expected HmacKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized HmacKey proto", localabk);
    }
    wn localwn2 = (wn)localwn1;
    zd.a(localwn2.a(), 0);
    if (localwn2.c().a() < 16) {
      throw new GeneralSecurityException("key too short");
    }
    a(localwn2.b());
    wl localwl = localwn2.b().a();
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(localwn2.c().b(), "HMAC");
    int i = localwn2.b().b();
    yw localyw;
    switch (uu.a[localwl.ordinal()])
    {
    default: 
      throw new GeneralSecurityException("unknown hash");
    case 1: 
      localyw = new yw("HMACSHA1", localSecretKeySpec, i);
    }
    for (;;)
    {
      return (ts)localyw;
      localyw = new yw("HMACSHA256", localSecretKeySpec, i);
      continue;
      localyw = new yw("HMACSHA512", localSecretKeySpec, i);
    }
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof wp)) {
      throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }
    wp localwp = (wp)paramacl;
    if (localwp.b() < 16) {
      throw new GeneralSecurityException("key too short");
    }
    a(localwp.a());
    return (abe)wn.d().a(0).a(localwp.a()).a(zw.a(yy.a(localwp.b()))).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(wp.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    wn localwn = (wn)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.HmacKey").a(localwn.h()).a(wt.b.b).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ut
 * JD-Core Version:    0.7.0.1
 */