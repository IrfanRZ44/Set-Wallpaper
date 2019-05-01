package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public abstract class ali
{
  private static MessageDigest b = null;
  protected Object a = new Object();
  
  protected final MessageDigest a()
  {
    for (;;)
    {
      int i;
      synchronized (this.a)
      {
        if (b != null)
        {
          MessageDigest localMessageDigest2 = b;
          return localMessageDigest2;
        }
        i = 0;
        if (i >= 2) {}
      }
      try
      {
        b = MessageDigest.getInstance("MD5");
        label38:
        i++;
        continue;
        MessageDigest localMessageDigest1 = b;
        return localMessageDigest1;
        localObject2 = finally;
        throw localObject2;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label38;
      }
    }
  }
  
  abstract byte[] a(String paramString);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ali
 * JD-Core Version:    0.7.0.1
 */