package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class uf
  implements to<tg>
{
  private static tg c(acl paramacl)
  {
    if (!(paramacl instanceof xg)) {
      throw new GeneralSecurityException("expected KmsAeadKey proto");
    }
    xg localxg = (xg)paramacl;
    zd.a(localxg.a(), 0);
    String str = localxg.b().a();
    return tr.a(str).b(str);
  }
  
  private static tg d(zw paramzw)
  {
    try
    {
      tg localtg = c(xg.a(paramzw));
      return localtg;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected KmsAeadKey proto", localabk);
    }
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof xi)) {
      throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }
    xi localxi = (xi)paramacl;
    return (abe)xg.c().a(localxi).a(0).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(xi.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    xg localxg = (xg)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.KmsAeadKey").a(localxg.h()).a(wt.b.e).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uf
 * JD-Core Version:    0.7.0.1
 */