package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class tw
{
  private static final Logger a = Logger.getLogger(tw.class.getName());
  private static final ConcurrentMap<String, to> b = new ConcurrentHashMap();
  private static final ConcurrentMap<String, Boolean> c = new ConcurrentHashMap();
  private static final ConcurrentMap<String, ti> d = new ConcurrentHashMap();
  
  public static <P> acl a(String paramString, acl paramacl)
  {
    to localto = b(paramString);
    if (((Boolean)c.get(paramString)).booleanValue()) {
      return localto.b(paramacl);
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "newKey-operation not permitted for key type ".concat(str1);; str2 = new String("newKey-operation not permitted for key type ")) {
      throw new GeneralSecurityException(str2);
    }
  }
  
  public static <P> ti<P> a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("catalogueName must be non-null.");
    }
    ti localti = (ti)d.get(paramString.toLowerCase());
    if (localti == null)
    {
      String str = String.format("no catalogue found for %s. ", new Object[] { paramString });
      if (paramString.toLowerCase().startsWith("tinkaead")) {
        str = String.valueOf(str).concat("Maybe call AeadConfig.init().");
      }
      if (paramString.toLowerCase().startsWith("tinkdeterministicaead")) {
        str = String.valueOf(str).concat("Maybe call DeterministicAeadConfig.init().");
      }
      for (;;)
      {
        throw new GeneralSecurityException(str);
        if (paramString.toLowerCase().startsWith("tinkstreamingaead")) {
          str = String.valueOf(str).concat("Maybe call StreamingAeadConfig.init().");
        } else if ((paramString.toLowerCase().startsWith("tinkhybriddecrypt")) || (paramString.toLowerCase().startsWith("tinkhybridencrypt"))) {
          str = String.valueOf(str).concat("Maybe call HybridConfig.init().");
        } else if (paramString.toLowerCase().startsWith("tinkmac")) {
          str = String.valueOf(str).concat("Maybe call MacConfig.init().");
        } else if ((paramString.toLowerCase().startsWith("tinkpublickeysign")) || (paramString.toLowerCase().startsWith("tinkpublickeyverify"))) {
          str = String.valueOf(str).concat("Maybe call SignatureConfig.init().");
        } else if (paramString.toLowerCase().startsWith("tink")) {
          str = String.valueOf(str).concat("Maybe call TinkConfig.init().");
        }
      }
    }
    return localti;
  }
  
  public static <P> tu<P> a(tp paramtp, to<P> paramto)
  {
    tx.b(paramtp.a());
    tu localtu = new tu();
    Iterator localIterator = paramtp.a().b().iterator();
    while (localIterator.hasNext())
    {
      xc.b localb = (xc.b)localIterator.next();
      if (localb.c() == ww.b)
      {
        tv localtv = localtu.a(a(localb.b().a(), localb.b().b()), localb);
        if (localb.d() == paramtp.a().a()) {
          localtu.a(localtv);
        }
      }
    }
    return localtu;
  }
  
  public static <P> wt a(wy paramwy)
  {
    to localto = b(paramwy.a());
    if (((Boolean)c.get(paramwy.a())).booleanValue()) {
      return localto.c(paramwy.b());
    }
    String str1 = String.valueOf(paramwy.a());
    if (str1.length() != 0) {}
    for (String str2 = "newKey-operation not permitted for key type ".concat(str1);; str2 = new String("newKey-operation not permitted for key type ")) {
      throw new GeneralSecurityException(str2);
    }
  }
  
  private static <P> P a(String paramString, zw paramzw)
  {
    return b(paramString).a(paramzw);
  }
  
  public static <P> P a(String paramString, byte[] paramArrayOfByte)
  {
    return a(paramString, zw.a(paramArrayOfByte));
  }
  
  public static <P> void a(String paramString, ti<P> paramti)
  {
    for (;;)
    {
      try
      {
        if (!d.containsKey(paramString.toLowerCase())) {
          break;
        }
        ti localti = (ti)d.get(paramString.toLowerCase());
        if (paramti.getClass().equals(localti.getClass())) {
          break;
        }
        Logger localLogger = a;
        Level localLevel = Level.WARNING;
        String str1 = String.valueOf(paramString);
        if (str1.length() != 0)
        {
          str2 = "Attempted overwrite of a catalogueName catalogue for name ".concat(str1);
          localLogger.logp(localLevel, "com.google.crypto.tink.Registry", "addCatalogue", str2);
          throw new GeneralSecurityException(47 + String.valueOf(paramString).length() + "catalogue for name " + paramString + " has been already registered");
        }
      }
      finally {}
      String str2 = new String("Attempted overwrite of a catalogueName catalogue for name ");
    }
    d.put(paramString.toLowerCase(), paramti);
  }
  
  public static <P> void a(String paramString, to<P> paramto)
  {
    a(paramString, paramto, true);
  }
  
  public static <P> void a(String paramString, to<P> paramto, boolean paramBoolean)
  {
    if (paramto == null) {
      try
      {
        throw new IllegalArgumentException("key manager must be non-null.");
      }
      finally {}
    }
    if (b.containsKey(paramString))
    {
      to localto = b(paramString);
      boolean bool = ((Boolean)c.get(paramString)).booleanValue();
      if ((!paramto.getClass().equals(localto.getClass())) || ((!bool) && (paramBoolean)))
      {
        Logger localLogger = a;
        Level localLevel = Level.WARNING;
        String str1 = String.valueOf(paramString);
        if (str1.length() != 0) {}
        for (String str2 = "Attempted overwrite of a registered key manager for key type ".concat(str1);; str2 = new String("Attempted overwrite of a registered key manager for key type "))
        {
          localLogger.logp(localLevel, "com.google.crypto.tink.Registry", "registerKeyManager", str2);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = paramString;
          arrayOfObject[1] = localto.getClass().getName();
          arrayOfObject[2] = paramto.getClass().getName();
          throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", arrayOfObject));
        }
      }
    }
    b.put(paramString, paramto);
    c.put(paramString, Boolean.valueOf(paramBoolean));
  }
  
  public static <P> acl b(wy paramwy)
  {
    to localto = b(paramwy.a());
    if (((Boolean)c.get(paramwy.a())).booleanValue()) {
      return localto.b(paramwy.b());
    }
    String str1 = String.valueOf(paramwy.a());
    if (str1.length() != 0) {}
    for (String str2 = "newKey-operation not permitted for key type ".concat(str1);; str2 = new String("newKey-operation not permitted for key type ")) {
      throw new GeneralSecurityException(str2);
    }
  }
  
  private static <P> to<P> b(String paramString)
  {
    to localto = (to)b.get(paramString);
    if (localto == null) {
      throw new GeneralSecurityException(78 + String.valueOf(paramString).length() + "No key manager found for key type: " + paramString + ".  Check the configuration of the registry.");
    }
    return localto;
  }
  
  public static <P> P b(String paramString, acl paramacl)
  {
    return b(paramString).a(paramacl);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tw
 * JD-Core Version:    0.7.0.1
 */