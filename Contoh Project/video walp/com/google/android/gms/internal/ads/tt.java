package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

public final class tt
{
  @Deprecated
  public static final tp a(byte[] paramArrayOfByte)
  {
    xc localxc;
    try
    {
      localxc = xc.a(paramArrayOfByte);
      Iterator localIterator = localxc.b().iterator();
      while (localIterator.hasNext())
      {
        xc.b localb = (xc.b)localIterator.next();
        if ((localb.b().c() == wt.b.a) || (localb.b().c() == wt.b.b) || (localb.b().c() == wt.b.c)) {
          throw new GeneralSecurityException("keyset contains secret key material");
        }
      }
    }
    catch (abk localabk)
    {
      throw new GeneralSecurityException("invalid keyset");
    }
    tp localtp = tp.a(localxc);
    return localtp;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tt
 * JD-Core Version:    0.7.0.1
 */