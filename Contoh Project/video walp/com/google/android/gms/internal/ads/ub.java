package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class ub
  implements to<yv>
{
  private static void a(vf paramvf)
  {
    if ((paramvf.a() < 12) || (paramvf.a() > 16)) {
      throw new GeneralSecurityException("invalid IV size");
    }
  }
  
  private final xt d(zw paramzw)
  {
    vb localvb1;
    try
    {
      localvb1 = vb.a(paramzw);
      if (!(localvb1 instanceof vb)) {
        throw new GeneralSecurityException("expected AesCtrKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized AesCtrKey proto", localabk);
    }
    vb localvb2 = (vb)localvb1;
    zd.a(localvb2.a(), 0);
    zd.a(localvb2.c().a());
    a(localvb2.b());
    xt localxt = (xt)new xt(localvb2.c().b(), localvb2.b().a());
    return localxt;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof vd)) {
      throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }
    vd localvd = (vd)paramacl;
    zd.a(localvd.b());
    a(localvd.a());
    return (abe)vb.d().a(localvd.a()).a(zw.a(yy.a(localvd.b()))).a(0).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(vd.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    vb localvb = (vb)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.AesCtrKey").a(localvb.h()).a(wt.b.b).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ub
 * JD-Core Version:    0.7.0.1
 */