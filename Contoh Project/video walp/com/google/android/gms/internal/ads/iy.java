package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.math.BigInteger;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class iy
{
  private static final Object a = new Object();
  @GuardedBy("sLock")
  private static String b;
  
  public static String a()
  {
    synchronized (a)
    {
      String str = b;
      return str;
    }
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    for (;;)
    {
      int i;
      synchronized (a)
      {
        BigInteger localBigInteger2;
        if (b == null)
        {
          boolean bool = TextUtils.isEmpty(paramString1);
          if (!bool) {
            try
            {
              ClassLoader localClassLoader = paramContext.createPackageContext(paramString2, 3).getClassLoader();
              Class localClass = Class.forName("com.google.ads.mediation.MediationAdapter", false, localClassLoader);
              BigInteger localBigInteger1 = new BigInteger(new byte[1]);
              String[] arrayOfString = paramString1.split(",");
              localBigInteger2 = localBigInteger1;
              i = 0;
              if (i >= arrayOfString.length) {
                continue;
              }
              zzbv.zzek();
              if (!jn.a(localClassLoader, localClass, arrayOfString[i])) {
                break label157;
              }
              localBigInteger2 = localBigInteger2.setBit(i);
            }
            catch (Throwable localThrowable)
            {
              b = "err";
            }
          }
        }
        String str = b;
        return str;
        b = String.format(Locale.US, "%X", new Object[] { localBigInteger2 });
      }
      label157:
      i++;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.iy
 * JD-Core Version:    0.7.0.1
 */