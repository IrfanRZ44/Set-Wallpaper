package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class uh
  implements to<tg>
{
  private final tg d(zw paramzw)
  {
    xk localxk1;
    try
    {
      localxk1 = xk.a(paramzw);
      if (!(localxk1 instanceof xk)) {
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", localabk);
    }
    xk localxk2 = (xk)localxk1;
    zd.a(localxk2.a(), 0);
    String str = localxk2.b().a();
    tg localtg1 = tr.a(str).b(str);
    tg localtg2 = (tg)new ug(localxk2.b().b(), localtg1);
    return localtg2;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    if (!(paramacl instanceof xn)) {
      throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }
    xn localxn = (xn)paramacl;
    return (abe)xk.c().a(localxn).a(0).c();
  }
  
  public final acl b(zw paramzw)
  {
    try
    {
      acl localacl = b(xn.a(paramzw));
      return localacl;
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", localabk);
    }
  }
  
  public final wt c(zw paramzw)
  {
    xk localxk = (xk)b(paramzw);
    return (wt)wt.d().a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").a(localxk.h()).a(wt.b.e).c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uh
 * JD-Core Version:    0.7.0.1
 */