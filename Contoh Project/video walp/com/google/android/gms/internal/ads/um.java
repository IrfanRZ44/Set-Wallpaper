package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class um
  implements ti<tm>
{
  public final to<tm> a(String paramString1, String paramString2, int paramInt)
  {
    int i = -1;
    String str = paramString2.toLowerCase();
    switch (str.hashCode())
    {
    }
    label32:
    for (int j = i;; j = 0) {
      switch (j)
      {
      default: 
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[] { paramString2 }));
        if (!str.equals("hybriddecrypt")) {
          break label32;
        }
      }
    }
    switch (paramString1.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[] { paramString1 }));
        if (paramString1.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
          i = 0;
        }
        break;
      }
    }
    uj localuj = new uj();
    if (paramInt > 0)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = Integer.valueOf(paramInt);
      throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", arrayOfObject));
    }
    return localuj;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.um
 * JD-Core Version:    0.7.0.1
 */