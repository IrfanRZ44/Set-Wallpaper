package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class all
{
  private ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
  private Base64OutputStream b = new Base64OutputStream(this.a, 10);
  
  public final void a(byte[] paramArrayOfByte)
  {
    this.b.write(paramArrayOfByte);
  }
  
  public final String toString()
  {
    try
    {
      this.b.close();
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        try
        {
          this.a.close();
          String str = this.a.toString();
          return str;
        }
        catch (IOException localIOException2)
        {
          je.b("HashManager: Unable to convert to Base64.", localIOException2);
          return "";
        }
        finally
        {
          this.a = null;
          this.b = null;
        }
        localIOException1 = localIOException1;
        je.b("HashManager: Unable to convert to Base64.", localIOException1);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.all
 * JD-Core Version:    0.7.0.1
 */