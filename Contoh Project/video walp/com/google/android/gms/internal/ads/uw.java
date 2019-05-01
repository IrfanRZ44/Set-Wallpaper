package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class uw
{
  public static final xr a = (xr)xr.b().a("TINK_MAC_1_0_0").a(tj.a("TinkMac", "Mac", "HmacKey", 0, true)).c();
  private static final xr b = (xr)((xr.a)xr.b().a(a)).a("TINK_MAC_1_1_0").c();
  
  static
  {
    try
    {
      a();
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new ExceptionInInitializerError(localGeneralSecurityException);
    }
  }
  
  public static void a()
  {
    tw.a("TinkMac", new uv());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uw
 * JD-Core Version:    0.7.0.1
 */