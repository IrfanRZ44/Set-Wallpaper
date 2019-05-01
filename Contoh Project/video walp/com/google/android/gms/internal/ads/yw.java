package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class yw
  implements ts
{
  private Mac a;
  private final int b;
  private final String c;
  private final Key d;
  
  public yw(String paramString, Key paramKey, int paramInt)
  {
    if (paramInt < 10) {
      throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
    int i = -1;
    String str1;
    switch (paramString.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        str1 = String.valueOf(paramString);
        if (str1.length() == 0) {}
        break;
      }
      break;
    }
    for (String str2 = "unknown Hmac algorithm: ".concat(str1);; str2 = new String("unknown Hmac algorithm: "))
    {
      throw new NoSuchAlgorithmException(str2);
      if (!paramString.equals("HMACSHA1")) {
        break;
      }
      i = 0;
      break;
      if (!paramString.equals("HMACSHA256")) {
        break;
      }
      i = 1;
      break;
      if (!paramString.equals("HMACSHA512")) {
        break;
      }
      i = 2;
      break;
      if (paramInt <= 20) {
        break label228;
      }
      throw new InvalidAlgorithmParameterException("tag size too big");
      if (paramInt <= 32) {
        break label228;
      }
      throw new InvalidAlgorithmParameterException("tag size too big");
      if (paramInt <= 64) {
        break label228;
      }
      throw new InvalidAlgorithmParameterException("tag size too big");
    }
    label228:
    this.c = paramString;
    this.b = paramInt;
    this.d = paramKey;
    this.a = ((Mac)yk.b.a(paramString));
    this.a.init(paramKey);
  }
  
  public final byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      localMac = (Mac)this.a.clone();
      localMac.update(paramArrayOfByte);
      byte[] arrayOfByte = new byte[this.b];
      System.arraycopy(localMac.doFinal(), 0, arrayOfByte, 0, this.b);
      return arrayOfByte;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      for (;;)
      {
        Mac localMac = (Mac)yk.b.a(this.c);
        localMac.init(this.d);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.yw
 * JD-Core Version:    0.7.0.1
 */