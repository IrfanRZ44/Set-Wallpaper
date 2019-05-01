package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class ty
  implements ti<tg>
{
  public final to<tg> a(String paramString1, String paramString2, int paramInt)
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
        if (!str.equals("aead")) {
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
        throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[] { paramString1 }));
        if (paramString1.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
        {
          i = 0;
          continue;
          if (paramString1.equals("type.googleapis.com/google.crypto.tink.AesEaxKey"))
          {
            i = 1;
            continue;
            if (paramString1.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
            {
              i = 2;
              continue;
              if (paramString1.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"))
              {
                i = 3;
                continue;
                if (paramString1.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey"))
                {
                  i = 4;
                  continue;
                  if (paramString1.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    i = 5;
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    Object localObject = new ua();
    while (((to)localObject).a() < paramInt)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = Integer.valueOf(paramInt);
      throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", arrayOfObject));
      localObject = new uc();
      continue;
      localObject = new ud();
      continue;
      localObject = new ue();
      continue;
      localObject = new uf();
      continue;
      localObject = new uh();
    }
    return localObject;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ty
 * JD-Core Version:    0.7.0.1
 */