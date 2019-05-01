package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@cm
public final class ml
  implements mc
{
  private final String a;
  
  public ml()
  {
    this(null);
  }
  
  public ml(String paramString)
  {
    this.a = paramString;
  }
  
  public final void a(String paramString)
  {
    for (;;)
    {
      try
      {
        String str4 = String.valueOf(paramString);
        if (str4.length() != 0)
        {
          str5 = "Pinging URL: ".concat(str4);
          mk.b(str5);
          localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        String str5;
        md localmd;
        int i;
        String str3 = localIndexOutOfBoundsException.getMessage();
        mk.e(32 + String.valueOf(paramString).length() + String.valueOf(str3).length() + "Error while parsing ping URL: " + paramString + ". " + str3);
        return;
      }
      catch (IOException localIOException)
      {
        HttpURLConnection localHttpURLConnection;
        String str2 = localIOException.getMessage();
        mk.e(27 + String.valueOf(paramString).length() + String.valueOf(str2).length() + "Error while pinging URL: " + paramString + ". " + str2);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        String str1 = localRuntimeException.getMessage();
        mk.e(27 + String.valueOf(paramString).length() + String.valueOf(str1).length() + "Error while pinging URL: " + paramString + ". " + str1);
      }
      try
      {
        aos.a();
        lz.a(true, localHttpURLConnection, this.a);
        localmd = new md();
        localmd.a(localHttpURLConnection, null);
        i = localHttpURLConnection.getResponseCode();
        localmd.a(localHttpURLConnection, i);
        if ((i < 200) || (i >= 300)) {
          mk.e(65 + String.valueOf(paramString).length() + "Received non-success response code " + i + " from pinging URL: " + paramString);
        }
        return;
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
      str5 = new String("Pinging URL: ");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ml
 * JD-Core Version:    0.7.0.1
 */