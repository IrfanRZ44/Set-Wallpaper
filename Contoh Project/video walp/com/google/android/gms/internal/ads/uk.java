package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

final class uk
  implements to<tn>
{
  private final tn d(zw paramzw)
  {
    we localwe1;
    try
    {
      localwe1 = we.a(paramzw);
      if (!(localwe1 instanceof we)) {
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", localabk);
    }
    we localwe2 = (we)localwe1;
    zd.a(localwe2.a(), 0);
    uq.a(localwe2.b());
    wa localwa = localwe2.b();
    wg localwg = localwa.a();
    ECPublicKey localECPublicKey = yf.a(uq.a(localwg.a()), localwe2.c().b(), localwe2.d().b());
    us localus = new us(localwa.b().a());
    tn localtn = (tn)new yb(localECPublicKey, localwg.c().b(), uq.a(localwg.b()), uq.a(localwa.c()), localus);
    return localtn;
  }
  
  public final int a()
  {
    return 0;
  }
  
  public final acl b(acl paramacl)
  {
    throw new GeneralSecurityException("Not implemented.");
  }
  
  public final acl b(zw paramzw)
  {
    throw new GeneralSecurityException("Not implemented.");
  }
  
  public final wt c(zw paramzw)
  {
    throw new GeneralSecurityException("Not implemented.");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uk
 * JD-Core Version:    0.7.0.1
 */