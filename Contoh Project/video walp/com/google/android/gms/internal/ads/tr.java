package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class tr
{
  private static final CopyOnWriteArrayList<tq> a = new CopyOnWriteArrayList();
  
  public static tq a(String paramString)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      tq localtq = (tq)localIterator.next();
      if (localtq.a(paramString)) {
        return localtq;
      }
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "No KMS client does support: ".concat(str1);; str2 = new String("No KMS client does support: ")) {
      throw new GeneralSecurityException(str2);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tr
 * JD-Core Version:    0.7.0.1
 */