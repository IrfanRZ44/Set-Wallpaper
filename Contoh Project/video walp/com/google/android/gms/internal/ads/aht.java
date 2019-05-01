package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

final class aht
{
  static tn a;
  
  static boolean a(ahn paramahn)
  {
    if (a != null) {
      return true;
    }
    arq localarq = asa.bK;
    String str = (String)aos.f().a(localarq);
    if ((str == null) || (str.length() == 0))
    {
      if (paramahn == null) {
        str = null;
      }
      while (str == null)
      {
        return false;
        Method localMethod = paramahn.a("4o7tecxtkw7XaNt5hPj+0H1LvOi0SgxCIJTY9VcbazM/HSl/sFlxBFwnc8glnvoB", "RgSY6YxU2k1vLXOV3vapBnQwJDzYDlmX50wbm2tDcnw=");
        if (localMethod == null) {
          str = null;
        } else {
          str = (String)localMethod.invoke(null, new Object[0]);
        }
      }
    }
    try
    {
      byte[] arrayOfByte = afv.a(str, true);
      try
      {
        tp localtp = tt.a(arrayOfByte);
        Iterator localIterator = ul.a.a().iterator();
        while (localIterator.hasNext())
        {
          xa localxa = (xa)localIterator.next();
          if (localxa.b().isEmpty()) {
            throw new GeneralSecurityException("Missing type_url.");
          }
          if (localxa.a().isEmpty()) {
            throw new GeneralSecurityException("Missing primitive_name.");
          }
          if (localxa.e().isEmpty()) {
            throw new GeneralSecurityException("Missing catalogue_name.");
          }
          to localto = tw.a(localxa.e()).a(localxa.b(), localxa.a(), localxa.c());
          tw.a(localxa.b(), localto, localxa.d());
        }
        a = uo.a(localtp);
        return a != null;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        return false;
      }
      return false;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aht
 * JD-Core Version:    0.7.0.1
 */