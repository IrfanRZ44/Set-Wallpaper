package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

final class tx
{
  private static final Charset a = Charset.forName("UTF-8");
  
  public static xe a(xc paramxc)
  {
    xe.a locala = xe.a().a(paramxc.a());
    Iterator localIterator = paramxc.b().iterator();
    while (localIterator.hasNext())
    {
      xc.b localb = (xc.b)localIterator.next();
      locala.a((xe.b)xe.b.a().a(localb.b().a()).a(localb.c()).a(localb.e()).a(localb.d()).c());
    }
    return (xe)locala.c();
  }
  
  public static void b(xc paramxc)
  {
    if (paramxc.c() == 0) {
      throw new GeneralSecurityException("empty keyset");
    }
    int i = paramxc.a();
    Iterator localIterator = paramxc.b().iterator();
    int j = 1;
    int k = 0;
    if (localIterator.hasNext())
    {
      xc.b localb = (xc.b)localIterator.next();
      if (!localb.a())
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(localb.d());
        throw new GeneralSecurityException(String.format("key %d has no key data", arrayOfObject3));
      }
      if (localb.e() == xp.a)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(localb.d());
        throw new GeneralSecurityException(String.format("key %d has unknown prefix", arrayOfObject2));
      }
      if (localb.c() == ww.a)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(localb.d());
        throw new GeneralSecurityException(String.format("key %d has unknown status", arrayOfObject1));
      }
      if ((localb.c() == ww.b) && (localb.d() == i))
      {
        if (k != 0) {
          throw new GeneralSecurityException("keyset contains multiple primary keys");
        }
        k = 1;
      }
      if (localb.b().c() == wt.b.d) {
        break label267;
      }
    }
    label267:
    for (int m = 0;; m = j)
    {
      j = m;
      break;
      if ((k == 0) && (j == 0)) {
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tx
 * JD-Core Version:    0.7.0.1
 */