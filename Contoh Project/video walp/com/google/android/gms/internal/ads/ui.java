package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class ui
  extends avs<String>
{
  private final Object a = new Object();
  private bdy<String> b;
  
  public ui(int paramInt, String paramString, bdy<String> parambdy, bcx parambcx)
  {
    super(paramInt, paramString, parambcx);
    this.b = parambdy;
  }
  
  protected final bbw<String> a(atr paramatr)
  {
    for (;;)
    {
      try
      {
        byte[] arrayOfByte = paramatr.b;
        String str2 = (String)paramatr.c.get("Content-Type");
        if (str2 == null) {
          continue;
        }
        String[] arrayOfString1 = str2.split(";");
        i = 1;
        if (i >= arrayOfString1.length) {
          continue;
        }
        String[] arrayOfString2 = arrayOfString1[i].trim().split("=");
        if ((arrayOfString2.length != 2) || (!arrayOfString2[0].equals("charset"))) {
          continue;
        }
        str3 = arrayOfString2[1];
        String str4 = new String(arrayOfByte, str3);
        str1 = str4;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        int i;
        String str3;
        String str1 = new String(paramatr.b);
        continue;
      }
      return bbw.a(str1, og.a(paramatr));
      i++;
      continue;
      str3 = "ISO-8859-1";
    }
  }
  
  protected void a(String paramString)
  {
    synchronized (this.a)
    {
      bdy localbdy = this.b;
      if (localbdy != null) {
        localbdy.a(paramString);
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ui
 * JD-Core Version:    0.7.0.1
 */