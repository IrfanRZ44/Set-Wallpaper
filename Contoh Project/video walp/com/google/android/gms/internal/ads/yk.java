package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class yk<T_WRAPPER extends yl<T_ENGINE>, T_ENGINE>
{
  public static final yk<yn, Cipher> a;
  public static final yk<yr, Mac> b;
  public static final yk<yo, KeyAgreement> c;
  public static final yk<yq, KeyPairGenerator> d;
  public static final yk<yp, KeyFactory> e;
  private static final Logger f = Logger.getLogger(yk.class.getName());
  private static final List<Provider> g;
  private static final yk<yt, Signature> h;
  private static final yk<ys, MessageDigest> i;
  private T_WRAPPER j;
  private List<Provider> k;
  private boolean l;
  
  static
  {
    ArrayList localArrayList;
    if (zc.a())
    {
      String[] arrayOfString = { "GmsCore_OpenSSL", "AndroidOpenSSL" };
      localArrayList = new ArrayList();
      int m = 0;
      if (m < 2)
      {
        String str = arrayOfString[m];
        Provider localProvider = Security.getProvider(str);
        if (localProvider != null) {
          localArrayList.add(localProvider);
        }
        for (;;)
        {
          m++;
          break;
          f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[] { str }));
        }
      }
    }
    for (g = localArrayList;; g = new ArrayList())
    {
      a = new yk(new yn());
      b = new yk(new yr());
      h = new yk(new yt());
      i = new yk(new ys());
      c = new yk(new yo());
      d = new yk(new yq());
      e = new yk(new yp());
      return;
    }
  }
  
  private yk(T_WRAPPER paramT_WRAPPER)
  {
    this.j = paramT_WRAPPER;
    this.k = g;
    this.l = true;
  }
  
  private final boolean a(String paramString, Provider paramProvider)
  {
    try
    {
      this.j.a(paramString, paramProvider);
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public final T_ENGINE a(String paramString)
  {
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      Provider localProvider = (Provider)localIterator.next();
      if (a(paramString, localProvider)) {
        return this.j.a(paramString, localProvider);
      }
    }
    if (this.l) {
      return this.j.a(paramString, null);
    }
    throw new GeneralSecurityException("No good Provider found.");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.yk
 * JD-Core Version:    0.7.0.1
 */