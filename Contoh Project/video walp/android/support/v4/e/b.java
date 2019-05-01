package android.support.v4.e;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class b
{
  private static Method a;
  private static Method b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (;;)
    {
      try
      {
        b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
        return;
      }
      catch (Exception localException2)
      {
        throw new IllegalStateException(localException2);
      }
      try
      {
        Class localClass = Class.forName("libcore.icu.ICU");
        if (localClass != null)
        {
          a = localClass.getMethod("getScript", new Class[] { String.class });
          b = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
          return;
        }
      }
      catch (Exception localException1)
      {
        a = null;
        b = null;
        Log.w("ICUCompat", localException1);
      }
    }
  }
  
  private static String a(String paramString)
  {
    try
    {
      if (a != null)
      {
        Object[] arrayOfObject = { paramString };
        String str = (String)a.invoke(null, arrayOfObject);
        return str;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.w("ICUCompat", localIllegalAccessException);
      return null;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Log.w("ICUCompat", localInvocationTargetException);
      }
    }
  }
  
  public static String a(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    String str1;
    do
    {
      try
      {
        Object[] arrayOfObject = { paramLocale };
        String str3 = ((Locale)b.invoke(null, arrayOfObject)).getScript();
        str2 = str3;
        return str2;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Log.w("ICUCompat", localInvocationTargetException);
        return paramLocale.getScript();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          Log.w("ICUCompat", localIllegalAccessException);
        }
      }
      str1 = b(paramLocale);
      String str2 = null;
    } while (str1 == null);
    return a(str1);
  }
  
  private static String b(Locale paramLocale)
  {
    String str1 = paramLocale.toString();
    try
    {
      if (b != null)
      {
        Object[] arrayOfObject = { str1 };
        String str2 = (String)b.invoke(null, arrayOfObject);
        return str2;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.w("ICUCompat", localIllegalAccessException);
      return str1;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Log.w("ICUCompat", localInvocationTargetException);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.e.b
 * JD-Core Version:    0.7.0.1
 */