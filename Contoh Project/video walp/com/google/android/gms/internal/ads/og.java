package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class og
{
  private static long a(String paramString)
  {
    try
    {
      long l = a().parse(paramString).getTime();
      return l;
    }
    catch (ParseException localParseException)
    {
      eb.a(localParseException, "Unable to parse dateStr: %s, falling back to 0", new Object[] { paramString });
    }
    return 0L;
  }
  
  public static agn a(atr paramatr)
  {
    long l1 = System.currentTimeMillis();
    Map localMap = paramatr.c;
    long l2 = 0L;
    long l3 = 0L;
    long l4 = 0L;
    String str1 = (String)localMap.get("Date");
    if (str1 != null) {
      l2 = a(str1);
    }
    String str2 = (String)localMap.get("Cache-Control");
    int i;
    if (str2 != null)
    {
      String[] arrayOfString = str2.split(",");
      int k = 0;
      i = 0;
      long l9 = l4;
      long l10 = l3;
      if (k < arrayOfString.length)
      {
        String str6 = arrayOfString[k].trim();
        if ((str6.equals("no-cache")) || (str6.equals("no-store"))) {
          return null;
        }
        if (str6.startsWith("max-age=")) {}
        for (;;)
        {
          try
          {
            long l12 = Long.parseLong(str6.substring(8));
            l10 = l12;
            k++;
          }
          catch (Exception localException2)
          {
            continue;
            l7 = 0L;
            l8 = 0L;
            continue;
            l6 = 0L;
            continue;
            l5 = 0L;
            continue;
          }
          break;
          if (str6.startsWith("stale-while-revalidate=")) {}
          try
          {
            long l11 = Long.parseLong(str6.substring(23));
            l9 = l11;
          }
          catch (Exception localException1) {}
          if ((str6.equals("must-revalidate")) || (str6.equals("proxy-revalidate"))) {
            i = 1;
          }
        }
      }
      l3 = l10;
      l4 = l9;
    }
    for (int j = 1;; j = 0)
    {
      String str3 = (String)localMap.get("Expires");
      long l5;
      long l6;
      long l8;
      long l7;
      if (str3 != null)
      {
        l5 = a(str3);
        String str4 = (String)localMap.get("Last-Modified");
        if (str4 != null)
        {
          l6 = a(str4);
          String str5 = (String)localMap.get("ETag");
          if (j != 0)
          {
            l8 = l1 + 1000L * l3;
            if (i != 0) {
              l7 = l8;
            }
          }
          for (;;)
          {
            agn localagn = new agn();
            localagn.a = paramatr.b;
            localagn.b = str5;
            localagn.f = l8;
            localagn.e = l7;
            localagn.c = l2;
            localagn.d = l6;
            localagn.g = localMap;
            localagn.h = paramatr.d;
            return localagn;
            l7 = l8 + 1000L * l4;
            continue;
            if ((l2 <= 0L) || (l5 < l2)) {
              break;
            }
            l7 = l1 + (l5 - l2);
            l8 = l7;
          }
          break;
        }
      }
      i = 0;
    }
  }
  
  static String a(long paramLong)
  {
    return a().format(new Date(paramLong));
  }
  
  private static SimpleDateFormat a()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    return localSimpleDateFormat;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.og
 * JD-Core Version:    0.7.0.1
 */