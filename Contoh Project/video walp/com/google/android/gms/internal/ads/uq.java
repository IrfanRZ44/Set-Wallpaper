package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class uq
{
  public static yh a(wi paramwi)
  {
    switch (ur.b[paramwi.ordinal()])
    {
    default: 
      String str = String.valueOf(paramwi);
      throw new GeneralSecurityException(20 + String.valueOf(str).length() + "unknown curve type: " + str);
    case 1: 
      return yh.a;
    case 2: 
      return yh.b;
    }
    return yh.c;
  }
  
  public static yi a(vu paramvu)
  {
    switch (ur.c[paramvu.ordinal()])
    {
    default: 
      String str = String.valueOf(paramvu);
      throw new GeneralSecurityException(22 + String.valueOf(str).length() + "unknown point format: " + str);
    case 1: 
      return yi.a;
    }
    return yi.b;
  }
  
  public static String a(wl paramwl)
  {
    switch (ur.a[paramwl.ordinal()])
    {
    default: 
      String str = String.valueOf(paramwl);
      throw new NoSuchAlgorithmException(27 + String.valueOf(str).length() + "hash unsupported for HMAC: " + str);
    case 1: 
      return "HmacSha1";
    case 2: 
      return "HmacSha256";
    }
    return "HmacSha512";
  }
  
  public static void a(wa paramwa)
  {
    yf.a(a(paramwa.a().a()));
    a(paramwa.a().b());
    if (paramwa.c() == vu.a) {
      throw new GeneralSecurityException("unknown EC point format");
    }
    tw.a(paramwa.b().a());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uq
 * JD-Core Version:    0.7.0.1
 */