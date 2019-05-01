package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class alr
  extends ali
{
  private MessageDigest b;
  private final int c;
  private final int d;
  
  public alr(int paramInt)
  {
    int i = paramInt / 8;
    if (paramInt % 8 > 0) {
      i++;
    }
    this.c = i;
    this.d = paramInt;
  }
  
  public final byte[] a(String paramString)
  {
    int i = 0;
    synchronized (this.a)
    {
      this.b = a();
      if (this.b == null)
      {
        byte[] arrayOfByte1 = new byte[0];
        return arrayOfByte1;
      }
      this.b.reset();
      this.b.update(paramString.getBytes(Charset.forName("UTF-8")));
      byte[] arrayOfByte2 = this.b.digest();
      if (arrayOfByte2.length > this.c) {}
      byte[] arrayOfByte3;
      long l1;
      for (int j = this.c;; j = arrayOfByte2.length)
      {
        arrayOfByte3 = new byte[j];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte3.length);
        if (this.d % 8 <= 0) {
          break label213;
        }
        l1 = 0L;
        while (i < arrayOfByte3.length)
        {
          if (i > 0) {
            l1 <<= 8;
          }
          l1 += (0xFF & arrayOfByte3[i]);
          i++;
        }
      }
      long l2 = l1 >>> 8 - this.d % 8;
      for (int k = -1 + this.c; k >= 0; k--)
      {
        arrayOfByte3[k] = ((byte)(int)(0xFF & l2));
        l2 >>>= 8;
      }
      label213:
      return arrayOfByte3;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.alr
 * JD-Core Version:    0.7.0.1
 */