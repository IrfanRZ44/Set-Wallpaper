package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class uc
  implements to<tg>
{
  private final tg d(zw paramzw)
  {
    vh localvh1;
    try
    {
      localvh1 = vh.a(paramzw);
      if (!(localvh1 instanceof vh)) {
        throw new GeneralSecurityException("expected AesEaxKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized AesEaxKey proto", localabk);
    }
    vh localvh2 = (vh)localvh1;
    zd.a(localvh2.a(), 0);
    zd.a(localvh2.c().a());
    if ((localvh2.b().a() != 12) && (localvh2.b().a() != 16)) {
      throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
    tg localtg = (tg)new xu(localvh2.c().b(), localvh2.b().a());
    return localtg;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof vk)) {
      throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }
    vk localvk = (vk)paramacl;
    zd.a(localvk.b());
    if ((localvk.a().a() != 12) && (localvk.a().a() != 16)) {
      throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
    return (abe)vh.d().a(zw.a(yy.a(localvk.b()))).a(localvk.a()).a(0).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(vk.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    vh localvh = (vh)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.AesEaxKey").a(localvh.h()).a(wt.b.b).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uc
 * JD-Core Version:    0.7.0.1
 */